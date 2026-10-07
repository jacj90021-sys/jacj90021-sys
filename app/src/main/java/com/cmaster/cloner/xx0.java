package com.cmaster.cloner;

import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xx0 implements Runnable {
    public int OooO0Oo;
    public final TextView OooO0o;
    public int OooO0o0;
    public long OooO0oO = 5;
    public boolean OooO0oo = true;

    public xx0(TextView textView) {
        this.OooO0o = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0o0;
        TextView textView = this.OooO0o;
        if (i != 0) {
            textView.postDelayed(this, this.OooO0oO);
            this.OooO0o0--;
        }
        textView.setText(String.valueOf(this.OooO0Oo - this.OooO0o0));
    }
}
