package com.cmaster.cloner;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yu extends qu {
    public final WeakReference OooO00o;
    public final WeakReference OooO0O0;

    public yu(TextView textView, zu zuVar) {
        this.OooO00o = new WeakReference(textView);
        this.OooO0O0 = new WeakReference(zuVar);
    }

    @Override // com.cmaster.cloner.qu
    public final void OooO0O0() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.OooO00o.get();
        InputFilter inputFilter = (InputFilter) this.OooO0O0.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    su suVarOooO00o = su.OooO00o();
                    if (text == null) {
                        length = 0;
                    } else {
                        suVarOooO00o.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceOooO0o0 = suVarOooO00o.OooO0o0(text, 0, length);
                    if (text == charSequenceOooO0o0) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceOooO0o0);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceOooO0o0);
                    textView.setText(charSequenceOooO0o0);
                    if (charSequenceOooO0o0 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceOooO0o0;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
