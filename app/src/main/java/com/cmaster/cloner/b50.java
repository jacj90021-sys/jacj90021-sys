package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b50 implements sl1 {
    public final long OooO;
    public final int OooO0Oo;
    public m91 OooO0o;
    public final int OooO0o0;
    public final Handler OooO0oO;
    public final int OooO0oo;
    public Bitmap OooOO0;

    public b50(Handler handler, int i, long j) {
        if (!pr1.OooO(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            ra.OooOOO("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.OooO0Oo = Integer.MIN_VALUE;
        this.OooO0o0 = Integer.MIN_VALUE;
        this.OooO0oO = handler;
        this.OooO0oo = i;
        this.OooO = j;
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO() {
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO00o(m91 m91Var) {
        this.OooO0o = m91Var;
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0O0(Object obj) {
        this.OooOO0 = (Bitmap) obj;
        Handler handler = this.OooO0oO;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.OooO);
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0OO(kh1 kh1Var) {
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0Oo(Drawable drawable) {
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0o(Drawable drawable) {
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO0o0() {
    }

    @Override // com.cmaster.cloner.sl1
    public final m91 OooO0oO() {
        return this.OooO0o;
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0oo(Drawable drawable) {
        this.OooOO0 = null;
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooOO0(kh1 kh1Var) throws Throwable {
        kh1Var.OooOOO0(this.OooO0Oo, this.OooO0o0);
    }

    @Override // com.cmaster.cloner.fm0
    public final void onDestroy() {
    }
}
