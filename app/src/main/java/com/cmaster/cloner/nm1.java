package com.cmaster.cloner;

import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nm1 extends o0000O00 {
    public final TextInputLayout OooO0Oo;

    public nm1(TextInputLayout textInputLayout) {
        this.OooO0Oo = textInputLayout;
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO0Oo(View view, o000O00O o000o00o) {
        AccessibilityNodeInfo accessibilityNodeInfo = o000o00o.OooO00o;
        this.OooO00o.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.OooO0Oo;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.o0ooOOo;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        qi1 qi1Var = textInputLayout.OooO0o0;
        AppCompatTextView appCompatTextView = qi1Var.OooO0o0;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(qi1Var.OooO0oO);
        }
        if (!zIsEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setText(string);
            if (!z && placeholderText != null) {
                accessibilityNodeInfo.setText(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                accessibilityNodeInfo.setText(string);
            } else if (i >= 26) {
                accessibilityNodeInfo.setHintText(string);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                o000o00o.OooO0o0(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.OooOOO.OooOoO0;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.OooO0o.OooO00o().OooOOO0(o000o00o);
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO0o0(View view, AccessibilityEvent accessibilityEvent) {
        super.OooO0o0(view, accessibilityEvent);
        this.OooO0Oo.OooO0o.OooO00o().OooOOO(accessibilityEvent);
    }
}
