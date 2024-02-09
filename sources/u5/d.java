package u5;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import o5.f;

public enum d {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{"UTF-8"}),
    ASCII((String) new int[]{27, 170}, (int) new String[]{"US-ASCII"}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{"GB2312", "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    
    private static final Map<String, d> NAME_TO_ECI = null;
    private static final Map<Integer, d> VALUE_TO_ECI = null;
    private final String[] otherEncodingNames;
    private final int[] values;

    static {
        VALUE_TO_ECI = new HashMap();
        NAME_TO_ECI = new HashMap();
        for (d dVar : values()) {
            for (int valueOf : dVar.values) {
                VALUE_TO_ECI.put(Integer.valueOf(valueOf), dVar);
            }
            NAME_TO_ECI.put(dVar.name(), dVar);
            for (String put : dVar.otherEncodingNames) {
                NAME_TO_ECI.put(put, dVar);
            }
        }
    }

    private d(int i10) {
        this(r3, r4, new int[]{i10}, new String[0]);
    }

    private d(int i10, String... strArr) {
        this.values = new int[]{i10};
        this.otherEncodingNames = strArr;
    }

    private d(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }

    public static d getCharacterSetECI(Charset charset) {
        return NAME_TO_ECI.get(charset.name());
    }

    public static d getCharacterSetECIByName(String str) {
        return NAME_TO_ECI.get(str);
    }

    public static d getCharacterSetECIByValue(int i10) {
        if (i10 >= 0 && i10 < 900) {
            return VALUE_TO_ECI.get(Integer.valueOf(i10));
        }
        throw f.a();
    }

    public Charset getCharset() {
        return Charset.forName(name());
    }

    public int getValue() {
        return this.values[0];
    }
}
