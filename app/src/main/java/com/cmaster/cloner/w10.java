package com.cmaster.cloner;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w10 extends t10 {
    public static final SparseIntArray Oooo0oo;
    public final AutoCompleteTextView OooOoO;
    public final TextInputLayout OooOoOO;
    public final TextInputLayout OooOoo;
    public final AutoCompleteTextView OooOoo0;
    public final TextInputLayout OooOooO;
    public final AutoCompleteTextView OooOooo;
    public final u10 Oooo0;
    public final TextInputLayout Oooo000;
    public final AutoCompleteTextView Oooo00O;
    public final TextInputLayout Oooo00o;
    public final v10 Oooo0O0;
    public final ay1 Oooo0OO;
    public final v10 Oooo0o;
    public final u10 Oooo0o0;
    public long Oooo0oO;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Oooo0oo = sparseIntArray;
        sparseIntArray.put(R.id.action_restore, 13);
        sparseIntArray.put(R.id.action_random, 14);
        sparseIntArray.put(R.id.fingerprint, 15);
        sparseIntArray.put(R.id.propertiesMenu, 16);
        sparseIntArray.put(R.id.action_reset, 17);
        sparseIntArray.put(R.id.properties, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w10(View view) {
        Object[] objArr = new Object[19];
        rt1.OooO0oO(view, objArr, Oooo0oo, true);
        Button button = (Button) objArr[14];
        Button button2 = (Button) objArr[17];
        Button button3 = (Button) objArr[13];
        Button button4 = (Button) objArr[1];
        SwitchCompat switchCompat = (SwitchCompat) objArr[2];
        LinearLayout linearLayout = (LinearLayout) objArr[15];
        super(view, button, button2, button3, button4, switchCompat, linearLayout, (MaterialAutoCompleteTextView) objArr[4]);
        this.Oooo0 = new u10(this, 0);
        this.Oooo0O0 = new v10(this, 0);
        this.Oooo0OO = new ay1(this, 20);
        this.Oooo0o0 = new u10(this, 1);
        this.Oooo0o = new v10(this, 1);
        this.Oooo0oO = -1L;
        this.OooOo00.setTag(null);
        this.OooOo0.setTag(null);
        ((ScrollView) objArr[0]).setTag(null);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) objArr[10];
        this.OooOoO = autoCompleteTextView;
        autoCompleteTextView.setTag(null);
        TextInputLayout textInputLayout = (TextInputLayout) objArr[11];
        this.OooOoOO = textInputLayout;
        textInputLayout.setTag(null);
        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) objArr[12];
        this.OooOoo0 = autoCompleteTextView2;
        autoCompleteTextView2.setTag(null);
        TextInputLayout textInputLayout2 = (TextInputLayout) objArr[3];
        this.OooOoo = textInputLayout2;
        textInputLayout2.setTag(null);
        TextInputLayout textInputLayout3 = (TextInputLayout) objArr[5];
        this.OooOooO = textInputLayout3;
        textInputLayout3.setTag(null);
        AutoCompleteTextView autoCompleteTextView3 = (AutoCompleteTextView) objArr[6];
        this.OooOooo = autoCompleteTextView3;
        autoCompleteTextView3.setTag(null);
        TextInputLayout textInputLayout4 = (TextInputLayout) objArr[7];
        this.Oooo000 = textInputLayout4;
        textInputLayout4.setTag(null);
        AutoCompleteTextView autoCompleteTextView4 = (AutoCompleteTextView) objArr[8];
        this.Oooo00O = autoCompleteTextView4;
        autoCompleteTextView4.setTag(null);
        TextInputLayout textInputLayout5 = (TextInputLayout) objArr[9];
        this.Oooo00o = textInputLayout5;
        textInputLayout5.setTag(null);
        this.OooOo0o.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.Oooo0oO = 256L;
        }
        OooO();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    @Override // com.cmaster.cloner.rt1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0Oo() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.w10.OooO0Oo():void");
    }

    @Override // com.cmaster.cloner.rt1
    public final boolean OooO0o0() {
        synchronized (this) {
            try {
                return this.Oooo0oO != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.rt1
    public final boolean OooO0oo(int i, int i2, Object obj) {
        switch (i) {
            case 0:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Oooo0oO |= 1;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Oooo0oO |= 2;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Oooo0oO |= 4;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Oooo0oO |= 8;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Oooo0oO |= 16;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Oooo0oO |= 32;
                }
                return true;
            case 6:
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.Oooo0oO |= 64;
                }
                return true;
            default:
                return false;
        }
    }
}
