package c2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import h2.p;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f3556c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static a f3557d;

    /* renamed from: a  reason: collision with root package name */
    private final Lock f3558a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f3559b;

    a(Context context) {
        this.f3559b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        p.j(context);
        Lock lock = f3556c;
        lock.lock();
        try {
            if (f3557d == null) {
                f3557d = new a(context.getApplicationContext());
            }
            a aVar = f3557d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f3556c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String c10;
        String c11 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c11) || (c10 = c(d("googleSignInAccount", c11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.C(c10);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        this.f3558a.lock();
        try {
            return this.f3559b.getString(str, (String) null);
        } finally {
            this.f3558a.unlock();
        }
    }
}
