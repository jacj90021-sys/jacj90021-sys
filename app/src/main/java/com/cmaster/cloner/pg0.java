package com.cmaster.cloner;

import android.content.ClipData;
import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.Toast;
import com.bumptech.matrix.ui.qrcode.GraphicOverlay;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class pg0 implements zf1, bz0 {
    public final /* synthetic */ Object OooO0Oo;

    public /* synthetic */ pg0(qv1 qv1Var, GraphicOverlay graphicOverlay) {
        this.OooO0Oo = graphicOverlay;
    }

    public boolean OooO00o(ay1 ay1Var, int i, Bundle bundle) {
        oi xb1Var;
        q qVar = (q) this.OooO0Oo;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((tg0) ay1Var.OooO0o0).OooO0o0();
                Parcelable parcelable = (Parcelable) ((tg0) ay1Var.OooO0o0).OooOO0();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        tg0 tg0Var = (tg0) ay1Var.OooO0o0;
        ClipData clipData = new ClipData(tg0Var.getDescription(), new ClipData.Item(tg0Var.OooO0OO()));
        if (i2 >= 31) {
            xb1Var = new xb1(clipData, 2);
        } else {
            pi piVar = new pi();
            piVar.OooO0o0 = clipData;
            piVar.OooO0o = 2;
            xb1Var = piVar;
        }
        xb1Var.OooOOO(tg0Var.OooO0o());
        xb1Var.setExtras(bundle);
        return nt1.OooO(qVar, xb1Var.build()) == null;
    }

    @Override // com.cmaster.cloner.zf1
    public qj OooOOOo(qj qjVar) {
        RectF rectF = (RectF) this.OooO0Oo;
        return qjVar instanceof z81 ? (z81) qjVar : new z81(qjVar.OooO00o(rectF) / Math.min(rectF.width(), rectF.height()));
    }

    @Override // com.cmaster.cloner.bz0
    public void onFailure(Exception exc) {
        GraphicOverlay graphicOverlay = (GraphicOverlay) this.OooO0Oo;
        graphicOverlay.OooO0O0();
        graphicOverlay.postInvalidate();
        String str = sn2.OooO00o("/FtXXJWCf23VGk5Cn4U6askUHnWClDBrgBo=\n", "ujo+MPDmXxk=\n") + exc.getLocalizedMessage();
        Context context = graphicOverlay.getContext();
        StringBuilder sbOooOO0 = rj.OooOO0(str);
        sbOooOO0.append(sn2.OooO00o("/sOTIW7l+/c=\n", "9IDyVB2Awdc=\n"));
        sbOooOO0.append(exc.getCause());
        Toast.makeText(context, sbOooOO0.toString(), 0).show();
        Log.d(qv1.OooOOoo, str);
        exc.printStackTrace();
        Log.e(b6.OooOo0O, sn2.OooO00o("NPP8nQE93MoS9/qbDS3QhRiy6J8HNdyOVg==\n", "dpKO/m5Zueo=\n") + exc);
    }

    public /* synthetic */ pg0(Object obj) {
        this.OooO0Oo = obj;
    }
}
