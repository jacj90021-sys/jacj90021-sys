package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i8 implements sl1 {
    public final ImageView OooO0Oo;
    public Animatable OooO0o;
    public final ku1 OooO0o0;
    public final /* synthetic */ int OooO0oO;

    public i8(ImageView imageView, int i) {
        this.OooO0oO = i;
        zx2.OooO0OO(imageView, "Argument must not be null");
        this.OooO0Oo = imageView;
        this.OooO0o0 = new ku1(imageView);
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO() {
        Animatable animatable = this.OooO0o;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO00o(m91 m91Var) {
        this.OooO0Oo.setTag(R.id.glide_custom_view_target_tag, m91Var);
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0O0(Object obj) {
        OooOO0O(obj);
        if (!(obj instanceof Animatable)) {
            this.OooO0o = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.OooO0o = animatable;
        animatable.start();
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0OO(kh1 kh1Var) {
        this.OooO0o0.OooO0O0.remove(kh1Var);
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0Oo(Drawable drawable) {
        OooOO0O(null);
        this.OooO0o = null;
        this.OooO0Oo.setImageDrawable(drawable);
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0o(Drawable drawable) {
        OooOO0O(null);
        this.OooO0o = null;
        this.OooO0Oo.setImageDrawable(drawable);
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO0o0() {
        Animatable animatable = this.OooO0o;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.cmaster.cloner.sl1
    public final m91 OooO0oO() {
        Object tag = this.OooO0Oo.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof m91) {
                return (m91) tag;
            }
            ra.OooOOO("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooO0oo(Drawable drawable) {
        ku1 ku1Var = this.OooO0o0;
        ViewTreeObserver viewTreeObserver = ku1Var.OooO00o.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(ku1Var.OooO0OO);
        }
        ku1Var.OooO0OO = null;
        ku1Var.OooO0O0.clear();
        Animatable animatable = this.OooO0o;
        if (animatable != null) {
            animatable.stop();
        }
        OooOO0O(null);
        this.OooO0o = null;
        this.OooO0Oo.setImageDrawable(drawable);
    }

    @Override // com.cmaster.cloner.sl1
    public final void OooOO0(kh1 kh1Var) throws Throwable {
        ku1 ku1Var = this.OooO0o0;
        ArrayList arrayList = ku1Var.OooO0O0;
        View view = ku1Var.OooO00o;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iOooO00o = ku1Var.OooO00o(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iOooO00o2 = ku1Var.OooO00o(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iOooO00o > 0 || iOooO00o == Integer.MIN_VALUE) && (iOooO00o2 > 0 || iOooO00o2 == Integer.MIN_VALUE)) {
            kh1Var.OooOOO0(iOooO00o, iOooO00o2);
            return;
        }
        if (!arrayList.contains(kh1Var)) {
            arrayList.add(kh1Var);
        }
        if (ku1Var.OooO0OO == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            om omVar = new om(ku1Var);
            ku1Var.OooO0OO = omVar;
            viewTreeObserver.addOnPreDrawListener(omVar);
        }
    }

    public final void OooOO0O(Object obj) {
        switch (this.OooO0oO) {
            case 0:
                this.OooO0Oo.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.OooO0Oo.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // com.cmaster.cloner.fm0
    public final void onDestroy() {
    }

    public final String toString() {
        return "Target for: " + this.OooO0Oo;
    }
}
