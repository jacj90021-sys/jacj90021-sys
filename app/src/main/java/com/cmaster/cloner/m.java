package com.cmaster.cloner;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class m extends gg implements oOOO0O0o {
    public k OooO0oO;
    public final l OooO0oo;

    /* JADX WARN: Type inference failed for: r2v2, types: [com.cmaster.cloner.l] */
    public m(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.OooO0oo = new al0() { // from class: com.cmaster.cloner.l
            @Override // com.cmaster.cloner.al0
            public final boolean OooO0o0(KeyEvent keyEvent) {
                return this.OooO0Oo.OooO0o0(keyEvent);
            }
        };
        O0000000 o0000000OooO0OO = OooO0OO();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((k) o0000000OooO0OO).OoooOOO = i;
        o0000000OooO0OO.OooO0o0();
    }

    public final O0000000 OooO0OO() {
        if (this.OooO0oO == null) {
            oo000000 oo000000Var = O0000000.OooO0Oo;
            this.OooO0oO = new k(getContext(), getWindow(), this, this);
        }
        return this.OooO0oO;
    }

    public final boolean OooO0o0(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.cmaster.cloner.gg, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooO0O0();
        k kVar = (k) OooO0OO();
        kVar.OooOo0o();
        ((ViewGroup) kVar.OooOooO.findViewById(android.R.id.content)).addView(view, layoutParams);
        kVar.OooOOOo.OooO00o(kVar.OooOOOO.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        OooO0OO().OooO0o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return uu2.OooO0O0(this.OooO0oo, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        k kVar = (k) OooO0OO();
        kVar.OooOo0o();
        return kVar.OooOOOO.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        OooO0OO().OooO0O0();
    }

    @Override // com.cmaster.cloner.gg, android.app.Dialog
    public void onCreate(Bundle bundle) {
        OooO0OO().OooO00o();
        super.onCreate(bundle);
        OooO0OO().OooO0o0();
    }

    @Override // com.cmaster.cloner.gg, android.app.Dialog
    public final void onStop() {
        super.onStop();
        k kVar = (k) OooO0OO();
        kVar.OooOoOO();
        cm2 cm2Var = kVar.OooOOo0;
        if (cm2Var != null) {
            cm2Var.OooOOO(false);
        }
    }

    @Override // com.cmaster.cloner.gg, android.app.Dialog
    public void setContentView(int i) {
        OooO0O0();
        OooO0OO().OooO(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        OooO0OO().OooOOO0(getContext().getString(i));
    }

    @Override // com.cmaster.cloner.gg, android.app.Dialog
    public void setContentView(View view) {
        OooO0O0();
        OooO0OO().OooOO0O(view);
    }

    @Override // com.cmaster.cloner.gg, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        OooO0O0();
        OooO0OO().OooOO0o(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        OooO0OO().OooOOO0(charSequence);
    }
}
