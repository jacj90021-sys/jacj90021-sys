package com.cmaster.cloner;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ih implements mc1, kv0 {
    public final mc1 OooO0Oo;
    public vj OooO0o;
    public final kv0 OooO0o0;
    public Throwable OooO0oO;

    public ih(mc1 mc1Var) {
        ov0 ov0Var = new ov0();
        mc1Var.getClass();
        this.OooO0Oo = mc1Var;
        this.OooO0o0 = ov0Var;
    }

    @Override // com.cmaster.cloner.kv0
    public final Object OooO0OO(ij ijVar) {
        return this.OooO0o0.OooO0OO(ijVar);
    }

    public final void OooO0o(StringBuilder sb) {
        Iterable iterableOooO0O0;
        if (this.OooO0o == null && this.OooO0oO == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        vj vjVar = this.OooO0o;
        if (vjVar != null) {
            sb.append("\t\tCoroutine: " + vjVar);
            sb.append('\n');
        }
        Throwable th = this.OooO0oO;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            string.getClass();
            List listOooO0o = uj1.OooO0o(string);
            int size = listOooO0o.size() - 1;
            if (size <= 0) {
                iterableOooO0O0 = nv.OooO0Oo;
            } else if (size != 1) {
                ArrayList arrayList = new ArrayList(size);
                if (listOooO0o instanceof RandomAccess) {
                    int size2 = listOooO0o.size();
                    for (int i = 1; i < size2; i++) {
                        arrayList.add(listOooO0o.get(i));
                    }
                } else {
                    ListIterator listIterator = listOooO0o.listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                iterableOooO0O0 = arrayList;
            } else {
                if (listOooO0o.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                iterableOooO0O0 = te.OooO0O0(listOooO0o.get(listOooO0o.size() - 1));
            }
            Iterator it = iterableOooO0O0.iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    @Override // com.cmaster.cloner.mc1
    public final rc1 OooOOo0(String str) {
        str.getClass();
        return this.OooO0Oo.OooOOo0(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.OooO0Oo.close();
    }

    public final String toString() {
        return this.OooO0Oo.toString();
    }

    @Override // com.cmaster.cloner.kv0
    public final void unlock() {
        this.OooO0o0.unlock();
    }
}
