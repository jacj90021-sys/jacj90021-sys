package com.cmaster.cloner;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mm1 implements TextWatcher {
    public int OooO0Oo;
    public final /* synthetic */ TextInputLayout OooO0o;
    public final /* synthetic */ EditText OooO0o0;

    public mm1(TextInputLayout textInputLayout, EditText editText) {
        this.OooO0o = textInputLayout;
        this.OooO0o0 = editText;
        this.OooO0Oo = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
        TextInputLayout textInputLayout = this.OooO0o;
        textInputLayout.OooOo0o(!textInputLayout.o0O0O00, false);
        if (textInputLayout.OooOOOO) {
            textInputLayout.OooOOOo(editable);
        }
        if (textInputLayout.OooOo0o) {
            textInputLayout.OooOo(editable);
        }
        EditText editText = this.OooO0o0;
        int lineCount = editText.getLineCount();
        int i = this.OooO0Oo;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.o0ooOO0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.OooO0Oo = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
