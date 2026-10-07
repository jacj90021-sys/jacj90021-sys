package com.cmaster.cloner;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x71 implements Runnable {
    public boolean OooO;
    public int OooO0Oo;
    public OverScroller OooO0o;
    public int OooO0o0;
    public Interpolator OooO0oO;
    public boolean OooO0oo;
    public final /* synthetic */ RecyclerView OooOO0;

    public x71(RecyclerView recyclerView) {
        this.OooOO0 = recyclerView;
        tj0 tj0Var = RecyclerView.o00000O;
        this.OooO0oO = tj0Var;
        this.OooO0oo = false;
        this.OooO = false;
        this.OooO0o = new OverScroller(recyclerView.getContext(), tj0Var);
    }

    public final void OooO00o(int i, int i2) {
        RecyclerView recyclerView = this.OooOO0;
        recyclerView.setScrollState(2);
        this.OooO0o0 = 0;
        this.OooO0Oo = 0;
        Interpolator interpolator = this.OooO0oO;
        tj0 tj0Var = RecyclerView.o00000O;
        if (interpolator != tj0Var) {
            this.OooO0oO = tj0Var;
            this.OooO0o = new OverScroller(recyclerView.getContext(), tj0Var);
        }
        this.OooO0o.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        OooO0O0();
    }

    public final void OooO0O0() {
        if (this.OooO0oo) {
            this.OooO = true;
            return;
        }
        RecyclerView recyclerView = this.OooOO0;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = nt1.OooO00o;
        recyclerView.postOnAnimation(this);
    }

    public final void OooO0OO(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.OooOO0;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.o00000O;
        }
        if (this.OooO0oO != interpolator) {
            this.OooO0oO = interpolator;
            this.OooO0o = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.OooO0o0 = 0;
        this.OooO0Oo = 0;
        recyclerView.setScrollState(2);
        this.OooO0o.startScroll(0, 0, i, i2, i4);
        OooO0O0();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.OooOO0;
        int[] iArr = recyclerView.o00oO0o;
        if (recyclerView.OooOOo0 == null) {
            recyclerView.removeCallbacks(this);
            this.OooO0o.abortAnimation();
            return;
        }
        this.OooO = false;
        this.OooO0oo = true;
        recyclerView.OooOOo0();
        OverScroller overScroller = this.OooO0o;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.OooO0Oo;
            int i6 = currY - this.OooO0o0;
            this.OooO0Oo = currX;
            this.OooO0o0 = currY;
            int iOooOOOo = RecyclerView.OooOOOo(i5, recyclerView.Oooo0o0, recyclerView.Oooo0oO, recyclerView.getWidth());
            int iOooOOOo2 = RecyclerView.OooOOOo(i6, recyclerView.Oooo0o, recyclerView.Oooo0oo, recyclerView.getHeight());
            int[] iArr2 = recyclerView.o00oO0o;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.OooOo0o(iOooOOOo, iOooOOOo2, 1, iArr2, null)) {
                iOooOOOo -= iArr[0];
                iOooOOOo2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.OooOOOO(iOooOOOo, iOooOOOo2);
            }
            if (recyclerView.OooOOOo != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.OoooooO(iArr, iOooOOOo, iOooOOOo2);
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = iOooOOOo - i7;
                int i10 = iOooOOOo2 - i8;
                um0 um0Var = recyclerView.OooOOo0.OooO0o0;
                if (um0Var != null && !um0Var.OooO0Oo && um0Var.OooO0o0) {
                    int iOooO0O0 = recyclerView.Oooooo0.OooO0O0();
                    if (iOooO0O0 == 0) {
                        um0Var.OooO0oo();
                    } else if (um0Var.OooO00o >= iOooO0O0) {
                        um0Var.OooO00o = iOooO0O0 - 1;
                        um0Var.OooO0oO(i7, i8);
                    } else {
                        um0Var.OooO0oO(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = iOooOOOo;
                i2 = iOooOOOo2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.OooOOoo.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.o00oO0o;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.OooOo(i3, i4, i, i2, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.OooOoO0(i3, i4);
            }
            if (!recyclerView.o00oO0oO()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            um0 um0Var2 = recyclerView.OooOOo0.OooO0o0;
            if ((um0Var2 == null || !um0Var2.OooO0Oo) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.OooOoOO();
                        if (recyclerView.Oooo0o0.isFinished()) {
                            recyclerView.Oooo0o0.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.OooOoo0();
                        if (recyclerView.Oooo0oO.isFinished()) {
                            recyclerView.Oooo0oO.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.OooOoo();
                        if (recyclerView.Oooo0o.isFinished()) {
                            recyclerView.Oooo0o.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.OooOoO();
                        if (recyclerView.Oooo0oo.isFinished()) {
                            recyclerView.Oooo0oo.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.o00000) {
                    ed edVar = recyclerView.OooooOo;
                    int[] iArr4 = (int[]) edVar.OooO0Oo;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    edVar.OooO0OO = 0;
                }
            } else {
                OooO0O0();
                o40 o40Var = recyclerView.OooooOO;
                if (o40Var != null) {
                    o40Var.OooO00o(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                c71.OooO00o(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        um0 um0Var3 = recyclerView.OooOOo0.OooO0o0;
        if (um0Var3 != null && um0Var3.OooO0Oo) {
            um0Var3.OooO0oO(0, 0);
        }
        this.OooO0oo = false;
        if (!this.OooO) {
            recyclerView.setScrollState(0);
            recyclerView.o00o0O(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = nt1.OooO00o;
            recyclerView.postOnAnimation(this);
        }
    }
}
