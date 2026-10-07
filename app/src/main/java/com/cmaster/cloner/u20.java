package com.cmaster.cloner;

import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u20 extends vu1 {
    public final ViewGroup OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u20(o10 o10Var, ViewGroup viewGroup, int i) {
        super(o10Var, "Attempting to use <fragment> tag to add fragment " + o10Var + " to container " + viewGroup);
        switch (i) {
            case 1:
                o10Var.getClass();
                super(o10Var, "Attempting to add fragment " + o10Var + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.OooO0o0 = viewGroup;
                break;
            default:
                this.OooO0o0 = viewGroup;
                break;
        }
    }
}
