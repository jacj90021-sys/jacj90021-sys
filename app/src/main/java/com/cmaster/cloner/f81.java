package com.cmaster.cloner;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.widget.RadioGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f81 implements RadioGroup.OnCheckedChangeListener {
    public final RadioGroup OooO00o;
    public final SparseIntArray OooO0O0 = new SparseIntArray();
    public final SparseArray OooO0OO = new SparseArray();
    public int OooO0Oo = -1;

    public f81(RadioGroup radioGroup) {
        this.OooO00o = radioGroup;
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.OooO0Oo = i;
        j81 j81Var = (j81) this.OooO0OO.get(i);
        if (j81Var != null) {
            Log.e("f81", sn2.OooO00o("pvozmS6s0tet1xiQJajc1vO0\n", "yZRw8UvPubI=\n") + j81Var);
        }
    }
}
