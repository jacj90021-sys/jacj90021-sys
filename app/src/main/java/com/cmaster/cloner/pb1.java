package com.cmaster.cloner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzdvi;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pb1 {
    public boolean OooO00o;
    public boolean OooO0O0;
    public final Object OooO0OO;
    public Object OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;

    public pb1(on onVar, OooOOO0 oooOOO0) {
        sb1 sb1Var = onVar.OooO0oO;
        this.OooO0OO = onVar;
        this.OooO0Oo = new mb1(-1, "", "");
        List list = onVar.OooO0o0;
        nv nvVar = nv.OooO0Oo;
        this.OooO0o0 = list == null ? nvVar : list;
        OooOOO0 oooOOO02 = new OooOOO0(this, 5);
        list = list == null ? nvVar : list;
        ob1 ob1Var = new ob1(oooOOO02);
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(ob1Var);
        Context context = onVar.OooO00o;
        String str = onVar.OooO0O0;
        jk1 jk1Var = onVar.OooO0OO;
        o00OO000 o00oo000 = onVar.OooO0Oo;
        boolean z = onVar.OooO0o;
        Executor executor = onVar.OooO0oo;
        Executor executor2 = onVar.OooO;
        Intent intent = onVar.OooOO0;
        boolean z2 = onVar.OooOO0O;
        boolean z3 = onVar.OooOO0o;
        Set set = onVar.OooOOO0;
        String str2 = onVar.OooOOO;
        File file = onVar.OooOOOO;
        Callable callable = onVar.OooOOOo;
        List list2 = onVar.OooOOo0;
        List list3 = onVar.OooOOo;
        boolean z4 = onVar.OooOOoo;
        nc1 nc1Var = onVar.OooOo00;
        vj vjVar = onVar.OooOo0;
        context.getClass();
        o00oo000.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        this.OooO0o = new ik1(new na1((kk1) oooOOO0.OooO0o(new on(context, str, jk1Var, o00oo000, arrayList, z, sb1Var, executor, executor2, intent, z2, z3, set, str2, file, callable, list2, list3, z4, nc1Var, vjVar))));
        boolean z5 = sb1Var == sb1.OooO0o;
        kk1 kk1VarOooO0OO = OooO0OO();
        if (kk1VarOooO0OO != null) {
            kk1VarOooO0OO.setWriteAheadLoggingEnabled(z5);
        }
    }

    public static final void OooO00o(pb1 pb1Var, mc1 mc1Var) throws Exception {
        Object bb1Var;
        pu puVar = (pu) pb1Var.OooO0Oo;
        on onVar = (on) pb1Var.OooO0OO;
        sb1 sb1Var = onVar.OooO0oO;
        sb1 sb1Var2 = sb1.OooO0o;
        if (sb1Var == sb1Var2) {
            zy2.OooO00o(mc1Var, "PRAGMA journal_mode = WAL");
        } else {
            zy2.OooO00o(mc1Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (onVar.OooO0oO == sb1Var2) {
            zy2.OooO00o(mc1Var, "PRAGMA synchronous = NORMAL");
        } else {
            zy2.OooO00o(mc1Var, "PRAGMA synchronous = FULL");
        }
        OooO0O0(mc1Var);
        rc1 rc1VarOooOOo0 = mc1Var.OooOOo0("PRAGMA user_version");
        try {
            rc1VarOooOOo0.OooOOOo();
            int i = (int) rc1VarOooOOo0.getLong(0);
            in2.OooO00o(rc1VarOooOOo0, null);
            int i2 = puVar.OooO00o;
            if (i != i2) {
                zy2.OooO00o(mc1Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        pb1Var.OooO0Oo(mc1Var);
                    } else {
                        pb1Var.OooO0o0(mc1Var, i, i2);
                    }
                    zy2.OooO00o(mc1Var, "PRAGMA user_version = " + i2);
                    bb1Var = vq1.OooO00o;
                } catch (Throwable th) {
                    bb1Var = new bb1(th);
                }
                if (!(bb1Var instanceof bb1)) {
                    zy2.OooO00o(mc1Var, "END TRANSACTION");
                }
                Throwable thOooO00o = cb1.OooO00o(bb1Var);
                if (thOooO00o != null) {
                    zy2.OooO00o(mc1Var, "ROLLBACK TRANSACTION");
                    throw thOooO00o;
                }
            }
            pb1Var.OooO0o(mc1Var);
        } finally {
        }
    }

    public static void OooO0O0(mc1 mc1Var) throws Exception {
        rc1 rc1VarOooOOo0 = mc1Var.OooOOo0("PRAGMA busy_timeout");
        try {
            rc1VarOooOOo0.OooOOOo();
            long j = rc1VarOooOOo0.getLong(0);
            in2.OooO00o(rc1VarOooOOo0, null);
            if (j < 3000) {
                zy2.OooO00o(mc1Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                in2.OooO00o(rc1VarOooOOo0, th);
                throw th2;
            }
        }
    }

    public static final String OooOOOo(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", ya3.OooOooO.OooO0OO.OooOoO0(context, str2));
        r82 r82VarOooO00o = new g92(context).OooO00o(0, str, map, null);
        try {
            return (String) r82VarOooO00o.get(((Integer) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzfl)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String strValueOf = String.valueOf(str);
            int i = uh2.OooO0O0;
            uh2.OooO0oo("Interrupted while retrieving a response from: ".concat(strValueOf), e);
            r82VarOooO00o.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            String strValueOf2 = String.valueOf(str);
            int i2 = uh2.OooO0O0;
            uh2.OooO0oo("Timeout while retrieving a response from: ".concat(strValueOf2), e2);
            r82VarOooO00o.cancel(true);
            return null;
        } catch (Exception e3) {
            String strValueOf3 = String.valueOf(str);
            int i3 = uh2.OooO0O0;
            uh2.OooO0oo("Error retrieving a response from: ".concat(strValueOf3), e3);
            return null;
        }
    }

    public void OooO(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = OooOOo0(context, (String) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzfk), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        a73 a73Var = ya3.OooOooO.OooO0OO;
        new la2(context, str, builderBuildUpon.build().toString(), null).zzb();
    }

    public kk1 OooO0OO() {
        zg zgVar = (zg) this.OooO0o;
        ik1 ik1Var = zgVar instanceof ik1 ? (ik1) zgVar : null;
        if (ik1Var != null) {
            return (kk1) ik1Var.OooO0Oo.OooO0o0;
        }
        return null;
    }

    public void OooO0Oo(mc1 mc1Var) throws Exception {
        pu puVar = (pu) this.OooO0Oo;
        mc1Var.getClass();
        rc1 rc1VarOooOOo0 = mc1Var.OooOOo0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (rc1VarOooOOo0.OooOOOo()) {
                if (rc1VarOooOOo0.getLong(0) == 0) {
                    z = true;
                }
            }
            in2.OooO00o(rc1VarOooOOo0, null);
            puVar.OooO00o(mc1Var);
            if (!z) {
                ub1 ub1VarOooOo0O = puVar.OooOo0O(mc1Var);
                if (!ub1VarOooOo0O.OooO00o) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ub1VarOooOo0O.OooO0O0).toString());
                }
            }
            zy2.OooO00o(mc1Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            zy2.OooO00o(mc1Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) puVar.OooO0O0) + "')");
            puVar.OooOOo(mc1Var);
            Iterator it = ((List) this.OooO0o0).iterator();
            while (it.hasNext()) {
                ((rb1) it.next()).getClass();
                if (mc1Var instanceof hk1) {
                    ((hk1) mc1Var).OooO0Oo.getClass();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooO0o(com.cmaster.cloner.mc1 r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.pb1.OooO0o(com.cmaster.cloner.mc1):void");
    }

    public void OooO0o0(mc1 mc1Var, int i, int i2) throws Exception {
        pu puVar = (pu) this.OooO0Oo;
        mc1Var.getClass();
        on onVar = (on) this.OooO0OO;
        List<xt0> listOooO00o = kw2.OooO00o(onVar.OooO0Oo, i, i2);
        if (listOooO00o != null) {
            puVar.OooOo0(mc1Var);
            for (xt0 xt0Var : listOooO00o) {
                xt0Var.getClass();
                if (!(mc1Var instanceof hk1)) {
                    throw new fx0("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                xt0Var.OooO00o(((hk1) mc1Var).OooO0Oo);
            }
            ub1 ub1VarOooOo0O = puVar.OooOo0O(mc1Var);
            if (!ub1VarOooOo0O.OooO00o) {
                throw new IllegalStateException(("Migration didn't properly handle: " + ub1VarOooOo0O.OooO0O0).toString());
            }
            puVar.OooOo00(mc1Var);
            zy2.OooO00o(mc1Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            zy2.OooO00o(mc1Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) puVar.OooO0O0) + "')");
            return;
        }
        if (kw2.OooO0O0(onVar, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (onVar.OooOOoo) {
            rc1 rc1VarOooOOo0 = mc1Var.OooOOo0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                zm0 zm0Var = new zm0(10);
                while (rc1VarOooOOo0.OooOOOo()) {
                    String strOooOO0o = rc1VarOooOOo0.OooOO0o(0);
                    if (!uj1.OooO0oo(strOooOO0o, "sqlite_") && !strOooOO0o.equals("android_metadata")) {
                        zm0Var.add(new k21(strOooOO0o, Boolean.valueOf(ij0.OooO00o(rc1VarOooOOo0.OooOO0o(1), "view"))));
                    }
                }
                zm0 zm0VarOooO00o = te.OooO00o(zm0Var);
                in2.OooO00o(rc1VarOooOOo0, null);
                ListIterator listIterator = zm0VarOooO00o.listIterator(0);
                while (true) {
                    xm0 xm0Var = (xm0) listIterator;
                    if (!xm0Var.hasNext()) {
                        break;
                    }
                    k21 k21Var = (k21) xm0Var.next();
                    String str = (String) k21Var.OooO0Oo;
                    if (((Boolean) k21Var.OooO0o0).booleanValue()) {
                        zy2.OooO00o(mc1Var, "DROP VIEW IF EXISTS " + str);
                    } else {
                        zy2.OooO00o(mc1Var, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            puVar.OooO0OO(mc1Var);
        }
        Iterator it = ((List) this.OooO0o0).iterator();
        while (it.hasNext()) {
            ((rb1) it.next()).getClass();
            if (mc1Var instanceof hk1) {
                ((hk1) mc1Var).OooO0Oo.getClass();
            }
        }
        puVar.OooO00o(mc1Var);
    }

    public void OooO0oO(Context context) {
        zzdvi zzdviVar;
        if (!((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzjE)).booleanValue() || (zzdviVar = (zzdvi) this.OooO0oO) == null) {
            return;
        }
        zzdviVar.zzh(new i62(this, context), zzdvh.DEBUG_MENU);
    }

    public void OooO0oo(Context context, String str, String str2) {
        a73 a73Var = ya3.OooOooO.OooO0OO;
        a73.OooOOo(OooOOo0(context, (String) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzfh), str, str2), context);
    }

    public void OooOO0(boolean z) {
        synchronized (this.OooO0OO) {
            try {
                this.OooO0O0 = z;
                if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzjE)).booleanValue()) {
                    ((ts2) ya3.OooOooO.OooO0oo.zzi()).OooOOo(z);
                    zzdvi zzdviVar = (zzdvi) this.OooO0oO;
                    if (zzdviVar != null) {
                        zzdviVar.zzl(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void OooOO0O(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            a73.OooOO0o.post(new m62(this, context, str, z, z2));
        } else {
            int i = uh2.OooO0O0;
            uh2.OooO("Can not create dialog without Activity Context");
        }
    }

    public boolean OooOO0o(Context context, String str, String str2) {
        zzbcv zzbcvVar = zzbde.zzfj;
        u72 u72Var = u72.OooO0Oo;
        String strOooOOOo = OooOOOo(context, OooOOo0(context, (String) u72Var.OooO0OO.zzb(zzbcvVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strOooOOOo)) {
            int i = uh2.OooO0O0;
            uh2.OooO0o0("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strOooOOOo.trim()).optString("debug_mode"));
            OooOO0(zEquals);
            if (((Boolean) u72Var.OooO0OO.zzb(zzbde.zzjE)).booleanValue()) {
                om2 om2VarZzi = ya3.OooOooO.OooO0oo.zzi();
                if (true != zEquals) {
                    str = "";
                }
                ((ts2) om2VarZzi).OooOOo0(str);
            }
            return zEquals;
        } catch (JSONException e) {
            int i2 = uh2.OooO0O0;
            uh2.OooOO0O("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public boolean OooOOO() {
        boolean z;
        synchronized (this.OooO0OO) {
            z = this.OooO00o;
        }
        return z;
    }

    public boolean OooOOO0() {
        boolean z;
        synchronized (this.OooO0OO) {
            z = this.OooO0O0;
        }
        return z;
    }

    public boolean OooOOOO(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !OooOOO()) {
            return false;
        }
        int i = uh2.OooO0O0;
        uh2.OooO0o0("Sending troubleshooting signals to the server.");
        OooO(context, str, str2, str3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0015, B:7:0x001b, B:12:0x003f, B:14:0x0047, B:16:0x0058, B:19:0x006a, B:11:0x0036, B:20:0x0071, B:21:0x0075), top: B:26:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.net.Uri OooOOo0(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            android.net.Uri r7 = android.net.Uri.parse(r7)
            android.net.Uri$Builder r7 = r7.buildUpon()
            java.lang.Object r0 = r5.OooO0OO
            monitor-enter(r0)
            java.lang.Object r1 = r5.OooO0Oo     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L34
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L71
            com.cmaster.cloner.ya3 r1 = com.cmaster.cloner.ya3.OooOooO     // Catch: java.lang.Throwable -> L34
            com.cmaster.cloner.a73 r1 = r1.OooO0OO     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r6.openFileInput(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r4 = 1
            com.cmaster.cloner.et2.OooO0O0(r1, r3, r4)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            goto L3f
        L34:
            r5 = move-exception
            goto L8a
        L36:
            java.lang.String r1 = "Error reading from internal storage."
            int r2 = com.cmaster.cloner.uh2.OooO0O0     // Catch: java.lang.Throwable -> L34
            com.cmaster.cloner.uh2.OooO0o0(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = ""
        L3f:
            r5.OooO0Oo = r2     // Catch: java.lang.Throwable -> L34
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L71
            com.cmaster.cloner.ya3 r1 = com.cmaster.cloner.ya3.OooOooO     // Catch: java.lang.Throwable -> L34
            com.cmaster.cloner.a73 r1 = r1.OooO0OO     // Catch: java.lang.Throwable -> L34
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L34
            r5.OooO0Oo = r1     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L69
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L69
            r6.write(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L69
            r6.close()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L69
            goto L71
        L69:
            r6 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            int r2 = com.cmaster.cloner.uh2.OooO0O0     // Catch: java.lang.Throwable -> L34
            com.cmaster.cloner.uh2.OooO0oo(r1, r6)     // Catch: java.lang.Throwable -> L34
        L71:
            java.lang.Object r5 = r5.OooO0Oo     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = "linkedDeviceId"
            r7.appendQueryParameter(r6, r5)
            java.lang.String r5 = "adSlotPath"
            r7.appendQueryParameter(r5, r8)
            java.lang.String r5 = "afmaVersion"
            r7.appendQueryParameter(r5, r9)
            android.net.Uri r5 = r7.build()
            return r5
        L8a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.pb1.OooOOo0(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public pb1() {
        this.OooO0OO = new Object();
        this.OooO0Oo = "";
        this.OooO0o0 = "";
        this.OooO00o = false;
        this.OooO0O0 = false;
        this.OooO0o = "";
    }

    public pb1(on onVar, pu puVar) {
        int i;
        eh ehVar;
        sb1 sb1Var = onVar.OooO0oO;
        jk1 jk1Var = onVar.OooO0OO;
        String str = onVar.OooO0O0;
        this.OooO0OO = onVar;
        this.OooO0Oo = puVar;
        Object obj = onVar.OooO0o0;
        this.OooO0o0 = obj == null ? nv.OooO0Oo : obj;
        nc1 nc1Var = onVar.OooOo00;
        if (nc1Var != null) {
            if (str == null) {
                ehVar = new eh(new o0O000O(this, nc1Var));
            } else {
                o0O000O o0o000o = new o0O000O(this, nc1Var);
                int iOrdinal = sb1Var.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + sb1Var + '\'').toString());
                    }
                    i = 4;
                }
                int iOrdinal2 = sb1Var.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + sb1Var + '\'').toString());
                }
                ehVar = new eh(o0o000o, str, i);
            }
            this.OooO0o = ehVar;
        } else if (jk1Var != null) {
            Context context = onVar.OooO00o;
            context.getClass();
            this.OooO0o = new ik1(new na1(jk1Var.OooO0Oo(new km(context, str, new nb1(this, puVar.OooO00o), false))));
        } else {
            ra.OooOOO("SQLiteManager was constructed with both null driver and open helper factory!");
            throw null;
        }
        boolean z = sb1Var == sb1.OooO0o;
        kk1 kk1VarOooO0OO = OooO0OO();
        if (kk1VarOooO0OO != null) {
            kk1VarOooO0OO.setWriteAheadLoggingEnabled(z);
        }
    }
}
