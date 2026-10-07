package com.cmaster.cloner;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ku extends h41 {
    public final o00OOO00 o0OOO0o = new o00OOO00(this, 18);
    public long o0Oo0oo = -1;
    public EditText o0ooOOo;
    public CharSequence o0ooOoO;

    @Override // com.cmaster.cloner.h41, com.cmaster.cloner.er, com.cmaster.cloner.o10
    public final void OooOoO0(Bundle bundle) {
        super.OooOoO0(bundle);
        if (bundle == null) {
            this.o0ooOoO = ((EditTextPreference) OoooOOo()).o000oOoO;
        } else {
            this.o0ooOoO = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // com.cmaster.cloner.h41, com.cmaster.cloner.er, com.cmaster.cloner.o10
    public final void Oooo00o(Bundle bundle) {
        super.Oooo00o(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.o0ooOoO);
    }

    @Override // com.cmaster.cloner.h41
    public final void OoooOo0(View view) {
        super.OoooOo0(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.o0ooOOo = editText;
        if (editText == null) {
            qa.OooO0o("Dialog view must contain an EditText with id @android:id/edit");
            return;
        }
        editText.requestFocus();
        this.o0ooOOo.setText(this.o0ooOoO);
        EditText editText2 = this.o0ooOOo;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) OoooOOo()).getClass();
    }

    @Override // com.cmaster.cloner.h41
    public final void OoooOoO(boolean z) {
        if (z) {
            String string = this.o0ooOOo.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) OoooOOo();
            editTextPreference.getClass();
            editTextPreference.OooOoO(string);
        }
    }

    public final void Ooooo00() {
        long j = this.o0Oo0oo;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.o0ooOOo;
        if (editText == null || !editText.isFocused()) {
            this.o0Oo0oo = -1L;
            return;
        }
        if (((InputMethodManager) this.o0ooOOo.getContext().getSystemService("input_method")).showSoftInput(this.o0ooOOo, 0)) {
            this.o0Oo0oo = -1L;
            return;
        }
        EditText editText2 = this.o0ooOOo;
        o00OOO00 o00ooo00 = this.o0OOO0o;
        editText2.removeCallbacks(o00ooo00);
        this.o0ooOOo.postDelayed(o00ooo00, 50L);
    }
}
