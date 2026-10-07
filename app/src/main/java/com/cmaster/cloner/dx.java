package com.cmaster.cloner;

import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class dx extends RuntimeException {
    public final StringBuffer OooO0Oo;

    public dx(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (!(exc instanceof dx)) {
            this.OooO0Oo = new StringBuffer(200);
            return;
        }
        String string = ((dx) exc).OooO0Oo.toString();
        StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
        this.OooO0Oo = stringBuffer;
        stringBuffer.append(string);
    }

    public static dx OooO0O0(String str, Exception exc) {
        dx dxVar = exc instanceof dx ? (dx) exc : new dx(null, exc);
        dxVar.OooO00o(str);
        return dxVar;
    }

    public final void OooO00o(String str) {
        StringBuffer stringBuffer = this.OooO0Oo;
        stringBuffer.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        stringBuffer.append('\n');
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.OooO0Oo);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.OooO0Oo);
    }
}
