package com.cmaster.cloner;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class zp1 {
    public static final String[] OooO00o = new String[0];

    public static void OooO00o(Object obj) {
        if (obj == null || OooO0O0(2, obj)) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName().concat(" cannot be cast to kotlin.jvm.functions.Function2"));
        ij0.OooO0Oo(classCastException, zp1.class.getName());
        throw classCastException;
    }

    public static boolean OooO0O0(int i, Object obj) {
        if (obj instanceof k40) {
            if ((obj instanceof l40 ? ((l40) obj).OooO0O0() : obj instanceof p30 ? 0 : obj instanceof a40 ? 1 : obj instanceof e40 ? 2 : obj instanceof nv0 ? 3 : obj instanceof z20 ? 4 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static void OooO0OO(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
