package com.cmaster.cloner;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ry1 extends cm2 implements o00O00o0 {
    public qy1 OooO;
    public Context OooO00o;
    public Context OooO0O0;
    public ActionBarOverlayLayout OooO0OO;
    public ActionBarContainer OooO0Oo;
    public ActionBarContextView OooO0o;
    public xn OooO0o0;
    public final View OooO0oO;
    public boolean OooO0oo;
    public qy1 OooOO0;
    public o0O000O OooOO0O;
    public boolean OooOO0o;
    public int OooOOO;
    public final ArrayList OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;
    public hu1 OooOOoo;
    public final na1 OooOo;
    public boolean OooOo0;
    public boolean OooOo00;
    public final py1 OooOo0O;
    public final py1 OooOo0o;
    public static final AccelerateInterpolator OooOoO0 = new AccelerateInterpolator();
    public static final DecelerateInterpolator OooOoO = new DecelerateInterpolator();

    public ry1(boolean z, Activity activity) {
        new ArrayList();
        this.OooOOO0 = new ArrayList();
        this.OooOOO = 0;
        this.OooOOOO = true;
        this.OooOOo = true;
        this.OooOo0O = new py1(this, 0);
        this.OooOo0o = new py1(this, 1);
        this.OooOo = new na1(this, 7);
        View decorView = activity.getWindow().getDecorView();
        OooOOoo(decorView);
        if (z) {
            return;
        }
        this.OooO0oO = decorView.findViewById(android.R.id.content);
    }

    @Override // com.cmaster.cloner.cm2
    public final boolean OooO(int i, KeyEvent keyEvent) {
        ss0 ss0Var;
        qy1 qy1Var = this.OooO;
        if (qy1Var == null || (ss0Var = qy1Var.OooO0oO) == null) {
            return false;
        }
        ss0Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return ss0Var.performShortcut(i, keyEvent, 0);
    }

    @Override // com.cmaster.cloner.cm2
    public final boolean OooO0O0() {
        on1 on1Var;
        xn xnVar = this.OooO0o0;
        if (xnVar == null || (on1Var = ((un1) xnVar).OooO00o.Oooo) == null || on1Var.OooO0o0 == null) {
            return false;
        }
        on1 on1Var2 = ((un1) xnVar).OooO00o.Oooo;
        vs0 vs0Var = on1Var2 == null ? null : on1Var2.OooO0o0;
        if (vs0Var == null) {
            return true;
        }
        vs0Var.collapseActionView();
        return true;
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooO0OO(boolean z) {
        if (z == this.OooOO0o) {
            return;
        }
        this.OooOO0o = z;
        ArrayList arrayList = this.OooOOO0;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        ra.OooOO0o();
    }

    @Override // com.cmaster.cloner.cm2
    public final int OooO0Oo() {
        return ((un1) this.OooO0o0).OooO0O0;
    }

    @Override // com.cmaster.cloner.cm2
    public final Context OooO0o0() {
        if (this.OooO0O0 == null) {
            TypedValue typedValue = new TypedValue();
            this.OooO00o.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.OooO0O0 = new ContextThemeWrapper(this.OooO00o, i);
            } else {
                this.OooO0O0 = this.OooO00o;
            }
        }
        return this.OooO0O0;
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooO0oO() {
        OooOo00(this.OooO00o.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooOO0o(boolean z) throws Resources.NotFoundException {
        if (this.OooO0oo) {
            return;
        }
        OooOOO0(z);
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooOOO(boolean z) {
        hu1 hu1Var;
        this.OooOo00 = z;
        if (z || (hu1Var = this.OooOOoo) == null) {
            return;
        }
        hu1Var.OooO00o();
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooOOO0(boolean z) throws Resources.NotFoundException {
        int i = z ? 4 : 0;
        un1 un1Var = (un1) this.OooO0o0;
        int i2 = un1Var.OooO0O0;
        this.OooO0oo = true;
        un1Var.OooO00o((i & 4) | (i2 & (-5)));
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooOOOO(int i) throws Resources.NotFoundException {
        String string = this.OooO00o.getString(i);
        un1 un1Var = (un1) this.OooO0o0;
        un1Var.OooO0oO = true;
        Toolbar toolbar = un1Var.OooO00o;
        un1Var.OooO0oo = string;
        if ((un1Var.OooO0O0 & 8) != 0) {
            toolbar.setTitle(string);
            if (un1Var.OooO0oO) {
                nt1.OooOOO(toolbar.getRootView(), string);
            }
        }
    }

    @Override // com.cmaster.cloner.cm2
    public final void OooOOOo(CharSequence charSequence) throws Resources.NotFoundException {
        un1 un1Var = (un1) this.OooO0o0;
        if (un1Var.OooO0oO) {
            return;
        }
        Toolbar toolbar = un1Var.OooO00o;
        un1Var.OooO0oo = charSequence;
        if ((un1Var.OooO0O0 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (un1Var.OooO0oO) {
                nt1.OooOOO(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void OooOOo(boolean z) {
        gu1 gu1VarOooO;
        gu1 gu1VarOooO2;
        boolean z2 = this.OooOOo0;
        if (z) {
            if (!z2) {
                this.OooOOo0 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.OooO0OO;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                OooOo0(false);
            }
        } else if (z2) {
            this.OooOOo0 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.OooO0OO;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            OooOo0(false);
        }
        boolean zIsLaidOut = this.OooO0Oo.isLaidOut();
        xn xnVar = this.OooO0o0;
        if (!zIsLaidOut) {
            if (z) {
                ((un1) xnVar).OooO00o.setVisibility(4);
                this.OooO0o.setVisibility(0);
                return;
            } else {
                ((un1) xnVar).OooO00o.setVisibility(0);
                this.OooO0o.setVisibility(8);
                return;
            }
        }
        if (z) {
            un1 un1Var = (un1) xnVar;
            gu1VarOooO = nt1.OooO00o(un1Var.OooO00o);
            gu1VarOooO.OooO00o(0.0f);
            gu1VarOooO.OooO0OO(100L);
            gu1VarOooO.OooO0Oo(new tn1(un1Var, 4));
            gu1VarOooO2 = this.OooO0o.OooO(0, 200L);
        } else {
            un1 un1Var2 = (un1) xnVar;
            gu1 gu1VarOooO00o = nt1.OooO00o(un1Var2.OooO00o);
            gu1VarOooO00o.OooO00o(1.0f);
            gu1VarOooO00o.OooO0OO(200L);
            gu1VarOooO00o.OooO0Oo(new tn1(un1Var2, 0));
            gu1VarOooO = this.OooO0o.OooO(8, 100L);
            gu1VarOooO2 = gu1VarOooO00o;
        }
        hu1 hu1Var = new hu1();
        ArrayList arrayList = hu1Var.OooO00o;
        arrayList.add(gu1VarOooO);
        View view = (View) gu1VarOooO.OooO00o.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) gu1VarOooO2.OooO00o.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(gu1VarOooO2);
        hu1Var.OooO0O0();
    }

    @Override // com.cmaster.cloner.cm2
    public final o00OO0O0 OooOOo0(o0O000O o0o000o) {
        qy1 qy1Var = this.OooO;
        if (qy1Var != null) {
            qy1Var.OooO00o();
        }
        this.OooO0OO.setHideOnContentScrollEnabled(false);
        this.OooO0o.OooO0o0();
        qy1 qy1Var2 = new qy1(this, this.OooO0o.getContext(), o0o000o);
        ss0 ss0Var = qy1Var2.OooO0oO;
        ss0Var.OooOo0o();
        try {
            if (!((ho1) qy1Var2.OooO0oo.OooO0o0).Oooo0(qy1Var2, ss0Var)) {
                return null;
            }
            this.OooO = qy1Var2;
            qy1Var2.OooO0oo();
            this.OooO0o.OooO0OO(qy1Var2);
            OooOOo(true);
            return qy1Var2;
        } finally {
            ss0Var.OooOo0O();
        }
    }

    public final void OooOOoo(View view) {
        xn wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.OooO0OO = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.action_bar);
        if (callbackFindViewById instanceof xn) {
            wrapper = (xn) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.OooO0o0 = wrapper;
        this.OooO0o = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.OooO0Oo = actionBarContainer;
        xn xnVar = this.OooO0o0;
        if (xnVar == null || this.OooO0o == null || actionBarContainer == null) {
            qa.OooO0o(ry1.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((un1) xnVar).OooO00o.getContext();
        this.OooO00o = context;
        if ((((un1) this.OooO0o0).OooO0O0 & 4) != 0) {
            this.OooO0oo = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.OooO0o0.getClass();
        OooOo00(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.OooO00o.obtainStyledAttributes(null, l61.OooO00o, R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.OooO0OO;
            if (!actionBarOverlayLayout2.OooOO0) {
                qa.OooO0o("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.OooOo0 = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.OooO0Oo;
            WeakHashMap weakHashMap = nt1.OooO00o;
            ft1.OooOO0(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooOo0(boolean z) {
        boolean z2 = this.OooOOo0 || !this.OooOOOo;
        boolean z3 = this.OooOOo;
        int i = 2;
        na1 na1Var = this.OooOo;
        View view = this.OooO0oO;
        if (!z2) {
            if (z3) {
                this.OooOOo = false;
                hu1 hu1Var = this.OooOOoo;
                if (hu1Var != null) {
                    hu1Var.OooO00o();
                }
                int i2 = this.OooOOO;
                py1 py1Var = this.OooOo0O;
                if (i2 != 0 || (!this.OooOo00 && !z)) {
                    py1Var.OooO0OO();
                    return;
                }
                this.OooO0Oo.setAlpha(1.0f);
                this.OooO0Oo.setTransitioning(true);
                hu1 hu1Var2 = new hu1();
                float f = -this.OooO0Oo.getHeight();
                if (z) {
                    this.OooO0Oo.getLocationInWindow(new int[]{0, 0});
                    f -= r13[1];
                }
                gu1 gu1VarOooO00o = nt1.OooO00o(this.OooO0Oo);
                gu1VarOooO00o.OooO0o0(f);
                View view2 = (View) gu1VarOooO00o.OooO00o.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(na1Var != null ? new oOO0Oo00(na1Var, view2, i) : null);
                }
                boolean z4 = hu1Var2.OooO0o0;
                ArrayList arrayList = hu1Var2.OooO00o;
                if (!z4) {
                    arrayList.add(gu1VarOooO00o);
                }
                if (this.OooOOOO && view != null) {
                    gu1 gu1VarOooO00o2 = nt1.OooO00o(view);
                    gu1VarOooO00o2.OooO0o0(f);
                    if (!hu1Var2.OooO0o0) {
                        arrayList.add(gu1VarOooO00o2);
                    }
                }
                boolean z5 = hu1Var2.OooO0o0;
                if (!z5) {
                    hu1Var2.OooO0OO = OooOoO0;
                }
                if (!z5) {
                    hu1Var2.OooO0O0 = 250L;
                }
                if (!z5) {
                    hu1Var2.OooO0Oo = py1Var;
                }
                this.OooOOoo = hu1Var2;
                hu1Var2.OooO0O0();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.OooOOo = true;
        hu1 hu1Var3 = this.OooOOoo;
        if (hu1Var3 != null) {
            hu1Var3.OooO00o();
        }
        this.OooO0Oo.setVisibility(0);
        int i3 = this.OooOOO;
        py1 py1Var2 = this.OooOo0o;
        if (i3 == 0 && (this.OooOo00 || z)) {
            this.OooO0Oo.setTranslationY(0.0f);
            float f2 = -this.OooO0Oo.getHeight();
            if (z) {
                this.OooO0Oo.getLocationInWindow(new int[]{0, 0});
                f2 -= r13[1];
            }
            this.OooO0Oo.setTranslationY(f2);
            hu1 hu1Var4 = new hu1();
            gu1 gu1VarOooO00o3 = nt1.OooO00o(this.OooO0Oo);
            gu1VarOooO00o3.OooO0o0(0.0f);
            View view3 = (View) gu1VarOooO00o3.OooO00o.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(na1Var != null ? new oOO0Oo00(na1Var, view3, i) : null);
            }
            boolean z6 = hu1Var4.OooO0o0;
            ArrayList arrayList2 = hu1Var4.OooO00o;
            if (!z6) {
                arrayList2.add(gu1VarOooO00o3);
            }
            if (this.OooOOOO && view != null) {
                view.setTranslationY(f2);
                gu1 gu1VarOooO00o4 = nt1.OooO00o(view);
                gu1VarOooO00o4.OooO0o0(0.0f);
                if (!hu1Var4.OooO0o0) {
                    arrayList2.add(gu1VarOooO00o4);
                }
            }
            boolean z7 = hu1Var4.OooO0o0;
            if (!z7) {
                hu1Var4.OooO0OO = OooOoO;
            }
            if (!z7) {
                hu1Var4.OooO0O0 = 250L;
            }
            if (!z7) {
                hu1Var4.OooO0Oo = py1Var2;
            }
            this.OooOOoo = hu1Var4;
            hu1Var4.OooO0O0();
        } else {
            this.OooO0Oo.setAlpha(1.0f);
            this.OooO0Oo.setTranslationY(0.0f);
            if (this.OooOOOO && view != null) {
                view.setTranslationY(0.0f);
            }
            py1Var2.OooO0OO();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.OooO0OO;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = nt1.OooO00o;
            dt1.OooO0OO(actionBarOverlayLayout);
        }
    }

    public final void OooOo00(boolean z) {
        if (z) {
            this.OooO0Oo.setTabContainer(null);
            ((un1) this.OooO0o0).getClass();
        } else {
            ((un1) this.OooO0o0).getClass();
            this.OooO0Oo.setTabContainer(null);
        }
        this.OooO0o0.getClass();
        ((un1) this.OooO0o0).OooO00o.setCollapsible(false);
        this.OooO0OO.setHasNonEmbeddedTabs(false);
    }

    public ry1(Dialog dialog) {
        new ArrayList();
        this.OooOOO0 = new ArrayList();
        this.OooOOO = 0;
        this.OooOOOO = true;
        this.OooOOo = true;
        this.OooOo0O = new py1(this, 0);
        this.OooOo0o = new py1(this, 1);
        this.OooOo = new na1(this, 7);
        OooOOoo(dialog.getWindow().getDecorView());
    }
}
