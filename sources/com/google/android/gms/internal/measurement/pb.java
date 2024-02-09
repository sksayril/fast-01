package com.google.android.gms.internal.measurement;

final class pb {
    static String a(f7 f7Var) {
        String str;
        ob obVar = new ob(f7Var);
        StringBuilder sb = new StringBuilder(obVar.zza());
        for (int i10 = 0; i10 < obVar.zza(); i10++) {
            int e10 = obVar.e(i10);
            if (e10 == 34) {
                str = "\\\"";
            } else if (e10 == 39) {
                str = "\\'";
            } else if (e10 != 92) {
                switch (e10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (e10 < 32 || e10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((e10 >>> 6) & 3) + 48));
                            sb.append((char) (((e10 >>> 3) & 7) + 48));
                            e10 = (e10 & 7) + 48;
                        }
                        sb.append((char) e10);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
