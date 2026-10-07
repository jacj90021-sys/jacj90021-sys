package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zo1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public vo1 OooO0Oo;
    public ViewGroup OooO0o0;

    /* JADX WARN: Removed duplicated region for block: B:106:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e0 A[EDGE_INSN: B:133:0x01e0->B:89:0x01e0 BREAK  A[LOOP:1: B:18:0x0084->B:88:0x01d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0208  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.zo1.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.OooO0o0;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ap1.OooO0OO.remove(viewGroup);
        ArrayList arrayList = (ArrayList) ap1.OooO0O0().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((vo1) obj).OooOoO0(viewGroup);
            }
        }
        this.OooO0Oo.OooO(true);
    }
}
