package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.cmaster.cloner.R;
import com.cmaster.cloner.az1;
import com.cmaster.cloner.bz1;
import com.cmaster.cloner.cz1;
import com.cmaster.cloner.dt1;
import com.cmaster.cloner.dz1;
import com.cmaster.cloner.ez1;
import com.cmaster.cloner.ft1;
import com.cmaster.cloner.ht0;
import com.cmaster.cloner.hu1;
import com.cmaster.cloner.mz1;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.o00O0;
import com.cmaster.cloner.o00O00OO;
import com.cmaster.cloner.o00O00o0;
import com.cmaster.cloner.o00O0OOO;
import com.cmaster.cloner.oOO00O;
import com.cmaster.cloner.on1;
import com.cmaster.cloner.oo00o;
import com.cmaster.cloner.ow0;
import com.cmaster.cloner.pw0;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.qw0;
import com.cmaster.cloner.qz1;
import com.cmaster.cloner.ry1;
import com.cmaster.cloner.ss0;
import com.cmaster.cloner.un1;
import com.cmaster.cloner.xn;
import com.cmaster.cloner.ym2;
import com.cmaster.cloner.zg0;
import com.cmaster.cloner.zy1;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements ow0, pw0 {
    public static final int[] Oooo000 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final qz1 Oooo00O;
    public static final Rect Oooo00o;
    public Drawable OooO;
    public int OooO0Oo;
    public ContentFrameLayout OooO0o;
    public int OooO0o0;
    public ActionBarContainer OooO0oO;
    public xn OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public int OooOOO;
    public boolean OooOOO0;
    public int OooOOOO;
    public final Rect OooOOOo;
    public final Rect OooOOo;
    public final Rect OooOOo0;
    public final Rect OooOOoo;
    public o00O00o0 OooOo;
    public qz1 OooOo0;
    public qz1 OooOo00;
    public qz1 OooOo0O;
    public qz1 OooOo0o;
    public ViewPropertyAnimator OooOoO;
    public OverScroller OooOoO0;
    public final oOO00O OooOoOO;
    public final o00O00OO OooOoo;
    public final o00O00OO OooOoo0;
    public final qw0 OooOooO;
    public final o00O0 OooOooo;

    static {
        int i = Build.VERSION.SDK_INT;
        ez1 dz1Var = i >= 34 ? new dz1() : i >= 31 ? new cz1() : i >= 30 ? new bz1() : i >= 29 ? new az1() : new zy1();
        dz1Var.OooO0oO(zg0.OooO0O0(0, 1, 0, 1));
        Oooo00O = dz1Var.OooO0O0();
        Oooo00o = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0o0 = 0;
        this.OooOOOo = new Rect();
        this.OooOOo0 = new Rect();
        this.OooOOo = new Rect();
        this.OooOOoo = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        qz1 qz1Var = qz1.OooO0O0;
        this.OooOo00 = qz1Var;
        this.OooOo0 = qz1Var;
        this.OooOo0O = qz1Var;
        this.OooOo0o = qz1Var;
        this.OooOoOO = new oOO00O(this, 0);
        this.OooOoo0 = new o00O00OO(this, 0);
        this.OooOoo = new o00O00OO(this, 1);
        OooO(context);
        this.OooOooO = new qw0();
        o00O0 o00o0 = new o00O0(context);
        o00o0.setWillNotDraw(true);
        this.OooOooo = o00o0;
        addView(o00o0);
    }

    public static boolean OooO0oO(View view, Rect rect, boolean z) {
        boolean z2;
        oo00o oo00oVar = (oo00o) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) oo00oVar).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) oo00oVar).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) oo00oVar).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) oo00oVar).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) oo00oVar).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) oo00oVar).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) oo00oVar).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) oo00oVar).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final void OooO(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(Oooo000);
        this.OooO0Oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.OooO = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.OooOoO0 = new OverScroller(context);
    }

    @Override // com.cmaster.cloner.pw0
    public final void OooO00o(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        OooO0O0(view, i, i2, i3, i4, i5);
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0O0(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // com.cmaster.cloner.ow0
    public final boolean OooO0OO(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0Oo(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0o(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0o0(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void OooO0oo() {
        removeCallbacks(this.OooOoo0);
        removeCallbacks(this.OooOoo);
        ViewPropertyAnimator viewPropertyAnimator = this.OooOoO;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void OooOO0(int i) {
        OooOO0O();
        if (i == 2) {
            ((un1) this.OooO0oo).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((un1) this.OooO0oo).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void OooOO0O() {
        xn wrapper;
        if (this.OooO0o == null) {
            this.OooO0o = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.OooO0oO = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof xn) {
                wrapper = (xn) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    qa.OooO0o("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.OooO0oo = wrapper;
        }
    }

    public final void OooOO0o(Menu menu, ht0 ht0Var) {
        OooOO0O();
        un1 un1Var = (un1) this.OooO0oo;
        Toolbar toolbar = un1Var.OooO00o;
        if (un1Var.OooOOO0 == null) {
            un1Var.OooOOO0 = new o00O0OOO(toolbar.getContext());
        }
        o00O0OOO o00o0ooo = un1Var.OooOOO0;
        o00o0ooo.OooO0oo = ht0Var;
        ss0 ss0Var = (ss0) menu;
        if (ss0Var == null && toolbar.OooO0Oo == null) {
            return;
        }
        toolbar.OooO0o();
        ss0 ss0Var2 = toolbar.OooO0Oo.OooOOoo;
        if (ss0Var2 == ss0Var) {
            return;
        }
        if (ss0Var2 != null) {
            ss0Var2.OooOOo(toolbar.Oooo0oo);
            ss0Var2.OooOOo(toolbar.Oooo);
        }
        if (toolbar.Oooo == null) {
            toolbar.Oooo = new on1(toolbar);
        }
        o00o0ooo.OooOo00 = true;
        Context context = toolbar.OooOOO0;
        if (ss0Var != null) {
            ss0Var.OooO0O0(o00o0ooo, context);
            ss0Var.OooO0O0(toolbar.Oooo, toolbar.OooOOO0);
        } else {
            o00o0ooo.OooO0O0(context, null);
            toolbar.Oooo.OooO0O0(toolbar.OooOOO0, null);
            o00o0ooo.OooOO0();
            toolbar.Oooo.OooOO0();
        }
        toolbar.OooO0Oo.setPopupTheme(toolbar.OooOOO);
        toolbar.OooO0Oo.setPresenter(o00o0ooo);
        toolbar.Oooo0oo = o00o0ooo;
        toolbar.OooOo0O();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof oo00o;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.OooO != null) {
            if (this.OooO0oO.getVisibility() == 0) {
                translationY = (int) (this.OooO0oO.getTranslationY() + this.OooO0oO.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.OooO.setBounds(0, translationY, getWidth(), this.OooO.getIntrinsicHeight() + translationY);
            this.OooO.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new oo00o(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new oo00o(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.OooO0oO;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        qw0 qw0Var = this.OooOooO;
        return qw0Var.OooO0O0 | qw0Var.OooO00o;
    }

    public CharSequence getTitle() {
        OooOO0O();
        return ((un1) this.OooO0oo).OooO00o.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        OooOO0O();
        qz1 qz1VarOooO0oO = qz1.OooO0oO(windowInsets, this);
        boolean zOooO0oO = OooO0oO(this.OooO0oO, new Rect(qz1VarOooO0oO.OooO0O0(), qz1VarOooO0oO.OooO0Oo(), qz1VarOooO0oO.OooO0OO(), qz1VarOooO0oO.OooO00o()), false);
        WeakHashMap weakHashMap = nt1.OooO00o;
        Rect rect = this.OooOOOo;
        ft1.OooO0O0(this, qz1VarOooO0oO, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        mz1 mz1Var = qz1VarOooO0oO.OooO00o;
        qz1 qz1VarOooOO0o = mz1Var.OooOO0o(i, i2, i3, i4);
        this.OooOo00 = qz1VarOooOO0o;
        boolean z = true;
        if (!this.OooOo0.equals(qz1VarOooOO0o)) {
            this.OooOo0 = this.OooOo00;
            zOooO0oO = true;
        }
        Rect rect2 = this.OooOOo0;
        if (rect2.equals(rect)) {
            z = zOooO0oO;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return mz1Var.OooO00o().OooO00o.OooO0OO().OooO00o.OooO0O0().OooO0o();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooO(getContext());
        WeakHashMap weakHashMap = nt1.OooO00o;
        dt1.OooO0OO(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0oo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                oo00o oo00oVar = (oo00o) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) oo00oVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) oo00oVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.OooOO0o || !z) {
            return false;
        }
        this.OooOoO0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.OooOoO0.getFinalY() > this.OooO0oO.getHeight()) {
            OooO0oo();
            this.OooOoo.run();
        } else {
            OooO0oo();
            this.OooOoo0.run();
        }
        this.OooOOO0 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.OooOOO + i2;
        this.OooOOO = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        ry1 ry1Var;
        hu1 hu1Var;
        this.OooOooO.OooO00o = i;
        this.OooOOO = getActionBarHideOffset();
        OooO0oo();
        o00O00o0 o00o00o0 = this.OooOo;
        if (o00o00o0 == null || (hu1Var = (ry1Var = (ry1) o00o00o0).OooOOoo) == null) {
            return;
        }
        hu1Var.OooO00o();
        ry1Var.OooOOoo = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.OooO0oO.getVisibility() != 0) {
            return false;
        }
        return this.OooOO0o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.OooOO0o || this.OooOOO0) {
            return;
        }
        if (this.OooOOO <= this.OooO0oO.getHeight()) {
            OooO0oo();
            postDelayed(this.OooOoo0, 600L);
        } else {
            OooO0oo();
            postDelayed(this.OooOoo, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        OooOO0O();
        int i2 = this.OooOOOO ^ i;
        this.OooOOOO = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        o00O00o0 o00o00o0 = this.OooOo;
        if (o00o00o0 != null) {
            ry1 ry1Var = (ry1) o00o00o0;
            ry1Var.OooOOOO = !z2;
            if (z || !z2) {
                if (ry1Var.OooOOOo) {
                    ry1Var.OooOOOo = false;
                    ry1Var.OooOo0(true);
                }
            } else if (!ry1Var.OooOOOo) {
                ry1Var.OooOOOo = true;
                ry1Var.OooOo0(true);
            }
        }
        if ((i2 & 256) == 0 || this.OooOo == null) {
            return;
        }
        WeakHashMap weakHashMap = nt1.OooO00o;
        dt1.OooO0OO(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.OooO0o0 = i;
        o00O00o0 o00o00o0 = this.OooOo;
        if (o00o00o0 != null) {
            ((ry1) o00o00o0).OooOOO = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        OooO0oo();
        this.OooO0oO.setTranslationY(-Math.max(0, Math.min(i, this.OooO0oO.getHeight())));
    }

    public void setActionBarVisibilityCallback(o00O00o0 o00o00o0) {
        this.OooOo = o00o00o0;
        if (getWindowToken() != null) {
            ((ry1) this.OooOo).OooOOO = this.OooO0o0;
            int i = this.OooOOOO;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = nt1.OooO00o;
                dt1.OooO0OO(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.OooOO0O = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.OooOO0o) {
            this.OooOO0o = z;
            if (z) {
                return;
            }
            OooO0oo();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        OooOO0O();
        un1 un1Var = (un1) this.OooO0oo;
        un1Var.OooO0Oo = i != 0 ? ym2.OooO00o(un1Var.OooO00o.getContext(), i) : null;
        un1Var.OooO0OO();
    }

    public void setLogo(int i) {
        OooOO0O();
        un1 un1Var = (un1) this.OooO0oo;
        un1Var.OooO0o0 = i != 0 ? ym2.OooO00o(un1Var.OooO00o.getContext(), i) : null;
        un1Var.OooO0OO();
    }

    public void setOverlayMode(boolean z) {
        this.OooOO0 = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        OooOO0O();
        ((un1) this.OooO0oo).OooOO0O = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        OooOO0O();
        un1 un1Var = (un1) this.OooO0oo;
        if (un1Var.OooO0oO) {
            return;
        }
        Toolbar toolbar = un1Var.OooO00o;
        un1Var.OooO0oo = charSequence;
        if ((un1Var.OooO0O0 & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (un1Var.OooO0oO) {
                nt1.OooOOO(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new oo00o(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        OooOO0O();
        un1 un1Var = (un1) this.OooO0oo;
        un1Var.OooO0Oo = drawable;
        un1Var.OooO0OO();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
