package com.cmaster.cloner;

import java.io.FilterWriter;
import java.io.StringWriter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dg0 extends FilterWriter {
    public int OooO;
    public final String OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public int OooO0oO;
    public boolean OooO0oo;

    public dg0(StringWriter stringWriter, int i, String str) {
        super(stringWriter);
        if (i < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{-27, -64, 119, 93, 95, 93, -79, -91, -94}, new byte[]{-110, -87, 19, 41, 55, 125, -115, -123}));
            throw null;
        }
        this.OooO0o0 = i != 0 ? i : Integer.MAX_VALUE;
        int i2 = i >> 1;
        this.OooO0o = i2;
        this.OooO0Oo = str.length() == 0 ? null : str;
        this.OooO0oO = 0;
        this.OooO0oo = i2 != 0;
        this.OooO = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) {
        int i2;
        synchronized (((FilterWriter) this).lock) {
            try {
                boolean z = true;
                if (this.OooO0oo) {
                    if (i == 32) {
                        int i3 = this.OooO + 1;
                        this.OooO = i3;
                        int i4 = this.OooO0o;
                        if (i3 >= i4) {
                            this.OooO = i4;
                            this.OooO0oo = false;
                        }
                    } else {
                        this.OooO0oo = false;
                    }
                }
                if (this.OooO0oO == this.OooO0o0 && i != 10) {
                    ((FilterWriter) this).out.write(10);
                    this.OooO0oO = 0;
                }
                if (this.OooO0oO == 0) {
                    String str = this.OooO0Oo;
                    if (str != null) {
                        ((FilterWriter) this).out.write(str);
                    }
                    if (!this.OooO0oo) {
                        int i5 = 0;
                        while (true) {
                            i2 = this.OooO;
                            if (i5 >= i2) {
                                break;
                            }
                            ((FilterWriter) this).out.write(32);
                            i5++;
                        }
                        this.OooO0oO = i2;
                    }
                }
                ((FilterWriter) this).out.write(i);
                if (i == 10) {
                    this.OooO0oO = 0;
                    if (this.OooO0o == 0) {
                        z = false;
                    }
                    this.OooO0oo = z;
                    this.OooO = 0;
                } else {
                    this.OooO0oO++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                try {
                    write(cArr[i]);
                    i++;
                    i2--;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                try {
                    write(str.charAt(i));
                    i++;
                    i2--;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
