package com.cmaster.cloner;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u9 implements ia1 {
    public final /* synthetic */ int OooO00o;
    public final h8 OooO0O0;

    public u9(int i) {
        this.OooO00o = i;
        switch (i) {
            case 1:
                this.OooO0O0 = new h8();
                break;
            default:
                this.OooO0O0 = new h8();
                break;
        }
    }

    @Override // com.cmaster.cloner.ia1
    public final fa1 OooO00o(Object obj, int i, int i2, xz0 xz0Var) {
        int i3 = this.OooO00o;
        h8 h8Var = this.OooO0O0;
        switch (i3) {
            case 0:
                return h8Var.OooO0OO(ImageDecoder.createSource((ByteBuffer) obj), i, i2, xz0Var);
            default:
                return h8Var.OooO0OO(ImageDecoder.createSource(ba.OooO0O0((InputStream) obj)), i, i2, xz0Var);
        }
    }

    @Override // com.cmaster.cloner.ia1
    public final /* bridge */ /* synthetic */ boolean OooO0O0(Object obj, xz0 xz0Var) {
        switch (this.OooO00o) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
