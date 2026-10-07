package com.cmaster.cloner;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n50 extends Exception {
    public static final StackTraceElement[] OooO = new StackTraceElement[0];
    public final List OooO0Oo;
    public int OooO0o;
    public zk0 OooO0o0;
    public Class OooO0oO;
    public final String OooO0oo;

    public n50(String str, List list) {
        this.OooO0oo = str;
        setStackTrace(OooO);
        this.OooO0Oo = list;
    }

    public static void OooO00o(Throwable th, ArrayList arrayList) {
        if (!(th instanceof n50)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((n50) th).OooO0Oo.iterator();
        while (it.hasNext()) {
            OooO00o((Throwable) it.next(), arrayList);
        }
    }

    public static void OooO0O0(List list, m50 m50Var) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            m50Var.append("Cause (");
            int i2 = i + 1;
            m50Var.append(String.valueOf(i2));
            m50Var.append(" of ");
            m50Var.append(String.valueOf(size));
            m50Var.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof n50) {
                ((n50) th).OooO0o0(m50Var);
            } else {
                OooO0OO(th, m50Var);
            }
            i = i2;
        }
    }

    public static void OooO0OO(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            sa.OooOO0(th);
        }
    }

    public final void OooO0Oo() {
        ArrayList arrayList = new ArrayList();
        OooO00o(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    public final void OooO0o0(Appendable appendable) throws IOException {
        OooO0OO(this, appendable);
        try {
            OooO0O0(this.OooO0Oo, new m50(appendable));
        } catch (IOException e) {
            sa.OooOO0(e);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.OooO0oo);
        String str2 = "";
        if (this.OooO0oO != null) {
            str = ", " + this.OooO0oO;
        } else {
            str = "";
        }
        sb.append(str);
        int i = this.OooO0o;
        sb.append(i != 0 ? ", ".concat(rj.OooOo00(i)) : "");
        if (this.OooO0o0 != null) {
            str2 = ", " + this.OooO0o0;
        }
        sb.append(str2);
        ArrayList arrayList = new ArrayList();
        OooO00o(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Throwable th = (Throwable) obj;
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        OooO0o0(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        OooO0o0(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        OooO0o0(printWriter);
    }

    public n50(String str) {
        this(str, Collections.EMPTY_LIST);
    }
}
