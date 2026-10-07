package com.cmaster.cloner;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vd1 implements wd1 {
    public final ScrollFeedbackProvider OooO0Oo;

    public vd1(NestedScrollView nestedScrollView) {
        this.OooO0Oo = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // com.cmaster.cloner.wd1
    public final void OooO0Oo(boolean z, int i, int i2, int i3) {
        this.OooO0Oo.onScrollLimit(i, i2, i3, z);
    }

    @Override // com.cmaster.cloner.wd1
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.OooO0Oo.onScrollProgress(i, i2, i3, i4);
    }
}
