package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3HttpUtils;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.model.AbortIncompleteMultipartUpload;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.CORSRule;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.DeleteObjectsResult$DeletedObject;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.GetObjectTaggingResult;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.s3.model.MultiObjectDeleteException$DeleteError;
import com.amazonaws.services.s3.model.MultipartUpload;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PartSummary;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.RedirectRule;
import com.amazonaws.services.s3.model.ReplicationDestinationConfig;
import com.amazonaws.services.s3.model.ReplicationRule;
import com.amazonaws.services.s3.model.RoutingRule;
import com.amazonaws.services.s3.model.RoutingRuleCondition;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.TagSet;
import com.amazonaws.services.s3.model.analytics.AnalyticsAndOperator;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.analytics.AnalyticsExportDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilter;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilterPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsPrefixPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsS3BucketDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsTagPredicate;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysis;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysisDataExport;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryDestination;
import com.amazonaws.services.s3.model.inventory.InventoryFilter;
import com.amazonaws.services.s3.model.inventory.InventoryPrefixPredicate;
import com.amazonaws.services.s3.model.inventory.InventoryS3BucketDestination;
import com.amazonaws.services.s3.model.inventory.InventorySchedule;
import com.amazonaws.services.s3.model.lifecycle.LifecycleAndOperator;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilter;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilterPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePrefixPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleTagPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsAndOperator;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsFilter;
import com.amazonaws.services.s3.model.metrics.MetricsFilterPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsPrefixPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsTagPredicate;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class XmlResponsesSaxParser {

    /* renamed from: c  reason: collision with root package name */
    private static final Log f4610c = LogFactory.b(XmlResponsesSaxParser.class);

    /* renamed from: a  reason: collision with root package name */
    private XMLReader f4611a = null;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4612b = true;

    public static class AccessControlListHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final AccessControlList f4613o = new AccessControlList();

        /* renamed from: p  reason: collision with root package name */
        private Grantee f4614p = null;

        /* renamed from: q  reason: collision with root package name */
        private Permission f4615q = null;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            Permission parsePermission;
            if (!j("AccessControlPolicy", "Owner")) {
                if (j("AccessControlPolicy", "AccessControlList")) {
                    if (str2.equals("Grant")) {
                        this.f4613o.f(this.f4614p, this.f4615q);
                        parsePermission = null;
                        this.f4614p = null;
                    } else {
                        return;
                    }
                } else if (j("AccessControlPolicy", "AccessControlList", "Grant")) {
                    if (str2.equals("Permission")) {
                        parsePermission = Permission.parsePermission(i());
                    } else {
                        return;
                    }
                } else if (!j("AccessControlPolicy", "AccessControlList", "Grant", "Grantee")) {
                    return;
                } else {
                    if (str2.equals("ID") || str2.equals("EmailAddress")) {
                        this.f4614p.setIdentifier(i());
                        return;
                    } else if (str2.equals("URI")) {
                        this.f4614p = GroupGrantee.parseGroupGrantee(i());
                        return;
                    } else if (str2.equals("DisplayName")) {
                        ((CanonicalGrantee) this.f4614p).a(i());
                        return;
                    } else {
                        return;
                    }
                }
                this.f4615q = parsePermission;
            } else if (str2.equals("ID")) {
                this.f4613o.e().d(i());
            } else if (str2.equals("DisplayName")) {
                this.f4613o.e().c(i());
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            Grantee canonicalGrantee;
            if (j("AccessControlPolicy")) {
                if (str2.equals("Owner")) {
                    this.f4613o.g(new Owner());
                }
            } else if (j("AccessControlPolicy", "AccessControlList", "Grant") && str2.equals("Grantee")) {
                String e10 = XmlResponsesSaxParser.h("xsi:type", attributes);
                if ("AmazonCustomerByEmail".equals(e10)) {
                    canonicalGrantee = new EmailAddressGrantee((String) null);
                } else if ("CanonicalUser".equals(e10)) {
                    canonicalGrantee = new CanonicalGrantee((String) null);
                } else {
                    "Group".equals(e10);
                    return;
                }
                this.f4614p = canonicalGrantee;
            }
        }
    }

    public static class BucketAccelerateConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final BucketAccelerateConfiguration f4616o = new BucketAccelerateConfiguration((String) null);

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("AccelerateConfiguration") && str2.equals("Status")) {
                this.f4616o.a(i());
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
        }
    }

    public static class BucketCrossOriginConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final BucketCrossOriginConfiguration f4617o = new BucketCrossOriginConfiguration(new ArrayList());

        /* renamed from: p  reason: collision with root package name */
        private CORSRule f4618p;

        /* renamed from: q  reason: collision with root package name */
        private List<CORSRule.AllowedMethods> f4619q = null;

        /* renamed from: r  reason: collision with root package name */
        private List<String> f4620r = null;

        /* renamed from: s  reason: collision with root package name */
        private List<String> f4621s = null;

        /* renamed from: t  reason: collision with root package name */
        private List<String> f4622t = null;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            List list;
            Object fromValue;
            if (j("CORSConfiguration")) {
                if (str2.equals("CORSRule")) {
                    this.f4618p.a(this.f4622t);
                    this.f4618p.b(this.f4619q);
                    this.f4618p.c(this.f4620r);
                    this.f4618p.d(this.f4621s);
                    this.f4622t = null;
                    this.f4619q = null;
                    this.f4620r = null;
                    this.f4621s = null;
                    this.f4617o.a().add(this.f4618p);
                    this.f4618p = null;
                }
            } else if (!j("CORSConfiguration", "CORSRule")) {
            } else {
                if (str2.equals("ID")) {
                    this.f4618p.e(i());
                    return;
                }
                if (str2.equals("AllowedOrigin")) {
                    list = this.f4620r;
                } else if (str2.equals("AllowedMethod")) {
                    list = this.f4619q;
                    fromValue = CORSRule.AllowedMethods.fromValue(i());
                    list.add(fromValue);
                } else if (str2.equals("MaxAgeSeconds")) {
                    this.f4618p.f(Integer.parseInt(i()));
                    return;
                } else if (str2.equals("ExposeHeader")) {
                    list = this.f4621s;
                } else if (str2.equals("AllowedHeader")) {
                    list = this.f4622t;
                } else {
                    return;
                }
                fromValue = i();
                list.add(fromValue);
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("CORSConfiguration")) {
                if (str2.equals("CORSRule")) {
                    this.f4618p = new CORSRule();
                }
            } else if (!j("CORSConfiguration", "CORSRule")) {
            } else {
                if (str2.equals("AllowedOrigin")) {
                    if (this.f4620r == null) {
                        this.f4620r = new ArrayList();
                    }
                } else if (str2.equals("AllowedMethod")) {
                    if (this.f4619q == null) {
                        this.f4619q = new ArrayList();
                    }
                } else if (str2.equals("ExposeHeader")) {
                    if (this.f4621s == null) {
                        this.f4621s = new ArrayList();
                    }
                } else if (str2.equals("AllowedHeader") && this.f4622t == null) {
                    this.f4622t = new LinkedList();
                }
            }
        }
    }

    public static class BucketLifecycleConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final BucketLifecycleConfiguration f4623o = new BucketLifecycleConfiguration(new ArrayList());

        /* renamed from: p  reason: collision with root package name */
        private BucketLifecycleConfiguration.Rule f4624p;

        /* renamed from: q  reason: collision with root package name */
        private BucketLifecycleConfiguration.Transition f4625q;

        /* renamed from: r  reason: collision with root package name */
        private BucketLifecycleConfiguration.NoncurrentVersionTransition f4626r;

        /* renamed from: s  reason: collision with root package name */
        private AbortIncompleteMultipartUpload f4627s;

        /* renamed from: t  reason: collision with root package name */
        private LifecycleFilter f4628t;

        /* renamed from: u  reason: collision with root package name */
        private List<LifecycleFilterPredicate> f4629u;

        /* renamed from: v  reason: collision with root package name */
        private String f4630v;

        /* renamed from: w  reason: collision with root package name */
        private String f4631w;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("LifecycleConfiguration")) {
                if (str2.equals("Rule")) {
                    this.f4623o.a().add(this.f4624p);
                    this.f4624p = null;
                }
            } else if (j("LifecycleConfiguration", "Rule")) {
                if (str2.equals("ID")) {
                    this.f4624p.h(i());
                } else if (str2.equals("Prefix")) {
                    this.f4624p.j(i());
                } else if (str2.equals("Status")) {
                    this.f4624p.k(i());
                } else if (str2.equals("Transition")) {
                    this.f4624p.b(this.f4625q);
                    this.f4625q = null;
                } else if (str2.equals("NoncurrentVersionTransition")) {
                    this.f4624p.a(this.f4626r);
                    this.f4626r = null;
                } else if (str2.equals("AbortIncompleteMultipartUpload")) {
                    this.f4624p.c(this.f4627s);
                    this.f4627s = null;
                } else if (str2.equals("Filter")) {
                    this.f4624p.g(this.f4628t);
                    this.f4628t = null;
                }
            } else if (j("LifecycleConfiguration", "Rule", "Expiration")) {
                if (str2.equals("Date")) {
                    this.f4624p.d(ServiceUtils.c(i()));
                } else if (str2.equals("Days")) {
                    this.f4624p.e(Integer.parseInt(i()));
                } else if (str2.equals("ExpiredObjectDeleteMarker") && "true".equals(i())) {
                    this.f4624p.f(true);
                }
            } else if (j("LifecycleConfiguration", "Rule", "Transition")) {
                if (str2.equals("StorageClass")) {
                    this.f4625q.c(i());
                } else if (str2.equals("Date")) {
                    this.f4625q.a(ServiceUtils.c(i()));
                } else if (str2.equals("Days")) {
                    this.f4625q.b(Integer.parseInt(i()));
                }
            } else if (j("LifecycleConfiguration", "Rule", "NoncurrentVersionExpiration")) {
                if (str2.equals("NoncurrentDays")) {
                    this.f4624p.i(Integer.parseInt(i()));
                }
            } else if (j("LifecycleConfiguration", "Rule", "NoncurrentVersionTransition")) {
                if (str2.equals("StorageClass")) {
                    this.f4626r.b(i());
                } else if (str2.equals("NoncurrentDays")) {
                    this.f4626r.a(Integer.parseInt(i()));
                }
            } else if (!j("LifecycleConfiguration", "Rule", "AbortIncompleteMultipartUpload")) {
                if (!j("LifecycleConfiguration", "Rule", "Filter")) {
                    if (j("LifecycleConfiguration", "Rule", "Filter", "Tag")) {
                        if (!str2.equals("Key")) {
                            if (!str2.equals("Value")) {
                                return;
                            }
                            this.f4631w = i();
                            return;
                        }
                    } else if (j("LifecycleConfiguration", "Rule", "Filter", "And")) {
                        if (str2.equals("Prefix")) {
                            this.f4629u.add(new LifecyclePrefixPredicate(i()));
                            return;
                        } else if (str2.equals("Tag")) {
                            this.f4629u.add(new LifecycleTagPredicate(new Tag(this.f4630v, this.f4631w)));
                        } else {
                            return;
                        }
                    } else if (!j("LifecycleConfiguration", "Rule", "Filter", "And", "Tag")) {
                        return;
                    } else {
                        if (!str2.equals("Key")) {
                            if (!str2.equals("Value")) {
                                return;
                            }
                            this.f4631w = i();
                            return;
                        }
                    }
                    this.f4630v = i();
                    return;
                } else if (str2.equals("Prefix")) {
                    this.f4628t.a(new LifecyclePrefixPredicate(i()));
                    return;
                } else if (str2.equals("Tag")) {
                    this.f4628t.a(new LifecycleTagPredicate(new Tag(this.f4630v, this.f4631w)));
                } else if (str2.equals("And")) {
                    this.f4628t.a(new LifecycleAndOperator(this.f4629u));
                    this.f4629u = null;
                    return;
                } else {
                    return;
                }
                this.f4630v = null;
                this.f4631w = null;
            } else if (str2.equals("DaysAfterInitiation")) {
                this.f4627s.b(Integer.parseInt(i()));
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("LifecycleConfiguration")) {
                if (str2.equals("Rule")) {
                    this.f4624p = new BucketLifecycleConfiguration.Rule();
                }
            } else if (j("LifecycleConfiguration", "Rule")) {
                if (str2.equals("Transition")) {
                    this.f4625q = new BucketLifecycleConfiguration.Transition();
                } else if (str2.equals("NoncurrentVersionTransition")) {
                    this.f4626r = new BucketLifecycleConfiguration.NoncurrentVersionTransition();
                } else if (str2.equals("AbortIncompleteMultipartUpload")) {
                    this.f4627s = new AbortIncompleteMultipartUpload();
                } else if (str2.equals("Filter")) {
                    this.f4628t = new LifecycleFilter();
                }
            } else if (j("LifecycleConfiguration", "Rule", "Filter") && str2.equals("And")) {
                this.f4629u = new ArrayList();
            }
        }
    }

    public static class BucketLocationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private String f4632o = null;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (c() && str2.equals("LocationConstraint")) {
                String i10 = i();
                if (i10.length() == 0) {
                    i10 = null;
                }
                this.f4632o = i10;
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
        }
    }

    public static class BucketLoggingConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final BucketLoggingConfiguration f4633o = new BucketLoggingConfiguration();

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (!j("BucketLoggingStatus", "LoggingEnabled")) {
                return;
            }
            if (str2.equals("TargetBucket")) {
                this.f4633o.d(i());
            } else if (str2.equals("TargetPrefix")) {
                this.f4633o.e(i());
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
        }
    }

    public static class BucketReplicationConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final BucketReplicationConfiguration f4634o = new BucketReplicationConfiguration();

        /* renamed from: p  reason: collision with root package name */
        private String f4635p;

        /* renamed from: q  reason: collision with root package name */
        private ReplicationRule f4636q;

        /* renamed from: r  reason: collision with root package name */
        private ReplicationDestinationConfig f4637r;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("ReplicationConfiguration")) {
                if (str2.equals("Rule")) {
                    this.f4634o.a(this.f4635p, this.f4636q);
                    this.f4636q = null;
                    this.f4635p = null;
                    this.f4637r = null;
                } else if (str2.equals("Role")) {
                    this.f4634o.b(i());
                }
            } else if (j("ReplicationConfiguration", "Rule")) {
                if (str2.equals("ID")) {
                    this.f4635p = i();
                } else if (str2.equals("Prefix")) {
                    this.f4636q.b(i());
                } else if (str2.equals("Status")) {
                    this.f4636q.c(i());
                } else if (str2.equals("Destination")) {
                    this.f4636q.a(this.f4637r);
                }
            } else if (!j("ReplicationConfiguration", "Rule", "Destination")) {
            } else {
                if (str2.equals("Bucket")) {
                    this.f4637r.a(i());
                } else if (str2.equals("StorageClass")) {
                    this.f4637r.b(i());
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("ReplicationConfiguration")) {
                if (str2.equals("Rule")) {
                    this.f4636q = new ReplicationRule();
                }
            } else if (j("ReplicationConfiguration", "Rule") && str2.equals("Destination")) {
                this.f4637r = new ReplicationDestinationConfig();
            }
        }
    }

    public static class BucketTaggingConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final BucketTaggingConfiguration f4638o = new BucketTaggingConfiguration();

        /* renamed from: p  reason: collision with root package name */
        private Map<String, String> f4639p;

        /* renamed from: q  reason: collision with root package name */
        private String f4640q;

        /* renamed from: r  reason: collision with root package name */
        private String f4641r;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            String str4;
            if (j("Tagging")) {
                if (str2.equals("TagSet")) {
                    this.f4638o.a().add(new TagSet(this.f4639p));
                    this.f4639p = null;
                }
            } else if (j("Tagging", "TagSet")) {
                if (str2.equals("Tag")) {
                    String str5 = this.f4640q;
                    if (!(str5 == null || (str4 = this.f4641r) == null)) {
                        this.f4639p.put(str5, str4);
                    }
                    this.f4640q = null;
                    this.f4641r = null;
                }
            } else if (!j("Tagging", "TagSet", "Tag")) {
            } else {
                if (str2.equals("Key")) {
                    this.f4640q = i();
                } else if (str2.equals("Value")) {
                    this.f4641r = i();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("Tagging") && str2.equals("TagSet")) {
                this.f4639p = new HashMap();
            }
        }
    }

    public static class BucketVersioningConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final BucketVersioningConfiguration f4642o = new BucketVersioningConfiguration();

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            BucketVersioningConfiguration bucketVersioningConfiguration;
            Boolean bool;
            if (!j("VersioningConfiguration")) {
                return;
            }
            if (str2.equals("Status")) {
                this.f4642o.b(i());
            } else if (str2.equals("MfaDelete")) {
                String i10 = i();
                if (i10.equals("Disabled")) {
                    bucketVersioningConfiguration = this.f4642o;
                    bool = Boolean.FALSE;
                } else if (i10.equals("Enabled")) {
                    bucketVersioningConfiguration = this.f4642o;
                    bool = Boolean.TRUE;
                } else {
                    bucketVersioningConfiguration = this.f4642o;
                    bool = null;
                }
                bucketVersioningConfiguration.a(bool);
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
        }
    }

    public static class BucketWebsiteConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final BucketWebsiteConfiguration f4643o = new BucketWebsiteConfiguration((String) null);

        /* renamed from: p  reason: collision with root package name */
        private RoutingRuleCondition f4644p = null;

        /* renamed from: q  reason: collision with root package name */
        private RedirectRule f4645q = null;

        /* renamed from: r  reason: collision with root package name */
        private RoutingRule f4646r = null;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("WebsiteConfiguration")) {
                if (str2.equals("RedirectAllRequestsTo")) {
                    this.f4643o.d(this.f4645q);
                } else {
                    return;
                }
            } else if (j("WebsiteConfiguration", "IndexDocument")) {
                if (str2.equals("Suffix")) {
                    this.f4643o.c(i());
                    return;
                }
                return;
            } else if (j("WebsiteConfiguration", "ErrorDocument")) {
                if (str2.equals("Key")) {
                    this.f4643o.b(i());
                    return;
                }
                return;
            } else if (j("WebsiteConfiguration", "RoutingRules")) {
                if (str2.equals("RoutingRule")) {
                    this.f4643o.a().add(this.f4646r);
                    this.f4646r = null;
                    return;
                }
                return;
            } else if (j("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str2.equals("Condition")) {
                    this.f4646r.a(this.f4644p);
                    this.f4644p = null;
                    return;
                } else if (str2.equals("Redirect")) {
                    this.f4646r.b(this.f4645q);
                } else {
                    return;
                }
            } else if (j("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Condition")) {
                if (str2.equals("KeyPrefixEquals")) {
                    this.f4644p.b(i());
                    return;
                } else if (str2.equals("HttpErrorCodeReturnedEquals")) {
                    this.f4644p.a(i());
                    return;
                } else {
                    return;
                }
            } else if (!j("WebsiteConfiguration", "RedirectAllRequestsTo") && !j("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Redirect")) {
                return;
            } else {
                if (str2.equals("Protocol")) {
                    this.f4645q.c(i());
                    return;
                } else if (str2.equals("HostName")) {
                    this.f4645q.a(i());
                    return;
                } else if (str2.equals("ReplaceKeyPrefixWith")) {
                    this.f4645q.d(i());
                    return;
                } else if (str2.equals("ReplaceKeyWith")) {
                    this.f4645q.e(i());
                    return;
                } else if (str2.equals("HttpRedirectCode")) {
                    this.f4645q.b(i());
                    return;
                } else {
                    return;
                }
            }
            this.f4645q = null;
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            RedirectRule redirectRule;
            if (j("WebsiteConfiguration")) {
                if (str2.equals("RedirectAllRequestsTo")) {
                    redirectRule = new RedirectRule();
                } else {
                    return;
                }
            } else if (j("WebsiteConfiguration", "RoutingRules")) {
                if (str2.equals("RoutingRule")) {
                    this.f4646r = new RoutingRule();
                    return;
                }
                return;
            } else if (!j("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                return;
            } else {
                if (str2.equals("Condition")) {
                    this.f4644p = new RoutingRuleCondition();
                    return;
                } else if (str2.equals("Redirect")) {
                    redirectRule = new RedirectRule();
                } else {
                    return;
                }
            }
            this.f4645q = redirectRule;
        }
    }

    public static class CompleteMultipartUploadHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3VersionResult, S3RequesterChargedResult {

        /* renamed from: o  reason: collision with root package name */
        private CompleteMultipartUploadResult f4647o;

        /* renamed from: p  reason: collision with root package name */
        private AmazonS3Exception f4648p;

        /* renamed from: q  reason: collision with root package name */
        private String f4649q;

        /* renamed from: r  reason: collision with root package name */
        private String f4650r;

        /* renamed from: s  reason: collision with root package name */
        private String f4651s;

        public void a(String str) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f4647o;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.a(str);
            }
        }

        public void b(boolean z9) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f4647o;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.b(z9);
            }
        }

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            AmazonS3Exception amazonS3Exception;
            if (c()) {
                if (str2.equals("Error") && (amazonS3Exception = this.f4648p) != null) {
                    amazonS3Exception.f(this.f4651s);
                    this.f4648p.i(this.f4650r);
                    this.f4648p.p(this.f4649q);
                }
            } else if (j("CompleteMultipartUploadResult")) {
                if (str2.equals("Location")) {
                    this.f4647o.i(i());
                } else if (str2.equals("Bucket")) {
                    this.f4647o.c(i());
                } else if (str2.equals("Key")) {
                    this.f4647o.h(i());
                } else if (str2.equals("ETag")) {
                    this.f4647o.g(ServiceUtils.e(i()));
                }
            } else if (!j("Error")) {
            } else {
                if (str2.equals("Code")) {
                    this.f4651s = i();
                } else if (str2.equals("Message")) {
                    this.f4648p = new AmazonS3Exception(i());
                } else if (str2.equals("RequestId")) {
                    this.f4650r = i();
                } else if (str2.equals("HostId")) {
                    this.f4649q = i();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (c() && str2.equals("CompleteMultipartUploadResult")) {
                this.f4647o = new CompleteMultipartUploadResult();
            }
        }

        public void k(String str) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f4647o;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.k(str);
            }
        }

        /* access modifiers changed from: protected */
        public ServerSideEncryptionResult l() {
            return this.f4647o;
        }

        public AmazonS3Exception m() {
            return this.f4648p;
        }

        public void n(Date date) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f4647o;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.n(date);
            }
        }

        public CompleteMultipartUploadResult o() {
            return this.f4647o;
        }
    }

    public static class CopyObjectResultHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {

        /* renamed from: o  reason: collision with root package name */
        private final CopyObjectResult f4652o = new CopyObjectResult();

        /* renamed from: p  reason: collision with root package name */
        private String f4653p = null;

        /* renamed from: q  reason: collision with root package name */
        private String f4654q = null;

        /* renamed from: r  reason: collision with root package name */
        private String f4655r = null;

        /* renamed from: s  reason: collision with root package name */
        private String f4656s = null;

        /* renamed from: t  reason: collision with root package name */
        private boolean f4657t = false;

        public void a(String str) {
            this.f4652o.a(str);
        }

        public void b(boolean z9) {
            this.f4652o.b(z9);
        }

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("CopyObjectResult") || j("CopyPartResult")) {
                if (str2.equals("LastModified")) {
                    this.f4652o.g(ServiceUtils.c(i()));
                } else if (str2.equals("ETag")) {
                    this.f4652o.c(ServiceUtils.e(i()));
                }
            } else if (!j("Error")) {
            } else {
                if (str2.equals("Code")) {
                    this.f4653p = i();
                } else if (str2.equals("Message")) {
                    this.f4654q = i();
                } else if (str2.equals("RequestId")) {
                    this.f4655r = i();
                } else if (str2.equals("HostId")) {
                    this.f4656s = i();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            boolean z9;
            if (c()) {
                if (str2.equals("CopyObjectResult") || str2.equals("CopyPartResult")) {
                    z9 = false;
                } else if (str2.equals("Error")) {
                    z9 = true;
                } else {
                    return;
                }
                this.f4657t = z9;
            }
        }

        public void k(String str) {
            this.f4652o.k(str);
        }

        /* access modifiers changed from: protected */
        public ServerSideEncryptionResult l() {
            return this.f4652o;
        }

        public void n(Date date) {
            this.f4652o.n(date);
        }
    }

    public static class DeleteObjectsHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final DeleteObjectsResponse f4658o = new DeleteObjectsResponse();

        /* renamed from: p  reason: collision with root package name */
        private DeleteObjectsResult$DeletedObject f4659p = null;

        /* renamed from: q  reason: collision with root package name */
        private MultiObjectDeleteException$DeleteError f4660q = null;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("DeleteResult")) {
                if (str2.equals("Deleted")) {
                    this.f4658o.a().add(this.f4659p);
                    this.f4659p = null;
                } else if (str2.equals("Error")) {
                    this.f4658o.c().add(this.f4660q);
                    this.f4660q = null;
                }
            } else if (j("DeleteResult", "Deleted")) {
                if (str2.equals("Key")) {
                    this.f4659p.c(i());
                } else if (str2.equals("VersionId")) {
                    this.f4659p.d(i());
                } else if (str2.equals("DeleteMarker")) {
                    this.f4659p.a(i().equals("true"));
                } else if (str2.equals("DeleteMarkerVersionId")) {
                    this.f4659p.b(i());
                }
            } else if (!j("DeleteResult", "Error")) {
            } else {
                if (str2.equals("Key")) {
                    this.f4660q.b(i());
                } else if (str2.equals("VersionId")) {
                    this.f4660q.d(i());
                } else if (str2.equals("Code")) {
                    this.f4660q.a(i());
                } else if (str2.equals("Message")) {
                    this.f4660q.c(i());
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (!j("DeleteResult")) {
                return;
            }
            if (str2.equals("Deleted")) {
                this.f4659p = new DeleteObjectsResult$DeletedObject();
            } else if (str2.equals("Error")) {
                this.f4660q = new MultiObjectDeleteException$DeleteError();
            }
        }
    }

    public static class GetBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final AnalyticsConfiguration f4661o = new AnalyticsConfiguration();

        /* renamed from: p  reason: collision with root package name */
        private AnalyticsFilter f4662p;

        /* renamed from: q  reason: collision with root package name */
        private List<AnalyticsFilterPredicate> f4663q;

        /* renamed from: r  reason: collision with root package name */
        private StorageClassAnalysis f4664r;

        /* renamed from: s  reason: collision with root package name */
        private StorageClassAnalysisDataExport f4665s;

        /* renamed from: t  reason: collision with root package name */
        private AnalyticsExportDestination f4666t;

        /* renamed from: u  reason: collision with root package name */
        private AnalyticsS3BucketDestination f4667u;

        /* renamed from: v  reason: collision with root package name */
        private String f4668v;

        /* renamed from: w  reason: collision with root package name */
        private String f4669w;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (!j("AnalyticsConfiguration")) {
                if (!j("AnalyticsConfiguration", "Filter")) {
                    if (j("AnalyticsConfiguration", "Filter", "Tag")) {
                        if (!str2.equals("Key")) {
                            if (!str2.equals("Value")) {
                                return;
                            }
                            this.f4669w = i();
                            return;
                        }
                    } else if (j("AnalyticsConfiguration", "Filter", "And")) {
                        if (str2.equals("Prefix")) {
                            this.f4663q.add(new AnalyticsPrefixPredicate(i()));
                            return;
                        } else if (str2.equals("Tag")) {
                            this.f4663q.add(new AnalyticsTagPredicate(new Tag(this.f4668v, this.f4669w)));
                        } else {
                            return;
                        }
                    } else if (j("AnalyticsConfiguration", "Filter", "And", "Tag")) {
                        if (!str2.equals("Key")) {
                            if (!str2.equals("Value")) {
                                return;
                            }
                            this.f4669w = i();
                            return;
                        }
                    } else if (j("AnalyticsConfiguration", "StorageClassAnalysis")) {
                        if (str2.equals("DataExport")) {
                            this.f4664r.a(this.f4665s);
                            return;
                        }
                        return;
                    } else if (j("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                        if (str2.equals("OutputSchemaVersion")) {
                            this.f4665s.b(i());
                            return;
                        } else if (str2.equals("Destination")) {
                            this.f4665s.a(this.f4666t);
                            return;
                        } else {
                            return;
                        }
                    } else if (j("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                        if (str2.equals("S3BucketDestination")) {
                            this.f4666t.a(this.f4667u);
                            return;
                        }
                        return;
                    } else if (!j("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                        return;
                    } else {
                        if (str2.equals("Format")) {
                            this.f4667u.c(i());
                            return;
                        } else if (str2.equals("BucketAccountId")) {
                            this.f4667u.a(i());
                            return;
                        } else if (str2.equals("Bucket")) {
                            this.f4667u.b(i());
                            return;
                        } else if (str2.equals("Prefix")) {
                            this.f4667u.d(i());
                            return;
                        } else {
                            return;
                        }
                    }
                    this.f4668v = i();
                    return;
                } else if (str2.equals("Prefix")) {
                    this.f4662p.a(new AnalyticsPrefixPredicate(i()));
                    return;
                } else if (str2.equals("Tag")) {
                    this.f4662p.a(new AnalyticsTagPredicate(new Tag(this.f4668v, this.f4669w)));
                } else if (str2.equals("And")) {
                    this.f4662p.a(new AnalyticsAndOperator(this.f4663q));
                    this.f4663q = null;
                    return;
                } else {
                    return;
                }
                this.f4668v = null;
                this.f4669w = null;
            } else if (str2.equals("Id")) {
                this.f4661o.b(i());
            } else if (str2.equals("Filter")) {
                this.f4661o.a(this.f4662p);
            } else if (str2.equals("StorageClassAnalysis")) {
                this.f4661o.c(this.f4664r);
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("AnalyticsConfiguration")) {
                if (str2.equals("Filter")) {
                    this.f4662p = new AnalyticsFilter();
                } else if (str2.equals("StorageClassAnalysis")) {
                    this.f4664r = new StorageClassAnalysis();
                }
            } else if (j("AnalyticsConfiguration", "Filter")) {
                if (str2.equals("And")) {
                    this.f4663q = new ArrayList();
                }
            } else if (j("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str2.equals("DataExport")) {
                    this.f4665s = new StorageClassAnalysisDataExport();
                }
            } else if (j("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str2.equals("Destination")) {
                    this.f4666t = new AnalyticsExportDestination();
                }
            } else if (j("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str2.equals("S3BucketDestination")) {
                this.f4667u = new AnalyticsS3BucketDestination();
            }
        }
    }

    public static class GetBucketInventoryConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final GetBucketInventoryConfigurationResult f4670o = new GetBucketInventoryConfigurationResult();

        /* renamed from: p  reason: collision with root package name */
        private final InventoryConfiguration f4671p = new InventoryConfiguration();

        /* renamed from: q  reason: collision with root package name */
        private List<String> f4672q;

        /* renamed from: r  reason: collision with root package name */
        private InventoryDestination f4673r;

        /* renamed from: s  reason: collision with root package name */
        private InventoryFilter f4674s;

        /* renamed from: t  reason: collision with root package name */
        private InventoryS3BucketDestination f4675t;

        /* renamed from: u  reason: collision with root package name */
        private InventorySchedule f4676u;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("InventoryConfiguration")) {
                if (str2.equals("Id")) {
                    this.f4671p.c(i());
                } else if (str2.equals("Destination")) {
                    this.f4671p.a(this.f4673r);
                    this.f4673r = null;
                } else if (str2.equals("IsEnabled")) {
                    this.f4671p.b(Boolean.valueOf("true".equals(i())));
                } else if (str2.equals("Filter")) {
                    this.f4671p.e(this.f4674s);
                    this.f4674s = null;
                } else if (str2.equals("IncludedObjectVersions")) {
                    this.f4671p.d(i());
                } else if (str2.equals("Schedule")) {
                    this.f4671p.g(this.f4676u);
                    this.f4676u = null;
                } else if (str2.equals("OptionalFields")) {
                    this.f4671p.f(this.f4672q);
                    this.f4672q = null;
                }
            } else if (j("InventoryConfiguration", "Destination")) {
                if (str2.equals("S3BucketDestination")) {
                    this.f4673r.a(this.f4675t);
                    this.f4675t = null;
                }
            } else if (j("InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (str2.equals("AccountId")) {
                    this.f4675t.a(i());
                } else if (str2.equals("Bucket")) {
                    this.f4675t.b(i());
                } else if (str2.equals("Format")) {
                    this.f4675t.c(i());
                } else if (str2.equals("Prefix")) {
                    this.f4675t.d(i());
                }
            } else if (j("InventoryConfiguration", "Filter")) {
                if (str2.equals("Prefix")) {
                    this.f4674s.a(new InventoryPrefixPredicate(i()));
                }
            } else if (j("InventoryConfiguration", "Schedule")) {
                if (str2.equals("Frequency")) {
                    this.f4676u.a(i());
                }
            } else if (j("InventoryConfiguration", "OptionalFields") && str2.equals("Field")) {
                this.f4672q.add(i());
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("InventoryConfiguration")) {
                if (str2.equals("Destination")) {
                    this.f4673r = new InventoryDestination();
                } else if (str2.equals("Filter")) {
                    this.f4674s = new InventoryFilter();
                } else if (str2.equals("Schedule")) {
                    this.f4676u = new InventorySchedule();
                } else if (str2.equals("OptionalFields")) {
                    this.f4672q = new ArrayList();
                }
            } else if (j("InventoryConfiguration", "Destination") && str2.equals("S3BucketDestination")) {
                this.f4675t = new InventoryS3BucketDestination();
            }
        }
    }

    public static class GetBucketMetricsConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final MetricsConfiguration f4677o = new MetricsConfiguration();

        /* renamed from: p  reason: collision with root package name */
        private MetricsFilter f4678p;

        /* renamed from: q  reason: collision with root package name */
        private List<MetricsFilterPredicate> f4679q;

        /* renamed from: r  reason: collision with root package name */
        private String f4680r;

        /* renamed from: s  reason: collision with root package name */
        private String f4681s;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (!j("MetricsConfiguration")) {
                if (!j("MetricsConfiguration", "Filter")) {
                    if (j("MetricsConfiguration", "Filter", "Tag")) {
                        if (!str2.equals("Key")) {
                            if (!str2.equals("Value")) {
                                return;
                            }
                            this.f4681s = i();
                            return;
                        }
                    } else if (j("MetricsConfiguration", "Filter", "And")) {
                        if (str2.equals("Prefix")) {
                            this.f4679q.add(new MetricsPrefixPredicate(i()));
                            return;
                        } else if (str2.equals("Tag")) {
                            this.f4679q.add(new MetricsTagPredicate(new Tag(this.f4680r, this.f4681s)));
                        } else {
                            return;
                        }
                    } else if (!j("MetricsConfiguration", "Filter", "And", "Tag")) {
                        return;
                    } else {
                        if (!str2.equals("Key")) {
                            if (!str2.equals("Value")) {
                                return;
                            }
                            this.f4681s = i();
                            return;
                        }
                    }
                    this.f4680r = i();
                    return;
                } else if (str2.equals("Prefix")) {
                    this.f4678p.a(new MetricsPrefixPredicate(i()));
                    return;
                } else if (str2.equals("Tag")) {
                    this.f4678p.a(new MetricsTagPredicate(new Tag(this.f4680r, this.f4681s)));
                } else if (str2.equals("And")) {
                    this.f4678p.a(new MetricsAndOperator(this.f4679q));
                    this.f4679q = null;
                    return;
                } else {
                    return;
                }
                this.f4680r = null;
                this.f4681s = null;
            } else if (str2.equals("Id")) {
                this.f4677o.b(i());
            } else if (str2.equals("Filter")) {
                this.f4677o.a(this.f4678p);
                this.f4678p = null;
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("MetricsConfiguration")) {
                if (str2.equals("Filter")) {
                    this.f4678p = new MetricsFilter();
                }
            } else if (j("MetricsConfiguration", "Filter") && str2.equals("And")) {
                this.f4679q = new ArrayList();
            }
        }
    }

    public static class GetObjectTaggingHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private GetObjectTaggingResult f4682o;

        /* renamed from: p  reason: collision with root package name */
        private List<Tag> f4683p;

        /* renamed from: q  reason: collision with root package name */
        private String f4684q;

        /* renamed from: r  reason: collision with root package name */
        private String f4685r;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("Tagging") && str2.equals("TagSet")) {
                this.f4682o = new GetObjectTaggingResult(this.f4683p);
                this.f4683p = null;
            }
            if (j("Tagging", "TagSet")) {
                if (str2.equals("Tag")) {
                    this.f4683p.add(new Tag(this.f4685r, this.f4684q));
                    this.f4685r = null;
                    this.f4684q = null;
                }
            } else if (!j("Tagging", "TagSet", "Tag")) {
            } else {
                if (str2.equals("Key")) {
                    this.f4685r = i();
                } else if (str2.equals("Value")) {
                    this.f4684q = i();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("Tagging") && str2.equals("TagSet")) {
                this.f4683p = new ArrayList();
            }
        }
    }

    public static class InitiateMultipartUploadHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final InitiateMultipartUploadResult f4686o = new InitiateMultipartUploadResult();

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (!j("InitiateMultipartUploadResult")) {
                return;
            }
            if (str2.equals("Bucket")) {
                this.f4686o.g(i());
            } else if (str2.equals("Key")) {
                this.f4686o.h(i());
            } else if (str2.equals("UploadId")) {
                this.f4686o.i(i());
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
        }

        public InitiateMultipartUploadResult l() {
            return this.f4686o;
        }
    }

    public static class ListAllMyBucketsHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final List<Bucket> f4687o = new ArrayList();

        /* renamed from: p  reason: collision with root package name */
        private Owner f4688p = null;

        /* renamed from: q  reason: collision with root package name */
        private Bucket f4689q = null;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("ListAllMyBucketsResult", "Owner")) {
                if (str2.equals("ID")) {
                    this.f4688p.d(i());
                } else if (str2.equals("DisplayName")) {
                    this.f4688p.c(i());
                }
            } else if (j("ListAllMyBucketsResult", "Buckets")) {
                if (str2.equals("Bucket")) {
                    this.f4687o.add(this.f4689q);
                    this.f4689q = null;
                }
            } else if (!j("ListAllMyBucketsResult", "Buckets", "Bucket")) {
            } else {
                if (str2.equals("Name")) {
                    this.f4689q.e(i());
                } else if (str2.equals("CreationDate")) {
                    this.f4689q.d(DateUtils.h(i()));
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("ListAllMyBucketsResult")) {
                if (str2.equals("Owner")) {
                    this.f4688p = new Owner();
                }
            } else if (j("ListAllMyBucketsResult", "Buckets") && str2.equals("Bucket")) {
                Bucket bucket = new Bucket();
                this.f4689q = bucket;
                bucket.f(this.f4688p);
            }
        }
    }

    public static class ListBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final ListBucketAnalyticsConfigurationsResult f4690o = new ListBucketAnalyticsConfigurationsResult();

        /* renamed from: p  reason: collision with root package name */
        private AnalyticsConfiguration f4691p;

        /* renamed from: q  reason: collision with root package name */
        private AnalyticsFilter f4692q;

        /* renamed from: r  reason: collision with root package name */
        private List<AnalyticsFilterPredicate> f4693r;

        /* renamed from: s  reason: collision with root package name */
        private StorageClassAnalysis f4694s;

        /* renamed from: t  reason: collision with root package name */
        private StorageClassAnalysisDataExport f4695t;

        /* renamed from: u  reason: collision with root package name */
        private AnalyticsExportDestination f4696u;

        /* renamed from: v  reason: collision with root package name */
        private AnalyticsS3BucketDestination f4697v;

        /* renamed from: w  reason: collision with root package name */
        private String f4698w;

        /* renamed from: x  reason: collision with root package name */
        private String f4699x;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("ListBucketAnalyticsConfigurationsResult")) {
                if (str2.equals("AnalyticsConfiguration")) {
                    if (this.f4690o.a() == null) {
                        this.f4690o.b(new ArrayList());
                    }
                    this.f4690o.a().add(this.f4691p);
                    this.f4691p = null;
                } else if (str2.equals("IsTruncated")) {
                    this.f4690o.e("true".equals(i()));
                } else if (str2.equals("ContinuationToken")) {
                    this.f4690o.c(i());
                } else if (str2.equals("NextContinuationToken")) {
                    this.f4690o.d(i());
                }
            } else if (!j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (!j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                    if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "Tag")) {
                        if (!str2.equals("Key")) {
                            if (!str2.equals("Value")) {
                                return;
                            }
                            this.f4699x = i();
                            return;
                        }
                    } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And")) {
                        if (str2.equals("Prefix")) {
                            this.f4693r.add(new AnalyticsPrefixPredicate(i()));
                            return;
                        } else if (str2.equals("Tag")) {
                            this.f4693r.add(new AnalyticsTagPredicate(new Tag(this.f4698w, this.f4699x)));
                        } else {
                            return;
                        }
                    } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And", "Tag")) {
                        if (!str2.equals("Key")) {
                            if (!str2.equals("Value")) {
                                return;
                            }
                            this.f4699x = i();
                            return;
                        }
                    } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                        if (str2.equals("DataExport")) {
                            this.f4694s.a(this.f4695t);
                            return;
                        }
                        return;
                    } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                        if (str2.equals("OutputSchemaVersion")) {
                            this.f4695t.b(i());
                            return;
                        } else if (str2.equals("Destination")) {
                            this.f4695t.a(this.f4696u);
                            return;
                        } else {
                            return;
                        }
                    } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                        if (str2.equals("S3BucketDestination")) {
                            this.f4696u.a(this.f4697v);
                            return;
                        }
                        return;
                    } else if (!j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                        return;
                    } else {
                        if (str2.equals("Format")) {
                            this.f4697v.c(i());
                            return;
                        } else if (str2.equals("BucketAccountId")) {
                            this.f4697v.a(i());
                            return;
                        } else if (str2.equals("Bucket")) {
                            this.f4697v.b(i());
                            return;
                        } else if (str2.equals("Prefix")) {
                            this.f4697v.d(i());
                            return;
                        } else {
                            return;
                        }
                    }
                    this.f4698w = i();
                    return;
                } else if (str2.equals("Prefix")) {
                    this.f4692q.a(new AnalyticsPrefixPredicate(i()));
                    return;
                } else if (str2.equals("Tag")) {
                    this.f4692q.a(new AnalyticsTagPredicate(new Tag(this.f4698w, this.f4699x)));
                } else if (str2.equals("And")) {
                    this.f4692q.a(new AnalyticsAndOperator(this.f4693r));
                    this.f4693r = null;
                    return;
                } else {
                    return;
                }
                this.f4698w = null;
                this.f4699x = null;
            } else if (str2.equals("Id")) {
                this.f4691p.b(i());
            } else if (str2.equals("Filter")) {
                this.f4691p.a(this.f4692q);
            } else if (str2.equals("StorageClassAnalysis")) {
                this.f4691p.c(this.f4694s);
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("ListBucketAnalyticsConfigurationsResult")) {
                if (str2.equals("AnalyticsConfiguration")) {
                    this.f4691p = new AnalyticsConfiguration();
                }
            } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str2.equals("Filter")) {
                    this.f4692q = new AnalyticsFilter();
                } else if (str2.equals("StorageClassAnalysis")) {
                    this.f4694s = new StorageClassAnalysis();
                }
            } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str2.equals("And")) {
                    this.f4693r = new ArrayList();
                }
            } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str2.equals("DataExport")) {
                    this.f4695t = new StorageClassAnalysisDataExport();
                }
            } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str2.equals("Destination")) {
                    this.f4696u = new AnalyticsExportDestination();
                }
            } else if (j("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str2.equals("S3BucketDestination")) {
                this.f4697v = new AnalyticsS3BucketDestination();
            }
        }
    }

    public static class ListBucketHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final boolean f4700o;

        /* renamed from: p  reason: collision with root package name */
        private S3ObjectSummary f4701p;

        /* renamed from: q  reason: collision with root package name */
        private Owner f4702q;

        /* renamed from: r  reason: collision with root package name */
        private String f4703r;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (c()) {
                if (str2.equals("ListBucketResult")) {
                    throw null;
                }
            } else if (j("ListBucketResult")) {
                if (str2.equals("Name")) {
                    i();
                    throw null;
                } else if (str2.equals("Prefix")) {
                    String unused = XmlResponsesSaxParser.g(XmlResponsesSaxParser.f(i()), this.f4700o);
                    throw null;
                } else if (str2.equals("Marker")) {
                    String unused2 = XmlResponsesSaxParser.g(XmlResponsesSaxParser.f(i()), this.f4700o);
                    throw null;
                } else if (str2.equals("NextMarker")) {
                    String unused3 = XmlResponsesSaxParser.g(i(), this.f4700o);
                    throw null;
                } else if (str2.equals("MaxKeys")) {
                    int unused4 = XmlResponsesSaxParser.k(i());
                    throw null;
                } else if (str2.equals("Delimiter")) {
                    String unused5 = XmlResponsesSaxParser.g(XmlResponsesSaxParser.f(i()), this.f4700o);
                    throw null;
                } else if (str2.equals("EncodingType")) {
                    String unused6 = XmlResponsesSaxParser.f(i());
                    throw null;
                } else if (str2.equals("IsTruncated")) {
                    String b10 = StringUtils.b(i());
                    if (b10.startsWith("false")) {
                        throw null;
                    } else if (b10.startsWith("true")) {
                        throw null;
                    } else {
                        throw new IllegalStateException("Invalid value for IsTruncated field: " + b10);
                    }
                } else if (str2.equals("Contents")) {
                    throw null;
                }
            } else if (j("ListBucketResult", "Contents")) {
                if (str2.equals("Key")) {
                    String i10 = i();
                    this.f4703r = i10;
                    this.f4701p.b(XmlResponsesSaxParser.g(i10, this.f4700o));
                } else if (str2.equals("LastModified")) {
                    this.f4701p.c(ServiceUtils.c(i()));
                } else if (str2.equals("ETag")) {
                    this.f4701p.a(ServiceUtils.e(i()));
                } else if (str2.equals("Size")) {
                    this.f4701p.e(XmlResponsesSaxParser.l(i()));
                } else if (str2.equals("StorageClass")) {
                    this.f4701p.f(i());
                } else if (str2.equals("Owner")) {
                    this.f4701p.d(this.f4702q);
                    this.f4702q = null;
                }
            } else if (j("ListBucketResult", "Contents", "Owner")) {
                if (str2.equals("ID")) {
                    this.f4702q.d(i());
                } else if (str2.equals("DisplayName")) {
                    this.f4702q.c(i());
                }
            } else if (j("ListBucketResult", "CommonPrefixes") && str2.equals("Prefix")) {
                throw null;
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("ListBucketResult")) {
                if (str2.equals("Contents")) {
                    this.f4701p = new S3ObjectSummary();
                    throw null;
                }
            } else if (j("ListBucketResult", "Contents") && str2.equals("Owner")) {
                this.f4702q = new Owner();
            }
        }
    }

    public static class ListBucketInventoryConfigurationsHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final ListBucketInventoryConfigurationsResult f4704o = new ListBucketInventoryConfigurationsResult();

        /* renamed from: p  reason: collision with root package name */
        private InventoryConfiguration f4705p;

        /* renamed from: q  reason: collision with root package name */
        private List<String> f4706q;

        /* renamed from: r  reason: collision with root package name */
        private InventoryDestination f4707r;

        /* renamed from: s  reason: collision with root package name */
        private InventoryFilter f4708s;

        /* renamed from: t  reason: collision with root package name */
        private InventoryS3BucketDestination f4709t;

        /* renamed from: u  reason: collision with root package name */
        private InventorySchedule f4710u;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("ListInventoryConfigurationsResult")) {
                if (str2.equals("InventoryConfiguration")) {
                    if (this.f4704o.a() == null) {
                        this.f4704o.c(new ArrayList());
                    }
                    this.f4704o.a().add(this.f4705p);
                    this.f4705p = null;
                } else if (str2.equals("IsTruncated")) {
                    this.f4704o.e("true".equals(i()));
                } else if (str2.equals("ContinuationToken")) {
                    this.f4704o.b(i());
                } else if (str2.equals("NextContinuationToken")) {
                    this.f4704o.d(i());
                }
            } else if (j("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (str2.equals("Id")) {
                    this.f4705p.c(i());
                } else if (str2.equals("Destination")) {
                    this.f4705p.a(this.f4707r);
                    this.f4707r = null;
                } else if (str2.equals("IsEnabled")) {
                    this.f4705p.b(Boolean.valueOf("true".equals(i())));
                } else if (str2.equals("Filter")) {
                    this.f4705p.e(this.f4708s);
                    this.f4708s = null;
                } else if (str2.equals("IncludedObjectVersions")) {
                    this.f4705p.d(i());
                } else if (str2.equals("Schedule")) {
                    this.f4705p.g(this.f4710u);
                    this.f4710u = null;
                } else if (str2.equals("OptionalFields")) {
                    this.f4705p.f(this.f4706q);
                    this.f4706q = null;
                }
            } else if (j("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination")) {
                if (str2.equals("S3BucketDestination")) {
                    this.f4707r.a(this.f4709t);
                    this.f4709t = null;
                }
            } else if (j("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (str2.equals("AccountId")) {
                    this.f4709t.a(i());
                } else if (str2.equals("Bucket")) {
                    this.f4709t.b(i());
                } else if (str2.equals("Format")) {
                    this.f4709t.c(i());
                } else if (str2.equals("Prefix")) {
                    this.f4709t.d(i());
                }
            } else if (j("ListInventoryConfigurationsResult", "InventoryConfiguration", "Filter")) {
                if (str2.equals("Prefix")) {
                    this.f4708s.a(new InventoryPrefixPredicate(i()));
                }
            } else if (j("ListInventoryConfigurationsResult", "InventoryConfiguration", "Schedule")) {
                if (str2.equals("Frequency")) {
                    this.f4710u.a(i());
                }
            } else if (j("ListInventoryConfigurationsResult", "InventoryConfiguration", "OptionalFields") && str2.equals("Field")) {
                this.f4706q.add(i());
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("ListInventoryConfigurationsResult")) {
                if (str2.equals("InventoryConfiguration")) {
                    this.f4705p = new InventoryConfiguration();
                }
            } else if (j("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (str2.equals("Destination")) {
                    this.f4707r = new InventoryDestination();
                } else if (str2.equals("Filter")) {
                    this.f4708s = new InventoryFilter();
                } else if (str2.equals("Schedule")) {
                    this.f4710u = new InventorySchedule();
                } else if (str2.equals("OptionalFields")) {
                    this.f4706q = new ArrayList();
                }
            } else if (j("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination") && str2.equals("S3BucketDestination")) {
                this.f4709t = new InventoryS3BucketDestination();
            }
        }
    }

    public static class ListBucketMetricsConfigurationsHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final ListBucketMetricsConfigurationsResult f4711o = new ListBucketMetricsConfigurationsResult();

        /* renamed from: p  reason: collision with root package name */
        private MetricsConfiguration f4712p;

        /* renamed from: q  reason: collision with root package name */
        private MetricsFilter f4713q;

        /* renamed from: r  reason: collision with root package name */
        private List<MetricsFilterPredicate> f4714r;

        /* renamed from: s  reason: collision with root package name */
        private String f4715s;

        /* renamed from: t  reason: collision with root package name */
        private String f4716t;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("ListMetricsConfigurationsResult")) {
                if (str2.equals("MetricsConfiguration")) {
                    if (this.f4711o.a() == null) {
                        this.f4711o.c(new ArrayList());
                    }
                    this.f4711o.a().add(this.f4712p);
                    this.f4712p = null;
                } else if (str2.equals("IsTruncated")) {
                    this.f4711o.e("true".equals(i()));
                } else if (str2.equals("ContinuationToken")) {
                    this.f4711o.b(i());
                } else if (str2.equals("NextContinuationToken")) {
                    this.f4711o.d(i());
                }
            } else if (!j("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (!j("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter")) {
                    if (j("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "Tag")) {
                        if (!str2.equals("Key")) {
                            if (!str2.equals("Value")) {
                                return;
                            }
                            this.f4716t = i();
                            return;
                        }
                    } else if (j("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And")) {
                        if (str2.equals("Prefix")) {
                            this.f4714r.add(new MetricsPrefixPredicate(i()));
                            return;
                        } else if (str2.equals("Tag")) {
                            this.f4714r.add(new MetricsTagPredicate(new Tag(this.f4715s, this.f4716t)));
                        } else {
                            return;
                        }
                    } else if (!j("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And", "Tag")) {
                        return;
                    } else {
                        if (!str2.equals("Key")) {
                            if (!str2.equals("Value")) {
                                return;
                            }
                            this.f4716t = i();
                            return;
                        }
                    }
                    this.f4715s = i();
                    return;
                } else if (str2.equals("Prefix")) {
                    this.f4713q.a(new MetricsPrefixPredicate(i()));
                    return;
                } else if (str2.equals("Tag")) {
                    this.f4713q.a(new MetricsTagPredicate(new Tag(this.f4715s, this.f4716t)));
                } else if (str2.equals("And")) {
                    this.f4713q.a(new MetricsAndOperator(this.f4714r));
                    this.f4714r = null;
                    return;
                } else {
                    return;
                }
                this.f4715s = null;
                this.f4716t = null;
            } else if (str2.equals("Id")) {
                this.f4712p.b(i());
            } else if (str2.equals("Filter")) {
                this.f4712p.a(this.f4713q);
                this.f4713q = null;
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("ListMetricsConfigurationsResult")) {
                if (str2.equals("MetricsConfiguration")) {
                    this.f4712p = new MetricsConfiguration();
                }
            } else if (j("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str2.equals("Filter")) {
                    this.f4713q = new MetricsFilter();
                }
            } else if (j("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter") && str2.equals("And")) {
                this.f4714r = new ArrayList();
            }
        }
    }

    public static class ListMultipartUploadsHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final MultipartUploadListing f4717o = new MultipartUploadListing();

        /* renamed from: p  reason: collision with root package name */
        private MultipartUpload f4718p;

        /* renamed from: q  reason: collision with root package name */
        private Owner f4719q;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("ListMultipartUploadsResult")) {
                if (str2.equals("Bucket")) {
                    this.f4717o.c(i());
                } else if (str2.equals("KeyMarker")) {
                    this.f4717o.f(XmlResponsesSaxParser.f(i()));
                } else if (str2.equals("Delimiter")) {
                    this.f4717o.d(XmlResponsesSaxParser.f(i()));
                } else if (str2.equals("Prefix")) {
                    this.f4717o.j(XmlResponsesSaxParser.f(i()));
                } else if (str2.equals("UploadIdMarker")) {
                    this.f4717o.l(XmlResponsesSaxParser.f(i()));
                } else if (str2.equals("NextKeyMarker")) {
                    this.f4717o.h(XmlResponsesSaxParser.f(i()));
                } else if (str2.equals("NextUploadIdMarker")) {
                    this.f4717o.i(XmlResponsesSaxParser.f(i()));
                } else if (str2.equals("MaxUploads")) {
                    this.f4717o.g(Integer.parseInt(i()));
                } else if (str2.equals("EncodingType")) {
                    this.f4717o.e(XmlResponsesSaxParser.f(i()));
                } else if (str2.equals("IsTruncated")) {
                    this.f4717o.k(Boolean.parseBoolean(i()));
                } else if (str2.equals("Upload")) {
                    this.f4717o.b().add(this.f4718p);
                    this.f4718p = null;
                }
            } else if (j("ListMultipartUploadsResult", "CommonPrefixes")) {
                if (str2.equals("Prefix")) {
                    this.f4717o.a().add(i());
                }
            } else if (j("ListMultipartUploadsResult", "Upload")) {
                if (str2.equals("Key")) {
                    this.f4718p.c(i());
                } else if (str2.equals("UploadId")) {
                    this.f4718p.f(i());
                } else {
                    if (str2.equals("Owner")) {
                        this.f4718p.d(this.f4719q);
                    } else if (str2.equals("Initiator")) {
                        this.f4718p.b(this.f4719q);
                    } else if (str2.equals("StorageClass")) {
                        this.f4718p.e(i());
                        return;
                    } else if (str2.equals("Initiated")) {
                        this.f4718p.a(ServiceUtils.c(i()));
                        return;
                    } else {
                        return;
                    }
                    this.f4719q = null;
                }
            } else if (!j("ListMultipartUploadsResult", "Upload", "Owner") && !j("ListMultipartUploadsResult", "Upload", "Initiator")) {
            } else {
                if (str2.equals("ID")) {
                    this.f4719q.d(XmlResponsesSaxParser.f(i()));
                } else if (str2.equals("DisplayName")) {
                    this.f4719q.c(XmlResponsesSaxParser.f(i()));
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("ListMultipartUploadsResult")) {
                if (str2.equals("Upload")) {
                    this.f4718p = new MultipartUpload();
                }
            } else if (!j("ListMultipartUploadsResult", "Upload")) {
            } else {
                if (str2.equals("Owner") || str2.equals("Initiator")) {
                    this.f4719q = new Owner();
                }
            }
        }
    }

    public static class ListObjectsV2Handler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final boolean f4720o;

        /* renamed from: p  reason: collision with root package name */
        private S3ObjectSummary f4721p;

        /* renamed from: q  reason: collision with root package name */
        private Owner f4722q;

        /* renamed from: r  reason: collision with root package name */
        private String f4723r;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (c()) {
                if (str2.equals("ListBucketResult")) {
                    throw null;
                }
            } else if (j("ListBucketResult")) {
                if (str2.equals("Name")) {
                    i();
                    throw null;
                } else if (str2.equals("Prefix")) {
                    String unused = XmlResponsesSaxParser.g(XmlResponsesSaxParser.f(i()), this.f4720o);
                    throw null;
                } else if (str2.equals("MaxKeys")) {
                    int unused2 = XmlResponsesSaxParser.k(i());
                    throw null;
                } else if (str2.equals("NextContinuationToken")) {
                    i();
                    throw null;
                } else if (str2.equals("ContinuationToken")) {
                    i();
                    throw null;
                } else if (str2.equals("StartAfter")) {
                    String unused3 = XmlResponsesSaxParser.g(i(), this.f4720o);
                    throw null;
                } else if (str2.equals("KeyCount")) {
                    int unused4 = XmlResponsesSaxParser.k(i());
                    throw null;
                } else if (str2.equals("Delimiter")) {
                    String unused5 = XmlResponsesSaxParser.g(XmlResponsesSaxParser.f(i()), this.f4720o);
                    throw null;
                } else if (str2.equals("EncodingType")) {
                    String unused6 = XmlResponsesSaxParser.f(i());
                    throw null;
                } else if (str2.equals("IsTruncated")) {
                    String b10 = StringUtils.b(i());
                    if (b10.startsWith("false")) {
                        throw null;
                    } else if (b10.startsWith("true")) {
                        throw null;
                    } else {
                        throw new IllegalStateException("Invalid value for IsTruncated field: " + b10);
                    }
                } else if (str2.equals("Contents")) {
                    throw null;
                }
            } else if (j("ListBucketResult", "Contents")) {
                if (str2.equals("Key")) {
                    String i10 = i();
                    this.f4723r = i10;
                    this.f4721p.b(XmlResponsesSaxParser.g(i10, this.f4720o));
                } else if (str2.equals("LastModified")) {
                    this.f4721p.c(ServiceUtils.c(i()));
                } else if (str2.equals("ETag")) {
                    this.f4721p.a(ServiceUtils.e(i()));
                } else if (str2.equals("Size")) {
                    this.f4721p.e(XmlResponsesSaxParser.l(i()));
                } else if (str2.equals("StorageClass")) {
                    this.f4721p.f(i());
                } else if (str2.equals("Owner")) {
                    this.f4721p.d(this.f4722q);
                    this.f4722q = null;
                }
            } else if (j("ListBucketResult", "Contents", "Owner")) {
                if (str2.equals("ID")) {
                    this.f4722q.d(i());
                } else if (str2.equals("DisplayName")) {
                    this.f4722q.c(i());
                }
            } else if (j("ListBucketResult", "CommonPrefixes") && str2.equals("Prefix")) {
                throw null;
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("ListBucketResult")) {
                if (str2.equals("Contents")) {
                    this.f4721p = new S3ObjectSummary();
                    throw null;
                }
            } else if (j("ListBucketResult", "Contents") && str2.equals("Owner")) {
                this.f4722q = new Owner();
            }
        }
    }

    public static class ListPartsHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final PartListing f4724o = new PartListing();

        /* renamed from: p  reason: collision with root package name */
        private PartSummary f4725p;

        /* renamed from: q  reason: collision with root package name */
        private Owner f4726q;

        private Integer l(String str) {
            String a10 = XmlResponsesSaxParser.f(i());
            if (a10 == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(a10));
        }

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("ListPartsResult")) {
                if (str2.equals("Bucket")) {
                    this.f4724o.c(i());
                } else if (str2.equals("Key")) {
                    this.f4724o.f(i());
                } else if (str2.equals("UploadId")) {
                    this.f4724o.m(i());
                } else {
                    if (str2.equals("Owner")) {
                        this.f4724o.i(this.f4726q);
                    } else if (str2.equals("Initiator")) {
                        this.f4724o.e(this.f4726q);
                    } else if (str2.equals("StorageClass")) {
                        this.f4724o.k(i());
                        return;
                    } else if (str2.equals("PartNumberMarker")) {
                        this.f4724o.j(l(i()).intValue());
                        return;
                    } else if (str2.equals("NextPartNumberMarker")) {
                        this.f4724o.h(l(i()).intValue());
                        return;
                    } else if (str2.equals("MaxParts")) {
                        this.f4724o.g(l(i()).intValue());
                        return;
                    } else if (str2.equals("EncodingType")) {
                        this.f4724o.d(XmlResponsesSaxParser.f(i()));
                        return;
                    } else if (str2.equals("IsTruncated")) {
                        this.f4724o.l(Boolean.parseBoolean(i()));
                        return;
                    } else if (str2.equals("Part")) {
                        this.f4724o.a().add(this.f4725p);
                        this.f4725p = null;
                        return;
                    } else {
                        return;
                    }
                    this.f4726q = null;
                }
            } else if (j("ListPartsResult", "Part")) {
                if (str2.equals("PartNumber")) {
                    this.f4725p.c(Integer.parseInt(i()));
                } else if (str2.equals("LastModified")) {
                    this.f4725p.b(ServiceUtils.c(i()));
                } else if (str2.equals("ETag")) {
                    this.f4725p.a(ServiceUtils.e(i()));
                } else if (str2.equals("Size")) {
                    this.f4725p.d(Long.parseLong(i()));
                }
            } else if (!j("ListPartsResult", "Owner") && !j("ListPartsResult", "Initiator")) {
            } else {
                if (str2.equals("ID")) {
                    this.f4726q.d(XmlResponsesSaxParser.f(i()));
                } else if (str2.equals("DisplayName")) {
                    this.f4726q.c(XmlResponsesSaxParser.f(i()));
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (!j("ListPartsResult")) {
                return;
            }
            if (str2.equals("Part")) {
                this.f4725p = new PartSummary();
            } else if (str2.equals("Owner") || str2.equals("Initiator")) {
                this.f4726q = new Owner();
            }
        }
    }

    public static class ListVersionsHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private final boolean f4727o;

        /* renamed from: p  reason: collision with root package name */
        private S3VersionSummary f4728p;

        /* renamed from: q  reason: collision with root package name */
        private Owner f4729q;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("ListVersionsResult")) {
                if (str2.equals("Name")) {
                    i();
                    throw null;
                } else if (str2.equals("Prefix")) {
                    String unused = XmlResponsesSaxParser.g(XmlResponsesSaxParser.f(i()), this.f4727o);
                    throw null;
                } else if (str2.equals("KeyMarker")) {
                    String unused2 = XmlResponsesSaxParser.g(XmlResponsesSaxParser.f(i()), this.f4727o);
                    throw null;
                } else if (str2.equals("VersionIdMarker")) {
                    String unused3 = XmlResponsesSaxParser.f(i());
                    throw null;
                } else if (str2.equals("MaxKeys")) {
                    Integer.parseInt(i());
                    throw null;
                } else if (str2.equals("Delimiter")) {
                    String unused4 = XmlResponsesSaxParser.g(XmlResponsesSaxParser.f(i()), this.f4727o);
                    throw null;
                } else if (str2.equals("EncodingType")) {
                    String unused5 = XmlResponsesSaxParser.f(i());
                    throw null;
                } else if (str2.equals("NextKeyMarker")) {
                    String unused6 = XmlResponsesSaxParser.g(XmlResponsesSaxParser.f(i()), this.f4727o);
                    throw null;
                } else if (str2.equals("NextVersionIdMarker")) {
                    i();
                    throw null;
                } else if (str2.equals("IsTruncated")) {
                    "true".equals(i());
                    throw null;
                } else if (str2.equals("Version") || str2.equals("DeleteMarker")) {
                    throw null;
                }
            } else if (j("ListVersionsResult", "CommonPrefixes")) {
                if (str2.equals("Prefix")) {
                    String unused7 = XmlResponsesSaxParser.f(i());
                    throw null;
                }
            } else if (j("ListVersionsResult", "Version") || j("ListVersionsResult", "DeleteMarker")) {
                if (str2.equals("Key")) {
                    this.f4728p.c(XmlResponsesSaxParser.g(i(), this.f4727o));
                } else if (str2.equals("VersionId")) {
                    this.f4728p.h(i());
                } else if (str2.equals("IsLatest")) {
                    this.f4728p.b("true".equals(i()));
                } else if (str2.equals("LastModified")) {
                    this.f4728p.d(ServiceUtils.c(i()));
                } else if (str2.equals("ETag")) {
                    this.f4728p.a(ServiceUtils.e(i()));
                } else if (str2.equals("Size")) {
                    this.f4728p.f(Long.parseLong(i()));
                } else if (str2.equals("Owner")) {
                    this.f4728p.e(this.f4729q);
                    this.f4729q = null;
                } else if (str2.equals("StorageClass")) {
                    this.f4728p.g(i());
                }
            } else if (!j("ListVersionsResult", "Version", "Owner") && !j("ListVersionsResult", "DeleteMarker", "Owner")) {
            } else {
                if (str2.equals("ID")) {
                    this.f4729q.d(i());
                } else if (str2.equals("DisplayName")) {
                    this.f4729q.c(i());
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
            if (j("ListVersionsResult")) {
                if (str2.equals("Version")) {
                    this.f4728p = new S3VersionSummary();
                    throw null;
                } else if (str2.equals("DeleteMarker")) {
                    this.f4728p = new S3VersionSummary();
                    throw null;
                }
            } else if ((j("ListVersionsResult", "Version") || j("ListVersionsResult", "DeleteMarker")) && str2.equals("Owner")) {
                this.f4729q = new Owner();
            }
        }
    }

    public static class RequestPaymentConfigurationHandler extends AbstractHandler {

        /* renamed from: o  reason: collision with root package name */
        private String f4730o = null;

        /* access modifiers changed from: protected */
        public void g(String str, String str2, String str3) {
            if (j("RequestPaymentConfiguration") && str2.equals("Payer")) {
                this.f4730o = i();
            }
        }

        /* access modifiers changed from: protected */
        public void h(String str, String str2, String str3, Attributes attributes) {
        }
    }

    public XmlResponsesSaxParser() {
        try {
            this.f4611a = XMLReaderFactory.createXMLReader();
        } catch (SAXException e10) {
            System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
            try {
                this.f4611a = XMLReaderFactory.createXMLReader();
            } catch (SAXException unused) {
                throw new AmazonClientException("Couldn't initialize a sax driver for the XMLReader", e10);
            }
        }
    }

    /* access modifiers changed from: private */
    public static String f(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    /* access modifiers changed from: private */
    public static String g(String str, boolean z9) {
        return z9 ? S3HttpUtils.a(str) : str;
    }

    /* access modifiers changed from: private */
    public static String h(String str, Attributes attributes) {
        if (!StringUtils.a(str) && attributes != null) {
            for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                if (attributes.getQName(i10).trim().equalsIgnoreCase(str.trim())) {
                    return attributes.getValue(i10);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static int k(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            Log log = f4610c;
            log.k("Unable to parse integer value '" + str + "'", e10);
            return -1;
        }
    }

    /* access modifiers changed from: private */
    public static long l(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e10) {
            Log log = f4610c;
            log.k("Unable to parse long value '" + str + "'", e10);
            return -1;
        }
    }

    public CompleteMultipartUploadHandler i(InputStream inputStream) {
        CompleteMultipartUploadHandler completeMultipartUploadHandler = new CompleteMultipartUploadHandler();
        m(completeMultipartUploadHandler, inputStream);
        return completeMultipartUploadHandler;
    }

    public InitiateMultipartUploadHandler j(InputStream inputStream) {
        InitiateMultipartUploadHandler initiateMultipartUploadHandler = new InitiateMultipartUploadHandler();
        m(initiateMultipartUploadHandler, inputStream);
        return initiateMultipartUploadHandler;
    }

    /* access modifiers changed from: protected */
    public void m(DefaultHandler defaultHandler, InputStream inputStream) {
        try {
            Log log = f4610c;
            if (log.c()) {
                log.a("Parsing XML response document with handler: " + defaultHandler.getClass());
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            this.f4611a.setContentHandler(defaultHandler);
            this.f4611a.setErrorHandler(defaultHandler);
            this.f4611a.parse(new InputSource(bufferedReader));
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                if (f4610c.d()) {
                    f4610c.k("Unable to close response InputStream up after XML parse failure", e11);
                }
            }
            throw new AmazonClientException("Failed to parse XML document with handler " + defaultHandler.getClass(), th);
        }
    }
}
