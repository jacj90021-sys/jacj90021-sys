package com.cmaster.cloner;

import android.content.res.AssetFileDescriptor;
import android.graphics.RectF;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.View;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class je implements uj, ju0, jy, e00, oy0, h51, us1, vl, ig, dg2 {
    public final /* synthetic */ int OooO0Oo;
    public static final /* synthetic */ je OooO0o0 = new je(1);
    public static final je OooO0o = new je(2);

    public /* synthetic */ je(int i) {
        this.OooO0Oo = i;
    }

    @Override // com.cmaster.cloner.us1
    public void OooO(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // com.cmaster.cloner.us1
    public void OooO00o(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // com.cmaster.cloner.h51
    public void OooO0O0() {
    }

    @Override // com.cmaster.cloner.e00
    public void OooO0OO(RectF rectF, float f, pa paVar) {
        float fAbs = (Math.abs(paVar.OooO0o0 - paVar.OooO0OO) / 2.0f) * f;
        rectF.left += fAbs;
        rectF.right -= fAbs;
    }

    @Override // com.cmaster.cloner.ig
    public Object OooO0o0(ab1 ab1Var) {
        return new f91(ab1Var.OooO0OO(e91.class));
    }

    @Override // com.cmaster.cloner.jy
    public Object OooO0oO() {
        return new ArrayList();
    }

    @Override // com.cmaster.cloner.h51
    public void OooO0oo(int i, Object obj) {
    }

    @Override // com.cmaster.cloner.e00
    public pa OooOO0(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float fOooO0Oo = dp1.OooO0Oo(f5, f7, f2, f3, f, true);
        float f8 = fOooO0Oo / f5;
        float f9 = fOooO0Oo / f7;
        return new pa(f8, f9, f4 * f8, fOooO0Oo, f6 * f9, fOooO0Oo);
    }

    @Override // com.cmaster.cloner.e00
    public boolean OooOO0o(pa paVar) {
        return paVar.OooO0OO > paVar.OooO0o0;
    }

    @Override // com.cmaster.cloner.oy0
    public qz1 OooOOO(View view, qz1 qz1Var) {
        switch (this.OooO0Oo) {
            case 9:
                zg0 zg0VarOooO0o = qz1Var.OooO00o.OooO0o(1);
                view.setPadding(zg0VarOooO0o.OooO00o, zg0VarOooO0o.OooO0O0, zg0VarOooO0o.OooO0OO, zg0VarOooO0o.OooO0Oo);
                break;
            default:
                zg0 zg0VarOooO0o2 = qz1Var.OooO00o.OooO0o(1);
                view.setPadding(zg0VarOooO0o2.OooO00o, zg0VarOooO0o2.OooO0O0, zg0VarOooO0o2.OooO0OO, zg0VarOooO0o2.OooO0Oo);
                break;
        }
        return qz1Var;
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        int i = 0;
        switch (this.OooO0Oo) {
            case 2:
                return wq1.OooO0O0;
            case 3:
            default:
                return new nj1(ho1Var.OooOO0O(Uri.class, InputStream.class), i);
            case 4:
                return new s9(new oOO0OO(), i);
        }
    }

    @Override // com.cmaster.cloner.lg2
    public Object zza() {
        gd2 gd2Var = kd2.OooO0O0;
        u73.OooO00o(gd2Var);
        return new qh2(gd2Var);
    }
}
