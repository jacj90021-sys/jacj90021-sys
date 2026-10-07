package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zb extends h00 implements Comparable {
    public static final zb OooO0o = new zb(0);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zb zbVar = (zb) obj;
        if (this != zbVar) {
            int length = this.OooO0o0.length;
            int length2 = zbVar.OooO0o0.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo = ((yb) OooO0o0(i)).compareTo((yb) zbVar.OooO0o0(i));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            if (length < length2) {
                return -1;
            }
            if (length > length2) {
                return 1;
            }
        }
        return 0;
    }
}
