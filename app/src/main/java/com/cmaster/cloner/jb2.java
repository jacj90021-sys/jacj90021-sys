package com.cmaster.cloner;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jb2 extends e72 {
    public final /* synthetic */ int OooO00o = 0;
    public final Object OooO0O0;

    public jb2(Context context) {
        this.OooO0O0 = context;
    }

    @Override // com.cmaster.cloner.e72
    public final void zza() {
        BitmapDrawable bitmapDrawable;
        boolean zOooO0O0 = false;
        switch (this.OooO00o) {
            case 0:
                try {
                    zOooO0O0 = oO00O0oO.OooO0O0((Context) this.OooO0O0);
                } catch (m60 | IOException | IllegalStateException e) {
                    int i = uh2.OooO0O0;
                    uh2.OooO0oo("Fail to get isAdIdFakeForDebugLogging", e);
                }
                synchronized (fx2.OooO0O0) {
                    fx2.OooO0OO = true;
                    fx2.OooO0Oo = zOooO0O0;
                }
                int i2 = uh2.OooO0O0;
                uh2.OooOO0("Update ad debug logging enablement as " + zOooO0O0);
                return;
            default:
                lz2 lz2Var = (lz2) this.OooO0O0;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) ya3.OooOooO.OooOo.OooO0o0).get(Integer.valueOf(lz2Var.OooO0o0.OooOOo.OooO));
                if (bitmap != null) {
                    kx2 kx2Var = lz2Var.OooO0o0.OooOOo;
                    boolean z = kx2Var.OooO0oO;
                    float f = kx2Var.OooO0oo;
                    Activity activity = lz2Var.OooO0Oo;
                    if (!z || f <= 0.0f || f > 25.0f) {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    } else {
                        try {
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                            RenderScript renderScriptCreate = RenderScript.create(activity);
                            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                            scriptIntrinsicBlurCreate.setRadius(f);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                        } catch (RuntimeException unused) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        }
                    }
                    a73.OooOO0o.post(new bf1(this, bitmapDrawable, 24, zOooO0O0));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jb2(lz2 lz2Var) {
        this.OooO0O0 = lz2Var;
    }
}
