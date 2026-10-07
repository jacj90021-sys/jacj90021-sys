package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ex2 {
    public static final zf0 OooOO0 = zf0.OooO0O0;
    public static boolean OooOO0O = true;
    public boolean OooO;
    public final a6 OooO0Oo;
    public final ic3 OooO0o;
    public final jz2 OooO0o0;
    public final vr1 OooO0oO;
    public final AtomicInteger OooO0O0 = new AtomicInteger(0);
    public final AtomicBoolean OooO0OO = new AtomicBoolean(false);
    public final km OooO00o = new km(5, false);
    public final j8 OooO0oo = new j8();

    public ex2(au0 au0Var, a6 a6Var, jz2 jz2Var, ic3 ic3Var) {
        by2.OooO(au0Var, "MlKitContext can not be null");
        this.OooO0Oo = a6Var;
        this.OooO0o0 = jz2Var;
        this.OooO0o = ic3Var;
        this.OooO0oO = new vr1(au0Var.OooO0O0());
    }

    public final ac3 OooO00o(Executor executor, Callable callable, na1 na1Var) {
        by2.OooOO0O(this.OooO0O0.get() > 0);
        if (((ac3) na1Var.OooO0o0).OooO0o0()) {
            ac3 ac3Var = new ac3();
            ac3Var.OooO();
            return ac3Var;
        }
        jb jbVar = new jb();
        yl1 yl1Var = new yl1(jbVar.OooO00o);
        this.OooO00o.OooO0Oo(new o02(this, na1Var, jbVar, callable, yl1Var, 1), new oo000000(executor, na1Var, jbVar, yl1Var));
        return yl1Var.OooO00o;
    }

    public final List OooO0O0(ug0 ug0Var) throws Throwable {
        ex2 ex2Var;
        ug0 ug0Var2;
        synchronized (this) {
            try {
                try {
                    j8 j8Var = this.OooO0oo;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    j8Var.OooO00o(ug0Var);
                    try {
                        ArrayList arrayListOooO00o = this.OooO0o0.OooO00o(ug0Var);
                        ex2Var = this;
                        ug0Var2 = ug0Var;
                        try {
                            ex2Var.OooO0OO(e63.NO_ERROR, jElapsedRealtime, ug0Var2, arrayListOooO00o);
                            OooOO0O = false;
                            return arrayListOooO00o;
                        } catch (bu0 e) {
                            e = e;
                            bu0 bu0Var = e;
                            ex2Var.OooO0OO(bu0Var.OooO0Oo == 14 ? e63.MODEL_NOT_DOWNLOADED : e63.UNKNOWN_ERROR, jElapsedRealtime, ug0Var2, null);
                            throw bu0Var;
                        }
                    } catch (bu0 e2) {
                        e = e2;
                        ex2Var = this;
                        ug0Var2 = ug0Var;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    public final void OooO0OO(final e63 e63Var, long j, final ug0 ug0Var, List list) {
        final OooO0O0 oooO0O0 = new OooO0O0();
        final OooO0O0 oooO0O02 = new OooO0O0();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x5 x5Var = (x5) it.next();
                p63 p63Var = (p63) z62.OooO00o.get(x5Var.OooO00o());
                if (p63Var == null) {
                    p63Var = p63.FORMAT_UNKNOWN;
                }
                oooO0O0.OooO0Oo(p63Var);
                q63 q63Var = (q63) z62.OooO0O0.get(x5Var.OooO00o.OooO0o());
                if (q63Var == null) {
                    q63Var = q63.TYPE_UNKNOWN;
                }
                oooO0O02.OooO0Oo(q63Var);
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.OooO0o.OooO0O0(new hc3() { // from class: com.cmaster.cloner.ss2
            @Override // com.cmaster.cloner.hc3, com.cmaster.cloner.lg2
            public final o00Oo00 zza() {
                int iLimit;
                ex2 ex2Var = this.OooO0Oo;
                long j2 = jElapsedRealtime;
                e63 e63Var2 = e63Var;
                OooO0O0 oooO0O03 = oooO0O0;
                OooO0O0 oooO0O04 = oooO0O02;
                ug0 ug0Var2 = ug0Var;
                yo yoVar = new yo();
                yo yoVar2 = new yo();
                yoVar2.OooO0Oo = Long.valueOf(j2 & Long.MAX_VALUE);
                yoVar2.OooO0o0 = e63Var2;
                yoVar2.OooO0o = Boolean.valueOf(ex2.OooOO0O);
                Boolean bool = Boolean.TRUE;
                yoVar2.OooO0oO = bool;
                yoVar2.OooO0oo = bool;
                yoVar.OooO0Oo = new m53(yoVar2);
                yoVar.OooO0o0 = z62.OooO00o(ex2Var.OooO0Oo);
                yoVar.OooO0o = oooO0O03.OooO0o();
                yoVar.OooO0oO = oooO0O04.OooO0o();
                int i = ug0Var2.OooO0o;
                ex2.OooOO0.getClass();
                int i2 = ug0Var2.OooO0o;
                if (i2 == -1) {
                    Bitmap bitmap = ug0Var2.OooO00o;
                    by2.OooO0oo(bitmap);
                    iLimit = bitmap.getAllocationByteCount();
                } else if (i2 == 17 || i2 == 842094169) {
                    ByteBuffer byteBuffer = ug0Var2.OooO0O0;
                    by2.OooO0oo(byteBuffer);
                    iLimit = byteBuffer.limit();
                } else {
                    if (i2 == 35) {
                        by2.OooO0oo(null);
                        throw null;
                    }
                    iLimit = 0;
                }
                vr1 vr1Var = new vr1(11);
                vr1Var.OooO0o0 = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? h53.UNKNOWN_FORMAT : h53.NV21 : h53.NV16 : h53.YV12 : h53.YUV_420_888 : h53.BITMAP;
                vr1Var.OooO0o = Integer.valueOf(iLimit & Integer.MAX_VALUE);
                yoVar.OooO0oo = new i53(vr1Var);
                yn1 yn1Var = new yn1();
                yn1Var.OooO0Oo = ex2Var.OooO ? d63.TYPE_THICK : d63.TYPE_THIN;
                yn1Var.OooO0oO = new s63(yoVar);
                return new o00Oo00(yn1Var, 0);
            }
        }, f63.ON_DEVICE_BARCODE_DETECT);
        yo yoVar = new yo();
        yoVar.OooO0Oo = e63Var;
        yoVar.OooO0o0 = Boolean.valueOf(OooOO0O);
        yoVar.OooO0o = z62.OooO00o(this.OooO0Oo);
        yoVar.OooO0oO = oooO0O0.OooO0o();
        yoVar.OooO0oo = oooO0O02.OooO0o();
        final pl2 pl2Var = new pl2(yoVar);
        final nz0 nz0Var = new nz0(this, 23);
        final ic3 ic3Var = this.OooO0o;
        f63 f63Var = f63.UNKNOWN_EVENT;
        qo2.OooO0Oo.execute(new Runnable() { // from class: com.cmaster.cloner.gc3
            {
                f63 f63Var2 = f63.UNKNOWN_EVENT;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f63 f63Var2 = f63.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                ic3 ic3Var2 = ic3Var;
                HashMap map = ic3Var2.OooOO0;
                if (!map.containsKey(f63Var2)) {
                    map.put(f63Var2, new ma2());
                }
                ((ma2) map.get(f63Var2)).OooO0Oo(pl2Var, Long.valueOf(jElapsedRealtime));
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (ic3Var2.OooO0Oo(f63Var2, jElapsedRealtime2)) {
                    ic3Var2.OooO.put(f63Var2, Long.valueOf(jElapsedRealtime2));
                    qo2.OooO0Oo.execute(new fc3(ic3Var2, nz0Var));
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = this.OooO;
        long j2 = jCurrentTimeMillis - jElapsedRealtime;
        vr1 vr1Var = this.OooO0oO;
        int i = true != z ? 24301 : 24302;
        int i2 = e63Var.OooO0Oo;
        synchronized (vr1Var) {
            AtomicLong atomicLong = (AtomicLong) vr1Var.OooO0o;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && jElapsedRealtime2 - ((AtomicLong) vr1Var.OooO0o).get() <= 1800000) {
                return;
            }
            ac3 ac3VarOooO0o0 = ((s22) vr1Var.OooO0o0).OooO0o0(new gm1(0, Arrays.asList(new wt0(i, i2, 0, j2, jCurrentTimeMillis, null, null, 0, -1))));
            sc scVar = new sc(vr1Var, jElapsedRealtime2);
            ac3VarOooO0o0.getClass();
            ac3VarOooO0o0.OooO00o(am1.OooO00o, scVar);
        }
    }
}
