package com.cmaster.cloner;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n21 extends jw {
    public EditText OooO0o;
    public final int OooO0o0;
    public final o0oOOo OooO0oO;

    public n21(iw iwVar, int i) {
        super(iwVar);
        this.OooO0o0 = R.drawable.design_password_eye;
        this.OooO0oO = new o0oOOo(this, 3);
        if (i != 0) {
            this.OooO0o0 = i;
        }
    }

    @Override // com.cmaster.cloner.jw
    public final void OooO0O0() {
        OooOOOo();
    }

    @Override // com.cmaster.cloner.jw
    public final int OooO0OO() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.cmaster.cloner.jw
    public final int OooO0Oo() {
        return this.OooO0o0;
    }

    @Override // com.cmaster.cloner.jw
    public final View.OnClickListener OooO0o() {
        return this.OooO0oO;
    }

    @Override // com.cmaster.cloner.jw
    public final boolean OooOO0() {
        return true;
    }

    @Override // com.cmaster.cloner.jw
    public final boolean OooOO0O() {
        EditText editText = this.OooO0o;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOO0o(EditText editText) {
        this.OooO0o = editText;
        OooOOOo();
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOOo() {
        EditText editText = this.OooO0o;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOOo0() {
        EditText editText = this.OooO0o;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.OooO0o.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }
}
