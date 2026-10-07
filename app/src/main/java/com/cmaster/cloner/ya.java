package com.cmaster.cloner;

import android.util.Log;
import android.view.SurfaceHolder;
import com.bumptech.matrix.ui.qrcode.CameraSourcePreview;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ya implements SurfaceHolder.Callback {
    public final /* synthetic */ CameraSourcePreview OooO0Oo;

    public ya(CameraSourcePreview cameraSourcePreview) {
        this.OooO0Oo = cameraSourcePreview;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        CameraSourcePreview cameraSourcePreview = this.OooO0Oo;
        cameraSourcePreview.OooO0oO = true;
        try {
            cameraSourcePreview.OooO0O0();
        } catch (IOException e) {
            Log.e(sn2.OooO00o("6DY9lsFJdr7VRSmByVBeq9I=\n", "pX9586wmN84=\n"), sn2.OooO00o("WsePS2EODaltiIlTZFwX5nrJl0J3T0O1dt2IRGAA\n", "Gaj6JwUuY8Y=\n"), e);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.OooO0Oo.OooO0oO = false;
    }
}
