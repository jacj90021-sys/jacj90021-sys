package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.cmaster.cloner.R;
import com.cmaster.cloner.l61;
import com.cmaster.cloner.o00O00;
import com.cmaster.cloner.yd1;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public Drawable OooO;
    public boolean OooO0Oo;
    public View OooO0o;
    public View OooO0o0;
    public Drawable OooO0oO;
    public Drawable OooO0oo;
    public final boolean OooOO0;
    public boolean OooOO0O;
    public final int OooOO0o;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new o00O00(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l61.OooO00o);
        boolean z = false;
        this.OooO0oO = typedArrayObtainStyledAttributes.getDrawable(0);
        this.OooO0oo = typedArrayObtainStyledAttributes.getDrawable(2);
        this.OooOO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.OooOO0 = true;
            this.OooO = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.OooOO0 ? !(this.OooO0oO != null || this.OooO0oo != null) : this.OooO == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.OooO0oO;
        if (drawable != null && drawable.isStateful()) {
            this.OooO0oO.setState(getDrawableState());
        }
        Drawable drawable2 = this.OooO0oo;
        if (drawable2 != null && drawable2.isStateful()) {
            this.OooO0oo.setState(getDrawableState());
        }
        Drawable drawable3 = this.OooO;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.OooO.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.OooO0oO;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.OooO0oo;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.OooO;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.OooO0o0 = findViewById(R.id.action_bar);
        this.OooO0o = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.OooO0Oo || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.OooOO0) {
            Drawable drawable = this.OooO;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.OooO0oO == null) {
                z2 = false;
            } else if (this.OooO0o0.getVisibility() == 0) {
                this.OooO0oO.setBounds(this.OooO0o0.getLeft(), this.OooO0o0.getTop(), this.OooO0o0.getRight(), this.OooO0o0.getBottom());
            } else {
                View view = this.OooO0o;
                if (view == null || view.getVisibility() != 0) {
                    this.OooO0oO.setBounds(0, 0, 0, 0);
                } else {
                    this.OooO0oO.setBounds(this.OooO0o.getLeft(), this.OooO0o.getTop(), this.OooO0o.getRight(), this.OooO0o.getBottom());
                }
            }
            this.OooOO0O = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.OooO0o0 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.OooOO0o) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.OooO0o0 == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.OooO0oO;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.OooO0oO);
        }
        this.OooO0oO = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.OooO0o0;
            if (view != null) {
                this.OooO0oO.setBounds(view.getLeft(), this.OooO0o0.getTop(), this.OooO0o0.getRight(), this.OooO0o0.getBottom());
            }
        }
        boolean z = false;
        if (!this.OooOO0 ? !(this.OooO0oO != null || this.OooO0oo != null) : this.OooO == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.OooO;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.OooO);
        }
        this.OooO = drawable;
        boolean z = this.OooOO0;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.OooO) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.OooO0oO != null || this.OooO0oo != null) : this.OooO == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.OooO0oo;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.OooO0oo);
        }
        this.OooO0oo = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.OooOO0O && this.OooO0oo != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.OooOO0 ? !(this.OooO0oO != null || this.OooO0oo != null) : this.OooO == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(yd1 yd1Var) {
    }

    public void setTransitioning(boolean z) {
        this.OooO0Oo = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.OooO0oO;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.OooO0oo;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.OooO;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.OooO0oO;
        boolean z = this.OooOO0;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.OooO0oo && this.OooOO0O) {
            return true;
        }
        return (drawable == this.OooO && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
