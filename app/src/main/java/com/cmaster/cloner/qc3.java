package com.cmaster.cloner;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qc3 implements ht0, ju0, ts, iy, jy, ie, wl, ng0, bz0 {
    public static final qc3 OooO0o = new qc3(1);
    public static qc3 OooO0o0;
    public final /* synthetic */ int OooO0Oo;

    public /* synthetic */ qc3(int i) {
        this.OooO0Oo = i;
    }

    public static synchronized void OooO00o() {
        if (OooO0o0 == null) {
            OooO0o0 = new qc3(0);
        }
    }

    @Override // com.cmaster.cloner.ht0
    public void OooO0OO(ss0 ss0Var, boolean z) {
    }

    @Override // com.cmaster.cloner.ts
    public void OooO0Oo() {
    }

    @Override // com.cmaster.cloner.ts
    public void OooO0o0(Bitmap bitmap, k8 k8Var) {
    }

    @Override // com.cmaster.cloner.jy
    public Object OooO0oO() {
        return new zo0();
    }

    @Override // com.cmaster.cloner.ie
    public long OooO0oo() {
        return System.currentTimeMillis();
    }

    @Override // com.cmaster.cloner.ht0
    public boolean OooOOOO(ss0 ss0Var) {
        return false;
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        int i = 0;
        switch (this.OooO0Oo) {
            case 3:
                return new s9(new d83(3), i);
            case 12:
                return new nj1(ho1Var.OooOO0O(Uri.class, AssetFileDescriptor.class), 0);
            default:
                return new hr1(ho1Var.OooOO0O(s50.class, InputStream.class));
        }
    }

    @Override // com.cmaster.cloner.q51
    public Object get() {
        return new yc1(Executors.newSingleThreadExecutor(), 0);
    }

    @Override // com.cmaster.cloner.bz0
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }
}
