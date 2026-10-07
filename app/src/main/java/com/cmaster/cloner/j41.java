package com.cmaster.cloner;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class j41 extends o10 {
    public n41 OoooOoo;
    public RecyclerView Ooooo00;
    public boolean Ooooo0o;
    public boolean OooooO0;
    public final i41 OoooOoO = new i41(this);
    public int OooooOO = R.layout.preference_list_fragment;
    public final oOo00o0o OooooOo = new oOo00o0o(this, Looper.getMainLooper(), 3);
    public final o00OOO00 Oooooo0 = new o00OOO00(this, 27);

    @Override // com.cmaster.cloner.o10
    public final void OooOoO0(Bundle bundle) {
        super.OooOoO0(bundle);
        TypedValue typedValue = new TypedValue();
        Oooo().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        Oooo().getTheme().applyStyle(i, false);
        n41 n41Var = new n41(Oooo());
        this.OoooOoo = n41Var;
        n41Var.OooO0oo = this;
        Bundle bundle2 = this.OooO;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        OoooOOO();
    }

    @Override // com.cmaster.cloner.o10
    public final View OooOoOO(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = Oooo().obtainStyledAttributes(null, i61.OooO0oo, R.attr.preferenceFragmentCompatStyle, 0);
        this.OooooOO = typedArrayObtainStyledAttributes.getResourceId(0, this.OooooOO);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(Oooo());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.OooooOO, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            qa.OooO0o("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!Oooo().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            Oooo();
            recyclerView.setLayoutManager(new LinearLayoutManager(0));
            recyclerView.setAccessibilityDelegateCompat(new o41(recyclerView));
        }
        this.Ooooo00 = recyclerView;
        i41 i41Var = this.OoooOoO;
        recyclerView.OooOO0O(i41Var);
        if (drawable != null) {
            i41Var.getClass();
            i41Var.OooO0o0 = drawable.getIntrinsicHeight();
        } else {
            i41Var.OooO0o0 = 0;
        }
        i41Var.OooO0Oo = drawable;
        j41 j41Var = i41Var.OooO0oO;
        RecyclerView recyclerView2 = j41Var.Ooooo00;
        if (recyclerView2.OooOOoo.size() != 0) {
            i71 i71Var = recyclerView2.OooOOo0;
            if (i71Var != null) {
                i71Var.OooO0OO("Cannot invalidate item decorations during a scroll or layout");
            }
            recyclerView2.OoooO();
            recyclerView2.requestLayout();
        }
        if (dimensionPixelSize != -1) {
            i41Var.OooO0o0 = dimensionPixelSize;
            RecyclerView recyclerView3 = j41Var.Ooooo00;
            if (recyclerView3.OooOOoo.size() != 0) {
                i71 i71Var2 = recyclerView3.OooOOo0;
                if (i71Var2 != null) {
                    i71Var2.OooO0OO("Cannot invalidate item decorations during a scroll or layout");
                }
                recyclerView3.OoooO();
                recyclerView3.requestLayout();
            }
        }
        i41Var.OooO0o = z;
        if (this.Ooooo00.getParent() == null) {
            viewGroup2.addView(this.Ooooo00);
        }
        this.OooooOo.post(this.Oooooo0);
        return viewInflate;
    }

    @Override // com.cmaster.cloner.o10
    public final void OooOoo() {
        o00OOO00 o00ooo00 = this.Oooooo0;
        oOo00o0o ooo00o0o = this.OooooOo;
        ooo00o0o.removeCallbacks(o00ooo00);
        ooo00o0o.removeMessages(1);
        if (this.Ooooo0o) {
            this.Ooooo00.setAdapter(null);
            PreferenceScreen preferenceScreen = this.OoooOoo.OooO0o0;
            if (preferenceScreen != null) {
                preferenceScreen.OooOOO0();
            }
        }
        this.Ooooo00 = null;
        this.Oooo00O = true;
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo0() {
        this.Oooo00O = true;
        n41 n41Var = this.OoooOoo;
        n41Var.OooO0o = this;
        n41Var.OooO0oO = this;
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo00o(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.OoooOoo.OooO0o0;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.OooO0O0(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo0O0() {
        this.Oooo00O = true;
        n41 n41Var = this.OoooOoo;
        n41Var.OooO0o = null;
        n41Var.OooO0oO = null;
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo0OO(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.OoooOoo.OooO0o0) != null) {
            preferenceScreen2.OooO00o(bundle2);
        }
        if (this.Ooooo0o && (preferenceScreen = this.OoooOoo.OooO0o0) != null) {
            this.Ooooo00.setAdapter(new m41(preferenceScreen));
            preferenceScreen.OooO();
        }
        this.OooooO0 = true;
    }

    public abstract void OoooOOO();
}
