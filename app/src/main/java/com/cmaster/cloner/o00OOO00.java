package com.cmaster.cloner;

import android.app.job.JobParameters;
import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00OOO00 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ o00OOO00(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    private final void OooO00o() {
        try {
            pw1 pw1VarO00O0000 = pw1.o00O0000();
            b51 b51Var = (b51) this.OooO0o0;
            String str = b51Var.OooOO0O;
            synchronized (pw1VarO00O0000) {
                pw1VarO00O0000.OooO.OooO00o(b51Var, str);
            }
        } catch (Exception unused) {
            u7.OooO00o(new byte[]{60, -99, -62, -91, -75, -7, -94, 58, 23, -59, -43, -88, -73, -30, -68, 59, 89, -106, -43, -95, -73, -7, -94, 59, 30, -59, -46, -91, -73, -5, -94, 54, 28, -106, -127, -87, -85, -83}, new byte[]{121, -27, -95, -64, -59, -115, -53, 85});
            Objects.toString((b51) this.OooO0o0);
            int i = fp0.OooO00o;
        }
        pw1 pw1VarO00O00002 = pw1.o00O0000();
        b51 b51Var2 = (b51) this.OooO0o0;
        ho1 ho1Var = pw1VarO00O00002.OooOOO0;
        synchronized (ho1Var) {
            ApplicationInfo applicationInfo = b51Var2.OooO0Oo;
            if (applicationInfo == null) {
                u7.OooO00o(new byte[]{0, 73, -17, -75, -111, 71, -106, 101, 33, 88, -23, -88, -117, 80, -95, 114, 17, 73, -31, -86, -121, 65, -45, 113, 19, 69, -28, -4, -107, 90, -121, 127, 82, 91, -6, -77, -116, 84, -45}, new byte[]{114, 44, -120, -36, -30, 51, -13, 23});
                Objects.toString(b51Var2);
                int i2 = fp0.OooO00o;
                return;
            }
            String strOooOooo = ho1.OooOooo(b51Var2.OooO0o0, applicationInfo.packageName);
            aj1 aj1Var = (aj1) ((HashMap) ho1Var.OooO0oo).get(strOooOooo);
            if (aj1Var == null) {
                aj1Var = new aj1(ho1Var);
                ((HashMap) ho1Var.OooO0oo).put(strOooOooo, aj1Var);
            }
            aj1Var.OooO0OO(b51Var2);
        }
    }

    private final void OooO0O0() {
        ix1 ix1Var = (ix1) this.OooO0o0;
        synchronized (ix1Var.OooO0Oo) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < ix1Var.OooO0Oo.size(); i++) {
                    arrayList.add((lx) ix1Var.OooO0Oo.valueAt(i));
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    JobParameters jobParameters = ((lx) obj).OooO0o0;
                    u7.OooO00o(new byte[]{-58, -39, 31, -76, -76, 29, -8, -125, -55, -44}, new byte[]{-91, -72, 113, -41, -47, 113, -40, -30});
                    ix1Var.OooO00o(jobParameters, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void OooO0OO() {
        Object obj;
        synchronized (((gv0) this.OooO0o0).OooO0Oo) {
            obj = ((gv0) this.OooO0o0).OooO;
            ((gv0) this.OooO0o0).OooO = gv0.OooOOO;
        }
        ((gv0) this.OooO0o0).OooOO0o(obj);
    }

    private final void OooO0Oo() {
        synchronized (((o01) this.OooO0o0).OooOOOO) {
            ((o01) this.OooO0o0).o00O00O();
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARN: Type inference failed for: r0v144, types: [android.view.View, android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.cmaster.cloner.o00Oo00] */
    /* JADX WARN: Type inference failed for: r16v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v71, types: [int] */
    /* JADX WARN: Type inference failed for: r3v55, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r4v41, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.o00OOO00.run():void");
    }
}
