package com.cmaster.cloner;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z72 implements Iterator {
    public final Iterator OooO0Oo;
    public final /* synthetic */ ma2 OooO0oo;
    public Object OooO0o0 = null;
    public Collection OooO0o = null;
    public Iterator OooO0oO = vd2.OooO0Oo;

    public z72(ma2 ma2Var) {
        this.OooO0oo = ma2Var;
        this.OooO0Oo = ma2Var.OooO0oO.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OooO0Oo.hasNext() || this.OooO0oO.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.OooO0oO.hasNext()) {
            Map.Entry entry = (Map.Entry) this.OooO0Oo.next();
            this.OooO0o0 = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.OooO0o = collection;
            this.OooO0oO = collection.iterator();
        }
        return new yc2(this.OooO0o0, this.OooO0oO.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.OooO0oO.remove();
        Collection collection = this.OooO0o;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.OooO0Oo.remove();
        }
        ma2 ma2Var = this.OooO0oo;
        ma2Var.OooO0oo--;
    }
}
