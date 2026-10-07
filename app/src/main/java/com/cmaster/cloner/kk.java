package com.cmaster.cloner;

import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kk {
    public final Throwable OooO;
    public final int OooO00o;
    public final long OooO0O0;
    public final String OooO0OO;
    public final String OooO0Oo;
    public final String OooO0o;
    public final int OooO0o0;
    public final long OooO0oO;
    public final String OooO0oo;

    public kk(String str, int i, long j, String str2, long j2, String str3, String str4, int i2, Throwable th) {
        this.OooO0OO = str == null ? u7.OooO00o(new byte[]{46, 92, -21, 50}, new byte[]{64, 41, -121, 94, 44, -65, -116, 74}) : str.replace(u7.OooO00o(new byte[]{111}, new byte[]{85, 28, -49, -75, -25, -46, 3, 109}), u7.OooO00o(new byte[]{-26}, new byte[]{-71, 104, -23, 68, -103, -73, -92, -39}));
        this.OooO00o = i;
        this.OooO0O0 = j;
        this.OooO0Oo = str2;
        this.OooO0o0 = i2;
        this.OooO0o = str4 == null ? u7.OooO00o(new byte[]{52, 93, 40, 115}, new byte[]{90, 40, 68, 31, -110, -48, -93, -9}) : str4.replace(u7.OooO00o(new byte[]{60}, new byte[]{6, 76, 123, -3, 54, 59, 70, 110}), u7.OooO00o(new byte[]{-110}, new byte[]{-74, -97, -36, 109, 52, -89, 124, 7}));
        this.OooO0oO = j2;
        this.OooO0oo = str3;
        this.OooO = th;
    }

    public static void OooO0O0(Parcel parcel, Throwable th, String str, int i) {
        if (i <= 0) {
            return;
        }
        parcel.writeInt(1);
        String message = th.getMessage();
        if (message != null && message.length() > 5000) {
            message = message.substring(0, 5000);
        }
        if (str == null) {
            str = message;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int iMin = Math.min(stackTrace.length, i);
        parcel.writeString(str);
        parcel.writeInt(iMin + 1);
        String name = th.getClass().getName();
        String strOooO00o = u7.OooO00o(new byte[]{6, 123, -96, 110, -113}, new byte[]{99, 9, -46, 1, -3, 26, 49, -84});
        String strOooO00o2 = u7.OooO00o(new byte[]{14, -126, -85, 6}, new byte[]{71, -20, -62, 114, 96, 65, -65, -29});
        parcel.writeString(name);
        parcel.writeString(strOooO00o);
        parcel.writeString(strOooO00o2);
        parcel.writeInt(1);
        for (int i2 = 0; i2 < iMin; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            int lineNumber = stackTraceElement.getLineNumber();
            parcel.writeString(className);
            parcel.writeString(methodName);
            parcel.writeString(fileName);
            parcel.writeInt(lineNumber);
        }
        int i3 = i - iMin;
        if (th.getCause() == null || i3 <= 0) {
            parcel.writeInt(0);
        } else {
            OooO0O0(parcel, th.getCause(), null, i3);
        }
    }

    public final byte[] OooO00o() {
        Throwable th = this.OooO;
        Parcel parcelObtain = Parcel.obtain();
        try {
            OooO0O0(parcelObtain, th, "" + th.getMessage() + u7.OooO00o(new byte[]{-62, -41, 113, 48, 84}, new byte[]{-30, -74, 1, 64, 105, -16, 98, -92}) + this.OooO0Oo + u7.OooO00o(new byte[]{96, 72, 21, 10, -104, -59, -23, 105, 125}, new byte[]{64, 56, 103, 101, -5, -96, -102, 26}) + this.OooO0o + u7.OooO00o(new byte[]{-44, 90, -93, -66, 58}, new byte[]{-12, 44, -58, -52, 7, -3, 29, 86}) + this.OooO0oo + u7.OooO00o(new byte[]{6}, new byte[]{46, 95, -61, 7, 120, -18, 71, -69}) + this.OooO0oO + u7.OooO00o(new byte[]{8, -33, -80, -48, -55, -96, -50, -35}, new byte[]{33, -43, -61, -72, -84, -52, -94, -32}) + this.OooO0OO + u7.OooO00o(new byte[]{-79, -89, -81, 25, -106, 96}, new byte[]{-111, -46, -36, 124, -28, 93, 46, -53}) + this.OooO0o0 + u7.OooO00o(new byte[]{-61, -12, -23, -119, -7}, new byte[]{-55, -124, -128, -19, -60, 110, 29, 58}) + this.OooO00o + u7.OooO00o(new byte[]{25, 54, -26, 7, 79}, new byte[]{57, 66, -113, 99, 114, -81, -30, -98}) + this.OooO0O0 + "\n", 60);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }
}
