package com.cmaster.cloner;

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zu implements InputFilter {
    public final TextView OooO00o;
    public yu OooO0O0;

    public zu(TextView textView) {
        this.OooO00o = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.OooO00o
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            com.cmaster.cloner.su r1 = com.cmaster.cloner.su.OooO00o()
            int r1 = r1.OooO0O0()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            com.cmaster.cloner.su r3 = com.cmaster.cloner.su.OooO00o()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.OooO0o0(r4, r6, r5)
            return r3
        L48:
            return r4
        L49:
            com.cmaster.cloner.su r5 = com.cmaster.cloner.su.OooO00o()
            com.cmaster.cloner.yu r6 = r3.OooO0O0
            if (r6 != 0) goto L58
            com.cmaster.cloner.yu r6 = new com.cmaster.cloner.yu
            r6.<init>(r0, r3)
            r3.OooO0O0 = r6
        L58:
            com.cmaster.cloner.yu r3 = r3.OooO0O0
            r5.OooO0o(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.zu.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
