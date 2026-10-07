package com.cmaster.cloner;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o40 implements Runnable {
    public long OooO0o;
    public long OooO0o0;
    public static final ThreadLocal OooO0oo = new ThreadLocal();
    public static final p12 OooO = new p12(3);
    public final ArrayList OooO0Oo = new ArrayList();
    public final ArrayList OooO0oO = new ArrayList();

    public static y71 OooO0OO(RecyclerView recyclerView, int i, long j) {
        int iOooOOO = recyclerView.OooO.OooOOO();
        for (int i2 = 0; i2 < iOooOOO; i2++) {
            y71 y71VarOooo0oo = RecyclerView.Oooo0oo(recyclerView.OooO.OooOOO0(i2));
            if (y71VarOooo0oo.OooO0OO == i && !y71VarOooo0oo.OooO0oo()) {
                return null;
            }
        }
        p71 p71Var = recyclerView.OooO0o;
        if (j == Long.MAX_VALUE) {
            try {
                if (fo1.OooO00o()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.OoooOOO(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.o000oOoO();
        y71 y71VarOooOO0o = p71Var.OooOO0o(i, j);
        if (y71VarOooOO0o != null) {
            if (!y71VarOooOO0o.OooO0oO() || y71VarOooOO0o.OooO0oo()) {
                p71Var.OooO00o(y71VarOooOO0o, false);
            } else {
                p71Var.OooO(y71VarOooOO0o.OooO00o);
            }
        }
        recyclerView.OoooOOO(false);
        Trace.endSection();
        return y71VarOooOO0o;
    }

    public final void OooO00o(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.OooOo0O) {
            if (RecyclerView.o0O0O00 && !this.OooO0Oo.contains(recyclerView)) {
                qa.OooO0o("attempting to post unregistered view!");
                return;
            } else if (this.OooO0o0 == 0) {
                this.OooO0o0 = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        ed edVar = recyclerView.OooooOo;
        edVar.OooO00o = i;
        edVar.OooO0O0 = i2;
    }

    public final void OooO0O0(long j) {
        n40 n40Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        n40 n40Var2;
        ArrayList arrayList = this.OooO0Oo;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            ed edVar = recyclerView3.OooooOo;
            if (windowVisibility == 0) {
                edVar.OooO0Oo(recyclerView3, false);
                i += edVar.OooO0OO;
            }
        }
        ArrayList arrayList2 = this.OooO0oO;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                ed edVar2 = recyclerView4.OooooOo;
                int iAbs = Math.abs(edVar2.OooO0O0) + Math.abs(edVar2.OooO00o);
                int i5 = z ? 1 : 0;
                while (i5 < edVar2.OooO0OO * 2) {
                    if (i4 >= arrayList2.size()) {
                        n40Var2 = new n40();
                        arrayList2.add(n40Var2);
                    } else {
                        n40Var2 = (n40) arrayList2.get(i4);
                    }
                    int[] iArr = (int[]) edVar2.OooO0Oo;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= iAbs) {
                        z = true;
                    }
                    n40Var2.OooO00o = z;
                    n40Var2.OooO0O0 = iAbs;
                    n40Var2.OooO0OO = i6;
                    n40Var2.OooO0Oo = recyclerView4;
                    n40Var2.OooO0o0 = iArr[i5];
                    i4++;
                    i5 += 2;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, OooO);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (n40Var = (n40) arrayList2.get(i7)).OooO0Oo) != null; i7++) {
            y71 y71VarOooO0OO = OooO0OO(recyclerView, n40Var.OooO0o0, n40Var.OooO00o ? Long.MAX_VALUE : j);
            if (y71VarOooO0OO != null && y71VarOooO0OO.OooO0O0 != null && y71VarOooO0OO.OooO0oO() && !y71VarOooO0OO.OooO0oo() && (recyclerView2 = (RecyclerView) y71VarOooO0OO.OooO0O0.get()) != null) {
                if (recyclerView2.Oooo00O && recyclerView2.OooO.OooOOO() != 0) {
                    p71 p71Var = recyclerView2.OooO0o;
                    f71 f71Var = recyclerView2.Oooo;
                    if (f71Var != null) {
                        f71Var.OooO0o0();
                    }
                    i71 i71Var = recyclerView2.OooOOo0;
                    if (i71Var != null) {
                        i71Var.ooOO(p71Var);
                        recyclerView2.OooOOo0.o00O0O(p71Var);
                    }
                    p71Var.OooO00o.clear();
                    p71Var.OooO0oO();
                }
                ed edVar3 = recyclerView2.OooooOo;
                edVar3.OooO0Oo(recyclerView2, true);
                if (edVar3.OooO0OO != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        u71 u71Var = recyclerView2.Oooooo0;
                        a71 a71Var = recyclerView2.OooOOOo;
                        u71Var.OooO0Oo = 1;
                        u71Var.OooO0o0 = a71Var.OooO00o();
                        u71Var.OooO0oO = false;
                        u71Var.OooO0oo = false;
                        u71Var.OooO = false;
                        for (int i8 = 0; i8 < edVar3.OooO0OO * 2; i8 += 2) {
                            OooO0OO(recyclerView2, ((int[]) edVar3.OooO0Oo)[i8], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            n40Var.OooO00o = false;
            n40Var.OooO0O0 = 0;
            n40Var.OooO0OO = 0;
            n40Var.OooO0Oo = null;
            n40Var.OooO0o0 = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.OooO0Oo;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    OooO0O0(TimeUnit.MILLISECONDS.toNanos(jMax) + this.OooO0o);
                }
            }
        } finally {
            this.OooO0o0 = 0L;
            Trace.endSection();
        }
    }
}
