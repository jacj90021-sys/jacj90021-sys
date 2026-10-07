package com.cmaster.cloner;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z6 implements Handler.Callback {
    public final /* synthetic */ int OooO0Oo;

    public /* synthetic */ z6(int i) {
        this.OooO0Oo = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        switch (this.OooO0Oo) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    f7 f7Var = (f7) message.obj;
                    e7 e7Var = f7Var.OooO;
                    if (e7Var.getParent() == null) {
                        ViewGroup.LayoutParams layoutParams = e7Var.getLayoutParams();
                        if (layoutParams instanceof oj) {
                            oj ojVar = (oj) layoutParams;
                            BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                            xb1 xb1Var = baseTransientBottomBar$Behavior.OooO;
                            xb1Var.getClass();
                            xb1Var.OooO0o0 = f7Var.OooOOoo;
                            baseTransientBottomBar$Behavior.OooO0O0 = new ay1(f7Var, 10);
                            ojVar.OooO0O0(baseTransientBottomBar$Behavior);
                            ojVar.OooO0oO = 80;
                        }
                        ViewGroup viewGroup = f7Var.OooO0oO;
                        e7Var.OooOOO = true;
                        viewGroup.addView(e7Var);
                        e7Var.OooOOO = false;
                        f7Var.OooO0o0();
                        e7Var.setVisibility(4);
                    }
                    if (e7Var.isLaidOut()) {
                        f7Var.OooO0Oo();
                        return true;
                    }
                    f7Var.OooOOo0 = true;
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                f7 f7Var2 = (f7) message.obj;
                int i2 = message.arg1;
                e7 e7Var2 = f7Var2.OooO;
                AccessibilityManager accessibilityManager = f7Var2.OooOOo;
                if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || e7Var2.getVisibility() != 0) {
                    f7Var2.OooO0O0();
                    return true;
                }
                if (e7Var2.getAnimationMode() == 1) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setInterpolator(f7Var2.OooO0Oo);
                    valueAnimatorOfFloat.addUpdateListener(new y6(f7Var2, 0));
                    valueAnimatorOfFloat.setDuration(f7Var2.OooO0O0);
                    valueAnimatorOfFloat.addListener(new x6(f7Var2, i2, 0));
                    valueAnimatorOfFloat.start();
                    return true;
                }
                ValueAnimator valueAnimator = new ValueAnimator();
                e7 e7Var3 = f7Var2.OooO;
                int height = e7Var3.getHeight();
                ViewGroup.LayoutParams layoutParams2 = e7Var3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                valueAnimator.setIntValues(0, height);
                valueAnimator.setInterpolator(f7Var2.OooO0o0);
                valueAnimator.setDuration(f7Var2.OooO0OO);
                valueAnimator.addListener(new x6(f7Var2, i2, 2));
                valueAnimator.addUpdateListener(new y6(f7Var2, 3));
                valueAnimator.start();
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((fa1) message.obj).OooO0O0();
                return true;
        }
    }
}
