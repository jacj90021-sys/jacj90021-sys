package com.cmaster.cloner;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m0 extends py2 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ WeakReference OooO0OO;
    public final /* synthetic */ s0 OooO0Oo;

    public m0(s0 s0Var, int i, int i2, WeakReference weakReference) {
        this.OooO0Oo = s0Var;
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = weakReference;
    }

    @Override // com.cmaster.cloner.py2
    public final void OooO0O0(int i) {
    }

    @Override // com.cmaster.cloner.py2
    public final void OooO0OO(Typeface typeface) {
        int i;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.OooO00o) != -1) {
            typeface = r0.OooO00o(typeface, i, (this.OooO0O0 & 2) != 0);
        }
        s0 s0Var = this.OooO0Oo;
        if (s0Var.OooO0O0) {
            s0Var.OooOOO0 = typeface;
            TextView textView = (TextView) this.OooO0OO.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i3 = s0Var.OooO00o;
                if (zIsAttachedToWindow) {
                    textView.post(new n0(textView, typeface, i3, i2));
                } else {
                    textView.setTypeface(typeface, i3);
                }
            }
        }
    }
}
