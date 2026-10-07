package com.cmaster.cloner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class eg extends Activity implements hm0, al0 {
    public final jm0 OooO0Oo = new jm0(this);

    @Override // com.cmaster.cloner.al0
    public final boolean OooO0o0(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (uu2.OooO00o(decorView, keyEvent)) {
            return true;
        }
        return uu2.OooO0O0(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (uu2.OooO00o(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = l91.OooO0o0;
        j91.OooO0O0(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        jm0 jm0Var = this.OooO0Oo;
        jm0Var.OooO0oo("setCurrentState");
        jm0Var.OooOOO(xl0.OooO0o);
        super.onSaveInstanceState(bundle);
    }
}
