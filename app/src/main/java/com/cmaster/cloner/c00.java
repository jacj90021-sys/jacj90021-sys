package com.cmaster.cloner;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c00 implements x20 {
    public final Set OooO0Oo = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean OooO0o0;

    @Override // com.cmaster.cloner.x20
    public final void OooO0OO(oOOO00 oooo00) {
        if (!this.OooO0o0 && this.OooO0Oo.add(oooo00)) {
            View decorView = oooo00.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new b00(this, decorView));
        }
    }
}
