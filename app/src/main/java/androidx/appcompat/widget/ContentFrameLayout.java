package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.cmaster.cloner.gu1;
import com.cmaster.cloner.k;
import com.cmaster.cloner.ni;
import com.cmaster.cloner.o00O0OO0;
import com.cmaster.cloner.o00O0OOO;
import com.cmaster.cloner.o00OO000;
import com.cmaster.cloner.ss0;
import com.cmaster.cloner.un1;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue OooO;
    public TypedValue OooO0Oo;
    public TypedValue OooO0o;
    public TypedValue OooO0o0;
    public TypedValue OooO0oO;
    public TypedValue OooO0oo;
    public final Rect OooOO0;
    public ni OooOO0O;

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooOO0 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.OooO0oo == null) {
            this.OooO0oo = new TypedValue();
        }
        return this.OooO0oo;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.OooO == null) {
            this.OooO = new TypedValue();
        }
        return this.OooO;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.OooO0o == null) {
            this.OooO0o = new TypedValue();
        }
        return this.OooO0o;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.OooO0oO == null) {
            this.OooO0oO = new TypedValue();
        }
        return this.OooO0oO;
    }

    public TypedValue getMinWidthMajor() {
        if (this.OooO0Oo == null) {
            this.OooO0Oo = new TypedValue();
        }
        return this.OooO0Oo;
    }

    public TypedValue getMinWidthMinor() {
        if (this.OooO0o0 == null) {
            this.OooO0o0 = new TypedValue();
        }
        return this.OooO0o0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ni niVar = this.OooOO0O;
        if (niVar != null) {
            niVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        o00O0OOO o00o0ooo;
        super.onDetachedFromWindow();
        ni niVar = this.OooOO0O;
        if (niVar != null) {
            k kVar = (k) ((o00OO000) niVar).OooO0o0;
            ActionBarOverlayLayout actionBarOverlayLayout = kVar.OooOo00;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.OooOO0O();
                ActionMenuView actionMenuView = ((un1) actionBarOverlayLayout.OooO0oo).OooO00o.OooO0Oo;
                if (actionMenuView != null && (o00o0ooo = actionMenuView.OooOo0o) != null) {
                    o00o0ooo.OooO();
                    o00O0OO0 o00o0oo0 = o00o0ooo.OooOo0o;
                    if (o00o0oo0 != null && o00o0oo0.OooO0O0()) {
                        o00o0oo0.OooO.dismiss();
                    }
                }
            }
            if (kVar.OooOoO0 != null) {
                kVar.OooOOOO.getDecorView().removeCallbacks(kVar.OooOoO);
                if (kVar.OooOoO0.isShowing()) {
                    try {
                        kVar.OooOoO0.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                kVar.OooOoO0 = null;
            }
            gu1 gu1Var = kVar.OooOoOO;
            if (gu1Var != null) {
                gu1Var.OooO0O0();
            }
            ss0 ss0Var = kVar.OooOoO(0).OooO0oo;
            if (ss0Var != null) {
                ss0Var.OooO0OO(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(ni niVar) {
        this.OooOO0O = niVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
