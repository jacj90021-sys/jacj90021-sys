package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sk extends h00 implements Comparable {
    @Override // java.lang.Comparable
    /* renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public final int compareTo(sk skVar) {
        int length = this.OooO0o0.length;
        int length2 = skVar.OooO0o0.length;
        int i = length < length2 ? length : length2;
        for (int i2 = 0; i2 < i; i2++) {
            int iCompareTo = ((oh) OooO0o0(i2)).compareTo((oh) skVar.OooO0o0(i2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }
}
