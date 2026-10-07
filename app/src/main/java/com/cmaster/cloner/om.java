package com.cmaster.cloner;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class om implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int OooO0Oo = 2;
    public final Object OooO0o0;

    public om(pm pmVar) {
        this.OooO0o0 = new WeakReference(pmVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        int i = this.OooO0Oo;
        int i2 = 0;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                pm pmVar = (pm) ((WeakReference) obj).get();
                if (pmVar != null) {
                    ArrayList arrayList = pmVar.OooO0O0;
                    View view = pmVar.OooO00o;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iOooO00o = pmVar.OooO00o(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iOooO00o2 = pmVar.OooO00o(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if ((iOooO00o > 0 || iOooO00o == Integer.MIN_VALUE) && (iOooO00o2 > 0 || iOooO00o2 == Integer.MIN_VALUE)) {
                            ArrayList arrayList2 = new ArrayList(arrayList);
                            int size = arrayList2.size();
                            while (i2 < size) {
                                Object obj2 = arrayList2.get(i2);
                                i2++;
                                ((kh1) obj2).OooOOO0(iOooO00o, iOooO00o2);
                            }
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(pmVar.OooO0OO);
                            }
                            pmVar.OooO0OO = null;
                            arrayList.clear();
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                ku1 ku1Var = (ku1) ((WeakReference) obj).get();
                if (ku1Var != null) {
                    ArrayList arrayList3 = ku1Var.OooO0O0;
                    View view2 = ku1Var.OooO00o;
                    if (!arrayList3.isEmpty()) {
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int iOooO00o3 = ku1Var.OooO00o(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        int iOooO00o4 = ku1Var.OooO00o(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if ((iOooO00o3 > 0 || iOooO00o3 == Integer.MIN_VALUE) && (iOooO00o4 > 0 || iOooO00o4 == Integer.MIN_VALUE)) {
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            int size2 = arrayList4.size();
                            while (i2 < size2) {
                                Object obj3 = arrayList4.get(i2);
                                i2++;
                                ((kh1) obj3).OooOOO0(iOooO00o3, iOooO00o4);
                            }
                            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                            if (viewTreeObserver2.isAlive()) {
                                viewTreeObserver2.removeOnPreDrawListener(ku1Var.OooO0OO);
                            }
                            ku1Var.OooO0OO = null;
                            arrayList3.clear();
                            break;
                        }
                    }
                }
                break;
            default:
                ((CoordinatorLayout) obj).OooOOo0(0);
                break;
        }
        return true;
    }

    public om(ku1 ku1Var) {
        this.OooO0o0 = new WeakReference(ku1Var);
    }

    public om(CoordinatorLayout coordinatorLayout) {
        this.OooO0o0 = coordinatorLayout;
    }
}
