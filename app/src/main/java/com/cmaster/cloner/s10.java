package com.cmaster.cloner;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s10 extends FrameLayout {
    public final ArrayList OooO0Oo;
    public View.OnApplyWindowInsetsListener OooO0o;
    public final ArrayList OooO0o0;
    public boolean OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s10(Context context, AttributeSet attributeSet, k20 k20Var) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.OooO0Oo = new ArrayList();
        this.OooO0o0 = new ArrayList();
        this.OooO0oO = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h61.OooO0O0, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        o10 o10VarOooOoO = k20Var.OooOoO(id);
        if (classAttribute != null && o10VarOooOoO == null) {
            if (id == -1) {
                qa.OooO0o(px0.OooOOOO("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            f20 f20VarOooOoo = k20Var.OooOoo();
            context.getClassLoader();
            o10 o10VarOooO00o = f20VarOooOoo.OooO00o(classAttribute);
            o10VarOooO00o.getClass();
            o10VarOooO00o.Oooo00O = true;
            q10 q10Var = o10VarOooO00o.OooOo0O;
            if ((q10Var == null ? null : q10Var.OooO0Oo) != null) {
                o10VarOooO00o.Oooo00O = true;
            }
            k5 k5Var = new k5(k20Var);
            k5Var.OooOOOo = true;
            o10VarOooO00o.Oooo00o = this;
            k5Var.OooO0o0(getId(), o10VarOooO00o, string, 1);
            if (k5Var.OooO0oO) {
                qa.OooO0o("This transaction is already being added to the back stack");
                throw null;
            }
            k5Var.OooO0oo = false;
            k20 k20Var2 = k5Var.OooOOo0;
            if (k20Var2.OooOo00 != null && !k20Var2.Oooo00O) {
                k20Var2.OooOo0o(true);
                k5Var.OooO00o(k20Var2.Oooo0, k20Var2.Oooo0O0);
                k20Var2.OooO0O0 = true;
                try {
                    k20Var2.Oooo(k20Var2.Oooo0, k20Var2.Oooo0O0);
                    k20Var2.OooO0Oo();
                    k20Var2.OoooOoo();
                    if (k20Var2.Oooo00o) {
                        k20Var2.Oooo00o = false;
                        k20Var2.OoooOo0();
                    }
                    ((HashMap) k20Var2.OooO0OO.OooO0o).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    k20Var2.OooO0Oo();
                    throw th;
                }
            }
        }
        ArrayList arrayListOooOo0 = k20Var.OooO0OO.OooOo0();
        int size = arrayListOooOo0.size();
        while (i < size) {
            Object obj = arrayListOooOo0.get(i);
            i++;
            r20 r20Var = (r20) obj;
            o10 o10Var = r20Var.OooO0OO;
            if (o10Var.OooOoO == getId() && (view = o10Var.Oooo0) != null && view.getParent() == null) {
                o10Var.Oooo00o = this;
                r20Var.OooO0O0();
            }
        }
    }

    public final void OooO00o(View view) {
        if (this.OooO0o0.contains(view)) {
            this.OooO0Oo.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof o10 ? (o10) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        qz1 qz1VarOooO0oO;
        windowInsets.getClass();
        qz1 qz1VarOooO0oO2 = qz1.OooO0oO(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.OooO0o;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            qz1VarOooO0oO = qz1.OooO0oO(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = nt1.OooO00o;
            WindowInsets windowInsetsOooO0o = qz1VarOooO0oO2.OooO0o();
            if (windowInsetsOooO0o != null) {
                WindowInsets windowInsetsOooO0O0 = dt1.OooO0O0(this, windowInsetsOooO0o);
                if (!windowInsetsOooO0O0.equals(windowInsetsOooO0o)) {
                    qz1VarOooO0oO2 = qz1.OooO0oO(windowInsetsOooO0O0, this);
                }
            }
            qz1VarOooO0oO = qz1VarOooO0oO2;
        }
        if (!qz1VarOooO0oO.OooO00o.OooOOO0()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                nt1.OooO0O0(getChildAt(i), qz1VarOooO0oO);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.OooO0oO) {
            ArrayList arrayList = this.OooO0Oo;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.OooO0oO) {
            ArrayList arrayList = this.OooO0Oo;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.OooO0o0.remove(view);
        if (this.OooO0Oo.remove(view)) {
            this.OooO0oO = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends o10> F getFragment() {
        oOOO00 oooo00;
        o10 o10Var;
        k20 k20VarOooOOO;
        View view = this;
        while (true) {
            oooo00 = null;
            if (view == null) {
                o10Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            o10Var = tag instanceof o10 ? (o10) tag : null;
            if (o10Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (o10Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof oOOO00) {
                    oooo00 = (oOOO00) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (oooo00 == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            k20VarOooOOO = oooo00.OooOOO();
        } else {
            if (!o10Var.OooOOoo()) {
                ra.OooOO0("The Fragment ", o10Var, " that owns View ", this, " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                return null;
            }
            k20VarOooOOO = o10Var.OooO();
        }
        return (F) k20VarOooOOO.OooOoO(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                OooO00o(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        OooO00o(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        OooO00o(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        OooO00o(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            OooO00o(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            OooO00o(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.OooO0oO = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.OooO0o = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.OooO0o0.add(view);
        }
        super.startViewTransition(view);
    }
}
