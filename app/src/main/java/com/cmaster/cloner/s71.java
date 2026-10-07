package com.cmaster.cloner;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s71 {
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public boolean OooO0o;
    public Interpolator OooO0o0;
    public int OooO0oO;

    public final void OooO00o(RecyclerView recyclerView) {
        int i = this.OooO0Oo;
        if (i >= 0) {
            this.OooO0Oo = -1;
            recyclerView.OoooO0O(i);
            this.OooO0o = false;
            return;
        }
        if (!this.OooO0o) {
            this.OooO0oO = 0;
            return;
        }
        Interpolator interpolator = this.OooO0o0;
        if (interpolator != null && this.OooO0OO < 1) {
            qa.OooO0o("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.OooO0OO;
        if (i2 < 1) {
            qa.OooO0o("Scroll duration must be a positive number");
            return;
        }
        recyclerView.OooooO0.OooO0OO(this.OooO00o, this.OooO0O0, i2, interpolator);
        int i3 = this.OooO0oO + 1;
        this.OooO0oO = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.OooO0o = false;
    }
}
