package com.cmaster.cloner;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y9 implements nn, sz0 {
    public final ByteBuffer OooO0Oo;

    public y9() {
        this.OooO0Oo = ByteBuffer.allocate(8);
    }

    @Override // com.cmaster.cloner.nn
    public Object OooO() {
        ByteBuffer byteBuffer = this.OooO0Oo;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.cmaster.cloner.nn
    public void OooO0Oo() {
    }

    @Override // com.cmaster.cloner.sz0
    public void OooO0o0(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.OooO0Oo) {
            this.OooO0Oo.position(0);
            messageDigest.update(this.OooO0Oo.putLong(l.longValue()).array());
        }
    }

    public y9(ByteBuffer byteBuffer) {
        this.OooO0Oo = byteBuffer;
    }
}
