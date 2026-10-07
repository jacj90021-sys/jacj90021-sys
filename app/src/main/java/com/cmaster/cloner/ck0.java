package com.cmaster.cloner;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ck0 extends CancellationException {
    public final transient nk0 OooO0Oo;

    public ck0(String str, Throwable th, nk0 nk0Var) {
        super(str);
        this.OooO0Oo = nk0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ck0)) {
            return false;
        }
        ck0 ck0Var = (ck0) obj;
        return ij0.OooO00o(ck0Var.getMessage(), getMessage()) && ij0.OooO00o(ck0Var.OooO0Oo, this.OooO0Oo) && ij0.OooO00o(ck0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (this.OooO0Oo.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.OooO0Oo;
    }
}
