package com.cmaster.cloner;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class w92 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ k42 OooO0o0;

    public /* synthetic */ w92(k42 k42Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = k42Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        String strConcat;
        int i = this.OooO0Oo;
        k42 k42Var = this.OooO0o0;
        switch (i) {
            case 0:
                k42Var.getClass();
                ((Executor) k42Var.OooO0oO).execute(new w92(k42Var, 1));
                break;
            default:
                JSONObject jSONObject = new JSONObject();
                Application application = (Application) k42Var.OooO0Oo;
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    if (applicationIcon == null) {
                        strConcat = null;
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", strConcat);
                    JSONObject jSONObject2 = new JSONObject();
                    s52 s52Var = (s52) k42Var.OooOO0O;
                    for (String str : s52Var.OooO00o().keySet()) {
                        jSONObject2.put(str, s52Var.OooO00o().get(str));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                } catch (JSONException unused) {
                }
                ((q72) k42Var.OooOO0).OooO0oO.OooO00o("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}
