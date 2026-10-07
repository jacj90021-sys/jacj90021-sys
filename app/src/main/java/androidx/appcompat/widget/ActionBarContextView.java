package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cmaster.cloner.R;
import com.cmaster.cloner.gu1;
import com.cmaster.cloner.kt0;
import com.cmaster.cloner.l61;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.nu1;
import com.cmaster.cloner.o00O00O;
import com.cmaster.cloner.o00O0OO0;
import com.cmaster.cloner.o00O0OOO;
import com.cmaster.cloner.o00OO0O0;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.ss0;
import com.cmaster.cloner.ym2;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public gu1 OooO;
    public final com.cmaster.cloner.OooO0O0 OooO0Oo;
    public ActionMenuView OooO0o;
    public final Context OooO0o0;
    public o00O0OOO OooO0oO;
    public int OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;
    public CharSequence OooOO0o;
    public View OooOOO;
    public CharSequence OooOOO0;
    public View OooOOOO;
    public View OooOOOo;
    public TextView OooOOo;
    public LinearLayout OooOOo0;
    public TextView OooOOoo;
    public final int OooOo0;
    public final int OooOo00;
    public boolean OooOo0O;
    public final int OooOo0o;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        com.cmaster.cloner.OooO0O0 oooO0O0 = new com.cmaster.cloner.OooO0O0();
        oooO0O0.OooO0OO = this;
        oooO0O0.OooO00o = false;
        this.OooO0Oo = oooO0O0;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.OooO0o0 = context;
        } else {
            this.OooO0o0 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l61.OooO0Oo, i, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : ym2.OooO00o(context, resourceId));
        this.OooOo00 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.OooOo0 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.OooO0oo = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.OooOo0o = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int OooO0o(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int OooO0oO(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final gu1 OooO(int i, long j) {
        gu1 gu1Var = this.OooO;
        if (gu1Var != null) {
            gu1Var.OooO0O0();
        }
        com.cmaster.cloner.OooO0O0 oooO0O0 = this.OooO0Oo;
        if (i != 0) {
            gu1 gu1VarOooO00o = nt1.OooO00o(this);
            gu1VarOooO00o.OooO00o(0.0f);
            gu1VarOooO00o.OooO0OO(j);
            ((ActionBarContextView) oooO0O0.OooO0OO).OooO = gu1VarOooO00o;
            oooO0O0.OooO0O0 = i;
            gu1VarOooO00o.OooO0Oo(oooO0O0);
            return gu1VarOooO00o;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        gu1 gu1VarOooO00o2 = nt1.OooO00o(this);
        gu1VarOooO00o2.OooO00o(1.0f);
        gu1VarOooO00o2.OooO0OO(j);
        ((ActionBarContextView) oooO0O0.OooO0OO).OooO = gu1VarOooO00o2;
        oooO0O0.OooO0O0 = i;
        gu1VarOooO00o2.OooO0Oo(oooO0O0);
        return gu1VarOooO00o2;
    }

    public final void OooO0OO(o00OO0O0 o00oo0o0) {
        View view = this.OooOOO;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.OooOo0o, (ViewGroup) this, false);
            this.OooOOO = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.OooOOO);
        }
        View viewFindViewById = this.OooOOO.findViewById(R.id.action_mode_close_button);
        this.OooOOOO = viewFindViewById;
        viewFindViewById.setOnClickListener(new o00O00O(o00oo0o0, i));
        ss0 ss0VarOooO0OO = o00oo0o0.OooO0OO();
        o00O0OOO o00o0ooo = this.OooO0oO;
        if (o00o0ooo != null) {
            o00o0ooo.OooO();
            o00O0OO0 o00o0oo0 = o00o0ooo.OooOo0o;
            if (o00o0oo0 != null && o00o0oo0.OooO0O0()) {
                o00o0oo0.OooO.dismiss();
            }
        }
        o00O0OOO o00o0ooo2 = new o00O0OOO(getContext());
        this.OooO0oO = o00o0ooo2;
        o00o0ooo2.OooOOOO = true;
        o00o0ooo2.OooOOOo = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ss0VarOooO0OO.OooO0O0(this.OooO0oO, this.OooO0o0);
        o00O0OOO o00o0ooo3 = this.OooO0oO;
        kt0 kt0Var = o00o0ooo3.OooOO0O;
        if (kt0Var == null) {
            kt0 kt0Var2 = (kt0) o00o0ooo3.OooO0oO.inflate(o00o0ooo3.OooO, (ViewGroup) this, false);
            o00o0ooo3.OooOO0O = kt0Var2;
            kt0Var2.OooO00o(o00o0ooo3.OooO0o);
            o00o0ooo3.OooOO0();
        }
        kt0 kt0Var3 = o00o0ooo3.OooOO0O;
        if (kt0Var != kt0Var3) {
            ((ActionMenuView) kt0Var3).setPresenter(o00o0ooo3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kt0Var3;
        this.OooO0o = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.OooO0o, layoutParams);
    }

    public final void OooO0Oo() {
        if (this.OooOOo0 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.OooOOo0 = linearLayout;
            this.OooOOo = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.OooOOoo = (TextView) this.OooOOo0.findViewById(R.id.action_bar_subtitle);
            int i = this.OooOo00;
            if (i != 0) {
                this.OooOOo.setTextAppearance(getContext(), i);
            }
            int i2 = this.OooOo0;
            if (i2 != 0) {
                this.OooOOoo.setTextAppearance(getContext(), i2);
            }
        }
        this.OooOOo.setText(this.OooOO0o);
        this.OooOOoo.setText(this.OooOOO0);
        boolean zIsEmpty = TextUtils.isEmpty(this.OooOO0o);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.OooOOO0);
        this.OooOOoo.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.OooOOo0.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.OooOOo0.getParent() == null) {
            addView(this.OooOOo0);
        }
    }

    public final void OooO0o0() {
        removeAllViews();
        this.OooOOOo = null;
        this.OooO0o = null;
        this.OooO0oO = null;
        View view = this.OooOOOO;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            gu1 gu1Var = this.OooO;
            if (gu1Var != null) {
                gu1Var.OooO0O0();
            }
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.OooO != null ? this.OooO0Oo.OooO0O0 : getVisibility();
    }

    public int getContentHeight() {
        return this.OooO0oo;
    }

    public CharSequence getSubtitle() {
        return this.OooOOO0;
    }

    public CharSequence getTitle() {
        return this.OooOO0o;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, l61.OooO00o, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        o00O0OOO o00o0ooo = this.OooO0oO;
        if (o00o0ooo != null) {
            Configuration configuration2 = o00o0ooo.OooO0o0.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            o00o0ooo.OooOOoo = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            ss0 ss0Var = o00o0ooo.OooO0o;
            if (ss0Var != null) {
                ss0Var.OooOOOo(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o00O0OOO o00o0ooo = this.OooO0oO;
        if (o00o0ooo != null) {
            o00o0ooo.OooO();
            o00O0OO0 o00o0oo0 = this.OooO0oO.OooOo0o;
            if (o00o0oo0 == null || !o00o0oo0.OooO0O0()) {
                return;
            }
            o00o0oo0.OooO.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.OooOO0O = false;
        }
        if (!this.OooOO0O) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.OooOO0O = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.OooOO0O = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = nu1.OooO00o;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.OooOOO;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.OooOOO.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iOooO0oO = OooO0oO(this.OooOOO, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iOooO0oO - i6 : iOooO0oO + i6;
        }
        LinearLayout linearLayout = this.OooOOo0;
        if (linearLayout != null && this.OooOOOo == null && linearLayout.getVisibility() != 8) {
            paddingRight += OooO0oO(this.OooOOo0, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.OooOOOo;
        if (view2 != null) {
            OooO0oO(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.OooO0o;
        if (actionMenuView != null) {
            OooO0oO(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            qa.OooO0o(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            qa.OooO0o(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.OooO0oo;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.OooOOO;
        if (view != null) {
            int iOooO0o = OooO0o(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.OooOOO.getLayoutParams();
            paddingLeft = iOooO0o - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.OooO0o;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = OooO0o(this.OooO0o, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.OooOOo0;
        if (linearLayout != null && this.OooOOOo == null) {
            if (this.OooOo0O) {
                this.OooOOo0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.OooOOo0.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.OooOOo0.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = OooO0o(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.OooOOOo;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.OooOOOo.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.OooO0oo > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.OooOO0 = false;
        }
        if (!this.OooOO0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.OooOO0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.OooOO0 = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.OooO0oo = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.OooOOOo;
        if (view2 != null) {
            removeView(view2);
        }
        this.OooOOOo = view;
        if (view != null && (linearLayout = this.OooOOo0) != null) {
            removeView(linearLayout);
            this.OooOOo0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.OooOOO0 = charSequence;
        OooO0Oo();
    }

    public void setTitle(CharSequence charSequence) {
        this.OooOO0o = charSequence;
        OooO0Oo();
        nt1.OooOOO(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.OooOo0O) {
            requestLayout();
        }
        this.OooOo0O = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
