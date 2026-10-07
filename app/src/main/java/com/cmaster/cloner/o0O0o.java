package com.cmaster.cloner;

import android.text.TextUtils;
import com.bumptech.matrix.ui.qrcode.ActivityBarCodePreview;
import com.bumptech.matrix.ui.qrcode.GraphicOverlay;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0O0o implements jz0 {
    public final /* synthetic */ ActivityBarCodePreview OooO0Oo;

    public /* synthetic */ o0O0o(ActivityBarCodePreview activityBarCodePreview) {
        this.OooO0Oo = activityBarCodePreview;
    }

    @Override // com.cmaster.cloner.jz0
    public void OooO0O0(Object obj) {
        List list = (List) obj;
        String str = ActivityBarCodePreview.Oooo0OO;
        for (int i = 0; i < list.size(); i++) {
            x5 x5Var = (x5) list.get(i);
            ActivityBarCodePreview activityBarCodePreview = this.OooO0Oo;
            GraphicOverlay graphicOverlay = activityBarCodePreview.Oooo00o;
            graphicOverlay.OooO00o(new y5(graphicOverlay, x5Var));
            b6.OooO0Oo(x5Var);
            c6 c6Var = x5Var.OooO00o;
            if (!TextUtils.isEmpty(c6Var.OooO0o0())) {
                v5.OooO0O0(activityBarCodePreview, c6Var.OooO0o0());
                String strOooO0o0 = c6Var.OooO0o0();
                v5.OooO0Oo(activityBarCodePreview, strOooO0o0);
                v5.OooO0OO().OooO00o(new s5(x5Var.OooO00o(), System.currentTimeMillis(), strOooO0o0));
            }
        }
    }
}
