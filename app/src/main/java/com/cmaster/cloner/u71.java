package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u71 {
    public boolean OooO;
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public boolean OooO0o;
    public int OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public long OooOOO0;

    public final void OooO00o(int i) {
        if ((this.OooO0Oo & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.OooO0Oo));
    }

    public final int OooO0O0() {
        return this.OooO0oO ? this.OooO0O0 - this.OooO0OO : this.OooO0o0;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.OooO00o + ", mData=null, mItemCount=" + this.OooO0o0 + ", mIsMeasuring=" + this.OooO + ", mPreviousLayoutItemCount=" + this.OooO0O0 + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.OooO0OO + ", mStructureChanged=" + this.OooO0o + ", mInPreLayout=" + this.OooO0oO + ", mRunSimpleAnimations=" + this.OooOO0 + ", mRunPredictiveAnimations=" + this.OooOO0O + '}';
    }
}
