package com.cmaster.cloner;

import android.hardware.Camera;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ua implements Camera.PreviewCallback {
    public final /* synthetic */ xa OooO00o;

    public ua(xa xaVar) {
        this.OooO00o = xaVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        va vaVar = this.OooO00o.OooO;
        synchronized (vaVar.OooO0Oo) {
            try {
                ByteBuffer byteBuffer = vaVar.OooO0o;
                if (byteBuffer != null) {
                    camera.addCallbackBuffer(byteBuffer.array());
                    vaVar.OooO0o = null;
                }
                if (!vaVar.OooO0oO.OooOO0o.containsKey(bArr)) {
                    Log.d(sn2.OooO00o("wZaXJXSatYX85ZAhdJCGlN+wpjJ6kA==\n", "jN/TQBn19PU=\n"), sn2.OooO00o("LQsvFn93WkReBjQHYnsaAz0PMwprPlpMCkAgD2F6FGEHFCMkenhSRgxAJxV8cVdKHxQjAi9pXVcW\nQDIOaj5dTh8HI0Zrf0BCXgY0CWI+QEsbQCUHYntGQlA=\n", "fmBGZg8eNCM=\n"));
                } else {
                    vaVar.OooO0o = (ByteBuffer) vaVar.OooO0oO.OooOO0o.get(bArr);
                    vaVar.OooO0Oo.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
