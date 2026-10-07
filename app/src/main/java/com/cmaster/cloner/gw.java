package com.cmaster.cloner;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gw {
    public final /* synthetic */ iw OooO00o;

    public gw(iw iwVar) {
        this.OooO00o = iwVar;
    }

    public final void OooO00o(TextInputLayout textInputLayout) {
        iw iwVar = this.OooO00o;
        fw fwVar = iwVar.OooOoO0;
        if (iwVar.OooOo0O == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = iwVar.OooOo0O;
        if (editText != null) {
            editText.removeTextChangedListener(fwVar);
            if (iwVar.OooOo0O.getOnFocusChangeListener() == iwVar.OooO00o().OooO0o0()) {
                iwVar.OooOo0O.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        iwVar.OooOo0O = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(fwVar);
        }
        iwVar.OooO00o().OooOO0o(iwVar.OooOo0O);
        iwVar.OooO(iwVar.OooO00o());
    }
}
