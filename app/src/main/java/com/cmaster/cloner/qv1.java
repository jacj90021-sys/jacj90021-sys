package com.cmaster.cloner;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.matrix.ui.qrcode.GraphicOverlay;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class qv1 {
    public static final String OooOOoo;
    public long OooO;
    public final ActivityManager OooO00o;
    public final Timer OooO0O0;
    public final ud1 OooO0OO;
    public final im1 OooO0Oo;
    public int OooO0o;
    public boolean OooO0o0;
    public long OooO0oO;
    public long OooO0oo;
    public long OooOO0;
    public long OooOO0O;
    public long OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public ByteBuffer OooOOOO;
    public du OooOOOo;
    public du OooOOo;
    public ByteBuffer OooOOo0;

    static {
        sn2.OooO00o("SHMfpb9rhhp2SB2Cqg==\n", "BBx48d4MwHU=\n");
        OooOOoo = sn2.OooO00o("JBxWzuswsQkdFkDU9zGTORMGQA==\n", "cnUlp4Re4Xs=\n");
    }

    public qv1(Activity activity) {
        Timer timer = new Timer();
        this.OooO0O0 = timer;
        this.OooO0o = 0;
        this.OooO0oO = 0L;
        this.OooO0oo = 0L;
        this.OooO = Long.MAX_VALUE;
        this.OooOO0 = 0L;
        this.OooOO0O = 0L;
        this.OooOO0o = Long.MAX_VALUE;
        this.OooOOO0 = 0;
        this.OooOOO = 0;
        this.OooO00o = (ActivityManager) activity.getSystemService(sn2.OooO00o("fye0zCqSHss=\n", "HkTApVz7arI=\n"));
        this.OooO0OO = new ud1(am1.OooO00o);
        timer.scheduleAtFixedRate(new pv1(this), 0L, 1000L);
        this.OooO0Oo = new im1(activity);
    }

    public abstract ac3 OooO00o(ug0 ug0Var);

    public final void OooO0O0(ByteBuffer byteBuffer, du duVar, final GraphicOverlay graphicOverlay) throws IOException {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Context context = graphicOverlay.getContext();
        String str = p41.OooO00o;
        Bitmap bitmap = null;
        if (!PreferenceManager.getDefaultSharedPreferences(context).getBoolean(context.getString(R.string.pref_key_camera_live_viewport), false)) {
            int i = n8.OooO00o;
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit();
            byte[] bArr = new byte[iLimit];
            byteBuffer.get(bArr, 0, iLimit);
            try {
                YuvImage yuvImage = new YuvImage(bArr, 17, duVar.OooO00o, duVar.OooO0O0, null);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                yuvImage.compressToJpeg(new Rect(0, 0, duVar.OooO00o, duVar.OooO0O0), 80, byteArrayOutputStream);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                byteArrayOutputStream.close();
                int i2 = duVar.OooO0OO;
                Matrix matrix = new Matrix();
                matrix.postRotate(i2);
                matrix.postScale(1.0f, 1.0f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                if (bitmapCreateBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmap = bitmapCreateBitmap;
            } catch (Exception e) {
                Log.e(sn2.OooO00o("uSCktQ3SPAOAKrKvEdMeM446sg==\n", "70nX3GK8bHE=\n"), sn2.OooO00o("TNP9lPyETQ==\n", "CaGP+46+beU=\n") + e.getMessage());
            }
        }
        final Bitmap bitmap2 = bitmap;
        graphicOverlay.getContext();
        int i3 = duVar.OooO00o;
        int i4 = duVar.OooO0O0;
        int i5 = duVar.OooO0OO;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        ug0 ug0Var = new ug0(byteBuffer, i3, i4, i5);
        ug0.OooO0O0(17, 3, jElapsedRealtime2, i4, i3, byteBuffer.limit(), i5);
        ac3 ac3VarOooO00o = OooO00o(ug0Var);
        final long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        jz0 jz0Var = new jz0() { // from class: com.cmaster.cloner.ov1
            @Override // com.cmaster.cloner.jz0
            public final void OooO0O0(Object obj) {
                long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime4 - jElapsedRealtime;
                long j2 = jElapsedRealtime4 - jElapsedRealtime3;
                qv1 qv1Var = this.OooO0Oo;
                if (qv1Var.OooO0o >= 500) {
                    qv1Var.OooO0o = 0;
                    qv1Var.OooO0oO = 0L;
                    qv1Var.OooO0oo = 0L;
                    qv1Var.OooO = Long.MAX_VALUE;
                    qv1Var.OooOO0 = 0L;
                    qv1Var.OooOO0O = 0L;
                    qv1Var.OooOO0o = Long.MAX_VALUE;
                }
                qv1Var.OooO0o++;
                qv1Var.OooOOO0++;
                qv1Var.OooO0oO += j;
                qv1Var.OooO0oo = Math.max(j, qv1Var.OooO0oo);
                qv1Var.OooO = Math.min(j, qv1Var.OooO);
                qv1Var.OooOO0 += j2;
                qv1Var.OooOO0O = Math.max(j2, qv1Var.OooOO0O);
                qv1Var.OooOO0o = Math.min(j2, qv1Var.OooOO0o);
                if (qv1Var.OooOOO0 == 1) {
                    String str2 = qv1.OooOOoo;
                    Log.d(str2, sn2.OooO00o("10CGweimKjLsW5jbpw==\n", "mTXr4YfACmA=\n") + qv1Var.OooO0o);
                    Log.d(str2, sn2.OooO00o("NTMuzOt9bxMHJCHC92cjHxI5cg==\n", "c0FPoY5dA3I=\n") + qv1Var.OooO0oo + sn2.OooO00o("xIQc2mFG\n", "6KRxsw97aUU=\n") + qv1Var.OooO + sn2.OooO00o("ygl/eOnq\n", "5ikeDo7X6Jw=\n") + (qv1Var.OooO0oO / qv1Var.OooO0o));
                    Log.d(str2, sn2.OooO00o("jr51JqTZWP3qt2A3osNU9vD7bCK/kA==\n", "ytsBQ8etN48=\n") + qv1Var.OooOO0O + sn2.OooO00o("lI5STS5r\n", "uK4/JEBWNNg=\n") + qv1Var.OooOO0o + sn2.OooO00o("Lj+mRgek\n", "Ah/HMGCZQW0=\n") + (qv1Var.OooOO0 / ((long) qv1Var.OooO0o)));
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    qv1Var.OooO00o.getMemoryInfo(memoryInfo);
                    Log.d(str2, sn2.OooO00o("lJdpCaIXiruvk20KsQzGv/mbakajF9muvJ8+Rg==\n", "2fIEZtBuqto=\n") + (memoryInfo.availMem / 1048576) + sn2.OooO00o("u5MV\n", "m95XiPl6kd0=\n"));
                    for (Map.Entry entry : qv1Var.OooO0Oo.OooO00o.entrySet()) {
                        Float f = (Float) entry.getValue();
                        float fFloatValue = f.floatValue();
                        if (fFloatValue >= 0.0f) {
                            Log.i(im1.OooO0OO, String.format(Locale.US, sn2.OooO00o("6ZPOMmRJLN2P6dEVcAFb\n", "zOD0O0FnHbs=\n"), entry.getKey(), f, Float.valueOf((fFloatValue * 1.8f) + 32.0f)));
                        }
                    }
                }
                GraphicOverlay graphicOverlay2 = graphicOverlay;
                graphicOverlay2.OooO0O0();
                Bitmap bitmap3 = bitmap2;
                if (bitmap3 != null) {
                    graphicOverlay2.OooO00o(new ta(graphicOverlay2, bitmap3));
                }
                List list = (List) obj;
                Activity activity = ((b6) qv1Var).OooOo0;
                list.isEmpty();
                for (int i6 = 0; i6 < list.size(); i6++) {
                    x5 x5Var = (x5) list.get(i6);
                    graphicOverlay2.OooO00o(new y5(graphicOverlay2, x5Var));
                    b6.OooO0Oo(x5Var);
                    c6 c6Var = x5Var.OooO00o;
                    if (!TextUtils.isEmpty(c6Var.OooO0o0())) {
                        v5.OooO0O0(activity, c6Var.OooO0o0());
                        String strOooO0o0 = c6Var.OooO0o0();
                        v5.OooO0Oo(activity, strOooO0o0);
                        v5.OooO0OO().OooO00o(new s5(x5Var.OooO00o(), System.currentTimeMillis(), strOooO0o0));
                    }
                }
                Context context2 = graphicOverlay2.getContext();
                String str3 = p41.OooO00o;
                if (!PreferenceManager.getDefaultSharedPreferences(context2).getBoolean(context2.getString(R.string.pref_key_info_hide), true)) {
                    graphicOverlay2.OooO00o(new kg0(graphicOverlay2, j, j2, Integer.valueOf(qv1Var.OooOOO)));
                }
                graphicOverlay2.postInvalidate();
            }
        };
        ud1 ud1Var = this.OooO0OO;
        ac3VarOooO00o.OooO0O0(ud1Var, jz0Var);
        ac3VarOooO00o.OooO00o(ud1Var, new pg0(this, graphicOverlay));
        ac3VarOooO00o.OooO0O0(ud1Var, new o00OOOO0(this, graphicOverlay));
    }

    public final synchronized void OooO0OO(GraphicOverlay graphicOverlay) {
        ByteBuffer byteBuffer = this.OooOOOO;
        this.OooOOo0 = byteBuffer;
        du duVar = this.OooOOOo;
        this.OooOOo = duVar;
        this.OooOOOO = null;
        this.OooOOOo = null;
        if (byteBuffer != null && duVar != null && !this.OooO0o0) {
            OooO0O0(byteBuffer, duVar, graphicOverlay);
        }
    }
}
