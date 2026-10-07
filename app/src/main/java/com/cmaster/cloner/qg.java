package com.cmaster.cloner;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qg extends al2 {
    public final ww OooO0Oo;
    public final HashMap OooO00o = new HashMap();
    public final HashMap OooO0O0 = new HashMap();
    public final HashMap OooO0OO = new HashMap();
    public final AtomicReference OooO0o0 = new AtomicReference();

    public qg(Executor executor, ArrayList arrayList, ArrayList arrayList2) {
        ww wwVar = new ww(executor);
        this.OooO0Oo = wwVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(vf.OooO0O0(wwVar, ww.class, wj1.class, u51.class));
        int i = 0;
        arrayList3.add(vf.OooO0O0(this, qg.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            vf vfVar = (vf) obj;
            if (vfVar != null) {
                arrayList3.add(vfVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((r51) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(componentRegistrar.OooO00o());
                        it.remove();
                    }
                } catch (jj0 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.OooO00o.isEmpty()) {
                yp2.OooO00o(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.OooO00o.keySet());
                arrayList6.addAll(arrayList3);
                yp2.OooO00o(arrayList6);
            }
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                final vf vfVar2 = (vf) obj3;
                this.OooO00o.put(vfVar2, new il0(new r51(this, vfVar2) { // from class: com.cmaster.cloner.og
                    public final qg OooO00o;
                    public final vf OooO0O0;

                    {
                        this.OooO00o = this;
                        this.OooO0O0 = vfVar2;
                    }

                    @Override // com.cmaster.cloner.r51
                    public final Object get() {
                        vf vfVar3 = this.OooO0O0;
                        return vfVar3.OooO0Oo.OooO0o0(new ab1(vfVar3, this.OooO00o));
                    }
                }));
            }
            arrayList5.addAll(OooO0oO(arrayList3));
            arrayList5.addAll(OooO0oo());
            OooO0o();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj4 = arrayList5.get(i);
            i++;
            ((Runnable) obj4).run();
        }
        Boolean bool = (Boolean) this.OooO0o0.get();
        if (bool != null) {
            OooO0o0(this.OooO00o, bool.booleanValue());
        }
    }

    @Override // com.cmaster.cloner.al2
    public final synchronized r51 OooO0O0(Class cls) {
        return (r51) this.OooO0O0.get(cls);
    }

    @Override // com.cmaster.cloner.al2
    public final synchronized r51 OooO0Oo(Class cls) {
        ml0 ml0Var = (ml0) this.OooO0OO.get(cls);
        if (ml0Var != null) {
            return ml0Var;
        }
        return pg.OooO0O0;
    }

    public final void OooO0o() {
        for (vf vfVar : this.OooO00o.keySet()) {
            for (pp ppVar : vfVar.OooO0O0) {
                if (ppVar.OooO0O0 == 2 && !this.OooO0OO.containsKey(ppVar.OooO00o)) {
                    HashMap map = this.OooO0OO;
                    Class cls = ppVar.OooO00o;
                    Set set = Collections.EMPTY_SET;
                    ml0 ml0Var = new ml0();
                    ml0Var.OooO0O0 = null;
                    ml0Var.OooO00o = Collections.newSetFromMap(new ConcurrentHashMap());
                    ml0Var.OooO00o.addAll(set);
                    map.put(cls, ml0Var);
                } else if (this.OooO0O0.containsKey(ppVar.OooO00o)) {
                    continue;
                } else {
                    int i = ppVar.OooO0O0;
                    if (i == 1) {
                        throw new rp("Unsatisfied dependency for component " + vfVar + ": " + ppVar.OooO00o);
                    }
                    if (i != 2) {
                        HashMap map2 = this.OooO0O0;
                        Class cls2 = ppVar.OooO00o;
                        im2 im2Var = im2.OooO0Oo;
                        pg pgVar = pg.OooO0OO;
                        wz0 wz0Var = new wz0();
                        wz0Var.OooO00o = im2Var;
                        wz0Var.OooO0O0 = pgVar;
                        map2.put(cls2, wz0Var);
                    }
                }
            }
        }
    }

    public final void OooO0o0(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            vf vfVar = (vf) entry.getKey();
            vfVar.getClass();
        }
        ww wwVar = this.OooO0Oo;
        synchronized (wwVar) {
            try {
                arrayDeque = wwVar.OooO00o;
                if (arrayDeque != null) {
                    wwVar.OooO00o = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw px0.OooOO0o(it);
            }
        }
    }

    public final ArrayList OooO0oO(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vf vfVar = (vf) obj;
            if (vfVar.OooO0OO == 0) {
                r51 r51Var = (r51) this.OooO00o.get(vfVar);
                for (Class cls : vfVar.OooO00o) {
                    HashMap map = this.OooO0O0;
                    if (map.containsKey(cls)) {
                        arrayList2.add(new pi2((wz0) ((r51) map.get(cls)), r51Var, 11));
                    } else {
                        map.put(cls, r51Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList OooO0oo() {
        HashMap map = this.OooO0OO;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.OooO00o.entrySet()) {
            vf vfVar = (vf) entry.getKey();
            if (vfVar.OooO0OO != 0) {
                r51 r51Var = (r51) entry.getValue();
                for (Class cls : vfVar.OooO00o) {
                    if (!map2.containsKey(cls)) {
                        map2.put(cls, new HashSet());
                    }
                    ((Set) map2.get(cls)).add(r51Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                ml0 ml0Var = (ml0) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new pi2(ml0Var, (r51) it.next(), 12));
                }
            } else {
                Class cls2 = (Class) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                ml0 ml0Var2 = new ml0();
                ml0Var2.OooO0O0 = null;
                ml0Var2.OooO00o = Collections.newSetFromMap(new ConcurrentHashMap());
                ml0Var2.OooO00o.addAll(set);
                map.put(cls2, ml0Var2);
            }
        }
        return arrayList;
    }
}
