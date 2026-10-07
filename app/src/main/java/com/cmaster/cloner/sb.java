package com.cmaster.cloner;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.zzbbe;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzbxe;
import com.google.android.gms.internal.ads.zzbxp;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzdsd;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sb implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public final /* synthetic */ Object OooO0o0;
    public final /* synthetic */ Object OooO0oO;
    public final /* synthetic */ Object OooO0oo;

    public /* synthetic */ sb(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.OooO0Oo = i;
        this.OooO0oo = obj;
        this.OooO0o0 = obj2;
        this.OooO0o = obj3;
        this.OooO0oO = obj4;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bytes;
        w02 w02VarOooO0oo;
        boolean zContains;
        String str;
        qf2 qf2VarOooO0o;
        switch (this.OooO0Oo) {
            case 0:
                ub ubVar = (ub) ((xb1) this.OooO0oo).OooO0o0;
                vs0 vs0Var = (vs0) this.OooO0o;
                tb tbVar = (tb) this.OooO0o0;
                if (tbVar != null) {
                    ubVar.OooOoo = true;
                    tbVar.OooO0O0.OooO0OO(false);
                    ubVar.OooOoo = false;
                }
                if (vs0Var.isEnabled() && vs0Var.hasSubMenu()) {
                    ((ss0) this.OooO0oO).OooOOo0(vs0Var, null, 4);
                    return;
                }
                return;
            case 1:
                ContentValues contentValues = new ContentValues();
                String str2 = (String) this.OooO0o0;
                if (str2 == null) {
                    str2 = "#";
                }
                contentValues.put("_module", str2);
                String str3 = (String) this.OooO0o;
                if (str3 == null) {
                    str3 = "#";
                }
                contentValues.put("_key", str3);
                iv1 iv1Var = (iv1) this.OooO0oo;
                qj0 qj0Var = (qj0) this.OooO0oO;
                iv1Var.getClass();
                synchronized (qj0Var.OooO0Oo) {
                    bytes = iv1.OooO0OO(qj0Var.OooO0Oo).getBytes(StandardCharsets.UTF_8);
                }
                contentValues.put("_value", bytes);
                contentValues.put("_type", "");
                SQLiteDatabase writableDatabase = ((iv1) this.OooO0oo).OooO00o.getWritableDatabase();
                writableDatabase.beginTransaction();
                if (writableDatabase.insertWithOnConflict("items", null, contentValues, 5) != -1) {
                    writableDatabase.setTransactionSuccessful();
                }
                writableDatabase.endTransaction();
                return;
            case 2:
                uf1 uf1Var = (uf1) this.OooO0oO;
                UUID uuid = (UUID) this.OooO0o0;
                String string = uuid.toString();
                ep0 ep0VarOooO0oO = ep0.OooO0oO();
                String str4 = t02.OooO0OO;
                cn cnVar = (cn) this.OooO0o;
                ep0VarOooO0oO.OooO0Oo(str4, "Updating progress for " + uuid + " (" + cnVar + ")", new Throwable[0]);
                t02 t02Var = (t02) this.OooO0oo;
                WorkDatabase workDatabase = t02Var.OooO00o;
                WorkDatabase workDatabase2 = t02Var.OooO00o;
                workDatabase.OooO0OO();
                try {
                    w02VarOooO0oo = workDatabase2.OooOo0o().OooO0oo(string);
                } catch (Throwable th) {
                    try {
                        ep0.OooO0oO().OooO0o(t02.OooO0OO, "Error updating Worker progress", th);
                        uf1Var.OooO(th);
                    } finally {
                        workDatabase2.OooOOO();
                    }
                }
                if (w02VarOooO0oo == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (w02VarOooO0oo.OooO0O0 == 2) {
                    s02 s02Var = new s02(string, cnVar);
                    ho1 ho1VarOooOo0O = workDatabase2.OooOo0O();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ho1VarOooOo0O.OooO0o0;
                    workDatabase_Impl.OooO0O0();
                    workDatabase_Impl.OooO0OO();
                    try {
                        ((sp) ho1VarOooOo0O.OooO0o).OooO0o0(s02Var);
                        workDatabase_Impl.OooOOo0();
                        workDatabase_Impl.OooOOO();
                    } catch (Throwable th2) {
                        workDatabase_Impl.OooOOO();
                        throw th2;
                    }
                } else {
                    ep0.OooO0oO().OooOOO(str4, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.", new Throwable[0]);
                }
                uf1Var.OooO0oo(null);
                workDatabase2.OooOOo0();
                return;
            case 3:
                Context context = (Context) this.OooO0o0;
                try {
                    new zzbmz(context, (String) this.OooO0o).zza(((oO000) this.OooO0oO).OooO00o, (hj0) this.OooO0oo);
                    return;
                } catch (IllegalStateException e) {
                    zzbun.zza(context).zzh(e, "InterstitialAd.load");
                    return;
                }
            case 4:
                u62 u62Var = (u62) this.OooO0o0;
                String str5 = (String) this.OooO0o;
                d62 d62Var = (d62) this.OooO0oO;
                zzbze zzbzeVar = (zzbze) this.OooO0oo;
                me2 me2Var = u62Var.OooO0O0;
                me2Var.OooO0o0();
                synchronized (me2Var.OooO0Oo) {
                    zContains = me2Var.OooO00o.contains(str5);
                }
                if (zContains || u62Var.OooO0O0()) {
                    return;
                }
                d62Var.zzf(new ey0(u62Var.OooO00o), zzbzeVar, null);
                return;
            case 5:
                Context context2 = (Context) this.OooO0o0;
                try {
                    new zzbxp(context2, (String) this.OooO0o).zza(((o) this.OooO0oO).OooO00o, (kb1) this.OooO0oo);
                    return;
                } catch (IllegalStateException e2) {
                    zzbun.zza(context2).zzh(e2, "RewardedInterstitialAdManager.load");
                    return;
                }
            case 6:
                Context context3 = (Context) this.OooO0o0;
                try {
                    new zzbbe(context3, (String) this.OooO0o, ((oO000) this.OooO0oO).OooO00o, (y1) this.OooO0oo).zza();
                    return;
                } catch (IllegalStateException e3) {
                    zzbun.zza(context3).zzh(e3, "AppOpenAd.load");
                    return;
                }
            case 7:
                Context context4 = (Context) this.OooO0o0;
                try {
                    new zzbxe(context4, (String) this.OooO0o).zza(((o) this.OooO0oO).OooO00o, (ib1) this.OooO0oo);
                    return;
                } catch (IllegalStateException e4) {
                    zzbun.zza(context4).zzh(e4, "RewardedAd.loadAdManager");
                    return;
                }
            case 8:
                Context context5 = (Context) this.OooO0o0;
                try {
                    new zzbxp(context5, (String) this.OooO0o).zza(((oO000) this.OooO0oO).OooO00o, (kb1) this.OooO0oo);
                    return;
                } catch (IllegalStateException e5) {
                    zzbun.zza(context5).zzh(e5, "RewardedInterstitialAd.load");
                    return;
                }
            case 9:
                Context context6 = (Context) this.OooO0o0;
                try {
                    new zzbxe(context6, (String) this.OooO0o).zza(((oO000) this.OooO0oO).OooO00o, (ib1) this.OooO0oo);
                    return;
                } catch (IllegalStateException e6) {
                    zzbun.zza(context6).zzh(e6, "RewardedAd.load");
                    return;
                }
            case 10:
                wa3 wa3Var = (wa3) this.OooO0o0;
                zzdsd zzdsdVar = (zzdsd) this.OooO0o;
                ArrayDeque arrayDeque = (ArrayDeque) this.OooO0oO;
                ArrayDeque arrayDeque2 = (ArrayDeque) this.OooO0oo;
                wa3Var.OooO0Oo(zzdsdVar, arrayDeque, "to");
                wa3Var.OooO0Oo(zzdsdVar, arrayDeque2, "of");
                return;
            default:
                ic3 ic3Var = (ic3) this.OooO0o0;
                o00Oo00 o00oo00 = (o00Oo00) this.OooO0o;
                f63 f63Var = (f63) this.OooO0oO;
                String str6 = (String) this.OooO0oo;
                yn1 yn1Var = (yn1) o00oo00.OooO0o;
                yn1Var.OooO0o = f63Var;
                ab3 ab3Var = (ab3) yn1Var.OooO0o0;
                if (ab3Var == null || (str = ab3Var.OooO0Oo) == null || str.isEmpty()) {
                    str = "NA";
                } else {
                    by2.OooO0oo(str);
                }
                ax2 ax2Var = new ax2();
                ax2Var.OooO00o = ic3Var.OooO00o;
                ax2Var.OooO0O0 = ic3Var.OooO0O0;
                synchronized (ic3.class) {
                    try {
                        qf2VarOooO0o = ic3.OooOO0O;
                        if (qf2VarOooO0o == null) {
                            ro0 ro0Var = new ro0(new so0(Resources.getSystem().getConfiguration().getLocales()));
                            OooO0O0 oooO0O0 = new OooO0O0();
                            for (int i = 0; i < ro0Var.OooO0O0(); i++) {
                                Locale locale = ro0Var.OooO00o.OooO00o.get(i);
                                o0O000O o0o000o = df.OooO00o;
                                oooO0O0.OooO0Oo(locale.toLanguageTag());
                            }
                            qf2VarOooO0o = oooO0O0.OooO0o();
                            ic3.OooOO0O = qf2VarOooO0o;
                        }
                    } finally {
                    }
                }
                ax2Var.OooOO0O = qf2VarOooO0o;
                ax2Var.OooO0oO = Boolean.TRUE;
                ax2Var.OooO0Oo = str;
                ax2Var.OooO0OO = str6;
                ax2Var.OooO0o0 = ic3Var.OooO0o.OooO0o() ? (String) ic3Var.OooO0o.OooO0Oo() : ic3Var.OooO0Oo.OooO00o();
                ax2Var.OooO = 10;
                ax2Var.OooOO0 = Integer.valueOf(ic3Var.OooO0oo);
                o00oo00.OooO0oO = ax2Var;
                ic3Var.OooO0OO.OooO00o(o00oo00);
                return;
        }
    }

    public /* synthetic */ sb(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
        this.OooO0oO = obj3;
        this.OooO0oo = obj4;
    }
}
