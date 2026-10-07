package com.cmaster.cloner;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pe2 implements Iterator {
    public final Iterator OooO0Oo;

    public pe2(Iterator it) {
        it.getClass();
        this.OooO0Oo = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OooO0Oo.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.OooO0Oo.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.OooO0Oo.remove();
    }
}
