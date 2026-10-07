package com.cmaster.cloner;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y0 extends x0 {
    @Override // com.cmaster.cloner.x0, com.cmaster.cloner.z0
    public void OooO00o(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // com.cmaster.cloner.z0
    public boolean OooO0O0(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
