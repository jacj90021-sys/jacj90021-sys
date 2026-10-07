package com.cmaster.cloner;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z8 {
    public final /* synthetic */ int OooO00o;
    public int OooO0O0;
    public boolean OooO0OO;
    public Object OooO0Oo;
    public Object OooO0o0;

    public z8(z8 z8Var, iz[] izVarArr, boolean z, int i) {
        this.OooO00o = 3;
        this.OooO0o0 = z8Var;
        this.OooO0Oo = izVarArr;
        boolean z2 = false;
        if (izVarArr != null && z) {
            z2 = true;
        }
        this.OooO0OO = z2;
        this.OooO0O0 = i;
    }

    public z8 OooO00o() {
        by2.OooO00o("execute parameter required", ((b91) this.OooO0Oo) != null);
        return new z8(this, (iz[]) this.OooO0o0, this.OooO0OO, this.OooO0O0);
    }

    public void OooO0O0(int i) {
        switch (this.OooO00o) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.OooO0o0;
                WeakReference weakReference = bottomSheetBehavior.OoooOOO;
                if (weakReference != null && weakReference.get() != null) {
                    this.OooO0O0 = i;
                    if (!this.OooO0OO) {
                        ((View) bottomSheetBehavior.OoooOOO.get()).postOnAnimation((o00OOO00) this.OooO0Oo);
                        this.OooO0OO = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.OooO0o0;
                WeakReference weakReference2 = sideSheetBehavior.OooOOOo;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.OooO0O0 = i;
                    if (!this.OooO0OO) {
                        ((View) sideSheetBehavior.OooOOOo.get()).postOnAnimation((o00OOOOo) this.OooO0Oo);
                        this.OooO0OO = true;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z8() {
        this.OooO00o = 2;
    }

    public z8(SideSheetBehavior sideSheetBehavior) {
        this.OooO00o = 1;
        this.OooO0o0 = sideSheetBehavior;
        this.OooO0Oo = new o00OOOOo(this, 14);
    }

    public z8(BottomSheetBehavior bottomSheetBehavior) {
        this.OooO00o = 0;
        this.OooO0o0 = bottomSheetBehavior;
        this.OooO0Oo = new o00OOO00(this, 8);
    }
}
