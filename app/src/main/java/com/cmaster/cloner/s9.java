package com.cmaster.cloner;

import java.io.File;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s9 implements iu0 {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public /* synthetic */ s9(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.cmaster.cloner.iu0
    public final boolean OooO00o(Object obj) {
        switch (this.OooO00o) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // com.cmaster.cloner.iu0
    public final hu0 OooO0O0(Object obj, int i, int i2, xz0 xz0Var) {
        int i3 = this.OooO00o;
        Object obj2 = this.OooO0O0;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new hu0(new by0(bArr), new rr0(bArr, (r9) obj2, 1));
            case 1:
                return new hu0(new by0(obj), new rr0(obj.toString(), (s60) obj2));
            default:
                File file = (File) obj;
                return new hu0(new by0(file), new sz(0, file, (tz) obj2));
        }
    }
}
