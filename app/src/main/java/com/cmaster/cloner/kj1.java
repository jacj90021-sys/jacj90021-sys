package com.cmaster.cloner;

import java.io.Closeable;
import java.io.FileInputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kj1 implements Closeable {
    public final FileInputStream OooO0Oo;
    public byte[] OooO0o;
    public final Charset OooO0o0;
    public int OooO0oO;
    public int OooO0oo;

    public kj1(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(rr1.OooO00o)) {
            ra.OooOOO("Unsupported encoding");
            throw null;
        }
        this.OooO0Oo = fileInputStream;
        this.OooO0o0 = charset;
        this.OooO0o = new byte[8192];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String OooO0OO() {
        /*
            r8 = this;
            java.io.FileInputStream r0 = r8.OooO0Oo
            monitor-enter(r0)
            byte[] r1 = r8.OooO0o     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto La4
            int r2 = r8.OooO0oO     // Catch: java.lang.Throwable -> L3e
            int r3 = r8.OooO0oo     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            r5 = -1
            if (r2 < r3) goto L23
            java.io.FileInputStream r2 = r8.OooO0Oo     // Catch: java.lang.Throwable -> L3e
            int r3 = r1.length     // Catch: java.lang.Throwable -> L3e
            int r1 = r2.read(r1, r4, r3)     // Catch: java.lang.Throwable -> L3e
            if (r1 == r5) goto L1d
            r8.OooO0oO = r4     // Catch: java.lang.Throwable -> L3e
            r8.OooO0oo = r1     // Catch: java.lang.Throwable -> L3e
            goto L23
        L1d:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> L3e
            r8.<init>()     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        L23:
            int r1 = r8.OooO0oO     // Catch: java.lang.Throwable -> L3e
        L25:
            int r2 = r8.OooO0oo     // Catch: java.lang.Throwable -> L3e
            r3 = 10
            if (r1 == r2) goto L56
            byte[] r2 = r8.OooO0o     // Catch: java.lang.Throwable -> L3e
            r6 = r2[r1]     // Catch: java.lang.Throwable -> L3e
            if (r6 != r3) goto L53
            int r3 = r8.OooO0oO     // Catch: java.lang.Throwable -> L3e
            if (r1 == r3) goto L40
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L3e
            r6 = 13
            if (r5 != r6) goto L40
            goto L41
        L3e:
            r8 = move-exception
            goto Lac
        L40:
            r4 = r1
        L41:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L3e
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r8.OooO0o0     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L3e
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L3e
            int r1 = r1 + 1
            r8.OooO0oO = r1     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return r5
        L53:
            int r1 = r1 + 1
            goto L25
        L56:
            com.cmaster.cloner.jj1 r1 = new com.cmaster.cloner.jj1     // Catch: java.lang.Throwable -> L3e
            int r2 = r8.OooO0oo     // Catch: java.lang.Throwable -> L3e
            int r6 = r8.OooO0oO     // Catch: java.lang.Throwable -> L3e
            int r2 = r2 - r6
            int r2 = r2 + 80
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L3e
        L62:
            byte[] r2 = r8.OooO0o     // Catch: java.lang.Throwable -> L3e
            int r6 = r8.OooO0oO     // Catch: java.lang.Throwable -> L3e
            int r7 = r8.OooO0oo     // Catch: java.lang.Throwable -> L3e
            int r7 = r7 - r6
            r1.write(r2, r6, r7)     // Catch: java.lang.Throwable -> L3e
            r8.OooO0oo = r5     // Catch: java.lang.Throwable -> L3e
            java.io.FileInputStream r2 = r8.OooO0Oo     // Catch: java.lang.Throwable -> L3e
            byte[] r6 = r8.OooO0o     // Catch: java.lang.Throwable -> L3e
            int r7 = r6.length     // Catch: java.lang.Throwable -> L3e
            int r2 = r2.read(r6, r4, r7)     // Catch: java.lang.Throwable -> L3e
            if (r2 == r5) goto L9e
            r8.OooO0oO = r4     // Catch: java.lang.Throwable -> L3e
            r8.OooO0oo = r2     // Catch: java.lang.Throwable -> L3e
            r2 = r4
        L7e:
            int r6 = r8.OooO0oo     // Catch: java.lang.Throwable -> L3e
            if (r2 == r6) goto L62
            byte[] r6 = r8.OooO0o     // Catch: java.lang.Throwable -> L3e
            r7 = r6[r2]     // Catch: java.lang.Throwable -> L3e
            if (r7 != r3) goto L9b
            int r3 = r8.OooO0oO     // Catch: java.lang.Throwable -> L3e
            if (r2 == r3) goto L91
            int r4 = r2 - r3
            r1.write(r6, r3, r4)     // Catch: java.lang.Throwable -> L3e
        L91:
            int r2 = r2 + 1
            r8.OooO0oO = r2     // Catch: java.lang.Throwable -> L3e
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return r8
        L9b:
            int r2 = r2 + 1
            goto L7e
        L9e:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> L3e
            r8.<init>()     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        La4:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "LineReader is closed"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.kj1.OooO0OO():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.OooO0Oo) {
            try {
                if (this.OooO0o != null) {
                    this.OooO0o = null;
                    this.OooO0Oo.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
