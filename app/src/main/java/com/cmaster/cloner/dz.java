package com.cmaster.cloner;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dz extends m71 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ dz(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.cmaster.cloner.m71
    public final void OooO00o(RecyclerView recyclerView) {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                ez ezVar = (ez) obj;
                cz czVar = ezVar.OooO00o;
                if (!czVar.isInEditMode()) {
                    if (!ezVar.OooOo00) {
                        ValueAnimator valueAnimator = ezVar.OooOOoo;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0);
                        ezVar.OooOOoo = valueAnimatorOfInt;
                        valueAnimatorOfInt.addUpdateListener(new u8(ezVar, 3));
                        ezVar.OooOOoo.setInterpolator(new yy(2));
                        ezVar.OooOOoo.setDuration(150L);
                        ezVar.OooOOoo.addListener(new oOO00O(ezVar, 5));
                        ezVar.OooOo00 = true;
                        ezVar.OooOOoo.start();
                    }
                    if (!ezVar.OooOo0O) {
                        if (czVar != null) {
                            czVar.removeCallbacks(ezVar.OooOO0o);
                            break;
                        }
                    } else {
                        ezVar.OooO0O0();
                        break;
                    }
                }
                break;
            default:
                fz fzVar = (fz) obj;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i2 = fzVar.OooO0Oo;
                int iComputeVerticalScrollRange = fzVar.OooOo0O.computeVerticalScrollRange();
                int i3 = fzVar.OooOo0;
                fzVar.OooOo0o = iComputeVerticalScrollRange - i3 > 0 && i3 >= i2;
                int iComputeHorizontalScrollRange = fzVar.OooOo0O.computeHorizontalScrollRange();
                int i4 = fzVar.OooOo00;
                boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= i2;
                fzVar.OooOo = z;
                boolean z2 = fzVar.OooOo0o;
                if (!z2 && !z) {
                    if (fzVar.OooOoO0 != 0) {
                        fzVar.OooOO0(0);
                        break;
                    }
                } else {
                    if (z2) {
                        float f = i3;
                        fzVar.OooOOOO = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                        fzVar.OooOOO = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
                    }
                    if (fzVar.OooOo) {
                        float f2 = iComputeHorizontalScrollOffset;
                        float f3 = i4;
                        fzVar.OooOOo = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                        fzVar.OooOOo0 = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
                    }
                    int i5 = fzVar.OooOoO0;
                    if (i5 == 0 || i5 == 1) {
                        fzVar.OooOO0(1);
                        break;
                    }
                }
                break;
        }
    }
}
