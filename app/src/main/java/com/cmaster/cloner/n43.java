package com.cmaster.cloner;

import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class n43 {
    public static void OooO00o(TextView textView, String str) {
        CharSequence text = textView.getText();
        if (str != text) {
            if (str == null && text.length() == 0) {
                return;
            }
            if (!(str instanceof Spanned)) {
                if ((str == null) == (text == null)) {
                    if (str == null) {
                        return;
                    }
                    int length = str.length();
                    if (length == text.length()) {
                        for (int i = 0; i < length; i++) {
                            if (str.charAt(i) == text.charAt(i)) {
                            }
                        }
                        return;
                    }
                }
            } else if (str.equals(text)) {
                return;
            }
            textView.setText(str);
        }
    }

    public static void OooO0O0(TextView textView, nj0 nj0Var) {
        TextWatcher fwVar = nj0Var == null ? null : new fw(nj0Var, 2);
        int i = tn0.OooO00o;
        Object tag = textView.getTag(R.id.textWatcher);
        textView.setTag(R.id.textWatcher, fwVar);
        TextWatcher textWatcher = (TextWatcher) tag;
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (fwVar != null) {
            textView.addTextChangedListener(fwVar);
        }
    }
}
