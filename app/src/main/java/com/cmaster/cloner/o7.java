package com.cmaster.cloner;

import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o7 extends sh {
    public final /* synthetic */ int OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o7(gi giVar, int i) {
        super(giVar);
        this.OooO0o0 = i;
    }

    @Override // com.cmaster.cloner.sh
    public final boolean OooO00o(w02 w02Var) {
        switch (this.OooO0o0) {
            case 0:
                return w02Var.OooOO0.OooO0O0;
            case 1:
                return w02Var.OooOO0.OooO0Oo;
            case 2:
                return w02Var.OooOO0.OooO00o == 2;
            case 3:
                int i = w02Var.OooOO0.OooO00o;
                if (i != 3) {
                    return Build.VERSION.SDK_INT >= 30 && i == 6;
                }
                return true;
            default:
                return w02Var.OooOO0.OooO0o0;
        }
    }

    @Override // com.cmaster.cloner.sh
    public final boolean OooO0O0(Object obj) {
        boolean zBooleanValue;
        switch (this.OooO0o0) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                xw0 xw0Var = (xw0) obj;
                return Build.VERSION.SDK_INT >= 26 ? (xw0Var.OooO00o && xw0Var.OooO0O0) ? false : true : !xw0Var.OooO00o;
            case 3:
                xw0 xw0Var2 = (xw0) obj;
                return !xw0Var2.OooO00o || xw0Var2.OooO0OO;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
