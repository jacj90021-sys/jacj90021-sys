package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {
    public final ParcelFileDescriptor OooO00o;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.OooO00o = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() throws IOException, ErrnoException {
        ParcelFileDescriptor parcelFileDescriptor = this.OooO00o;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }
}
