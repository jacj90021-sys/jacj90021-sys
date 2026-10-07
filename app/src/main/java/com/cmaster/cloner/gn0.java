package com.cmaster.cloner;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzavu;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gn0 implements View.OnTouchListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ gn0(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                hn0 hn0Var = (hn0) obj;
                en0 en0Var = hn0Var.OooOo0;
                Handler handler = hn0Var.OooOoO0;
                u uVar = hn0Var.OooOoo;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && uVar != null && uVar.isShowing() && x >= 0 && x < uVar.getWidth() && y >= 0 && y < uVar.getHeight()) {
                    handler.postDelayed(en0Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(en0Var);
                    break;
                }
                break;
            default:
                zzavu zzavuVar = ((u93) obj).OooOO0O;
                if (zzavuVar != null) {
                    zzavuVar.zzd(motionEvent);
                    break;
                }
                break;
        }
        return false;
    }
}
