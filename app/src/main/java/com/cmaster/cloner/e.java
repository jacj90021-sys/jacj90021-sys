package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e implements Window.Callback {
    public final /* synthetic */ k OooO;
    public final Window.Callback OooO0Oo;
    public boolean OooO0o;
    public na1 OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;

    public e(k kVar, Window.Callback callback) {
        this.OooO = kVar;
        if (callback != null) {
            this.OooO0Oo = callback;
        } else {
            ra.OooOOO("Window callback may not be null");
            throw null;
        }
    }

    public final void OooO00o(Window.Callback callback) {
        try {
            this.OooO0o = true;
            callback.onContentChanged();
        } finally {
            this.OooO0o = false;
        }
    }

    public final boolean OooO0O0(int i, Menu menu) {
        return this.OooO0Oo.onMenuOpened(i, menu);
    }

    public final void OooO0OO(int i, Menu menu) {
        this.OooO0Oo.onPanelClosed(i, menu);
    }

    public final void OooO0Oo(List list, Menu menu, int i) {
        ny1.OooO00o(this.OooO0Oo, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.OooO0Oo.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.OooO0oO;
        Window.Callback callback = this.OooO0Oo;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.OooO.OooOo0(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.OooO0Oo.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            k kVar = this.OooO;
            kVar.OooOoOO();
            cm2 cm2Var = kVar.OooOOo0;
            if (cm2Var == null || !cm2Var.OooO(keyCode, keyEvent)) {
                j jVar = kVar.Oooo;
                if (jVar == null || !kVar.Oooo000(jVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (kVar.Oooo == null) {
                        j jVarOooOoO = kVar.OooOoO(0);
                        kVar.Oooo00O(jVarOooOoO, keyEvent);
                        boolean zOooo000 = kVar.Oooo000(jVarOooOoO, keyEvent.getKeyCode(), keyEvent);
                        jVarOooOoO.OooOO0O = false;
                        if (zOooo000) {
                        }
                    }
                    return false;
                }
                j jVar2 = kVar.Oooo;
                if (jVar2 != null) {
                    jVar2.OooOO0o = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.OooO0Oo.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.OooO0Oo.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.OooO0Oo.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.OooO0Oo.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.OooO0Oo.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.OooO0Oo.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.OooO0o) {
            this.OooO0Oo.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof ss0)) {
            return this.OooO0Oo.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        na1 na1Var = this.OooO0o0;
        if (na1Var != null) {
            View view = i == 0 ? new View(((sn1) na1Var.OooO0o0).OooO00o.OooO00o.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.OooO0Oo.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.OooO0Oo.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.OooO0Oo.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        OooO0O0(i, menu);
        if (i == 108) {
            k kVar = this.OooO;
            kVar.OooOoOO();
            cm2 cm2Var = kVar.OooOOo0;
            if (cm2Var != null) {
                cm2Var.OooO0OO(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.OooO0oo) {
            this.OooO0Oo.onPanelClosed(i, menu);
            return;
        }
        OooO0OO(i, menu);
        k kVar = this.OooO;
        if (i == 108) {
            kVar.OooOoOO();
            cm2 cm2Var = kVar.OooOOo0;
            if (cm2Var != null) {
                cm2Var.OooO0OO(false);
                return;
            }
            return;
        }
        if (i == 0) {
            j jVarOooOoO = kVar.OooOoO(i);
            if (jVarOooOoO.OooOOO0) {
                kVar.OooOOoo(jVarOooOoO, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        oy1.OooO00o(this.OooO0Oo, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        ss0 ss0Var = menu instanceof ss0 ? (ss0) menu : null;
        if (i == 0 && ss0Var == null) {
            return false;
        }
        if (ss0Var != null) {
            ss0Var.OooOoOO = true;
        }
        na1 na1Var = this.OooO0o0;
        if (na1Var != null && i == 0) {
            sn1 sn1Var = (sn1) na1Var.OooO0o0;
            if (!sn1Var.OooO0Oo) {
                sn1Var.OooO00o.OooOO0o = true;
                sn1Var.OooO0Oo = true;
            }
        }
        boolean zOnPreparePanel = this.OooO0Oo.onPreparePanel(i, view, menu);
        if (ss0Var != null) {
            ss0Var.OooOoOO = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        ss0 ss0Var = this.OooO.OooOoO(0).OooO0oo;
        if (ss0Var != null) {
            OooO0Oo(list, ss0Var, i);
        } else {
            OooO0Oo(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return my1.OooO00o(this.OooO0Oo, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.OooO0Oo.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.OooO0Oo.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        k kVar = this.OooO;
        Context context = kVar.OooOOO;
        if (!kVar.OooOoo0 || i != 0) {
            return my1.OooO0O0(this.OooO0Oo, callback, i);
        }
        ho1 ho1Var = new ho1(context, callback);
        o00OO0O0 o00oo0o0 = kVar.OooOo0o;
        if (o00oo0o0 != null) {
            o00oo0o0.OooO00o();
        }
        o0O000O o0o000o = new o0O000O(kVar, ho1Var);
        kVar.OooOoOO();
        cm2 cm2Var = kVar.OooOOo0;
        if (cm2Var != null) {
            kVar.OooOo0o = cm2Var.OooOOo0(o0o000o);
        }
        if (kVar.OooOo0o == null) {
            gu1 gu1Var = kVar.OooOoOO;
            if (gu1Var != null) {
                gu1Var.OooO0O0();
            }
            o00OO0O0 o00oo0o02 = kVar.OooOo0o;
            if (o00oo0o02 != null) {
                o00oo0o02.OooO00o();
            }
            int i2 = 1;
            if (kVar.OooOo == null) {
                if (kVar.Oooo0o0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        ej ejVar = new ej(context, 0);
                        ejVar.getTheme().setTo(themeNewTheme);
                        context = ejVar;
                    }
                    kVar.OooOo = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    kVar.OooOoO0 = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    kVar.OooOoO0.setContentView(kVar.OooOo);
                    kVar.OooOoO0.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    kVar.OooOo.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    kVar.OooOoO0.setHeight(-2);
                    kVar.OooOoO = new O0O0(kVar, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) kVar.OooOooO.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        kVar.OooOoOO();
                        cm2 cm2Var2 = kVar.OooOOo0;
                        Context contextOooO0o0 = cm2Var2 != null ? cm2Var2.OooO0o0() : null;
                        if (contextOooO0o0 != null) {
                            context = contextOooO0o0;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        kVar.OooOo = (ActionBarContextView) viewStubCompat.OooO00o();
                    }
                }
            }
            if (kVar.OooOo != null) {
                gu1 gu1Var2 = kVar.OooOoOO;
                if (gu1Var2 != null) {
                    gu1Var2.OooO0O0();
                }
                kVar.OooOo.OooO0o0();
                Context context2 = kVar.OooOo.getContext();
                ActionBarContextView actionBarContextView = kVar.OooOo;
                li1 li1Var = new li1();
                li1Var.OooO0o = context2;
                li1Var.OooO0oO = actionBarContextView;
                li1Var.OooO0oo = o0o000o;
                ss0 ss0Var = new ss0(actionBarContextView.getContext());
                ss0Var.OooOOOO = 1;
                li1Var.OooOO0O = ss0Var;
                ss0Var.OooO0oo = li1Var;
                if (((ho1) o0o000o.OooO0o0).Oooo0(li1Var, ss0Var)) {
                    li1Var.OooO0oo();
                    kVar.OooOo.OooO0OO(li1Var);
                    kVar.OooOo0o = li1Var;
                    boolean z = kVar.OooOoo && (viewGroup = kVar.OooOooO) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = kVar.OooOo;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        gu1 gu1VarOooO00o = nt1.OooO00o(kVar.OooOo);
                        gu1VarOooO00o.OooO00o(1.0f);
                        kVar.OooOoOO = gu1VarOooO00o;
                        gu1VarOooO00o.OooO0Oo(new Oo0000(kVar, i2));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        kVar.OooOo.setVisibility(0);
                        if (kVar.OooOo.getParent() instanceof View) {
                            View view = (View) kVar.OooOo.getParent();
                            WeakHashMap weakHashMap = nt1.OooO00o;
                            dt1.OooO0OO(view);
                        }
                    }
                    if (kVar.OooOoO0 != null) {
                        kVar.OooOOOO.getDecorView().post(kVar.OooOoO);
                    }
                } else {
                    kVar.OooOo0o = null;
                }
            }
            kVar.Oooo0();
            kVar.OooOo0o = kVar.OooOo0o;
        }
        kVar.Oooo0();
        o00OO0O0 o00oo0o03 = kVar.OooOo0o;
        if (o00oo0o03 != null) {
            return ho1Var.OooOo00(o00oo0o03);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.OooO0Oo.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
