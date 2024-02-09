package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.d;
import androidx.emoji2.text.l;
import java.util.Arrays;

final class g {

    /* renamed from: a  reason: collision with root package name */
    private final d.i f2187a;

    /* renamed from: b  reason: collision with root package name */
    private final l f2188b;

    /* renamed from: c  reason: collision with root package name */
    private d.C0043d f2189c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2190d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f2191e;

    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z9 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z9 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z9) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z9 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z9 = false;
                while (i11 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z9) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i11--;
                            i10 = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i11--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z9 = true;
                        }
                    } else if (z9) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    public static class b implements d.C0043d {

        /* renamed from: b  reason: collision with root package name */
        private static final ThreadLocal<StringBuilder> f2192b = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f2193a;

        b() {
            TextPaint textPaint = new TextPaint();
            this.f2193a = textPaint;
            textPaint.setTextSize(10.0f);
        }

        private static StringBuilder b() {
            ThreadLocal<StringBuilder> threadLocal = f2192b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 < 23 && i12 > i13) {
                return false;
            }
            StringBuilder b10 = b();
            b10.setLength(0);
            while (i10 < i11) {
                b10.append(charSequence.charAt(i10));
                i10++;
            }
            return androidx.core.graphics.c.a(this.f2193a, b10.toString());
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        private int f2194a = 1;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f2195b;

        /* renamed from: c  reason: collision with root package name */
        private l.a f2196c;

        /* renamed from: d  reason: collision with root package name */
        private l.a f2197d;

        /* renamed from: e  reason: collision with root package name */
        private int f2198e;

        /* renamed from: f  reason: collision with root package name */
        private int f2199f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f2200g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f2201h;

        c(l.a aVar, boolean z9, int[] iArr) {
            this.f2195b = aVar;
            this.f2196c = aVar;
            this.f2200g = z9;
            this.f2201h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f2194a = 1;
            this.f2196c = this.f2195b;
            this.f2199f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f2196c.b().j() || d(this.f2198e)) {
                return true;
            }
            if (this.f2200g) {
                if (this.f2201h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2201h, this.f2196c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int a(int i10) {
            l.a a10 = this.f2196c.a(i10);
            int i11 = 3;
            if (this.f2194a == 2) {
                if (a10 != null) {
                    this.f2196c = a10;
                    this.f2199f++;
                } else if (!f(i10)) {
                    if (!d(i10)) {
                        if (this.f2196c.b() != null && (this.f2199f != 1 || h())) {
                            this.f2197d = this.f2196c;
                            g();
                            this.f2198e = i10;
                            return i11;
                        }
                    }
                }
                i11 = 2;
                this.f2198e = i10;
                return i11;
            } else if (a10 != null) {
                this.f2194a = 2;
                this.f2196c = a10;
                this.f2199f = 1;
                i11 = 2;
                this.f2198e = i10;
                return i11;
            }
            i11 = g();
            this.f2198e = i10;
            return i11;
        }

        /* access modifiers changed from: package-private */
        public f b() {
            return this.f2196c.b();
        }

        /* access modifiers changed from: package-private */
        public f c() {
            return this.f2197d.b();
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.f2194a == 2 && this.f2196c.b() != null && (this.f2199f > 1 || h());
        }
    }

    g(l lVar, d.i iVar, d.C0043d dVar, boolean z9, int[] iArr) {
        this.f2187a = iVar;
        this.f2188b = lVar;
        this.f2189c = dVar;
        this.f2190d = z9;
        this.f2191e = iArr;
    }

    private void a(Spannable spannable, f fVar, int i10, int i11) {
        spannable.setSpan(this.f2187a.a(fVar), i10, i11, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z9) {
        h[] hVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (hVarArr = (h[]) editable.getSpans(selectionStart, selectionEnd, h.class)) != null && hVarArr.length > 0) {
            int length = hVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                h hVar = hVarArr[i10];
                int spanStart = editable.getSpanStart(hVar);
                int spanEnd = editable.getSpanEnd(hVar);
                if ((!z9 || spanStart != selectionStart) && ((z9 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i10++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean c(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z9) {
        int i12;
        int i13;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z9) {
                i13 = a.a(editable, selectionStart, Math.max(i10, 0));
                i12 = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (i13 == -1 || i12 == -1) {
                    return false;
                }
            } else {
                i13 = Math.max(selectionStart - i10, 0);
                i12 = Math.min(selectionEnd + i11, editable.length());
            }
            h[] hVarArr = (h[]) editable.getSpans(i13, i12, h.class);
            if (hVarArr != null && hVarArr.length > 0) {
                for (h hVar : hVarArr) {
                    int spanStart = editable.getSpanStart(hVar);
                    int spanEnd = editable.getSpanEnd(hVar);
                    i13 = Math.min(spanStart, i13);
                    i12 = Math.max(spanEnd, i12);
                }
                int max = Math.max(i13, 0);
                int min = Math.min(i12, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean d(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : b(editable, keyEvent, true) : b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean e(CharSequence charSequence, int i10, int i11, f fVar) {
        if (fVar.d() == 0) {
            fVar.k(this.f2189c.a(charSequence, i10, i11, fVar.h()));
        }
        return fVar.d() == 2;
    }

    private static boolean f(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.text.Spannable} */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.CharSequence] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042 A[Catch:{ all -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ all -> 0x0116 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence h(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.emoji2.text.m
            if (r0 == 0) goto L_0x000a
            r1 = r10
            androidx.emoji2.text.m r1 = (androidx.emoji2.text.m) r1
            r1.a()
        L_0x000a:
            r1 = 0
            if (r0 != 0) goto L_0x002b
            boolean r2 = r10 instanceof android.text.Spannable     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x0012
            goto L_0x002b
        L_0x0012:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x002e
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x0116 }
            int r3 = r11 + -1
            int r4 = r12 + 1
            java.lang.Class<androidx.emoji2.text.h> r5 = androidx.emoji2.text.h.class
            int r2 = r2.nextSpanTransition(r3, r4, r5)     // Catch:{ all -> 0x0116 }
            if (r2 > r12) goto L_0x002e
            android.text.SpannableString r1 = new android.text.SpannableString     // Catch:{ all -> 0x0116 }
            r1.<init>(r10)     // Catch:{ all -> 0x0116 }
            goto L_0x002e
        L_0x002b:
            r1 = r10
            android.text.Spannable r1 = (android.text.Spannable) r1     // Catch:{ all -> 0x0116 }
        L_0x002e:
            r2 = 0
            if (r1 == 0) goto L_0x005c
            java.lang.Class<androidx.emoji2.text.h> r3 = androidx.emoji2.text.h.class
            java.lang.Object[] r3 = r1.getSpans(r11, r12, r3)     // Catch:{ all -> 0x0116 }
            androidx.emoji2.text.h[] r3 = (androidx.emoji2.text.h[]) r3     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x005c
            int r4 = r3.length     // Catch:{ all -> 0x0116 }
            if (r4 <= 0) goto L_0x005c
            int r4 = r3.length     // Catch:{ all -> 0x0116 }
            r5 = 0
        L_0x0040:
            if (r5 >= r4) goto L_0x005c
            r6 = r3[r5]     // Catch:{ all -> 0x0116 }
            int r7 = r1.getSpanStart(r6)     // Catch:{ all -> 0x0116 }
            int r8 = r1.getSpanEnd(r6)     // Catch:{ all -> 0x0116 }
            if (r7 == r12) goto L_0x0051
            r1.removeSpan(r6)     // Catch:{ all -> 0x0116 }
        L_0x0051:
            int r11 = java.lang.Math.min(r7, r11)     // Catch:{ all -> 0x0116 }
            int r12 = java.lang.Math.max(r8, r12)     // Catch:{ all -> 0x0116 }
            int r5 = r5 + 1
            goto L_0x0040
        L_0x005c:
            if (r11 == r12) goto L_0x010d
            int r3 = r10.length()     // Catch:{ all -> 0x0116 }
            if (r11 < r3) goto L_0x0066
            goto L_0x010d
        L_0x0066:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L_0x007b
            if (r1 == 0) goto L_0x007b
            int r3 = r1.length()     // Catch:{ all -> 0x0116 }
            java.lang.Class<androidx.emoji2.text.h> r4 = androidx.emoji2.text.h.class
            java.lang.Object[] r3 = r1.getSpans(r2, r3, r4)     // Catch:{ all -> 0x0116 }
            androidx.emoji2.text.h[] r3 = (androidx.emoji2.text.h[]) r3     // Catch:{ all -> 0x0116 }
            int r3 = r3.length     // Catch:{ all -> 0x0116 }
            int r13 = r13 - r3
        L_0x007b:
            androidx.emoji2.text.g$c r3 = new androidx.emoji2.text.g$c     // Catch:{ all -> 0x0116 }
            androidx.emoji2.text.l r4 = r9.f2188b     // Catch:{ all -> 0x0116 }
            androidx.emoji2.text.l$a r4 = r4.f()     // Catch:{ all -> 0x0116 }
            boolean r5 = r9.f2190d     // Catch:{ all -> 0x0116 }
            int[] r6 = r9.f2191e     // Catch:{ all -> 0x0116 }
            r3.<init>(r4, r5, r6)     // Catch:{ all -> 0x0116 }
            int r4 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x0116 }
            r2 = r1
            r5 = r4
            r4 = 0
        L_0x0091:
            r1 = r11
        L_0x0092:
            if (r11 >= r12) goto L_0x00df
            if (r4 >= r13) goto L_0x00df
            int r6 = r3.a(r5)     // Catch:{ all -> 0x0116 }
            r7 = 1
            if (r6 == r7) goto L_0x00cd
            r7 = 2
            if (r6 == r7) goto L_0x00c1
            r7 = 3
            if (r6 == r7) goto L_0x00a4
            goto L_0x0092
        L_0x00a4:
            if (r14 != 0) goto L_0x00b0
            androidx.emoji2.text.f r6 = r3.c()     // Catch:{ all -> 0x0116 }
            boolean r6 = r9.e(r10, r1, r11, r6)     // Catch:{ all -> 0x0116 }
            if (r6 != 0) goto L_0x0091
        L_0x00b0:
            if (r2 != 0) goto L_0x00b7
            android.text.SpannableString r2 = new android.text.SpannableString     // Catch:{ all -> 0x0116 }
            r2.<init>(r10)     // Catch:{ all -> 0x0116 }
        L_0x00b7:
            androidx.emoji2.text.f r6 = r3.c()     // Catch:{ all -> 0x0116 }
            r9.a(r2, r6, r1, r11)     // Catch:{ all -> 0x0116 }
            int r4 = r4 + 1
            goto L_0x0091
        L_0x00c1:
            int r6 = java.lang.Character.charCount(r5)     // Catch:{ all -> 0x0116 }
            int r11 = r11 + r6
            if (r11 >= r12) goto L_0x0092
            int r5 = java.lang.Character.codePointAt(r10, r11)     // Catch:{ all -> 0x0116 }
            goto L_0x0092
        L_0x00cd:
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x0116 }
            int r11 = java.lang.Character.charCount(r11)     // Catch:{ all -> 0x0116 }
            int r1 = r1 + r11
            if (r1 >= r12) goto L_0x00dd
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch:{ all -> 0x0116 }
            r5 = r11
        L_0x00dd:
            r11 = r1
            goto L_0x0092
        L_0x00df:
            boolean r12 = r3.e()     // Catch:{ all -> 0x0116 }
            if (r12 == 0) goto L_0x0102
            if (r4 >= r13) goto L_0x0102
            if (r14 != 0) goto L_0x00f3
            androidx.emoji2.text.f r12 = r3.b()     // Catch:{ all -> 0x0116 }
            boolean r12 = r9.e(r10, r1, r11, r12)     // Catch:{ all -> 0x0116 }
            if (r12 != 0) goto L_0x0102
        L_0x00f3:
            if (r2 != 0) goto L_0x00fb
            android.text.SpannableString r12 = new android.text.SpannableString     // Catch:{ all -> 0x0116 }
            r12.<init>(r10)     // Catch:{ all -> 0x0116 }
            r2 = r12
        L_0x00fb:
            androidx.emoji2.text.f r12 = r3.b()     // Catch:{ all -> 0x0116 }
            r9.a(r2, r12, r1, r11)     // Catch:{ all -> 0x0116 }
        L_0x0102:
            if (r2 != 0) goto L_0x0105
            r2 = r10
        L_0x0105:
            if (r0 == 0) goto L_0x010c
            androidx.emoji2.text.m r10 = (androidx.emoji2.text.m) r10
            r10.d()
        L_0x010c:
            return r2
        L_0x010d:
            if (r0 == 0) goto L_0x0115
            r11 = r10
            androidx.emoji2.text.m r11 = (androidx.emoji2.text.m) r11
            r11.d()
        L_0x0115:
            return r10
        L_0x0116:
            r11 = move-exception
            if (r0 == 0) goto L_0x011e
            androidx.emoji2.text.m r10 = (androidx.emoji2.text.m) r10
            r10.d()
        L_0x011e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.g.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
