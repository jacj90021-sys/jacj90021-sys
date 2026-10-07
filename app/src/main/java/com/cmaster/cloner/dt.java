package com.cmaster.cloner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dt extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ et OooO0O0;

    public /* synthetic */ dt(et etVar, int i) {
        this.OooO00o = i;
        this.OooO0O0 = etVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.OooO00o) {
            case 1:
                super.onAnimationEnd(animator);
                et etVar = this.OooO0O0;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = etVar.OooOO0;
                if (arrayList != null && !etVar.OooOO0O) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((t6) obj).OooO00o(etVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                super.onAnimationStart(animator);
                et etVar = this.OooO0O0;
                ArrayList arrayList = etVar.OooOO0;
                if (arrayList != null && !etVar.OooOO0O) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((t6) obj).OooO0O0(etVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
