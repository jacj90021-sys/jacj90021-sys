package com.cmaster.cloner;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class np0 {
    public final /* synthetic */ int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public final Object OooO0o;
    public int OooO0o0;
    public final Object OooO0oO;

    public np0(int i) {
        this.OooO00o = 0;
        this.OooO0O0 = i;
        if (i <= 0) {
            ra.OooOOO("maxSize <= 0");
            throw null;
        }
        this.OooO0o = new xb1(22);
        this.OooO0oO = new d83(9);
    }

    public int OooO(int i) {
        ArrayList arrayList = (ArrayList) this.OooO0o;
        int i2 = this.OooO0O0;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        ii1 ii1Var = (ii1) view.getLayoutParams();
        this.OooO0O0 = ((StaggeredGridLayoutManager) this.OooO0oO).OooOOo.OooO0oO(view);
        ii1Var.getClass();
        return this.OooO0O0;
    }

    public void OooO00o() {
        View view = (View) ((ArrayList) this.OooO0o).get(r0.size() - 1);
        ii1 ii1Var = (ii1) view.getLayoutParams();
        this.OooO0OO = ((StaggeredGridLayoutManager) this.OooO0oO).OooOOo.OooO0Oo(view);
        ii1Var.getClass();
    }

    public void OooO0O0() {
        ((ArrayList) this.OooO0o).clear();
        this.OooO0O0 = Integer.MIN_VALUE;
        this.OooO0OO = Integer.MIN_VALUE;
        this.OooO0Oo = 0;
    }

    public int OooO0OO() {
        return ((StaggeredGridLayoutManager) this.OooO0oO).OooOo0o ? OooO0o0(r1.size() - 1, -1) : OooO0o0(0, ((ArrayList) this.OooO0o).size());
    }

    public int OooO0Oo() {
        return ((StaggeredGridLayoutManager) this.OooO0oO).OooOo0o ? OooO0o0(0, ((ArrayList) this.OooO0o).size()) : OooO0o0(r1.size() - 1, -1);
    }

    public Object OooO0o(Object obj) {
        synchronized (((d83) this.OooO0oO)) {
            xb1 xb1Var = (xb1) this.OooO0o;
            xb1Var.getClass();
            Object obj2 = ((LinkedHashMap) xb1Var.OooO0o0).get(obj);
            if (obj2 != null) {
                this.OooO0Oo++;
                return obj2;
            }
            this.OooO0o0++;
            return null;
        }
    }

    public int OooO0o0(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.OooO0oO;
        int iOooOOO0 = staggeredGridLayoutManager.OooOOo.OooOOO0();
        int iOooO = staggeredGridLayoutManager.OooOOo.OooO();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.OooO0o).get(i);
            int iOooO0oO = staggeredGridLayoutManager.OooOOo.OooO0oO(view);
            int iOooO0Oo = staggeredGridLayoutManager.OooOOo.OooO0Oo(view);
            boolean z = iOooO0oO <= iOooO;
            boolean z2 = iOooO0Oo >= iOooOOO0;
            if (z && z2 && (iOooO0oO < iOooOOO0 || iOooO0Oo > iOooO)) {
                return i71.Oooo00o(view);
            }
            i += i3;
        }
        return -1;
    }

    public int OooO0oO(int i) {
        int i2 = this.OooO0OO;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.OooO0o).size() == 0) {
            return i;
        }
        OooO00o();
        return this.OooO0OO;
    }

    public View OooO0oo(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.OooO0oO;
        ArrayList arrayList = (ArrayList) this.OooO0o;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.OooOo0o && i71.Oooo00o(view2) >= i) || ((!staggeredGridLayoutManager.OooOo0o && i71.Oooo00o(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.OooOo0o && i71.Oooo00o(view3) <= i) || ((!staggeredGridLayoutManager.OooOo0o && i71.Oooo00o(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object OooOO0(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.OooO0oO
            com.cmaster.cloner.d83 r0 = (com.cmaster.cloner.d83) r0
            monitor-enter(r0)
            int r1 = r4.OooO0OO     // Catch: java.lang.Throwable -> L20
            int r1 = r1 + 1
            r4.OooO0OO = r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r4.OooO0o     // Catch: java.lang.Throwable -> L20
            com.cmaster.cloner.xb1 r1 = (com.cmaster.cloner.xb1) r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.OooO0o0     // Catch: java.lang.Throwable -> L20
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r5 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L23
            int r6 = r4.OooO0OO     // Catch: java.lang.Throwable -> L20
            int r6 = r6 + (-1)
            r4.OooO0OO = r6     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r4 = move-exception
            goto Lc1
        L23:
            monitor-exit(r0)
            int r6 = r4.OooO0O0
        L26:
            java.lang.Object r0 = r4.OooO0oO
            com.cmaster.cloner.d83 r0 = (com.cmaster.cloner.d83) r0
            monitor-enter(r0)
            int r1 = r4.OooO0OO     // Catch: java.lang.Throwable -> L42
            if (r1 < 0) goto Lb7
            java.lang.Object r1 = r4.OooO0o     // Catch: java.lang.Throwable -> L42
            com.cmaster.cloner.xb1 r1 = (com.cmaster.cloner.xb1) r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.OooO0o0     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L45
            int r1 = r4.OooO0OO     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto Lb7
            goto L45
        L42:
            r4 = move-exception
            goto Lbf
        L45:
            int r1 = r4.OooO0OO     // Catch: java.lang.Throwable -> L42
            if (r1 <= r6) goto Lb5
            java.lang.Object r1 = r4.OooO0o     // Catch: java.lang.Throwable -> L42
            com.cmaster.cloner.xb1 r1 = (com.cmaster.cloner.xb1) r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.OooO0o0     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L58
            goto Lb5
        L58:
            java.lang.Object r1 = r4.OooO0o     // Catch: java.lang.Throwable -> L42
            com.cmaster.cloner.xb1 r1 = (com.cmaster.cloner.xb1) r1     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.OooO0o0     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L42
            r1.getClass()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r2 == 0) goto L7b
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L75
            goto L8a
        L75:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
            goto L8a
        L7b:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L86
            goto L8a
        L86:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L42
        L8a:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L90
            monitor-exit(r0)
            return r5
        L90:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r4.OooO0o     // Catch: java.lang.Throwable -> L42
            com.cmaster.cloner.xb1 r3 = (com.cmaster.cloner.xb1) r3     // Catch: java.lang.Throwable -> L42
            r3.getClass()     // Catch: java.lang.Throwable -> L42
            r1.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r3.OooO0o0     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L42
            r3.remove(r1)     // Catch: java.lang.Throwable -> L42
            int r1 = r4.OooO0OO     // Catch: java.lang.Throwable -> L42
            r2.getClass()     // Catch: java.lang.Throwable -> L42
            int r1 = r1 + (-1)
            r4.OooO0OO = r1     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            goto L26
        Lb5:
            monitor-exit(r0)
            return r5
        Lb7:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L42
            throw r5     // Catch: java.lang.Throwable -> L42
        Lbf:
            monitor-exit(r0)
            throw r4
        Lc1:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.np0.OooOO0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public String toString() {
        String str;
        switch (this.OooO00o) {
            case 0:
                synchronized (((d83) this.OooO0oO)) {
                    try {
                        int i = this.OooO0Oo;
                        int i2 = this.OooO0o0 + i;
                        str = "LruCache[maxSize=" + this.OooO0O0 + ",hits=" + this.OooO0Oo + ",misses=" + this.OooO0o0 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public np0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.OooO00o = 1;
        this.OooO0oO = staggeredGridLayoutManager;
        this.OooO0o = new ArrayList();
        this.OooO0O0 = Integer.MIN_VALUE;
        this.OooO0OO = Integer.MIN_VALUE;
        this.OooO0Oo = 0;
        this.OooO0o0 = i;
    }
}
