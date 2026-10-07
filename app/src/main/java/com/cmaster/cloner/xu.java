package com.cmaster.cloner;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xu extends InputConnectionWrapper {
    public final TextView OooO00o;
    public final iu OooO0O0;

    public xu(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        iu iuVar = new iu(6);
        super(inputConnection, false);
        this.OooO00o = textView;
        this.OooO0O0 = iuVar;
        if (su.OooOO0O != null) {
            su suVarOooO00o = su.OooO00o();
            if (suVarOooO00o.OooO0O0() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            ou ouVar = suVarOooO00o.OooO0o0;
            ouVar.getClass();
            Bundle bundle = editorInfo.extras;
            qt0 qt0Var = (qt0) ouVar.OooO0OO.OooO0o0;
            int iOooO00o = qt0Var.OooO00o(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iOooO00o != 0 ? ((ByteBuffer) qt0Var.OooO0oO).getInt(iOooO00o + qt0Var.OooO0Oo) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.OooO00o.getEditableText();
        this.OooO0O0.getClass();
        return iu.OooO0OO(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.OooO00o.getEditableText();
        this.OooO0O0.getClass();
        return iu.OooO0OO(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
