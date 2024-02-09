package com.amazonaws.services.s3;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListenerCallbackExecutor;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;
import com.amazonaws.services.s3.internal.BucketNameUtils;
import com.amazonaws.services.s3.internal.CompleteMultipartUploadRetryCondition;
import com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler;
import com.amazonaws.services.s3.internal.ResponseHeaderHandlerChain;
import com.amazonaws.services.s3.internal.S3ErrorResponseHandler;
import com.amazonaws.services.s3.internal.S3ExecutionContext;
import com.amazonaws.services.s3.internal.S3HttpUtils;
import com.amazonaws.services.s3.internal.S3RequesterChargedHeaderHandler;
import com.amazonaws.services.s3.internal.S3Signer;
import com.amazonaws.services.s3.internal.S3VersionHeaderHandler;
import com.amazonaws.services.s3.internal.S3XmlResponseHandler;
import com.amazonaws.services.s3.internal.ServerSideEncryptionHeaderHandler;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.HeadBucketRequest;
import com.amazonaws.services.s3.model.HeadBucketResult;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.SSECustomerKey;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.HeadBucketResultHandler;
import com.amazonaws.services.s3.model.transform.RequestPaymentConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.RequestXmlFactory;
import com.amazonaws.services.s3.model.transform.Unmarshallers$CompleteMultipartUploadResultUnmarshaller;
import com.amazonaws.services.s3.model.transform.Unmarshallers$InitiateMultipartUploadResultUnmarshaller;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.util.ValidationUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AmazonS3Client extends AmazonWebServiceClient implements AmazonS3 {

    /* renamed from: s  reason: collision with root package name */
    private static Log f4259s = LogFactory.b(AmazonS3Client.class);

    /* renamed from: t  reason: collision with root package name */
    private static final BucketConfigurationXmlFactory f4260t = new BucketConfigurationXmlFactory();

    /* renamed from: u  reason: collision with root package name */
    private static final RequestPaymentConfigurationXmlFactory f4261u = new RequestPaymentConfigurationXmlFactory();

    /* renamed from: v  reason: collision with root package name */
    private static final Map<String, String> f4262v = Collections.synchronizedMap(new LinkedHashMap<String, String>(300, 1.1f, true) {
        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 300;
        }
    });

    /* renamed from: l  reason: collision with root package name */
    private final S3ErrorResponseHandler f4263l;

    /* renamed from: m  reason: collision with root package name */
    private final S3XmlResponseHandler<Void> f4264m;

    /* renamed from: n  reason: collision with root package name */
    protected S3ClientOptions f4265n;

    /* renamed from: o  reason: collision with root package name */
    private final AWSCredentialsProvider f4266o;

    /* renamed from: p  reason: collision with root package name */
    volatile String f4267p;

    /* renamed from: q  reason: collision with root package name */
    private int f4268q;

    /* renamed from: r  reason: collision with root package name */
    private final CompleteMultipartUploadRetryCondition f4269r;

    static {
        AwsSdkMetrics.addAll(Arrays.asList(S3ServiceMetric.b()));
        SignerFactory.e("AWSS3V4SignerType", AWSS3V4Signer.class);
    }

    @Deprecated
    public AmazonS3Client() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    public AmazonS3Client(AWSCredentials aWSCredentials, Region region) {
        this(aWSCredentials, region, new ClientConfiguration());
    }

    public AmazonS3Client(AWSCredentials aWSCredentials, Region region, ClientConfiguration clientConfiguration) {
        this(aWSCredentials, region, clientConfiguration, (HttpClient) new UrlHttpClient(clientConfiguration));
    }

    public AmazonS3Client(AWSCredentials aWSCredentials, Region region, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        this((AWSCredentialsProvider) new StaticCredentialsProvider(aWSCredentials), region, clientConfiguration, httpClient);
    }

    @Deprecated
    public AmazonS3Client(AWSCredentialsProvider aWSCredentialsProvider) {
        this(aWSCredentialsProvider, new ClientConfiguration());
    }

    @Deprecated
    public AmazonS3Client(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(aWSCredentialsProvider, clientConfiguration, (HttpClient) new UrlHttpClient(clientConfiguration));
    }

    @Deprecated
    public AmazonS3Client(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(clientConfiguration, httpClient);
        this.f4263l = new S3ErrorResponseHandler();
        this.f4264m = new S3XmlResponseHandler<>((Unmarshaller) null);
        this.f4265n = new S3ClientOptions();
        this.f4268q = 1024;
        this.f4269r = new CompleteMultipartUploadRetryCondition();
        this.f4266o = aWSCredentialsProvider;
        S();
    }

    public AmazonS3Client(AWSCredentialsProvider aWSCredentialsProvider, Region region, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(clientConfiguration, httpClient);
        this.f4263l = new S3ErrorResponseHandler();
        this.f4264m = new S3XmlResponseHandler<>((Unmarshaller) null);
        this.f4265n = new S3ClientOptions();
        this.f4268q = 1024;
        this.f4269r = new CompleteMultipartUploadRetryCondition();
        this.f4266o = aWSCredentialsProvider;
        T(region, clientConfiguration);
    }

    private static void A(Request<?> request, String str, String str2) {
        if (str2 != null) {
            request.i(str, str2);
        }
    }

    private static void B(Request<?> request, ResponseHeaderOverrides responseHeaderOverrides) {
    }

    private static void C(Request<?> request, String str, List<String> list) {
        if (list != null && !list.isEmpty()) {
            request.i(str, ServiceUtils.b(list));
        }
    }

    private long D(InputStream inputStream) {
        byte[] bArr = new byte[8192];
        inputStream.mark(-1);
        long j10 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    j10 += (long) read;
                } else {
                    inputStream.reset();
                    return j10;
                }
            } catch (IOException e10) {
                throw new AmazonClientException("Could not calculate content length.", e10);
            }
        }
    }

    private URI E(URI uri, String str) {
        try {
            return new URI(uri.getScheme() + "://" + str + "." + uri.getAuthority());
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Invalid bucket name: " + str, e10);
        }
    }

    @Deprecated
    private S3Signer I(Request<?> request, String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        if (str != null) {
            str3 = str + "/";
        } else {
            str3 = "";
        }
        sb.append(str3);
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return new S3Signer(request.t().toString(), sb.toString());
    }

    private String M(String str) {
        Map<String, String> map = f4262v;
        String str2 = map.get(str);
        if (str2 == null) {
            if (f4259s.c()) {
                Log log = f4259s;
                log.a("Bucket region cache doesn't have an entry for " + str + ". Trying to get bucket region from Amazon S3.");
            }
            str2 = O(str);
            if (str2 != null) {
                map.put(str, str2);
            }
        }
        if (f4259s.c()) {
            Log log2 = f4259s;
            log2.a("Region for " + str + " is " + str2);
        }
        return str2;
    }

    private void N(ProgressListenerCallbackExecutor progressListenerCallbackExecutor, int i10) {
        if (progressListenerCallbackExecutor != null) {
            ProgressEvent progressEvent = new ProgressEvent(0);
            progressEvent.c(i10);
            progressListenerCallbackExecutor.c(progressEvent);
        }
    }

    private String O(String str) {
        String str2 = null;
        try {
            str2 = ((HeadBucketResult) U(H(str, (String) null, new HeadBucketRequest(str), HttpMethodName.HEAD, new URI("https://s3-us-west-1.amazonaws.com")), new HeadBucketResultHandler(), str, (String) null)).a();
        } catch (AmazonS3Exception e10) {
            if (e10.l() != null) {
                str2 = e10.l().get("x-amz-bucket-region");
            }
        } catch (URISyntaxException unused) {
            f4259s.e("Error while creating URI");
        }
        if (str2 == null && f4259s.c()) {
            Log log = f4259s;
            log.a("Not able to derive region of the " + str + " from the HEAD Bucket requests.");
        }
        return str2;
    }

    private String P(String str) {
        if (str == null || !str.startsWith("/")) {
            return str;
        }
        return "/" + str;
    }

    private String Q(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    private String R() {
        String q9 = q();
        return q9 == null ? this.f4267p : q9;
    }

    @Deprecated
    private void S() {
        v("s3.amazonaws.com");
        this.f3931i = "s3";
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.f3927e.addAll(handlerChainFactory.c("/com/amazonaws/services/s3/request.handlers"));
        this.f3927e.addAll(handlerChainFactory.b("/com/amazonaws/services/s3/request.handler2s"));
    }

    private void T(Region region, ClientConfiguration clientConfiguration) {
        if (this.f4266o == null) {
            throw new IllegalArgumentException("Credentials cannot be null. Credentials is required to sign the request");
        } else if (region != null) {
            this.f3925c = clientConfiguration;
            this.f3931i = "s3";
            v("s3.amazonaws.com");
            w(region);
            HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
            this.f3927e.addAll(handlerChainFactory.c("/com/amazonaws/services/s3/request.handlers"));
            this.f3927e.addAll(handlerChainFactory.b("/com/amazonaws/services/s3/request.handler2s"));
            Log log = f4259s;
            log.a("initialized with endpoint = " + this.f3923a);
        } else {
            throw new IllegalArgumentException("Region cannot be null. Region is required to sign the request");
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.amazonaws.Request, com.amazonaws.Request<Y>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <X, Y extends com.amazonaws.AmazonWebServiceRequest> X U(com.amazonaws.Request<Y> r8, com.amazonaws.http.HttpResponseHandler<com.amazonaws.AmazonWebServiceResponse<X>> r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            java.lang.String r0 = "Content-Type"
            com.amazonaws.AmazonWebServiceRequest r1 = r8.r()
            com.amazonaws.http.ExecutionContext r2 = r7.F(r1)
            com.amazonaws.util.AWSRequestMetrics r3 = r2.a()
            r8.g(r3)
            com.amazonaws.util.AWSRequestMetrics$Field r4 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r3.g(r4)
            r4 = 0
            long r5 = r7.f3928f     // Catch:{ AmazonS3Exception -> 0x0065 }
            r8.q(r5)     // Catch:{ AmazonS3Exception -> 0x0065 }
            java.util.Map r5 = r8.l()     // Catch:{ AmazonS3Exception -> 0x0065 }
            boolean r5 = r5.containsKey(r0)     // Catch:{ AmazonS3Exception -> 0x0065 }
            if (r5 != 0) goto L_0x002b
            java.lang.String r5 = "application/octet-stream"
            r8.i(r0, r5)     // Catch:{ AmazonS3Exception -> 0x0065 }
        L_0x002b:
            if (r10 == 0) goto L_0x0039
            r8.r()     // Catch:{ AmazonS3Exception -> 0x0065 }
            boolean r0 = r7.Y(r8)     // Catch:{ AmazonS3Exception -> 0x0065 }
            if (r0 == 0) goto L_0x0039
            r7.M(r10)     // Catch:{ AmazonS3Exception -> 0x0065 }
        L_0x0039:
            com.amazonaws.auth.AWSCredentialsProvider r0 = r7.f4266o     // Catch:{ AmazonS3Exception -> 0x0065 }
            com.amazonaws.auth.AWSCredentials r0 = r0.a()     // Catch:{ AmazonS3Exception -> 0x0065 }
            com.amazonaws.auth.AWSCredentials r5 = r1.h()     // Catch:{ AmazonS3Exception -> 0x0065 }
            if (r5 == 0) goto L_0x0049
            com.amazonaws.auth.AWSCredentials r0 = r1.h()     // Catch:{ AmazonS3Exception -> 0x0065 }
        L_0x0049:
            com.amazonaws.auth.Signer r11 = r7.J(r8, r10, r11)     // Catch:{ AmazonS3Exception -> 0x0065 }
            r2.g(r11)     // Catch:{ AmazonS3Exception -> 0x0065 }
            r2.f(r0)     // Catch:{ AmazonS3Exception -> 0x0065 }
            com.amazonaws.http.AmazonHttpClient r11 = r7.f3926d     // Catch:{ AmazonS3Exception -> 0x0065 }
            com.amazonaws.services.s3.internal.S3ErrorResponseHandler r0 = r7.f4263l     // Catch:{ AmazonS3Exception -> 0x0065 }
            com.amazonaws.Response r4 = r11.d(r8, r9, r0, r2)     // Catch:{ AmazonS3Exception -> 0x0065 }
            java.lang.Object r9 = r4.a()     // Catch:{ AmazonS3Exception -> 0x0065 }
            r7.j(r3, r8, r4)
            return r9
        L_0x0063:
            r9 = move-exception
            goto L_0x009f
        L_0x0065:
            r9 = move-exception
            int r11 = r9.e()     // Catch:{ all -> 0x0063 }
            r0 = 301(0x12d, float:4.22E-43)
            if (r11 != r0) goto L_0x009e
            java.util.Map r11 = r9.l()     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x009e
            java.util.Map r11 = r9.l()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "x-amz-bucket-region"
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0063 }
            java.util.Map<java.lang.String, java.lang.String> r0 = f4262v     // Catch:{ all -> 0x0063 }
            r0.put(r10, r11)     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r10.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "The bucket is in this region: "
            r10.append(r0)     // Catch:{ all -> 0x0063 }
            r10.append(r11)     // Catch:{ all -> 0x0063 }
            java.lang.String r11 = ". Please use this region to retry the request"
            r10.append(r11)     // Catch:{ all -> 0x0063 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0063 }
            r9.g(r10)     // Catch:{ all -> 0x0063 }
        L_0x009e:
            throw r9     // Catch:{ all -> 0x0063 }
        L_0x009f:
            r7.j(r3, r8, r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.AmazonS3Client.U(com.amazonaws.Request, com.amazonaws.http.HttpResponseHandler, java.lang.String, java.lang.String):java.lang.Object");
    }

    private boolean V() {
        ClientConfiguration clientConfiguration = this.f3925c;
        return (clientConfiguration == null || clientConfiguration.e() == null) ? false : true;
    }

    private boolean W(URI uri) {
        return uri.getHost().endsWith("s3.amazonaws.com");
    }

    static boolean X(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split("\\.");
        if (split.length != 4) {
            return false;
        }
        int length = split.length;
        int i10 = 0;
        while (i10 < length) {
            try {
                int parseInt = Integer.parseInt(split[i10]);
                if (parseInt >= 0 && parseInt <= 255) {
                    i10++;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return true;
    }

    private boolean Y(Request<?> request) {
        return W(request.j()) && R() == null;
    }

    protected static void Z(Request<?> request, ObjectMetadata objectMetadata) {
        Map<String, Object> C = objectMetadata.C();
        if (C.get("x-amz-server-side-encryption-aws-kms-key-id") == null || ObjectMetadata.f4474u.equals(C.get("x-amz-server-side-encryption"))) {
            for (Map.Entry next : C.entrySet()) {
                request.i((String) next.getKey(), next.getValue().toString());
            }
            Date A = objectMetadata.A();
            if (A != null) {
                request.i("Expires", DateUtils.d(A));
            }
            Map<String, String> J = objectMetadata.J();
            if (J != null) {
                for (Map.Entry next2 : J.entrySet()) {
                    String str = (String) next2.getKey();
                    String str2 = (String) next2.getValue();
                    if (str != null) {
                        str = str.trim();
                    }
                    if (str2 != null) {
                        str2 = str2.trim();
                    }
                    if (!"x-amz-tagging".equals(str)) {
                        request.i("x-amz-meta-" + str, str2);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("If you specify a KMS key id for server side encryption, you must also set the SSEAlgorithm to ObjectMetadata.KMS_SERVER_SIDE_ENCRYPTION");
    }

    protected static void a0(Request<?> request, boolean z9) {
        if (z9) {
            request.i("x-amz-request-payer", "requester");
        }
    }

    private static void b0(Request<?> request, SSECustomerKey sSECustomerKey) {
    }

    private static void c0(Request<?> request, SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        if (sSEAwsKeyManagementParams != null) {
            A(request, "x-amz-server-side-encryption", sSEAwsKeyManagementParams.b());
            A(request, "x-amz-server-side-encryption-aws-kms-key-id", sSEAwsKeyManagementParams.a());
        }
    }

    private void e0(AWSS3V4Signer aWSS3V4Signer, String str) {
        aWSS3V4Signer.c(o());
        aWSS3V4Signer.b(str);
    }

    private void f0(Request<?> request) {
        request.i("Content-Length", String.valueOf(0));
    }

    private boolean g0(AmazonWebServiceRequest amazonWebServiceRequest, AmazonS3Exception amazonS3Exception, int i10) {
        RetryPolicy d10 = this.f3925c.d();
        if (d10 == null || d10.c() == null || d10 == PredefinedRetryPolicies.f4245a) {
            return false;
        }
        return this.f4269r.a(amazonWebServiceRequest, amazonS3Exception, i10);
    }

    private boolean h0(URI uri, String str) {
        return !this.f4265n.d() && BucketNameUtils.isDNSBucketName(str) && !X(uri.getHost());
    }

    private ByteArrayInputStream i0(InputStream inputStream) {
        int i10 = 262144;
        byte[] bArr = new byte[262144];
        int i11 = 0;
        while (i10 > 0) {
            try {
                int read = inputStream.read(bArr, i11, i10);
                if (read == -1) {
                    break;
                }
                i11 += read;
                i10 -= read;
            } catch (IOException e10) {
                throw new AmazonClientException("Failed to read from inputstream", e10);
            }
        }
        if (inputStream.read() == -1) {
            inputStream.close();
            return new ByteArrayInputStream(bArr, 0, i11);
        }
        throw new AmazonClientException("Input stream exceeds 256k buffer.");
    }

    private String j0(ObjectTagging objectTagging) {
        if (objectTagging == null || objectTagging.a() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Tag> it = objectTagging.a().iterator();
        while (it.hasNext()) {
            Tag next = it.next();
            sb.append(S3HttpUtils.b(next.a(), false));
            sb.append('=');
            sb.append(S3HttpUtils.b(next.b(), false));
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    private static void y(Request<? extends AmazonWebServiceRequest> request, AccessControlList accessControlList) {
        Set<Grant> c10 = accessControlList.c();
        HashMap hashMap = new HashMap();
        for (Grant next : c10) {
            if (!hashMap.containsKey(next.b())) {
                hashMap.put(next.b(), new LinkedList());
            }
            ((Collection) hashMap.get(next.b())).add(next.a());
        }
        for (Permission permission : Permission.values()) {
            if (hashMap.containsKey(permission)) {
                StringBuilder sb = new StringBuilder();
                boolean z9 = false;
                for (Grantee grantee : (Collection) hashMap.get(permission)) {
                    if (!z9) {
                        z9 = true;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(grantee.getTypeIdentifier());
                    sb.append("=");
                    sb.append("\"");
                    sb.append(grantee.getIdentifier());
                    sb.append("\"");
                }
                request.i(permission.getHeaderName(), sb.toString());
            }
        }
    }

    private static void z(Request<?> request, String str, Date date) {
        if (date != null) {
            request.i(str, ServiceUtils.a(date));
        }
    }

    /* access modifiers changed from: protected */
    public final ExecutionContext F(AmazonWebServiceRequest amazonWebServiceRequest) {
        return new S3ExecutionContext(this.f3927e, t(amazonWebServiceRequest) || AmazonWebServiceClient.r(), this);
    }

    /* access modifiers changed from: protected */
    public <X extends AmazonWebServiceRequest> Request<X> G(String str, String str2, X x9, HttpMethodName httpMethodName) {
        return H(str, str2, x9, httpMethodName, (URI) null);
    }

    /* access modifiers changed from: protected */
    public <X extends AmazonWebServiceRequest> Request<X> H(String str, String str2, X x9, HttpMethodName httpMethodName, URI uri) {
        String str3;
        ClientConfiguration clientConfiguration;
        DefaultRequest defaultRequest = new DefaultRequest(x9, "Amazon S3");
        if (this.f4265n.a()) {
            defaultRequest.r();
            if (this.f4265n.c()) {
                clientConfiguration = this.f3925c;
                str3 = "s3-accelerate.dualstack.amazonaws.com";
            } else {
                clientConfiguration = this.f3925c;
                str3 = "s3-accelerate.amazonaws.com";
            }
            uri = RuntimeHttpUtils.a(str3, clientConfiguration);
        }
        defaultRequest.v(httpMethodName);
        d0(defaultRequest, str, str2, uri);
        return defaultRequest;
    }

    /* access modifiers changed from: protected */
    public Signer J(Request<?> request, String str, String str2) {
        Signer p10 = p(this.f4265n.a() ? this.f3923a : request.j());
        if (!V()) {
            if ((p10 instanceof AWSS3V4Signer) && Y(request)) {
                String str3 = this.f4267p == null ? f4262v.get(str) : this.f4267p;
                if (str3 != null) {
                    d0(request, str, str2, RuntimeHttpUtils.a(RegionUtils.a(str3).g("s3"), this.f3925c));
                    AWSS3V4Signer aWSS3V4Signer = (AWSS3V4Signer) p10;
                    e0(aWSS3V4Signer, str3);
                    return aWSS3V4Signer;
                }
                request.r();
            }
            String q9 = q() == null ? this.f4267p == null ? f4262v.get(str) : this.f4267p : q();
            if (q9 != null) {
                AWSS3V4Signer aWSS3V4Signer2 = new AWSS3V4Signer();
                e0(aWSS3V4Signer2, q9);
                return aWSS3V4Signer2;
            }
        }
        return p10 instanceof S3Signer ? I(request, str, str2) : p10;
    }

    public void K(DeleteObjectRequest deleteObjectRequest) {
        ValidationUtils.a(deleteObjectRequest, "The delete object request must be specified when deleting an object");
        ValidationUtils.a(deleteObjectRequest.q(), "The bucket name must be specified when deleting an object");
        ValidationUtils.a(deleteObjectRequest.r(), "The key must be specified when deleting an object");
        U(G(deleteObjectRequest.q(), deleteObjectRequest.r(), deleteObjectRequest, HttpMethodName.DELETE), this.f4264m, deleteObjectRequest.q(), deleteObjectRequest.r());
    }

    public void L(String str, String str2) {
        K(new DeleteObjectRequest(str, str2));
    }

    public void a(AbortMultipartUploadRequest abortMultipartUploadRequest) {
        ValidationUtils.a(abortMultipartUploadRequest, "The request parameter must be specified when aborting a multipart upload");
        ValidationUtils.a(abortMultipartUploadRequest.q(), "The bucket name parameter must be specified when aborting a multipart upload");
        ValidationUtils.a(abortMultipartUploadRequest.r(), "The key parameter must be specified when aborting a multipart upload");
        ValidationUtils.a(abortMultipartUploadRequest.s(), "The upload ID parameter must be specified when aborting a multipart upload");
        String q9 = abortMultipartUploadRequest.q();
        String r9 = abortMultipartUploadRequest.r();
        Request G = G(q9, r9, abortMultipartUploadRequest, HttpMethodName.DELETE);
        G.c("uploadId", abortMultipartUploadRequest.s());
        a0(G, abortMultipartUploadRequest.t());
        U(G, this.f4264m, q9, r9);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.s3.model.PutObjectResult b(com.amazonaws.services.s3.model.PutObjectRequest r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "Unable to cleanly close input stream: "
            java.lang.String r3 = "The PutObjectRequest parameter must be specified when uploading an object"
            com.amazonaws.util.ValidationUtils.a(r0, r3)
            java.lang.String r3 = r18.t()
            java.lang.String r4 = r18.x()
            com.amazonaws.services.s3.model.ObjectMetadata r5 = r18.y()
            java.io.InputStream r6 = r18.w()
            com.amazonaws.event.ProgressListener r7 = r18.e()
            com.amazonaws.event.ProgressListenerCallbackExecutor r7 = com.amazonaws.event.ProgressListenerCallbackExecutor.d(r7)
            if (r5 != 0) goto L_0x002a
            com.amazonaws.services.s3.model.ObjectMetadata r5 = new com.amazonaws.services.s3.model.ObjectMetadata
            r5.<init>()
        L_0x002a:
            java.lang.String r8 = "The bucket name parameter must be specified when uploading an object"
            com.amazonaws.util.ValidationUtils.a(r3, r8)
            java.lang.String r8 = "The key parameter must be specified when uploading an object"
            com.amazonaws.util.ValidationUtils.a(r4, r8)
            com.amazonaws.services.s3.S3ClientOptions r8 = r1.f4265n
            boolean r8 = com.amazonaws.services.s3.internal.ServiceUtils.f(r0, r8)
            java.io.File r9 = r18.v()
            r10 = 1
            r11 = 0
            if (r9 == 0) goto L_0x009f
            java.io.File r6 = r18.v()
            long r12 = r6.length()
            r5.P(r12)
            java.lang.String r9 = r5.v()
            if (r9 != 0) goto L_0x0055
            r9 = 1
            goto L_0x0056
        L_0x0055:
            r9 = 0
        L_0x0056:
            java.lang.String r12 = r5.w()
            if (r12 != 0) goto L_0x0067
            com.amazonaws.services.s3.util.Mimetypes r12 = com.amazonaws.services.s3.util.Mimetypes.a()
            java.lang.String r12 = r12.b(r6)
            r5.R(r12)
        L_0x0067:
            if (r9 == 0) goto L_0x008f
            if (r8 != 0) goto L_0x008f
            java.lang.String r8 = com.amazonaws.util.Md5Utils.c(r6)     // Catch:{ Exception -> 0x0073 }
            r5.Q(r8)     // Catch:{ Exception -> 0x0073 }
            goto L_0x008f
        L_0x0073:
            r0 = move-exception
            com.amazonaws.AmazonClientException r2 = new com.amazonaws.AmazonClientException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unable to calculate MD5 hash: "
            r3.append(r4)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            throw r2
        L_0x008f:
            com.amazonaws.services.s3.internal.RepeatableFileInputStream r8 = new com.amazonaws.services.s3.internal.RepeatableFileInputStream     // Catch:{ FileNotFoundException -> 0x0096 }
            r8.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0096 }
            r6 = r8
            goto L_0x009f
        L_0x0096:
            r0 = move-exception
            com.amazonaws.AmazonClientException r2 = new com.amazonaws.AmazonClientException
            java.lang.String r3 = "Unable to find file to upload"
            r2.<init>(r3, r0)
            throw r2
        L_0x009f:
            com.amazonaws.http.HttpMethodName r8 = com.amazonaws.http.HttpMethodName.PUT
            com.amazonaws.Request r8 = r1.G(r3, r4, r0, r8)
            com.amazonaws.services.s3.model.AccessControlList r9 = r18.s()
            if (r9 == 0) goto L_0x00b3
            com.amazonaws.services.s3.model.AccessControlList r9 = r18.s()
            y(r8, r9)
            goto L_0x00c6
        L_0x00b3:
            com.amazonaws.services.s3.model.CannedAccessControlList r9 = r18.u()
            if (r9 == 0) goto L_0x00c6
            com.amazonaws.services.s3.model.CannedAccessControlList r9 = r18.u()
            java.lang.String r9 = r9.toString()
            java.lang.String r12 = "x-amz-acl"
            r8.i(r12, r9)
        L_0x00c6:
            java.lang.String r9 = r18.C()
            if (r9 == 0) goto L_0x00d5
            java.lang.String r9 = r18.C()
            java.lang.String r12 = "x-amz-storage-class"
            r8.i(r12, r9)
        L_0x00d5:
            java.lang.String r9 = r18.z()
            if (r9 == 0) goto L_0x00f0
            java.lang.String r9 = r18.z()
            java.lang.String r12 = "x-amz-website-redirect-location"
            r8.i(r12, r9)
            if (r6 != 0) goto L_0x00f0
            r1.f0(r8)
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            byte[] r9 = new byte[r11]
            r6.<init>(r9)
        L_0x00f0:
            com.amazonaws.services.s3.model.ObjectTagging r9 = r18.D()
            java.lang.String r9 = r1.j0(r9)
            java.lang.String r12 = "x-amz-tagging"
            A(r8, r12, r9)
            boolean r9 = r18.W()
            a0(r8, r9)
            r18.B()
            r9 = 0
            b0(r8, r9)
            java.lang.String r9 = "Content-Length"
            java.lang.Object r12 = r5.D(r9)
            java.lang.Long r12 = (java.lang.Long) r12
            if (r12 != 0) goto L_0x0141
            boolean r11 = r6.markSupported()
            if (r11 != 0) goto L_0x0135
            com.amazonaws.logging.Log r11 = f4259s
            java.lang.String r12 = "No content length specified for stream data.  Stream contents will be buffered in memory and could result in out of memory errors."
            r11.e(r12)
            java.io.ByteArrayInputStream r6 = r1.i0(r6)
            int r11 = r6.available()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r8.i(r9, r11)
            r8.u(r10)
            goto L_0x0158
        L_0x0135:
            long r10 = r1.D(r6)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r8.i(r9, r10)
            goto L_0x0158
        L_0x0141:
            long r13 = r12.longValue()
            r15 = 0
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 < 0) goto L_0x0158
            com.amazonaws.util.LengthCheckInputStream r10 = new com.amazonaws.util.LengthCheckInputStream
            r10.<init>(r6, r13, r11)
            java.lang.String r6 = r12.toString()
            r8.i(r9, r6)
            r6 = r10
        L_0x0158:
            if (r7 == 0) goto L_0x0169
            com.amazonaws.event.ProgressReportingInputStream r9 = new com.amazonaws.event.ProgressReportingInputStream
            r9.<init>(r6, r7)
            int r6 = r1.f4268q
            r9.l(r6)
            r6 = 2
            r1.N(r7, r6)
            r6 = r9
        L_0x0169:
            java.lang.String r9 = r5.w()
            if (r9 != 0) goto L_0x0174
            java.lang.String r9 = "application/octet-stream"
            r5.R(r9)
        L_0x0174:
            Z(r8, r5)
            com.amazonaws.services.s3.model.SSEAwsKeyManagementParams r0 = r18.A()
            c0(r8, r0)
            r8.a(r6)
            com.amazonaws.services.s3.internal.S3MetadataResponseHandler r0 = new com.amazonaws.services.s3.internal.S3MetadataResponseHandler     // Catch:{ AmazonClientException -> 0x01fa }
            r0.<init>()     // Catch:{ AmazonClientException -> 0x01fa }
            java.lang.Object r0 = r1.U(r8, r0, r3, r4)     // Catch:{ AmazonClientException -> 0x01fa }
            r3 = r0
            com.amazonaws.services.s3.model.ObjectMetadata r3 = (com.amazonaws.services.s3.model.ObjectMetadata) r3     // Catch:{ AmazonClientException -> 0x01fa }
            r6.close()     // Catch:{ AbortedException -> 0x01ab, Exception -> 0x0191 }
            goto L_0x01ab
        L_0x0191:
            r0 = move-exception
            r4 = r0
            com.amazonaws.logging.Log r0 = f4259s
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = r4.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.b(r2, r4)
        L_0x01ab:
            r0 = 4
            r1.N(r7, r0)
            com.amazonaws.services.s3.model.PutObjectResult r0 = new com.amazonaws.services.s3.model.PutObjectResult
            r0.<init>()
            java.lang.String r2 = r3.K()
            r0.a(r2)
            java.lang.String r2 = r3.E()
            r0.f(r2)
            java.lang.String r2 = r3.G()
            r0.e(r2)
            java.lang.String r2 = r3.H()
            r0.d(r2)
            java.util.Date r2 = r3.y()
            r0.n(r2)
            java.lang.String r2 = r3.z()
            r0.k(r2)
            java.lang.String r2 = r3.x()
            r0.g(r2)
            r0.h(r3)
            boolean r2 = r3.L()
            r0.b(r2)
            java.lang.String r2 = r3.v()
            r0.c(r2)
            return r0
        L_0x01f7:
            r0 = move-exception
            r3 = r0
            goto L_0x0201
        L_0x01fa:
            r0 = move-exception
            r3 = 8
            r1.N(r7, r3)     // Catch:{ all -> 0x01f7 }
            throw r0     // Catch:{ all -> 0x01f7 }
        L_0x0201:
            r6.close()     // Catch:{ AbortedException -> 0x021f, Exception -> 0x0205 }
            goto L_0x021f
        L_0x0205:
            r0 = move-exception
            r4 = r0
            com.amazonaws.logging.Log r0 = f4259s
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = r4.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.b(r2, r4)
        L_0x021f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.AmazonS3Client.b(com.amazonaws.services.s3.model.PutObjectRequest):com.amazonaws.services.s3.model.PutObjectResult");
    }

    public CompleteMultipartUploadResult c(CompleteMultipartUploadRequest completeMultipartUploadRequest) {
        ValidationUtils.a(completeMultipartUploadRequest, "The request parameter must be specified when completing a multipart upload");
        String q9 = completeMultipartUploadRequest.q();
        String r9 = completeMultipartUploadRequest.r();
        String t9 = completeMultipartUploadRequest.t();
        ValidationUtils.a(q9, "The bucket name parameter must be specified when completing a multipart upload");
        ValidationUtils.a(r9, "The key parameter must be specified when completing a multipart upload");
        ValidationUtils.a(t9, "The upload ID parameter must be specified when completing a multipart upload");
        ValidationUtils.a(completeMultipartUploadRequest.s(), "The part ETags parameter must be specified when completing a multipart upload");
        int i10 = 0;
        while (true) {
            Request G = G(q9, r9, completeMultipartUploadRequest, HttpMethodName.POST);
            G.c("uploadId", t9);
            a0(G, completeMultipartUploadRequest.u());
            byte[] a10 = RequestXmlFactory.a(completeMultipartUploadRequest.s());
            G.i("Content-Type", "application/xml");
            G.i("Content-Length", String.valueOf(a10.length));
            G.a(new ByteArrayInputStream(a10));
            XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler = (XmlResponsesSaxParser.CompleteMultipartUploadHandler) U(G, new ResponseHeaderHandlerChain(new Unmarshallers$CompleteMultipartUploadResultUnmarshaller(), new ServerSideEncryptionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3VersionHeaderHandler(), new S3RequesterChargedHeaderHandler()), q9, r9);
            if (completeMultipartUploadHandler.o() != null) {
                return completeMultipartUploadHandler.o();
            }
            int i11 = i10 + 1;
            if (g0(completeMultipartUploadRequest, completeMultipartUploadHandler.m(), i10)) {
                i10 = i11;
            } else {
                throw completeMultipartUploadHandler.m();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.amazonaws.util.ServiceClientHolderInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.amazonaws.util.ServiceClientHolderInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: com.amazonaws.event.ProgressReportingInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.amazonaws.util.ServiceClientHolderInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.s3.model.S3Object d(com.amazonaws.services.s3.model.GetObjectRequest r10) {
        /*
            r9 = this;
            java.lang.String r0 = "The GetObjectRequest parameter must be specified when requesting an object"
            com.amazonaws.util.ValidationUtils.a(r10, r0)
            java.lang.String r0 = r10.q()
            java.lang.String r1 = "The bucket name parameter must be specified when requesting an object"
            com.amazonaws.util.ValidationUtils.a(r0, r1)
            java.lang.String r0 = r10.r()
            java.lang.String r1 = "The key parameter must be specified when requesting an object"
            com.amazonaws.util.ValidationUtils.a(r0, r1)
            java.lang.String r0 = r10.q()
            java.lang.String r1 = r10.r()
            com.amazonaws.http.HttpMethodName r2 = com.amazonaws.http.HttpMethodName.GET
            com.amazonaws.Request r0 = r9.G(r0, r1, r10, r2)
            java.lang.String r1 = r10.z()
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = r10.z()
            java.lang.String r2 = "versionId"
            r0.c(r2, r1)
        L_0x0034:
            long[] r1 = r10.v()
            r2 = 1
            if (r1 == 0) goto L_0x007a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "bytes="
            r3.append(r4)
            r4 = 0
            r4 = r1[r4]
            java.lang.String r4 = java.lang.Long.toString(r4)
            r3.append(r4)
            java.lang.String r4 = "-"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r1[r2]
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0075
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r5 = r1[r2]
            java.lang.String r1 = java.lang.Long.toString(r5)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
        L_0x0075:
            java.lang.String r1 = "Range"
            r0.i(r1, r3)
        L_0x007a:
            boolean r1 = r10.A()
            a0(r0, r1)
            r10.w()
            r1 = 0
            B(r0, r1)
            java.util.Date r3 = r10.t()
            java.lang.String r4 = "If-Modified-Since"
            z(r0, r4, r3)
            java.util.Date r3 = r10.y()
            java.lang.String r4 = "If-Unmodified-Since"
            z(r0, r4, r3)
            java.util.List r3 = r10.s()
            java.lang.String r4 = "If-Match"
            C(r0, r4, r3)
            java.util.List r3 = r10.u()
            java.lang.String r4 = "If-None-Match"
            C(r0, r4, r3)
            r10.x()
            b0(r0, r1)
            com.amazonaws.event.ProgressListener r3 = r10.e()
            com.amazonaws.event.ProgressListenerCallbackExecutor r3 = com.amazonaws.event.ProgressListenerCallbackExecutor.d(r3)
            com.amazonaws.services.s3.internal.S3ObjectResponseHandler r4 = new com.amazonaws.services.s3.internal.S3ObjectResponseHandler     // Catch:{ AmazonS3Exception -> 0x010e }
            r4.<init>()     // Catch:{ AmazonS3Exception -> 0x010e }
            java.lang.String r5 = r10.q()     // Catch:{ AmazonS3Exception -> 0x010e }
            java.lang.String r6 = r10.r()     // Catch:{ AmazonS3Exception -> 0x010e }
            java.lang.Object r0 = r9.U(r0, r4, r5, r6)     // Catch:{ AmazonS3Exception -> 0x010e }
            com.amazonaws.services.s3.model.S3Object r0 = (com.amazonaws.services.s3.model.S3Object) r0     // Catch:{ AmazonS3Exception -> 0x010e }
            java.lang.String r4 = r10.q()     // Catch:{ AmazonS3Exception -> 0x010e }
            r0.h(r4)     // Catch:{ AmazonS3Exception -> 0x010e }
            java.lang.String r10 = r10.r()     // Catch:{ AmazonS3Exception -> 0x010e }
            r0.k(r10)     // Catch:{ AmazonS3Exception -> 0x010e }
            com.amazonaws.services.s3.model.S3ObjectInputStream r10 = r0.e()     // Catch:{ AmazonS3Exception -> 0x010e }
            com.amazonaws.util.ServiceClientHolderInputStream r4 = new com.amazonaws.util.ServiceClientHolderInputStream     // Catch:{ AmazonS3Exception -> 0x010e }
            r4.<init>(r10, r9)     // Catch:{ AmazonS3Exception -> 0x010e }
            if (r3 == 0) goto L_0x00f8
            com.amazonaws.event.ProgressReportingInputStream r10 = new com.amazonaws.event.ProgressReportingInputStream     // Catch:{ AmazonS3Exception -> 0x010e }
            r10.<init>(r4, r3)     // Catch:{ AmazonS3Exception -> 0x010e }
            r10.k(r2)     // Catch:{ AmazonS3Exception -> 0x010e }
            int r4 = r9.f4268q     // Catch:{ AmazonS3Exception -> 0x010e }
            r10.l(r4)     // Catch:{ AmazonS3Exception -> 0x010e }
            r4 = 2
            r9.N(r3, r4)     // Catch:{ AmazonS3Exception -> 0x010e }
            r4 = r10
        L_0x00f8:
            com.amazonaws.util.LengthCheckInputStream r10 = new com.amazonaws.util.LengthCheckInputStream     // Catch:{ AmazonS3Exception -> 0x010e }
            com.amazonaws.services.s3.model.ObjectMetadata r5 = r0.g()     // Catch:{ AmazonS3Exception -> 0x010e }
            long r5 = r5.u()     // Catch:{ AmazonS3Exception -> 0x010e }
            r10.<init>(r4, r5, r2)     // Catch:{ AmazonS3Exception -> 0x010e }
            com.amazonaws.services.s3.model.S3ObjectInputStream r2 = new com.amazonaws.services.s3.model.S3ObjectInputStream     // Catch:{ AmazonS3Exception -> 0x010e }
            r2.<init>(r10)     // Catch:{ AmazonS3Exception -> 0x010e }
            r0.l(r2)     // Catch:{ AmazonS3Exception -> 0x010e }
            return r0
        L_0x010e:
            r10 = move-exception
            int r0 = r10.e()
            r2 = 412(0x19c, float:5.77E-43)
            if (r0 == r2) goto L_0x0126
            int r0 = r10.e()
            r2 = 304(0x130, float:4.26E-43)
            if (r0 != r2) goto L_0x0120
            goto L_0x0126
        L_0x0120:
            r0 = 8
            r9.N(r3, r0)
            throw r10
        L_0x0126:
            r10 = 16
            r9.N(r3, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.AmazonS3Client.d(com.amazonaws.services.s3.model.GetObjectRequest):com.amazonaws.services.s3.model.S3Object");
    }

    public void d0(Request<?> request, String str, String str2, URI uri) {
        String Q;
        if (uri == null) {
            uri = this.f3923a;
        }
        if (h0(uri, str)) {
            Log log = f4259s;
            log.a("Using virtual style addressing. Endpoint = " + uri);
            request.s(E(uri, str));
            Q = P(str2);
        } else {
            Log log2 = f4259s;
            log2.a("Using path style addressing. Endpoint = " + uri);
            request.s(uri);
            if (str != null) {
                Q = Q(str, str2);
            }
            Log log3 = f4259s;
            log3.a("Key: " + str2 + "; Request: " + request);
        }
        request.d(Q);
        Log log32 = f4259s;
        log32.a("Key: " + str2 + "; Request: " + request);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.amazonaws.event.ProgressReportingInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.amazonaws.event.ProgressReportingInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: com.amazonaws.services.s3.internal.InputSubstream} */
    /* JADX WARNING: type inference failed for: r2v16, types: [java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.s3.model.UploadPartResult e(com.amazonaws.services.s3.model.UploadPartRequest r13) {
        /*
            r12 = this;
            java.lang.String r0 = "The request parameter must be specified when uploading a part"
            com.amazonaws.util.ValidationUtils.a(r13, r0)
            java.lang.String r0 = r13.q()
            java.lang.String r1 = r13.v()
            java.lang.String r2 = r13.B()
            int r3 = r13.y()
            long r8 = r13.z()
            java.lang.String r4 = "The bucket name parameter must be specified when uploading a part"
            com.amazonaws.util.ValidationUtils.a(r0, r4)
            java.lang.String r4 = "The key parameter must be specified when uploading a part"
            com.amazonaws.util.ValidationUtils.a(r1, r4)
            java.lang.String r4 = "The upload ID parameter must be specified when uploading a part"
            com.amazonaws.util.ValidationUtils.a(r2, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "The part number parameter must be specified when uploading a part"
            com.amazonaws.util.ValidationUtils.a(r4, r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            java.lang.String r5 = "The part size parameter must be specified when uploading a part"
            com.amazonaws.util.ValidationUtils.a(r4, r5)
            com.amazonaws.http.HttpMethodName r4 = com.amazonaws.http.HttpMethodName.PUT
            com.amazonaws.Request r11 = r12.G(r0, r1, r13, r4)
            java.lang.String r4 = "uploadId"
            r11.c(r4, r2)
            java.lang.String r2 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "partNumber"
            r11.c(r4, r2)
            com.amazonaws.services.s3.model.ObjectMetadata r2 = r13.x()
            if (r2 == 0) goto L_0x0057
            Z(r11, r2)
        L_0x0057:
            java.lang.String r2 = java.lang.Long.toString(r8)
            java.lang.String r4 = "Content-Length"
            r11.i(r4, r2)
            boolean r2 = r13.C()
            a0(r11, r2)
            r13.A()
            r2 = 0
            b0(r11, r2)
            java.io.InputStream r2 = r13.u()
            if (r2 == 0) goto L_0x0079
            java.io.InputStream r2 = r13.u()
            goto L_0x0093
        L_0x0079:
            java.io.File r2 = r13.r()
            if (r2 == 0) goto L_0x0146
            com.amazonaws.services.s3.internal.InputSubstream r2 = new com.amazonaws.services.s3.internal.InputSubstream     // Catch:{ FileNotFoundException -> 0x013d }
            com.amazonaws.services.s3.internal.RepeatableFileInputStream r5 = new com.amazonaws.services.s3.internal.RepeatableFileInputStream     // Catch:{ FileNotFoundException -> 0x013d }
            java.io.File r4 = r13.r()     // Catch:{ FileNotFoundException -> 0x013d }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x013d }
            long r6 = r13.s()     // Catch:{ FileNotFoundException -> 0x013d }
            r10 = 1
            r4 = r2
            r4.<init>(r5, r6, r8, r10)     // Catch:{ FileNotFoundException -> 0x013d }
        L_0x0093:
            java.lang.String r4 = r13.w()
            if (r4 != 0) goto L_0x00d0
            com.amazonaws.services.s3.S3ClientOptions r4 = r12.f4265n
            boolean r4 = com.amazonaws.services.s3.internal.ServiceUtils.f(r13, r4)
            if (r4 != 0) goto L_0x00d0
            boolean r4 = r2.markSupported()
            if (r4 == 0) goto L_0x00d0
            java.lang.String r4 = com.amazonaws.util.Md5Utils.d(r2)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r5 = "Content-MD5"
            A(r11, r5, r4)     // Catch:{ Exception -> 0x00b4 }
            r2.reset()     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00d0
        L_0x00b4:
            r13 = move-exception
            com.amazonaws.AmazonClientException r0 = new com.amazonaws.AmazonClientException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to calculate MD5 hash: "
            r1.append(r2)
            java.lang.String r2 = r13.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r13)
            throw r0
        L_0x00d0:
            com.amazonaws.event.ProgressListener r13 = r13.e()
            com.amazonaws.event.ProgressListenerCallbackExecutor r13 = com.amazonaws.event.ProgressListenerCallbackExecutor.d(r13)
            if (r13 == 0) goto L_0x00ea
            com.amazonaws.event.ProgressReportingInputStream r4 = new com.amazonaws.event.ProgressReportingInputStream
            r4.<init>(r2, r13)
            int r2 = r12.f4268q
            r4.l(r2)
            r2 = 1024(0x400, float:1.435E-42)
            r12.N(r13, r2)
            r2 = r4
        L_0x00ea:
            r11.a(r2)     // Catch:{ AmazonClientException -> 0x0130 }
            com.amazonaws.services.s3.internal.S3MetadataResponseHandler r4 = new com.amazonaws.services.s3.internal.S3MetadataResponseHandler     // Catch:{ AmazonClientException -> 0x0130 }
            r4.<init>()     // Catch:{ AmazonClientException -> 0x0130 }
            java.lang.Object r0 = r12.U(r11, r4, r0, r1)     // Catch:{ AmazonClientException -> 0x0130 }
            com.amazonaws.services.s3.model.ObjectMetadata r0 = (com.amazonaws.services.s3.model.ObjectMetadata) r0     // Catch:{ AmazonClientException -> 0x0130 }
            r1 = 2048(0x800, float:2.87E-42)
            r12.N(r13, r1)     // Catch:{ AmazonClientException -> 0x0130 }
            com.amazonaws.services.s3.model.UploadPartResult r1 = new com.amazonaws.services.s3.model.UploadPartResult     // Catch:{ AmazonClientException -> 0x0130 }
            r1.<init>()     // Catch:{ AmazonClientException -> 0x0130 }
            java.lang.String r4 = r0.x()     // Catch:{ AmazonClientException -> 0x0130 }
            r1.g(r4)     // Catch:{ AmazonClientException -> 0x0130 }
            r1.h(r3)     // Catch:{ AmazonClientException -> 0x0130 }
            java.lang.String r3 = r0.E()     // Catch:{ AmazonClientException -> 0x0130 }
            r1.f(r3)     // Catch:{ AmazonClientException -> 0x0130 }
            java.lang.String r3 = r0.G()     // Catch:{ AmazonClientException -> 0x0130 }
            r1.e(r3)     // Catch:{ AmazonClientException -> 0x0130 }
            java.lang.String r3 = r0.H()     // Catch:{ AmazonClientException -> 0x0130 }
            r1.d(r3)     // Catch:{ AmazonClientException -> 0x0130 }
            boolean r0 = r0.L()     // Catch:{ AmazonClientException -> 0x0130 }
            r1.b(r0)     // Catch:{ AmazonClientException -> 0x0130 }
            if (r2 == 0) goto L_0x012d
            r2.close()     // Catch:{ Exception -> 0x012d }
        L_0x012d:
            return r1
        L_0x012e:
            r13 = move-exception
            goto L_0x0137
        L_0x0130:
            r0 = move-exception
            r1 = 4096(0x1000, float:5.74E-42)
            r12.N(r13, r1)     // Catch:{ all -> 0x012e }
            throw r0     // Catch:{ all -> 0x012e }
        L_0x0137:
            if (r2 == 0) goto L_0x013c
            r2.close()     // Catch:{ Exception -> 0x013c }
        L_0x013c:
            throw r13
        L_0x013d:
            r13 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The specified file doesn't exist"
            r0.<init>(r1, r13)
            throw r0
        L_0x0146:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "A File or InputStream must be specified when uploading part"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.AmazonS3Client.e(com.amazonaws.services.s3.model.UploadPartRequest):com.amazonaws.services.s3.model.UploadPartResult");
    }

    public InitiateMultipartUploadResult f(InitiateMultipartUploadRequest initiateMultipartUploadRequest) {
        ValidationUtils.a(initiateMultipartUploadRequest, "The request parameter must be specified when initiating a multipart upload");
        ValidationUtils.a(initiateMultipartUploadRequest.r(), "The bucket name parameter must be specified when initiating a multipart upload");
        ValidationUtils.a(initiateMultipartUploadRequest.t(), "The key parameter must be specified when initiating a multipart upload");
        Request G = G(initiateMultipartUploadRequest.r(), initiateMultipartUploadRequest.t(), initiateMultipartUploadRequest, HttpMethodName.POST);
        G.c("uploads", (String) null);
        if (initiateMultipartUploadRequest.x() != null) {
            G.i("x-amz-storage-class", initiateMultipartUploadRequest.x().toString());
        }
        if (initiateMultipartUploadRequest.u() != null) {
            G.i("x-amz-website-redirect-location", initiateMultipartUploadRequest.u());
        }
        if (initiateMultipartUploadRequest.q() != null) {
            y(G, initiateMultipartUploadRequest.q());
        } else if (initiateMultipartUploadRequest.s() != null) {
            G.i("x-amz-acl", initiateMultipartUploadRequest.s().toString());
        }
        ObjectMetadata objectMetadata = initiateMultipartUploadRequest.f4429t;
        if (objectMetadata != null) {
            Z(G, objectMetadata);
        }
        A(G, "x-amz-tagging", j0(initiateMultipartUploadRequest.y()));
        a0(G, initiateMultipartUploadRequest.z());
        initiateMultipartUploadRequest.w();
        b0(G, (SSECustomerKey) null);
        c0(G, initiateMultipartUploadRequest.v());
        f0(G);
        G.a(new ByteArrayInputStream(new byte[0]));
        return (InitiateMultipartUploadResult) U(G, new ResponseHeaderHandlerChain(new Unmarshallers$InitiateMultipartUploadResultUnmarshaller(), new ServerSideEncryptionHeaderHandler()), initiateMultipartUploadRequest.r(), initiateMultipartUploadRequest.t());
    }

    public void v(String str) {
        if (!str.endsWith("s3-accelerate.amazonaws.com")) {
            super.v(str);
            if (!str.endsWith("s3.amazonaws.com")) {
                this.f4267p = AwsHostNameUtils.a(this.f3923a.getHost(), "s3");
                return;
            }
            return;
        }
        throw new IllegalStateException("To enable accelerate mode, please use AmazonS3Client.setS3ClientOptions(S3ClientOptions.builder().setAccelerateModeEnabled(true).build());");
    }

    public void w(Region region) {
        super.w(region);
        this.f4267p = region.d();
    }
}
