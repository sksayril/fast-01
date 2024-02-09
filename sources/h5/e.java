package h5;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final int f9343a = a();

    private static int a() {
        return d(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int c() {
        return f9343a;
    }

    static int d(String str) {
        int f10 = f(str);
        if (f10 == -1) {
            f10 = b(str);
        }
        if (f10 == -1) {
            return 6;
        }
        return f10;
    }

    public static boolean e() {
        return f9343a >= 9;
    }

    private static int f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
