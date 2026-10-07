package com.cmaster.cloner;

import android.app.Application;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzfua;
import com.google.android.gms.internal.ads.zzfub;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class na1 implements ju0, iy, nc1, qs0, bl1, j6, b91, mr1, dg2, zzcgw, c6, zzfub {
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o0;

    public na1() {
        this.OooO0Oo = 12;
        this.OooO0o0 = new ac3();
    }

    @Override // com.cmaster.cloner.c6
    public Point[] OooO() {
        return ((ld3) this.OooO0o0).OooO0oo;
    }

    @Override // com.cmaster.cloner.c6
    public w5 OooO00o() {
        bd3 bd3Var = ((ld3) this.OooO0o0).OooOOo;
        if (bd3Var != null) {
            return new w5(bd3Var.OooO0Oo, bd3Var.OooO0o0, bd3Var.OooO0o, bd3Var.OooO0oO, bd3Var.OooO0oo, bd3Var.OooO, bd3Var.OooOO0, bd3Var.OooOO0O, bd3Var.OooOO0o, bd3Var.OooOOO0, bd3Var.OooOOO, bd3Var.OooOOOO, bd3Var.OooOOOo, bd3Var.OooOOo0);
        }
        return null;
    }

    @Override // com.cmaster.cloner.mr1
    public void OooO0O0(i10 i10Var) {
        ((oO0o0o) this.OooO0o0).OooO00o(i10Var);
    }

    @Override // com.cmaster.cloner.c6
    public Rect OooO0OO() {
        Point[] pointArr = ((ld3) this.OooO0o0).OooO0oo;
        if (pointArr == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArr) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // com.cmaster.cloner.qs0
    public boolean OooO0Oo(ss0 ss0Var, MenuItem menuItem) {
        return false;
    }

    @Override // com.cmaster.cloner.c6
    public int OooO0o() {
        return ((ld3) this.OooO0o0).OooO;
    }

    @Override // com.cmaster.cloner.c6
    public String OooO0o0() {
        return ((ld3) this.OooO0o0).OooO0o;
    }

    @Override // com.cmaster.cloner.nc1
    public mc1 OooO0oO(String str) {
        str.getClass();
        return new hk1(((kk1) this.OooO0o0).OooOO0O());
    }

    @Override // com.cmaster.cloner.c6
    public String OooO0oo() {
        return ((ld3) this.OooO0o0).OooO0o0;
    }

    @Override // com.cmaster.cloner.qs0
    public void OooOO0(ss0 ss0Var) {
        Toolbar toolbar = (Toolbar) this.OooO0o0;
        o00O0OOO o00o0ooo = toolbar.OooO0Oo.OooOo0o;
        if (o00o0ooo == null || !o00o0ooo.OooOO0O()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.Oooo0O0.OooO0o).iterator();
            while (it.hasNext()) {
                ((e20) it.next()).OooO00o.OooOOoo(ss0Var);
            }
        }
        nz0 nz0Var = toolbar.OoooO0;
        if (nz0Var != null) {
            nz0Var.OooOO0(ss0Var);
        }
    }

    @Override // com.cmaster.cloner.bl1
    public Object OooOO0O() {
        SQLiteDatabase sQLiteDatabaseOooO0OO;
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 5:
                qc1 qc1Var = (qc1) obj;
                long jOooO0oo = qc1Var.OooO0o0.OooO0oo() - qc1Var.OooO0oO.OooO0Oo;
                sQLiteDatabaseOooO0OO = qc1Var.OooO0OO();
                sQLiteDatabaseOooO0OO.beginTransaction();
                try {
                    int iDelete = sQLiteDatabaseOooO0OO.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(jOooO0oo)});
                    sQLiteDatabaseOooO0OO.setTransactionSuccessful();
                    sQLiteDatabaseOooO0OO.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            default:
                ho1 ho1Var = (ho1) obj;
                sQLiteDatabaseOooO0OO = ((qc1) ho1Var.OooO0o).OooO0OO();
                sQLiteDatabaseOooO0OO.beginTransaction();
                try {
                    List list = (List) qc1.OooOOOO(sQLiteDatabaseOooO0OO.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), d83.OooO0o);
                    sQLiteDatabaseOooO0OO.setTransactionSuccessful();
                    sQLiteDatabaseOooO0OO.endTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((a02) ho1Var.OooO0oO).OoooO00((g5) it.next(), 1, false);
                    }
                    return null;
                } finally {
                }
        }
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        return new t3((Resources) this.OooO0o0, ho1Var.OooOO0O(Uri.class, InputStream.class));
    }

    @Override // com.cmaster.cloner.b91
    public void accept(Object obj, Object obj2) {
        v22 v22Var = new v22((yl1) obj2, 1);
        i22 i22Var = (i22) ((y22) obj).getService();
        oOO0 ooo0 = (oOO0) this.OooO0o0;
        i22Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(i22Var.OooO0o);
        int i = y12.OooO00o;
        parcelObtain.writeStrongBinder(v22Var);
        y12.OooO0OO(parcelObtain, ooo0);
        parcelObtain.writeStrongBinder(null);
        i22Var.o0000o0O(2, parcelObtain);
    }

    @Override // com.cmaster.cloner.q51
    public Object get() {
        return new qc1(new qc3(14), new v03(), y4.OooO0o, (sd1) ((o00OO000) this.OooO0o0).get());
    }

    @Override // com.cmaster.cloner.c6
    public int getFormat() {
        return ((ld3) this.OooO0o0).OooO0Oo;
    }

    @Override // com.cmaster.cloner.j6
    public void onConnectionFailed(gh ghVar) {
        ((g60) this.OooO0o0).onConnectionFailed(ghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfub
    public void zza(zzfua zzfuaVar) {
        u12 u12Var = (u12) this.OooO0o0;
        u12Var.getClass();
        if (!TextUtils.isEmpty(zzfuaVar.zzb())) {
            if (!((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlU)).booleanValue()) {
                u12Var.OooO0o0 = zzfuaVar.zzb();
            }
        }
        switch (zzfuaVar.zza()) {
            case 8152:
                String str = "onLMDOverlayOpened";
                zzcaf.zzf.execute(new l1(u12Var, str, new HashMap(), 23, false));
                break;
            case 8153:
                String str2 = "onLMDOverlayClicked";
                zzcaf.zzf.execute(new l1(u12Var, str2, new HashMap(), 23, false));
                break;
            case 8155:
                String str3 = "onLMDOverlayClose";
                zzcaf.zzf.execute(new l1(u12Var, str3, new HashMap(), 23, false));
                break;
            case 8157:
                u12Var.OooO0o0 = null;
                u12Var.OooO0o = null;
                u12Var.OooO0Oo = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzfuaVar.zza()));
                zzcaf.zzf.execute(new l1(u12Var, "onLMDOverlayFailedToOpen", map, 23, false));
                break;
        }
    }

    public /* synthetic */ na1(int i) {
        this.OooO0Oo = i;
    }

    public /* synthetic */ na1(s22 s22Var, oOO0 ooo0) {
        this.OooO0Oo = 10;
        this.OooO0o0 = ooo0;
    }

    public /* synthetic */ na1(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    public na1(kk1 kk1Var) {
        this.OooO0Oo = 2;
        kk1Var.getClass();
        this.OooO0o0 = kk1Var;
    }

    @Override // com.cmaster.cloner.lg2
    public Object zza() {
        switch (this.OooO0Oo) {
            case 14:
                return new qa2((Application) ((lg2) this.OooO0o0).zza());
            default:
                zf2 zf2Var = (zf2) this.OooO0o0;
                if (zf2Var != null) {
                    return zf2Var.zza();
                }
                ra.OooO0O0();
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public void zza(boolean z, int i, String str, String str2) {
        zzcfg zzcfgVar = ((lz2) this.OooO0o0).OooO0o;
        if (zzcfgVar != null) {
            zzcfgVar.zzaa();
        }
    }
}
