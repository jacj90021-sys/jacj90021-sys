package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.cmaster.cloner.R;
import com.cmaster.cloner.a02;
import com.cmaster.cloner.e20;
import com.cmaster.cloner.fk1;
import com.cmaster.cloner.jc1;
import com.cmaster.cloner.l61;
import com.cmaster.cloner.mn1;
import com.cmaster.cloner.na1;
import com.cmaster.cloner.nn1;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.nu1;
import com.cmaster.cloner.nz0;
import com.cmaster.cloner.o00O00O;
import com.cmaster.cloner.o00O0OOO;
import com.cmaster.cloner.on1;
import com.cmaster.cloner.pn1;
import com.cmaster.cloner.qn1;
import com.cmaster.cloner.r43;
import com.cmaster.cloner.rn1;
import com.cmaster.cloner.s;
import com.cmaster.cloner.ss0;
import com.cmaster.cloner.u91;
import com.cmaster.cloner.un1;
import com.cmaster.cloner.v8;
import com.cmaster.cloner.vs0;
import com.cmaster.cloner.xn;
import com.cmaster.cloner.ym2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final Drawable OooO;
    public ActionMenuView OooO0Oo;
    public AppCompatTextView OooO0o;
    public AppCompatTextView OooO0o0;
    public AppCompatImageButton OooO0oO;
    public s OooO0oo;
    public final CharSequence OooOO0;
    public AppCompatImageButton OooOO0O;
    public View OooOO0o;
    public int OooOOO;
    public Context OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public final int OooOOo;
    public final int OooOOo0;
    public int OooOOoo;
    public int OooOo;
    public int OooOo0;
    public int OooOo00;
    public int OooOo0O;
    public jc1 OooOo0o;
    public final int OooOoO;
    public int OooOoO0;
    public CharSequence OooOoOO;
    public ColorStateList OooOoo;
    public CharSequence OooOoo0;
    public ColorStateList OooOooO;
    public boolean OooOooo;
    public on1 Oooo;
    public final int[] Oooo0;
    public boolean Oooo000;
    public final ArrayList Oooo00O;
    public final ArrayList Oooo00o;
    public final a02 Oooo0O0;
    public ArrayList Oooo0OO;
    public final nz0 Oooo0o;
    public qn1 Oooo0o0;
    public un1 Oooo0oO;
    public o00O0OOO Oooo0oo;
    public OnBackInvokedCallback OoooO;
    public nz0 OoooO0;
    public v8 OoooO00;
    public boolean OoooO0O;
    public OnBackInvokedDispatcher OoooOO0;
    public final u91 OoooOOO;
    public boolean o000oOoO;

    public Toolbar(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.OooOoO = 8388627;
        this.Oooo00O = new ArrayList();
        this.Oooo00o = new ArrayList();
        this.Oooo0 = new int[2];
        this.Oooo0O0 = new a02(new mn1(this, 1));
        this.Oooo0OO = new ArrayList();
        this.Oooo0o = new nz0(this, 6);
        this.OoooOOO = new u91(this, 5);
        Context context2 = getContext();
        int[] iArr = l61.OooOoO0;
        a02 a02VarOooo0OO = a02.Oooo0OO(context2, attributeSet, iArr, i);
        nt1.OooOO0o(this, context, iArr, attributeSet, (TypedArray) a02VarOooo0OO.OooO0o, i);
        TypedArray typedArray = (TypedArray) a02VarOooo0OO.OooO0o;
        this.OooOOOO = typedArray.getResourceId(28, 0);
        this.OooOOOo = typedArray.getResourceId(19, 0);
        this.OooOoO = typedArray.getInteger(0, 8388627);
        this.OooOOo0 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.OooOo0O = dimensionPixelOffset;
        this.OooOo0 = dimensionPixelOffset;
        this.OooOo00 = dimensionPixelOffset;
        this.OooOOoo = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.OooOOoo = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.OooOo00 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.OooOo0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.OooOo0O = dimensionPixelOffset5;
        }
        this.OooOOo = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        OooO0Oo();
        jc1 jc1Var = this.OooOo0o;
        jc1Var.OooO0oo = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            jc1Var.OooO0o0 = dimensionPixelSize;
            jc1Var.OooO00o = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            jc1Var.OooO0o = dimensionPixelSize2;
            jc1Var.OooO0O0 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            jc1Var.OooO00o(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.OooOo = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.OooOoO0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.OooO = a02VarOooo0OO.OooOOo(4);
        this.OooOO0 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.OooOOO0 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableOooOOo = a02VarOooo0OO.OooOOo(16);
        if (drawableOooOOo != null) {
            setNavigationIcon(drawableOooOOo);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableOooOOo2 = a02VarOooo0OO.OooOOo(11);
        if (drawableOooOOo2 != null) {
            setLogo(drawableOooOOo2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(a02VarOooo0OO.OooOOOo(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(a02VarOooo0OO.OooOOOo(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        a02VarOooo0OO.Oooo0oO();
    }

    public static pn1 OooO(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof pn1;
        if (z) {
            pn1 pn1Var = (pn1) layoutParams;
            pn1 pn1Var2 = new pn1(pn1Var);
            pn1Var2.OooO0O0 = 0;
            pn1Var2.OooO0O0 = pn1Var.OooO0O0;
            return pn1Var2;
        }
        if (z) {
            pn1 pn1Var3 = new pn1((pn1) layoutParams);
            pn1Var3.OooO0O0 = 0;
            return pn1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            pn1 pn1Var4 = new pn1(layoutParams);
            pn1Var4.OooO0O0 = 0;
            return pn1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        pn1 pn1Var5 = new pn1(marginLayoutParams);
        pn1Var5.OooO0O0 = 0;
        ((ViewGroup.MarginLayoutParams) pn1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) pn1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) pn1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) pn1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return pn1Var5;
    }

    public static pn1 OooO0oo() {
        pn1 pn1Var = new pn1(-2, -2);
        pn1Var.OooO0O0 = 0;
        pn1Var.OooO00o = 8388627;
        return pn1Var;
    }

    public static int OooOO0O(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int OooOO0o(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new fk1(getContext());
    }

    public final void OooO00o(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                pn1 pn1Var = (pn1) childAt.getLayoutParams();
                if (pn1Var.OooO0O0 == 0 && OooOo00(childAt)) {
                    int i3 = pn1Var.OooO00o;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            pn1 pn1Var2 = (pn1) childAt2.getLayoutParams();
            if (pn1Var2.OooO0O0 == 0 && OooOo00(childAt2)) {
                int i5 = pn1Var2.OooO00o;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void OooO0O0(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        pn1 pn1VarOooO0oo = layoutParams == null ? OooO0oo() : !checkLayoutParams(layoutParams) ? OooO(layoutParams) : (pn1) layoutParams;
        pn1VarOooO0oo.OooO0O0 = 1;
        if (!z || this.OooOO0o == null) {
            addView(view, pn1VarOooO0oo);
        } else {
            view.setLayoutParams(pn1VarOooO0oo);
            this.Oooo00o.add(view);
        }
    }

    public final void OooO0OO() {
        if (this.OooOO0O == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.OooOO0O = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.OooO);
            this.OooOO0O.setContentDescription(this.OooOO0);
            pn1 pn1VarOooO0oo = OooO0oo();
            pn1VarOooO0oo.OooO00o = (this.OooOOo0 & 112) | 8388611;
            pn1VarOooO0oo.OooO0O0 = 2;
            this.OooOO0O.setLayoutParams(pn1VarOooO0oo);
            this.OooOO0O.setOnClickListener(new o00O00O(this, 4));
        }
    }

    public final void OooO0Oo() {
        if (this.OooOo0o == null) {
            jc1 jc1Var = new jc1();
            jc1Var.OooO00o = 0;
            jc1Var.OooO0O0 = 0;
            jc1Var.OooO0OO = Integer.MIN_VALUE;
            jc1Var.OooO0Oo = Integer.MIN_VALUE;
            jc1Var.OooO0o0 = 0;
            jc1Var.OooO0o = 0;
            jc1Var.OooO0oO = false;
            jc1Var.OooO0oo = false;
            this.OooOo0o = jc1Var;
        }
    }

    public final void OooO0o() {
        if (this.OooO0Oo == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.OooO0Oo = actionMenuView;
            actionMenuView.setPopupTheme(this.OooOOO);
            this.OooO0Oo.setOnMenuItemClickListener(this.Oooo0o);
            ActionMenuView actionMenuView2 = this.OooO0Oo;
            v8 v8Var = this.OoooO00;
            na1 na1Var = new na1(this, 3);
            actionMenuView2.OooOo = v8Var;
            actionMenuView2.OooOoO0 = na1Var;
            pn1 pn1VarOooO0oo = OooO0oo();
            pn1VarOooO0oo.OooO00o = (this.OooOOo0 & 112) | 8388613;
            this.OooO0Oo.setLayoutParams(pn1VarOooO0oo);
            OooO0O0(this.OooO0Oo, false);
        }
    }

    public final void OooO0o0() {
        OooO0o();
        ActionMenuView actionMenuView = this.OooO0Oo;
        if (actionMenuView.OooOOoo == null) {
            ss0 ss0Var = (ss0) actionMenuView.getMenu();
            if (this.Oooo == null) {
                this.Oooo = new on1(this);
            }
            this.OooO0Oo.setExpandedActionViewsExclusive(true);
            ss0Var.OooO0O0(this.Oooo, this.OooOOO0);
            OooOo0O();
        }
    }

    public final void OooO0oO() {
        if (this.OooO0oO == null) {
            this.OooO0oO = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            pn1 pn1VarOooO0oo = OooO0oo();
            pn1VarOooO0oo.OooO00o = (this.OooOOo0 & 112) | 8388611;
            this.OooO0oO.setLayoutParams(pn1VarOooO0oo);
        }
    }

    public final int OooOO0(View view, int i) {
        pn1 pn1Var = (pn1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = pn1Var.OooO00o & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.OooOoO & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) pn1Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) pn1Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) pn1Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final boolean OooOOO(View view) {
        return view.getParent() == this || this.Oooo00o.contains(view);
    }

    public final void OooOOO0() {
        ArrayList arrayList = this.Oooo0OO;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.Oooo0O0.OooO0o).iterator();
        while (it.hasNext()) {
            ((e20) it.next()).OooO00o.OooOO0(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.Oooo0OO = currentMenuItems2;
    }

    public final boolean OooOOOO() {
        o00O0OOO o00o0ooo;
        ActionMenuView actionMenuView = this.OooO0Oo;
        return (actionMenuView == null || (o00o0ooo = actionMenuView.OooOo0o) == null || !o00o0ooo.OooOO0O()) ? false : true;
    }

    public final int OooOOOo(View view, int i, int i2, int[] iArr) {
        pn1 pn1Var = (pn1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) pn1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iOooOO0 = OooOO0(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iOooOO0, iMax + measuredWidth, view.getMeasuredHeight() + iOooOO0);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) pn1Var).rightMargin + iMax;
    }

    public final int OooOOo(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final int OooOOo0(View view, int i, int i2, int[] iArr) {
        pn1 pn1Var = (pn1) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) pn1Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iOooOO0 = OooOO0(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iOooOO0, iMax, view.getMeasuredHeight() + iOooOO0);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) pn1Var).leftMargin);
    }

    public final void OooOOoo(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean OooOo0() {
        o00O0OOO o00o0ooo;
        ActionMenuView actionMenuView = this.OooO0Oo;
        return (actionMenuView == null || (o00o0ooo = actionMenuView.OooOo0o) == null || !o00o0ooo.OooOO0o()) ? false : true;
    }

    public final boolean OooOo00(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void OooOo0O() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherOooO00o = nn1.OooO00o(this);
            on1 on1Var = this.Oooo;
            int i = 0;
            boolean z = (on1Var == null || on1Var.OooO0o0 == null || onBackInvokedDispatcherOooO00o == null || !isAttachedToWindow() || !this.o000oOoO) ? false : true;
            if (z && this.OoooOO0 == null) {
                if (this.OoooO == null) {
                    this.OoooO = nn1.OooO0O0(new mn1(this, i));
                }
                nn1.OooO0OO(onBackInvokedDispatcherOooO00o, this.OoooO);
                this.OoooOO0 = onBackInvokedDispatcherOooO00o;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.OoooOO0) == null) {
                return;
            }
            nn1.OooO0Oo(onBackInvokedDispatcher, this.OoooO);
            this.OoooOO0 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof pn1);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return OooO0oo();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        pn1 pn1Var = new pn1(context, attributeSet);
        pn1Var.OooO00o = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l61.OooO0O0);
        pn1Var.OooO00o = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        pn1Var.OooO0O0 = 0;
        return pn1Var;
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.OooOO0O;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.OooOO0O;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        jc1 jc1Var = this.OooOo0o;
        if (jc1Var != null) {
            return jc1Var.OooO0oO ? jc1Var.OooO00o : jc1Var.OooO0O0;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.OooOoO0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        jc1 jc1Var = this.OooOo0o;
        if (jc1Var != null) {
            return jc1Var.OooO00o;
        }
        return 0;
    }

    public int getContentInsetRight() {
        jc1 jc1Var = this.OooOo0o;
        if (jc1Var != null) {
            return jc1Var.OooO0O0;
        }
        return 0;
    }

    public int getContentInsetStart() {
        jc1 jc1Var = this.OooOo0o;
        if (jc1Var != null) {
            return jc1Var.OooO0oO ? jc1Var.OooO0O0 : jc1Var.OooO00o;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.OooOo;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        ss0 ss0Var;
        ActionMenuView actionMenuView = this.OooO0Oo;
        return (actionMenuView == null || (ss0Var = actionMenuView.OooOOoo) == null || !ss0Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.OooOoO0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.OooOo, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        s sVar = this.OooO0oo;
        if (sVar != null) {
            return sVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        s sVar = this.OooO0oo;
        if (sVar != null) {
            return sVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        OooO0o0();
        return this.OooO0Oo.getMenu();
    }

    public View getNavButtonView() {
        return this.OooO0oO;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.OooO0oO;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.OooO0oO;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public o00O0OOO getOuterActionMenuPresenter() {
        return this.Oooo0oo;
    }

    public Drawable getOverflowIcon() {
        OooO0o0();
        return this.OooO0Oo.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.OooOOO0;
    }

    public int getPopupTheme() {
        return this.OooOOO;
    }

    public CharSequence getSubtitle() {
        return this.OooOoo0;
    }

    public final TextView getSubtitleTextView() {
        return this.OooO0o;
    }

    public CharSequence getTitle() {
        return this.OooOoOO;
    }

    public int getTitleMarginBottom() {
        return this.OooOo0O;
    }

    public int getTitleMarginEnd() {
        return this.OooOo00;
    }

    public int getTitleMarginStart() {
        return this.OooOOoo;
    }

    public int getTitleMarginTop() {
        return this.OooOo0;
    }

    public final TextView getTitleTextView() {
        return this.OooO0o0;
    }

    public xn getWrapper() {
        if (this.Oooo0oO == null) {
            this.Oooo0oO = new un1(this, true);
        }
        return this.Oooo0oO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOo0O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.OoooOOO);
        OooOo0O();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.Oooo000 = false;
        }
        if (!this.Oooo000) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.Oooo000 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.Oooo000 = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iOooOO0O;
        int iMax;
        int iCombineMeasuredStates;
        int iOooOO0O2;
        int iOooOO0o;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = nu1.OooO00o;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (OooOo00(this.OooO0oO)) {
            OooOOoo(this.OooO0oO, i, 0, i2, this.OooOOo);
            iOooOO0O = OooOO0O(this.OooO0oO) + this.OooO0oO.getMeasuredWidth();
            iMax = Math.max(0, OooOO0o(this.OooO0oO) + this.OooO0oO.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.OooO0oO.getMeasuredState());
        } else {
            iOooOO0O = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (OooOo00(this.OooOO0O)) {
            OooOOoo(this.OooOO0O, i, 0, i2, this.OooOOo);
            iOooOO0O = OooOO0O(this.OooOO0O) + this.OooOO0O.getMeasuredWidth();
            iMax = Math.max(iMax, OooOO0o(this.OooOO0O) + this.OooOO0O.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.OooOO0O.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iOooOO0O);
        int iMax4 = Math.max(0, currentContentInsetStart - iOooOO0O);
        Object[] objArr2 = objArr;
        int[] iArr = this.Oooo0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (OooOo00(this.OooO0Oo)) {
            OooOOoo(this.OooO0Oo, i, iMax3, i2, this.OooOOo);
            iOooOO0O2 = OooOO0O(this.OooO0Oo) + this.OooO0Oo.getMeasuredWidth();
            iMax = Math.max(iMax, OooOO0o(this.OooO0Oo) + this.OooO0Oo.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.OooO0Oo.getMeasuredState());
        } else {
            iOooOO0O2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iOooOO0O2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iOooOO0O2);
        if (OooOo00(this.OooOO0o)) {
            iMax5 += OooOOo(this.OooOO0o, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, OooOO0o(this.OooOO0o) + this.OooOO0o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.OooOO0o.getMeasuredState());
        }
        if (OooOo00(this.OooO0oo)) {
            iMax5 += OooOOo(this.OooO0oo, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, OooOO0o(this.OooO0oo) + this.OooO0oo.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.OooO0oo.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((pn1) childAt.getLayoutParams()).OooO0O0 == 0 && OooOo00(childAt)) {
                iMax5 += OooOOo(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, OooOO0o(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.OooOo0 + this.OooOo0O;
        int i7 = this.OooOOoo + this.OooOo00;
        if (OooOo00(this.OooO0o0)) {
            OooOOo(this.OooO0o0, i, i5 + i7, i2, i6, iArr);
            int iOooOO0O3 = OooOO0O(this.OooO0o0) + this.OooO0o0.getMeasuredWidth();
            iOooOO0o = OooOO0o(this.OooO0o0) + this.OooO0o0.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.OooO0o0.getMeasuredState());
            iMax2 = iOooOO0O3;
        } else {
            iOooOO0o = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (OooOo00(this.OooO0o)) {
            iMax2 = Math.max(iMax2, OooOOo(this.OooO0o, i, i5 + i7, i2, i6 + iOooOO0o, iArr));
            iOooOO0o += OooOO0o(this.OooO0o) + this.OooO0o.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.OooO0o.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iOooOO0o);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.OoooO0O) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (OooOo00(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof rn1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        rn1 rn1Var = (rn1) parcelable;
        super.onRestoreInstanceState(rn1Var.OooO0Oo);
        ActionMenuView actionMenuView = this.OooO0Oo;
        ss0 ss0Var = actionMenuView != null ? actionMenuView.OooOOoo : null;
        int i = rn1Var.OooO0o;
        if (i != 0 && this.Oooo != null && ss0Var != null && (menuItemFindItem = ss0Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (rn1Var.OooO0oO) {
            u91 u91Var = this.OoooOOO;
            removeCallbacks(u91Var);
            post(u91Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        OooO0Oo();
        jc1 jc1Var = this.OooOo0o;
        boolean z = i == 1;
        if (z == jc1Var.OooO0oO) {
            return;
        }
        jc1Var.OooO0oO = z;
        if (!jc1Var.OooO0oo) {
            jc1Var.OooO00o = jc1Var.OooO0o0;
            jc1Var.OooO0O0 = jc1Var.OooO0o;
            return;
        }
        if (z) {
            int i2 = jc1Var.OooO0Oo;
            if (i2 == Integer.MIN_VALUE) {
                i2 = jc1Var.OooO0o0;
            }
            jc1Var.OooO00o = i2;
            int i3 = jc1Var.OooO0OO;
            if (i3 == Integer.MIN_VALUE) {
                i3 = jc1Var.OooO0o;
            }
            jc1Var.OooO0O0 = i3;
            return;
        }
        int i4 = jc1Var.OooO0OO;
        if (i4 == Integer.MIN_VALUE) {
            i4 = jc1Var.OooO0o0;
        }
        jc1Var.OooO00o = i4;
        int i5 = jc1Var.OooO0Oo;
        if (i5 == Integer.MIN_VALUE) {
            i5 = jc1Var.OooO0o;
        }
        jc1Var.OooO0O0 = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        vs0 vs0Var;
        rn1 rn1Var = new rn1(super.onSaveInstanceState());
        on1 on1Var = this.Oooo;
        if (on1Var != null && (vs0Var = on1Var.OooO0o0) != null) {
            rn1Var.OooO0o = vs0Var.OooO0Oo;
        }
        rn1Var.OooO0oO = OooOOOO();
        return rn1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.OooOooo = false;
        }
        if (!this.OooOooo) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.OooOooo = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.OooOooo = false;
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.o000oOoO != z) {
            this.o000oOoO = z;
            OooOo0O();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            OooO0OO();
        }
        AppCompatImageButton appCompatImageButton = this.OooOO0O;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            OooO0OO();
            this.OooOO0O.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.OooOO0O;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.OooO);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.OoooO0O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.OooOoO0) {
            this.OooOoO0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.OooOo) {
            this.OooOo = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        s sVar = this.OooO0oo;
        if (drawable != null) {
            if (sVar == null) {
                this.OooO0oo = new s(getContext(), null, 0);
            }
            if (!OooOOO(this.OooO0oo)) {
                OooO0O0(this.OooO0oo, true);
            }
        } else if (sVar != null && OooOOO(sVar)) {
            removeView(this.OooO0oo);
            this.Oooo00o.remove(this.OooO0oo);
        }
        s sVar2 = this.OooO0oo;
        if (sVar2 != null) {
            sVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.OooO0oo == null) {
            this.OooO0oo = new s(getContext(), null, 0);
        }
        s sVar = this.OooO0oo;
        if (sVar != null) {
            sVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            OooO0oO();
        }
        AppCompatImageButton appCompatImageButton = this.OooO0oO;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            r43.OooO00o(this.OooO0oO, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            OooO0oO();
            if (!OooOOO(this.OooO0oO)) {
                OooO0O0(this.OooO0oO, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.OooO0oO;
            if (appCompatImageButton != null && OooOOO(appCompatImageButton)) {
                removeView(this.OooO0oO);
                this.Oooo00o.remove(this.OooO0oO);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.OooO0oO;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        OooO0oO();
        this.OooO0oO.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(qn1 qn1Var) {
        this.Oooo0o0 = qn1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        OooO0o0();
        this.OooO0Oo.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.OooOOO != i) {
            this.OooOOO = i;
            if (i == 0) {
                this.OooOOO0 = getContext();
            } else {
                this.OooOOO0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.OooO0o;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.OooO0o = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.OooO0o.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.OooOOOo;
                if (i != 0) {
                    this.OooO0o.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.OooOooO;
                if (colorStateList != null) {
                    this.OooO0o.setTextColor(colorStateList);
                }
            }
            if (!OooOOO(this.OooO0o)) {
                OooO0O0(this.OooO0o, true);
            }
        } else if (appCompatTextView != null && OooOOO(appCompatTextView)) {
            removeView(this.OooO0o);
            this.Oooo00o.remove(this.OooO0o);
        }
        AppCompatTextView appCompatTextView3 = this.OooO0o;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.OooOoo0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.OooOooO = colorStateList;
        AppCompatTextView appCompatTextView = this.OooO0o;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.OooO0o0;
        if (!zIsEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
                this.OooO0o0 = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.OooO0o0.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.OooOOOO;
                if (i != 0) {
                    this.OooO0o0.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.OooOoo;
                if (colorStateList != null) {
                    this.OooO0o0.setTextColor(colorStateList);
                }
            }
            if (!OooOOO(this.OooO0o0)) {
                OooO0O0(this.OooO0o0, true);
            }
        } else if (appCompatTextView != null && OooOOO(appCompatTextView)) {
            removeView(this.OooO0o0);
            this.Oooo00o.remove(this.OooO0o0);
        }
        AppCompatTextView appCompatTextView3 = this.OooO0o0;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.OooOoOO = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.OooOo0O = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.OooOo00 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.OooOOoo = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.OooOo0 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.OooOoo = colorStateList;
        AppCompatTextView appCompatTextView = this.OooO0o0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(ym2.OooO00o(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooO(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(ym2.OooO00o(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(ym2.OooO00o(getContext(), i));
    }

    public void setSubtitle(int i) throws Resources.NotFoundException {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) throws Resources.NotFoundException {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
