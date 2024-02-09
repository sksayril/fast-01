package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.systemchannels.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class c extends AccessibilityNodeProvider {
    /* access modifiers changed from: private */
    public static final int A = (((((((((((i.HAS_CHECKED_STATE.value | i.IS_CHECKED.value) | i.IS_SELECTED.value) | i.IS_TEXT_FIELD.value) | i.IS_FOCUSED.value) | i.HAS_ENABLED_STATE.value) | i.IS_ENABLED.value) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | i.HAS_TOGGLED_STATE.value) | i.IS_TOGGLED.value) | i.IS_FOCUSABLE.value) | i.IS_SLIDER.value);
    private static int B = 267386881;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final int f10642z = (((g.SCROLL_RIGHT.value | g.SCROLL_LEFT.value) | g.SCROLL_UP.value) | g.SCROLL_DOWN.value);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final View f10643a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final io.flutter.embedding.engine.systemchannels.a f10644b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final AccessibilityManager f10645c;

    /* renamed from: d  reason: collision with root package name */
    private final AccessibilityViewEmbedder f10646d;

    /* renamed from: e  reason: collision with root package name */
    private final io.flutter.plugin.platform.k f10647e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f10648f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, l> f10649g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Integer, h> f10650h;

    /* renamed from: i  reason: collision with root package name */
    private l f10651i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f10652j;

    /* renamed from: k  reason: collision with root package name */
    private Integer f10653k;

    /* renamed from: l  reason: collision with root package name */
    private int f10654l;

    /* renamed from: m  reason: collision with root package name */
    private l f10655m;

    /* renamed from: n  reason: collision with root package name */
    private l f10656n;

    /* renamed from: o  reason: collision with root package name */
    private l f10657o;

    /* renamed from: p  reason: collision with root package name */
    private final List<Integer> f10658p;

    /* renamed from: q  reason: collision with root package name */
    private int f10659q;

    /* renamed from: r  reason: collision with root package name */
    private Integer f10660r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public k f10661s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f10662t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f10663u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final a.b f10664v;

    /* renamed from: w  reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f10665w;
    @TargetApi(19)

    /* renamed from: x  reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f10666x;

    /* renamed from: y  reason: collision with root package name */
    private final ContentObserver f10667y;

    class a implements a.b {
        a() {
        }

        public void a(String str) {
            c.this.f10643a.announceForAccessibility(str);
        }

        public void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer order : byteBufferArr) {
                order.order(ByteOrder.LITTLE_ENDIAN);
            }
            c.this.b0(byteBuffer, strArr, byteBufferArr);
        }

        public void c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            c.this.a0(byteBuffer, strArr);
        }

        public void d(String str) {
            if (Build.VERSION.SDK_INT < 28) {
                AccessibilityEvent i10 = c.this.H(0, 32);
                i10.getText().add(str);
                c.this.S(i10);
            }
        }

        public void e(int i10) {
            c.this.R(i10, 8);
        }

        public void f(int i10) {
            c.this.R(i10, 2);
        }

        public void g(int i10) {
            c.this.R(i10, 1);
        }
    }

    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        public void onAccessibilityStateChanged(boolean z9) {
            if (!c.this.f10663u) {
                c cVar = c.this;
                if (z9) {
                    cVar.f10644b.g(c.this.f10664v);
                    c.this.f10644b.e();
                } else {
                    cVar.W(false);
                    c.this.f10644b.g((a.b) null);
                    c.this.f10644b.d();
                }
                if (c.this.f10661s != null) {
                    c.this.f10661s.a(z9, c.this.f10645c.isTouchExplorationEnabled());
                }
            }
        }
    }

    /* renamed from: io.flutter.view.c$c  reason: collision with other inner class name */
    class C0160c extends ContentObserver {
        C0160c(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z9) {
            onChange(z9, (Uri) null);
        }

        public void onChange(boolean z9, Uri uri) {
            if (!c.this.f10663u) {
                String string = Settings.Global.getString(c.this.f10648f, "transition_animation_scale");
                if (string != null && string.equals("0")) {
                    c.f(c.this, f.DISABLE_ANIMATIONS.value);
                } else {
                    c.e(c.this, ~f.DISABLE_ANIMATIONS.value);
                }
                c.this.T();
            }
        }
    }

    class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f10671a;

        d(AccessibilityManager accessibilityManager) {
            this.f10671a = accessibilityManager;
        }

        public void onTouchExplorationStateChanged(boolean z9) {
            if (!c.this.f10663u) {
                if (!z9) {
                    c.this.W(false);
                    c.this.L();
                }
                if (c.this.f10661s != null) {
                    c.this.f10661s.a(this.f10671a.isEnabled(), z9);
                }
            }
        }
    }

    static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10673a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.view.c$o[] r0 = io.flutter.view.c.o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10673a = r0
                io.flutter.view.c$o r1 = io.flutter.view.c.o.SPELLOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10673a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.view.c$o r1 = io.flutter.view.c.o.LOCALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.e.<clinit>():void");
        }
    }

    private enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        
        final int value;

        private f(int i10) {
            this.value = i10;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        
        public final int value;

        private g(int i10) {
            this.value = i10;
        }
    }

    private static class h {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f10674a = -1;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f10675b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f10676c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f10677d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f10678e;

        h() {
        }
    }

    enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432);
        
        final int value;

        private i(int i10) {
            this.value = i10;
        }
    }

    private static class j extends n {

        /* renamed from: d  reason: collision with root package name */
        String f10679d;

        private j() {
            super((a) null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    public interface k {
        void a(boolean z9, boolean z10);
    }

    private static class l {
        private p A;
        /* access modifiers changed from: private */
        public boolean B = false;
        private int C;
        private int D;
        /* access modifiers changed from: private */
        public int E;
        /* access modifiers changed from: private */
        public int F;
        private float G;
        private float H;
        private float I;
        /* access modifiers changed from: private */
        public String J;
        private String K;
        private float L;
        private float M;
        private float N;
        private float O;
        private float[] P;
        /* access modifiers changed from: private */
        public l Q;
        /* access modifiers changed from: private */
        public List<l> R = new ArrayList();
        /* access modifiers changed from: private */
        public List<l> S = new ArrayList();
        /* access modifiers changed from: private */
        public List<h> T;
        /* access modifiers changed from: private */
        public h U;
        /* access modifiers changed from: private */
        public h V;
        /* access modifiers changed from: private */
        public boolean W = true;
        private float[] X;
        /* access modifiers changed from: private */
        public boolean Y = true;
        private float[] Z;

        /* renamed from: a  reason: collision with root package name */
        final c f10680a;

        /* renamed from: a0  reason: collision with root package name */
        private Rect f10681a0;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f10682b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f10683c;

        /* renamed from: d  reason: collision with root package name */
        private int f10684d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f10685e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f10686f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f10687g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f10688h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public int f10689i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public int f10690j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f10691k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public float f10692l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public float f10693m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public float f10694n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public String f10695o;

        /* renamed from: p  reason: collision with root package name */
        private List<n> f10696p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public String f10697q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public List<n> f10698r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public String f10699s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public List<n> f10700t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public String f10701u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public List<n> f10702v;

        /* renamed from: w  reason: collision with root package name */
        private String f10703w;

        /* renamed from: x  reason: collision with root package name */
        private List<n> f10704x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public String f10705y;
        /* access modifiers changed from: private */

        /* renamed from: z  reason: collision with root package name */
        public int f10706z = -1;

        l(c cVar) {
            this.f10680a = cVar;
        }

        /* access modifiers changed from: private */
        public static boolean A0(l lVar, d8.d<l> dVar) {
            return (lVar == null || lVar.j0(dVar) == null) ? false : true;
        }

        private void B0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f10 = fArr[3];
            fArr[0] = fArr[0] / f10;
            fArr[1] = fArr[1] / f10;
            fArr[2] = fArr[2] / f10;
            fArr[3] = 0.0f;
        }

        /* access modifiers changed from: private */
        public void C0(float[] fArr, Set<l> set, boolean z9) {
            set.add(this);
            if (this.Y) {
                z9 = true;
            }
            if (z9) {
                if (this.Z == null) {
                    this.Z = new float[16];
                }
                if (this.P == null) {
                    this.P = new float[16];
                }
                Matrix.multiplyMM(this.Z, 0, fArr, 0, this.P, 0);
                float[] fArr2 = new float[4];
                fArr2[2] = 0.0f;
                fArr2[3] = 1.0f;
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                fArr2[0] = this.L;
                fArr2[1] = this.M;
                B0(fArr3, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.M;
                B0(fArr4, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.O;
                B0(fArr5, this.Z, fArr2);
                fArr2[0] = this.L;
                fArr2[1] = this.O;
                B0(fArr6, this.Z, fArr2);
                if (this.f10681a0 == null) {
                    this.f10681a0 = new Rect();
                }
                this.f10681a0.set(Math.round(z0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(z0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(y0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(y0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Y = false;
            }
            int i10 = -1;
            for (l next : this.R) {
                next.f10706z = i10;
                i10 = next.f10682b;
                next.C0(this.Z, set, z9);
            }
        }

        /* access modifiers changed from: private */
        public void D0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.B = true;
            this.J = this.f10697q;
            this.K = this.f10695o;
            this.C = this.f10683c;
            this.D = this.f10684d;
            this.E = this.f10687g;
            this.F = this.f10688h;
            this.G = this.f10692l;
            this.H = this.f10693m;
            this.I = this.f10694n;
            this.f10683c = byteBuffer.getInt();
            this.f10684d = byteBuffer.getInt();
            this.f10685e = byteBuffer.getInt();
            this.f10686f = byteBuffer.getInt();
            this.f10687g = byteBuffer.getInt();
            this.f10688h = byteBuffer.getInt();
            this.f10689i = byteBuffer.getInt();
            this.f10690j = byteBuffer.getInt();
            this.f10691k = byteBuffer.getInt();
            this.f10692l = byteBuffer.getFloat();
            this.f10693m = byteBuffer.getFloat();
            this.f10694n = byteBuffer.getFloat();
            int i10 = byteBuffer.getInt();
            this.f10695o = i10 == -1 ? null : strArr[i10];
            this.f10696p = o0(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            this.f10697q = i11 == -1 ? null : strArr[i11];
            this.f10698r = o0(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            this.f10699s = i12 == -1 ? null : strArr[i12];
            this.f10700t = o0(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            this.f10701u = i13 == -1 ? null : strArr[i13];
            this.f10702v = o0(byteBuffer, byteBufferArr);
            int i14 = byteBuffer.getInt();
            this.f10703w = i14 == -1 ? null : strArr[i14];
            this.f10704x = o0(byteBuffer, byteBufferArr);
            int i15 = byteBuffer.getInt();
            this.f10705y = i15 == -1 ? null : strArr[i15];
            this.A = p.fromInt(byteBuffer.getInt());
            this.L = byteBuffer.getFloat();
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            if (this.P == null) {
                this.P = new float[16];
            }
            for (int i16 = 0; i16 < 16; i16++) {
                this.P[i16] = byteBuffer.getFloat();
            }
            this.W = true;
            this.Y = true;
            int i17 = byteBuffer.getInt();
            this.R.clear();
            this.S.clear();
            for (int i18 = 0; i18 < i17; i18++) {
                l n10 = this.f10680a.z(byteBuffer.getInt());
                n10.Q = this;
                this.R.add(n10);
            }
            for (int i19 = 0; i19 < i17; i19++) {
                l n11 = this.f10680a.z(byteBuffer.getInt());
                n11.Q = this;
                this.S.add(n11);
            }
            int i20 = byteBuffer.getInt();
            if (i20 == 0) {
                this.T = null;
                return;
            }
            List<h> list = this.T;
            if (list == null) {
                this.T = new ArrayList(i20);
            } else {
                list.clear();
            }
            for (int i21 = 0; i21 < i20; i21++) {
                h o10 = this.f10680a.y(byteBuffer.getInt());
                if (o10.f10676c == g.TAP.value) {
                    this.U = o10;
                } else if (o10.f10676c == g.LONG_PRESS.value) {
                    this.V = o10;
                } else {
                    this.T.add(o10);
                }
                this.T.add(o10);
            }
        }

        /* access modifiers changed from: private */
        public void e0(List<l> list) {
            if (v0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (l e02 : this.R) {
                e02.e0(list);
            }
        }

        @TargetApi(21)
        private SpannableString f0(String str, List<n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (n next : list) {
                    int i10 = e.f10673a[next.f10709c.ordinal()];
                    if (i10 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), next.f10707a, next.f10708b, 0);
                    } else if (i10 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) next).f10679d)), next.f10707a, next.f10708b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
            r2 = r3.K;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean g0() {
            /*
                r3 = this;
                java.lang.String r0 = r3.f10695o
                r1 = 0
                if (r0 != 0) goto L_0x000a
                java.lang.String r2 = r3.K
                if (r2 != 0) goto L_0x000a
                return r1
            L_0x000a:
                if (r0 == 0) goto L_0x0016
                java.lang.String r2 = r3.K
                if (r2 == 0) goto L_0x0016
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0017
            L_0x0016:
                r1 = 1
            L_0x0017:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.l.g0():boolean");
        }

        /* access modifiers changed from: private */
        public boolean h0() {
            return !Float.isNaN(this.f10692l) && !Float.isNaN(this.G) && this.G != this.f10692l;
        }

        private void i0() {
            if (this.W) {
                this.W = false;
                if (this.X == null) {
                    this.X = new float[16];
                }
                if (!Matrix.invertM(this.X, 0, this.P, 0)) {
                    Arrays.fill(this.X, 0.0f);
                }
            }
        }

        private l j0(d8.d<l> dVar) {
            for (l lVar = this.Q; lVar != null; lVar = lVar.Q) {
                if (dVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public Rect k0() {
            return this.f10681a0;
        }

        private CharSequence l0() {
            return f0(this.f10703w, this.f10704x);
        }

        static /* synthetic */ int m(l lVar, int i10) {
            int i11 = lVar.f10688h + i10;
            lVar.f10688h = i11;
            return i11;
        }

        private CharSequence m0() {
            return f0(this.f10695o, this.f10696p);
        }

        static /* synthetic */ int n(l lVar, int i10) {
            int i11 = lVar.f10688h - i10;
            lVar.f10688h = i11;
            return i11;
        }

        /* access modifiers changed from: private */
        public String n0() {
            String str;
            if (v0(i.NAMES_ROUTE) && (str = this.f10695o) != null && !str.isEmpty()) {
                return this.f10695o;
            }
            for (l n02 : this.R) {
                String n03 = n02.n0();
                if (n03 != null && !n03.isEmpty()) {
                    return n03;
                }
            }
            return null;
        }

        private List<n> o0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i10 = byteBuffer.getInt();
            if (i10 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = byteBuffer.getInt();
                int i13 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i14 = e.f10673a[oVar.ordinal()];
                if (i14 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m((a) null);
                    mVar.f10707a = i12;
                    mVar.f10708b = i13;
                    mVar.f10709c = oVar;
                    arrayList.add(mVar);
                } else if (i14 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j((a) null);
                    jVar.f10707a = i12;
                    jVar.f10708b = i13;
                    jVar.f10709c = oVar;
                    jVar.f10679d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public CharSequence p0() {
            CharSequence[] charSequenceArr = {m0(), l0()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 2; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        /* access modifiers changed from: private */
        public CharSequence q0() {
            return f0(this.f10697q, this.f10698r);
        }

        /* access modifiers changed from: private */
        public CharSequence r0() {
            CharSequence[] charSequenceArr = {q0(), m0(), l0()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 3; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        /* access modifiers changed from: private */
        public boolean s0(g gVar) {
            return (gVar.value & this.D) != 0;
        }

        /* access modifiers changed from: private */
        public boolean t0(i iVar) {
            return (iVar.value & this.C) != 0;
        }

        /* access modifiers changed from: private */
        public boolean u0(g gVar) {
            return (gVar.value & this.f10684d) != 0;
        }

        /* access modifiers changed from: private */
        public boolean v0(i iVar) {
            return (iVar.value & this.f10683c) != 0;
        }

        /* access modifiers changed from: private */
        public l w0(float[] fArr, boolean z9) {
            float f10 = fArr[3];
            boolean z10 = false;
            float f11 = fArr[0] / f10;
            float f12 = fArr[1] / f10;
            if (f11 < this.L || f11 >= this.N || f12 < this.M || f12 >= this.O) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l next : this.S) {
                if (!next.v0(i.IS_HIDDEN)) {
                    next.i0();
                    Matrix.multiplyMV(fArr2, 0, next.X, 0, fArr, 0);
                    l w02 = next.w0(fArr2, z9);
                    if (w02 != null) {
                        return w02;
                    }
                }
            }
            if (z9 && this.f10689i != -1) {
                z10 = true;
            }
            if (x0() || z10) {
                return this;
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
            r0 = r4.f10695o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
            r0 = r4.f10697q;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            r0 = r4.f10703w;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean x0() {
            /*
                r4 = this;
                io.flutter.view.c$i r0 = io.flutter.view.c.i.SCOPES_ROUTE
                boolean r0 = r4.v0(r0)
                r1 = 0
                if (r0 == 0) goto L_0x000a
                return r1
            L_0x000a:
                io.flutter.view.c$i r0 = io.flutter.view.c.i.IS_FOCUSABLE
                boolean r0 = r4.v0(r0)
                r2 = 1
                if (r0 == 0) goto L_0x0014
                return r2
            L_0x0014:
                int r0 = r4.f10684d
                int r3 = io.flutter.view.c.f10642z
                int r3 = ~r3
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0045
                int r0 = r4.f10683c
                int r3 = io.flutter.view.c.A
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0045
                java.lang.String r0 = r4.f10695o
                if (r0 == 0) goto L_0x0031
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0045
            L_0x0031:
                java.lang.String r0 = r4.f10697q
                if (r0 == 0) goto L_0x003b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0045
            L_0x003b:
                java.lang.String r0 = r4.f10703w
                if (r0 == 0) goto L_0x0046
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0046
            L_0x0045:
                r1 = 1
            L_0x0046:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.l.x0():boolean");
        }

        private float y0(float f10, float f11, float f12, float f13) {
            return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
        }

        private float z0(float f10, float f11, float f12, float f13) {
            return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
        }
    }

    private static class m extends n {
        private m() {
            super((a) null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    private static class n {

        /* renamed from: a  reason: collision with root package name */
        int f10707a;

        /* renamed from: b  reason: collision with root package name */
        int f10708b;

        /* renamed from: c  reason: collision with root package name */
        o f10709c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    private enum o {
        SPELLOUT,
        LOCALE
    }

    private enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p fromInt(int i10) {
            return i10 != 1 ? i10 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public c(View view, io.flutter.embedding.engine.systemchannels.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.k kVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), kVar);
    }

    public c(View view, io.flutter.embedding.engine.systemchannels.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.k kVar) {
        this.f10649g = new HashMap();
        this.f10650h = new HashMap();
        this.f10654l = 0;
        this.f10658p = new ArrayList();
        this.f10659q = 0;
        this.f10660r = 0;
        this.f10662t = false;
        this.f10663u = false;
        this.f10664v = new a();
        b bVar = new b();
        this.f10665w = bVar;
        C0160c cVar = new C0160c(new Handler());
        this.f10667y = cVar;
        this.f10643a = view;
        this.f10644b = aVar;
        this.f10645c = accessibilityManager;
        this.f10648f = contentResolver;
        this.f10646d = accessibilityViewEmbedder;
        this.f10647e = kVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        int i10 = Build.VERSION.SDK_INT;
        d dVar = new d(accessibilityManager);
        this.f10666x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (i10 >= 31) {
            X();
        }
        kVar.a(this);
    }

    private l A() {
        return this.f10649g.get(0);
    }

    private void B(float f10, float f11, boolean z9) {
        l J;
        if (!this.f10649g.isEmpty() && (J = A().w0(new float[]{f10, f11, 0.0f, 1.0f}, z9)) != this.f10657o) {
            if (J != null) {
                R(J.f10682b, 128);
            }
            l lVar = this.f10657o;
            if (lVar != null) {
                R(lVar.f10682b, 256);
            }
            this.f10657o = J;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean E(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* access modifiers changed from: private */
    public AccessibilityEvent H(int i10, int i11) {
        AccessibilityEvent G = G(i11);
        G.setPackageName(this.f10643a.getContext().getPackageName());
        G.setSource(this.f10643a, i10);
        return G;
    }

    /* access modifiers changed from: private */
    public void L() {
        l lVar = this.f10657o;
        if (lVar != null) {
            R(lVar.f10682b, 256);
            this.f10657o = null;
        }
    }

    private void M(l lVar) {
        String d02 = lVar.n0();
        if (d02 == null) {
            d02 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            V(d02);
            return;
        }
        AccessibilityEvent H = H(lVar.f10682b, 32);
        H.getText().add(d02);
        S(H);
    }

    @TargetApi(18)
    private boolean N(l lVar, int i10, Bundle bundle, boolean z9) {
        int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z10 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i12 = lVar.f10687g;
        int k10 = lVar.f10688h;
        P(lVar, i11, z9, z10);
        if (!(i12 == lVar.f10687g && k10 == lVar.f10688h)) {
            String q9 = lVar.f10697q != null ? lVar.f10697q : "";
            AccessibilityEvent H = H(lVar.f10682b, 8192);
            H.getText().add(q9);
            H.setFromIndex(lVar.f10687g);
            H.setToIndex(lVar.f10688h);
            H.setItemCount(q9.length());
            S(H);
        }
        if (i11 == 1) {
            if (z9) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.u0(gVar)) {
                    this.f10644b.c(i10, gVar, Boolean.valueOf(z10));
                    return true;
                }
            }
            if (z9) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.u0(gVar2)) {
                return false;
            }
            this.f10644b.c(i10, gVar2, Boolean.valueOf(z10));
            return true;
        } else if (i11 != 2) {
            return i11 == 4 || i11 == 8 || i11 == 16;
        } else {
            if (z9) {
                g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
                if (lVar.u0(gVar3)) {
                    this.f10644b.c(i10, gVar3, Boolean.valueOf(z10));
                    return true;
                }
            }
            if (z9) {
                return false;
            }
            g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (!lVar.u0(gVar4)) {
                return false;
            }
            this.f10644b.c(i10, gVar4, Boolean.valueOf(z10));
            return true;
        }
    }

    @TargetApi(21)
    private boolean O(l lVar, int i10, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f10644b.c(i10, g.SET_TEXT, string);
        String unused = lVar.f10697q = string;
        List unused2 = lVar.f10698r = null;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r6 != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r5.find() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        io.flutter.view.c.l.m(r4, r5.start(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r5.find() != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        r5 = r5.start(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r5.find() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        if (r5.find() != false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void P(io.flutter.view.c.l r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = r4.f10688h
            if (r0 < 0) goto L_0x0111
            int r0 = r4.f10687g
            if (r0 >= 0) goto L_0x000e
            goto L_0x0111
        L_0x000e:
            r0 = 1
            if (r5 == r0) goto L_0x00e9
            r1 = 2
            r2 = 0
            if (r5 == r1) goto L_0x0094
            r1 = 4
            if (r5 == r1) goto L_0x0036
            r0 = 8
            if (r5 == r0) goto L_0x0022
            r0 = 16
            if (r5 == r0) goto L_0x0022
            goto L_0x0108
        L_0x0022:
            if (r6 == 0) goto L_0x0031
        L_0x0024:
            java.lang.String r5 = r4.f10697q
            int r5 = r5.length()
        L_0x002c:
            int unused = r4.f10688h = r5
            goto L_0x0108
        L_0x0031:
            int unused = r4.f10688h = r2
            goto L_0x0108
        L_0x0036:
            if (r6 == 0) goto L_0x006b
            int r5 = r4.f10688h
            java.lang.String r1 = r4.f10697q
            int r1 = r1.length()
            if (r5 >= r1) goto L_0x006b
            java.lang.String r5 = "(?!^)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f10697q
            int r1 = r4.f10688h
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0024
        L_0x0062:
            int r5 = r5.start(r0)
            io.flutter.view.c.l.m(r4, r5)
            goto L_0x0108
        L_0x006b:
            if (r6 != 0) goto L_0x0108
            int r5 = r4.f10688h
            if (r5 <= 0) goto L_0x0108
            java.lang.String r5 = "(?s:.*)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f10697q
            int r1 = r4.f10688h
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0031
        L_0x008f:
            int r5 = r5.start(r0)
            goto L_0x002c
        L_0x0094:
            if (r6 == 0) goto L_0x00c4
            int r5 = r4.f10688h
            java.lang.String r1 = r4.f10697q
            int r1 = r1.length()
            if (r5 >= r1) goto L_0x00c4
            java.lang.String r5 = "\\p{L}(\\b)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f10697q
            int r1 = r4.f10688h
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            r5.find()
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0024
            goto L_0x0062
        L_0x00c4:
            if (r6 != 0) goto L_0x0108
            int r5 = r4.f10688h
            if (r5 <= 0) goto L_0x0108
            java.lang.String r5 = "(?s:.*)(\\b)\\p{L}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = r4.f10697q
            int r1 = r4.f10688h
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x0108
            goto L_0x008f
        L_0x00e9:
            if (r6 == 0) goto L_0x00fd
            int r5 = r4.f10688h
            java.lang.String r1 = r4.f10697q
            int r1 = r1.length()
            if (r5 >= r1) goto L_0x00fd
            io.flutter.view.c.l.m(r4, r0)
            goto L_0x0108
        L_0x00fd:
            if (r6 != 0) goto L_0x0108
            int r5 = r4.f10688h
            if (r5 <= 0) goto L_0x0108
            io.flutter.view.c.l.n(r4, r0)
        L_0x0108:
            if (r7 != 0) goto L_0x0111
            int r5 = r4.f10688h
            int unused = r4.f10687g = r5
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.P(io.flutter.view.c$l, int, boolean, boolean):void");
    }

    /* access modifiers changed from: private */
    public void S(AccessibilityEvent accessibilityEvent) {
        if (this.f10645c.isEnabled()) {
            this.f10643a.getParent().requestSendAccessibilityEvent(this.f10643a, accessibilityEvent);
        }
    }

    /* access modifiers changed from: private */
    public void T() {
        this.f10644b.f(this.f10654l);
    }

    private void U(int i10) {
        AccessibilityEvent H = H(i10, 2048);
        H.setContentChangeTypes(1);
        S(H);
    }

    @TargetApi(28)
    private void V(String str) {
        this.f10643a.setAccessibilityPaneTitle(str);
    }

    /* access modifiers changed from: private */
    public void W(boolean z9) {
        if (this.f10662t != z9) {
            this.f10662t = z9;
            this.f10654l = z9 ? this.f10654l | f.ACCESSIBLE_NAVIGATION.value : this.f10654l & (~f.ACCESSIBLE_NAVIGATION.value);
            T();
        }
    }

    @TargetApi(31)
    private void X() {
        View view = this.f10643a;
        if (view != null && view.getResources() != null) {
            int i10 = this.f10643a.getResources().getConfiguration().fontWeightAdjustment;
            this.f10654l = i10 != Integer.MAX_VALUE && i10 >= 300 ? this.f10654l | f.BOLD_TEXT.value : this.f10654l & f.BOLD_TEXT.value;
            T();
        }
    }

    private boolean Z(l lVar) {
        return lVar.f10690j > 0 && (l.A0(this.f10651i, new a(lVar)) || !l.A0(this.f10651i, b.f10641a));
    }

    @TargetApi(19)
    private void c0(l lVar) {
        View c10;
        Integer num;
        l unused = lVar.Q = null;
        if (!(lVar.f10689i == -1 || (num = this.f10652j) == null || this.f10646d.platformViewOfNode(num.intValue()) != this.f10647e.c(lVar.f10689i))) {
            R(this.f10652j.intValue(), 65536);
            this.f10652j = null;
        }
        if (!(lVar.f10689i == -1 || (c10 = this.f10647e.c(lVar.f10689i)) == null)) {
            c10.setImportantForAccessibility(4);
        }
        l lVar2 = this.f10651i;
        if (lVar2 == lVar) {
            R(lVar2.f10682b, 65536);
            this.f10651i = null;
        }
        if (this.f10655m == lVar) {
            this.f10655m = null;
        }
        if (this.f10657o == lVar) {
            this.f10657o = null;
        }
    }

    static /* synthetic */ int e(c cVar, int i10) {
        int i11 = i10 & cVar.f10654l;
        cVar.f10654l = i11;
        return i11;
    }

    static /* synthetic */ int f(c cVar, int i10) {
        int i11 = i10 | cVar.f10654l;
        cVar.f10654l = i11;
        return i11;
    }

    private AccessibilityEvent u(int i10, String str, String str2) {
        AccessibilityEvent H = H(i10, 16);
        H.setBeforeText(str);
        H.getText().add(str2);
        int i11 = 0;
        while (i11 < str.length() && i11 < str2.length() && str.charAt(i11) == str2.charAt(i11)) {
            i11++;
        }
        if (i11 >= str.length() && i11 >= str2.length()) {
            return null;
        }
        H.setFromIndex(i11);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i11 && length2 >= i11 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        H.setRemovedCount((length - i11) + 1);
        H.setAddedCount((length2 - i11) + 1);
        return H;
    }

    @TargetApi(28)
    private boolean v() {
        Activity f10 = d8.h.f(this.f10643a.getContext());
        if (f10 == null || f10.getWindow() == null) {
            return false;
        }
        int i10 = f10.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i10 == 2 || i10 == 0;
    }

    private Rect x(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f10643a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* access modifiers changed from: private */
    public h y(int i10) {
        h hVar = this.f10650h.get(Integer.valueOf(i10));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        int unused = hVar2.f10675b = i10;
        int unused2 = hVar2.f10674a = B + i10;
        this.f10650h.put(Integer.valueOf(i10), hVar2);
        return hVar2;
    }

    /* access modifiers changed from: private */
    public l z(int i10) {
        l lVar = this.f10649g.get(Integer.valueOf(i10));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        int unused = lVar2.f10682b = i10;
        this.f10649g.put(Integer.valueOf(i10), lVar2);
        return lVar2;
    }

    public boolean C() {
        return this.f10645c.isEnabled();
    }

    public boolean D() {
        return this.f10645c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent G(int i10) {
        return AccessibilityEvent.obtain(i10);
    }

    public AccessibilityNodeInfo I(View view, int i10) {
        return AccessibilityNodeInfo.obtain(view, i10);
    }

    public boolean J(MotionEvent motionEvent) {
        return K(motionEvent, false);
    }

    public boolean K(MotionEvent motionEvent, boolean z9) {
        if (!this.f10645c.isTouchExplorationEnabled() || this.f10649g.isEmpty()) {
            return false;
        }
        l J = A().w0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z9);
        if (J == null || J.f10689i == -1) {
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                B(motionEvent.getX(), motionEvent.getY(), z9);
            } else if (motionEvent.getAction() == 10) {
                L();
            } else {
                x6.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            return true;
        } else if (z9) {
            return false;
        } else {
            return this.f10646d.onAccessibilityHoverEvent(J.f10682b, motionEvent);
        }
    }

    public void Q() {
        this.f10663u = true;
        this.f10647e.d();
        Y((k) null);
        this.f10645c.removeAccessibilityStateChangeListener(this.f10665w);
        this.f10645c.removeTouchExplorationStateChangeListener(this.f10666x);
        this.f10648f.unregisterContentObserver(this.f10667y);
        this.f10644b.g((a.b) null);
    }

    public void R(int i10, int i11) {
        if (this.f10645c.isEnabled()) {
            S(H(i10, i11));
        }
    }

    public void Y(k kVar) {
        this.f10661s = kVar;
    }

    /* access modifiers changed from: package-private */
    public void a0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h y9 = y(byteBuffer.getInt());
            int unused = y9.f10676c = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            String str = null;
            String unused2 = y9.f10677d = i10 == -1 ? null : strArr[i10];
            int i11 = byteBuffer.getInt();
            if (i11 != -1) {
                str = strArr[i11];
            }
            String unused3 = y9.f10678e = str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: io.flutter.view.c$l} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b0(java.nio.ByteBuffer r9, java.lang.String[] r10, java.nio.ByteBuffer[] r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.hasRemaining()
            r2 = 0
            if (r1 == 0) goto L_0x0056
            int r1 = r9.getInt()
            io.flutter.view.c$l r1 = r8.z(r1)
            r1.D0(r9, r10, r11)
            io.flutter.view.c$i r3 = io.flutter.view.c.i.IS_HIDDEN
            boolean r3 = r1.v0(r3)
            if (r3 == 0) goto L_0x0020
            goto L_0x0005
        L_0x0020:
            io.flutter.view.c$i r3 = io.flutter.view.c.i.IS_FOCUSED
            boolean r3 = r1.v0(r3)
            if (r3 == 0) goto L_0x002a
            r8.f10655m = r1
        L_0x002a:
            boolean r3 = r1.B
            if (r3 == 0) goto L_0x0033
            r0.add(r1)
        L_0x0033:
            int r3 = r1.f10689i
            r4 = -1
            if (r3 == r4) goto L_0x0005
            io.flutter.plugin.platform.k r3 = r8.f10647e
            int r4 = r1.f10689i
            boolean r3 = r3.b(r4)
            if (r3 != 0) goto L_0x0005
            io.flutter.plugin.platform.k r3 = r8.f10647e
            int r1 = r1.f10689i
            android.view.View r1 = r3.c(r1)
            if (r1 == 0) goto L_0x0005
            r1.setImportantForAccessibility(r2)
            goto L_0x0005
        L_0x0056:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            io.flutter.view.c$l r10 = r8.A()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 1
            if (r10 == 0) goto L_0x00b7
            r3 = 16
            float[] r3 = new float[r3]
            android.opengl.Matrix.setIdentityM(r3, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x00b1
            r5 = 28
            if (r4 < r5) goto L_0x007d
            boolean r4 = r8.v()
            goto L_0x007e
        L_0x007d:
            r4 = 1
        L_0x007e:
            if (r4 == 0) goto L_0x00b1
            android.view.View r4 = r8.f10643a
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            if (r4 == 0) goto L_0x00b1
            java.lang.Integer r5 = r8.f10660r
            int r6 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x009e
            boolean unused = r10.Y = r1
            boolean unused = r10.W = r1
        L_0x009e:
            int r4 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.f10660r = r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r5 = 0
            android.opengl.Matrix.translateM(r3, r2, r4, r5, r5)
        L_0x00b1:
            r10.C0(r3, r9, r2)
            r10.e0(r11)
        L_0x00b7:
            java.util.Iterator r10 = r11.iterator()
            r3 = 0
            r4 = r3
        L_0x00bd:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r10.next()
            io.flutter.view.c$l r5 = (io.flutter.view.c.l) r5
            java.util.List<java.lang.Integer> r6 = r8.f10658p
            int r7 = r5.f10682b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00bd
            r4 = r5
            goto L_0x00bd
        L_0x00db:
            if (r4 != 0) goto L_0x00ef
            int r10 = r11.size()
            if (r10 <= 0) goto L_0x00ef
            int r10 = r11.size()
            int r10 = r10 - r1
            java.lang.Object r10 = r11.get(r10)
            r4 = r10
            io.flutter.view.c$l r4 = (io.flutter.view.c.l) r4
        L_0x00ef:
            if (r4 == 0) goto L_0x010e
            int r10 = r4.f10682b
            int r5 = r8.f10659q
            if (r10 != r5) goto L_0x0105
            int r10 = r11.size()
            java.util.List<java.lang.Integer> r5 = r8.f10658p
            int r5 = r5.size()
            if (r10 == r5) goto L_0x010e
        L_0x0105:
            int r10 = r4.f10682b
            r8.f10659q = r10
            r8.M(r4)
        L_0x010e:
            java.util.List<java.lang.Integer> r10 = r8.f10658p
            r10.clear()
            java.util.Iterator r10 = r11.iterator()
        L_0x0117:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0131
            java.lang.Object r11 = r10.next()
            io.flutter.view.c$l r11 = (io.flutter.view.c.l) r11
            java.util.List<java.lang.Integer> r4 = r8.f10658p
            int r11 = r11.f10682b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4.add(r11)
            goto L_0x0117
        L_0x0131:
            java.util.Map<java.lang.Integer, io.flutter.view.c$l> r10 = r8.f10649g
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x013b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x015a
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            io.flutter.view.c$l r11 = (io.flutter.view.c.l) r11
            boolean r4 = r9.contains(r11)
            if (r4 != 0) goto L_0x013b
            r8.c0(r11)
            r10.remove()
            goto L_0x013b
        L_0x015a:
            r8.U(r2)
            java.util.Iterator r9 = r0.iterator()
        L_0x0161:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0340
            java.lang.Object r10 = r9.next()
            io.flutter.view.c$l r10 = (io.flutter.view.c.l) r10
            boolean r11 = r10.h0()
            if (r11 == 0) goto L_0x0232
            int r11 = r10.f10682b
            r0 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r11 = r8.H(r11, r0)
            float r0 = r10.f10692l
            float r4 = r10.f10693m
            float r5 = r10.f10693m
            boolean r5 = java.lang.Float.isInfinite(r5)
            r6 = 1200142336(0x4788b800, float:70000.0)
            r7 = 1203982336(0x47c35000, float:100000.0)
            if (r5 == 0) goto L_0x019f
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x019c
            r0 = 1200142336(0x4788b800, float:70000.0)
        L_0x019c:
            r4 = 1203982336(0x47c35000, float:100000.0)
        L_0x019f:
            float r5 = r10.f10694n
            boolean r5 = java.lang.Float.isInfinite(r5)
            if (r5 == 0) goto L_0x01b6
            float r4 = r4 + r7
            r5 = -947341312(0xffffffffc788b800, float:-70000.0)
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x01b4
            r0 = -947341312(0xffffffffc788b800, float:-70000.0)
        L_0x01b4:
            float r0 = r0 + r7
            goto L_0x01c0
        L_0x01b6:
            float r5 = r10.f10694n
            float r4 = r4 - r5
            float r5 = r10.f10694n
            float r0 = r0 - r5
        L_0x01c0:
            io.flutter.view.c$g r5 = io.flutter.view.c.g.SCROLL_UP
            boolean r5 = r10.s0(r5)
            if (r5 != 0) goto L_0x01ea
            io.flutter.view.c$g r5 = io.flutter.view.c.g.SCROLL_DOWN
            boolean r5 = r10.s0(r5)
            if (r5 == 0) goto L_0x01d1
            goto L_0x01ea
        L_0x01d1:
            io.flutter.view.c$g r5 = io.flutter.view.c.g.SCROLL_LEFT
            boolean r5 = r10.s0(r5)
            if (r5 != 0) goto L_0x01e1
            io.flutter.view.c$g r5 = io.flutter.view.c.g.SCROLL_RIGHT
            boolean r5 = r10.s0(r5)
            if (r5 == 0) goto L_0x01f2
        L_0x01e1:
            int r0 = (int) r0
            r11.setScrollX(r0)
            int r0 = (int) r4
            r11.setMaxScrollX(r0)
            goto L_0x01f2
        L_0x01ea:
            int r0 = (int) r0
            r11.setScrollY(r0)
            int r0 = (int) r4
            r11.setMaxScrollY(r0)
        L_0x01f2:
            int r0 = r10.f10690j
            if (r0 <= 0) goto L_0x022f
            int r0 = r10.f10690j
            r11.setItemCount(r0)
            int r0 = r10.f10691k
            r11.setFromIndex(r0)
            java.util.List r0 = r10.S
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x020f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0226
            java.lang.Object r5 = r0.next()
            io.flutter.view.c$l r5 = (io.flutter.view.c.l) r5
            io.flutter.view.c$i r6 = io.flutter.view.c.i.IS_HIDDEN
            boolean r5 = r5.v0(r6)
            if (r5 != 0) goto L_0x020f
            int r4 = r4 + 1
            goto L_0x020f
        L_0x0226:
            int r0 = r10.f10691k
            int r0 = r0 + r4
            int r0 = r0 - r1
            r11.setToIndex(r0)
        L_0x022f:
            r8.S(r11)
        L_0x0232:
            io.flutter.view.c$i r11 = io.flutter.view.c.i.IS_LIVE_REGION
            boolean r11 = r10.v0(r11)
            if (r11 == 0) goto L_0x0247
            boolean r11 = r10.g0()
            if (r11 == 0) goto L_0x0247
            int r11 = r10.f10682b
            r8.U(r11)
        L_0x0247:
            io.flutter.view.c$l r11 = r8.f10651i
            if (r11 == 0) goto L_0x027a
            int r11 = r11.f10682b
            int r0 = r10.f10682b
            if (r11 != r0) goto L_0x027a
            io.flutter.view.c$i r11 = io.flutter.view.c.i.IS_SELECTED
            boolean r0 = r10.t0(r11)
            if (r0 != 0) goto L_0x027a
            boolean r11 = r10.v0(r11)
            if (r11 == 0) goto L_0x027a
            int r11 = r10.f10682b
            r0 = 4
            android.view.accessibility.AccessibilityEvent r11 = r8.H(r11, r0)
            java.util.List r0 = r11.getText()
            java.lang.String r4 = r10.f10695o
            r0.add(r4)
            r8.S(r11)
        L_0x027a:
            io.flutter.view.c$l r11 = r8.f10655m
            if (r11 == 0) goto L_0x02aa
            int r11 = r11.f10682b
            int r0 = r10.f10682b
            if (r11 != r0) goto L_0x02aa
            io.flutter.view.c$l r11 = r8.f10656n
            if (r11 == 0) goto L_0x0298
            int r11 = r11.f10682b
            io.flutter.view.c$l r0 = r8.f10655m
            int r0 = r0.f10682b
            if (r11 == r0) goto L_0x02aa
        L_0x0298:
            io.flutter.view.c$l r11 = r8.f10655m
            r8.f10656n = r11
            int r11 = r10.f10682b
            r0 = 8
            android.view.accessibility.AccessibilityEvent r11 = r8.H(r11, r0)
            r8.S(r11)
            goto L_0x02b0
        L_0x02aa:
            io.flutter.view.c$l r11 = r8.f10655m
            if (r11 != 0) goto L_0x02b0
            r8.f10656n = r3
        L_0x02b0:
            io.flutter.view.c$l r11 = r8.f10655m
            if (r11 == 0) goto L_0x0161
            int r11 = r11.f10682b
            int r0 = r10.f10682b
            if (r11 != r0) goto L_0x0161
            io.flutter.view.c$i r11 = io.flutter.view.c.i.IS_TEXT_FIELD
            boolean r0 = r10.t0(r11)
            if (r0 == 0) goto L_0x0161
            boolean r11 = r10.v0(r11)
            if (r11 == 0) goto L_0x0161
            io.flutter.view.c$l r11 = r8.f10651i
            if (r11 == 0) goto L_0x02dc
            int r11 = r11.f10682b
            io.flutter.view.c$l r0 = r8.f10655m
            int r0 = r0.f10682b
            if (r11 != r0) goto L_0x0161
        L_0x02dc:
            java.lang.String r11 = r10.J
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x02e9
            java.lang.String r11 = r10.J
            goto L_0x02ea
        L_0x02e9:
            r11 = r0
        L_0x02ea:
            java.lang.String r4 = r10.f10697q
            if (r4 == 0) goto L_0x02f4
            java.lang.String r0 = r10.f10697q
        L_0x02f4:
            int r4 = r10.f10682b
            android.view.accessibility.AccessibilityEvent r11 = r8.u(r4, r11, r0)
            if (r11 == 0) goto L_0x0301
            r8.S(r11)
        L_0x0301:
            int r11 = r10.E
            int r4 = r10.f10687g
            if (r11 != r4) goto L_0x0315
            int r11 = r10.F
            int r4 = r10.f10688h
            if (r11 == r4) goto L_0x0161
        L_0x0315:
            int r11 = r10.f10682b
            r4 = 8192(0x2000, float:1.14794E-41)
            android.view.accessibility.AccessibilityEvent r11 = r8.H(r11, r4)
            java.util.List r4 = r11.getText()
            r4.add(r0)
            int r4 = r10.f10687g
            r11.setFromIndex(r4)
            int r10 = r10.f10688h
            r11.setToIndex(r10)
            int r10 = r0.length()
            r11.setItemCount(r10)
            r8.S(r11)
            goto L_0x0161
        L_0x0340:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.b0(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:212:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0454  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r14) {
        /*
            r13 = this;
            r0 = 1
            r13.W(r0)
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r14 < r1) goto L_0x000f
            io.flutter.view.AccessibilityViewEmbedder r0 = r13.f10646d
            android.view.accessibility.AccessibilityNodeInfo r14 = r0.createAccessibilityNodeInfo(r14)
            return r14
        L_0x000f:
            r2 = -1
            r3 = 0
            if (r14 != r2) goto L_0x0030
            android.view.View r14 = r13.f10643a
            android.view.accessibility.AccessibilityNodeInfo r14 = android.view.accessibility.AccessibilityNodeInfo.obtain(r14)
            android.view.View r0 = r13.f10643a
            r0.onInitializeAccessibilityNodeInfo(r14)
            java.util.Map<java.lang.Integer, io.flutter.view.c$l> r0 = r13.f10649g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x002f
            android.view.View r0 = r13.f10643a
            r14.addChild(r0, r3)
        L_0x002f:
            return r14
        L_0x0030:
            java.util.Map<java.lang.Integer, io.flutter.view.c$l> r4 = r13.f10649g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            java.lang.Object r4 = r4.get(r5)
            io.flutter.view.c$l r4 = (io.flutter.view.c.l) r4
            r5 = 0
            if (r4 != 0) goto L_0x0040
            return r5
        L_0x0040:
            int r6 = r4.f10689i
            if (r6 == r2) goto L_0x006e
            io.flutter.plugin.platform.k r6 = r13.f10647e
            int r7 = r4.f10689i
            boolean r6 = r6.b(r7)
            if (r6 == 0) goto L_0x006e
            io.flutter.plugin.platform.k r14 = r13.f10647e
            int r0 = r4.f10689i
            android.view.View r14 = r14.c(r0)
            if (r14 != 0) goto L_0x005f
            return r5
        L_0x005f:
            android.graphics.Rect r0 = r4.k0()
            io.flutter.view.AccessibilityViewEmbedder r1 = r13.f10646d
            int r2 = r4.f10682b
            android.view.accessibility.AccessibilityNodeInfo r14 = r1.getRootNode(r14, r2, r0)
            return r14
        L_0x006e:
            android.view.View r5 = r13.f10643a
            android.view.accessibility.AccessibilityNodeInfo r5 = r13.I(r5, r14)
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = ""
            r5.setViewIdResourceName(r7)
            android.view.View r8 = r13.f10643a
            android.content.Context r8 = r8.getContext()
            java.lang.String r8 = r8.getPackageName()
            r5.setPackageName(r8)
            java.lang.String r8 = "android.view.View"
            r5.setClassName(r8)
            android.view.View r8 = r13.f10643a
            r5.setSource(r8, r14)
            boolean r8 = r4.x0()
            r5.setFocusable(r8)
            io.flutter.view.c$l r8 = r13.f10655m
            if (r8 == 0) goto L_0x00a9
            int r8 = r8.f10682b
            if (r8 != r14) goto L_0x00a5
            r8 = 1
            goto L_0x00a6
        L_0x00a5:
            r8 = 0
        L_0x00a6:
            r5.setFocused(r8)
        L_0x00a9:
            io.flutter.view.c$l r8 = r13.f10651i
            if (r8 == 0) goto L_0x00b9
            int r8 = r8.f10682b
            if (r8 != r14) goto L_0x00b5
            r8 = 1
            goto L_0x00b6
        L_0x00b5:
            r8 = 0
        L_0x00b6:
            r5.setAccessibilityFocused(r8)
        L_0x00b9:
            io.flutter.view.c$i r8 = io.flutter.view.c.i.IS_TEXT_FIELD
            boolean r9 = r4.v0(r8)
            if (r9 == 0) goto L_0x0168
            io.flutter.view.c$i r9 = io.flutter.view.c.i.IS_OBSCURED
            boolean r9 = r4.v0(r9)
            r5.setPassword(r9)
            io.flutter.view.c$i r9 = io.flutter.view.c.i.IS_READ_ONLY
            boolean r10 = r4.v0(r9)
            if (r10 != 0) goto L_0x00d7
            java.lang.String r10 = "android.widget.EditText"
            r5.setClassName(r10)
        L_0x00d7:
            boolean r9 = r4.v0(r9)
            r9 = r9 ^ r0
            r5.setEditable(r9)
            int r9 = r4.f10687g
            if (r9 == r2) goto L_0x00f6
            int r9 = r4.f10688h
            if (r9 == r2) goto L_0x00f6
            int r9 = r4.f10687g
            int r10 = r4.f10688h
            r5.setTextSelection(r9, r10)
        L_0x00f6:
            io.flutter.view.c$l r9 = r13.f10651i
            if (r9 == 0) goto L_0x0103
            int r9 = r9.f10682b
            if (r9 != r14) goto L_0x0103
            r5.setLiveRegion(r0)
        L_0x0103:
            io.flutter.view.c$g r9 = io.flutter.view.c.g.MOVE_CURSOR_FORWARD_BY_CHARACTER
            boolean r9 = r4.u0(r9)
            r10 = 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0112
            r5.addAction(r10)
            r9 = 1
            goto L_0x0113
        L_0x0112:
            r9 = 0
        L_0x0113:
            io.flutter.view.c$g r11 = io.flutter.view.c.g.MOVE_CURSOR_BACKWARD_BY_CHARACTER
            boolean r11 = r4.u0(r11)
            r12 = 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0122
            r5.addAction(r12)
            r9 = r9 | 1
        L_0x0122:
            io.flutter.view.c$g r11 = io.flutter.view.c.g.MOVE_CURSOR_FORWARD_BY_WORD
            boolean r11 = r4.u0(r11)
            if (r11 == 0) goto L_0x012f
            r5.addAction(r10)
            r9 = r9 | 2
        L_0x012f:
            io.flutter.view.c$g r10 = io.flutter.view.c.g.MOVE_CURSOR_BACKWARD_BY_WORD
            boolean r10 = r4.u0(r10)
            if (r10 == 0) goto L_0x013c
            r5.addAction(r12)
            r9 = r9 | 2
        L_0x013c:
            r5.setMovementGranularities(r9)
            int r9 = r4.f10685e
            if (r9 < 0) goto L_0x0168
            java.lang.String r9 = r4.f10697q
            if (r9 != 0) goto L_0x014d
            r9 = 0
            goto L_0x0155
        L_0x014d:
            java.lang.String r9 = r4.f10697q
            int r9 = r9.length()
        L_0x0155:
            int unused = r4.f10686f
            int unused = r4.f10685e
            int r10 = r4.f10686f
            int r9 = r9 - r10
            int r10 = r4.f10685e
            int r9 = r9 + r10
            r5.setMaxTextLength(r9)
        L_0x0168:
            io.flutter.view.c$g r9 = io.flutter.view.c.g.SET_SELECTION
            boolean r9 = r4.u0(r9)
            if (r9 == 0) goto L_0x0175
            r9 = 131072(0x20000, float:1.83671E-40)
            r5.addAction(r9)
        L_0x0175:
            io.flutter.view.c$g r9 = io.flutter.view.c.g.COPY
            boolean r9 = r4.u0(r9)
            if (r9 == 0) goto L_0x0182
            r9 = 16384(0x4000, float:2.2959E-41)
            r5.addAction(r9)
        L_0x0182:
            io.flutter.view.c$g r9 = io.flutter.view.c.g.CUT
            boolean r9 = r4.u0(r9)
            if (r9 == 0) goto L_0x018d
            r5.addAction(r1)
        L_0x018d:
            io.flutter.view.c$g r1 = io.flutter.view.c.g.PASTE
            boolean r1 = r4.u0(r1)
            if (r1 == 0) goto L_0x019b
            r1 = 32768(0x8000, float:4.5918E-41)
            r5.addAction(r1)
        L_0x019b:
            io.flutter.view.c$g r1 = io.flutter.view.c.g.SET_TEXT
            boolean r1 = r4.u0(r1)
            if (r1 == 0) goto L_0x01a8
            r1 = 2097152(0x200000, float:2.938736E-39)
            r5.addAction(r1)
        L_0x01a8:
            io.flutter.view.c$i r1 = io.flutter.view.c.i.IS_BUTTON
            boolean r1 = r4.v0(r1)
            if (r1 != 0) goto L_0x01b8
            io.flutter.view.c$i r1 = io.flutter.view.c.i.IS_LINK
            boolean r1 = r4.v0(r1)
            if (r1 == 0) goto L_0x01bd
        L_0x01b8:
            java.lang.String r1 = "android.widget.Button"
            r5.setClassName(r1)
        L_0x01bd:
            io.flutter.view.c$i r1 = io.flutter.view.c.i.IS_IMAGE
            boolean r1 = r4.v0(r1)
            if (r1 == 0) goto L_0x01ca
            java.lang.String r1 = "android.widget.ImageView"
            r5.setClassName(r1)
        L_0x01ca:
            io.flutter.view.c$g r1 = io.flutter.view.c.g.DISMISS
            boolean r1 = r4.u0(r1)
            if (r1 == 0) goto L_0x01da
            r5.setDismissable(r0)
            r1 = 1048576(0x100000, float:1.469368E-39)
            r5.addAction(r1)
        L_0x01da:
            io.flutter.view.c$l r1 = r4.Q
            if (r1 == 0) goto L_0x01ee
            android.view.View r1 = r13.f10643a
            io.flutter.view.c$l r9 = r4.Q
            int r9 = r9.f10682b
            r5.setParent(r1, r9)
            goto L_0x01f3
        L_0x01ee:
            android.view.View r1 = r13.f10643a
            r5.setParent(r1)
        L_0x01f3:
            int r1 = r4.f10706z
            if (r1 == r2) goto L_0x0206
            r1 = 22
            if (r6 < r1) goto L_0x0206
            android.view.View r1 = r13.f10643a
            int r9 = r4.f10706z
            r5.setTraversalAfter(r1, r9)
        L_0x0206:
            android.graphics.Rect r1 = r4.k0()
            io.flutter.view.c$l r9 = r4.Q
            if (r9 == 0) goto L_0x022a
            io.flutter.view.c$l r9 = r4.Q
            android.graphics.Rect r9 = r9.k0()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r1)
            int r11 = r9.left
            int r11 = -r11
            int r9 = r9.top
            int r9 = -r9
            r10.offset(r11, r9)
            r5.setBoundsInParent(r10)
            goto L_0x022d
        L_0x022a:
            r5.setBoundsInParent(r1)
        L_0x022d:
            android.graphics.Rect r1 = r13.x(r1)
            r5.setBoundsInScreen(r1)
            r5.setVisibleToUser(r0)
            io.flutter.view.c$i r1 = io.flutter.view.c.i.HAS_ENABLED_STATE
            boolean r1 = r4.v0(r1)
            if (r1 == 0) goto L_0x024a
            io.flutter.view.c$i r1 = io.flutter.view.c.i.IS_ENABLED
            boolean r1 = r4.v0(r1)
            if (r1 == 0) goto L_0x0248
            goto L_0x024a
        L_0x0248:
            r1 = 0
            goto L_0x024b
        L_0x024a:
            r1 = 1
        L_0x024b:
            r5.setEnabled(r1)
            io.flutter.view.c$g r1 = io.flutter.view.c.g.TAP
            boolean r1 = r4.u0(r1)
            if (r1 == 0) goto L_0x0275
            io.flutter.view.c$h r1 = r4.U
            r9 = 16
            if (r1 == 0) goto L_0x026f
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            io.flutter.view.c$h r10 = r4.U
            java.lang.String r10 = r10.f10678e
            r1.<init>(r9, r10)
            r5.addAction(r1)
            goto L_0x0272
        L_0x026f:
            r5.addAction(r9)
        L_0x0272:
            r5.setClickable(r0)
        L_0x0275:
            io.flutter.view.c$g r1 = io.flutter.view.c.g.LONG_PRESS
            boolean r1 = r4.u0(r1)
            if (r1 == 0) goto L_0x029c
            io.flutter.view.c$h r1 = r4.V
            r9 = 32
            if (r1 == 0) goto L_0x0296
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            io.flutter.view.c$h r10 = r4.V
            java.lang.String r10 = r10.f10678e
            r1.<init>(r9, r10)
            r5.addAction(r1)
            goto L_0x0299
        L_0x0296:
            r5.addAction(r9)
        L_0x0299:
            r5.setLongClickable(r0)
        L_0x029c:
            io.flutter.view.c$g r1 = io.flutter.view.c.g.SCROLL_LEFT
            boolean r9 = r4.u0(r1)
            r10 = 8192(0x2000, float:1.14794E-41)
            r11 = 4096(0x1000, float:5.74E-42)
            if (r9 != 0) goto L_0x02c0
            io.flutter.view.c$g r9 = io.flutter.view.c.g.SCROLL_UP
            boolean r9 = r4.u0(r9)
            if (r9 != 0) goto L_0x02c0
            io.flutter.view.c$g r9 = io.flutter.view.c.g.SCROLL_RIGHT
            boolean r9 = r4.u0(r9)
            if (r9 != 0) goto L_0x02c0
            io.flutter.view.c$g r9 = io.flutter.view.c.g.SCROLL_DOWN
            boolean r9 = r4.u0(r9)
            if (r9 == 0) goto L_0x0327
        L_0x02c0:
            r5.setScrollable(r0)
            io.flutter.view.c$i r9 = io.flutter.view.c.i.HAS_IMPLICIT_SCROLLING
            boolean r9 = r4.v0(r9)
            if (r9 == 0) goto L_0x0303
            boolean r9 = r4.u0(r1)
            if (r9 != 0) goto L_0x02ec
            io.flutter.view.c$g r9 = io.flutter.view.c.g.SCROLL_RIGHT
            boolean r9 = r4.u0(r9)
            if (r9 == 0) goto L_0x02da
            goto L_0x02ec
        L_0x02da:
            boolean r9 = r13.Z(r4)
            if (r9 == 0) goto L_0x02e9
            int r9 = r4.f10690j
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r9 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r9, r3, r3)
            goto L_0x02fa
        L_0x02e9:
            java.lang.String r9 = "android.widget.ScrollView"
            goto L_0x0300
        L_0x02ec:
            boolean r9 = r13.Z(r4)
            if (r9 == 0) goto L_0x02fe
            int r9 = r4.f10690j
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r9 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r3, r9, r3)
        L_0x02fa:
            r5.setCollectionInfo(r9)
            goto L_0x0303
        L_0x02fe:
            java.lang.String r9 = "android.widget.HorizontalScrollView"
        L_0x0300:
            r5.setClassName(r9)
        L_0x0303:
            boolean r1 = r4.u0(r1)
            if (r1 != 0) goto L_0x0311
            io.flutter.view.c$g r1 = io.flutter.view.c.g.SCROLL_UP
            boolean r1 = r4.u0(r1)
            if (r1 == 0) goto L_0x0314
        L_0x0311:
            r5.addAction(r11)
        L_0x0314:
            io.flutter.view.c$g r1 = io.flutter.view.c.g.SCROLL_RIGHT
            boolean r1 = r4.u0(r1)
            if (r1 != 0) goto L_0x0324
            io.flutter.view.c$g r1 = io.flutter.view.c.g.SCROLL_DOWN
            boolean r1 = r4.u0(r1)
            if (r1 == 0) goto L_0x0327
        L_0x0324:
            r5.addAction(r10)
        L_0x0327:
            io.flutter.view.c$g r1 = io.flutter.view.c.g.INCREASE
            boolean r9 = r4.u0(r1)
            if (r9 != 0) goto L_0x0337
            io.flutter.view.c$g r9 = io.flutter.view.c.g.DECREASE
            boolean r9 = r4.u0(r9)
            if (r9 == 0) goto L_0x0350
        L_0x0337:
            java.lang.String r9 = "android.widget.SeekBar"
            r5.setClassName(r9)
            boolean r1 = r4.u0(r1)
            if (r1 == 0) goto L_0x0345
            r5.addAction(r11)
        L_0x0345:
            io.flutter.view.c$g r1 = io.flutter.view.c.g.DECREASE
            boolean r1 = r4.u0(r1)
            if (r1 == 0) goto L_0x0350
            r5.addAction(r10)
        L_0x0350:
            io.flutter.view.c$i r1 = io.flutter.view.c.i.IS_LIVE_REGION
            boolean r1 = r4.v0(r1)
            if (r1 == 0) goto L_0x035b
            r5.setLiveRegion(r0)
        L_0x035b:
            boolean r1 = r4.v0(r8)
            r8 = 28
            if (r1 == 0) goto L_0x0374
            java.lang.CharSequence r1 = r4.q0()
            r5.setText(r1)
            if (r6 < r8) goto L_0x03a8
            java.lang.CharSequence r1 = r4.p0()
            r5.setHintText(r1)
            goto L_0x03a8
        L_0x0374:
            io.flutter.view.c$i r1 = io.flutter.view.c.i.SCOPES_ROUTE
            boolean r1 = r4.v0(r1)
            if (r1 != 0) goto L_0x03a8
            java.lang.CharSequence r1 = r4.r0()
            if (r6 >= r8) goto L_0x03a3
            java.lang.String r9 = r4.f10705y
            if (r9 == 0) goto L_0x03a3
            if (r1 == 0) goto L_0x038b
            r7 = r1
        L_0x038b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r7 = "\n"
            r1.append(r7)
            java.lang.String r7 = r4.f10705y
            r1.append(r7)
            java.lang.String r1 = r1.toString()
        L_0x03a3:
            if (r1 == 0) goto L_0x03a8
            r5.setContentDescription(r1)
        L_0x03a8:
            if (r6 < r8) goto L_0x03b7
            java.lang.String r1 = r4.f10705y
            if (r1 == 0) goto L_0x03b7
            java.lang.String r1 = r4.f10705y
            r5.setTooltipText(r1)
        L_0x03b7:
            io.flutter.view.c$i r1 = io.flutter.view.c.i.HAS_CHECKED_STATE
            boolean r1 = r4.v0(r1)
            io.flutter.view.c$i r7 = io.flutter.view.c.i.HAS_TOGGLED_STATE
            boolean r7 = r4.v0(r7)
            if (r1 != 0) goto L_0x03c9
            if (r7 == 0) goto L_0x03c8
            goto L_0x03c9
        L_0x03c8:
            r0 = 0
        L_0x03c9:
            r5.setCheckable(r0)
            if (r1 == 0) goto L_0x03e5
            io.flutter.view.c$i r0 = io.flutter.view.c.i.IS_CHECKED
            boolean r0 = r4.v0(r0)
            r5.setChecked(r0)
            io.flutter.view.c$i r0 = io.flutter.view.c.i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP
            boolean r0 = r4.v0(r0)
            if (r0 == 0) goto L_0x03e2
            java.lang.String r0 = "android.widget.RadioButton"
            goto L_0x03f2
        L_0x03e2:
            java.lang.String r0 = "android.widget.CheckBox"
            goto L_0x03f2
        L_0x03e5:
            if (r7 == 0) goto L_0x03f5
            io.flutter.view.c$i r0 = io.flutter.view.c.i.IS_TOGGLED
            boolean r0 = r4.v0(r0)
            r5.setChecked(r0)
            java.lang.String r0 = "android.widget.Switch"
        L_0x03f2:
            r5.setClassName(r0)
        L_0x03f5:
            io.flutter.view.c$i r0 = io.flutter.view.c.i.IS_SELECTED
            boolean r0 = r4.v0(r0)
            r5.setSelected(r0)
            if (r6 < r8) goto L_0x0409
            io.flutter.view.c$i r0 = io.flutter.view.c.i.IS_HEADER
            boolean r0 = r4.v0(r0)
            r5.setHeading(r0)
        L_0x0409:
            io.flutter.view.c$l r0 = r13.f10651i
            if (r0 == 0) goto L_0x0416
            int r0 = r0.f10682b
            if (r0 != r14) goto L_0x0416
            r14 = 128(0x80, float:1.794E-43)
            goto L_0x0418
        L_0x0416:
            r14 = 64
        L_0x0418:
            r5.addAction(r14)
            java.util.List r14 = r4.T
            if (r14 == 0) goto L_0x0446
            java.util.List r14 = r4.T
            java.util.Iterator r14 = r14.iterator()
        L_0x0429:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0446
            java.lang.Object r0 = r14.next()
            io.flutter.view.c$h r0 = (io.flutter.view.c.h) r0
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r1 = new android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
            int r3 = r0.f10674a
            java.lang.String r0 = r0.f10677d
            r1.<init>(r3, r0)
            r5.addAction(r1)
            goto L_0x0429
        L_0x0446:
            java.util.List r14 = r4.R
            java.util.Iterator r14 = r14.iterator()
        L_0x044e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x048d
            java.lang.Object r0 = r14.next()
            io.flutter.view.c$l r0 = (io.flutter.view.c.l) r0
            io.flutter.view.c$i r1 = io.flutter.view.c.i.IS_HIDDEN
            boolean r1 = r0.v0(r1)
            if (r1 == 0) goto L_0x0463
            goto L_0x044e
        L_0x0463:
            int r1 = r0.f10689i
            if (r1 == r2) goto L_0x0483
            io.flutter.plugin.platform.k r1 = r13.f10647e
            int r3 = r0.f10689i
            android.view.View r1 = r1.c(r3)
            io.flutter.plugin.platform.k r3 = r13.f10647e
            int r4 = r0.f10689i
            boolean r3 = r3.b(r4)
            if (r3 != 0) goto L_0x0483
            r5.addChild(r1)
            goto L_0x044e
        L_0x0483:
            android.view.View r1 = r13.f10643a
            int r0 = r0.f10682b
            r5.addChild(r1, r0)
            goto L_0x044e
        L_0x048d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r2 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L_0x0007
            r0 = 2
            if (r2 == r0) goto L_0x001d
            goto L_0x0027
        L_0x0007:
            io.flutter.view.c$l r2 = r1.f10655m
            if (r2 == 0) goto L_0x0014
        L_0x000b:
            int r2 = r2.f10682b
        L_0x000f:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.createAccessibilityNodeInfo(r2)
            return r2
        L_0x0014:
            java.lang.Integer r2 = r1.f10653k
            if (r2 == 0) goto L_0x001d
        L_0x0018:
            int r2 = r2.intValue()
            goto L_0x000f
        L_0x001d:
            io.flutter.view.c$l r2 = r1.f10651i
            if (r2 == 0) goto L_0x0022
            goto L_0x000b
        L_0x0022:
            java.lang.Integer r2 = r1.f10652j
            if (r2 == 0) goto L_0x0027
            goto L_0x0018
        L_0x0027:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.findFocus(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    public boolean performAction(int i10, int i11, Bundle bundle) {
        int i12;
        if (i10 >= 65536) {
            boolean performAction = this.f10646d.performAction(i10, i11, bundle);
            if (performAction && i11 == 128) {
                this.f10652j = null;
            }
            return performAction;
        }
        l lVar = this.f10649g.get(Integer.valueOf(i10));
        boolean z9 = false;
        if (lVar == null) {
            return false;
        }
        switch (i11) {
            case 16:
                this.f10644b.b(i10, g.TAP);
                return true;
            case 32:
                this.f10644b.b(i10, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f10651i == null) {
                    this.f10643a.invalidate();
                }
                this.f10651i = lVar;
                this.f10644b.b(i10, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                R(i10, 32768);
                if (lVar.u0(g.INCREASE) || lVar.u0(g.DECREASE)) {
                    R(i10, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f10651i;
                if (lVar2 != null && lVar2.f10682b == i10) {
                    this.f10651i = null;
                }
                Integer num = this.f10652j;
                if (num != null && num.intValue() == i10) {
                    this.f10652j = null;
                }
                this.f10644b.b(i10, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                R(i10, 65536);
                return true;
            case 256:
                return N(lVar, i10, bundle, true);
            case 512:
                return N(lVar, i10, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (!lVar.u0(gVar)) {
                    gVar = g.SCROLL_LEFT;
                    if (!lVar.u0(gVar)) {
                        gVar = g.INCREASE;
                        if (!lVar.u0(gVar)) {
                            return false;
                        }
                        String unused = lVar.f10697q = lVar.f10699s;
                        List unused2 = lVar.f10698r = lVar.f10700t;
                        R(i10, 4);
                    }
                }
                this.f10644b.b(i10, gVar);
                return true;
            case 8192:
                g gVar2 = g.SCROLL_DOWN;
                if (!lVar.u0(gVar2)) {
                    gVar2 = g.SCROLL_RIGHT;
                    if (!lVar.u0(gVar2)) {
                        gVar2 = g.DECREASE;
                        if (!lVar.u0(gVar2)) {
                            return false;
                        }
                        String unused3 = lVar.f10697q = lVar.f10701u;
                        List unused4 = lVar.f10698r = lVar.f10702v;
                        R(i10, 4);
                    }
                }
                this.f10644b.b(i10, gVar2);
                return true;
            case 16384:
                this.f10644b.b(i10, g.COPY);
                return true;
            case 32768:
                this.f10644b.b(i10, g.PASTE);
                return true;
            case 65536:
                this.f10644b.b(i10, g.CUT);
                return true;
            case 131072:
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z9 = true;
                }
                if (z9) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i12 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put("base", Integer.valueOf(lVar.f10688h));
                    i12 = lVar.f10688h;
                }
                hashMap.put("extent", Integer.valueOf(i12));
                this.f10644b.c(i10, g.SET_SELECTION, hashMap);
                l lVar3 = this.f10649g.get(Integer.valueOf(i10));
                int unused5 = lVar3.f10687g = ((Integer) hashMap.get("base")).intValue();
                int unused6 = lVar3.f10688h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.f10644b.b(i10, g.DISMISS);
                return true;
            case 2097152:
                return O(lVar, i10, bundle);
            case 16908342:
                this.f10644b.b(i10, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = this.f10650h.get(Integer.valueOf(i11 - B));
                if (hVar == null) {
                    return false;
                }
                this.f10644b.c(i10, g.CUSTOM_ACTION, Integer.valueOf(hVar.f10675b));
                return true;
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public boolean w(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f10646d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f10646d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f10653k = recordFlutterId;
            this.f10655m = null;
            return true;
        } else if (eventType == 128) {
            this.f10657o = null;
            return true;
        } else if (eventType == 32768) {
            this.f10652j = recordFlutterId;
            this.f10651i = null;
            return true;
        } else if (eventType != 65536) {
            return true;
        } else {
            this.f10653k = null;
            this.f10652j = null;
            return true;
        }
    }
}
