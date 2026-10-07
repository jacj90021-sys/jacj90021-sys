package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ff2 extends o32 {
    public boolean OooO0o;
    public final Object OooO0o0;

    public ff2(Object obj) {
        super(2);
        this.OooO0o0 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.OooO0o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.OooO0o) {
            sa.OooOO0O();
            return null;
        }
        this.OooO0o = true;
        return this.OooO0o0;
    }
}
