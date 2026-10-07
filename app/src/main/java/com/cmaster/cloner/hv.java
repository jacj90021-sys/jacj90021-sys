package com.cmaster.cloner;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hv implements TextWatcher {
    public final EditText OooO0Oo;
    public boolean OooO0o = true;
    public gv OooO0o0;

    public hv(EditText editText) {
        this.OooO0Oo = editText;
    }

    public static void OooO00o(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            su suVarOooO00o = su.OooO00o();
            if (editableText == null) {
                length = 0;
            } else {
                suVarOooO00o.getClass();
                length = editableText.length();
            }
            suVarOooO00o.OooO0o0(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.OooO0Oo;
        if (editText.isInEditMode() || !this.OooO0o || su.OooOO0O == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iOooO0O0 = su.OooO00o().OooO0O0();
        if (iOooO0O0 != 0) {
            if (iOooO0O0 == 1) {
                su.OooO00o().OooO0o0((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iOooO0O0 != 3) {
                return;
            }
        }
        su suVarOooO00o = su.OooO00o();
        if (this.OooO0o0 == null) {
            this.OooO0o0 = new gv(editText);
        }
        suVarOooO00o.OooO0o(this.OooO0o0);
    }
}
