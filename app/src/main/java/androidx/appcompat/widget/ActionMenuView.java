package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.cmaster.cloner.ht0;
import com.cmaster.cloner.kt0;
import com.cmaster.cloner.nu1;
import com.cmaster.cloner.o00O;
import com.cmaster.cloner.o00O0OO;
import com.cmaster.cloner.o00O0OO0;
import com.cmaster.cloner.o00O0OOO;
import com.cmaster.cloner.o00OO000;
import com.cmaster.cloner.o00OO00O;
import com.cmaster.cloner.om0;
import com.cmaster.cloner.oo0oOO0;
import com.cmaster.cloner.pm0;
import com.cmaster.cloner.qc3;
import com.cmaster.cloner.qs0;
import com.cmaster.cloner.rs0;
import com.cmaster.cloner.ss0;
import com.cmaster.cloner.v8;
import com.cmaster.cloner.vs0;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ActionMenuView extends pm0 implements rs0, kt0 {
    public ss0 OooOOoo;
    public v8 OooOo;
    public int OooOo0;
    public Context OooOo00;
    public boolean OooOo0O;
    public o00O0OOO OooOo0o;
    public boolean OooOoO;
    public qs0 OooOoO0;
    public int OooOoOO;
    public final int OooOoo;
    public final int OooOoo0;
    public o00OO00O OooOooO;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.OooOoo0 = (int) (56.0f * f);
        this.OooOoo = (int) (f * 4.0f);
        this.OooOo00 = context;
        this.OooOo0 = 0;
    }

    public static o00O OooO() {
        o00O o00o = new o00O(-2, -2);
        o00o.OooO00o = false;
        ((LinearLayout.LayoutParams) o00o).gravity = 16;
        return o00o;
    }

    public static o00O OooOO0(ViewGroup.LayoutParams layoutParams) {
        o00O o00o;
        if (layoutParams == null) {
            return OooO();
        }
        if (layoutParams instanceof o00O) {
            o00O o00o2 = (o00O) layoutParams;
            o00o = new o00O(o00o2);
            o00o.OooO00o = o00o2.OooO00o;
        } else {
            o00o = new o00O(layoutParams);
        }
        if (((LinearLayout.LayoutParams) o00o).gravity <= 0) {
            ((LinearLayout.LayoutParams) o00o).gravity = 16;
        }
        return o00o;
    }

    @Override // com.cmaster.cloner.kt0
    public final void OooO00o(ss0 ss0Var) {
        this.OooOOoo = ss0Var;
    }

    @Override // com.cmaster.cloner.rs0
    public final boolean OooO0O0(vs0 vs0Var) {
        return this.OooOOoo.OooOOo0(vs0Var, null, 0);
    }

    @Override // com.cmaster.cloner.pm0
    /* renamed from: OooO0o */
    public final om0 generateLayoutParams(AttributeSet attributeSet) {
        return new o00O(getContext(), attributeSet);
    }

    @Override // com.cmaster.cloner.pm0
    /* renamed from: OooO0o0 */
    public final /* bridge */ /* synthetic */ om0 generateDefaultLayoutParams() {
        return OooO();
    }

    @Override // com.cmaster.cloner.pm0
    /* renamed from: OooO0oO */
    public final /* bridge */ /* synthetic */ om0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooOO0(layoutParams);
    }

    public final boolean OooOO0O(int i) {
        boolean zOooO0O0 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof oo0oOO0)) {
            zOooO0O0 = ((oo0oOO0) childAt).OooO0O0();
        }
        return (i <= 0 || !(childAt2 instanceof oo0oOO0)) ? zOooO0O0 : ((oo0oOO0) childAt2).OooO0OO() | zOooO0O0;
    }

    @Override // com.cmaster.cloner.pm0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o00O;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.OooOOoo == null) {
            Context context = getContext();
            ss0 ss0Var = new ss0(context);
            this.OooOOoo = ss0Var;
            ss0Var.OooO0oo = new o00OO000(this, 0);
            o00O0OOO o00o0ooo = new o00O0OOO(context);
            this.OooOo0o = o00o0ooo;
            o00o0ooo.OooOOOO = true;
            o00o0ooo.OooOOOo = true;
            ht0 qc3Var = this.OooOo;
            if (qc3Var == null) {
                qc3Var = new qc3(2);
            }
            o00o0ooo.OooO0oo = qc3Var;
            this.OooOOoo.OooO0O0(o00o0ooo, this.OooOo00);
            o00O0OOO o00o0ooo2 = this.OooOo0o;
            o00o0ooo2.OooOO0O = this;
            this.OooOOoo = o00o0ooo2.OooO0o;
        }
        return this.OooOOoo;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        o00O0OOO o00o0ooo = this.OooOo0o;
        o00O0OO o00o0oo = o00o0ooo.OooOO0o;
        if (o00o0oo != null) {
            return o00o0oo.getDrawable();
        }
        if (o00o0ooo.OooOOO) {
            return o00o0ooo.OooOOO0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.OooOo0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o00O0OOO o00o0ooo = this.OooOo0o;
        if (o00o0ooo != null) {
            o00o0ooo.OooOO0();
            if (this.OooOo0o.OooOO0O()) {
                this.OooOo0o.OooO();
                this.OooOo0o.OooOO0o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o00O0OOO o00o0ooo = this.OooOo0o;
        if (o00o0ooo != null) {
            o00o0ooo.OooO();
            o00O0OO0 o00o0oo0 = o00o0ooo.OooOo0o;
            if (o00o0oo0 == null || !o00o0oo0.OooO0O0()) {
                return;
            }
            o00o0oo0.OooO.dismiss();
        }
    }

    @Override // com.cmaster.cloner.pm0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.OooOoO) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = nu1.OooO00o;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                o00O o00o = (o00O) childAt.getLayoutParams();
                if (o00o.OooO00o) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (OooOO0O(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) o00o).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) o00o).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) o00o).leftMargin) + ((LinearLayout.LayoutParams) o00o).rightMargin;
                    OooOO0O(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                o00O o00o2 = (o00O) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !o00o2.OooO00o) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) o00o2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) o00o2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            o00O o00o3 = (o00O) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !o00o3.OooO00o) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) o00o3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) o00o3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // com.cmaster.cloner.pm0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        ss0 ss0Var;
        boolean z = this.OooOoO;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.OooOoO = z2;
        if (z != z2) {
            this.OooOoOO = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.OooOoO && (ss0Var = this.OooOOoo) != null && size != this.OooOoOO) {
            this.OooOoOO = size;
            ss0Var.OooOOOo(true);
        }
        int childCount = getChildCount();
        if (!this.OooOoO || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                o00O o00o = (o00O) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) o00o).rightMargin = 0;
                ((LinearLayout.LayoutParams) o00o).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.OooOoo0;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.OooOoo;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                o00O o00o2 = (o00O) childAt.getLayoutParams();
                o00o2.OooO0o = false;
                o00o2.OooO0OO = 0;
                o00o2.OooO0O0 = 0;
                o00o2.OooO0Oo = false;
                ((LinearLayout.LayoutParams) o00o2).leftMargin = 0;
                ((LinearLayout.LayoutParams) o00o2).rightMargin = 0;
                o00o2.OooO0o0 = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = o00o2.OooO00o ? 1 : i10;
                o00O o00o3 = (o00O) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                o00o3.OooO0Oo = !o00o3.OooO00o && z6;
                o00o3.OooO0O0 = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (o00o2.OooO0Oo) {
                    i15++;
                }
                if (o00o2.OooO00o) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= 1 << i14;
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (i15 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                o00O o00o4 = (o00O) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (o00o4.OooO0Oo) {
                    int i28 = o00o4.OooO0O0;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                o00O o00o5 = (o00O) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && o00o5.OooO0o0) {
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    }
                    o00o5.OooO0O0++;
                    o00o5.OooO0o = true;
                    i23--;
                } else if (o00o5.OooO0O0 == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        i4 = iMax;
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((o00O) getChildAt(0).getLayoutParams()).OooO0o0) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & (1 << i31)) != 0 && !((o00O) getChildAt(i31).getLayoutParams()).OooO0o0) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & (1 << i33)) != 0) {
                    View childAt3 = getChildAt(i33);
                    o00O o00o6 = (o00O) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        o00o6.OooO0OO = i32;
                        o00o6.OooO0o = true;
                        if (i33 == 0 && !o00o6.OooO0o0) {
                            ((LinearLayout.LayoutParams) o00o6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (o00o6.OooO00o) {
                        o00o6.OooO0OO = i32;
                        o00o6.OooO0o = true;
                        ((LinearLayout.LayoutParams) o00o6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) o00o6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) o00o6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                o00O o00o7 = (o00O) childAt4.getLayoutParams();
                if (o00o7.OooO0o) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((o00o7.OooO0O0 * i22) + o00o7.OooO0OO, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.OooOo0o.OooOo00 = z;
    }

    public void setOnMenuItemClickListener(o00OO00O o00oo00o) {
        this.OooOooO = o00oo00o;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        o00O0OOO o00o0ooo = this.OooOo0o;
        o00O0OO o00o0oo = o00o0ooo.OooOO0o;
        if (o00o0oo != null) {
            o00o0oo.setImageDrawable(drawable);
        } else {
            o00o0ooo.OooOOO = true;
            o00o0ooo.OooOOO0 = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.OooOo0O = z;
    }

    public void setPopupTheme(int i) {
        if (this.OooOo0 != i) {
            this.OooOo0 = i;
            if (i == 0) {
                this.OooOo00 = getContext();
            } else {
                this.OooOo00 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(o00O0OOO o00o0ooo) {
        this.OooOo0o = o00o0ooo;
        o00o0ooo.OooOO0O = this;
        this.OooOOoo = o00o0ooo.OooO0o;
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
