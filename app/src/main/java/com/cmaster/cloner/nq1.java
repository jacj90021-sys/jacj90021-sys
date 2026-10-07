package com.cmaster.cloner;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nq1 {
    public static final ThreadLocal OooO0Oo = new ThreadLocal();
    public final int OooO00o;
    public final ho1 OooO0O0;
    public volatile int OooO0OO = 0;

    public nq1(ho1 ho1Var, int i) {
        this.OooO0O0 = ho1Var;
        this.OooO00o = i;
    }

    public final int OooO00o(int i) {
        pt0 pt0VarOooO0O0 = OooO0O0();
        int iOooO00o = pt0VarOooO0O0.OooO00o(16);
        if (iOooO00o == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) pt0VarOooO0O0.OooO0oO;
        int i2 = iOooO00o + pt0VarOooO0O0.OooO0Oo;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final pt0 OooO0O0() {
        ThreadLocal threadLocal = OooO0Oo;
        pt0 pt0Var = (pt0) threadLocal.get();
        if (pt0Var == null) {
            pt0Var = new pt0();
            threadLocal.set(pt0Var);
        }
        qt0 qt0Var = (qt0) this.OooO0O0.OooO0o0;
        int iOooO00o = qt0Var.OooO00o(6);
        if (iOooO00o != 0) {
            int i = iOooO00o + qt0Var.OooO0Oo;
            int i2 = (this.OooO00o * 4) + ((ByteBuffer) qt0Var.OooO0oO).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) qt0Var.OooO0oO).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) qt0Var.OooO0oO;
            pt0Var.OooO0oO = byteBuffer;
            if (byteBuffer != null) {
                pt0Var.OooO0Oo = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                pt0Var.OooO0o0 = i4;
                pt0Var.OooO0o = ((ByteBuffer) pt0Var.OooO0oO).getShort(i4);
                return pt0Var;
            }
            pt0Var.OooO0Oo = 0;
            pt0Var.OooO0o0 = 0;
            pt0Var.OooO0o = 0;
        }
        return pt0Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        pt0 pt0VarOooO0O0 = OooO0O0();
        int iOooO00o = pt0VarOooO0O0.OooO00o(4);
        sb.append(Integer.toHexString(iOooO00o != 0 ? ((ByteBuffer) pt0VarOooO0O0.OooO0oO).getInt(iOooO00o + pt0VarOooO0O0.OooO0Oo) : 0));
        sb.append(", codepoints:");
        pt0 pt0VarOooO0O02 = OooO0O0();
        int iOooO00o2 = pt0VarOooO0O02.OooO00o(16);
        if (iOooO00o2 != 0) {
            int i2 = iOooO00o2 + pt0VarOooO0O02.OooO0Oo;
            i = ((ByteBuffer) pt0VarOooO0O02.OooO0oO).getInt(((ByteBuffer) pt0VarOooO0O02.OooO0oO).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(OooO00o(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
