package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.cmaster.cloner.ft1;
import com.cmaster.cloner.hu;
import com.cmaster.cloner.iw0;
import com.cmaster.cloner.jw0;
import com.cmaster.cloner.kr;
import com.cmaster.cloner.kw0;
import com.cmaster.cloner.lw0;
import com.cmaster.cloner.mw0;
import com.cmaster.cloner.mw2;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.nw0;
import com.cmaster.cloner.pw0;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.qq2;
import com.cmaster.cloner.qw0;
import com.cmaster.cloner.xb1;
import com.cmaster.cloner.xd1;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements pw0, mw0 {
    public static final float Oooo000 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final iw0 Oooo00O = new iw0(0);
    public static final int[] Oooo00o = {R.attr.fillViewport};
    public final EdgeEffect OooO;
    public final float OooO0Oo;
    public final Rect OooO0o;
    public long OooO0o0;
    public final OverScroller OooO0oO;
    public final EdgeEffect OooO0oo;
    public xd1 OooOO0;
    public int OooOO0O;
    public boolean OooOO0o;
    public View OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public VelocityTracker OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;
    public final int OooOOoo;
    public final int[] OooOo;
    public final int OooOo0;
    public final int OooOo00;
    public int OooOo0O;
    public final int[] OooOo0o;
    public int OooOoO;
    public int OooOoO0;
    public lw0 OooOoOO;
    public final nw0 OooOoo;
    public final qw0 OooOoo0;
    public float OooOooO;
    public final kr OooOooo;

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooO0o = new Rect();
        this.OooOO0o = true;
        this.OooOOO0 = false;
        this.OooOOO = null;
        this.OooOOOO = false;
        this.OooOOo = true;
        this.OooOo0O = -1;
        this.OooOo0o = new int[2];
        this.OooOo = new int[2];
        this.OooOooo = new kr(getContext(), new xb1(this, 24));
        int i2 = Build.VERSION.SDK_INT;
        this.OooO0oo = i2 >= 31 ? hu.OooO00o(context, attributeSet) : new EdgeEffect(context);
        this.OooO = i2 >= 31 ? hu.OooO00o(context, attributeSet) : new EdgeEffect(context);
        this.OooO0Oo = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.OooO0oO = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.OooOOoo = viewConfiguration.getScaledTouchSlop();
        this.OooOo00 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.OooOo0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo00o, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.OooOoo0 = new qw0();
        this.OooOoo = new nw0(this);
        setNestedScrollingEnabled(true);
        nt1.OooOOO0(this, Oooo00O);
    }

    public static boolean OooOO0o(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && OooOO0o((View) parent, nestedScrollView);
    }

    private xd1 getScrollFeedbackProvider() {
        if (this.OooOO0 == null) {
            this.OooOO0 = new xd1(this);
        }
        return this.OooOO0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.graphics.Rect r0 = r5.OooO0o
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 130(0x82, float:1.82E-43)
            r2 = 0
            if (r0 <= 0) goto L98
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L98
            int r0 = r6.getAction()
            if (r0 != 0) goto Lc0
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L88
            r3 = 20
            if (r0 == r3) goto L78
            r3 = 62
            if (r0 == r3) goto L6d
            r6 = 92
            if (r0 == r6) goto L68
            r6 = 93
            if (r0 == r6) goto L63
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L5f
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L5b
            goto Lc0
        L5b:
            r5.OooOOo0(r1)
            return r2
        L5f:
            r5.OooOOo0(r4)
            return r2
        L63:
            boolean r5 = r5.OooOO0O(r1)
            return r5
        L68:
            boolean r5 = r5.OooOO0O(r4)
            return r5
        L6d:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L74
            r1 = r4
        L74:
            r5.OooOOo0(r1)
            return r2
        L78:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L83
            boolean r5 = r5.OooOO0O(r1)
            return r5
        L83:
            boolean r5 = r5.OooO0oO(r1)
            return r5
        L88:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L93
            boolean r5 = r5.OooOO0O(r4)
            return r5
        L93:
            boolean r5 = r5.OooO0oO(r4)
            return r5
        L98:
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto Lc0
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto Lc0
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto Lac
            r6 = 0
        Lac:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r1)
            if (r6 == 0) goto Lc0
            if (r6 == r5) goto Lc0
            boolean r5 = r6.requestFocus(r1)
            if (r5 == 0) goto Lc0
            r5 = 1
            return r5
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.OooO(android.view.KeyEvent):boolean");
    }

    @Override // com.cmaster.cloner.pw0
    public final void OooO00o(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        OooOOO(iArr, i4, i5);
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0O0(View view, int i, int i2, int i3, int i4, int i5) {
        OooOOO(null, i4, i5);
    }

    @Override // com.cmaster.cloner.ow0
    public final boolean OooO0OO(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0Oo(View view, View view2, int i, int i2) {
        qw0 qw0Var = this.OooOoo0;
        if (i2 == 1) {
            qw0Var.OooO0O0 = i;
        } else {
            qw0Var.OooO00o = i;
        }
        this.OooOoo.OooO0oO(2, i2);
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0o(View view, int i, int i2, int[] iArr, int i3) {
        this.OooOoo.OooO0OO(i, i2, i3, iArr, null);
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0o0(View view, int i) {
        qw0 qw0Var = this.OooOoo0;
        if (i == 1) {
            qw0Var.OooO0O0 = 0;
        } else {
            qw0Var.OooO00o = 0;
        }
        OooOo0o(i);
    }

    public final boolean OooO0oO(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !OooOOO0(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            OooOOoo(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.OooO0o;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            OooOOoo(OooO0oo(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !OooOOO0(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final int OooO0oo(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final void OooOO0(int i) {
        if (getChildCount() > 0) {
            this.OooO0oO.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.OooOoo.OooO0oO(2, 1);
            this.OooOoO = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                jw0.OooO00o(this, Math.abs(this.OooO0oO.getCurrVelocity()));
            }
        }
    }

    public final boolean OooOO0O(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.OooO0o;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return OooOOo(i, rect.top, rect.bottom);
    }

    public final void OooOOO(int[] iArr, int i, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.OooOoo.OooO0Oo(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final boolean OooOOO0(View view, int i, int i2) {
        Rect rect = this.OooO0o;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void OooOOOO(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.OooOo0O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.OooOO0O = (int) motionEvent.getY(i);
            this.OooOo0O = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.OooOOOo;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean OooOOOo(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 > i4) {
            i6 = i4;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z2 = false;
                if (z2 && !this.OooOoo.OooO0o(1)) {
                    this.OooO0oO.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (z2) {
            this.OooO0oO.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOo(int r19, int r20, int r21) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int r3 = r18.getHeight()
            int r4 = r18.getScrollY()
            int r3 = r3 + r4
            r5 = 33
            if (r0 != r5) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            r8 = 2
            r9 = r18
            java.util.ArrayList r8 = r9.getFocusables(r8)
            int r10 = r8.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r8.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r6 = r14.getBottom()
            if (r1 >= r6) goto L69
            if (r15 >= r2) goto L69
            if (r1 >= r15) goto L3f
            if (r6 >= r2) goto L3f
            r17 = 1
            goto L41
        L3f:
            r17 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r17
            goto L69
        L47:
            if (r5 == 0) goto L4f
            int r7 = r11.getTop()
            if (r15 < r7) goto L57
        L4f:
            if (r5 != 0) goto L59
            int r7 = r11.getBottom()
            if (r6 <= r7) goto L59
        L57:
            r6 = 1
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r17 == 0) goto L69
            if (r6 == 0) goto L69
            goto L68
        L61:
            if (r17 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r6 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L70
            r6 = r9
            goto L71
        L70:
            r6 = r11
        L71:
            if (r1 < r4) goto L78
            if (r2 > r3) goto L78
            r16 = 0
            goto L8a
        L78:
            if (r5 == 0) goto L7d
            int r1 = r1 - r4
        L7b:
            r10 = r1
            goto L80
        L7d:
            int r1 = r2 - r3
            goto L7b
        L80:
            r11 = -1
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 1
            r9.OooOOoo(r10, r11, r12, r13, r14, r15)
            r16 = 1
        L8a:
            android.view.View r1 = r18.findFocus()
            if (r6 == r1) goto L93
            r6.requestFocus(r0)
        L93:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.OooOOo(int, int, int):boolean");
    }

    public final void OooOOo0(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.OooO0o;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        OooOOo(i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int OooOOoo(int r21, int r22, android.view.MotionEvent r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.OooOOoo(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    public final void OooOo0(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.OooO0o0 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.OooO0oO.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                this.OooOoo.OooO0oO(2, 1);
            } else {
                OooOo0o(1);
            }
            this.OooOoO = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.OooO0oO;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                OooOo0o(1);
            }
            scrollBy(i, i2);
        }
        this.OooO0o0 = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean OooOo00(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fOooO00o = qq2.OooO00o(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.OooO0Oo * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = Oooo000;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fOooO00o;
    }

    public final boolean OooOo0O(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.OooO0oo;
        if (qq2.OooO00o(edgeEffect) != 0.0f) {
            qq2.OooO0O0(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.OooO;
        if (qq2.OooO00o(edgeEffect2) == 0.0f) {
            return z;
        }
        qq2.OooO0O0(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void OooOo0o(int i) {
        this.OooOoo.OooO0oo(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            qa.OooO0o("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || OooO(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.OooOoo.OooO00o(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.OooOoo.OooO0O0(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.OooOoo.OooO0OO(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.OooOoo.OooO0Oo(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.OooO0oo;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.OooO;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        qw0 qw0Var = this.OooOoo0;
        return qw0Var.OooO0O0 | qw0Var.OooO00o;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.OooOooO == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                qa.OooO0o("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.OooOooO = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.OooOooO;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.OooOoo.OooO0o(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.OooOoo.OooO0Oo;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.OooOOO0 = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.OooOOOO) {
            if (mw2.OooO00o(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i = 9;
                width = (int) motionEvent.getX();
            } else if (mw2.OooO00o(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                OooOOoo(-((int) (getVerticalScrollFactorCompat() * axisValue)), i, motionEvent, width, 1, mw2.OooO00o(motionEvent, 8194));
                if (i == 0) {
                    return true;
                }
                this.OooOooo.OooO00o(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.OooOO0o = false;
        View view = this.OooOOO;
        if (view != null && OooOO0o(view, this)) {
            View view2 = this.OooOOO;
            Rect rect = this.OooO0o;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iOooO0oo = OooO0oo(rect);
            if (iOooO0oo != 0) {
                scrollBy(0, iOooO0oo);
            }
        }
        this.OooOOO = null;
        if (!this.OooOOO0) {
            if (this.OooOoOO != null) {
                scrollTo(getScrollX(), this.OooOoOO.OooO0Oo);
                this.OooOoOO = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.OooOOO0 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.OooOOo0 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        OooOO0((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.OooOoo.OooO0O0(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.OooOoo.OooO0OO(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        OooOOO(null, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        OooO0Oo(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && OooOOO0(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof lw0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        lw0 lw0Var = (lw0) parcelable;
        super.onRestoreInstanceState(lw0Var.getSuperState());
        this.OooOoOO = lw0Var;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        lw0 lw0Var = new lw0(super.onSaveInstanceState());
        lw0Var.OooO0Oo = getScrollY();
        return lw0Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !OooOOO0(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.OooO0o;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iOooO0oo = OooO0oo(rect);
        if (iOooO0oo != 0) {
            if (this.OooOOo) {
                OooOo0(0, iOooO0oo, false);
            } else {
                scrollBy(0, iOooO0oo);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return OooO0OO(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        OooO0o0(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.OooOO0o) {
            this.OooOOO = view2;
        } else {
            Rect rect = this.OooO0o;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iOooO0oo = OooO0oo(rect);
            if (iOooO0oo != 0) {
                scrollBy(0, iOooO0oo);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iOooO0oo = OooO0oo(rect);
        boolean z2 = iOooO0oo != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iOooO0oo);
                return z2;
            }
            OooOo0(0, iOooO0oo, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.OooOOOo) != null) {
            velocityTracker.recycle();
            this.OooOOOo = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.OooOO0o = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.OooOOo0) {
            this.OooOOo0 = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        nw0 nw0Var = this.OooOoo;
        if (nw0Var.OooO0Oo) {
            ViewGroup viewGroup = nw0Var.OooO0OO;
            WeakHashMap weakHashMap = nt1.OooO00o;
            ft1.OooOO0o(viewGroup);
        }
        nw0Var.OooO0Oo = z;
    }

    public void setOnScrollChangeListener(kw0 kw0Var) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.OooOOo = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.OooOoo.OooO0oO(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        OooOo0o(0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            qa.OooO0o("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            qa.OooO0o("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            qa.OooO0o("ScrollView can host only one direct child");
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.cmaster.cloner.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
