package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o9 {
    public final /* synthetic */ int OooO00o;

    public final int OooO00o(Object obj) {
        switch (this.OooO00o) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int OooO0O0() {
        switch (this.OooO00o) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String OooO0OO() {
        switch (this.OooO00o) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
