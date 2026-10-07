package com.cmaster.cloner;

import android.util.ArraySet;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class o00OOOOo implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ o00OOOOo(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    private final void OooO00o() {
        o01 o01Var = (o01) this.OooO0o0;
        synchronized (o01Var.OooOOOO) {
            try {
                o01Var.o00O00();
                File[] fileArrListFiles = o01Var.OooOO0O.listFiles();
                ArraySet arraySet = new ArraySet();
                if (fileArrListFiles != null) {
                    arraySet.ensureCapacity(fileArrListFiles.length);
                    Collections.addAll(arraySet, fileArrListFiles);
                }
                for (int i = 0; i < o01Var.OooOOOO.size(); i++) {
                    arraySet.remove(o01Var.o00O0000(((t01) o01Var.OooOOOO.valueAt(i)).OooO0oo));
                }
                Iterator it = arraySet.iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    u7.OooO00o(new byte[]{-36, -47, 9, 110, 44, -35, -66, -70, -72, -37, 23, 123, 48, -43, -66, -3, -15, -41, 10, 101, 120}, new byte[]{-104, -76, 101, 11, 88, -76, -48, -35});
                    Objects.toString(file);
                    int i2 = fp0.OooO00o;
                    file.delete();
                }
                o01Var.o00O00O();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0356 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.o00OOOOo.run():void");
    }
}
