package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class es extends wl1 {
    public int OooO0o;

    public es(int i) {
        super(0L, fm1.OooO0oO);
        this.OooO0o = i;
    }

    public final void OooO(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            fr2.OooO00o(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        th.getClass();
        qp2.OooO00o(OooO0o().getContext(), new jk("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract void OooO0O0(Object obj, CancellationException cancellationException);

    public abstract gj OooO0o();

    public Throwable OooO0oO(Object obj) {
        rf rfVar = obj instanceof rf ? (rf) obj : null;
        if (rfVar != null) {
            return rfVar.OooO00o;
        }
        return null;
    }

    public Object OooO0oo(Object obj) {
        return obj;
    }

    public abstract Object OooOO0o();

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r13 = this;
            com.cmaster.cloner.vq1 r0 = com.cmaster.cloner.vq1.OooO00o
            com.cmaster.cloner.ep0 r1 = r13.OooO0o0
            com.cmaster.cloner.gj r2 = r13.OooO0o()     // Catch: java.lang.Throwable -> L24
            r2.getClass()     // Catch: java.lang.Throwable -> L24
            com.cmaster.cloner.cs r2 = (com.cmaster.cloner.cs) r2     // Catch: java.lang.Throwable -> L24
            com.cmaster.cloner.ij r3 = r2.OooO0oo     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.OooOO0     // Catch: java.lang.Throwable -> L24
            com.cmaster.cloner.vj r4 = r3.OooO0o0     // Catch: java.lang.Throwable -> L24
            r4.getClass()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = com.cmaster.cloner.w82.OooO0O0(r4, r2)     // Catch: java.lang.Throwable -> L24
            com.cmaster.cloner.uk1 r5 = com.cmaster.cloner.w82.OooO00o     // Catch: java.lang.Throwable -> L24
            r6 = 0
            if (r2 == r5) goto L27
            com.cmaster.cloner.qq1 r5 = com.cmaster.cloner.mp2.OooO0O0(r3, r4, r2)     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r2 = move-exception
            goto La3
        L27:
            r5 = r6
        L28:
            com.cmaster.cloner.vj r7 = r3.OooO0o0     // Catch: java.lang.Throwable -> L4c
            r7.getClass()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r8 = r13.OooOO0o()     // Catch: java.lang.Throwable -> L4c
            java.lang.Throwable r9 = r13.OooO0oO(r8)     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L4e
            int r10 = r13.OooO0o     // Catch: java.lang.Throwable -> L4c
            r11 = 1
            if (r10 == r11) goto L41
            r12 = 2
            if (r10 != r12) goto L40
            goto L41
        L40:
            r11 = 0
        L41:
            if (r11 == 0) goto L4e
            com.cmaster.cloner.gu0 r10 = com.cmaster.cloner.gu0.OooO0o0     // Catch: java.lang.Throwable -> L4c
            com.cmaster.cloner.tj r7 = r7.OooO0oo(r10)     // Catch: java.lang.Throwable -> L4c
            com.cmaster.cloner.nk0 r7 = (com.cmaster.cloner.nk0) r7     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r3 = move-exception
            goto L97
        L4e:
            r7 = r6
        L4f:
            if (r7 == 0) goto L67
            boolean r10 = r7.Oooo00O()     // Catch: java.lang.Throwable -> L4c
            if (r10 != 0) goto L67
            java.util.concurrent.CancellationException r7 = r7.OooOo0O()     // Catch: java.lang.Throwable -> L4c
            r13.OooO0O0(r8, r7)     // Catch: java.lang.Throwable -> L4c
            com.cmaster.cloner.bb1 r8 = new com.cmaster.cloner.bb1     // Catch: java.lang.Throwable -> L4c
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L4c
            r3.OooO0Oo(r8)     // Catch: java.lang.Throwable -> L4c
            goto L79
        L67:
            if (r9 == 0) goto L72
            com.cmaster.cloner.bb1 r7 = new com.cmaster.cloner.bb1     // Catch: java.lang.Throwable -> L4c
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L4c
            r3.OooO0Oo(r7)     // Catch: java.lang.Throwable -> L4c
            goto L79
        L72:
            java.lang.Object r7 = r13.OooO0oo(r8)     // Catch: java.lang.Throwable -> L4c
            r3.OooO0Oo(r7)     // Catch: java.lang.Throwable -> L4c
        L79:
            if (r5 == 0) goto L81
            boolean r3 = r5.OoooO()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L84
        L81:
            com.cmaster.cloner.w82.OooO00o(r4, r2)     // Catch: java.lang.Throwable -> L24
        L84:
            r1.getClass()     // Catch: java.lang.Throwable -> L88
            goto L8f
        L88:
            r0 = move-exception
            com.cmaster.cloner.bb1 r1 = new com.cmaster.cloner.bb1
            r1.<init>(r0)
            r0 = r1
        L8f:
            java.lang.Throwable r0 = com.cmaster.cloner.cb1.OooO00o(r0)
            r13.OooO(r6, r0)
            goto Lb5
        L97:
            if (r5 == 0) goto L9f
            boolean r5 = r5.OoooO()     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto La2
        L9f:
            com.cmaster.cloner.w82.OooO00o(r4, r2)     // Catch: java.lang.Throwable -> L24
        La2:
            throw r3     // Catch: java.lang.Throwable -> L24
        La3:
            r1.getClass()     // Catch: java.lang.Throwable -> La7
            goto Lae
        La7:
            r0 = move-exception
            com.cmaster.cloner.bb1 r1 = new com.cmaster.cloner.bb1
            r1.<init>(r0)
            r0 = r1
        Lae:
            java.lang.Throwable r0 = com.cmaster.cloner.cb1.OooO00o(r0)
            r13.OooO(r2, r0)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.es.run():void");
    }
}
