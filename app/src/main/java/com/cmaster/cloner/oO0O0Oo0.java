package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO0O0Oo0 implements fa1 {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o0;

    public oO0O0Oo0(byte[] bArr) {
        this.OooO0Oo = 1;
        zx2.OooO0OO(bArr, "Argument must not be null");
        this.OooO0o0 = bArr;
    }

    private final void OooO00o() {
    }

    private final void OooO0OO() {
    }

    private final void OooO0o() {
    }

    @Override // com.cmaster.cloner.fa1
    public final void OooO0O0() {
        switch (this.OooO0Oo) {
            case 0:
                ((AnimatedImageDrawable) this.OooO0o0).stop();
                ((AnimatedImageDrawable) this.OooO0o0).clearAnimationCallbacks();
                break;
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final int OooO0Oo() {
        switch (this.OooO0Oo) {
            case 0:
                return pr1.OooO0Oo(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.OooO0o0).getIntrinsicHeight() * ((AnimatedImageDrawable) this.OooO0o0).getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.OooO0o0).length;
            case 2:
                return 1;
            default:
                return pr1.OooO0OO((Bitmap) this.OooO0o0);
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final Class OooO0o0() {
        switch (this.OooO0Oo) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.OooO0o0).getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // com.cmaster.cloner.fa1
    public final Object get() {
        switch (this.OooO0Oo) {
            case 0:
                return (AnimatedImageDrawable) this.OooO0o0;
            case 1:
                return (byte[]) this.OooO0o0;
            case 2:
                return (File) this.OooO0o0;
            default:
                return (Bitmap) this.OooO0o0;
        }
    }

    public /* synthetic */ oO0O0Oo0(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    public oO0O0Oo0(File file) {
        this.OooO0Oo = 2;
        zx2.OooO0OO(file, "Argument must not be null");
        this.OooO0o0 = file;
    }
}
