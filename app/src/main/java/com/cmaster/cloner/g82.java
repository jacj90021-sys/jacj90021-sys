package com.cmaster.cloner;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class g82 implements Iterator {
    public final /* synthetic */ int OooO0Oo = 0;
    public Object OooO0o;
    public final Iterator OooO0o0;
    public final /* synthetic */ Object OooO0oO;

    public g82(p92 p92Var) {
        this.OooO0oO = p92Var;
        Collection collection = p92Var.OooO0o0;
        this.OooO0o = collection;
        this.OooO0o0 = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void OooO00o() {
        p92 p92Var = (p92) this.OooO0oO;
        p92Var.zzb();
        if (p92Var.OooO0o0 == ((Collection) this.OooO0o)) {
            return;
        }
        sa.OooO0O0();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.OooO0Oo) {
            case 0:
                break;
            case 1:
                break;
            default:
                OooO00o();
                break;
        }
        return this.OooO0o0.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.OooO0Oo;
        Iterator it = this.OooO0o0;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.OooO0o = (Collection) entry.getValue();
                Object key = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                ma2 ma2Var = ((k82) this.OooO0oO).OooO0oO;
                ma2Var.getClass();
                List list = (List) collection;
                return new yc2(key, list instanceof RandomAccess ? new b92(ma2Var, key, list, null) : new p92(ma2Var, key, list, null));
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.OooO0o = entry2;
                return entry2.getKey();
            default:
                OooO00o();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0oO;
        Iterator it = this.OooO0o0;
        switch (i) {
            case 0:
                f73.OooO0OO("no calls to next() since the last call to remove()", ((Collection) this.OooO0o) != null);
                it.remove();
                ((k82) obj).OooO0oO.OooO0oo -= ((Collection) this.OooO0o).size();
                ((Collection) this.OooO0o).clear();
                this.OooO0o = null;
                break;
            case 1:
                f73.OooO0OO("no calls to next() since the last call to remove()", ((Map.Entry) this.OooO0o) != null);
                Collection collection = (Collection) ((Map.Entry) this.OooO0o).getValue();
                it.remove();
                ((v82) obj).OooO0o0.OooO0oo -= collection.size();
                collection.clear();
                this.OooO0o = null;
                break;
            default:
                it.remove();
                p92 p92Var = (p92) obj;
                ma2 ma2Var = p92Var.OooO0oo;
                ma2Var.OooO0oo--;
                p92Var.OooO0O0();
                break;
        }
    }

    public g82(p92 p92Var, ListIterator listIterator) {
        this.OooO0oO = p92Var;
        this.OooO0o = p92Var.OooO0o0;
        this.OooO0o0 = listIterator;
    }

    public g82(k82 k82Var) {
        this.OooO0oO = k82Var;
        this.OooO0o0 = k82Var.OooO0o.entrySet().iterator();
    }

    public g82(v82 v82Var, Iterator it) {
        this.OooO0o0 = it;
        this.OooO0oO = v82Var;
    }
}
