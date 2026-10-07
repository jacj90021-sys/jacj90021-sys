package com.cmaster.cloner;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzboq;
import com.google.android.gms.internal.ads.zzbot;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzfhi;
import com.google.android.gms.internal.ads.zzfhj;
import com.google.android.gms.internal.ads.zzfhx;
import com.google.android.gms.internal.ads.zzgcu;
import com.google.android.gms.internal.ads.zzgdn;
import com.google.android.gms.internal.ads.zzgdy;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sc implements oc1, bz0 {
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public long OooO0o0;

    public sc(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 2:
                break;
            default:
                this.OooO0o0 = 0L;
                break;
        }
    }

    public static final void OooOO0(zzdsj zzdsjVar, String str, long j) {
        if (zzdsjVar != null) {
            if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zznb)).booleanValue()) {
                zzdsi zzdsiVarZza = zzdsjVar.zza();
                zzdsiVarZza.zzb("action", "lat_init");
                zzdsiVarZza.zzb(str, Long.toString(j));
                zzdsiVarZza.zzj();
            }
        }
    }

    public void OooO(Context context, ms1 ms1Var, boolean z, zzbzm zzbzmVar, String str, String str2, Runnable runnable, zzfhx zzfhxVar, final zzdsj zzdsjVar, final Long l, boolean z2) throws JSONException {
        nn0 nn0VarZzb;
        PackageInfo packageInfoOooO0oO;
        final zzfhx zzfhxVar2 = zzfhxVar;
        ya3 ya3Var = ya3.OooOooO;
        yn ynVar = ya3Var.OooOO0O;
        yn ynVar2 = ya3Var.OooOO0O;
        ynVar.getClass();
        if (SystemClock.elapsedRealtime() - this.OooO0o0 < 5000) {
            int i = uh2.OooO0O0;
            uh2.OooOO0("Not retrying to fetch app settings");
            return;
        }
        ynVar2.getClass();
        this.OooO0o0 = SystemClock.elapsedRealtime();
        if (zzbzmVar != null && !TextUtils.isEmpty(zzbzmVar.zzc())) {
            long jZza = zzbzmVar.zza();
            ynVar2.getClass();
            if (System.currentTimeMillis() - jZza <= ((Long) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzew)).longValue() && zzbzmVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            int i2 = uh2.OooO0O0;
            uh2.OooOO0("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i3 = uh2.OooO0O0;
            uh2.OooOO0("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.OooO0o = applicationContext;
        final zzfhj zzfhjVarZza = zzfhi.zza(context, 4);
        zzfhjVarZza.zzi();
        zzbow zzbowVarZza = ya3Var.OooOOo.zza((Context) this.OooO0o, ms1Var, zzfhxVar2);
        zzboq zzboqVar = zzbot.zza;
        zzbom zzbomVarZza = zzbowVarZza.zza("google.afma.config.fetchAppSettings", zzboqVar, zzboqVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            zzbcv zzbcvVar = zzbde.zza;
            u72 u72Var = u72.OooO0Oo;
            jSONObject.put("experiment_ids", TextUtils.join(",", u72Var.OooO00o.zza()));
            jSONObject.put("js", ms1Var.OooO0Oo);
            if (((Boolean) u72Var.OooO0OO.zzb(zzbde.zzjV)).booleanValue()) {
                jSONObject.put("inspector_enabled", z2);
            }
            try {
                ApplicationInfo applicationInfo = ((Context) this.OooO0o).getApplicationInfo();
                if (applicationInfo != null && (packageInfoOooO0oO = e12.OooO00o(context).OooO0oO(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoOooO0oO.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                uh2.OooO00o("Error fetching PackageInfo.");
            }
            nn0VarZzb = zzbomVarZza.zzb(jSONObject);
        } catch (Exception e) {
            e = e;
            Exception exc = e;
            int i4 = uh2.OooO0O0;
            uh2.OooO0oo("Error requesting application settings", exc);
            zzfhjVarZza.zzh(exc);
            zzfhjVarZza.zzg(false);
            zzfhxVar2.zzc(zzfhjVarZza.zzm());
        }
        try {
            zzgcu zzgcuVar = new zzgcu(this) { // from class: com.cmaster.cloner.ke2
                @Override // com.google.android.gms.internal.ads.zzgcu
                public final nn0 zza(Object obj) throws JSONException {
                    Long l2 = l;
                    zzdsj zzdsjVar2 = zzdsjVar;
                    zzfhj zzfhjVar = zzfhjVarZza;
                    zzfhx zzfhxVar3 = zzfhxVar2;
                    JSONObject jSONObject2 = (JSONObject) obj;
                    int i5 = 0;
                    boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                    if (zOptBoolean) {
                        String string = jSONObject2.getString("appSettingsJson");
                        ya3 ya3Var2 = ya3.OooOooO;
                        ts2 ts2Var = (ts2) ya3Var2.OooO0oo.zzi();
                        ts2Var.OooOO0o();
                        synchronized (ts2Var.OooO00o) {
                            try {
                                ya3Var2.OooOO0O.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (string == null || string.equals(ts2Var.OooOOO.zzc())) {
                                    ts2Var.OooOOO.zzg(jCurrentTimeMillis);
                                } else {
                                    ts2Var.OooOOO = new zzbzm(string, jCurrentTimeMillis);
                                    SharedPreferences.Editor editor = ts2Var.OooO0oO;
                                    if (editor != null) {
                                        editor.putString("app_settings_json", string);
                                        ts2Var.OooO0oO.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                        ts2Var.OooO0oO.apply();
                                    }
                                    ts2Var.OooOOO0();
                                    ArrayList arrayList = ts2Var.OooO0OO;
                                    int size = arrayList.size();
                                    while (i5 < size) {
                                        Object obj2 = arrayList.get(i5);
                                        i5++;
                                        ((Runnable) obj2).run();
                                    }
                                }
                            } finally {
                            }
                        }
                        if (l2 != null) {
                            ya3.OooOooO.OooOO0O.getClass();
                            sc.OooOO0(zzdsjVar2, "cld_s", SystemClock.elapsedRealtime() - l2.longValue());
                        }
                    }
                    String strOptString = jSONObject2.optString("errorReason", "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        zzfhjVar.zzc(strOptString);
                    }
                    zzfhjVar.zzg(zOptBoolean);
                    zzfhxVar3.zzc(zzfhjVar.zzm());
                    return zzgdn.zzh(null);
                }
            };
            zzgdy zzgdyVar = zzcaf.zzg;
            nn0 nn0VarZzn = zzgdn.zzn(nn0VarZzb, zzgcuVar, zzgdyVar);
            if (runnable != null) {
                nn0VarZzb.addListener(runnable, zzgdyVar);
            }
            if (l != null) {
                nn0VarZzb.addListener(new bf1(this, zzdsjVar, l), zzgdyVar);
            }
            if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzia)).booleanValue()) {
                zzcai.zzb(nn0VarZzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcai.zza(nn0VarZzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e2) {
            e = e2;
            zzfhjVarZza = zzfhjVarZza;
            zzfhxVar2 = zzfhxVar2;
            Exception exc2 = e;
            int i42 = uh2.OooO0O0;
            uh2.OooO0oo("Error requesting application settings", exc2);
            zzfhjVarZza.zzh(exc2);
            zzfhjVarZza.zzg(false);
            zzfhxVar2.zzc(zzfhjVarZza.zzm());
        }
    }

    public void OooO00o(int i) {
        if (i < 64) {
            this.OooO0o0 &= ~(1 << i);
            return;
        }
        sc scVar = (sc) this.OooO0o;
        if (scVar != null) {
            scVar.OooO00o(i - 64);
        }
    }

    public int OooO0O0(int i) {
        sc scVar = (sc) this.OooO0o;
        if (scVar == null) {
            long j = this.OooO0o0;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.OooO0o0);
        }
        return Long.bitCount(this.OooO0o0) + scVar.OooO0O0(i - 64);
    }

    public void OooO0OO() {
        if (((sc) this.OooO0o) == null) {
            this.OooO0o = new sc(0);
        }
    }

    public boolean OooO0Oo(int i) {
        if (i < 64) {
            return ((1 << i) & this.OooO0o0) != 0;
        }
        OooO0OO();
        return ((sc) this.OooO0o).OooO0Oo(i - 64);
    }

    public boolean OooO0o(int i) {
        if (i >= 64) {
            OooO0OO();
            return ((sc) this.OooO0o).OooO0o(i - 64);
        }
        long j = 1 << i;
        long j2 = this.OooO0o0;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.OooO0o0 = j3;
        long j4 = j - 1;
        this.OooO0o0 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        sc scVar = (sc) this.OooO0o;
        if (scVar != null) {
            if (scVar.OooO0Oo(0)) {
                OooO0oo(63);
            }
            ((sc) this.OooO0o).OooO0o(0);
        }
        return z;
    }

    public void OooO0o0(int i, boolean z) {
        if (i >= 64) {
            OooO0OO();
            ((sc) this.OooO0o).OooO0o0(i - 64, z);
            return;
        }
        long j = this.OooO0o0;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.OooO0o0 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            OooO0oo(i);
        } else {
            OooO00o(i);
        }
        if (z2 || ((sc) this.OooO0o) != null) {
            OooO0OO();
            ((sc) this.OooO0o).OooO0o0(0, z2);
        }
    }

    public void OooO0oO() {
        this.OooO0o0 = 0L;
        sc scVar = (sc) this.OooO0o;
        if (scVar != null) {
            scVar.OooO0oO();
        }
    }

    public void OooO0oo(int i) {
        if (i < 64) {
            this.OooO0o0 |= 1 << i;
        } else {
            OooO0OO();
            ((sc) this.OooO0o).OooO0oo(i - 64);
        }
    }

    @Override // com.cmaster.cloner.oc1
    public Object apply(Object obj) {
        long j = this.OooO0o0;
        g5 g5Var = (g5) this.OooO0o;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        dw dwVar = qc1.OooO0oo;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        String str = g5Var.OooO00o;
        s41 s41Var = g5Var.OooO0OO;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v41.OooO00o(s41Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(v41.OooO00o(s41Var)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // com.cmaster.cloner.bz0
    public void onFailure(Exception exc) {
        vr1 vr1Var = (vr1) this.OooO0o;
        ((AtomicLong) vr1Var.OooO0o).set(this.OooO0o0);
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 0:
                if (((sc) this.OooO0o) == null) {
                    return Long.toBinaryString(this.OooO0o0);
                }
                return ((sc) this.OooO0o).toString() + "xx" + Long.toBinaryString(this.OooO0o0);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ sc(vr1 vr1Var, long j) {
        this.OooO0Oo = 3;
        this.OooO0o = vr1Var;
        this.OooO0o0 = j;
    }

    public sc(long j, g5 g5Var) {
        this.OooO0Oo = 1;
        this.OooO0o0 = j;
        this.OooO0o = g5Var;
    }
}
