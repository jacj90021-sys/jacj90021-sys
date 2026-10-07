package com.cmaster.cloner;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ga1 implements kn, hn {
    public List OooO;
    public final vn OooO0Oo;
    public int OooO0o;
    public final tn OooO0o0;
    public int OooO0oO = -1;
    public zk0 OooO0oo;
    public int OooOO0;
    public volatile hu0 OooOO0O;
    public File OooOO0o;
    public ha1 OooOOO0;

    public ga1(tn tnVar, vn vnVar) {
        this.OooO0o0 = tnVar;
        this.OooO0Oo = vnVar;
    }

    @Override // com.cmaster.cloner.hn
    public final void OooO0O0(Exception exc) {
        this.OooO0Oo.OooO0O0(this.OooOOO0, exc, this.OooOO0O.OooO0OO, 4);
    }

    @Override // com.cmaster.cloner.kn
    public final boolean OooO0OO() {
        List list;
        boolean z;
        List list2;
        boolean z2;
        ArrayList arrayListOooOo0o;
        ArrayList arrayListOooO00o = this.OooO0o0.OooO00o();
        if (arrayListOooO00o.isEmpty()) {
            return false;
        }
        tn tnVar = this.OooO0o0;
        y81 y81VarOooO00o = tnVar.OooO0OO.OooO00o();
        Class<?> cls = tnVar.OooO0Oo.getClass();
        Class cls2 = tnVar.OooO0oO;
        Class cls3 = tnVar.OooOO0O;
        e81 e81Var = y81VarOooO00o.OooO0oo;
        tu0 tu0Var = (tu0) ((AtomicReference) e81Var.OooO0o0).getAndSet(null);
        if (tu0Var == null) {
            tu0Var = new tu0(cls, cls2, cls3);
        } else {
            tu0Var.OooO00o = cls;
            tu0Var.OooO0O0 = cls2;
            tu0Var.OooO0OO = cls3;
        }
        synchronized (((k3) e81Var.OooO0o)) {
            list = (List) ((k3) e81Var.OooO0o).get(tu0Var);
        }
        ((AtomicReference) e81Var.OooO0o0).set(tu0Var);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            o0O000O o0o000o = y81VarOooO00o.OooO00o;
            synchronized (o0o000o) {
                arrayListOooOo0o = ((ho1) o0o000o.OooO0o0).OooOo0o(cls);
            }
            int size = arrayListOooOo0o.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListOooOo0o.get(i);
                i++;
                ArrayList arrayListOooOOO = y81VarOooO00o.OooO0OO.OooOOO((Class) obj, cls2);
                int size2 = arrayListOooOOO.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayListOooOOO.get(i2);
                    i2++;
                    Class cls4 = (Class) obj2;
                    if (!y81VarOooO00o.OooO0o.OooO0O0(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z = false;
            e81 e81Var2 = y81VarOooO00o.OooO0oo;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((k3) e81Var2.OooO0o)) {
                ((k3) e81Var2.OooO0o).put(new tu0(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        } else {
            z = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.OooO0o0.OooOO0O)) {
                return z;
            }
            StringBuilder sb = new StringBuilder("Failed to find any load path from ");
            sb.append(this.OooO0o0.OooO0Oo.getClass());
            Class cls5 = this.OooO0o0.OooOO0O;
            sb.append(" to ");
            sb.append(cls5);
            throw new IllegalStateException(sb.toString());
        }
        while (true) {
            List list3 = this.OooO;
            if (list3 != null && this.OooOO0 < list3.size()) {
                this.OooOO0O = null;
                boolean z3 = z;
                while (!z3 && this.OooOO0 < this.OooO.size()) {
                    List list4 = this.OooO;
                    int i3 = this.OooOO0;
                    this.OooOO0 = i3 + 1;
                    iu0 iu0Var = (iu0) list4.get(i3);
                    File file = this.OooOO0o;
                    tn tnVar2 = this.OooO0o0;
                    this.OooOO0O = iu0Var.OooO0O0(file, tnVar2.OooO0o0, tnVar2.OooO0o, tnVar2.OooO);
                    if (this.OooOO0O != null && this.OooO0o0.OooO0OO(this.OooOO0O.OooO0OO.OooO00o()) != null) {
                        this.OooOO0O.OooO0OO.OooO0o0(this.OooO0o0.OooOOOO, this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i4 = this.OooO0oO + 1;
            this.OooO0oO = i4;
            if (i4 >= list2.size()) {
                int i5 = this.OooO0o + 1;
                this.OooO0o = i5;
                if (i5 >= arrayListOooO00o.size()) {
                    return z;
                }
                this.OooO0oO = z ? 1 : 0;
            }
            zk0 zk0Var = (zk0) arrayListOooO00o.get(this.OooO0o);
            Class cls6 = (Class) list2.get(this.OooO0oO);
            no1 no1VarOooO0o0 = this.OooO0o0.OooO0o0(cls6);
            tn tnVar3 = this.OooO0o0;
            this.OooOOO0 = new ha1(tnVar3.OooO0OO.OooO00o, zk0Var, tnVar3.OooOOO, tnVar3.OooO0o0, tnVar3.OooO0o, no1VarOooO0o0, cls6, tnVar3.OooO);
            File fileOooO0oO = tnVar3.OooO0oo.OooO00o().OooO0oO(this.OooOOO0);
            this.OooOO0o = fileOooO0oO;
            if (fileOooO0oO != null) {
                this.OooO0oo = zk0Var;
                this.OooO = this.OooO0o0.OooO0OO.OooO00o().OooO0o(fileOooO0oO);
                z2 = false;
                this.OooOO0 = 0;
            } else {
                z2 = false;
            }
            z = z2;
        }
    }

    @Override // com.cmaster.cloner.hn
    public final void OooO0oO(Object obj) {
        this.OooO0Oo.OooO00o(this.OooO0oo, obj, this.OooOO0O.OooO0OO, 4, this.OooOOO0);
    }

    @Override // com.cmaster.cloner.kn
    public final void cancel() {
        hu0 hu0Var = this.OooOO0O;
        if (hu0Var != null) {
            hu0Var.OooO0OO.cancel();
        }
    }
}
