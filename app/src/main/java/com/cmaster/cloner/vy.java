package com.cmaster.cloner;

import java.util.Random;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vy extends ThreadLocal {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ vy(int i) {
        this.OooO00o = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.OooO00o) {
            case 0:
                return new Random();
            case 1:
                return new t81();
            default:
                return 0L;
        }
    }
}
