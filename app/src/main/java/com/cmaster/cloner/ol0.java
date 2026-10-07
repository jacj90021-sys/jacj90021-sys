package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ol0 {
    public final /* synthetic */ int OooO00o;
    public final SideSheetBehavior OooO0O0;

    public /* synthetic */ ol0(SideSheetBehavior sideSheetBehavior, int i) {
        this.OooO00o = i;
        this.OooO0O0 = sideSheetBehavior;
    }

    public final int OooO00o() {
        int i = this.OooO00o;
        SideSheetBehavior sideSheetBehavior = this.OooO0O0;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.OooOOO + sideSheetBehavior.OooOOOO);
            default:
                return Math.max(0, (sideSheetBehavior.OooOOO0 - sideSheetBehavior.OooOO0o) - sideSheetBehavior.OooOOOO);
        }
    }

    public final int OooO0O0() {
        int i = this.OooO00o;
        SideSheetBehavior sideSheetBehavior = this.OooO0O0;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.OooOO0o) - sideSheetBehavior.OooOOOO;
            default:
                return sideSheetBehavior.OooOOO0;
        }
    }

    public final int OooO0OO(View view) {
        int i = this.OooO00o;
        SideSheetBehavior sideSheetBehavior = this.OooO0O0;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.OooOOOO;
            default:
                return view.getLeft() - sideSheetBehavior.OooOOOO;
        }
    }

    public final int OooO0Oo() {
        switch (this.OooO00o) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final void OooO0o0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.OooO00o) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }
}
