package com.cmaster.cloner;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v91 implements sl1 {
    public final pm OooO0Oo;
    public final View OooO0o0;

    public v91(ImageView imageView) {
        zx2.OooO0OO(imageView, "Argument must not be null");
        this.OooO0o0 = imageView;
        this.OooO0Oo = new pm(imageView);
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO() {
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO00o(m91 m91Var) {
        this.OooO0o0.setTag(R.id.glide_custom_view_target_tag, m91Var);
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0O0(Object obj) {
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0OO(kh1 kh1Var) {
        this.OooO0Oo.OooO0O0.remove(kh1Var);
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0Oo(Drawable drawable) {
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0o(Drawable drawable) {
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO0o0() {
    }

    @Override // com.cmaster.cloner.sl1
    public final m91 OooO0oO() {
        Object tag = this.OooO0o0.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof m91) {
                return (m91) tag;
            }
            ra.OooOOO("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0oo(Drawable drawable) {
        pm pmVar = this.OooO0Oo;
        ViewTreeObserver viewTreeObserver = pmVar.OooO00o.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(pmVar.OooO0OO);
        }
        pmVar.OooO0OO = null;
        pmVar.OooO0O0.clear();
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooOO0(kh1 kh1Var) throws Throwable {
        pm pmVar = this.OooO0Oo;
        ArrayList arrayList = pmVar.OooO0O0;
        View view = pmVar.OooO00o;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iOooO00o = pmVar.OooO00o(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iOooO00o2 = pmVar.OooO00o(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iOooO00o > 0 || iOooO00o == Integer.MIN_VALUE) && (iOooO00o2 > 0 || iOooO00o2 == Integer.MIN_VALUE)) {
            kh1Var.OooOOO0(iOooO00o, iOooO00o2);
            return;
        }
        if (!arrayList.contains(kh1Var)) {
            arrayList.add(kh1Var);
        }
        if (pmVar.OooO0OO == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            om omVar = new om(pmVar);
            pmVar.OooO0OO = omVar;
            viewTreeObserver.addOnPreDrawListener(omVar);
        }
    }

    @Override // com.cmaster.cloner.fm0
    public final void onDestroy() {
    }

    public final String toString() {
        return "Target for: " + this.OooO0o0;
    }
}
