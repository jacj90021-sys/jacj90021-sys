package com.cmaster.cloner;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p71 {
    public final ArrayList OooO00o;
    public ArrayList OooO0O0;
    public final ArrayList OooO0OO;
    public final List OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public o71 OooO0oO;
    public final /* synthetic */ RecyclerView OooO0oo;

    public p71(RecyclerView recyclerView) {
        this.OooO0oo = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.OooO00o = arrayList;
        this.OooO0O0 = null;
        this.OooO0OO = new ArrayList();
        this.OooO0Oo = Collections.unmodifiableList(arrayList);
        this.OooO0o0 = 2;
        this.OooO0o = 2;
    }

    public final void OooO(View view) {
        y71 y71VarOooo0oo = RecyclerView.Oooo0oo(view);
        boolean zOooOO0o = y71VarOooo0oo.OooOO0o();
        RecyclerView recyclerView = this.OooO0oo;
        if (zOooOO0o) {
            recyclerView.removeDetachedView(view, false);
        }
        if (y71VarOooo0oo.OooOO0O()) {
            y71VarOooo0oo.OooOOO.OooOOO0(y71VarOooo0oo);
        } else if (y71VarOooo0oo.OooOOo()) {
            y71VarOooo0oo.OooOO0 &= -33;
        }
        OooOO0(y71VarOooo0oo);
        if (recyclerView.Oooo == null || y71VarOooo0oo.OooO()) {
            return;
        }
        recyclerView.Oooo.OooO0Oo(y71VarOooo0oo);
    }

    public final void OooO00o(y71 y71Var, boolean z) {
        RecyclerView.OooOOO0(y71Var);
        View view = y71Var.OooO00o;
        RecyclerView recyclerView = this.OooO0oo;
        a81 a81Var = recyclerView.o00Oo0;
        if (a81Var != null) {
            o0000O00 o0000o00OooOO0 = a81Var.OooOO0();
            nt1.OooOOO0(view, o0000o00OooOO0 instanceof z71 ? (o0000O00) ((z71) o0000o00OooOO0).OooO0o0.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.OooOOo;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                ra.OooOO0o();
                return;
            }
            a71 a71Var = recyclerView.OooOOOo;
            if (a71Var != null) {
                a71Var.OooOO0O(y71Var);
            }
            if (recyclerView.Oooooo0 != null) {
                recyclerView.OooOO0.OooO0oO(y71Var);
            }
            if (RecyclerView.o000OOo) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + y71Var);
            }
        }
        y71Var.OooOOoo = null;
        y71Var.OooOOo = null;
        o71 o71VarOooO0OO = OooO0OO();
        o71VarOooO0OO.getClass();
        int i = y71Var.OooO0o;
        ArrayList arrayList2 = o71VarOooO0OO.OooO00o(i).OooO00o;
        if (((n71) o71VarOooO0OO.OooO00o.get(i)).OooO0O0 <= arrayList2.size()) {
            xx2.OooO00o(view);
        } else if (RecyclerView.o0O0O00 && arrayList2.contains(y71Var)) {
            ra.OooOOO("this scrap item already exists");
        } else {
            y71Var.OooOOOO();
            arrayList2.add(y71Var);
        }
    }

    public final int OooO0O0(int i) {
        RecyclerView recyclerView = this.OooO0oo;
        u71 u71Var = recyclerView.Oooooo0;
        if (i >= 0 && i < u71Var.OooO0O0()) {
            return !u71Var.OooO0oO ? i : recyclerView.OooO0oo.OooO0oo(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + u71Var.OooO0O0() + recyclerView.OooOooO());
    }

    public final o71 OooO0OO() {
        if (this.OooO0oO == null) {
            o71 o71Var = new o71();
            o71Var.OooO00o = new SparseArray();
            o71Var.OooO0O0 = 0;
            o71Var.OooO0OO = Collections.newSetFromMap(new IdentityHashMap());
            this.OooO0oO = o71Var;
            OooO0o0();
        }
        return this.OooO0oO;
    }

    public final View OooO0Oo(int i) {
        return OooOO0o(i, Long.MAX_VALUE).OooO00o;
    }

    public final void OooO0o(a71 a71Var, boolean z) {
        o71 o71Var = this.OooO0oO;
        if (o71Var != null) {
            SparseArray sparseArray = o71Var.OooO00o;
            Set set = o71Var.OooO0OO;
            set.remove(a71Var);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((n71) sparseArray.get(sparseArray.keyAt(i))).OooO00o;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    xx2.OooO00o(((y71) arrayList.get(i2)).OooO00o);
                }
            }
        }
    }

    public final void OooO0o0() {
        RecyclerView recyclerView;
        a71 a71Var;
        o71 o71Var = this.OooO0oO;
        if (o71Var == null || (a71Var = (recyclerView = this.OooO0oo).OooOOOo) == null || !recyclerView.OooOo0O) {
            return;
        }
        o71Var.OooO0OO.add(a71Var);
    }

    public final void OooO0oO() {
        ArrayList arrayList = this.OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            OooO0oo(size);
        }
        arrayList.clear();
        if (RecyclerView.o00000) {
            ed edVar = this.OooO0oo.OooooOo;
            int[] iArr = (int[]) edVar.OooO0Oo;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            edVar.OooO0OO = 0;
        }
    }

    public final void OooO0oo(int i) {
        if (RecyclerView.o000OOo) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.OooO0OO;
        y71 y71Var = (y71) arrayList.get(i);
        if (RecyclerView.o000OOo) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + y71Var);
        }
        OooO00o(y71Var, true);
        arrayList.remove(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b4, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOO0(com.cmaster.cloner.y71 r13) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.p71.OooOO0(com.cmaster.cloner.y71):void");
    }

    public final void OooOO0O(View view) {
        f71 f71Var;
        y71 y71VarOooo0oo = RecyclerView.Oooo0oo(view);
        int i = y71VarOooo0oo.OooOO0 & 12;
        RecyclerView recyclerView = this.OooO0oo;
        if (i == 0 && y71VarOooo0oo.OooOOO0() && (f71Var = recyclerView.Oooo) != null) {
            qo qoVar = (qo) f71Var;
            if (y71VarOooo0oo.OooO0o0().isEmpty() && qoVar.OooO0oO && !y71VarOooo0oo.OooO0oo()) {
                if (this.OooO0O0 == null) {
                    this.OooO0O0 = new ArrayList();
                }
                y71VarOooo0oo.OooOOO = this;
                y71VarOooo0oo.OooOOOO = true;
                this.OooO0O0.add(y71VarOooo0oo);
                return;
            }
        }
        if (y71VarOooo0oo.OooO0oo() && !y71VarOooo0oo.OooOO0() && !recyclerView.OooOOOo.OooO0O0) {
            ra.OooOOO("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.OooOooO()));
            return;
        }
        y71VarOooo0oo.OooOOO = this;
        y71VarOooo0oo.OooOOOO = false;
        this.OooO00o.add(y71VarOooo0oo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ae, code lost:
    
        r10 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x063d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.y71 OooOO0o(int r29, long r30) {
        /*
            Method dump skipped, instructions count: 1639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.p71.OooOO0o(int, long):com.cmaster.cloner.y71");
    }

    public final void OooOOO() {
        i71 i71Var = this.OooO0oo.OooOOo0;
        this.OooO0o = this.OooO0o0 + (i71Var != null ? i71Var.OooOO0 : 0);
        ArrayList arrayList = this.OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.OooO0o; size--) {
            OooO0oo(size);
        }
    }

    public final void OooOOO0(y71 y71Var) {
        if (y71Var.OooOOOO) {
            this.OooO0O0.remove(y71Var);
        } else {
            this.OooO00o.remove(y71Var);
        }
        y71Var.OooOOO = null;
        y71Var.OooOOOO = false;
        y71Var.OooOO0 &= -33;
    }
}
