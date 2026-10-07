package com.cmaster.cloner;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fv extends zq2 {
    public final ev OooO00o;

    public fv(TextView textView) {
        this.OooO00o = new ev(textView);
    }

    @Override // com.cmaster.cloner.zq2
    public final InputFilter[] OooO00o(InputFilter[] inputFilterArr) {
        return !(su.OooOO0O != null) ? inputFilterArr : this.OooO00o.OooO00o(inputFilterArr);
    }

    @Override // com.cmaster.cloner.zq2
    public final boolean OooO0O0() {
        return this.OooO00o.OooO0OO;
    }

    @Override // com.cmaster.cloner.zq2
    public final void OooO0OO(boolean z) {
        if (su.OooOO0O != null) {
            this.OooO00o.OooO0OO(z);
        }
    }

    @Override // com.cmaster.cloner.zq2
    public final void OooO0Oo(boolean z) {
        boolean z2 = su.OooOO0O != null;
        ev evVar = this.OooO00o;
        if (z2) {
            evVar.OooO0Oo(z);
        } else {
            evVar.OooO0OO = z;
        }
    }

    @Override // com.cmaster.cloner.zq2
    public final TransformationMethod OooO0o0(TransformationMethod transformationMethod) {
        return !(su.OooOO0O != null) ? transformationMethod : this.OooO00o.OooO0o0(transformationMethod);
    }
}
