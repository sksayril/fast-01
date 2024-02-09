package g9;

final /* synthetic */ class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f8999a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f8999a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
