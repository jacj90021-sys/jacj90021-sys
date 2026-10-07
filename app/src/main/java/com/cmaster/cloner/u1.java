package com.cmaster.cloner;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u1 extends rt1 {
    public static final SparseIntArray OooOo;
    public final TextView OooOOo;
    public final FrameLayout OooOOo0;
    public final ImageView OooOOoo;
    public wu1 OooOo0;
    public final TextView OooOo00;
    public final TextView OooOo0O;
    public long OooOo0o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        OooOo = sparseIntArray;
        sparseIntArray.put(R.id.container, 4);
        sparseIntArray.put(R.id.icon, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(View view) {
        super(view, 5);
        Object[] objArr = new Object[6];
        rt1.OooO0oO(view, objArr, OooOo, true);
        FrameLayout frameLayout = (FrameLayout) objArr[4];
        TextView textView = (TextView) objArr[3];
        ImageView imageView = (ImageView) objArr[5];
        TextView textView2 = (TextView) objArr[2];
        this.OooOOo0 = frameLayout;
        this.OooOOo = textView;
        this.OooOOoo = imageView;
        this.OooOo00 = textView2;
        this.OooOo0o = -1L;
        textView.setTag(null);
        ((RelativeLayout) objArr[0]).setTag(null);
        TextView textView3 = (TextView) objArr[1];
        this.OooOo0O = textView3;
        textView3.setTag(null);
        textView2.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.OooOo0o = 32L;
        }
        OooO();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    @Override // com.cmaster.cloner.rt1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0Oo() {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.u1.OooO0Oo():void");
    }

    @Override // com.cmaster.cloner.rt1
    public final boolean OooO0o0() {
        synchronized (this) {
            try {
                return this.OooOo0o != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.rt1
    public final boolean OooO0oo(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.OooOo0o |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.OooOo0o |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.OooOo0o |= 4;
            }
            return true;
        }
        if (i == 3) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.OooOo0o |= 8;
            }
            return true;
        }
        if (i != 4) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.OooOo0o |= 16;
        }
        return true;
    }
}
