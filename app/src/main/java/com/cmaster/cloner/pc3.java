package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class pc3 {
    public static n03 OooO00o;

    public static synchronized ic3 OooO00o(String str) {
        ic3 ic3Var;
        byte b = (byte) (((byte) (0 | 1)) | 2);
        if (b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" enableFirelog");
            }
            if ((b & 2) == 0) {
                sb.append(" firelogEventType");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        cc3 cc3Var = new cc3(str, 1);
        synchronized (pc3.class) {
            try {
                if (OooO00o == null) {
                    OooO00o = new n03(2);
                }
                ic3Var = (ic3) OooO00o.OooO0o0(cc3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ic3Var;
        return ic3Var;
    }
}
