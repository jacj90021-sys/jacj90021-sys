package com.cmaster.cloner;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* renamed from: com.cmaster.cloner.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006r {
    public final TextView OooO00o;
    public final xb1 OooO0O0;

    public C0006r(TextView textView) {
        this.OooO00o = textView;
        this.OooO0O0 = new xb1(textView);
    }

    public final InputFilter[] OooO00o(InputFilter[] inputFilterArr) {
        return ((zq2) this.OooO0O0.OooO0o0).OooO00o(inputFilterArr);
    }

    public final void OooO0O0(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.OooO00o.getContext().obtainStyledAttributes(attributeSet, l61.OooO, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            OooO0Oo(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void OooO0OO(boolean z) {
        ((zq2) this.OooO0O0.OooO0o0).OooO0OO(z);
    }

    public final void OooO0Oo(boolean z) {
        ((zq2) this.OooO0O0.OooO0o0).OooO0Oo(z);
    }
}
