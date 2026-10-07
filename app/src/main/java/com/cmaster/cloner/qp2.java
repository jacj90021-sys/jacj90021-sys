package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class qp2 {
    public static final void OooO00o(vj vjVar, Throwable th) {
        try {
            oO0O00O oo0o00o = (oO0O00O) vjVar.OooO0oo(je.OooO0o0);
            if (oo0o00o != null) {
                oo0o00o.OooOOOO(th);
            } else {
                op2.OooO00o(vjVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                fr2.OooO00o(runtimeException, th);
                th = runtimeException;
            }
            op2.OooO00o(vjVar, th);
        }
    }
}
