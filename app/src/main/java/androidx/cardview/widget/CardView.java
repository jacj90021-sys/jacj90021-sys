package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.cmaster.cloner.d61;
import com.cmaster.cloner.e81;
import com.cmaster.cloner.fc1;
import com.cmaster.cloner.io2;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] OooO = {R.attr.colorBackground};
    public boolean OooO0Oo;
    public final Rect OooO0o;
    public boolean OooO0o0;
    public final Rect OooO0oO;
    public final e81 OooO0oo;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.OooO0o = rect;
        this.OooO0oO = new Rect();
        e81 e81Var = new e81(this);
        this.OooO0oo = e81Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d61.OooO00o, i, com.cmaster.cloner.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(OooO);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.cmaster.cloner.R.color.cardview_light_background) : getResources().getColor(com.cmaster.cloner.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.OooO0Oo = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.OooO0o0 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        fc1 fc1Var = new fc1(colorStateListValueOf, dimension);
        e81Var.OooO0o0 = fc1Var;
        setBackgroundDrawable(fc1Var);
        setClipToOutline(true);
        setElevation(dimension2);
        io2.OooO00o(e81Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((fc1) this.OooO0oo.OooO0o0).OooO0oo;
    }

    public float getCardElevation() {
        return ((CardView) this.OooO0oo.OooO0o).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.OooO0o.bottom;
    }

    public int getContentPaddingLeft() {
        return this.OooO0o.left;
    }

    public int getContentPaddingRight() {
        return this.OooO0o.right;
    }

    public int getContentPaddingTop() {
        return this.OooO0o.top;
    }

    public float getMaxCardElevation() {
        return ((fc1) this.OooO0oo.OooO0o0).OooO0o0;
    }

    public boolean getPreventCornerOverlap() {
        return this.OooO0o0;
    }

    public float getRadius() {
        return ((fc1) this.OooO0oo.OooO0o0).OooO00o;
    }

    public boolean getUseCompatPadding() {
        return this.OooO0Oo;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        fc1 fc1Var = (fc1) this.OooO0oo.OooO0o0;
        if (colorStateListValueOf == null) {
            fc1Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        fc1Var.OooO0oo = colorStateListValueOf;
        fc1Var.OooO0O0.setColor(colorStateListValueOf.getColorForState(fc1Var.getState(), fc1Var.OooO0oo.getDefaultColor()));
        fc1Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.OooO0oo.OooO0o).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        io2.OooO00o(this.OooO0oo, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.OooO0o0) {
            this.OooO0o0 = z;
            e81 e81Var = this.OooO0oo;
            io2.OooO00o(e81Var, ((fc1) e81Var.OooO0o0).OooO0o0);
        }
    }

    public void setRadius(float f) {
        fc1 fc1Var = (fc1) this.OooO0oo.OooO0o0;
        if (f == fc1Var.OooO00o) {
            return;
        }
        fc1Var.OooO00o = f;
        fc1Var.OooO0O0(null);
        fc1Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.OooO0Oo != z) {
            this.OooO0Oo = z;
            e81 e81Var = this.OooO0oo;
            io2.OooO00o(e81Var, ((fc1) e81Var.OooO0o0).OooO0o0);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        fc1 fc1Var = (fc1) this.OooO0oo.OooO0o0;
        if (colorStateList == null) {
            fc1Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        fc1Var.OooO0oo = colorStateList;
        fc1Var.OooO0O0.setColor(colorStateList.getColorForState(fc1Var.getState(), fc1Var.OooO0oo.getDefaultColor()));
        fc1Var.invalidateSelf();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.cmaster.cloner.R.attr.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}
