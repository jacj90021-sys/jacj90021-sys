package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y81 {
    public final o0O000O OooO00o;
    public final cw OooO0O0;
    public final e81 OooO0OO;
    public final cw OooO0Oo;
    public final cw OooO0o;
    public final f91 OooO0o0;
    public final cw OooO0oO;
    public final hx2 OooOO0;
    public final e81 OooO0oo = new e81(22);
    public final zn0 OooO = new zn0();

    public y81() {
        int i = 7;
        hx2 hx2Var = new hx2(new t31(20), new je(i), new iu(i));
        this.OooOO0 = hx2Var;
        this.OooO00o = new o0O000O(hx2Var);
        int i2 = 0;
        this.OooO0O0 = new cw(0);
        this.OooO0OO = new e81(25);
        this.OooO0Oo = new cw(2);
        this.OooO0o0 = new f91(1);
        this.OooO0o = new cw(3);
        this.OooO0oO = new cw(1);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        e81 e81Var = this.OooO0OO;
        synchronized (e81Var) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) e81Var.OooO0o0);
                ((ArrayList) e81Var.OooO0o0).clear();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ArrayList) e81Var.OooO0o0).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) e81Var.OooO0o0).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO(mn mnVar) {
        f91 f91Var = this.OooO0o0;
        synchronized (f91Var) {
            f91Var.OooO00o.put(mnVar.OooO00o(), mnVar);
        }
    }

    public final void OooO00o(Class cls, zv zvVar) {
        cw cwVar = this.OooO0O0;
        synchronized (cwVar) {
            cwVar.OooO00o.add(new bw(cls, zvVar));
        }
    }

    public final void OooO0O0(Class cls, la1 la1Var) {
        cw cwVar = this.OooO0Oo;
        synchronized (cwVar) {
            cwVar.OooO00o.add(new ma1(cls, la1Var));
        }
    }

    public final void OooO0OO(Class cls, Class cls2, ju0 ju0Var) {
        o0O000O o0o000o = this.OooO00o;
        synchronized (o0o000o) {
            ho1 ho1Var = (ho1) o0o000o.OooO0o0;
            synchronized (ho1Var) {
                try {
                    zu0 zu0Var = new zu0(cls, cls2, ju0Var);
                    ArrayList arrayList = (ArrayList) ho1Var.OooO0o0;
                    arrayList.add(arrayList.size(), zu0Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((lu0) o0o000o.OooO0o).OooO0Oo.clear();
        }
    }

    public final void OooO0Oo(String str, Class cls, Class cls2, ia1 ia1Var) {
        e81 e81Var = this.OooO0OO;
        synchronized (e81Var) {
            e81Var.OooOOO0(str).add(new ja1(cls, cls2, ia1Var));
        }
    }

    public final List OooO0o(Object obj) {
        List listUnmodifiableList;
        o0O000O o0o000o = this.OooO00o;
        o0o000o.getClass();
        Class<?> cls = obj.getClass();
        synchronized (o0o000o) {
            ku0 ku0Var = (ku0) ((lu0) o0o000o.OooO0o).OooO0Oo.get(cls);
            listUnmodifiableList = ku0Var == null ? null : ku0Var.OooO00o;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((ho1) o0o000o.OooO0o0).OooOOO0(cls));
                if (((ku0) ((lu0) o0o000o.OooO0o).OooO0Oo.put(cls, new ku0(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new x81("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            iu0 iu0Var = (iu0) listUnmodifiableList.get(i);
            if (iu0Var.OooO00o(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(iu0Var);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new x81("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final ArrayList OooO0o0() {
        ArrayList arrayList;
        cw cwVar = this.OooO0oO;
        synchronized (cwVar) {
            arrayList = cwVar.OooO00o;
        }
        if (arrayList.isEmpty()) {
            throw new x81("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final nn OooO0oO(Object obj) {
        nn nnVarOooO0O0;
        f91 f91Var = this.OooO0o0;
        synchronized (f91Var) {
            try {
                zx2.OooO0O0(obj);
                mn mnVar = (mn) f91Var.OooO00o.get(obj.getClass());
                if (mnVar == null) {
                    Iterator it = f91Var.OooO00o.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        mn mnVar2 = (mn) it.next();
                        if (mnVar2.OooO00o().isAssignableFrom(obj.getClass())) {
                            mnVar = mnVar2;
                            break;
                        }
                    }
                }
                if (mnVar == null) {
                    mnVar = f91.OooO0O0;
                }
                nnVarOooO0O0 = mnVar.OooO0O0(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return nnVarOooO0O0;
    }

    public final void OooO0oo(Class cls, zv zvVar) {
        cw cwVar = this.OooO0O0;
        synchronized (cwVar) {
            cwVar.OooO00o.add(0, new bw(cls, zvVar));
        }
    }

    public final void OooOO0(Class cls, Class cls2, qa1 qa1Var) {
        cw cwVar = this.OooO0o;
        synchronized (cwVar) {
            cwVar.OooO00o.add(new mo1(cls, cls2, qa1Var));
        }
    }
}
