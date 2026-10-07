package com.cmaster.cloner;

import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wm0 implements Iterator {
    public final String OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;

    public wm0(String str) {
        this.OooO0Oo = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.OooO0o0;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.OooO0oo < 0) {
            this.OooO0o0 = 2;
            return false;
        }
        String str = this.OooO0Oo;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.OooO0o; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.OooO0o0 = 1;
                this.OooO0oo = i;
                this.OooO0oO = length;
                return true;
            }
        }
        i = -1;
        this.OooO0o0 = 1;
        this.OooO0oo = i;
        this.OooO0oO = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            sa.OooOO0O();
            return null;
        }
        this.OooO0o0 = 0;
        int i = this.OooO0oO;
        int i2 = this.OooO0o;
        this.OooO0o = this.OooO0oo + i;
        return this.OooO0Oo.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
