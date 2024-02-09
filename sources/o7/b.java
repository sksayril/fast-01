package o7;

public enum b {
    auto("auto"),
    locked("locked");
    
    private final String strValue;

    private b(String str) {
        this.strValue = str;
    }

    public static b getValueForString(String str) {
        for (b bVar : values()) {
            if (bVar.strValue.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    public String toString() {
        return this.strValue;
    }
}
