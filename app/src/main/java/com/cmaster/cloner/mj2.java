package com.cmaster.cloner;

import android.hardware.Camera;
import android.util.Log;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mj2 extends AtomicReference implements Runnable {
    public static final oOOoOOO0 OooO0o;
    public static final oOOoOOO0 OooO0oO;
    public final /* synthetic */ nj2 OooO0Oo;
    public final uc3 OooO0o0;

    static {
        int i = 9;
        OooO0o = new oOOoOOO0(i);
        OooO0oO = new oOOoOOO0(i);
    }

    public mj2(nj2 nj2Var, uc3 uc3Var) {
        this.OooO0Oo = nj2Var;
        this.OooO0o0 = uc3Var;
    }

    public final vi2 OooO00o() {
        uc3 uc3Var = this.OooO0o0;
        wc3 wc3Var = uc3Var.OooO00o;
        float f = uc3Var.OooO0O0;
        nz0 nz0Var = wc3Var.OooOOo;
        float f2 = wc3Var.OooOO0O;
        if (f < 1.0f) {
            f = 1.0f;
        }
        float f3 = 0.0f;
        if (f2 <= 0.0f || f <= f2) {
            f2 = f;
        }
        k12 k12Var = (k12) nz0Var.OooO0o0;
        a6 a6Var = ro2.OooOOO;
        xa xaVar = k12Var.OooO00o.OooO0Oo.Oooo000;
        xaVar.getClass();
        Log.d(xa.OooOOO0, sn2.OooO00o("jVz8h+2St4je\n", "/jmI3YL92rI=\n") + f2);
        Camera camera = xaVar.OooO0O0;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            int iMax = (int) (Math.max(f2, 1.0f) * 100.0f);
            List<Integer> zoomRatios = parameters.getZoomRatios();
            int maxZoom = parameters.getMaxZoom();
            int i = 0;
            while (true) {
                if (i >= maxZoom) {
                    break;
                }
                int i2 = i + 1;
                if (zoomRatios.get(i2).intValue() > iMax) {
                    maxZoom = i;
                    break;
                }
                i = i2;
            }
            parameters.setZoom(maxZoom);
            xaVar.OooO0O0.setParameters(parameters);
            f3 = f2;
        }
        return new vi2(Float.valueOf(f3));
    }

    public final void OooO0O0(vi2 vi2Var) {
        Object ch2Var;
        Object obj;
        nj2 nj2Var = this.OooO0Oo;
        vi2Var.getClass();
        if (nj2Var.OooO0Oo == null) {
            boolean zIsCancelled = vi2Var.isCancelled();
            boolean z = true;
            if ((!lh2.OooO0oO) && zIsCancelled) {
                ch2Var = ch2.OooO0Oo;
                Objects.requireNonNull(ch2Var);
            } else {
                boolean z2 = false;
                while (true) {
                    try {
                        try {
                            obj = vi2Var.get();
                            break;
                        } catch (InterruptedException unused) {
                            z2 = z;
                        } catch (Throwable th) {
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (Error e) {
                        e = e;
                        ch2Var = new dh2(e);
                    } catch (CancellationException e2) {
                        ch2Var = !zIsCancelled ? new dh2(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(vi2Var)), e2)) : new ch2(false, e2);
                    } catch (ExecutionException e3) {
                        ch2Var = zIsCancelled ? new ch2(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(vi2Var)), e3)) : new dh2(e3.getCause());
                    } catch (Exception e4) {
                        e = e4;
                        ch2Var = new dh2(e);
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                ch2Var = zIsCancelled ? new ch2(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(vi2Var)))) : obj == null ? lh2.OooOO0 : obj;
            }
            if (lh2.OooO.OooO0o(nj2Var, null, ch2Var)) {
                lh2.OooO0Oo(nj2Var);
            }
        }
    }

    public final void OooO0OO(Thread thread) {
        Runnable runnable = (Runnable) get();
        bj2 bj2Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof bj2;
            oOOoOOO0 ooooooo0 = OooO0oO;
            if (!z2) {
                if (runnable != ooooooo0) {
                    break;
                }
            } else {
                bj2Var = (bj2) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == ooooooo0 || compareAndSet(runnable, ooooooo0)) {
                z = Thread.interrupted() || z;
                LockSupport.park(bj2Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        vi2 vi2VarOooO00o = null;
        if (compareAndSet(null, threadCurrentThread)) {
            nj2 nj2Var = this.OooO0Oo;
            boolean zIsDone = nj2Var.isDone();
            oOOoOOO0 ooooooo0 = OooO0o;
            if (!zIsDone) {
                try {
                    vi2VarOooO00o = OooO00o();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, ooooooo0)) {
                            OooO0OO(threadCurrentThread);
                        }
                        if (lh2.OooO.OooO0o(nj2Var, null, new dh2(th))) {
                            lh2.OooO0Oo(nj2Var);
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        if (!compareAndSet(threadCurrentThread, ooooooo0)) {
                            OooO0OO(threadCurrentThread);
                        }
                        OooO0O0(null);
                        throw null;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, ooooooo0)) {
                OooO0OO(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            OooO0O0(vi2VarOooO00o);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return rj.OooO0Oo(runnable == OooO0o ? "running=[DONE]" : runnable instanceof bj2 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? px0.OooOOOO("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.OooO0o0.toString());
    }
}
