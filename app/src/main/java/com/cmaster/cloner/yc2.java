package com.cmaster.cloner;

import java.io.Serializable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yc2 extends x92 implements Serializable {
    public final Object OooO0Oo;
    public final Object OooO0o0;

    public yc2(Object obj, Object obj2) {
        this.OooO0Oo = obj;
        this.OooO0o0 = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.OooO0Oo;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.OooO0o0;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
