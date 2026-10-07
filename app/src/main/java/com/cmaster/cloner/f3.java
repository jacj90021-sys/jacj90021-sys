package com.cmaster.cloner;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f3 implements Iterator {
    public final /* synthetic */ int OooO0Oo;
    public int OooO0o;
    public final Object[] OooO0o0;

    public f3(Object[] objArr, int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 1:
                this.OooO0o0 = objArr;
                break;
            default:
                objArr.getClass();
                this.OooO0o0 = objArr;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.OooO0Oo) {
            case 0:
                if (this.OooO0o < this.OooO0o0.length) {
                }
                break;
            default:
                if (this.OooO0o != this.OooO0o0.length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.OooO0Oo) {
            case 0:
                try {
                    Object[] objArr = this.OooO0o0;
                    int i = this.OooO0o;
                    this.OooO0o = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.OooO0o--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                int i2 = this.OooO0o;
                this.OooO0o = i2 + 1;
                return this.OooO0o0[i2];
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
