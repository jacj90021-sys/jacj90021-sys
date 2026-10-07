package com.cmaster.cloner;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oz extends Thread {
    public static final String OooO0oo = u7.OooO00o(new byte[]{-123, 72, -36, -2, -117, 23, 17, 4, -92, 68}, new byte[]{-61, 33, -80, -101, -55, 101, 120, 96});
    public FileDescriptor OooO0Oo;
    public final FileDescriptor OooO0o;
    public final FileDescriptor OooO0o0;
    public volatile boolean OooO0oO;

    public oz() throws ErrnoException {
        FileDescriptor fileDescriptor = new FileDescriptor();
        this.OooO0o0 = fileDescriptor;
        FileDescriptor fileDescriptor2 = new FileDescriptor();
        this.OooO0o = fileDescriptor2;
        try {
            Os.socketpair(OsConstants.AF_UNIX, OsConstants.SOCK_STREAM, 0, fileDescriptor, fileDescriptor2);
        } catch (ErrnoException unused) {
            ra.OooOOO0(u7.OooO00o(new byte[]{-34, 97, -5, -76, 67, 1, -72, 71, -9, 32, -15, -86, 67, 4, -20, 86, -72, 98, -32, -79, 66, 2, -3}, new byte[]{-104, 0, -110, -40, 38, 101, -104, 51}));
            throw null;
        }
    }

    public static int OooO0O0(int i, byte[] bArr) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    public final void OooO00o() throws ErrnoException {
        try {
            Os.close(this.OooO0Oo);
        } catch (ErrnoException | IOException unused) {
        }
        try {
            Os.close(this.OooO0o0);
        } catch (ErrnoException | IOException unused2) {
        }
        try {
            Os.close(this.OooO0o);
        } catch (ErrnoException | IOException unused3) {
        }
        this.OooO0oO = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws ErrnoException {
        int i;
        int i2;
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    try {
                        FileDescriptor fileDescriptor = this.OooO0o0;
                        fn2.OooO0oO(8192, 8);
                        try {
                            i = Os.read(fileDescriptor, bArr, 0, 8);
                            if (i == 0) {
                                i = -1;
                            }
                        } catch (ErrnoException e) {
                            if (e.errno != OsConstants.EAGAIN) {
                                throw e.rethrowAsIOException();
                            }
                            i = 0;
                        }
                        if (i != 8) {
                            break;
                        }
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        int iOooO0O0 = OooO0O0(0, bArr);
                        if (iOooO0O0 == 1) {
                            int iOooO0O02 = OooO0O0(4, bArr);
                            while (iOooO0O02 > 0) {
                                FileDescriptor fileDescriptor2 = this.OooO0o0;
                                int iMin = Math.min(8192, iOooO0O02);
                                fn2.OooO0oO(8192, iMin);
                                if (iMin == 0) {
                                    i2 = 0;
                                } else {
                                    try {
                                        i2 = Os.read(fileDescriptor2, bArr, 0, iMin);
                                        if (i2 == 0) {
                                            i2 = -1;
                                        }
                                    } catch (ErrnoException e2) {
                                        if (e2.errno != OsConstants.EAGAIN) {
                                            throw e2.rethrowAsIOException();
                                        }
                                    }
                                }
                                if (i2 == -1) {
                                    throw new IOException(u7.OooO00o(new byte[]{13, 34, 101, 14, 26, 124, -85, 8, 61, 40, 32, 51, 37, 95, -13, 92, 43, 56, 105, 26, 6, 57, -83, 4, 40, 41, 99, 2, 15, 125, -24}, new byte[]{88, 76, 0, 118, 106, 25, -56, 124}) + iOooO0O02 + u7.OooO00o(new byte[]{-25, -85, -82, 80, -96, 83}, new byte[]{-57, -55, -41, 36, -59, 32, -38, 39}));
                                }
                                iu2.OooO00o(this.OooO0Oo, bArr, i2);
                                iOooO0O02 -= i2;
                            }
                        } else if (iOooO0O0 == 2) {
                            Os.fsync(this.OooO0Oo);
                            iu2.OooO00o(this.OooO0o0, bArr, 8);
                        } else if (iOooO0O0 == 3) {
                            Os.fsync(this.OooO0Oo);
                            Os.close(this.OooO0Oo);
                            this.OooO0oO = true;
                            iu2.OooO00o(this.OooO0o0, bArr, 8);
                            break;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        Log.wtf(OooO0oo, u7.OooO00o(new byte[]{-106, -102, -41, 60, -99, 75, -31, -56, -91, -119, -41, 62, -97, 15, -93, -34, -71, -97, -39, 53}, new byte[]{-48, -5, -66, 80, -8, 47, -63, -84}), e);
                        OooO00o();
                        return;
                    }
                } catch (Throwable th) {
                    OooO00o();
                    throw th;
                }
            } catch (ErrnoException e4) {
                e = e4;
                Log.wtf(OooO0oo, u7.OooO00o(new byte[]{-106, -102, -41, 60, -99, 75, -31, -56, -91, -119, -41, 62, -97, 15, -93, -34, -71, -97, -39, 53}, new byte[]{-48, -5, -66, 80, -8, 47, -63, -84}), e);
                OooO00o();
                return;
            }
        }
        OooO00o();
    }
}
