package r4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

class k {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f12097a;

    public k(Context context, String str) {
        this.f12097a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        long j10 = this.f12097a.getLong("fire-count", 0);
        String str = null;
        String str2 = "";
        for (Map.Entry next : this.f12097a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f12097a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f12097a.edit().putStringSet(str2, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    private synchronized String d(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private synchronized String e(String str) {
        for (Map.Entry next : this.f12097a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    private synchronized void f(String str) {
        String e10 = e(str);
        if (e10 != null) {
            HashSet hashSet = new HashSet(this.f12097a.getStringSet(e10, new HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.f12097a.edit().remove(e10) : this.f12097a.edit().putStringSet(e10, hashSet)).commit();
        }
    }

    private synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f12097a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f12097a.edit().putStringSet(str, hashSet).commit();
    }

    /* access modifiers changed from: package-private */
    public synchronized void b() {
        SharedPreferences.Editor edit = this.f12097a.edit();
        int i10 = 0;
        for (Map.Entry next : this.f12097a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                String d10 = d(System.currentTimeMillis());
                String str = (String) next.getKey();
                if (((Set) next.getValue()).contains(d10)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(d10);
                    i10++;
                    edit.putStringSet(str, hashSet);
                } else {
                    edit.remove(str);
                }
            }
        }
        if (i10 == 0) {
            edit.remove("fire-count");
        } else {
            edit.putLong("fire-count", (long) i10);
        }
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public synchronized List<l> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.f12097a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) next.getValue());
                hashSet.remove(d(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(l.a((String) next.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        h(System.currentTimeMillis());
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized void g(long j10, String str) {
        String d10 = d(j10);
        if (this.f12097a.getString("last-used-date", "").equals(d10)) {
            String e10 = e(d10);
            if (e10 != null) {
                if (!e10.equals(str)) {
                    i(str, d10);
                    return;
                }
                return;
            }
            return;
        }
        long j11 = this.f12097a.getLong("fire-count", 0);
        if (j11 + 1 == 30) {
            a();
            j11 = this.f12097a.getLong("fire-count", 0);
        }
        HashSet hashSet = new HashSet(this.f12097a.getStringSet(str, new HashSet()));
        hashSet.add(d10);
        this.f12097a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", d10).commit();
    }

    /* access modifiers changed from: package-private */
    public synchronized void h(long j10) {
        this.f12097a.edit().putLong("fire-global", j10).commit();
    }
}
