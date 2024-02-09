package i8;

class b {
    public static <T extends Comparable<?>> int a(T t9, T t10) {
        if (t9 == t10) {
            return 0;
        }
        if (t9 == null) {
            return -1;
        }
        if (t10 == null) {
            return 1;
        }
        return t9.compareTo(t10);
    }
}
