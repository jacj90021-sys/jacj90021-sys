package com.bumptech.matrix.ui.qrcode;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import com.cmaster.cloner.mb;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.sn2;
import com.cmaster.cloner.v60;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class GraphicOverlay extends View {
    public float OooO;
    public final Object OooO0Oo;
    public final Matrix OooO0o;
    public final ArrayList OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO0;

    public GraphicOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0Oo = new Object();
        this.OooO0o0 = new ArrayList();
        this.OooO0o = new Matrix();
        this.OooO = 1.0f;
        this.OooOOO0 = true;
        addOnLayoutChangeListener(new mb(this, 1));
    }

    public final void OooO00o(v60 v60Var) {
        synchronized (this.OooO0Oo) {
            this.OooO0o0.add(v60Var);
        }
    }

    public final void OooO0O0() {
        synchronized (this.OooO0Oo) {
            this.OooO0o0.clear();
        }
        postInvalidate();
    }

    public final void OooO0OO(int i, int i2, boolean z) {
        boolean z2 = i > 0;
        String strOooO00o = sn2.OooO00o("k9+rjunVE0iexqLJ4YAXVdrQr8n8mhdIjtu8jA==\n", "+rLK6Yz1ZCE=\n");
        if (!z2) {
            qa.OooO0o(strOooO00o);
            return;
        }
        boolean z3 = i2 > 0;
        String strOooO00o2 = sn2.OooO00o("+TZ0OzZtMur5PH0ocyAv/OR7dzlzPTX8+S98KjY=\n", "kFsVXFNNWo8=\n");
        if (!z3) {
            qa.OooO0o(strOooO00o2);
            return;
        }
        synchronized (this.OooO0Oo) {
            this.OooO0oO = i;
            this.OooO0oo = i2;
            this.OooOO0o = z;
            this.OooOOO0 = true;
        }
        postInvalidate();
    }

    public final void OooO0Oo() {
        if (!this.OooOOO0 || this.OooO0oO <= 0 || this.OooO0oo <= 0) {
            return;
        }
        float width = getWidth() / getHeight();
        float f = this.OooO0oO / this.OooO0oo;
        this.OooOO0 = 0.0f;
        this.OooOO0O = 0.0f;
        if (width > f) {
            this.OooO = getWidth() / this.OooO0oO;
            this.OooOO0O = ((getWidth() / f) - getHeight()) / 2.0f;
        } else {
            this.OooO = getHeight() / this.OooO0oo;
            this.OooOO0 = ((getHeight() * f) - getWidth()) / 2.0f;
        }
        Matrix matrix = this.OooO0o;
        matrix.reset();
        float f2 = this.OooO;
        matrix.setScale(f2, f2);
        matrix.postTranslate(-this.OooOO0, -this.OooOO0O);
        if (this.OooOO0o) {
            matrix.postScale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        this.OooOOO0 = false;
    }

    public int getImageHeight() {
        return this.OooO0oo;
    }

    public int getImageWidth() {
        return this.OooO0oO;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.OooO0Oo) {
            try {
                OooO0Oo();
                ArrayList arrayList = this.OooO0o0;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((v60) obj).OooO00o(canvas);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
