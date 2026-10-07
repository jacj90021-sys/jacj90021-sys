package com.cmaster.cloner.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
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
import com.cmaster.cloner.o1;
import com.cmaster.cloner.sn2;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class RouterActivity extends m1 {
    public ho1 Oooo000;

    @Override // com.cmaster.cloner.m1
    public final ViewGroup OooOoO0() {
        return (FrameLayout) this.Oooo000.OooO0oO;
    }

    @Override // com.cmaster.cloner.m1, com.cmaster.cloner.oOOO00, com.cmaster.cloner.fg, com.cmaster.cloner.eg, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        Class cls;
        super.onCreate(bundle);
        ho1 ho1VarOooOoo = ho1.OooOoo(getLayoutInflater());
        this.Oooo000 = ho1VarOooOoo;
        setContentView((CoordinatorLayout) ho1VarOooOoo.OooO0o0);
        AppBarLayout appBarLayout = (AppBarLayout) this.Oooo000.OooO0o;
        je jeVar = new je(12);
        WeakHashMap weakHashMap = nt1.OooO00o;
        ft1.OooOO0O(appBarLayout, jeVar);
        ft1.OooOO0O((FrameLayout) this.Oooo000.OooO0oO, new iu(12));
        OooOooO((Toolbar) this.Oooo000.OooO0oo);
        OooOOO0().OooOOO0(true);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(sn2.OooO00o("3HUiSwFFAY/UdTJcAFhLxMVvNFhAfiDn+EkUfDxzK+DwXg==\n", "vRtGOW4sZaE=\n"));
        Bundle bundleExtra = intent.getBundleExtra(sn2.OooO00o("OZc3FlPv9pIxlycBUvK82SCNIQUS1Nf6HasBIW4=\n", "WPlTZDyGkrw=\n"));
        try {
            cls = Class.forName(stringExtra.toString());
        } catch (Throwable th) {
            th.printStackTrace();
            cls = o1.class;
        }
        OooOoO(cls, bundleExtra);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            OooOO0().OooO00o();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
