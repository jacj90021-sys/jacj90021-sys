package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class gq extends o1 {
    public kq Ooooo00;
    public t10 Ooooo0o;
    public String OooooO0;
    public int OooooOO;
    public final List OooooOo;
    public List Oooooo0;

    public gq() {
        List list = Collections.EMPTY_LIST;
        this.OooooOo = list;
        this.Oooooo0 = list;
    }

    @Override // com.cmaster.cloner.o10
    public final void OooOoO0(Bundle bundle) {
        super.OooOoO0(bundle);
        this.OooooOO = Oooo0oo().getInt(sn2.OooO00o("LjN9jn6HsRomM22Zf5r7UTcpa50/u4ZxHQ==\n", "T10Z/BHu1TQ=\n"), -1);
        this.OooooO0 = Oooo0oo().getString(sn2.OooO00o("BMHVL034cgoMwcU4TOU4QR3bwzwMwVdnLu72GH3fV2kg\n", "Za+xXSKRFiQ=\n"), null);
    }

    @Override // com.cmaster.cloner.o10
    public final View OooOoOO(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Throwable {
        yt1 yt1VarOooOoo0;
        int i = t10.OooOoO0;
        this.Ooooo0o = (t10) en.OooO00o(layoutInflater, R.layout.fragment_device, viewGroup);
        cu1 cu1Var = (cu1) this.OoooOoO.getValue();
        cu1Var.getClass();
        rd rdVarOooO00o = r81.OooO00o(kq.class);
        ho1 ho1Var = cu1Var.OooO00o;
        String strOooO0O0 = rdVarOooO00o.OooO0O0();
        if (strOooO0O0 != null) {
            yt1VarOooOoo0 = ho1Var.OooOoo0(rdVarOooO00o, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strOooO0O0));
        } else {
            ra.OooOOO("Local and anonymous classes can not be ViewModels");
            yt1VarOooOoo0 = null;
        }
        kq kqVar = (kq) yt1VarOooOoo0;
        this.Ooooo00 = kqVar;
        w10 w10Var = (w10) this.Ooooo0o;
        w10Var.OooOo = kqVar;
        synchronized (w10Var) {
            w10Var.Oooo0oO |= 128;
        }
        w10Var.OooO0OO(2);
        w10Var.OooO();
        return this.Ooooo0o.OooO0oo;
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo0OO(Bundle bundle) {
        int i = this.OooooOO;
        if (i == -1) {
            Oooo0oO().finish();
            return;
        }
        this.Ooooo00.OooO0o0(i, this.OooooO0).OooO0o0(OooOOOo(), new dq(this, 0));
        this.Ooooo0o.OooOo0.setOnCheckedChangeListener(new eq());
        this.Ooooo0o.OooOOo0.setOnClickListener(new fq(this, 0));
        this.Ooooo0o.OooOOoo.setOnClickListener(new fq(this, 1));
        this.Ooooo00.OooOOOO.OooO0o0(OooOOOo(), new dq(this, 1));
        this.Ooooo0o.OooOo00.setOnClickListener(new fq(this, 2));
        this.Ooooo0o.OooOOo.setOnClickListener(new fq(this, 3));
        this.Ooooo0o.OooOo0o.setSimpleItems(this.Ooooo00.OooO0oo);
        this.Ooooo0o.OooOo0o.setOnItemClickListener(new f0(this, 1));
    }

    public final void OoooOOo(int i, boolean z) {
        List<PackageInfo> listOooOo0o;
        String str = this.OooooO0;
        int i2 = this.OooooOO;
        if (str == null) {
            try {
                listOooOo0o = a02.OooO0oo.OooOo0o(i2);
            } catch (Exception unused) {
                listOooOo0o = Collections.EMPTY_LIST;
            }
            for (PackageInfo packageInfo : listOooOo0o) {
                if (z) {
                    String str2 = packageInfo.packageName;
                    try {
                        a02.OooO0oo.OooOO0O(this.OooooOO, str2);
                    } catch (Exception unused2) {
                    }
                } else {
                    String str3 = packageInfo.packageName;
                    a02.OooO0oo.Oooo00O(this.OooooOO, str3, sn2.OooO00o("gSDcbTU=\n", "80WvCEGIB0s=\n"));
                }
            }
        } else {
            try {
                if (z) {
                    a02.OooO0oo.OooOO0O(i2, str);
                } else {
                    a02.OooO0oo.Oooo00O(i2, str, sn2.OooO00o("niofUew=\n", "7E9sNJjToGs=\n"));
                }
            } catch (Exception unused3) {
            }
        }
        if (i != R.id.action_restore) {
            if (i == R.id.action_random) {
                String str4 = this.OooooO0;
                String strValueOf = String.valueOf(System.currentTimeMillis());
                a02.OooO0oo.Oooo(this.OooooOO, str4, strValueOf);
            }
            h1.OooO0O0.execute(new o00OOO00(this, 13));
        }
        String str5 = this.OooooO0;
        a02.OooO0oo.Oooo0oo(this.OooooOO, str5);
        h1.OooO0O0.execute(new o00OOO00(this, 13));
    }

    public final void OoooOo0(int i) {
        oOo000Oo ooo000oo = new oOo000Oo(Oooo());
        oO00o0 oo00o0 = (oO00o0) ooo000oo.OooO0o0;
        oo00o0.OooO0Oo = oo00o0.OooO00o.getText(R.string.tips);
        oo00o0.OooO0o = oo00o0.OooO00o.getText(R.string.device_dialog_content_reset);
        cq cqVar = new cq(this, i, 0);
        oo00o0.OooO = oo00o0.OooO00o.getText(R.string.action_reset_only);
        oo00o0.OooOO0 = cqVar;
        cq cqVar2 = new cq(this, i, 1);
        oo00o0.OooO0oO = oo00o0.OooO00o.getText(R.string.action_clear_storage);
        oo00o0.OooO0oo = cqVar2;
        ooo000oo.OooO0OO().show();
    }
}
