package com.cmaster.cloner;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p3 extends r3 {
    public final /* synthetic */ int OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3(ContentResolver contentResolver, Uri uri, int i) {
        super(1, uri, contentResolver);
        this.OooO0oo = i;
    }

    @Override // com.cmaster.cloner.r3
    public final Object OooO(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        switch (this.OooO0oo) {
            case 0:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    qa.OooOO0o(uri, "FileDescriptor is null for: ");
                    break;
                } else {
                    break;
                }
            default:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor2 == null) {
                    qa.OooOO0o(uri, "FileDescriptor is null for: ");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    @Override // com.cmaster.cloner.in
    public final Class OooO00o() {
        switch (this.OooO0oo) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.cmaster.cloner.r3
    public final void OooO0oO(Object obj) throws IOException {
        switch (this.OooO0oo) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }
}
