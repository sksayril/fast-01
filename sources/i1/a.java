package i1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.app.b;
import c7.a;
import d7.c;
import java.io.File;
import java.io.IOException;
import k7.j;
import k7.k;
import k7.m;
import k7.p;

public class a implements k.c, c7.a, d7.a, p, m {

    /* renamed from: m  reason: collision with root package name */
    private a.b f9447m;

    /* renamed from: n  reason: collision with root package name */
    private Context f9448n;

    /* renamed from: o  reason: collision with root package name */
    private Activity f9449o;

    /* renamed from: p  reason: collision with root package name */
    private k f9450p;

    /* renamed from: q  reason: collision with root package name */
    private k.d f9451q;

    /* renamed from: r  reason: collision with root package name */
    private String f9452r;

    /* renamed from: s  reason: collision with root package name */
    private String f9453s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9454t = false;

    private boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 33 && c("android.permission.READ_EXTERNAL_STORAGE")) || (i10 >= 33 && this.f9453s.startsWith("image") && c("android.permission.READ_MEDIA_IMAGES")) || ((i10 >= 33 && this.f9453s.startsWith("video") && c("android.permission.READ_MEDIA_VIDEO")) || ((i10 >= 33 && this.f9453s.startsWith("audio") && c("android.permission.READ_MEDIA_AUDIO")) || (i10 >= 33 && !this.f9453s.startsWith("image") && !this.f9453s.startsWith("video") && !this.f9453s.startsWith("audio"))));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03b7, code lost:
        if (r9.equals("c") == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "\\."
            java.lang.String[] r9 = r9.split(r0)
            int r0 = r9.length
            r1 = 1
            int r0 = r0 - r1
            r9 = r9[r0]
            java.lang.String r9 = r9.toLowerCase()
            r9.hashCode()
            int r0 = r9.hashCode()
            r2 = -1
            switch(r0) {
                case -1137141488: goto L_0x03bb;
                case 99: goto L_0x03b1;
                case 104: goto L_0x03a5;
                case 122: goto L_0x0399;
                case 3315: goto L_0x038d;
                case 3401: goto L_0x0381;
                case 3633: goto L_0x0375;
                case 3669: goto L_0x0369;
                case 52316: goto L_0x035c;
                case 96796: goto L_0x034e;
                case 96884: goto L_0x0340;
                case 96980: goto L_0x0332;
                case 97543: goto L_0x0324;
                case 97669: goto L_0x0316;
                case 98723: goto L_0x0308;
                case 98822: goto L_0x02fa;
                case 99640: goto L_0x02ec;
                case 100882: goto L_0x02de;
                case 102340: goto L_0x02d0;
                case 102575: goto L_0x02c2;
                case 103649: goto L_0x02b4;
                case 104987: goto L_0x02a6;
                case 105441: goto L_0x0298;
                case 106314: goto L_0x028a;
                case 106447: goto L_0x027c;
                case 106458: goto L_0x026e;
                case 106459: goto L_0x0260;
                case 106473: goto L_0x0252;
                case 106478: goto L_0x0244;
                case 106479: goto L_0x0236;
                case 107332: goto L_0x0228;
                case 108271: goto L_0x021a;
                case 108272: goto L_0x020c;
                case 108273: goto L_0x01fe;
                case 108308: goto L_0x01f0;
                case 108320: goto L_0x01e2;
                case 108322: goto L_0x01d4;
                case 108324: goto L_0x01c6;
                case 108417: goto L_0x01b8;
                case 109967: goto L_0x01aa;
                case 110834: goto L_0x019c;
                case 111145: goto L_0x018e;
                case 111219: goto L_0x0180;
                case 111220: goto L_0x0172;
                case 113252: goto L_0x0164;
                case 114597: goto L_0x0156;
                case 114791: goto L_0x0148;
                case 115312: goto L_0x013a;
                case 117484: goto L_0x012c;
                case 117835: goto L_0x011e;
                case 117856: goto L_0x0110;
                case 117946: goto L_0x0102;
                case 118783: goto L_0x00f4;
                case 118807: goto L_0x00e6;
                case 120609: goto L_0x00d8;
                case 3059492: goto L_0x00ca;
                case 3088960: goto L_0x00bc;
                case 3183070: goto L_0x00ae;
                case 3213227: goto L_0x00a0;
                case 3254818: goto L_0x0092;
                case 3268712: goto L_0x0085;
                case 3358085: goto L_0x0078;
                case 3358096: goto L_0x006b;
                case 3358141: goto L_0x005e;
                case 3447940: goto L_0x0051;
                case 3449699: goto L_0x0044;
                case 3504679: goto L_0x0037;
                case 3682393: goto L_0x002a;
                case 94742904: goto L_0x001d;
                default: goto L_0x001a;
            }
        L_0x001a:
            r1 = -1
            goto L_0x03c6
        L_0x001d:
            java.lang.String r0 = "class"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0026
            goto L_0x001a
        L_0x0026:
            r1 = 68
            goto L_0x03c6
        L_0x002a:
            java.lang.String r0 = "xlsx"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0033
            goto L_0x001a
        L_0x0033:
            r1 = 67
            goto L_0x03c6
        L_0x0037:
            java.lang.String r0 = "rmvb"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0040
            goto L_0x001a
        L_0x0040:
            r1 = 66
            goto L_0x03c6
        L_0x0044:
            java.lang.String r0 = "prop"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004d
            goto L_0x001a
        L_0x004d:
            r1 = 65
            goto L_0x03c6
        L_0x0051:
            java.lang.String r0 = "pptx"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x005a
            goto L_0x001a
        L_0x005a:
            r1 = 64
            goto L_0x03c6
        L_0x005e:
            java.lang.String r0 = "mpga"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0067
            goto L_0x001a
        L_0x0067:
            r1 = 63
            goto L_0x03c6
        L_0x006b:
            java.lang.String r0 = "mpg4"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0074
            goto L_0x001a
        L_0x0074:
            r1 = 62
            goto L_0x03c6
        L_0x0078:
            java.lang.String r0 = "mpeg"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0081
            goto L_0x001a
        L_0x0081:
            r1 = 61
            goto L_0x03c6
        L_0x0085:
            java.lang.String r0 = "jpeg"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x008e
            goto L_0x001a
        L_0x008e:
            r1 = 60
            goto L_0x03c6
        L_0x0092:
            java.lang.String r0 = "java"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x009c
            goto L_0x001a
        L_0x009c:
            r1 = 59
            goto L_0x03c6
        L_0x00a0:
            java.lang.String r0 = "html"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00aa
            goto L_0x001a
        L_0x00aa:
            r1 = 58
            goto L_0x03c6
        L_0x00ae:
            java.lang.String r0 = "gtar"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00b8
            goto L_0x001a
        L_0x00b8:
            r1 = 57
            goto L_0x03c6
        L_0x00bc:
            java.lang.String r0 = "docx"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00c6
            goto L_0x001a
        L_0x00c6:
            r1 = 56
            goto L_0x03c6
        L_0x00ca:
            java.lang.String r0 = "conf"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00d4
            goto L_0x001a
        L_0x00d4:
            r1 = 55
            goto L_0x03c6
        L_0x00d8:
            java.lang.String r0 = "zip"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00e2
            goto L_0x001a
        L_0x00e2:
            r1 = 54
            goto L_0x03c6
        L_0x00e6:
            java.lang.String r0 = "xml"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00f0
            goto L_0x001a
        L_0x00f0:
            r1 = 53
            goto L_0x03c6
        L_0x00f4:
            java.lang.String r0 = "xls"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00fe
            goto L_0x001a
        L_0x00fe:
            r1 = 52
            goto L_0x03c6
        L_0x0102:
            java.lang.String r0 = "wps"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x010c
            goto L_0x001a
        L_0x010c:
            r1 = 51
            goto L_0x03c6
        L_0x0110:
            java.lang.String r0 = "wmv"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x011a
            goto L_0x001a
        L_0x011a:
            r1 = 50
            goto L_0x03c6
        L_0x011e:
            java.lang.String r0 = "wma"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0128
            goto L_0x001a
        L_0x0128:
            r1 = 49
            goto L_0x03c6
        L_0x012c:
            java.lang.String r0 = "wav"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0136
            goto L_0x001a
        L_0x0136:
            r1 = 48
            goto L_0x03c6
        L_0x013a:
            java.lang.String r0 = "txt"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0144
            goto L_0x001a
        L_0x0144:
            r1 = 47
            goto L_0x03c6
        L_0x0148:
            java.lang.String r0 = "tgz"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0152
            goto L_0x001a
        L_0x0152:
            r1 = 46
            goto L_0x03c6
        L_0x0156:
            java.lang.String r0 = "tar"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0160
            goto L_0x001a
        L_0x0160:
            r1 = 45
            goto L_0x03c6
        L_0x0164:
            java.lang.String r0 = "rtf"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x016e
            goto L_0x001a
        L_0x016e:
            r1 = 44
            goto L_0x03c6
        L_0x0172:
            java.lang.String r0 = "ppt"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x017c
            goto L_0x001a
        L_0x017c:
            r1 = 43
            goto L_0x03c6
        L_0x0180:
            java.lang.String r0 = "pps"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x018a
            goto L_0x001a
        L_0x018a:
            r1 = 42
            goto L_0x03c6
        L_0x018e:
            java.lang.String r0 = "png"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0198
            goto L_0x001a
        L_0x0198:
            r1 = 41
            goto L_0x03c6
        L_0x019c:
            java.lang.String r0 = "pdf"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01a6
            goto L_0x001a
        L_0x01a6:
            r1 = 40
            goto L_0x03c6
        L_0x01aa:
            java.lang.String r0 = "ogg"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01b4
            goto L_0x001a
        L_0x01b4:
            r1 = 39
            goto L_0x03c6
        L_0x01b8:
            java.lang.String r0 = "msg"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01c2
            goto L_0x001a
        L_0x01c2:
            r1 = 38
            goto L_0x03c6
        L_0x01c6:
            java.lang.String r0 = "mpg"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01d0
            goto L_0x001a
        L_0x01d0:
            r1 = 37
            goto L_0x03c6
        L_0x01d4:
            java.lang.String r0 = "mpe"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01de
            goto L_0x001a
        L_0x01de:
            r1 = 36
            goto L_0x03c6
        L_0x01e2:
            java.lang.String r0 = "mpc"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01ec
            goto L_0x001a
        L_0x01ec:
            r1 = 35
            goto L_0x03c6
        L_0x01f0:
            java.lang.String r0 = "mov"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x01fa
            goto L_0x001a
        L_0x01fa:
            r1 = 34
            goto L_0x03c6
        L_0x01fe:
            java.lang.String r0 = "mp4"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0208
            goto L_0x001a
        L_0x0208:
            r1 = 33
            goto L_0x03c6
        L_0x020c:
            java.lang.String r0 = "mp3"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0216
            goto L_0x001a
        L_0x0216:
            r1 = 32
            goto L_0x03c6
        L_0x021a:
            java.lang.String r0 = "mp2"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0224
            goto L_0x001a
        L_0x0224:
            r1 = 31
            goto L_0x03c6
        L_0x0228:
            java.lang.String r0 = "log"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0232
            goto L_0x001a
        L_0x0232:
            r1 = 30
            goto L_0x03c6
        L_0x0236:
            java.lang.String r0 = "m4v"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0240
            goto L_0x001a
        L_0x0240:
            r1 = 29
            goto L_0x03c6
        L_0x0244:
            java.lang.String r0 = "m4u"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x024e
            goto L_0x001a
        L_0x024e:
            r1 = 28
            goto L_0x03c6
        L_0x0252:
            java.lang.String r0 = "m4p"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x025c
            goto L_0x001a
        L_0x025c:
            r1 = 27
            goto L_0x03c6
        L_0x0260:
            java.lang.String r0 = "m4b"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x026a
            goto L_0x001a
        L_0x026a:
            r1 = 26
            goto L_0x03c6
        L_0x026e:
            java.lang.String r0 = "m4a"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0278
            goto L_0x001a
        L_0x0278:
            r1 = 25
            goto L_0x03c6
        L_0x027c:
            java.lang.String r0 = "m3u"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0286
            goto L_0x001a
        L_0x0286:
            r1 = 24
            goto L_0x03c6
        L_0x028a:
            java.lang.String r0 = "kml"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0294
            goto L_0x001a
        L_0x0294:
            r1 = 23
            goto L_0x03c6
        L_0x0298:
            java.lang.String r0 = "jpg"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x02a2
            goto L_0x001a
        L_0x02a2:
            r1 = 22
            goto L_0x03c6
        L_0x02a6:
            java.lang.String r0 = "jar"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x02b0
            goto L_0x001a
        L_0x02b0:
            r1 = 21
            goto L_0x03c6
        L_0x02b4:
            java.lang.String r0 = "htm"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x02be
            goto L_0x001a
        L_0x02be:
            r1 = 20
            goto L_0x03c6
        L_0x02c2:
            java.lang.String r0 = "gpx"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x02cc
            goto L_0x001a
        L_0x02cc:
            r1 = 19
            goto L_0x03c6
        L_0x02d0:
            java.lang.String r0 = "gif"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x02da
            goto L_0x001a
        L_0x02da:
            r1 = 18
            goto L_0x03c6
        L_0x02de:
            java.lang.String r0 = "exe"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x02e8
            goto L_0x001a
        L_0x02e8:
            r1 = 17
            goto L_0x03c6
        L_0x02ec:
            java.lang.String r0 = "doc"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x02f6
            goto L_0x001a
        L_0x02f6:
            r1 = 16
            goto L_0x03c6
        L_0x02fa:
            java.lang.String r0 = "csv"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0304
            goto L_0x001a
        L_0x0304:
            r1 = 15
            goto L_0x03c6
        L_0x0308:
            java.lang.String r0 = "cpp"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0312
            goto L_0x001a
        L_0x0312:
            r1 = 14
            goto L_0x03c6
        L_0x0316:
            java.lang.String r0 = "bmp"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0320
            goto L_0x001a
        L_0x0320:
            r1 = 13
            goto L_0x03c6
        L_0x0324:
            java.lang.String r0 = "bin"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x032e
            goto L_0x001a
        L_0x032e:
            r1 = 12
            goto L_0x03c6
        L_0x0332:
            java.lang.String r0 = "avi"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x033c
            goto L_0x001a
        L_0x033c:
            r1 = 11
            goto L_0x03c6
        L_0x0340:
            java.lang.String r0 = "asf"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x034a
            goto L_0x001a
        L_0x034a:
            r1 = 10
            goto L_0x03c6
        L_0x034e:
            java.lang.String r0 = "apk"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0358
            goto L_0x001a
        L_0x0358:
            r1 = 9
            goto L_0x03c6
        L_0x035c:
            java.lang.String r0 = "3gp"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0366
            goto L_0x001a
        L_0x0366:
            r1 = 8
            goto L_0x03c6
        L_0x0369:
            java.lang.String r0 = "sh"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0373
            goto L_0x001a
        L_0x0373:
            r1 = 7
            goto L_0x03c6
        L_0x0375:
            java.lang.String r0 = "rc"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x037f
            goto L_0x001a
        L_0x037f:
            r1 = 6
            goto L_0x03c6
        L_0x0381:
            java.lang.String r0 = "js"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x038b
            goto L_0x001a
        L_0x038b:
            r1 = 5
            goto L_0x03c6
        L_0x038d:
            java.lang.String r0 = "gz"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0397
            goto L_0x001a
        L_0x0397:
            r1 = 4
            goto L_0x03c6
        L_0x0399:
            java.lang.String r0 = "z"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x03a3
            goto L_0x001a
        L_0x03a3:
            r1 = 3
            goto L_0x03c6
        L_0x03a5:
            java.lang.String r0 = "h"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x03af
            goto L_0x001a
        L_0x03af:
            r1 = 2
            goto L_0x03c6
        L_0x03b1:
            java.lang.String r0 = "c"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x03c6
            goto L_0x001a
        L_0x03bb:
            java.lang.String r0 = "torrent"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x03c5
            goto L_0x001a
        L_0x03c5:
            r1 = 0
        L_0x03c6:
            java.lang.String r9 = "application/vnd.ms-powerpoint"
            java.lang.String r0 = "video/mp4"
            java.lang.String r2 = "audio/x-mpeg"
            java.lang.String r3 = "image/jpeg"
            java.lang.String r4 = "text/html"
            java.lang.String r5 = "video/mpeg"
            java.lang.String r6 = "audio/mp4a-latm"
            java.lang.String r7 = "text/plain"
            switch(r1) {
                case 0: goto L_0x0461;
                case 1: goto L_0x0460;
                case 2: goto L_0x0460;
                case 3: goto L_0x045d;
                case 4: goto L_0x045a;
                case 5: goto L_0x0457;
                case 6: goto L_0x0456;
                case 7: goto L_0x0456;
                case 8: goto L_0x0453;
                case 9: goto L_0x0450;
                case 10: goto L_0x044d;
                case 11: goto L_0x044a;
                case 12: goto L_0x0447;
                case 13: goto L_0x0444;
                case 14: goto L_0x0443;
                case 15: goto L_0x0440;
                case 16: goto L_0x043d;
                case 17: goto L_0x0447;
                case 18: goto L_0x043a;
                case 19: goto L_0x0437;
                case 20: goto L_0x0436;
                case 21: goto L_0x0433;
                case 22: goto L_0x0432;
                case 23: goto L_0x042f;
                case 24: goto L_0x042c;
                case 25: goto L_0x042b;
                case 26: goto L_0x042b;
                case 27: goto L_0x042b;
                case 28: goto L_0x0428;
                case 29: goto L_0x0425;
                case 30: goto L_0x0424;
                case 31: goto L_0x0423;
                case 32: goto L_0x0423;
                case 33: goto L_0x0422;
                case 34: goto L_0x041f;
                case 35: goto L_0x041c;
                case 36: goto L_0x041b;
                case 37: goto L_0x041b;
                case 38: goto L_0x0418;
                case 39: goto L_0x0415;
                case 40: goto L_0x0412;
                case 41: goto L_0x040f;
                case 42: goto L_0x040e;
                case 43: goto L_0x040e;
                case 44: goto L_0x040c;
                case 45: goto L_0x0409;
                case 46: goto L_0x0406;
                case 47: goto L_0x0405;
                case 48: goto L_0x0402;
                case 49: goto L_0x03ff;
                case 50: goto L_0x03fc;
                case 51: goto L_0x03f9;
                case 52: goto L_0x0440;
                case 53: goto L_0x03f8;
                case 54: goto L_0x03f5;
                case 55: goto L_0x03f4;
                case 56: goto L_0x03f1;
                case 57: goto L_0x03ee;
                case 58: goto L_0x03ed;
                case 59: goto L_0x03ec;
                case 60: goto L_0x03eb;
                case 61: goto L_0x03ea;
                case 62: goto L_0x03e9;
                case 63: goto L_0x03e6;
                case 64: goto L_0x03e3;
                case 65: goto L_0x03e2;
                case 66: goto L_0x03df;
                case 67: goto L_0x03dc;
                case 68: goto L_0x0447;
                default: goto L_0x03d9;
            }
        L_0x03d9:
            java.lang.String r9 = "*/*"
            return r9
        L_0x03dc:
            java.lang.String r9 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            return r9
        L_0x03df:
            java.lang.String r9 = "audio/x-pn-realaudio"
            return r9
        L_0x03e2:
            return r7
        L_0x03e3:
            java.lang.String r9 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            return r9
        L_0x03e6:
            java.lang.String r9 = "audio/mpeg"
            return r9
        L_0x03e9:
            return r0
        L_0x03ea:
            return r5
        L_0x03eb:
            return r3
        L_0x03ec:
            return r7
        L_0x03ed:
            return r4
        L_0x03ee:
            java.lang.String r9 = "application/x-gtar"
            return r9
        L_0x03f1:
            java.lang.String r9 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            return r9
        L_0x03f4:
            return r7
        L_0x03f5:
            java.lang.String r9 = "application/x-zip-compressed"
            return r9
        L_0x03f8:
            return r7
        L_0x03f9:
            java.lang.String r9 = "application/vnd.ms-works"
            return r9
        L_0x03fc:
            java.lang.String r9 = "audio/x-ms-wmv"
            return r9
        L_0x03ff:
            java.lang.String r9 = "audio/x-ms-wma"
            return r9
        L_0x0402:
            java.lang.String r9 = "audio/x-wav"
            return r9
        L_0x0405:
            return r7
        L_0x0406:
            java.lang.String r9 = "application/x-compressed"
            return r9
        L_0x0409:
            java.lang.String r9 = "application/x-tar"
            return r9
        L_0x040c:
            java.lang.String r9 = "application/rtf"
        L_0x040e:
            return r9
        L_0x040f:
            java.lang.String r9 = "image/png"
            return r9
        L_0x0412:
            java.lang.String r9 = "application/pdf"
            return r9
        L_0x0415:
            java.lang.String r9 = "audio/ogg"
            return r9
        L_0x0418:
            java.lang.String r9 = "application/vnd.ms-outlook"
            return r9
        L_0x041b:
            return r5
        L_0x041c:
            java.lang.String r9 = "application/vnd.mpohun.certificate"
            return r9
        L_0x041f:
            java.lang.String r9 = "video/quicktime"
            return r9
        L_0x0422:
            return r0
        L_0x0423:
            return r2
        L_0x0424:
            return r7
        L_0x0425:
            java.lang.String r9 = "video/x-m4v"
            return r9
        L_0x0428:
            java.lang.String r9 = "video/vnd.mpegurl"
            return r9
        L_0x042b:
            return r6
        L_0x042c:
            java.lang.String r9 = "audio/x-mpegurl"
            return r9
        L_0x042f:
            java.lang.String r9 = "application/vnd.google-earth.kml+xml"
            return r9
        L_0x0432:
            return r3
        L_0x0433:
            java.lang.String r9 = "application/java-archive"
            return r9
        L_0x0436:
            return r4
        L_0x0437:
            java.lang.String r9 = "application/gpx+xml"
            return r9
        L_0x043a:
            java.lang.String r9 = "image/gif"
            return r9
        L_0x043d:
            java.lang.String r9 = "application/msword"
            return r9
        L_0x0440:
            java.lang.String r9 = "application/vnd.ms-excel"
            return r9
        L_0x0443:
            return r7
        L_0x0444:
            java.lang.String r9 = "image/bmp"
            return r9
        L_0x0447:
            java.lang.String r9 = "application/octet-stream"
            return r9
        L_0x044a:
            java.lang.String r9 = "video/x-msvideo"
            return r9
        L_0x044d:
            java.lang.String r9 = "video/x-ms-asf"
            return r9
        L_0x0450:
            java.lang.String r9 = "application/vnd.android.package-archive"
            return r9
        L_0x0453:
            java.lang.String r9 = "video/3gpp"
            return r9
        L_0x0456:
            return r7
        L_0x0457:
            java.lang.String r9 = "application/x-javascript"
            return r9
        L_0x045a:
            java.lang.String r9 = "application/x-gzip"
            return r9
        L_0x045d:
            java.lang.String r9 = "application/x-compress"
            return r9
        L_0x0460:
            return r7
        L_0x0461:
            java.lang.String r9 = "application/x-bittorrent"
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.a.b(java.lang.String):java.lang.String");
    }

    private boolean c(String str) {
        return androidx.core.content.a.a(this.f9449o, str) == 0;
    }

    private boolean d() {
        int i10;
        String str;
        if (this.f9452r == null) {
            i10 = -4;
            str = "the file path cannot be null";
        } else if (new File(this.f9452r).exists()) {
            return true;
        } else {
            i10 = -2;
            str = "the " + this.f9452r + " file does not exists";
        }
        h(i10, str);
        return false;
    }

    private boolean e() {
        String[] strArr = {"/DCIM/", "/Pictures/", "/Movies/", "/Alarms/", "/Audiobooks/", "/Music/", "/Notifications/", "/Podcasts/", "/Ringtones/", "/Download/"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (this.f9452r.contains(strArr[i10])) {
                return true;
            }
        }
        return false;
    }

    private boolean f() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            String canonicalPath = new File(this.f9448n.getApplicationInfo().dataDir).getCanonicalPath();
            String canonicalPath2 = new File(this.f9452r).getCanonicalPath();
            return !canonicalPath2.startsWith(canonicalPath) && !canonicalPath2.startsWith(this.f9448n.getExternalFilesDir((String) null).getCanonicalPath());
        } catch (IOException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    private void g(String str) {
        b.s(this.f9449o, new String[]{str}, 33432);
    }

    private void h(int i10, String str) {
        if (this.f9451q != null && !this.f9454t) {
            this.f9451q.a(j1.a.a(j1.b.a(i10, str)));
            this.f9454t = true;
        }
    }

    private void i() {
        Uri uri;
        String str;
        if (d()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags("application/vnd.android.package-archive".equals(this.f9453s) ? 268435456 : 536870912);
            intent.addCategory("android.intent.category.DEFAULT");
            if (Build.VERSION.SDK_INT >= 24) {
                intent.addFlags(1);
                String packageName = this.f9448n.getPackageName();
                Context context = this.f9448n;
                uri = androidx.core.content.b.f(context, packageName + ".fileProvider.com.crazecoder.openfile", new File(this.f9452r));
            } else {
                uri = Uri.fromFile(new File(this.f9452r));
            }
            intent.setDataAndType(uri, this.f9453s);
            int i10 = 0;
            try {
                this.f9449o.startActivity(intent);
                str = "done";
            } catch (ActivityNotFoundException unused) {
                i10 = -1;
                str = "No APP found to open this file。";
            } catch (Exception unused2) {
                i10 = -4;
                str = "File opened incorrectly。";
            }
            h(i10, str);
        }
    }

    public boolean m(int i10, int i11, Intent intent) {
        if (i10 != 18) {
            return false;
        }
        i();
        return false;
    }

    public void onAttachedToActivity(c cVar) {
        this.f9449o = cVar.d();
        cVar.b(this);
        cVar.c(this);
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f9447m = bVar;
        this.f9450p = new k(bVar.b(), "open_file");
        this.f9448n = this.f9447m.a();
        this.f9450p.e(this);
    }

    public void onDetachedFromActivity() {
        k kVar = this.f9450p;
        if (kVar != null) {
            kVar.e((k.c) null);
            this.f9450p = null;
            this.f9449o = null;
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        k kVar = this.f9450p;
        if (kVar != null) {
            kVar.e((k.c) null);
            this.f9450p = null;
            this.f9447m = null;
        }
    }

    @SuppressLint({"NewApi"})
    public void onMethodCall(j jVar, k.d dVar) {
        String str;
        this.f9454t = false;
        if (jVar.f10996a.equals("open_file")) {
            this.f9451q = dVar;
            this.f9452r = (String) jVar.a("file_path");
            this.f9453s = (!jVar.c("type") || jVar.a("type") == null) ? b(this.f9452r) : (String) jVar.a("type");
            if (f()) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    if (d()) {
                        if (!e() && !Environment.isExternalStorageManager()) {
                            h(-3, "Permission denied: android.Manifest.permission.MANAGE_EXTERNAL_STORAGE");
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (!a()) {
                    if (i10 < 33) {
                        str = "android.permission.READ_EXTERNAL_STORAGE";
                    } else if (this.f9453s.startsWith("image")) {
                        str = "android.permission.READ_MEDIA_IMAGES";
                    } else if (this.f9453s.startsWith("video")) {
                        str = "android.permission.READ_MEDIA_VIDEO";
                    } else if (this.f9453s.startsWith("audio")) {
                        str = "android.permission.READ_MEDIA_AUDIO";
                    } else {
                        return;
                    }
                    g(str);
                    return;
                }
            }
            i();
            return;
        }
        dVar.c();
        this.f9454t = true;
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 33432) {
            return false;
        }
        for (String str : strArr) {
            if (!c(str)) {
                h(-3, "Permission denied: " + str);
                return false;
            }
        }
        i();
        return true;
    }
}
