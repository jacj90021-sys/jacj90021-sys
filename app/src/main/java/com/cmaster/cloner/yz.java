package com.cmaster.cloner;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yz implements FilenameFilter {
    public final /* synthetic */ int OooO00o;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.OooO00o) {
            case 0:
                return str.endsWith(u7.OooO00o(new byte[]{-95, -91, -26, -83}, new byte[]{-113, -60, -106, -58, 94, 94, -117, -49}));
            default:
                return str.endsWith(u7.OooO00o(new byte[]{35, -66, -117, -34}, new byte[]{13, -33, -5, -75, 77, 67, 42, -25}));
        }
    }
}
