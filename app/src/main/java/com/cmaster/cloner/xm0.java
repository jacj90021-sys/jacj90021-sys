package com.cmaster.cloner;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xm0 implements ListIterator {
    public final /* synthetic */ int OooO0Oo = 0;
    public int OooO0o = -1;
    public int OooO0o0;
    public int OooO0oO;
    public final o0Oo0oo OooO0oo;

    public xm0(zm0 zm0Var, int i) {
        this.OooO0oo = zm0Var;
        this.OooO0o0 = i;
        this.OooO0oO = ((AbstractList) zm0Var).modCount;
    }

    public final void OooO00o() {
        int i = this.OooO0Oo;
        o0Oo0oo o0oo0oo = this.OooO0oo;
        switch (i) {
            case 0:
                if (((AbstractList) ((ym0) o0oo0oo).OooO0oo).modCount != this.OooO0oO) {
                    sa.OooO0O0();
                    break;
                }
                break;
            default:
                if (((AbstractList) ((zm0) o0oo0oo)).modCount != this.OooO0oO) {
                    sa.OooO0O0();
                    break;
                }
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.OooO0Oo;
        o0Oo0oo o0oo0oo = this.OooO0oo;
        switch (i) {
            case 0:
                OooO00o();
                ym0 ym0Var = (ym0) o0oo0oo;
                int i2 = this.OooO0o0;
                this.OooO0o0 = i2 + 1;
                ym0Var.add(i2, obj);
                this.OooO0o = -1;
                this.OooO0oO = ((AbstractList) ym0Var).modCount;
                break;
            default:
                OooO00o();
                zm0 zm0Var = (zm0) o0oo0oo;
                int i3 = this.OooO0o0;
                this.OooO0o0 = i3 + 1;
                zm0Var.add(i3, obj);
                this.OooO0o = -1;
                this.OooO0oO = ((AbstractList) zm0Var).modCount;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.OooO0Oo;
        o0Oo0oo o0oo0oo = this.OooO0oo;
        switch (i) {
            case 0:
                if (this.OooO0o0 < ((ym0) o0oo0oo).OooO0o) {
                    break;
                }
                break;
            default:
                if (this.OooO0o0 < ((zm0) o0oo0oo).OooO0o0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.OooO0Oo) {
            case 0:
                if (this.OooO0o0 > 0) {
                }
                break;
            default:
                if (this.OooO0o0 > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.OooO0Oo;
        o0Oo0oo o0oo0oo = this.OooO0oo;
        switch (i) {
            case 0:
                OooO00o();
                int i2 = this.OooO0o0;
                ym0 ym0Var = (ym0) o0oo0oo;
                if (i2 >= ym0Var.OooO0o) {
                    sa.OooOO0O();
                    break;
                } else {
                    this.OooO0o0 = i2 + 1;
                    this.OooO0o = i2;
                    break;
                }
            default:
                OooO00o();
                int i3 = this.OooO0o0;
                zm0 zm0Var = (zm0) o0oo0oo;
                if (i3 >= zm0Var.OooO0o0) {
                    sa.OooOO0O();
                    break;
                } else {
                    this.OooO0o0 = i3 + 1;
                    this.OooO0o = i3;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.OooO0Oo) {
        }
        return this.OooO0o0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.OooO0Oo;
        o0Oo0oo o0oo0oo = this.OooO0oo;
        switch (i) {
            case 0:
                OooO00o();
                int i2 = this.OooO0o0;
                if (i2 <= 0) {
                    sa.OooOO0O();
                    break;
                } else {
                    int i3 = i2 - 1;
                    this.OooO0o0 = i3;
                    this.OooO0o = i3;
                    ym0 ym0Var = (ym0) o0oo0oo;
                    break;
                }
            default:
                OooO00o();
                int i4 = this.OooO0o0;
                if (i4 <= 0) {
                    sa.OooOO0O();
                    break;
                } else {
                    int i5 = i4 - 1;
                    this.OooO0o0 = i5;
                    this.OooO0o = i5;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.OooO0Oo) {
            case 0:
                i = this.OooO0o0;
                break;
            default:
                i = this.OooO0o0;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.OooO0Oo;
        o0Oo0oo o0oo0oo = this.OooO0oo;
        switch (i) {
            case 0:
                ym0 ym0Var = (ym0) o0oo0oo;
                OooO00o();
                int i2 = this.OooO0o;
                if (i2 == -1) {
                    qa.OooO0o("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    ym0Var.OooO0O0(i2);
                    this.OooO0o0 = this.OooO0o;
                    this.OooO0o = -1;
                    this.OooO0oO = ((AbstractList) ym0Var).modCount;
                    break;
                }
            default:
                zm0 zm0Var = (zm0) o0oo0oo;
                OooO00o();
                int i3 = this.OooO0o;
                if (i3 == -1) {
                    qa.OooO0o("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    zm0Var.OooO0O0(i3);
                    this.OooO0o0 = this.OooO0o;
                    this.OooO0o = -1;
                    this.OooO0oO = ((AbstractList) zm0Var).modCount;
                    break;
                }
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.OooO0Oo;
        o0Oo0oo o0oo0oo = this.OooO0oo;
        switch (i) {
            case 0:
                OooO00o();
                int i2 = this.OooO0o;
                if (i2 == -1) {
                    qa.OooO0o("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((ym0) o0oo0oo).set(i2, obj);
                    break;
                }
            default:
                OooO00o();
                int i3 = this.OooO0o;
                if (i3 == -1) {
                    qa.OooO0o("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((zm0) o0oo0oo).set(i3, obj);
                    break;
                }
        }
    }

    public xm0(ym0 ym0Var, int i) {
        this.OooO0oo = ym0Var;
        this.OooO0o0 = i;
        this.OooO0oO = ((AbstractList) ym0Var).modCount;
    }
}
