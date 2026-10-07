package com.cmaster.cloner;

import java.io.File;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wq1 implements iu0 {
    public static final wq1 OooO0O0 = new wq1(0);
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ wq1(int i) {
        this.OooO00o = i;
    }

    @Override // com.cmaster.cloner.iu0
    public final boolean OooO00o(Object obj) {
        switch (this.OooO00o) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // com.cmaster.cloner.iu0
    public final hu0 OooO0O0(Object obj, int i, int i2, xz0 xz0Var) {
        switch (this.OooO00o) {
            case 0:
                return new hu0(new by0(obj), new v9(obj, 1));
            case 1:
                File file = (File) obj;
                return new hu0(new by0(file), new v9(file, 0));
            default:
                return null;
        }
    }
}
