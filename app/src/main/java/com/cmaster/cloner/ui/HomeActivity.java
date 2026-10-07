package com.cmaster.cloner.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.ft1;
import com.cmaster.cloner.ho1;
import com.cmaster.cloner.iu;
import com.cmaster.cloner.je;
import com.cmaster.cloner.m1;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.t70;
import com.cmaster.cloner.u5;
import com.cmaster.cloner.u70;
import com.cmaster.cloner.x41;
import com.cmaster.cloner.yu1;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class HomeActivity extends m1 {
    public static final /* synthetic */ int Oooo00O = 0;
    public ho1 Oooo000;

    @Override // com.cmaster.cloner.m1
    public final ViewGroup OooOoO0() {
        return (FrameLayout) this.Oooo000.OooO0oO;
    }

    @Override // com.cmaster.cloner.m1
    public final Executor OooOoo0() {
        return yu1.OooOOO0.OooO;
    }

    @Override // com.cmaster.cloner.m1, com.cmaster.cloner.oOOO00, com.cmaster.cloner.fg, com.cmaster.cloner.eg, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        ho1 ho1VarOooOoo = ho1.OooOoo(getLayoutInflater());
        this.Oooo000 = ho1VarOooOoo;
        setContentView((CoordinatorLayout) ho1VarOooOoo.OooO0o0);
        OooOooO((Toolbar) this.Oooo000.OooO0oo);
        AppBarLayout appBarLayout = (AppBarLayout) this.Oooo000.OooO0o;
        je jeVar = new je(9);
        WeakHashMap weakHashMap = nt1.OooO00o;
        ft1.OooOO0O(appBarLayout, jeVar);
        ft1.OooOO0O((FrameLayout) this.Oooo000.OooO0oO, new iu(9));
        u5 u5Var = x41.OooO0O0;
        ((x41) u5Var.OooO0O0()).OooO00o.OooO0o0(this, new u70(this, 0));
        ((x41) u5Var.OooO0O0()).OooO00o.OooO0o0(this, new u70(this, 1));
    }

    @Override // com.cmaster.cloner.fg, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        yu1 yu1Var = yu1.OooOOO0;
        yu1Var.OooO0o.OooO0o0(this, new t70(this, yu1Var, intent));
    }
}
