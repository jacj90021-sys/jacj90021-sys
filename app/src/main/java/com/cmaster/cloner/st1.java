package com.cmaster.cloner;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class st1 {
    public static final tj0 OooOo0O = new tj0(3);
    public int[] OooO;
    public int OooO00o;
    public final int OooO0O0;
    public float[] OooO0Oo;
    public float[] OooO0o;
    public float[] OooO0o0;
    public float[] OooO0oO;
    public int[] OooO0oo;
    public int[] OooOO0;
    public int OooOO0O;
    public VelocityTracker OooOO0o;
    public final float OooOOO;
    public final float OooOOO0;
    public final int OooOOOO;
    public final OverScroller OooOOOo;
    public View OooOOo;
    public final n53 OooOOo0;
    public boolean OooOOoo;
    public final CoordinatorLayout OooOo00;
    public int OooO0OO = -1;
    public final u91 OooOo0 = new u91(this, 8);

    public st1(Context context, CoordinatorLayout coordinatorLayout, n53 n53Var) {
        if (n53Var == null) {
            ra.OooOOO("Callback may not be null");
            throw null;
        }
        this.OooOo00 = coordinatorLayout;
        this.OooOOo0 = n53Var;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.OooOOOO = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.OooO0O0 = viewConfiguration.getScaledTouchSlop();
        this.OooOOO0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.OooOOO = viewConfiguration.getScaledMinimumFlingVelocity();
        this.OooOOOo = new OverScroller(context, OooOo0O);
    }

    public final boolean OooO(int i) {
        if ((this.OooOO0O & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void OooO00o() {
        this.OooO0OO = -1;
        float[] fArr = this.OooO0Oo;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.OooO0o0, 0.0f);
            Arrays.fill(this.OooO0o, 0.0f);
            Arrays.fill(this.OooO0oO, 0.0f);
            Arrays.fill(this.OooO0oo, 0);
            Arrays.fill(this.OooO, 0);
            Arrays.fill(this.OooOO0, 0);
            this.OooOO0O = 0;
        }
        VelocityTracker velocityTracker = this.OooOO0o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.OooOO0o = null;
        }
    }

    public final void OooO0O0(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.OooOo00;
        if (parent != coordinatorLayout) {
            sa.OooO0o(coordinatorLayout, "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", ")");
            return;
        }
        this.OooOOo = view;
        this.OooO0OO = i;
        this.OooOOo0.OooO0o0(view, i);
        OooOOO(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO0OO(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L41
        L4:
            com.cmaster.cloner.n53 r1 = r3.OooOOo0
            int r4 = r1.OooO0OO(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.OooO0Oo()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            int r3 = r3.OooO0O0
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r3 = r3 * r3
            float r3 = (float) r3
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L41
            goto L40
        L29:
            if (r4 == 0) goto L35
            float r4 = java.lang.Math.abs(r5)
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L41
            goto L40
        L35:
            if (r1 == 0) goto L41
            float r4 = java.lang.Math.abs(r6)
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L41
        L40:
            return r2
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.st1.OooO0OO(android.view.View, float, float):boolean");
    }

    public final void OooO0Oo(int i) {
        float[] fArr = this.OooO0Oo;
        if (fArr != null) {
            int i2 = this.OooOO0O;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.OooO0o0[i] = 0.0f;
                this.OooO0o[i] = 0.0f;
                this.OooO0oO[i] = 0.0f;
                this.OooO0oo[i] = 0;
                this.OooO[i] = 0;
                this.OooOO0[i] = 0;
                this.OooOO0O = (~i3) & i2;
            }
        }
    }

    public final boolean OooO0o() {
        if (this.OooO00o == 2) {
            OverScroller overScroller = this.OooOOOo;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.OooOOo.getLeft();
            int top = currY - this.OooOOo.getTop();
            if (left != 0) {
                View view = this.OooOOo;
                WeakHashMap weakHashMap = nt1.OooO00o;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.OooOOo;
                WeakHashMap weakHashMap2 = nt1.OooO00o;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.OooOOo0.OooO0oO(this.OooOOo, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.OooOo00.post(this.OooOo0);
            }
        }
        return this.OooO00o == 2;
    }

    public final int OooO0o0(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.OooOo00.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final View OooO0oO(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.OooOo00;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.OooOOo0.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean OooO0oo(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.OooOOo.getLeft();
        int top = this.OooOOo.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.OooOOOo;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            OooOOO(0);
            return false;
        }
        View view = this.OooOOo;
        int i7 = (int) this.OooOOO;
        int i8 = (int) this.OooOOO0;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        n53 n53Var = this.OooOOo0;
        overScroller.startScroll(left, top, i5, i6, (int) ((OooO0o0(i6, i4, n53Var.OooO0Oo()) * f6) + (OooO0o0(i5, i3, n53Var.OooO0OO(view)) * f5)));
        OooOOO(2);
        return true;
    }

    public final void OooOO0(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            OooO00o();
        }
        if (this.OooOO0o == null) {
            this.OooOO0o = VelocityTracker.obtain();
        }
        this.OooOO0o.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewOooO0oO = OooO0oO((int) x, (int) y);
            OooOO0o(x, y, pointerId);
            OooOOo0(viewOooO0oO, pointerId);
            int i3 = this.OooO0oo[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.OooO00o == 1) {
                OooOO0O();
            }
            OooO00o();
            return;
        }
        n53 n53Var = this.OooOOo0;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.OooO00o == 1) {
                    this.OooOOoo = true;
                    n53Var.OooO0oo(this.OooOOo, 0.0f, 0.0f);
                    this.OooOOoo = false;
                    if (this.OooO00o == 1) {
                        OooOOO(0);
                    }
                }
                OooO00o();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                OooOO0o(x2, y2, pointerId2);
                if (this.OooO00o == 0) {
                    OooOOo0(OooO0oO((int) x2, (int) y2), pointerId2);
                    int i4 = this.OooO0oo[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.OooOOo;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    OooOOo0(this.OooOOo, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.OooO00o == 1 && pointerId3 == this.OooO0OO) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.OooO0OO) {
                        View viewOooO0oO2 = OooO0oO((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.OooOOo;
                        if (viewOooO0oO2 == view2 && OooOOo0(view2, pointerId4)) {
                            i = this.OooO0OO;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    OooOO0O();
                }
            }
            OooO0Oo(pointerId3);
            return;
        }
        if (this.OooO00o == 1) {
            if (OooO(this.OooO0OO)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.OooO0OO);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.OooO0o;
                int i7 = this.OooO0OO;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.OooO0oO[i7]);
                int left = this.OooOOo.getLeft() + i8;
                int top = this.OooOOo.getTop() + i9;
                int left2 = this.OooOOo.getLeft();
                int top2 = this.OooOOo.getTop();
                if (i8 != 0) {
                    left = n53Var.OooO00o(this.OooOOo, left);
                    WeakHashMap weakHashMap = nt1.OooO00o;
                    this.OooOOo.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = n53Var.OooO0O0(this.OooOOo, top);
                    WeakHashMap weakHashMap2 = nt1.OooO00o;
                    this.OooOOo.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    n53Var.OooO0oO(this.OooOOo, left, top);
                }
                OooOOO0(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (OooO(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.OooO0Oo[pointerId5];
                float f2 = y4 - this.OooO0o0[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.OooO0oo[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.OooO0oo[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.OooO0oo[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.OooO0oo[pointerId5];
                if (this.OooO00o != 1) {
                    View viewOooO0oO3 = OooO0oO((int) x4, (int) y4);
                    if (OooO0OO(viewOooO0oO3, f, f2) && OooOOo0(viewOooO0oO3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        OooOOO0(motionEvent);
    }

    public final void OooOO0O() {
        VelocityTracker velocityTracker = this.OooOO0o;
        float f = this.OooOOO0;
        velocityTracker.computeCurrentVelocity(zzbcj.zzq.zzf, f);
        float xVelocity = this.OooOO0o.getXVelocity(this.OooO0OO);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.OooOOO;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.OooOO0o.getYVelocity(this.OooO0OO);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.OooOOoo = true;
        this.OooOOo0.OooO0oo(this.OooOOo, xVelocity, f);
        this.OooOOoo = false;
        if (this.OooO00o == 1) {
            OooOOO(0);
        }
    }

    public final void OooOO0o(float f, float f2, int i) {
        float[] fArr = this.OooO0Oo;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.OooO0o0;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.OooO0o;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.OooO0oO;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.OooO0oo;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.OooO;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.OooOO0;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.OooO0Oo = fArr2;
            this.OooO0o0 = fArr3;
            this.OooO0o = fArr4;
            this.OooO0oO = fArr5;
            this.OooO0oo = iArr;
            this.OooO = iArr2;
            this.OooOO0 = iArr3;
        }
        float[] fArr9 = this.OooO0Oo;
        this.OooO0o[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.OooO0o0;
        this.OooO0oO[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.OooO0oo;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.OooOo00;
        int left = coordinatorLayout.getLeft();
        int i5 = this.OooOOOO;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.OooOO0O |= 1 << i;
    }

    public final void OooOOO(int i) {
        this.OooOo00.removeCallbacks(this.OooOo0);
        if (this.OooO00o != i) {
            this.OooO00o = i;
            this.OooOOo0.OooO0o(i);
            if (this.OooO00o == 0) {
                this.OooOOo = null;
            }
        }
    }

    public final void OooOOO0(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (OooO(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.OooO0o[pointerId] = x;
                this.OooO0oO[pointerId] = y;
            }
        }
    }

    public final boolean OooOOOO(int i, int i2) {
        if (this.OooOOoo) {
            return OooO0oo(i, i2, (int) this.OooOO0o.getXVelocity(this.OooO0OO), (int) this.OooOO0o.getYVelocity(this.OooO0OO));
        }
        qa.OooO0o("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOOo(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.st1.OooOOOo(android.view.MotionEvent):boolean");
    }

    public final boolean OooOOo0(View view, int i) {
        if (view == this.OooOOo && this.OooO0OO == i) {
            return true;
        }
        if (view == null || !this.OooOOo0.OooO(view, i)) {
            return false;
        }
        this.OooO0OO = i;
        OooO0O0(view, i);
        return true;
    }
}
