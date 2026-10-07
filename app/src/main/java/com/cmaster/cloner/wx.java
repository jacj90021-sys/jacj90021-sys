package com.cmaster.cloner;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wx implements wf0 {
    @Override // com.cmaster.cloner.wf0
    public final ImageHeaderParser$ImageType OooO00o(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // com.cmaster.cloner.wf0
    public final int OooO0O0(InputStream inputStream, jp0 jp0Var) {
        int iOooO0o0;
        vx vxVar = new vx(inputStream);
        rx rxVarOooO0OO = vxVar.OooO0OO("Orientation");
        if (rxVarOooO0OO == null) {
            iOooO0o0 = 1;
        } else {
            try {
                iOooO0o0 = rxVarOooO0OO.OooO0o0(vxVar.OooO0o);
            } catch (NumberFormatException unused) {
            }
        }
        if (iOooO0o0 == 0) {
            return -1;
        }
        return iOooO0o0;
    }

    @Override // com.cmaster.cloner.wf0
    public final ImageHeaderParser$ImageType OooO0OO(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // com.cmaster.cloner.wf0
    public final int OooO0Oo(ByteBuffer byteBuffer, jp0 jp0Var) {
        AtomicReference atomicReference = ba.OooO00o;
        return OooO0O0(new z9(byteBuffer), jp0Var);
    }
}
