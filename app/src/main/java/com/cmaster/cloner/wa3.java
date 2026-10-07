package com.cmaster.cloner;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzdso;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wa3 {
    public ConcurrentHashMap OooO;
    public final int OooO00o;
    public final long OooO0O0;
    public final boolean OooO0OO;
    public final boolean OooO0Oo;
    public final Map OooO0o0;
    public final zzdso OooO0oo;
    public final ArrayDeque OooO0o = new ArrayDeque();
    public final ArrayDeque OooO0oO = new ArrayDeque();

    public wa3(zzdso zzdsoVar) {
        this.OooO0oo = zzdsoVar;
        zzbcv zzbcvVar = zzbde.zzhe;
        u72 u72Var = u72.OooO0Oo;
        this.OooO00o = ((Integer) u72Var.OooO0OO.zzb(zzbcvVar)).intValue();
        zzbcv zzbcvVar2 = zzbde.zzhf;
        zzbdc zzbdcVar = u72Var.OooO0OO;
        this.OooO0O0 = ((Long) zzbdcVar.zzb(zzbcvVar2)).longValue();
        this.OooO0OO = ((Boolean) zzbdcVar.zzb(zzbde.zzhj)).booleanValue();
        this.OooO0Oo = ((Boolean) zzbdcVar.zzb(zzbde.zzhi)).booleanValue();
        this.OooO0o0 = Collections.synchronizedMap(new k83(this));
    }

    public final synchronized String OooO00o(String str, zzdsd zzdsdVar) {
        r93 r93Var = (r93) this.OooO0o0.get(str);
        zzdsdVar.zzb().put("request_id", str);
        if (r93Var == null) {
            zzdsdVar.zzb().put("mhit", "false");
            return null;
        }
        zzdsdVar.zzb().put("mhit", "true");
        return r93Var.OooO0O0;
    }

    public final synchronized void OooO0O0(String str, String str2, zzdsd zzdsdVar) {
        ya3.OooOooO.OooOO0O.getClass();
        this.OooO0o0.put(str, new r93(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        OooO0o0();
        OooO0OO(zzdsdVar);
    }

    public final synchronized void OooO0OO(zzdsd zzdsdVar) throws Throwable {
        try {
            try {
                if (this.OooO0OO) {
                    ArrayDeque arrayDeque = this.OooO0oO;
                    ArrayDeque arrayDequeClone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.OooO0o;
                    ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    zzcaf.zza.execute(new sb(this, zzdsdVar, arrayDequeClone, arrayDequeClone2, 10, false));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void OooO0Oo(zzdsd zzdsdVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdsdVar.zzb());
            this.OooO = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.OooO.put("e_r", str);
            this.OooO.put("e_id", (String) pair2.first);
            if (this.OooO0Oo) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(x63.OooO0O0(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.OooO;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.OooO;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.OooO0oo.zzg(this.OooO);
        }
    }

    public final synchronized void OooO0o0() {
        ya3.OooOooO.OooOO0O.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.OooO0o0.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((r93) entry.getValue()).OooO00o.longValue() <= this.OooO0O0) {
                    break;
                }
                this.OooO0oO.add(new Pair((String) entry.getKey(), ((r93) entry.getValue()).OooO0O0));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            ya3.OooOooO.OooO0oo.zzw(e, "QueryJsonMap.removeExpiredEntries");
        }
    }
}
