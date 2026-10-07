package com.cmaster.cloner;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzdes;
import com.google.android.gms.internal.ads.zzfpj;
import com.google.android.gms.internal.ads.zzgdj;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vk1 implements qn1, l6, b91, jz0, bz0, yy0, dg2, zzgdj, nr1, zzfpj, c6 {
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o0;

    public vk1(Context context) {
        this.OooO0Oo = 0;
        if (zk1.OooOo0O == null) {
            zk1.OooOo0O = new zk1(context, context.getFilesDir());
        }
        if (zk1.OooOo0O != null) {
            this.OooO0o0 = zk1.OooOo0O;
        } else {
            qa.OooO0o(u7.OooO00o(new byte[]{32, 121, 36, -30, -47, 100, -68, -53, 39, 119, 60, -85, -62, 111, -79}, new byte[]{78, 22, 80, -62, -72, 10, -43, -65}));
            throw null;
        }
    }

    @Override // com.cmaster.cloner.c6
    public Point[] OooO() {
        return ((s93) this.OooO0o0).OooO0oo;
    }

    @Override // com.cmaster.cloner.c6
    public w5 OooO00o() {
        iz2 iz2Var = ((s93) this.OooO0o0).OooOOo0;
        if (iz2Var == null) {
            return null;
        }
        return new w5(iz2Var.OooO0Oo, iz2Var.OooO0o0, iz2Var.OooO0o, iz2Var.OooO0oO, iz2Var.OooO0oo, iz2Var.OooO, iz2Var.OooOO0, iz2Var.OooOO0O, iz2Var.OooOO0o, iz2Var.OooOOO0, iz2Var.OooOOO, iz2Var.OooOOOO, iz2Var.OooOOOo, iz2Var.OooOOo0);
    }

    @Override // com.cmaster.cloner.jz0
    public void OooO0O0(Object obj) {
        switch (this.OooO0Oo) {
            case 5:
                ((yl1) ((vk1) this.OooO0o0).OooO0o0).OooO00o.OooO();
                break;
            default:
                ((CountDownLatch) this.OooO0o0).countDown();
                break;
        }
    }

    @Override // com.cmaster.cloner.c6
    public Rect OooO0OO() {
        s93 s93Var = (s93) this.OooO0o0;
        if (s93Var.OooO0oo == null) {
            return null;
        }
        int i = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = s93Var.OooO0oo;
            if (i >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i++;
        }
    }

    @Override // com.cmaster.cloner.nr1
    public void OooO0Oo(q72 q72Var) {
        ((AtomicReference) this.OooO0o0).set(q72Var);
    }

    @Override // com.cmaster.cloner.c6
    public int OooO0o() {
        return ((s93) this.OooO0o0).OooO0oO;
    }

    @Override // com.cmaster.cloner.c6
    public String OooO0o0() {
        return ((s93) this.OooO0o0).OooO0o0;
    }

    @Override // com.cmaster.cloner.yy0
    public void OooO0oO() {
        ((CountDownLatch) this.OooO0o0).countDown();
    }

    @Override // com.cmaster.cloner.c6
    public String OooO0oo() {
        return ((s93) this.OooO0o0).OooO0o;
    }

    @Override // com.cmaster.cloner.b91
    public void accept(Object obj, Object obj2) {
        v22 v22Var = new v22((yl1) obj2, 0);
        i22 i22Var = (i22) ((y22) obj).getService();
        oOO0 ooo0 = (oOO0) this.OooO0o0;
        i22Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(i22Var.OooO0o);
        int i = y12.OooO00o;
        parcelObtain.writeStrongBinder(v22Var);
        y12.OooO0OO(parcelObtain, ooo0);
        i22Var.o0000o0O(1, parcelObtain);
    }

    @Override // com.cmaster.cloner.c6
    public int getFormat() {
        return ((s93) this.OooO0o0).OooO0Oo;
    }

    @Override // com.cmaster.cloner.bz0
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.OooO0o0).countDown();
    }

    @Override // com.cmaster.cloner.lg2
    public Object zza() {
        switch (this.OooO0Oo) {
            case 7:
                return new d52((Application) ((uf) this.OooO0o0).OooO0Oo);
            default:
                gd2 gd2Var = kd2.OooO0O0;
                u73.OooO00o(gd2Var);
                return new h92((nz0) this.OooO0o0, gd2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public void zzb(int i, long j, String str) {
        ((ev2) this.OooO0o0).OooOO0O.zze(i, System.currentTimeMillis() - j, str);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public /* synthetic */ void zzb(Object obj) {
        ((zzdes) this.OooO0o0).zza((s82) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public void zza(int i, long j) {
        ((ev2) this.OooO0o0).OooOO0O.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public void zza(Throwable th) {
        ((zzdes) this.OooO0o0).zzb(th.getMessage());
    }

    public /* synthetic */ vk1(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    public /* synthetic */ vk1(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 6:
                this.OooO0o0 = new CountDownLatch(1);
                break;
        }
    }

    public /* synthetic */ vk1(s22 s22Var, oOO0 ooo0) {
        this.OooO0Oo = 4;
        this.OooO0o0 = ooo0;
    }
}
