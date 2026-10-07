package com.cmaster.cloner;

import android.content.pm.ApplicationInfo;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzfrw;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ho0 {
    public int OooO00o;
    public Object OooO0O0;
    public Object OooO0OO;
    public Object OooO0Oo;

    public ho0(zzcfg zzcfgVar) throws nm2 {
        this.OooO0O0 = zzcfgVar.getLayoutParams();
        ViewParent parent = zzcfgVar.getParent();
        this.OooO0Oo = zzcfgVar.zzE();
        if (!(parent instanceof ViewGroup)) {
            throw new nm2("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.OooO0OO = viewGroup;
        this.OooO00o = viewGroup.indexOfChild(zzcfgVar.zzF());
        viewGroup.removeView(zzcfgVar.zzF());
        zzcfgVar.zzaq(true);
    }

    public static void OooO0O0(int i, fo0 fo0Var, u81 u81Var) {
        int i2 = u81Var.OooO0Oo;
        if (i < 0) {
            throw new IllegalArgumentException(u7.OooO00o(new byte[]{-62, 22, -23, 33, -124, 6, -35, 20, -97, 82, -67}, new byte[]{-93, 114, -115, 83, -31, 117, -82, 52}));
        }
        if (fo0Var == null) {
            throw new NullPointerException(u7.OooO00o(new byte[]{80, -55, 46, 126, 25, -125, -63, -92, 93, -49, 51, 46, 75, -51, -120, -66, 65, -52, 49}, new byte[]{52, -96, 93, 14, 118, -16, -88, -48}));
        }
        try {
            throw new NullPointerException(u7.OooO00o(new byte[]{-25, -23, -14, 0, -92, 63, 118, -80, -40, -10, -12, 2, -26, 17, 103, -95, -7, -79, -66, 67, -73, 101, 51, -86, -31, -11, -5}, new byte[]{-108, -103, -105, 99, -118, 88, 19, -60}));
        } catch (NullPointerException unused) {
            throw new NullPointerException(u7.OooO00o(new byte[]{108, -66, 103, -113, -102, -95, -57, 54, 113, -69, 110, -128}, new byte[]{31, -50, 2, -20, -70, -100, -6, 22}));
        }
    }

    public static u81 OooO0Oo(u81 u81Var) {
        if (u81Var == null || u81Var.OooO0o0.getType() != vp1.OooOOoo) {
            return u81Var;
        }
        return u81.OooO0Oo(u81Var.OooO0Oo, vp1.OooOo);
    }

    public void OooO00o(int i, int i2) {
        int i3;
        u81 u81Var;
        int[] iArr = (int[]) this.OooO0Oo;
        boolean z = iArr == null;
        if (i != 0 || z) {
            if (i < 0) {
                ra.OooOOO0(u7.OooO00o(new byte[]{54, -26, -91, 53, 31, -33, -25, -41, 49, -82, -94, 33, 3, -53, -20, -98}, new byte[]{69, -114, -54, 64, 115, -69, -119, -16}));
                return;
            }
            if (z || i2 >= iArr.length) {
                int i4 = i2 + 1;
                w81 w81Var = new w81(i4);
                int[] iArr2 = new int[i4];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    w81 w81Var2 = (w81) this.OooO0OO;
                    int length = w81Var2.OooO0o0.length;
                    for (int i5 = 0; i5 < length; i5++) {
                        u81 u81VarOooO0o0 = w81Var2.OooO0o0(i5);
                        if (u81VarOooO0o0 != null) {
                            u81[] u81VarArr = w81Var.OooO0o0;
                            w81Var.OooO0OO();
                            if (u81VarOooO0o0 != null) {
                                w81Var.OooO0o = -1;
                                try {
                                    int i6 = u81VarOooO0o0.OooO0Oo;
                                    u81VarArr[i6] = u81VarOooO0o0;
                                    if (i6 > 0 && (u81Var = u81VarArr[i6 - 1]) != null && u81Var.OooO0OO() == 2) {
                                        u81VarArr[i3] = null;
                                    }
                                    if (u81VarOooO0o0.OooO0OO() == 2) {
                                        u81VarArr[i6 + 1] = null;
                                    }
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    ra.OooOOO(u7.OooO00o(new byte[]{73, 72, -122, -10, 9, -93, -8, 109, 104, 93, -124, -67, 14, -28, -14, 108, 78, 24, -116, -13, 7, -74, -4, 119, 93, 93}, new byte[]{58, 56, -29, -107, 39, -60, -99, 25}));
                                }
                            } else {
                                qa.OooOOO0(u7.OooO00o(new byte[]{-10, -59, -42, -53, -78, 36, -21, 51, -21, -64, -33, -60}, new byte[]{-123, -75, -77, -88, -110, 25, -42, 19}));
                            }
                        }
                    }
                    int[] iArr3 = (int[]) this.OooO0Oo;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.OooO0OO = w81Var;
                this.OooO0Oo = iArr2;
            }
        }
    }

    public void OooO0OO(int i, fo0 fo0Var, u81 u81Var) {
        if (fo0Var == fo0.OooO0Oo) {
            ra.OooOOO0(u7.OooO00o(new byte[]{-12, 6, 43, -20, -68, 85, -88, 65, -13, 78, 44, -8, -96, 65, -93, 8}, new byte[]{-121, 110, 68, -103, -48, 49, -58, 102}));
            return;
        }
        int i2 = ((int[]) this.OooO0Oo)[u81Var.OooO0Oo];
        if (i2 >= 0) {
            ((go0) ((ArrayList) this.OooO0O0).get(i2)).getClass();
            if (i == 0) {
                throw null;
            }
        }
        int i3 = u81Var.OooO0Oo;
        u81 u81VarOooO0Oo = OooO0Oo(u81Var);
        OooO00o(i, i3);
        if (((int[]) this.OooO0Oo)[i3] >= 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.OooO0O0;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            size--;
        }
        w81 w81Var = (w81) this.OooO0OO;
        w81Var.getClass();
        try {
            w81Var.OooO0o0[u81VarOooO0Oo.OooO0Oo] = null;
            w81Var.OooO0o = -1;
            arrayList.set(size, null);
            this.OooO00o++;
            for (int i4 = size - 1; i4 >= 0; i4--) {
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            ra.OooOOO(u7.OooO00o(new byte[]{39, -43, -5, -115, -92, -79, -71, 75, 34}, new byte[]{69, -70, -100, -8, -41, -111, -53, 46}));
        }
    }

    public Looper OooO0o() {
        Looper looper;
        Object obj = this.OooO0Oo;
        synchronized (obj) {
            try {
                int i = this.OooO00o;
                HandlerThread handlerThread = (HandlerThread) this.OooO0O0;
                if (i != 0) {
                    by2.OooO(handlerThread, "Invalid state: handlerThread should already been initialized.");
                } else if (handlerThread == null) {
                    uh2.OooO00o("Starting the looper thread.");
                    HandlerThread handlerThread2 = new HandlerThread("LooperProvider");
                    this.OooO0O0 = handlerThread2;
                    handlerThread2.start();
                    this.OooO0OO = new zzfrw(((HandlerThread) this.OooO0O0).getLooper());
                    uh2.OooO00o("Looper thread started.");
                } else {
                    uh2.OooO00o("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.OooO00o++;
                looper = ((HandlerThread) this.OooO0O0).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public ApplicationInfo OooO0o0(int i) throws Exception {
        Object objOooO0o;
        Object obj = this.OooO0Oo;
        Object obj2 = this.OooO0O0;
        int i2 = this.OooO00o;
        a02 a02Var = w11.OooOO0o;
        if (a02Var != null) {
            objOooO0o = a02Var.OooO0o(obj, Integer.valueOf(i), obj2, Integer.valueOf(i2));
        } else {
            a02 a02Var2 = w11.OooOO0O;
            objOooO0o = a02Var2 != null ? a02Var2.OooO0o(obj, Integer.valueOf(i), obj2, Integer.valueOf(i2)) : null;
        }
        return (ApplicationInfo) objOooO0o;
    }

    public ho0(int i, String str, String str2) {
        this.OooO0O0 = str;
        this.OooO00o = i;
        this.OooO0OO = str2;
        this.OooO0Oo = u7.OooO00o(new byte[]{13, -77}, new byte[]{66, -8, 97, 33, -40, 96, 92, 73});
    }
}
