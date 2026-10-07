package com.bumptech.matrix.ui.qrcode;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.cmaster.cloner.R;
import com.cmaster.cloner.p41;
import com.cmaster.cloner.ph1;
import com.cmaster.cloner.sn2;
import com.cmaster.cloner.xa;
import com.cmaster.cloner.ya;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class CameraSourcePreview extends ViewGroup {
    public static final String OooOO0 = sn2.OooO00o("TJKoOXGjwAhx4bwuebroHXY=\n", "AdvsXBzMgXg=\n");
    public GraphicOverlay OooO;
    public final Context OooO0Oo;
    public boolean OooO0o;
    public final SurfaceView OooO0o0;
    public boolean OooO0oO;
    public xa OooO0oo;

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0Oo = context;
        this.OooO0o = false;
        this.OooO0oO = false;
        SurfaceView surfaceView = new SurfaceView(context);
        this.OooO0o0 = surfaceView;
        surfaceView.getHolder().addCallback(new ya(this));
        addView(surfaceView);
    }

    public final boolean OooO00o() {
        int i = this.OooO0Oo.getResources().getConfiguration().orientation;
        if (i == 2) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        Log.d(OooOO0, sn2.OooO00o("eCwrNtUjRq54KzY2wzIUvXQrDivJPlqoMTkaNdQyFK1ofx88wTZBo2U=\n", "EV97WadXNM8=\n"));
        return false;
    }

    public final void OooO0O0() {
        if (this.OooO0o && this.OooO0oO) {
            Context context = this.OooO0Oo;
            String str = p41.OooO00o;
            boolean z = PreferenceManager.getDefaultSharedPreferences(context).getBoolean(context.getString(R.string.pref_key_camera_live_viewport), false);
            xa xaVar = this.OooO0oo;
            if (z) {
                SurfaceHolder holder = this.OooO0o0.getHolder();
                synchronized (xaVar) {
                    if (xaVar.OooO0O0 == null) {
                        Camera cameraOooO00o = xaVar.OooO00o();
                        xaVar.OooO0O0 = cameraOooO00o;
                        cameraOooO00o.setPreviewDisplay(holder);
                        xaVar.OooO0O0.startPreview();
                        xaVar.OooO0oo = new Thread(xaVar.OooO);
                        xaVar.OooO.OooO00o(true);
                        xaVar.OooO0oo.start();
                    }
                }
            } else {
                synchronized (xaVar) {
                    try {
                        if (xaVar.OooO0O0 == null) {
                            xaVar.OooO0O0 = xaVar.OooO00o();
                            if (xaVar.OooO0o == null) {
                                xaVar.OooO0o = new SurfaceTexture(100);
                            }
                            xaVar.OooO0O0.setPreviewTexture(xaVar.OooO0o);
                            xaVar.OooO0O0.startPreview();
                            xaVar.OooO0oo = new Thread(xaVar.OooO);
                            xaVar.OooO.OooO00o(true);
                            xaVar.OooO0oo.start();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            requestLayout();
            if (this.OooO != null) {
                ph1 ph1Var = this.OooO0oo.OooO0o0;
                int iMin = Math.min(ph1Var.OooO00o, ph1Var.OooO0O0);
                int iMax = Math.max(ph1Var.OooO00o, ph1Var.OooO0O0);
                boolean z2 = this.OooO0oo.OooO0OO == 1;
                boolean zOooO00o = OooO00o();
                GraphicOverlay graphicOverlay = this.OooO;
                if (zOooO00o) {
                    graphicOverlay.OooO0OO(iMin, iMax, z2);
                } else {
                    graphicOverlay.OooO0OO(iMax, iMin, z2);
                }
                this.OooO.OooO0O0();
            }
            this.OooO0o = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        ph1 ph1Var;
        xa xaVar = this.OooO0oo;
        if (xaVar == null || (ph1Var = xaVar.OooO0o0) == null) {
            i5 = 320;
            i6 = 240;
        } else {
            i5 = ph1Var.OooO00o;
            i6 = ph1Var.OooO0O0;
        }
        if (!OooO00o()) {
            int i7 = i5;
            i5 = i6;
            i6 = i7;
        }
        float f = i6 / i5;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        float f2 = i8;
        float f3 = i9;
        float f4 = f2 / f3;
        SurfaceView surfaceView = this.OooO0o0;
        if (f > f4) {
            int i10 = ((int) ((f * f3) - f2)) / 2;
            surfaceView.layout(-i10, 0, i8 + i10, i9);
        } else {
            int i11 = ((int) ((f2 / f) - f3)) / 2;
            surfaceView.layout(0, -i11, i8, i9 + i11);
        }
    }
}
