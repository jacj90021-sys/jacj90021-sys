package com.cmaster.cloner;

import android.content.pm.IPackageInstallerCallback;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kc0 implements jo1 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ lc0 OooO0O0;

    public /* synthetic */ kc0(lc0 lc0Var, int i) {
        this.OooO00o = i;
        this.OooO0O0 = lc0Var;
    }

    @Override // com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        int i = this.OooO00o;
        lc0 lc0Var = this.OooO0O0;
        switch (i) {
            case 0:
                lc0.OooOO0(lc0Var).o0000OOO(((Integer) yqVar.OooO0o[0]).intValue());
                yqVar.OooO0oo(null);
                break;
            case 1:
                Object[] objArr = yqVar.OooO0o;
                yqVar.OooO0oo(Integer.valueOf(lc0.OooOO0(lc0Var).Ooooooo((PackageInstaller.SessionParams) objArr[0], (String) objArr[1], qx1.OooO0oO())));
                break;
            case 2:
                ArrayList arrayListOooo0O0 = lc0.OooOO0(lc0Var).Oooo0O0(((Integer) yqVar.OooO0o[0]).intValue());
                if (!m21.OooO0O0(yqVar.OooO0o0.getReturnType())) {
                    yqVar.OooO0oo(arrayListOooo0O0);
                    break;
                } else {
                    yqVar.OooO0oo(m21.OooO0OO(arrayListOooo0O0));
                    break;
                }
            case 3:
                Object[] objArr2 = yqVar.OooO0o;
                ArrayList arrayListO0000O = lc0.OooOO0(lc0Var).o0000O(((Integer) objArr2[1]).intValue(), (String) objArr2[0]);
                if (!m21.OooO0O0(yqVar.OooO0o0.getReturnType())) {
                    yqVar.OooO0oo(arrayListO0000O);
                    break;
                } else {
                    yqVar.OooO0oo(m21.OooO0OO(arrayListO0000O));
                    break;
                }
            case 4:
                yqVar.OooO0oo(lc0.OooOO0(lc0Var).o000o0o(((Integer) yqVar.OooO0o[0]).intValue()));
                break;
            case 5:
                yqVar.OooO0oo(IPackageInstallerSession.Stub.asInterface(lc0.OooOO0(lc0Var).o000O(((Integer) yqVar.OooO0o[0]).intValue())));
                break;
            case 6:
                lc0.OooOO0(lc0Var).o0000O00(((IPackageInstallerCallback) yqVar.OooO0o[0]).asBinder(), qx1.OooO0oO());
                yqVar.OooO0oo(null);
                break;
            case 7:
                Object[] objArr3 = yqVar.OooO0o;
                lc0.OooOO0(lc0Var).o000(((Integer) objArr3[0]).intValue(), ((Boolean) objArr3[1]).booleanValue());
                yqVar.OooO0oo(null);
                break;
            case 8:
                lc0.OooOO0(lc0Var).o000o0O(((IPackageInstallerCallback) yqVar.OooO0o[0]).asBinder());
                yqVar.OooO0oo(null);
                break;
            case 9:
                Object[] objArr4 = yqVar.OooO0o;
                lc0.OooOO0(lc0Var).o000oo(((Integer) objArr4[0]).intValue(), (Bitmap) objArr4[1]);
                yqVar.OooO0oo(null);
                break;
            default:
                Object[] objArr5 = yqVar.OooO0o;
                lc0.OooOO0(lc0Var).OooO0oo(((Integer) objArr5[0]).intValue(), (String) objArr5[1]);
                yqVar.OooO0oo(null);
                break;
        }
    }
}
