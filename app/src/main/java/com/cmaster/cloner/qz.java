package com.cmaster.cloner;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qz extends r3 {
    public final /* synthetic */ int OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qz(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.OooO0oo = i;
    }

    @Override // com.cmaster.cloner.in
    public final Class OooO00o() {
        switch (this.OooO0oo) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.cmaster.cloner.r3
    public final void OooO0oO(Object obj) throws IOException {
        switch (this.OooO0oo) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // com.cmaster.cloner.r3
    public final Object OooO0oo(AssetManager assetManager, String str) {
        switch (this.OooO0oo) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
