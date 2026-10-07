package com.cmaster.cloner;

import android.database.SQLException;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class db implements Runnable {
    public final e81 OooO0Oo = new e81(1);

    public static void OooO00o(q02 q02Var, String str) throws SQLException {
        WorkDatabase workDatabase = q02Var.OooO0OO;
        o0O00000 o0o00000OooOo0o = workDatabase.OooOo0o();
        o0O000O o0o000oOooOOo = workDatabase.OooOOo();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iOooO0o0 = o0o00000OooOo0o.OooO0o0(str2);
            if (iOooO0o0 != 3 && iOooO0o0 != 4) {
                o0o00000OooOo0o.OooOO0o(6, str2);
            }
            linkedList.addAll(o0o000oOooOOo.OooOoo0(str2));
        }
        g51 g51Var = q02Var.OooO0o;
        synchronized (g51Var.OooOOO) {
            try {
                ep0.OooO0oO().OooO0Oo(g51.OooOOOO, "Processor cancelling " + str, new Throwable[0]);
                g51Var.OooOO0o.add(str);
                d12 d12Var = (d12) g51Var.OooO.remove(str);
                boolean z = d12Var != null;
                if (d12Var == null) {
                    d12Var = (d12) g51Var.OooOO0.remove(str);
                }
                g51.OooO0OO(str, d12Var);
                if (z) {
                    g51Var.OooO0oo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = q02Var.OooO0o0.iterator();
        while (it.hasNext()) {
            ((od1) it.next()).OooO0OO(str);
        }
    }

    public abstract void OooO0O0();

    @Override // java.lang.Runnable
    public final void run() {
        e81 e81Var = this.OooO0Oo;
        try {
            OooO0O0();
            e81Var.OooOoo(e81.OooO0oO);
        } catch (Throwable th) {
            e81Var.OooOoo(new pz0(th));
        }
    }
}
