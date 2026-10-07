package com.cmaster.cloner;

import org.apache.commons.compress.archivers.zip.UnixStat;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class xl2 {
    public static String OooO00o(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(80);
        int i4 = (~i2) & i;
        int i5 = i & i2;
        if ((i5 & 1) != 0) {
            sb.append(u7.OooO00o(new byte[]{121, 103, -29, 120, 25, -24, 20}, new byte[]{5, 23, -106, 26, 117, -127, 119, 5}));
        }
        if ((i5 & 2) != 0) {
            sb.append(u7.OooO00o(new byte[]{72, 43, -43, 103, -76, -22, -92, 44}, new byte[]{52, 91, -89, 14, -62, -117, -48, 73}));
        }
        if ((i5 & 4) != 0) {
            sb.append(u7.OooO00o(new byte[]{79, -110, 42, 62, 15, 87, -1, -104, 86, -122}, new byte[]{51, -30, 88, 81, 123, 50, -100, -20}));
        }
        if ((i5 & 8) != 0) {
            sb.append(u7.OooO00o(new byte[]{68, -6, -110, 54, -55, 47, -70}, new byte[]{56, -119, -26, 87, -67, 70, -39, -28}));
        }
        if ((i5 & 16) != 0) {
            sb.append(u7.OooO00o(new byte[]{26, 59, -20, -10, 19, -94}, new byte[]{102, 93, -123, -104, 114, -50, -81, -88}));
        }
        if ((i5 & 32) != 0) {
            if (i3 == 1) {
                sb.append(u7.OooO00o(new byte[]{0, 57, 92, -128, -101, 32}, new byte[]{124, 74, 41, -16, -2, 82, -107, 9}));
            } else {
                sb.append(u7.OooO00o(new byte[]{-2, 76, -11, 57, 59, 14, 1, 24, -20, 86, -10, 50, 60}, new byte[]{-126, 63, -116, 87, 88, 102, 115, 119}));
            }
        }
        if ((i5 & 64) != 0) {
            if (i3 == 3) {
                sb.append(u7.OooO00o(new byte[]{-64, 124, 53, -92, -43, -100, 55}, new byte[]{-68, 30, 71, -51, -79, -5, 82, 24}));
            } else {
                sb.append(u7.OooO00o(new byte[]{-63, -45, 19, 115, 16, 99, -61, -94, -40}, new byte[]{-67, -91, 124, 31, 113, 23, -86, -50}));
            }
        }
        if ((i5 & 128) != 0) {
            if (i3 == 3) {
                sb.append(u7.OooO00o(new byte[]{86, 62, 29, 42, -117, -112, -60, -103}, new byte[]{42, 72, 124, 88, -22, -30, -93, -22}));
            } else {
                sb.append(u7.OooO00o(new byte[]{-20, -21, -1, 63, -46, -121, -69, -76, -2, -21}, new byte[]{-112, -97, -115, 94, -68, -12, -46, -47}));
            }
        }
        if ((i5 & 256) != 0) {
            sb.append(u7.OooO00o(new byte[]{114, 79, -107, 45, 33, -83, 41}, new byte[]{14, 33, -12, 89, 72, -37, 76, -124}));
        }
        if ((i5 & 512) != 0) {
            sb.append(u7.OooO00o(new byte[]{37, -26, 124, 67, -4, 42, 41, 3, 58, -22}, new byte[]{89, -113, 18, 55, -103, 88, 79, 98}));
        }
        if ((i5 & 1024) != 0) {
            sb.append(u7.OooO00o(new byte[]{-14, -62, 116, -86, 94, -3, -105, 52, -6}, new byte[]{-114, -93, 22, -39, 42, -113, -10, 87}));
        }
        if ((i5 & 2048) != 0) {
            sb.append(u7.OooO00o(new byte[]{4, -111, 67, 124, -79, 0, 50, 29, 8}, new byte[]{120, -30, 55, 14, -40, 99, 70, 123}));
        }
        if ((i5 & 4096) != 0) {
            sb.append(u7.OooO00o(new byte[]{-118, -97, 64, -37, 105, 5, -3, 107, -97, -113}, new byte[]{-10, -20, 57, -75, 29, 109, -104, 31}));
        }
        if ((i5 & 8192) != 0) {
            sb.append(u7.OooO00o(new byte[]{123, 86, -80, -51, 89, -67, -64, -120, 110, 88, -80}, new byte[]{7, 55, -34, -93, 54, -55, -95, -4}));
        }
        if ((i5 & UnixStat.DIR_FLAG) != 0) {
            sb.append(u7.OooO00o(new byte[]{-4, -86, -32, 42, -52}, new byte[]{-128, -49, -114, 95, -95, 114, 21, 114}));
        }
        if ((65536 & i5) != 0) {
            sb.append(u7.OooO00o(new byte[]{-78, 99, 1, 111, 92, 50, -125, 51, -83, 116, 1, 115}, new byte[]{-50, 0, 110, 1, 47, 70, -15, 70}));
        }
        if ((i5 & 131072) != 0) {
            sb.append(u7.OooO00o(new byte[]{-113, -20, 68, 25, 7, -108, 22, 121, -105, -41, 82, 3, 5, -106, 12, 110, -100, -26, 72, 0, 14, -111}, new byte[]{-13, -120, 33, 122, 107, -11, 100, 28}));
        }
        if (i4 != 0 || sb.length() == 0) {
            sb.append('|');
            sb.append(js2.OooO0O0(i4));
        }
        return sb.substring(1);
    }
}
