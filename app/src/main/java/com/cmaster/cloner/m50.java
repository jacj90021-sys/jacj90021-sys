package com.cmaster.cloner;

import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m50 implements Appendable {
    public final Appendable OooO0Oo;
    public boolean OooO0o0 = true;

    public m50(Appendable appendable) {
        this.OooO0Oo = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.OooO0o0;
        Appendable appendable = this.OooO0Oo;
        boolean z2 = false;
        if (z) {
            this.OooO0o0 = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.OooO0o0 = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        boolean z = this.OooO0o0;
        Appendable appendable = this.OooO0Oo;
        if (z) {
            this.OooO0o0 = false;
            appendable.append("  ");
        }
        this.OooO0o0 = c == '\n';
        appendable.append(c);
        return this;
    }
}
