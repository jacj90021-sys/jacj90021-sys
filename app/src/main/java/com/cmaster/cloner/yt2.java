package com.cmaster.cloner;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class yt2 {
    public static int OooO00o(List list, InputStream inputStream, jp0 jp0Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w61(inputStream, jp0Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iOooO0O0 = ((wf0) list.get(i)).OooO0O0(inputStream, jp0Var);
                if (iOooO0O0 != -1) {
                    return iOooO0O0;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType OooO0O0(List list, InputStream inputStream, jp0 jp0Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w61(inputStream, jp0Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeOooO0OO = ((wf0) list.get(i)).OooO0OO(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeOooO0OO != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeOooO0OO;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType OooO0OO(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeOooO00o = ((wf0) list.get(i)).OooO00o(byteBuffer);
                AtomicReference atomicReference = ba.OooO00o;
                if (imageHeaderParser$ImageTypeOooO00o != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeOooO00o;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = ba.OooO00o;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
