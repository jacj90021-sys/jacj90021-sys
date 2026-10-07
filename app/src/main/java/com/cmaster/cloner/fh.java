package com.cmaster.cloner;

import android.app.IServiceConnection;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fh {
    public final ooooO0O0 OooO00o;
    public final IServiceConnection OooO0O0;
    public final int OooO0OO;
    public String OooO0Oo;
    public boolean OooO0o0;

    public fh(ooooO0O0 ooooo0o0, IServiceConnection iServiceConnection, int i) {
        this.OooO00o = ooooo0o0;
        this.OooO0O0 = iServiceConnection;
        this.OooO0OO = i;
    }

    public final String toString() {
        String str = this.OooO0Oo;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(u7.OooO00o(new byte[]{91, 62, -27, 41, -91, 10, -35, -121, 119, 63, -39, 34, -93, 6, -37, -118, 99}, new byte[]{24, 81, -117, 71, -64, 105, -87, -18}));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(u7.OooO00o(new byte[]{-44, -38}, new byte[]{-12, -81, 96, -5, 126, -115, 57, 80}));
        ooooO0O0 ooooo0o0 = this.OooO00o;
        sb.append(ooooo0o0.OooO0OO.OooO0o0);
        sb.append(' ');
        int i = this.OooO0OO;
        if ((i & 1) != 0) {
            sb.append(u7.OooO00o(new byte[]{-94, -73, -125}, new byte[]{-31, -27, -93, -78, 82, -5, -59, 40}));
        }
        if ((i & 2) != 0) {
            sb.append(u7.OooO00o(new byte[]{116, -107, 98, 126}, new byte[]{48, -41, 37, 94, -92, -22, -68, 14}));
        }
        if ((i & 4) != 0) {
            sb.append(u7.OooO00o(new byte[]{36, -78, -42, 75}, new byte[]{5, -12, -111, 107, 41, -67, -14, -124}));
        }
        if ((i & 8) != 0) {
            sb.append(u7.OooO00o(new byte[]{-35, 127, 121, -62, 62, -99}, new byte[]{-100, 61, 58, -114, 106, -67, 85, 15}));
        }
        if ((i & 16) != 0) {
            sb.append(u7.OooO00o(new byte[]{-83, 118, -32, -68}, new byte[]{-30, 57, -83, -100, -110, -122, 63, 109}));
        }
        if ((i & 32) != 0) {
            sb.append(u7.OooO00o(new byte[]{-6, 86, -68, 115, 114}, new byte[]{-83, 6, -18, 58, 82, 127, 42, -40}));
        }
        if ((i & 64) != 0) {
            sb.append(u7.OooO00o(new byte[]{102, -17, -31, -63}, new byte[]{47, -94, -79, -31, -24, 77, -74, -93}));
        }
        if ((i & 128) != 0) {
            sb.append(u7.OooO00o(new byte[]{110, 116, 75, -116, -12}, new byte[]{57, 53, 8, -40, -44, 36, 38, -60}));
        }
        if ((i & 256) != 0) {
            sb.append(u7.OooO00o(new byte[]{19, 66, -68, 30, -55, 77}, new byte[]{50, 18, -18, 93, -103, 109, 95, 94}));
        }
        if ((i & 4096) != 0) {
            sb.append(u7.OooO00o(new byte[]{-85, -95, -24, 72, -125}, new byte[]{-24, -32, -72, 27, -93, 80, 34, -122}));
        }
        if (this.OooO0o0) {
            sb.append(u7.OooO00o(new byte[]{-6, -106, 77, -99, 96}, new byte[]{-66, -45, 12, -39, 64, 50, -122, 95}));
        }
        sb.append(ooooo0o0.OooO00o.OooO0oO);
        sb.append(u7.OooO00o(new byte[]{-34, 114}, new byte[]{-28, 50, 18, 118, -107, 35, -89, -71}));
        sb.append(Integer.toHexString(System.identityHashCode(this.OooO0O0.asBinder())));
        sb.append('}');
        String string = sb.toString();
        this.OooO0Oo = string;
        return string;
    }
}
