package com.cmaster.cloner;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzgdy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k23 {
    public final HashMap OooO00o = new HashMap();
    public final HashMap OooO0O0 = new HashMap();
    public final Context OooO0OO;
    public final zzdso OooO0Oo;
    public final ExecutorService OooO0o0;

    public k23(Context context, zzdso zzdsoVar, zzgdy zzgdyVar) {
        this.OooO0OO = context;
        this.OooO0Oo = zzdsoVar;
        this.OooO0o0 = zzgdyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:5:0x0011, B:10:0x0027, B:12:0x002b, B:18:0x0035, B:20:0x0039, B:22:0x004a, B:26:0x0054, B:29:0x0073, B:30:0x0077, B:32:0x007d, B:21:0x0042, B:17:0x0032), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void OooO00o(final boolean r10, com.cmaster.cloner.z43 r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = r9.OooO00o     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L30
            com.cmaster.cloner.z43 r2 = (com.cmaster.cloner.z43) r2     // Catch: java.lang.Throwable -> L30
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            com.cmaster.cloner.ya3 r5 = com.cmaster.cloner.ya3.OooOooO     // Catch: java.lang.Throwable -> L30
            com.cmaster.cloner.yn r5 = r5.OooOO0O     // Catch: java.lang.Throwable -> L30
            r5.getClass()     // Catch: java.lang.Throwable -> L30
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L30
            long r7 = r2.OooO0OO     // Catch: java.lang.Throwable -> L30
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 > 0) goto L24
            r5 = r3
            goto L25
        L24:
            r5 = r4
        L25:
            if (r5 != 0) goto L32
            com.cmaster.cloner.a61 r2 = r2.OooO00o     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            com.cmaster.cloner.a61 r2 = r11.OooO00o     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L35
            goto L32
        L30:
            r10 = move-exception
            goto L89
        L32:
            r0.put(r1, r11)     // Catch: java.lang.Throwable -> L30
        L35:
            com.cmaster.cloner.a61 r0 = r11.OooO00o     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L42
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfj.zzf     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
            goto L4a
        L42:
            com.google.android.gms.internal.ads.zzbeo r0 = com.google.android.gms.internal.ads.zzbfj.zzg     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L30
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L30
        L4a:
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L30
            com.cmaster.cloner.a61 r0 = r11.OooO00o     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L53
            goto L54
        L53:
            r3 = r4
        L54:
            java.util.concurrent.ScheduledExecutorService r0 = com.google.android.gms.internal.ads.zzcaf.zzd     // Catch: java.lang.Throwable -> L30
            com.cmaster.cloner.gx2 r2 = new com.cmaster.cloner.gx2     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L30
            r0.schedule(r2, r5, r10)     // Catch: java.lang.Throwable -> L30
            java.util.HashMap r10 = r9.OooO0O0     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r10.get(r1)     // Catch: java.lang.Throwable -> L30
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            r10.put(r1, r2)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L73
            goto L87
        L73:
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L77:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L87
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L30
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L30
            r9.OooO0Oo(r11, r0, r4)     // Catch: java.lang.Throwable -> L30
            goto L77
        L87:
            monitor-exit(r9)
            return
        L89:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L30
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k23.OooO00o(boolean, com.cmaster.cloner.z43):void");
    }

    public final synchronized void OooO0O0(Object obj, b61 b61Var) throws Throwable {
        try {
            try {
                ya3.OooOooO.OooOO0O.getClass();
                Pair pair = new Pair(b61Var, Long.valueOf(System.currentTimeMillis()));
                zzcaf.zzf.execute(new l1(this, obj, pair, 20, false));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void OooO0OO(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        HashMap map = this.OooO0O0;
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.OooO0o0.submit(new nh1(2, this, z));
    }

    public final void OooO0Oo(z43 z43Var, Pair pair, boolean z) {
        z43Var.OooO0o0.set(true);
        a61 a61Var = z43Var.OooO00o;
        if (a61Var != null) {
            ((b61) pair.first).onSuccess(a61Var);
        } else {
            ((b61) pair.first).onFailure(z43Var.OooO0O0);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        ya3.OooOooO.OooOO0O.getClass();
        x63.OooO0Oo(this.OooO0Oo, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z)), new Pair("sgpc_rs", Boolean.toString(a61Var != null)));
    }

    public final synchronized void OooO0o0(boolean z, boolean z2) {
        k23 k23Var;
        Throwable th;
        Bundle bundle;
        int i;
        Boolean boolValueOf;
        try {
            bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z);
            HashMap map = this.OooO00o;
            Boolean boolValueOf2 = Boolean.valueOf(z);
            z43 z43Var = (z43) map.get(boolValueOf2);
            if (!z2 || z43Var == null) {
                i = 0;
            } else {
                try {
                    i = z43Var.OooO0Oo + 1;
                } catch (Throwable th2) {
                    th = th2;
                    k23Var = this;
                    throw th;
                }
            }
            z43 z43Var2 = (z43) map.get(boolValueOf2);
            if (z43Var2 == null) {
                boolValueOf = null;
            } else {
                try {
                    boolValueOf = Boolean.valueOf(z43Var2.OooO0o0.get());
                } catch (Throwable th3) {
                    th = th3;
                    k23Var = this;
                    th = th;
                    throw th;
                }
            }
            k23Var = this;
        } catch (Throwable th4) {
            th = th4;
            k23Var = this;
        }
        try {
            q33 q33Var = new q33(k23Var, z, i, boolValueOf, this.OooO0Oo);
            try {
                oO000 oo000 = new oO000((oO0000o0) new oO0000o0(0).OooO0O0(bundle));
                if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlz)).booleanValue()) {
                    k23Var.OooO0o0.submit(new j42(k23Var, oo000, q33Var, 3));
                } else {
                    a61.OooO00o(k23Var.OooO0OO, oo000, q33Var);
                }
            } catch (Throwable th5) {
                th = th5;
                th = th;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            th = th;
            throw th;
        }
    }
}
