package com.cmaster.cloner;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uj0 extends GestureDetector.SimpleOnGestureListener {
    public boolean OooO00o = true;
    public final /* synthetic */ vj0 OooO0O0;

    public uj0(vj0 vj0Var) {
        this.OooO0O0 = vj0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewOooOO0O;
        y71 y71VarOooo0oO;
        vj0 vj0Var = this.OooO0O0;
        o00Oo00 o00oo00 = vj0Var.OooOOOo;
        if (!this.OooO00o || (viewOooOO0O = vj0Var.OooOO0O(motionEvent)) == null || (y71VarOooo0oO = vj0Var.OooOo0.Oooo0oO(viewOooOO0O)) == null) {
            return;
        }
        RecyclerView recyclerView = vj0Var.OooOo0;
        o00oo00.getClass();
        if ((o00Oo00.OooO0OO(1028, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = vj0Var.OooOOOO;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                vj0Var.OooO0oO = x;
                vj0Var.OooO0oo = y;
                vj0Var.OooOO0o = 0.0f;
                vj0Var.OooOO0O = 0.0f;
                o00oo00.getClass();
                vj0Var.OooOOOO(y71VarOooo0oO, 2);
            }
        }
    }
}
