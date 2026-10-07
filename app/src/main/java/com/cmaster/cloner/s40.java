package com.cmaster.cloner;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s40 extends Thread {
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o0;

    public /* synthetic */ s40(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    public static void OooO00o(LocalSocket localSocket) throws IOException {
        byte[] bArr = new byte[1024];
        int i = localSocket.getInputStream().read(bArr);
        if (i > 0 && i >= 2) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.get();
            if (byteBufferWrap.get() != 1) {
                return;
            }
            byteBufferWrap.getInt();
            int i2 = byteBufferWrap.getInt();
            int i3 = byteBufferWrap.getInt();
            int i4 = byteBufferWrap.getInt();
            String strO0O0ooO = pw1.o00O0000().o0O0ooO(i3);
            String strO0O0ooO2 = pw1.o00O0000().o0O0ooO(i4);
            if (!TextUtils.isEmpty(strO0O0ooO) && !TextUtils.isEmpty(strO0O0ooO2) && i21.OooO0Oo(strO0O0ooO2, strO0O0ooO)) {
                i2 = 99992;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(32);
            byteBufferAllocate.order(byteOrder);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(i2);
            try {
                localSocket.getOutputStream().write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        LocalServerSocket localServerSocket;
        int i = 0;
        switch (this.OooO0Oo) {
            case 0:
                String str = (String) this.OooO0o0;
                while (true) {
                    try {
                        localServerSocket = new LocalServerSocket(str);
                    } catch (IOException unused) {
                        i++;
                        if (i >= 3) {
                            localServerSocket = null;
                        }
                    }
                }
                if (localServerSocket == null) {
                    return;
                }
                while (true) {
                    try {
                        LocalSocket localSocketAccept = localServerSocket.accept();
                        if (localSocketAccept != null) {
                            try {
                                OooO00o(localSocketAccept);
                            } catch (Exception unused2) {
                            } catch (Throwable th) {
                                try {
                                    localSocketAccept.close();
                                } catch (IOException unused3) {
                                }
                                throw th;
                            }
                            localSocketAccept.close();
                        }
                    } catch (IOException unused4) {
                    }
                }
            case 1:
                ((jw1) this.OooO0o0).OooO0o.OooOOO.block(0L);
                jw1 jw1Var = (jw1) this.OooO0o0;
                synchronized (jw1Var.OooOO0) {
                    try {
                        jw1Var.OooOO0.clear();
                        ArrayList arrayListO00oOoo = jw1Var.OooO0o.o00oOoo();
                        int size = arrayListO00oOoo.size();
                        while (i < size) {
                            Object obj = arrayListO00oOoo.get(i);
                            i++;
                            jw1Var.o0O0ooO(((Integer) obj).intValue(), null);
                        }
                    } finally {
                    }
                }
                ((jw1) this.OooO0o0).OooOOO.OooO0O0();
                ((jw1) this.OooO0o0).OooO0oO.open();
                return;
            default:
                HashMap map = (HashMap) this.OooO0o0;
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str2 : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str2, (String) map.get(str2));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 65);
                            sb.append("Received non-success response code ");
                            sb.append(responseCode);
                            sb.append(" from pinging URL: ");
                            sb.append(string);
                            Log.w("HttpUrlPinger", sb.toString());
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th2) {
                        httpURLConnection.disconnect();
                        throw th2;
                    }
                } catch (IOException e) {
                    e = e;
                    String message = e.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
                    sb2.append("Error while pinging URL: ");
                    sb2.append(string);
                    sb2.append(". ");
                    sb2.append(message);
                    Log.w("HttpUrlPinger", sb2.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    String message2 = e2.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
                    sb3.append("Error while parsing ping URL: ");
                    sb3.append(string);
                    sb3.append(". ");
                    sb3.append(message2);
                    Log.w("HttpUrlPinger", sb3.toString(), e2);
                    return;
                } catch (RuntimeException e3) {
                    e = e3;
                    String message3 = e.getMessage();
                    StringBuilder sb22 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(string).length() + 27);
                    sb22.append("Error while pinging URL: ");
                    sb22.append(string);
                    sb22.append(". ");
                    sb22.append(message3);
                    Log.w("HttpUrlPinger", sb22.toString(), e);
                    return;
                }
        }
    }

    public /* synthetic */ s40() {
        this.OooO0Oo = 0;
    }
}
