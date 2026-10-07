package com.cmaster.cloner;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j2 extends i2 {
    public static final SparseIntArray OooOoo0;
    public final ay1 OooOoO;
    public final TextInputEditText OooOoO0;
    public long OooOoOO;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        OooOoo0 = sparseIntArray;
        sparseIntArray.put(R.id.negative, 2);
        sparseIntArray.put(R.id.reset, 3);
        sparseIntArray.put(R.id.icon, 4);
        sparseIntArray.put(R.id.system, 5);
        sparseIntArray.put(R.id.photo, 6);
        sparseIntArray.put(R.id.input, 7);
        sparseIntArray.put(R.id.positive, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j2(View view) {
        Object[] objArr = new Object[9];
        rt1.OooO0oO(view, objArr, OooOoo0, true);
        ImageView imageView = (ImageView) objArr[4];
        super(view, imageView, (TextView) objArr[2], (TextView) objArr[6], (Button) objArr[8], (TextView) objArr[3], (TextView) objArr[5]);
        this.OooOoO = new ay1(this, 8);
        this.OooOoOO = -1L;
        ((LinearLayout) objArr[0]).setTag(null);
        TextInputEditText textInputEditText = (TextInputEditText) objArr[1];
        this.OooOoO0 = textInputEditText;
        textInputEditText.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.OooOoOO = 2L;
        }
        OooO();
    }

    @Override // com.cmaster.cloner.rt1
    public final void OooO0Oo() {
        long j;
        synchronized (this) {
            j = this.OooOoOO;
            this.OooOoOO = 0L;
        }
        gy0 gy0Var = this.OooOo0o;
        long j2 = 3 & j;
        String str = (j2 == 0 || gy0Var == null) ? null : (String) gy0Var.OooO0o0;
        if (j2 != 0) {
            n43.OooO00o(this.OooOoO0, str);
        }
        if ((j & 2) != 0) {
            n43.OooO0O0(this.OooOoO0, this.OooOoO);
        }
    }

    @Override // com.cmaster.cloner.rt1
    public final boolean OooO0o0() {
        synchronized (this) {
            try {
                return this.OooOoOO != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.rt1
    public final boolean OooO0oo(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.OooOoOO |= 1;
        }
        return true;
    }
}
