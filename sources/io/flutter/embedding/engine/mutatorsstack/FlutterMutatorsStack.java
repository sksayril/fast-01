package io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

@Keep
public class FlutterMutatorsStack {
    private List<Path> finalClippingPaths = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<a> mutators = new ArrayList();

    public class a {

        /* renamed from: a  reason: collision with root package name */
        private Matrix f9857a;

        /* renamed from: b  reason: collision with root package name */
        private Rect f9858b;

        /* renamed from: c  reason: collision with root package name */
        private float[] f9859c;

        /* renamed from: d  reason: collision with root package name */
        private b f9860d;

        public a(Matrix matrix) {
            this.f9860d = b.TRANSFORM;
            this.f9857a = matrix;
        }

        public a(Rect rect) {
            this.f9860d = b.CLIP_RECT;
            this.f9858b = rect;
        }

        public a(Rect rect, float[] fArr) {
            this.f9860d = b.CLIP_RRECT;
            this.f9858b = rect;
            this.f9859c = fArr;
        }

        public Matrix a() {
            return this.f9857a;
        }
    }

    public enum b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i10, int i11, int i12, int i13, float[] fArr) {
        Rect rect = new Rect(i10, i11, i12, i13);
        this.mutators.add(new a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        this.mutators.add(new a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        a aVar = new a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.a());
    }
}
