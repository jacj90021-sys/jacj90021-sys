package com.cmaster.cloner;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x9 implements mn {
    public final /* synthetic */ int OooO00o;

    @Override // com.cmaster.cloner.mn
    public final Class OooO00o() {
        switch (this.OooO00o) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.cmaster.cloner.mn
    public final nn OooO0O0(Object obj) {
        switch (this.OooO00o) {
            case 0:
                return new y9((ByteBuffer) obj);
            case 1:
                return new uf(obj);
            default:
                return new com.bumptech.glide.load.data.OooO00o((ParcelFileDescriptor) obj);
        }
    }
}
