package com.cmaster.cloner;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y10 extends x10 {
    public static final SparseIntArray OooOoO0;
    public long OooOo;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        OooOoO0 = sparseIntArray;
        sparseIntArray.put(R.id.bannerContainer, 1);
        sparseIntArray.put(R.id.redeem, 2);
        sparseIntArray.put(R.id.coin, 3);
        sparseIntArray.put(R.id.vipStatus, 4);
        sparseIntArray.put(R.id.goWatch, 5);
        sparseIntArray.put(R.id.vipGroup, 6);
    }

    @Override // com.cmaster.cloner.rt1
    public final void OooO0Oo() {
        synchronized (this) {
            this.OooOo = 0L;
        }
    }

    @Override // com.cmaster.cloner.rt1
    public final boolean OooO0o0() {
        synchronized (this) {
            try {
                return this.OooOo != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.rt1
    public final boolean OooO0oo(int i, int i2, Object obj) {
        return false;
    }
}
