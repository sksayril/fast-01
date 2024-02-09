package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.journeyapps.barcodescanner.a;
import java.util.ArrayList;
import java.util.List;
import o5.p;
import s5.j;
import s5.o;

public class ViewfinderView extends View {
    protected static final int[] A = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: z  reason: collision with root package name */
    protected static final String f7565z = ViewfinderView.class.getSimpleName();

    /* renamed from: m  reason: collision with root package name */
    protected final Paint f7566m = new Paint(1);

    /* renamed from: n  reason: collision with root package name */
    protected Bitmap f7567n;

    /* renamed from: o  reason: collision with root package name */
    protected int f7568o;

    /* renamed from: p  reason: collision with root package name */
    protected final int f7569p;

    /* renamed from: q  reason: collision with root package name */
    protected final int f7570q;

    /* renamed from: r  reason: collision with root package name */
    protected final int f7571r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f7572s;

    /* renamed from: t  reason: collision with root package name */
    protected int f7573t;

    /* renamed from: u  reason: collision with root package name */
    protected List<p> f7574u;

    /* renamed from: v  reason: collision with root package name */
    protected List<p> f7575v;

    /* renamed from: w  reason: collision with root package name */
    protected a f7576w;

    /* renamed from: x  reason: collision with root package name */
    protected Rect f7577x;

    /* renamed from: y  reason: collision with root package name */
    protected m6.p f7578y;

    class a implements a.f {
        a() {
        }

        public void a() {
            ViewfinderView.this.b();
            ViewfinderView.this.invalidate();
        }

        public void b(Exception exc) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f12217n);
        this.f7568o = obtainStyledAttributes.getColor(o.f12222s, resources.getColor(j.zxing_viewfinder_mask));
        this.f7569p = obtainStyledAttributes.getColor(o.f12219p, resources.getColor(j.zxing_result_view));
        this.f7570q = obtainStyledAttributes.getColor(o.f12220q, resources.getColor(j.zxing_viewfinder_laser));
        this.f7571r = obtainStyledAttributes.getColor(o.f12218o, resources.getColor(j.zxing_possible_result_points));
        this.f7572s = obtainStyledAttributes.getBoolean(o.f12221r, true);
        obtainStyledAttributes.recycle();
        this.f7573t = 0;
        this.f7574u = new ArrayList(20);
        this.f7575v = new ArrayList(20);
    }

    public void a(p pVar) {
        if (this.f7574u.size() < 20) {
            this.f7574u.add(pVar);
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        a aVar = this.f7576w;
        if (aVar != null) {
            Rect framingRect = aVar.getFramingRect();
            m6.p previewSize = this.f7576w.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f7577x = framingRect;
                this.f7578y = previewSize;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        m6.p pVar;
        b();
        Rect rect = this.f7577x;
        if (rect != null && (pVar = this.f7578y) != null) {
            int width = getWidth();
            int height = getHeight();
            this.f7566m.setColor(this.f7567n != null ? this.f7569p : this.f7568o);
            float f10 = (float) width;
            canvas.drawRect(0.0f, 0.0f, f10, (float) rect.top, this.f7566m);
            canvas.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), this.f7566m);
            float f11 = f10;
            canvas.drawRect((float) (rect.right + 1), (float) rect.top, f11, (float) (rect.bottom + 1), this.f7566m);
            canvas.drawRect(0.0f, (float) (rect.bottom + 1), f11, (float) height, this.f7566m);
            if (this.f7567n != null) {
                this.f7566m.setAlpha(160);
                canvas.drawBitmap(this.f7567n, (Rect) null, rect, this.f7566m);
                return;
            }
            if (this.f7572s) {
                this.f7566m.setColor(this.f7570q);
                Paint paint = this.f7566m;
                int[] iArr = A;
                paint.setAlpha(iArr[this.f7573t]);
                this.f7573t = (this.f7573t + 1) % iArr.length;
                int height2 = (rect.height() / 2) + rect.top;
                canvas.drawRect((float) (rect.left + 2), (float) (height2 - 1), (float) (rect.right - 1), (float) (height2 + 2), this.f7566m);
            }
            float width2 = ((float) getWidth()) / ((float) pVar.f11243m);
            float height3 = ((float) getHeight()) / ((float) pVar.f11244n);
            if (!this.f7575v.isEmpty()) {
                this.f7566m.setAlpha(80);
                this.f7566m.setColor(this.f7571r);
                for (p next : this.f7575v) {
                    canvas.drawCircle((float) ((int) (next.c() * width2)), (float) ((int) (next.d() * height3)), 3.0f, this.f7566m);
                }
                this.f7575v.clear();
            }
            if (!this.f7574u.isEmpty()) {
                this.f7566m.setAlpha(160);
                this.f7566m.setColor(this.f7571r);
                for (p next2 : this.f7574u) {
                    canvas.drawCircle((float) ((int) (next2.c() * width2)), (float) ((int) (next2.d() * height3)), 6.0f, this.f7566m);
                }
                List<p> list = this.f7574u;
                List<p> list2 = this.f7575v;
                this.f7574u = list2;
                this.f7575v = list;
                list2.clear();
            }
            postInvalidateDelayed(80, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }

    public void setCameraPreview(a aVar) {
        this.f7576w = aVar;
        aVar.i(new a());
    }

    public void setLaserVisibility(boolean z9) {
        this.f7572s = z9;
    }

    public void setMaskColor(int i10) {
        this.f7568o = i10;
    }
}
