package com.cmaster.cloner;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jj1 extends ByteArrayOutputStream {
    public final /* synthetic */ kj1 OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj1(kj1 kj1Var, int i) {
        super(i);
        this.OooO0Oo = kj1Var;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.OooO0Oo.OooO0o0.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
