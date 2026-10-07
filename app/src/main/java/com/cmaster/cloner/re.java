package com.cmaster.cloner;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class re implements cc {
    public static final a02 OooOO0o = new a02(h1.OooO0O0, new ye1(2), new vu0(4), 3);
    public int OooO;
    public final oe OooO0Oo;
    public List OooO0o;
    public final w3 OooO0o0;
    public final ArrayList OooO0oO;
    public final ArrayList OooO0oo;
    public int OooOO0;
    public sv OooOO0O;

    public re() {
        oe oeVar = new oe();
        this.OooO0Oo = oeVar;
        this.OooO0o = Collections.EMPTY_LIST;
        this.OooO0oO = new ArrayList();
        this.OooO0oo = new ArrayList();
        this.OooO = 0;
        this.OooOO0 = 0;
        this.OooO0o0 = new w3(oeVar, OooOO0o);
    }

    @Override // com.cmaster.cloner.fz0
    public final boolean OooO00o(View view, xj0 xj0Var) {
        return false;
    }

    public final void OooO0O0(pi2 pi2Var) {
        sv svVar;
        if (!h1.OooO0O0()) {
            qa.OooO0o("must be main thread");
            return;
        }
        if (this.OooO == this.OooOO0) {
            if (pi2Var != null) {
                pi2Var.run();
                return;
            }
            return;
        }
        ArrayList arrayList = this.OooO0oO;
        ArrayList arrayList2 = new ArrayList(this.OooO0o.size() + this.OooO0o.size() + arrayList.size());
        arrayList2.addAll(arrayList);
        arrayList2.addAll(this.OooO0o);
        arrayList2.addAll(this.OooO0oo);
        arrayList2.size();
        arrayList2.size();
        if (this.OooO0o.isEmpty() && (svVar = this.OooOO0O) != null) {
            arrayList2.add(svVar);
        }
        w3 w3Var = this.OooO0o0;
        oe oeVar = w3Var.OooO00o;
        int i = w3Var.OooO0oO + 1;
        w3Var.OooO0oO = i;
        ArrayList arrayList3 = w3Var.OooO0o0;
        if (arrayList2 == arrayList3) {
            if (pi2Var != null) {
                pi2Var.run();
            }
        } else if (arrayList3 == null) {
            w3Var.OooO0o0 = arrayList2;
            w3Var.OooO0o = Collections.unmodifiableList(arrayList2);
            oeVar.OooO0O0(0, arrayList2.size());
            Iterator it = w3Var.OooO0Oo.iterator();
            if (it.hasNext()) {
                throw px0.OooOO0o(it);
            }
            if (pi2Var != null) {
                pi2Var.run();
            }
        } else {
            ((Executor) w3Var.OooO0O0.OooO0o).execute(new u3(w3Var, arrayList3, arrayList2, i, pi2Var));
        }
        this.OooO = this.OooOO0;
    }

    @Override // com.cmaster.cloner.ez0
    public final void OooOO0(View view, xj0 xj0Var) {
    }

    @Override // com.cmaster.cloner.cc
    public final c2 OooOo0o() {
        return null;
    }
}
