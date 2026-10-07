package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.cmaster.cloner.R;
import com.cmaster.cloner.bq0;
import com.cmaster.cloner.f0;
import com.cmaster.cloner.hn0;
import com.cmaster.cloner.k61;
import com.cmaster.cloner.oOOO00Oo;
import com.cmaster.cloner.s62;
import com.cmaster.cloner.t82;
import com.cmaster.cloner.u;
import com.cmaster.cloner.wq0;
import com.cmaster.cloner.wv2;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends oOOO00Oo {
    public final AccessibilityManager OooO;
    public final hn0 OooO0oo;
    public final Rect OooOO0;
    public final int OooOO0O;
    public final float OooOO0o;
    public int OooOOO;
    public ColorStateList OooOOO0;
    public ColorStateList OooOOOO;

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(s62.OooO00o(context, attributeSet, i, 0), attributeSet, i);
        this.OooOO0 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = t82.OooO0Oo(context2, attributeSet, k61.OooOO0O, i, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayOooO0Oo.hasValue(0) && typedArrayOooO0Oo.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.OooOO0O = typedArrayOooO0Oo.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.OooOO0o = typedArrayOooO0Oo.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int i2 = 2;
        if (typedArrayOooO0Oo.hasValue(2)) {
            this.OooOOO0 = ColorStateList.valueOf(typedArrayOooO0Oo.getColor(2, 0));
        }
        this.OooOOO = typedArrayOooO0Oo.getColor(4, 0);
        this.OooOOOO = wv2.OooO00o(context2, typedArrayOooO0Oo, 5);
        this.OooO = (AccessibilityManager) context2.getSystemService("accessibility");
        hn0 hn0Var = new hn0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.OooO0oo = hn0Var;
        hn0Var.OooOoo0 = true;
        u uVar = hn0Var.OooOoo;
        uVar.setFocusable(true);
        hn0Var.OooOOo = this;
        uVar.setInputMethodMode(2);
        hn0Var.OooOOOO(getAdapter());
        hn0Var.OooOOoo = new f0(this, i2);
        if (typedArrayOooO0Oo.hasValue(6)) {
            setSimpleItems(typedArrayOooO0Oo.getResourceId(6, 0));
        }
        typedArrayOooO0Oo.recycle();
    }

    public final TextInputLayout OooO0O0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean OooO0OO() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.OooO;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (OooO0OO()) {
            this.OooO0oo.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.OooOOO0;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
        return (textInputLayoutOooO0O0 == null || !textInputLayoutOooO0O0.Oooo0) ? super.getHint() : textInputLayoutOooO0O0.getHint();
    }

    public float getPopupElevation() {
        return this.OooOO0o;
    }

    public int getSimpleItemSelectedColor() {
        return this.OooOOO;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.OooOOOO;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
        if (textInputLayoutOooO0O0 != null && textInputLayoutOooO0O0.Oooo0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.OooO0oo.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutOooO0O0 != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                hn0 hn0Var = this.OooO0oo;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !hn0Var.OooOoo.isShowing() ? -1 : hn0Var.OooO0o.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutOooO0O0);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = hn0Var.OooOoo.getBackground();
                if (background != null) {
                    Rect rect = this.OooOO0;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutOooO0O0.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (OooO0OO()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.OooO0oo.OooOOOO(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        hn0 hn0Var = this.OooO0oo;
        if (hn0Var != null) {
            hn0Var.OooO0oO(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.OooOOO0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof wq0) {
            ((wq0) dropDownBackground).OooOO0o(this.OooOOO0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.OooO0oo.OooOo00 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
        if (textInputLayoutOooO0O0 != null) {
            textInputLayoutOooO0O0.OooOo0();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.OooOOO = i;
        if (getAdapter() instanceof bq0) {
            ((bq0) getAdapter()).OooO00o();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.OooOOOO = colorStateList;
        if (getAdapter() instanceof bq0) {
            ((bq0) getAdapter()).OooO00o();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new bq0(this, getContext(), this.OooOO0O, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (OooO0OO()) {
            this.OooO0oo.OooO();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }
}
