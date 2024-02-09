package v7;

public enum b {
    off("off"),
    fast("fast"),
    highQuality("highQuality"),
    minimal("minimal"),
    zeroShutterLag("zeroShutterLag");
    
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
