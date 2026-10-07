package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tn {
    public xz0 OooO;
    public final ArrayList OooO00o = new ArrayList();
    public final ArrayList OooO0O0 = new ArrayList();
    public j50 OooO0OO;
    public Object OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public Class OooO0oO;
    public bj OooO0oo;
    public Map OooOO0;
    public Class OooOO0O;
    public boolean OooOO0o;
    public zk0 OooOOO;
    public boolean OooOOO0;
    public t41 OooOOOO;
    public vr OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;

    public final ArrayList OooO00o() {
        boolean z = this.OooOOO0;
        ArrayList arrayList = this.OooO0O0;
        if (!z) {
            this.OooOOO0 = true;
            arrayList.clear();
            ArrayList arrayListOooO0O0 = OooO0O0();
            int size = arrayListOooO0O0.size();
            for (int i = 0; i < size; i++) {
                hu0 hu0Var = (hu0) arrayListOooO0O0.get(i);
                zk0 zk0Var = hu0Var.OooO00o;
                List list = hu0Var.OooO0O0;
                if (!arrayList.contains(zk0Var)) {
                    arrayList.add(hu0Var.OooO00o);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList OooO0O0() {
        boolean z = this.OooOO0o;
        ArrayList arrayList = this.OooO00o;
        if (!z) {
            this.OooOO0o = true;
            arrayList.clear();
            List listOooO0o = this.OooO0OO.OooO00o().OooO0o(this.OooO0Oo);
            int size = listOooO0o.size();
            for (int i = 0; i < size; i++) {
                hu0 hu0VarOooO0O0 = ((iu0) listOooO0o.get(i)).OooO0O0(this.OooO0Oo, this.OooO0o0, this.OooO0o, this.OooO);
                if (hu0VarOooO0O0 != null) {
                    arrayList.add(hu0VarOooO0O0);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yn0 OooO0OO(Class cls) {
        yn0 yn0Var;
        Class cls2;
        Class cls3;
        Class cls4;
        yn0 yn0Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        qa1 qa1Var;
        Class cls5 = cls;
        y81 y81VarOooO00o = this.OooO0OO.OooO00o();
        Class cls6 = this.OooO0oO;
        Class cls7 = this.OooOO0O;
        zn0 zn0Var = y81VarOooO00o.OooO;
        tu0 tu0Var = (tu0) zn0Var.OooO0O0.getAndSet(null);
        if (tu0Var == null) {
            tu0Var = new tu0();
        }
        tu0Var.OooO00o = cls5;
        tu0Var.OooO0O0 = cls6;
        tu0Var.OooO0OO = cls7;
        synchronized (zn0Var.OooO00o) {
            yn0Var = (yn0) zn0Var.OooO00o.get(tu0Var);
        }
        zn0Var.OooO0O0.set(tu0Var);
        y81VarOooO00o.OooO.getClass();
        if (zn0.OooO0OO.equals(yn0Var)) {
            return null;
        }
        if (yn0Var != null) {
            return yn0Var;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListOooOOO = y81VarOooO00o.OooO0OO.OooOOO(cls5, cls6);
        int size = arrayListOooOOO.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Class<?> cls8 = (Class) arrayListOooOOO.get(i2);
            ArrayList arrayListOooO0O0 = y81VarOooO00o.OooO0o.OooO0O0(cls8, cls7);
            int size2 = arrayListOooO0O0.size();
            int i4 = 0;
            while (i4 < size2) {
                int i5 = i4 + 1;
                Class cls9 = (Class) arrayListOooO0O0.get(i4);
                e81 e81Var = y81VarOooO00o.OooO0OO;
                synchronized (e81Var) {
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = (ArrayList) e81Var.OooO0o0;
                    int size3 = arrayList4.size();
                    arrayList2 = arrayListOooO0O0;
                    int i6 = 0;
                    while (i6 < size3) {
                        Object obj = arrayList4.get(i6);
                        int i7 = i6 + 1;
                        String str = (String) obj;
                        int i8 = size2;
                        List list = (List) ((HashMap) e81Var.OooO0o).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ja1 ja1Var = (ja1) it.next();
                                Iterator it2 = it;
                                if (ja1Var.OooO00o.isAssignableFrom(cls5) && cls8.isAssignableFrom(ja1Var.OooO0O0)) {
                                    arrayList.add(ja1Var.OooO0OO);
                                }
                                it = it2;
                            }
                        }
                        size2 = i8;
                        i6 = i7;
                    }
                    i = size2;
                }
                cw cwVar = y81VarOooO00o.OooO0o;
                synchronized (cwVar) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        ArrayList arrayList5 = cwVar.OooO00o;
                        int size4 = arrayList5.size();
                        int i9 = 0;
                        while (i9 < size4) {
                            Object obj2 = arrayList5.get(i9);
                            i9++;
                            mo1 mo1Var = (mo1) obj2;
                            ArrayList arrayList6 = arrayList5;
                            if (mo1Var.OooO00o.isAssignableFrom(cls8) && cls9.isAssignableFrom(mo1Var.OooO0O0)) {
                                qa1Var = mo1Var.OooO0OO;
                            } else {
                                cls5 = cls;
                                arrayList5 = arrayList6;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    qa1Var = iu.OooO0o;
                }
                arrayList3.add(new wn(cls5, cls8, cls9, arrayList, qa1Var, y81VarOooO00o.OooOO0));
                cls5 = cls;
                i4 = i5;
                arrayListOooO0O0 = arrayList2;
                size2 = i;
            }
            cls5 = cls;
            i2 = i3;
        }
        if (arrayList3.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            yn0Var2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            yn0Var2 = new yn0(cls2, cls3, cls4, arrayList3, y81VarOooO00o.OooOO0);
        }
        zn0 zn0Var2 = y81VarOooO00o.OooO;
        synchronized (zn0Var2.OooO00o) {
            zn0Var2.OooO00o.put(new tu0(cls2, cls3, cls4), yn0Var2 != null ? yn0Var2 : zn0.OooO0OO);
        }
        return yn0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r0 = r4.OooO0O0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.zv OooO0Oo(java.lang.Object r7) {
        /*
            r6 = this;
            com.cmaster.cloner.j50 r6 = r6.OooO0OO
            com.cmaster.cloner.y81 r6 = r6.OooO00o()
            com.cmaster.cloner.cw r6 = r6.OooO0O0
            java.lang.Class r0 = r7.getClass()
            monitor-enter(r6)
            java.util.ArrayList r1 = r6.OooO00o     // Catch: java.lang.Throwable -> L2a
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2a
            r3 = 0
        L14:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L2a
            int r3 = r3 + 1
            com.cmaster.cloner.bw r4 = (com.cmaster.cloner.bw) r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Class r5 = r4.OooO00o     // Catch: java.lang.Throwable -> L2a
            boolean r5 = r5.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L14
            com.cmaster.cloner.zv r0 = r4.OooO0O0     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r6)
            goto L2e
        L2a:
            r7 = move-exception
            goto L49
        L2c:
            monitor-exit(r6)
            r0 = 0
        L2e:
            if (r0 == 0) goto L31
            return r0
        L31:
            com.cmaster.cloner.x81 r6 = new com.cmaster.cloner.x81
            java.lang.Class r7 = r7.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to find source encoder for data class: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        L49:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.tn.OooO0Oo(java.lang.Object):com.cmaster.cloner.zv");
    }

    public final no1 OooO0o0(Class cls) {
        no1 no1Var = (no1) this.OooOO0.get(cls);
        if (no1Var == null) {
            Iterator it = this.OooOO0.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    no1Var = (no1) entry.getValue();
                    break;
                }
            }
        }
        if (no1Var != null) {
            return no1Var;
        }
        if (!this.OooOO0.isEmpty() || !this.OooOOo0) {
            return xq1.OooO0O0;
        }
        sa.OooO0o(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        return null;
    }
}
