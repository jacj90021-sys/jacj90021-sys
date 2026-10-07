package com.cmaster.cloner;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ve1 implements Iterator, gj {
    public int OooO0Oo;
    public Iterator OooO0o;
    public Object OooO0o0;
    public gj OooO0oO;

    public final RuntimeException OooO00o() {
        int i = this.OooO0Oo;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.OooO0Oo);
    }

    @Override // com.cmaster.cloner.gj
    public final void OooO0Oo(Object obj) throws Throwable {
        ty2.OooO0O0(obj);
        this.OooO0Oo = 4;
    }

    @Override // com.cmaster.cloner.gj
    public final vj getContext() {
        return lv.OooO0Oo;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.OooO0Oo;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw OooO00o();
                }
                Iterator it = this.OooO0o;
                it.getClass();
                if (it.hasNext()) {
                    this.OooO0Oo = 2;
                    return true;
                }
                this.OooO0o = null;
            }
            this.OooO0Oo = 5;
            gj gjVar = this.OooO0oO;
            gjVar.getClass();
            this.OooO0oO = null;
            gjVar.OooO0Oo(vq1.OooO00o);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.OooO0Oo;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            sa.OooOO0O();
            return null;
        }
        if (i == 2) {
            this.OooO0Oo = 1;
            Iterator it = this.OooO0o;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw OooO00o();
        }
        this.OooO0Oo = 0;
        Object obj = this.OooO0o0;
        this.OooO0o0 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
