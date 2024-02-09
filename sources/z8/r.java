package z8;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

class r extends q {
    public static final String o0(String str, int i10) {
        l.e(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(i.c(i10, str.length()));
            l.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char p0(CharSequence charSequence) {
        l.e(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(p.x(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
