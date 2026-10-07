package com.cmaster.cloner;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hj1 implements ia1 {
    public final ArrayList OooO00o;
    public final w9 OooO0O0;
    public final jp0 OooO0OO;

    public hj1(ArrayList arrayList, w9 w9Var, jp0 jp0Var) {
        this.OooO00o = arrayList;
        this.OooO0O0 = w9Var;
        this.OooO0OO = jp0Var;
    }

    @Override // com.cmaster.cloner.ia1
    public final fa1 OooO00o(Object obj, int i, int i2, xz0 xz0Var) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(UnixStat.DIR_FLAG);
        try {
            byte[] bArr = new byte[UnixStat.DIR_FLAG];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.OooO0O0.OooO00o(ByteBuffer.wrap(byteArray), i, i2, xz0Var);
    }

    @Override // com.cmaster.cloner.ia1
    public final boolean OooO0O0(Object obj, xz0 xz0Var) {
        return !((Boolean) xz0Var.OooO0OO(g50.OooO0O0)).booleanValue() && yt2.OooO0O0(this.OooO00o, (InputStream) obj, this.OooO0OO) == ImageHeaderParser$ImageType.GIF;
    }
}
