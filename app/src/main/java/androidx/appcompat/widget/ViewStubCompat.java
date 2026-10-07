package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.cmaster.cloner.ju1;
import com.cmaster.cloner.l61;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.ra;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int OooO0Oo;
    public WeakReference OooO0o;
    public int OooO0o0;
    public LayoutInflater OooO0oO;

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooO0Oo = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l61.OooOoo0, i, 0);
        this.OooO0o0 = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View OooO00o() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            qa.OooO0o("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.OooO0Oo == 0) {
            ra.OooOOO("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.OooO0oO;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.OooO0Oo, viewGroup, false);
        int i = this.OooO0o0;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.OooO0o = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.OooO0o0;
    }

    public LayoutInflater getLayoutInflater() {
        return this.OooO0oO;
    }

    public int getLayoutResource() {
        return this.OooO0Oo;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.OooO0o0 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.OooO0oO = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.OooO0Oo = i;
    }

    public void setOnInflateListener(ju1 ju1Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.OooO0o;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                qa.OooO0o("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            OooO00o();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
