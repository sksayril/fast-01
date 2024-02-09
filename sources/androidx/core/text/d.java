package androidx.core.text;

import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f1658a = new e((c) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final c f1659b = new e((c) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final c f1660c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f1661d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f1662e = new e(a.f1664b, false);

    /* renamed from: f  reason: collision with root package name */
    public static final c f1663f = f.f1669b;

    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f1664b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f1665a;

        private a(boolean z9) {
            this.f1665a = z9;
        }

        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z9 = false;
            while (i10 < i12) {
                int a10 = d.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                    } else if (!this.f1665a) {
                        return 1;
                    }
                } else if (this.f1665a) {
                    return 0;
                }
                z9 = true;
                i10++;
            }
            if (z9) {
                return this.f1665a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f1666a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = d.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* renamed from: androidx.core.text.d$d  reason: collision with other inner class name */
    private static abstract class C0030d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final c f1667a;

        C0030d(c cVar) {
            this.f1667a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f1667a.a(charSequence, i10, i11);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return b();
            }
            return false;
        }

        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence != null && i10 >= 0 && i11 >= 0 && charSequence.length() - i11 >= i10) {
                return this.f1667a == null ? b() : c(charSequence, i10, i11);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: protected */
        public abstract boolean b();
    }

    private static class e extends C0030d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f1668b;

        e(c cVar, boolean z9) {
            super(cVar);
            this.f1668b = z9;
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return this.f1668b;
        }
    }

    private static class f extends C0030d {

        /* renamed from: b  reason: collision with root package name */
        static final f f1669b = new f();

        f() {
            super((c) null);
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return e.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f1666a;
        f1660c = new e(bVar, false);
        f1661d = new e(bVar, true);
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
