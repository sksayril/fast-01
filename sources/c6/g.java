package c6;

import java.util.ArrayList;
import java.util.List;

final class g {

    /* renamed from: a  reason: collision with root package name */
    private final List<int[]> f3828a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f3829b = new ArrayList();

    g() {
    }

    private void a(int[] iArr, String str) {
        this.f3828a.add(iArr);
        this.f3829b.add(str);
    }

    private synchronized void b() {
        if (this.f3828a.isEmpty()) {
            a(new int[]{0, 19}, "US/CA");
            a(new int[]{30, 39}, "US");
            a(new int[]{60, 139}, "US/CA");
            a(new int[]{300, 379}, "FR");
            a(new int[]{380}, "BG");
            a(new int[]{383}, "SI");
            a(new int[]{385}, "HR");
            a(new int[]{387}, "BA");
            a(new int[]{400, 440}, "DE");
            a(new int[]{450, 459}, "JP");
            a(new int[]{460, 469}, "RU");
            a(new int[]{471}, "TW");
            a(new int[]{474}, "EE");
            a(new int[]{475}, "LV");
            a(new int[]{476}, "AZ");
            a(new int[]{477}, "LT");
            a(new int[]{478}, "UZ");
            a(new int[]{479}, "LK");
            a(new int[]{480}, "PH");
            a(new int[]{481}, "BY");
            a(new int[]{482}, "UA");
            a(new int[]{484}, "MD");
            a(new int[]{485}, "AM");
            a(new int[]{486}, "GE");
            a(new int[]{487}, "KZ");
            a(new int[]{489}, "HK");
            a(new int[]{490, 499}, "JP");
            a(new int[]{500, 509}, "GB");
            a(new int[]{520}, "GR");
            a(new int[]{528}, "LB");
            a(new int[]{529}, "CY");
            a(new int[]{531}, "MK");
            a(new int[]{535}, "MT");
            a(new int[]{539}, "IE");
            a(new int[]{540, 549}, "BE/LU");
            a(new int[]{560}, "PT");
            a(new int[]{569}, "IS");
            a(new int[]{570, 579}, "DK");
            a(new int[]{590}, "PL");
            a(new int[]{594}, "RO");
            a(new int[]{599}, "HU");
            a(new int[]{600, 601}, "ZA");
            a(new int[]{603}, "GH");
            a(new int[]{608}, "BH");
            a(new int[]{609}, "MU");
            a(new int[]{611}, "MA");
            a(new int[]{613}, "DZ");
            a(new int[]{616}, "KE");
            a(new int[]{618}, "CI");
            a(new int[]{619}, "TN");
            a(new int[]{621}, "SY");
            a(new int[]{622}, "EG");
            a(new int[]{624}, "LY");
            a(new int[]{625}, "JO");
            a(new int[]{626}, "IR");
            a(new int[]{627}, "KW");
            a(new int[]{628}, "SA");
            a(new int[]{629}, "AE");
            a(new int[]{640, 649}, "FI");
            a(new int[]{690, 695}, "CN");
            a(new int[]{700, 709}, "NO");
            a(new int[]{729}, "IL");
            a(new int[]{730, 739}, "SE");
            a(new int[]{740}, "GT");
            a(new int[]{741}, "SV");
            a(new int[]{742}, "HN");
            a(new int[]{743}, "NI");
            a(new int[]{744}, "CR");
            a(new int[]{745}, "PA");
            a(new int[]{746}, "DO");
            a(new int[]{750}, "MX");
            a(new int[]{754, 755}, "CA");
            a(new int[]{759}, "VE");
            a(new int[]{760, 769}, "CH");
            a(new int[]{770}, "CO");
            a(new int[]{773}, "UY");
            a(new int[]{775}, "PE");
            a(new int[]{777}, "BO");
            a(new int[]{779}, "AR");
            a(new int[]{780}, "CL");
            a(new int[]{784}, "PY");
            a(new int[]{785}, "PE");
            a(new int[]{786}, "EC");
            a(new int[]{789, 790}, "BR");
            a(new int[]{800, 839}, "IT");
            a(new int[]{840, 849}, "ES");
            a(new int[]{850}, "CU");
            a(new int[]{858}, "SK");
            a(new int[]{859}, "CZ");
            a(new int[]{860}, "YU");
            a(new int[]{865}, "MN");
            a(new int[]{867}, "KP");
            a(new int[]{868, 869}, "TR");
            a(new int[]{870, 879}, "NL");
            a(new int[]{880}, "KR");
            a(new int[]{885}, "TH");
            a(new int[]{888}, "SG");
            a(new int[]{890}, "IN");
            a(new int[]{893}, "VN");
            a(new int[]{896}, "PK");
            a(new int[]{899}, "ID");
            a(new int[]{900, 919}, "AT");
            a(new int[]{930, 939}, "AU");
            a(new int[]{940, 949}, "AZ");
            a(new int[]{955}, "MY");
            a(new int[]{958}, "MO");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        r4 = r7.f3828a.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String c(java.lang.String r8) {
        /*
            r7 = this;
            r7.b()
            r0 = 0
            r1 = 3
            java.lang.String r8 = r8.substring(r0, r1)
            int r8 = java.lang.Integer.parseInt(r8)
            java.util.List<int[]> r1 = r7.f3828a
            int r1 = r1.size()
            r2 = 0
        L_0x0014:
            r3 = 0
            if (r2 >= r1) goto L_0x0039
            java.util.List<int[]> r4 = r7.f3828a
            java.lang.Object r4 = r4.get(r2)
            int[] r4 = (int[]) r4
            r5 = r4[r0]
            if (r8 >= r5) goto L_0x0024
            return r3
        L_0x0024:
            int r3 = r4.length
            r6 = 1
            if (r3 != r6) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r5 = r4[r6]
        L_0x002b:
            if (r8 > r5) goto L_0x0036
            java.util.List<java.lang.String> r8 = r7.f3829b
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L_0x0036:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.g.c(java.lang.String):java.lang.String");
    }
}
