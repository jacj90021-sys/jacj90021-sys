package com.cmaster.cloner;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rj0 implements l71 {
    public final /* synthetic */ vj0 OooO0Oo;

    public rj0(vj0 vj0Var) {
        this.OooO0Oo = vj0Var;
    }

    @Override // com.cmaster.cloner.l71
    public final void OooO00o(MotionEvent motionEvent) {
        vj0 vj0Var = this.OooO0Oo;
        o00OOO00 o00ooo00 = vj0Var.OooOo0O;
        vj0Var.OooOoOO.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = vj0Var.OooOo0o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (vj0Var.OooOOOO == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(vj0Var.OooOOOO);
        if (iFindPointerIndex >= 0) {
            vj0Var.OooO0oo(actionMasked, iFindPointerIndex, motionEvent);
        }
        y71 y71Var = vj0Var.OooO0o;
        if (y71Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    vj0Var.OooOOOo(vj0Var.OooOOo, iFindPointerIndex, motionEvent);
                    vj0Var.OooOOO(y71Var);
                    vj0Var.OooOo0.removeCallbacks(o00ooo00);
                    o00ooo00.run();
                    vj0Var.OooOo0.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == vj0Var.OooOOOO) {
                    vj0Var.OooOOOO = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    vj0Var.OooOOOo(vj0Var.OooOOo, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = vj0Var.OooOo0o;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        vj0Var.OooOOOO(null, 0);
        vj0Var.OooOOOO = -1;
    }

    @Override // com.cmaster.cloner.l71
    public final boolean OooO0O0(MotionEvent motionEvent) {
        int iFindPointerIndex;
        vj0 vj0Var = this.OooO0Oo;
        vj0Var.OooOoOO.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        sj0 sj0Var = null;
        if (actionMasked == 0) {
            vj0Var.OooOOOO = motionEvent.getPointerId(0);
            vj0Var.OooO0oO = motionEvent.getX();
            vj0Var.OooO0oo = motionEvent.getY();
            VelocityTracker velocityTracker = vj0Var.OooOo0o;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            vj0Var.OooOo0o = VelocityTracker.obtain();
            if (vj0Var.OooO0o == null) {
                ArrayList arrayList = vj0Var.OooOOoo;
                if (!arrayList.isEmpty()) {
                    View viewOooOO0O = vj0Var.OooOO0O(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        sj0 sj0Var2 = (sj0) arrayList.get(size);
                        if (sj0Var2.OooO0o0.OooO00o == viewOooOO0O) {
                            sj0Var = sj0Var2;
                            break;
                        }
                        size--;
                    }
                }
                if (sj0Var != null) {
                    y71 y71Var = sj0Var.OooO0o0;
                    vj0Var.OooO0oO -= sj0Var.OooO;
                    vj0Var.OooO0oo -= sj0Var.OooOO0;
                    vj0Var.OooOO0(y71Var, true);
                    if (vj0Var.OooO0Oo.remove(y71Var.OooO00o)) {
                        vj0Var.OooOOOo.getClass();
                        o00Oo00.OooO0O0(y71Var);
                    }
                    vj0Var.OooOOOO(y71Var, sj0Var.OooO0o);
                    vj0Var.OooOOOo(vj0Var.OooOOo, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            vj0Var.OooOOOO = -1;
            vj0Var.OooOOOO(null, 0);
        } else {
            int i = vj0Var.OooOOOO;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                vj0Var.OooO0oo(actionMasked, iFindPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = vj0Var.OooOo0o;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return vj0Var.OooO0o != null;
    }

    @Override // com.cmaster.cloner.l71
    public final void OooO0OO(boolean z) {
        if (z) {
            this.OooO0Oo.OooOOOO(null, 0);
        }
    }
}
