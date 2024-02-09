package t2;

import java.text.SimpleDateFormat;
import java.util.Locale;

public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleDateFormat f12364a;

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleDateFormat f12365b;

    /* renamed from: c  reason: collision with root package name */
    private static final StringBuilder f12366c = new StringBuilder(33);

    static {
        Locale locale = Locale.ROOT;
        f12364a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f12365b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
    }

    public static String a(long j10) {
        String sb;
        StringBuilder sb2 = f12366c;
        synchronized (sb2) {
            sb2.setLength(0);
            b(j10, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public static void b(long j10, StringBuilder sb) {
        String str;
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 == 0) {
            str = "0s";
        } else {
            sb.ensureCapacity(sb.length() + 27);
            boolean z9 = false;
            if (i10 < 0) {
                sb.append("-");
                if (j10 != Long.MIN_VALUE) {
                    j10 = -j10;
                } else {
                    j10 = Long.MAX_VALUE;
                    z9 = true;
                }
            }
            if (j10 >= 86400000) {
                sb.append(j10 / 86400000);
                sb.append("d");
                j10 %= 86400000;
            }
            if (true == z9) {
                j10 = 25975808;
            }
            if (j10 >= 3600000) {
                sb.append(j10 / 3600000);
                sb.append("h");
                j10 %= 3600000;
            }
            if (j10 >= 60000) {
                sb.append(j10 / 60000);
                sb.append("m");
                j10 %= 60000;
            }
            if (j10 >= 1000) {
                sb.append(j10 / 1000);
                sb.append("s");
                j10 %= 1000;
            }
            if (j10 > 0) {
                sb.append(j10);
                str = "ms";
            } else {
                return;
            }
        }
        sb.append(str);
    }
}
