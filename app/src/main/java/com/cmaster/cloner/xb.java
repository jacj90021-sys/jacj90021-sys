package com.cmaster.cloner;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xb implements bl1 {
    public Object OooO;
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public int OooO0o0;
    public Object OooO0oO;
    public Object OooO0oo;

    public xb(Class cls, Class[] clsArr) {
        this.OooO0Oo = 2;
        HashSet hashSet = new HashSet();
        this.OooO0o = hashSet;
        this.OooO0oO = new HashSet();
        this.OooO0o0 = 0;
        this.OooO = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            dy2.OooO00o(cls2, "Null interface");
        }
        Collections.addAll((HashSet) this.OooO0o, clsArr);
    }

    public static void OooO0OO(wb wbVar, int i, int i2, String str, q9 q9Var) {
        q9Var.OooO0O0(i2, wbVar.OooOO0(str, js2.OooO0O0(i).concat(u7.OooO00o(new byte[]{-64, 54}, new byte[]{-6, 22, 58, -100, 65, 10, 26, 86}))));
    }

    public View OooO(int i) {
        return ((RecyclerView) ((xb1) this.OooO0o).OooO0o0).getChildAt(OooOO0o(i));
    }

    public void OooO00o(pp ppVar) {
        if (((HashSet) this.OooO0o).contains(ppVar.OooO00o)) {
            ra.OooOOO("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            ((HashSet) this.OooO0oO).add(ppVar);
        }
    }

    public void OooO0O0(View view, int i, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((xb1) this.OooO0o).OooO0o0;
        int childCount = i < 0 ? recyclerView.getChildCount() : OooOO0o(i);
        ((sc) this.OooO0oO).OooO0o0(childCount, z);
        if (z) {
            OooOOOO(view);
        }
        recyclerView.addView(view, childCount);
        y71 y71VarOooo0oo = RecyclerView.Oooo0oo(view);
        a71 a71Var = recyclerView.OooOOOo;
        if (a71Var != null && y71VarOooo0oo != null) {
            a71Var.OooO(y71VarOooo0oo);
        }
        ArrayList arrayList = recyclerView.Oooo000;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((vj0) recyclerView.Oooo000.get(size)).getClass();
            }
        }
    }

    public void OooO0Oo(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((xb1) this.OooO0o).OooO0o0;
        int childCount = i < 0 ? recyclerView.getChildCount() : OooOO0o(i);
        ((sc) this.OooO0oO).OooO0o0(childCount, z);
        if (z) {
            OooOOOO(view);
        }
        y71 y71VarOooo0oo = RecyclerView.Oooo0oo(view);
        if (y71VarOooo0oo != null) {
            if (!y71VarOooo0oo.OooOO0o() && !y71VarOooo0oo.OooOOo0()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(y71VarOooo0oo);
                sa.OooO(sb, recyclerView.OooOooO());
                return;
            } else {
                if (RecyclerView.o000OOo) {
                    Log.d("RecyclerView", "reAttach " + y71VarOooo0oo);
                }
                y71VarOooo0oo.OooOO0 &= -257;
            }
        } else if (RecyclerView.o0O0O00) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strOooOooO = recyclerView.OooOooO();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strOooOooO);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.o0000o0o(view, childCount, layoutParams);
    }

    public va1 OooO0o() {
        if (((ho1) this.OooO0o) == null) {
            qa.OooO0o(u7.OooO00o(new byte[]{78, -4, -121, 61, -38, -30, -67, 62, 1, -92, -42, 38, -54, -3, -91}, new byte[]{60, -103, -10, 72, -65, -111, -55, 30}));
            return null;
        }
        if (this.OooO0o0 >= 0) {
            if (((String) this.OooO0oO) != null) {
                return new va1(this);
            }
            qa.OooO0o(u7.OooO00o(new byte[]{-118, -123, 125, 26, 8, -66, -110, 97, -38, -35, 46, 7, 28, -75, -101}, new byte[]{-25, -32, 14, 105, 105, -39, -9, 65}));
            return null;
        }
        throw new IllegalStateException(u7.OooO00o(new byte[]{2, 41, -21, 2, -23, -16, -15, -70, 91, 102}, new byte[]{97, 70, -113, 103, -55, -52, -47, -118}) + this.OooO0o0);
    }

    public vf OooO0o0() {
        if (((ig) this.OooO0oo) != null) {
            return new vf(new HashSet((HashSet) this.OooO0o), new HashSet((HashSet) this.OooO0oO), this.OooO0o0, (ig) this.OooO0oo, (HashSet) this.OooO);
        }
        qa.OooO0o("Missing required property: factory.");
        return null;
    }

    public void OooO0oO(int i) {
        int iOooOO0o = OooOO0o(i);
        ((sc) this.OooO0oO).OooO0o(iOooOO0o);
        RecyclerView recyclerView = (RecyclerView) ((xb1) this.OooO0o).OooO0o0;
        View childAt = recyclerView.getChildAt(iOooOO0o);
        if (childAt != null) {
            y71 y71VarOooo0oo = RecyclerView.Oooo0oo(childAt);
            if (y71VarOooo0oo != null) {
                if (y71VarOooo0oo.OooOO0o() && !y71VarOooo0oo.OooOOo0()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(y71VarOooo0oo);
                    sa.OooO(sb, recyclerView.OooOooO());
                    return;
                } else {
                    if (RecyclerView.o000OOo) {
                        Log.d("RecyclerView", "tmpDetach " + y71VarOooo0oo);
                    }
                    y71VarOooo0oo.OooO00o(256);
                }
            }
        } else if (RecyclerView.o0O0O00) {
            throw new IllegalArgumentException("No view at offset " + iOooOO0o + recyclerView.OooOooO());
        }
        recyclerView.o0000o0O(iOooOO0o);
    }

    public void OooO0oo() {
        if (((zb) this.OooO0oO) == null) {
            ho1 ho1Var = (ho1) this.OooO0o;
            ho1Var.OooOOoo();
            this.OooO0oO = (zb) ho1Var.OooO0oO;
        }
    }

    public int OooOO0() {
        return ((RecyclerView) ((xb1) this.OooO0o).OooO0o0).getChildCount() - ((ArrayList) this.OooO0oo).size();
    }

    @Override // com.cmaster.cloner.bl1
    public Object OooOO0O() {
        SQLiteDatabase sQLiteDatabaseOooO0OO;
        Boolean bool;
        yn1 yn1Var = (yn1) this.OooO0o;
        a02 a02Var = (a02) yn1Var.OooO0oO;
        r4 r4Var = (r4) this.OooO0oO;
        Iterable iterable = (Iterable) this.OooO0oo;
        g5 g5Var = (g5) this.OooO;
        int i = this.OooO0o0;
        int i2 = r4Var.OooO00o;
        qc1 qc1Var = (qc1) yn1Var.OooO0Oo;
        if (i2 == 2) {
            qc1Var.getClass();
            if (iterable.iterator().hasNext()) {
                String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(qc1.OooOOO(iterable));
                sQLiteDatabaseOooO0OO = qc1Var.OooO0OO();
                sQLiteDatabaseOooO0OO.beginTransaction();
                try {
                    sQLiteDatabaseOooO0OO.compileStatement(strConcat).execute();
                    sQLiteDatabaseOooO0OO.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseOooO0OO.setTransactionSuccessful();
                } finally {
                }
            }
            a02Var.OoooO00(g5Var, i + 1, false);
            return null;
        }
        qc1Var.getClass();
        if (iterable.iterator().hasNext()) {
            qc1Var.OooO0OO().compileStatement("DELETE FROM events WHERE _id in ".concat(qc1.OooOOO(iterable))).execute();
        }
        if (i2 == 1) {
            qc1Var.OooO0oo(new sc(((ie) yn1Var.OooOO0).OooO0oo() + r4Var.OooO0O0, g5Var));
        }
        sQLiteDatabaseOooO0OO = qc1Var.OooO0OO();
        sQLiteDatabaseOooO0OO.beginTransaction();
        try {
            Long lOooO0o = qc1.OooO0o(sQLiteDatabaseOooO0OO, g5Var);
            if (lOooO0o == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = qc1Var.OooO0OO().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lOooO0o.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            sQLiteDatabaseOooO0OO.setTransactionSuccessful();
            sQLiteDatabaseOooO0OO.endTransaction();
            if (!bool.booleanValue()) {
                return null;
            }
            a02Var.OoooO00(g5Var, 1, true);
            return null;
        } finally {
        }
    }

    public int OooOO0o(int i) {
        sc scVar = (sc) this.OooO0oO;
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((xb1) this.OooO0o).OooO0o0).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iOooO0O0 = i - (i2 - scVar.OooO0O0(i2));
            if (iOooO0O0 == 0) {
                while (scVar.OooO0Oo(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iOooO0O0;
        }
        return -1;
    }

    public int OooOOO() {
        return ((RecyclerView) ((xb1) this.OooO0o).OooO0o0).getChildCount();
    }

    public View OooOOO0(int i) {
        return ((RecyclerView) ((xb1) this.OooO0o).OooO0o0).getChildAt(i);
    }

    public void OooOOOO(View view) {
        ((ArrayList) this.OooO0oo).add(view);
        xb1 xb1Var = (xb1) this.OooO0o;
        y71 y71VarOooo0oo = RecyclerView.Oooo0oo(view);
        if (y71VarOooo0oo != null) {
            View view2 = y71VarOooo0oo.OooO00o;
            RecyclerView recyclerView = (RecyclerView) xb1Var.OooO0o0;
            int i = y71VarOooo0oo.OooOOo0;
            if (i != -1) {
                y71VarOooo0oo.OooOOOo = i;
            } else {
                y71VarOooo0oo.OooOOOo = view2.getImportantForAccessibility();
            }
            if (!recyclerView.OoooO0()) {
                view2.setImportantForAccessibility(4);
            } else {
                y71VarOooo0oo.OooOOo0 = 4;
                recyclerView.o00oO0O.add(y71VarOooo0oo);
            }
        }
    }

    public int OooOOOo(View view) {
        sc scVar = (sc) this.OooO0oO;
        int iIndexOfChild = ((RecyclerView) ((xb1) this.OooO0o).OooO0o0).indexOfChild(view);
        if (iIndexOfChild == -1 || scVar.OooO0Oo(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - scVar.OooO0O0(iIndexOfChild);
    }

    public void OooOOo0(View view) {
        if (((ArrayList) this.OooO0oo).remove(view)) {
            xb1 xb1Var = (xb1) this.OooO0o;
            y71 y71VarOooo0oo = RecyclerView.Oooo0oo(view);
            if (y71VarOooo0oo != null) {
                RecyclerView recyclerView = (RecyclerView) xb1Var.OooO0o0;
                int i = y71VarOooo0oo.OooOOOo;
                if (recyclerView.OoooO0()) {
                    y71VarOooo0oo.OooOOo0 = i;
                    recyclerView.o00oO0O.add(y71VarOooo0oo);
                } else {
                    y71VarOooo0oo.OooO00o.setImportantForAccessibility(i);
                }
                y71VarOooo0oo.OooOOOo = 0;
            }
        }
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 1:
                return ((sc) this.OooO0oO).toString() + ", hidden list:" + ((ArrayList) this.OooO0oo).size();
            default:
                return super.toString();
        }
    }

    public xb(yn1 yn1Var, r4 r4Var, Iterable iterable, g5 g5Var, int i) {
        this.OooO0Oo = 4;
        this.OooO0o = yn1Var;
        this.OooO0oO = r4Var;
        this.OooO0oo = iterable;
        this.OooO = g5Var;
        this.OooO0o0 = i;
    }

    public xb(xb1 xb1Var) {
        this.OooO0Oo = 1;
        this.OooO0o0 = 0;
        this.OooO0o = xb1Var;
        this.OooO0oO = new sc(0);
        this.OooO0oo = new ArrayList();
    }

    public xb(ho1 ho1Var) {
        this.OooO0Oo = 0;
        this.OooO0o = ho1Var;
        this.OooO0oO = null;
        this.OooO0oo = null;
        this.OooO0o0 = 0;
        this.OooO = null;
    }
}
