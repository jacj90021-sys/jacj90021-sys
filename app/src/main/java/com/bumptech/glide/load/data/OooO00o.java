package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.cmaster.cloner.nn;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class OooO00o implements nn {
    public final ParcelFileDescriptorRewinder$InternalRewinder OooO0Oo;

    public OooO00o(ParcelFileDescriptor parcelFileDescriptor) {
        this.OooO0Oo = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.cmaster.cloner.nn
    public final Object OooO() {
        return this.OooO0Oo.rewind();
    }

    public final ParcelFileDescriptor OooO00o() {
        return this.OooO0Oo.rewind();
    }

    @Override // com.cmaster.cloner.nn
    public final void OooO0Oo() {
    }
}
