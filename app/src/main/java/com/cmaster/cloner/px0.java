package com.cmaster.cloner;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzgym;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class px0 {
    public static w32 OooO(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new w32(i);
    }

    public static final void OooO00o(View view, int i) {
        int iOooOOoo = rj.OooOOoo(i);
        if (iOooOOoo == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (k20.Oooo000(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iOooOOoo == 1) {
            if (k20.Oooo000(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iOooOOoo == 2) {
            if (k20.Oooo000(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iOooOOoo != 3) {
            return;
        }
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int OooO0O0(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        ra.OooOOO(OooOOO(i, "Unknown visibility "));
        return 0;
    }

    public static int OooO0OO(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return OooO0O0(view.getVisibility());
    }

    public static final boolean OooO0Oo(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static int OooO0o(int i, int i2, int i3) {
        return zzgym.zzD(i) + i2 + i3;
    }

    public static /* synthetic */ boolean OooO0o0(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static jz OooO0oO(int i, e81 e81Var) {
        tj2 tj2Var = new tj2(i);
        if (((HashMap) e81Var.OooO0o) == null) {
            e81Var.OooO0o = new HashMap();
        }
        ((HashMap) e81Var.OooO0o).put(lk2.class, tj2Var);
        return new jz((String) e81Var.OooO0o0, ((HashMap) e81Var.OooO0o) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) e81Var.OooO0o)));
    }

    public static fc0 OooO0oo(Parcel parcel) {
        fc0 fc0VarO00O0000 = ey0.o00O0000(parcel.readStrongBinder());
        parcel.recycle();
        return fc0VarO00O0000;
    }

    public static tj2 OooOO0(HashMap map, int i) {
        Collections.unmodifiableMap(new HashMap(map));
        return new tj2(i);
    }

    public static ClassCastException OooOO0O(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException OooOO0o(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String OooOOO(int i, String str) {
        return str + i;
    }

    public static String OooOOO0(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String OooOOOO(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String OooOOOo(byte[] bArr, byte[] bArr2, StringBuilder sb, int i) {
        sb.append(u7.OooO00o(bArr, bArr2));
        sb.append(i);
        return sb.toString();
    }

    public static HashMap OooOOo(Class cls, tj2 tj2Var) {
        HashMap map = new HashMap();
        map.put(cls, tj2Var);
        return map;
    }

    public static HashMap OooOOo0(Class cls, w32 w32Var) {
        HashMap map = new HashMap();
        map.put(cls, w32Var);
        return map;
    }

    public static Map OooOOoo(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static /* synthetic */ void OooOo(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                qa.OooOO0();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void OooOo0(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void OooOo00(int i, String str, String str2) {
        zzea.zzf(str2, str + i);
    }

    public static void OooOo0O(yn ynVar, Bundle bundle, String str) {
        ynVar.getClass();
        bundle.putLong(str, System.currentTimeMillis());
    }

    public static void OooOo0o(i10 i10Var, i10 i10Var2, i10 i10Var3, i10 i10Var4, i10 i10Var5) {
        oz0.OooO00o(i10Var);
        oz0.OooO00o(i10Var2);
        oz0.OooO00o(i10Var3);
        oz0.OooO00o(i10Var4);
        oz0.OooO00o(i10Var5);
    }

    public static void OooOoO(HashMap map) {
        Collections.unmodifiableMap(new HashMap(map));
    }

    public static void OooOoO0(String str, String str2, String str3) {
        zzea.zzf(str3, str2.concat(String.valueOf(str)));
    }

    public static /* synthetic */ String OooOoOO(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String OooOoo(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String OooOoo0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
