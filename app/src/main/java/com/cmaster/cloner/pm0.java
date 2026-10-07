package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class pm0 extends ViewGroup {
    public int OooO;
    public boolean OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public float OooOO0;
    public boolean OooOO0O;
    public int[] OooOO0o;
    public Drawable OooOOO;
    public int[] OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public int OooOOo;
    public int OooOOo0;

    public pm0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooO0Oo = true;
        this.OooO0o0 = -1;
        this.OooO0o = 0;
        this.OooO0oo = 8388659;
        int[] iArr = l61.OooOOO;
        a02 a02VarOooo0OO = a02.Oooo0OO(context, attributeSet, iArr, i);
        nt1.OooOO0o(this, context, iArr, attributeSet, (TypedArray) a02VarOooo0OO.OooO0o, i);
        TypedArray typedArray = (TypedArray) a02VarOooo0OO.OooO0o;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.OooOO0 = typedArray.getFloat(4, -1.0f);
        this.OooO0o0 = typedArray.getInt(3, -1);
        this.OooOO0O = typedArray.getBoolean(7, false);
        setDividerDrawable(a02VarOooo0OO.OooOOo(5));
        this.OooOOo0 = typedArray.getInt(8, 0);
        this.OooOOo = typedArray.getDimensionPixelSize(6, 0);
        a02VarOooo0OO.Oooo0oO();
    }

    public final void OooO0OO(Canvas canvas, int i) {
        this.OooOOO.setBounds(getPaddingLeft() + this.OooOOo, i, (getWidth() - getPaddingRight()) - this.OooOOo, this.OooOOOo + i);
        this.OooOOO.draw(canvas);
    }

    public final void OooO0Oo(Canvas canvas, int i) {
        this.OooOOO.setBounds(i, getPaddingTop() + this.OooOOo, this.OooOOOO + i, (getHeight() - getPaddingBottom()) - this.OooOOo);
        this.OooOOO.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public om0 generateLayoutParams(AttributeSet attributeSet) {
        return new om0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public om0 generateDefaultLayoutParams() {
        int i = this.OooO0oO;
        if (i == 0) {
            return new om0(-2, -2);
        }
        if (i == 1) {
            return new om0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public om0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof om0 ? new om0((om0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new om0((ViewGroup.MarginLayoutParams) layoutParams) : new om0(layoutParams);
    }

    public final boolean OooO0oo(int i) {
        if (i == 0) {
            return (this.OooOOo0 & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.OooOOo0;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof om0;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.OooO0o0 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.OooO0o0;
        if (childCount <= i2) {
            ra.OooOOO0("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.OooO0o0 == 0) {
                return -1;
            }
            ra.OooOOO0("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int bottom = this.OooO0o;
        if (this.OooO0oO == 1 && (i = this.OooO0oo & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.OooO) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.OooO;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((om0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.OooO0o0;
    }

    public Drawable getDividerDrawable() {
        return this.OooOOO;
    }

    public int getDividerPadding() {
        return this.OooOOo;
    }

    public int getDividerWidth() {
        return this.OooOOOO;
    }

    public int getGravity() {
        return this.OooO0oo;
    }

    public int getOrientation() {
        return this.OooO0oO;
    }

    public int getShowDividers() {
        return this.OooOOo0;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.OooOO0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.OooOOO == null) {
            return;
        }
        int i2 = 0;
        if (this.OooO0oO == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && OooO0oo(i2)) {
                    OooO0OO(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((om0) childAt.getLayoutParams())).topMargin) - this.OooOOOo);
                }
                i2++;
            }
            if (OooO0oo(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                OooO0OO(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.OooOOOo : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((om0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = nu1.OooO00o;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && OooO0oo(i2)) {
                om0 om0Var = (om0) childAt3.getLayoutParams();
                OooO0Oo(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) om0Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) om0Var).leftMargin) - this.OooOOOO);
            }
            i2++;
        }
        if (OooO0oo(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                om0 om0Var2 = (om0) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) om0Var2).leftMargin;
                    i = this.OooOOOO;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) om0Var2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.OooOOOO;
                right = left - i;
            }
            OooO0Oo(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.pm0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.pm0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.OooO0Oo = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.OooO0o0 = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.OooOOO) {
            return;
        }
        this.OooOOO = drawable;
        if (drawable != null) {
            this.OooOOOO = drawable.getIntrinsicWidth();
            this.OooOOOo = drawable.getIntrinsicHeight();
        } else {
            this.OooOOOO = 0;
            this.OooOOOo = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.OooOOo = i;
    }

    public void setGravity(int i) {
        if (this.OooO0oo != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.OooO0oo = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.OooO0oo;
        if ((8388615 & i3) != i2) {
            this.OooO0oo = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.OooOO0O = z;
    }

    public void setOrientation(int i) {
        if (this.OooO0oO != i) {
            this.OooO0oO = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.OooOOo0) {
            requestLayout();
        }
        this.OooOOo0 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.OooO0oo;
        if ((i3 & 112) != i2) {
            this.OooO0oo = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.OooOO0 = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
