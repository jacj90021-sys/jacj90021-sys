package com.cmaster.cloner;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jo implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ qo OooO0o;
    public final /* synthetic */ ArrayList OooO0o0;

    public /* synthetic */ jo(qo qoVar, ArrayList arrayList, int i) {
        this.OooO0Oo = i;
        this.OooO0o = qoVar;
        this.OooO0o0 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        int i = this.OooO0Oo;
        int i2 = 0;
        ArrayList arrayList = this.OooO0o0;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    qo qoVar = this.OooO0o;
                    if (i2 >= size) {
                        arrayList.clear();
                        qoVar.OooOOO0.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        po poVar = (po) obj;
                        y71 y71Var = poVar.OooO00o;
                        int i3 = poVar.OooO0O0;
                        int i4 = poVar.OooO0OO;
                        int i5 = poVar.OooO0Oo;
                        int i6 = poVar.OooO0o0;
                        qoVar.getClass();
                        View view = y71Var.OooO00o;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        qoVar.OooOOOo.add(y71Var);
                        viewPropertyAnimatorAnimate.setDuration(qoVar.OooO0o0).setListener(new lo(qoVar, y71Var, i7, view, i8, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    qo qoVar2 = this.OooO0o;
                    if (i2 >= size2) {
                        arrayList.clear();
                        qoVar2.OooOOO.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        no noVar = (no) obj2;
                        ArrayList arrayList2 = qoVar2.OooOOo;
                        long j = qoVar2.OooO0o;
                        y71 y71Var2 = noVar.OooO00o;
                        View view2 = y71Var2 == null ? null : y71Var2.OooO00o;
                        y71 y71Var3 = noVar.OooO0O0;
                        View view3 = y71Var3 != null ? y71Var3.OooO00o : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(noVar.OooO00o);
                            duration.translationX(noVar.OooO0o0 - noVar.OooO0OO);
                            duration.translationY(noVar.OooO0o - noVar.OooO0Oo);
                            duration.alpha(0.0f).setListener(new mo(qoVar2, noVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList2.add(noVar.OooO0O0);
                            c = 0;
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new mo(qoVar2, noVar, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    qo qoVar3 = this.OooO0o;
                    if (i2 >= size3) {
                        arrayList.clear();
                        qoVar3.OooOO0o.remove(arrayList);
                        break;
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        y71 y71Var4 = (y71) obj3;
                        qoVar3.getClass();
                        View view4 = y71Var4.OooO00o;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        qoVar3.OooOOOO.add(y71Var4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(qoVar3.OooO0OO).setListener(new ko(qoVar3, y71Var4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
