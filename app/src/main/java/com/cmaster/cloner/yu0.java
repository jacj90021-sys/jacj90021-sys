package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yu0 implements in, hn {
    public List OooO;
    public final ArrayList OooO0Oo;
    public int OooO0o;
    public final r31 OooO0o0;
    public t41 OooO0oO;
    public hn OooO0oo;
    public boolean OooOO0;

    public yu0(ArrayList arrayList, r31 r31Var) {
        this.OooO0o0 = r31Var;
        if (arrayList.isEmpty()) {
            ra.OooOOO("Must not be empty.");
            throw null;
        }
        this.OooO0Oo = arrayList;
        this.OooO0o = 0;
    }

    @Override // com.cmaster.cloner.in
    public final Class OooO00o() {
        return ((in) this.OooO0Oo.get(0)).OooO00o();
    }

    @Override // com.cmaster.cloner.hn
    public final void OooO0O0(Exception exc) {
        List list = this.OooO;
        zx2.OooO0OO(list, "Argument must not be null");
        list.add(exc);
        OooO0OO();
    }

    public final void OooO0OO() {
        if (this.OooOO0) {
            return;
        }
        if (this.OooO0o < this.OooO0Oo.size() - 1) {
            this.OooO0o++;
            OooO0o0(this.OooO0oO, this.OooO0oo);
        } else {
            zx2.OooO0O0(this.OooO);
            this.OooO0oo.OooO0O0(new n50("Fetch failed", new ArrayList(this.OooO)));
        }
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0Oo() {
        List list = this.OooO;
        if (list != null) {
            this.OooO0o0.OooO0O0(list);
        }
        this.OooO = null;
        ArrayList arrayList = this.OooO0Oo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((in) obj).OooO0Oo();
        }
    }

    @Override // com.cmaster.cloner.in
    public final int OooO0o() {
        return ((in) this.OooO0Oo.get(0)).OooO0o();
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0o0(t41 t41Var, hn hnVar) {
        this.OooO0oO = t41Var;
        this.OooO0oo = hnVar;
        this.OooO = (List) this.OooO0o0.OooO0oo();
        ((in) this.OooO0Oo.get(this.OooO0o)).OooO0o0(t41Var, this);
        if (this.OooOO0) {
            cancel();
        }
    }

    @Override // com.cmaster.cloner.hn
    public final void OooO0oO(Object obj) {
        if (obj != null) {
            this.OooO0oo.OooO0oO(obj);
        } else {
            OooO0OO();
        }
    }

    @Override // com.cmaster.cloner.in
    public final void cancel() {
        this.OooOO0 = true;
        ArrayList arrayList = this.OooO0Oo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((in) obj).cancel();
        }
    }
}
