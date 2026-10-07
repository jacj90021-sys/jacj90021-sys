package com.cmaster.cloner;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yh1 implements kn, jn {
    public volatile hu0 OooO;
    public final tn OooO0Oo;
    public volatile int OooO0o;
    public final vn OooO0o0;
    public volatile fn OooO0oO;
    public volatile Object OooO0oo;
    public volatile gn OooOO0;

    public yh1(tn tnVar, vn vnVar) {
        this.OooO0Oo = tnVar;
        this.OooO0o0 = vnVar;
    }

    @Override // com.cmaster.cloner.jn
    public final void OooO00o(zk0 zk0Var, Object obj, in inVar, int i, zk0 zk0Var2) {
        this.OooO0o0.OooO00o(zk0Var, obj, inVar, this.OooO.OooO0OO.OooO0o(), zk0Var);
    }

    @Override // com.cmaster.cloner.jn
    public final void OooO0O0(zk0 zk0Var, Exception exc, in inVar, int i) {
        this.OooO0o0.OooO0O0(zk0Var, exc, inVar, this.OooO.OooO0OO.OooO0o());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // com.cmaster.cloner.kn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO0OO() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.OooO0oo
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r7.OooO0oo
            r7.OooO0oo = r1
            boolean r0 = r7.OooO0Oo(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            goto L2c
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r4, r3, r0)
        L20:
            com.cmaster.cloner.fn r0 = r7.OooO0oO
            if (r0 == 0) goto L2d
            com.cmaster.cloner.fn r0 = r7.OooO0oO
            boolean r0 = r0.OooO0OO()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r7.OooO0oO = r1
            r7.OooO = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L93
            int r1 = r7.OooO0o
            com.cmaster.cloner.tn r3 = r7.OooO0Oo
            java.util.ArrayList r3 = r3.OooO0O0()
            int r3 = r3.size()
            if (r1 >= r3) goto L93
            com.cmaster.cloner.tn r1 = r7.OooO0Oo
            java.util.ArrayList r1 = r1.OooO0O0()
            int r3 = r7.OooO0o
            int r4 = r3 + 1
            r7.OooO0o = r4
            java.lang.Object r1 = r1.get(r3)
            com.cmaster.cloner.hu0 r1 = (com.cmaster.cloner.hu0) r1
            r7.OooO = r1
            com.cmaster.cloner.hu0 r1 = r7.OooO
            if (r1 == 0) goto L32
            com.cmaster.cloner.tn r1 = r7.OooO0Oo
            com.cmaster.cloner.vr r1 = r1.OooOOOo
            com.cmaster.cloner.hu0 r3 = r7.OooO
            com.cmaster.cloner.in r3 = r3.OooO0OO
            int r3 = r3.OooO0o()
            boolean r1 = r1.OooO0OO(r3)
            if (r1 != 0) goto L7c
            com.cmaster.cloner.tn r1 = r7.OooO0Oo
            com.cmaster.cloner.hu0 r3 = r7.OooO
            com.cmaster.cloner.in r3 = r3.OooO0OO
            java.lang.Class r3 = r3.OooO00o()
            com.cmaster.cloner.yn0 r1 = r1.OooO0OO(r3)
            if (r1 == 0) goto L32
        L7c:
            com.cmaster.cloner.hu0 r0 = r7.OooO
            com.cmaster.cloner.hu0 r1 = r7.OooO
            com.cmaster.cloner.in r1 = r1.OooO0OO
            com.cmaster.cloner.tn r3 = r7.OooO0Oo
            com.cmaster.cloner.t41 r3 = r3.OooOOOO
            com.cmaster.cloner.e81 r4 = new com.cmaster.cloner.e81
            r5 = 28
            r6 = 0
            r4.<init>(r7, r0, r5, r6)
            r1.OooO0o0(r3, r4)
            r0 = r2
            goto L32
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.yh1.OooO0OO():boolean");
    }

    public final boolean OooO0Oo(Object obj) throws Throwable {
        Throwable th;
        int i = cp0.OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            nn nnVarOooO0oO = this.OooO0Oo.OooO0OO.OooO00o().OooO0oO(obj);
            Object objOooO = nnVarOooO0oO.OooO();
            zv zvVarOooO0Oo = this.OooO0Oo.OooO0Oo(objOooO);
            hx2 hx2Var = new hx2(zvVarOooO0Oo, objOooO, this.OooO0Oo.OooO, 6);
            zk0 zk0Var = this.OooO.OooO00o;
            tn tnVar = this.OooO0Oo;
            gn gnVar = new gn(zk0Var, tnVar.OooOOO);
            sr srVarOooO00o = tnVar.OooO0oo.OooO00o();
            srVarOooO00o.OooOOOO(gnVar, hx2Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + gnVar + ", data: " + obj + ", encoder: " + zvVarOooO0Oo + ", duration: " + cp0.OooO00o(jElapsedRealtimeNanos));
            }
            if (srVarOooO00o.OooO0oO(gnVar) != null) {
                this.OooOO0 = gnVar;
                this.OooO0oO = new fn(Collections.singletonList(this.OooO.OooO00o), this.OooO0Oo, this);
                this.OooO.OooO0OO.OooO0Oo();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.OooOO0 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.OooO0o0.OooO00o(this.OooO.OooO00o, nnVarOooO0oO.OooO(), this.OooO.OooO0OO, this.OooO.OooO0OO.OooO0o(), this.OooO.OooO00o);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.OooO.OooO0OO.OooO0Oo();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.cmaster.cloner.kn
    public final void cancel() {
        hu0 hu0Var = this.OooO;
        if (hu0Var != null) {
            hu0Var.OooO0OO.cancel();
        }
    }
}
