package com.cmaster.cloner;

import android.content.SharedPreferences;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.WindowManager;
import com.bumptech.matrix.ui.qrcode.ActivityBarCodePreview;
import com.bumptech.matrix.ui.qrcode.GraphicOverlay;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xa {
    public static final String OooOOO0 = sn2.OooO00o("/6cMnKlZGenC1AuYqVMq+OGBPYunUw==\n", "su5I+cQ2WJk=\n");
    public final va OooO;
    public final ActivityBarCodePreview OooO00o;
    public Camera OooO0O0;
    public int OooO0Oo;
    public SurfaceTexture OooO0o;
    public ph1 OooO0o0;
    public final GraphicOverlay OooO0oO;
    public Thread OooO0oo;
    public b6 OooOO0O;
    public int OooO0OO = 0;
    public final Object OooOO0 = new Object();
    public final IdentityHashMap OooOO0o = new IdentityHashMap();

    public xa(ActivityBarCodePreview activityBarCodePreview, GraphicOverlay graphicOverlay) {
        this.OooO00o = activityBarCodePreview;
        this.OooO0oO = graphicOverlay;
        graphicOverlay.OooO0O0();
        this.OooO = new va(this);
    }

    public final Camera OooO00o() throws IOException {
        String string;
        String string2;
        wa waVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.OooO0OO;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i7 = 0;
        while (true) {
            if (i7 >= Camera.getNumberOfCameras()) {
                i7 = -1;
                break;
            }
            Camera.getCameraInfo(i7, cameraInfo);
            if (cameraInfo.facing == i6) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            qa.OooOOOO(sn2.OooO00o("LumFkgM2IDQZppaXCXJuKQj3hZsUYis/TeWRkwJkL3U=\n", "bYbw/mcWTls=\n"));
            return null;
        }
        Camera cameraOpen = Camera.open(i7);
        String str = p41.OooO00o;
        int i8 = 1;
        if (i7 != 0 && i7 != 1) {
            qa.OooOO0();
            return null;
        }
        ActivityBarCodePreview activityBarCodePreview = this.OooO00o;
        if (i7 == 0) {
            string = activityBarCodePreview.getString(R.string.pref_key_rear_camera_preview_size);
            string2 = activityBarCodePreview.getString(R.string.pref_key_rear_camera_picture_size);
        } else {
            string = activityBarCodePreview.getString(R.string.pref_key_front_camera_preview_size);
            string2 = activityBarCodePreview.getString(R.string.pref_key_front_camera_picture_size);
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activityBarCodePreview);
            waVar = new wa(ph1.OooO00o(defaultSharedPreferences.getString(string, null)), ph1.OooO00o(defaultSharedPreferences.getString(string2, null)));
        } catch (Exception unused) {
            waVar = null;
        }
        String str2 = OooOOO0;
        if (waVar == null) {
            Camera.Parameters parameters = cameraOpen.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            ArrayList arrayList = new ArrayList();
            for (Camera.Size size : supportedPreviewSizes) {
                float f = size.width / size.height;
                Iterator<Camera.Size> it = supportedPictureSizes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i5 = i8;
                        break;
                    }
                    Camera.Size next = it.next();
                    i5 = i8;
                    if (Math.abs(f - (next.width / next.height)) < 0.01f) {
                        arrayList.add(new wa(size, next));
                        break;
                    }
                    i8 = i5;
                }
                i8 = i5;
            }
            i = i8;
            i2 = 0;
            if (arrayList.size() == 0) {
                Log.w(str2, sn2.OooO00o("AYS3Qla+ClMqnLdBTaEZSW+D9kRB+x0aLITlQEGoDFUhj/5cQ/sPWyKOulNXqxlZO8blU1CyExo/\ngvRGUakZGjyC7Vc=\n", "T+uXMiTbfDo=\n"));
                Iterator<Camera.Size> it2 = supportedPreviewSizes.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new wa(it2.next(), (Camera.Size) null));
                }
            }
            int size2 = arrayList.size();
            waVar = null;
            int i9 = 0;
            int i10 = Integer.MAX_VALUE;
            while (i9 < size2) {
                Object obj = arrayList.get(i9);
                i9++;
                wa waVar2 = (wa) obj;
                ph1 ph1Var = waVar2.OooO00o;
                int iAbs = Math.abs(ph1Var.OooO0O0 - 480) + Math.abs(ph1Var.OooO00o - 720);
                if (iAbs < i10) {
                    waVar = waVar2;
                    i10 = iAbs;
                }
            }
        } else {
            i = 1;
            i2 = 0;
        }
        if (waVar == null) {
            qa.OooOOOO(sn2.OooO00o("xtoMaatdOPjxlR9soRl25PDcDWStETO39cccc6YYIbf23ANg4Q==\n", "hbV5Bc99Vpc=\n"));
            return null;
        }
        this.OooO0o0 = waVar.OooO00o;
        Log.v(str2, sn2.OooO00o("44ib5MeHky3SjIDo0JGTLsmTk7uV\n", "oOn2gbXms10=\n") + this.OooO0o0);
        int[] iArr = null;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        for (int[] iArr2 : cameraOpen.getParameters().getSupportedPreviewFpsRange()) {
            int iAbs2 = Math.abs(30000 - iArr2[i]);
            int i13 = iArr2[i2];
            if (iAbs2 <= i12 && i13 <= i11) {
                iArr = iArr2;
                i12 = iAbs2;
                i11 = i13;
            }
        }
        if (iArr == null) {
            qa.OooOOOO(sn2.OooO00o("LUkcm0Kn5CIaBg+eSOOqPhtPHZZE6+9tHlQMgU/i/W0IVAiaQ/SqPQtUSYRD5OUjCgYblkjg72M=\n", "biZp9yaHik0=\n"));
            return null;
        }
        Camera.Parameters parameters2 = cameraOpen.getParameters();
        ph1 ph1Var2 = waVar.OooO0O0;
        if (ph1Var2 != null) {
            Log.v(str2, sn2.OooO00o("MnQDbOJVIkQYdhp84lEiRxhvCzOw\n", "cRVuCZA0AjQ=\n") + ph1Var2);
            parameters2.setPictureSize(ph1Var2.OooO00o, ph1Var2.OooO0O0);
        }
        ph1 ph1Var3 = this.OooO0o0;
        parameters2.setPreviewSize(ph1Var3.OooO00o, ph1Var3.OooO0O0);
        parameters2.setPreviewFpsRange(iArr[i2], iArr[i]);
        parameters2.setPreviewFormat(17);
        int rotation = ((WindowManager) activityBarCodePreview.getSystemService(sn2.OooO00o("roRodQts\n", "2e0GEWQb0/k=\n"))).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            i3 = i2;
        } else if (rotation == i) {
            i3 = 90;
        } else if (rotation == 2) {
            i3 = 180;
        } else if (rotation != 3) {
            Log.e(str2, sn2.OooO00o("2b0SWMGaXDbvtRkWk4NJO+65TFg=\n", "m9x2eLP1KFc=\n") + rotation);
            i3 = i2;
        } else {
            i3 = 270;
        }
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i7, cameraInfo2);
        int i14 = cameraInfo2.facing;
        int i15 = cameraInfo2.orientation;
        if (i14 == 1) {
            int i16 = (i15 + i3) % 360;
            this.OooO0Oo = i16;
            i4 = (360 - i16) % 360;
        } else {
            i4 = ((i15 - i3) + 360) % 360;
            this.OooO0Oo = i4;
        }
        Log.d(str2, sn2.OooO00o("qEySypKl1LKeSpXbiq3C/MxMkoDe\n", "7CXhuv7ErZI=\n") + rotation);
        Log.d(str2, sn2.OooO00o("QVIR70mVGn9jUBmqUocAOQ==\n", "AjN8ijv0Ohk=\n") + cameraInfo2.facing);
        Log.d(str2, sn2.OooO00o("ASdliYAk9UstMmmYmyq7GSs1Msw=\n", "QkYI7PJF1Tk=\n") + cameraInfo2.orientation);
        Log.d(str2, sn2.OooO00o("TX1aWMlgCeJbd0lL2GwVrHZhFBk=\n", "HxIuOb0JZow=\n") + this.OooO0Oo);
        cameraOpen.setDisplayOrientation(i4);
        parameters2.setRotation(this.OooO0Oo);
        if (parameters2.getSupportedFocusModes().contains(sn2.OooO00o("bSTphiKpen17OKqEIqNqfQ==\n", "DkuH8kvHDxI=\n"))) {
            parameters2.setFocusMode(sn2.OooO00o("HzB2KLpHWWUJLDUquk1JZQ==\n", "fF8YXNMpLAo=\n"));
        } else {
            Log.i(str2, sn2.OooO00o("tTF4Dz2vL8KDJHpKKaFs1oVwfBlvoGDX1iNgGj+hfdeTNDUFIe57y58jNQ4quGbAk34=\n", "9lAVak/OD6M=\n"));
        }
        cameraOpen.setParameters(parameters2);
        cameraOpen.setPreviewCallbackWithBuffer(new ua(this));
        cameraOpen.addCallbackBuffer(OooO0O0(this.OooO0o0));
        cameraOpen.addCallbackBuffer(OooO0O0(this.OooO0o0));
        cameraOpen.addCallbackBuffer(OooO0O0(this.OooO0o0));
        cameraOpen.addCallbackBuffer(OooO0O0(this.OooO0o0));
        return cameraOpen;
    }

    public final byte[] OooO0O0(ph1 ph1Var) {
        byte[] bArr = new byte[((int) Math.ceil(((ph1Var.OooO0O0 * ph1Var.OooO00o) * ImageFormat.getBitsPerPixel(17)) / 8.0d)) + 1];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (byteBufferWrap.hasArray() && byteBufferWrap.array() == bArr) {
            this.OooOO0o.put(bArr, byteBufferWrap);
            return bArr;
        }
        qa.OooO0o(sn2.OooO00o("JIaNVDNfzMcNx4dKM1qY1kKRhVQ/X8zRF4GCXSQbitwQx4dZO16e0kKUi00kWImd\n", "YufkOFY77LM=\n"));
        return null;
    }

    public final void OooO0OO() {
        synchronized (this.OooOO0) {
            try {
                OooO0o0();
                this.OooO0oO.OooO0O0();
                b6 b6Var = this.OooOO0O;
                if (b6Var != null) {
                    b6Var.OooO0o0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void OooO0Oo(int i) {
        try {
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException(sn2.OooO00o("MbD2Mdt0y/cbv+01xXyV9w==\n", "eN6AULcdr9c=\n") + i);
            }
            this.OooO0OO = i;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: all -> 0x0010, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000c, B:11:0x001f, B:12:0x0021, B:14:0x0025, B:15:0x002d, B:19:0x0057, B:18:0x003b, B:20:0x005e, B:10:0x0012), top: B:25:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[Catch: all -> 0x0010, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000c, B:11:0x001f, B:12:0x0021, B:14:0x0025, B:15:0x002d, B:19:0x0057, B:18:0x003b, B:20:0x005e, B:10:0x0012), top: B:25:0x0001, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void OooO0o0() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.cmaster.cloner.va r0 = r6.OooO     // Catch: java.lang.Throwable -> L10
            r1 = 0
            r0.OooO00o(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.Thread r0 = r6.OooO0oo     // Catch: java.lang.Throwable -> L10
            r1 = 0
            if (r0 == 0) goto L21
            r0.join()     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            goto L1f
        L10:
            r0 = move-exception
            goto L65
        L12:
            java.lang.String r0 = com.cmaster.cloner.xa.OooOOO0     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "yHqZxENZ/mfha53aVRDgcq58kNtDGOo152aMzFQL+2X6bZyJSReuZ+tknchVHKA=\n"
            java.lang.String r3 = "jgj4qSZ5jhU=\n"
            java.lang.String r2 = com.cmaster.cloner.sn2.OooO00o(r2, r3)     // Catch: java.lang.Throwable -> L10
            android.util.Log.d(r0, r2)     // Catch: java.lang.Throwable -> L10
        L1f:
            r6.OooO0oo = r1     // Catch: java.lang.Throwable -> L10
        L21:
            android.hardware.Camera r0 = r6.OooO0O0     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L5e
            r0.stopPreview()     // Catch: java.lang.Throwable -> L10
            android.hardware.Camera r0 = r6.OooO0O0     // Catch: java.lang.Throwable -> L10
            r0.setPreviewCallbackWithBuffer(r1)     // Catch: java.lang.Throwable -> L10
            android.hardware.Camera r0 = r6.OooO0O0     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L3a
            r0.setPreviewTexture(r1)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L3a
            r6.OooO0o = r1     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L3a
            android.hardware.Camera r0 = r6.OooO0O0     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L3a
            r0.setPreviewDisplay(r1)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L3a
            goto L57
        L3a:
            r0 = move-exception
            java.lang.String r2 = com.cmaster.cloner.xa.OooOOO0     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = "1QiMfyqa2q/8SYZ/Kp+I+/AIiHY9n9qr4QyTeiqJwPs=\n"
            java.lang.String r5 = "k2nlE0/++ts=\n"
            java.lang.String r4 = com.cmaster.cloner.sn2.OooO00o(r4, r5)     // Catch: java.lang.Throwable -> L10
            r3.append(r4)     // Catch: java.lang.Throwable -> L10
            r3.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L10
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L10
        L57:
            android.hardware.Camera r0 = r6.OooO0O0     // Catch: java.lang.Throwable -> L10
            r0.release()     // Catch: java.lang.Throwable -> L10
            r6.OooO0O0 = r1     // Catch: java.lang.Throwable -> L10
        L5e:
            java.util.IdentityHashMap r0 = r6.OooOO0o     // Catch: java.lang.Throwable -> L10
            r0.clear()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r6)
            return
        L65:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.xa.OooO0o0():void");
    }
}
