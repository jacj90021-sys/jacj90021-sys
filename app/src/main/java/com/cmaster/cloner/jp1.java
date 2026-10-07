package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jp1 implements Iterator {
    public final ArrayList OooO0Oo = new ArrayList();
    public Iterator OooO0o0;

    public jp1(oo000o oo000oVar) {
        this.OooO0o0 = oo000oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OooO0o0.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.OooO0o0.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        oo000o oo000oVar = viewGroup != null ? new oo000o(viewGroup, 1) : null;
        ArrayList arrayList = this.OooO0Oo;
        if (oo000oVar != null && oo000oVar.hasNext()) {
            arrayList.add(this.OooO0o0);
            this.OooO0o0 = oo000oVar;
            return next;
        }
        while (!this.OooO0o0.hasNext() && !arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            this.OooO0o0 = (Iterator) arrayList.get(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            arrayList.remove(arrayList.size() - 1);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
