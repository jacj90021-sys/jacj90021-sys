package com.cmaster.cloner;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class a80 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public final /* synthetic */ int OooO0o0;

    public /* synthetic */ a80(int i, int i2, Object obj) {
        this.OooO0Oo = i2;
        this.OooO0o = obj;
        this.OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO0Oo) {
            case 0:
                String str = (String) this.OooO0o;
                int i = this.OooO0o0;
                HashSet hashSet = hz.OooO00o;
                if (!hashSet.contains(str)) {
                    jv1 jv1Var = jv1.OooO0O0;
                    synchronized (jv1Var) {
                        jv1Var.OooO00o.OooO0O0(jv1.OooO0OO, str + sn2.OooO00o("QQ==\n", "AdgYKfWLBRs=\n") + i);
                    }
                    try {
                        a02.OooO0oo.OoooOO0(i, str);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    jv1 jv1Var2 = jv1.OooO0O0;
                    synchronized (jv1Var2) {
                        jv1Var2.OooO00o.OooO0O0(jv1.OooO0OO, str2 + sn2.OooO00o("QQ==\n", "AdgYKfWLBRs=\n") + i);
                    }
                    try {
                        a02.OooO0oo.OoooOO0(i, str2);
                    } catch (Exception unused2) {
                    }
                }
                return;
            case 1:
                ((py2) this.OooO0o).OooO0O0(this.OooO0o0);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.OooO0o;
                int i2 = this.OooO0o0;
                View view = (View) sideSheetBehavior.OooOOOo.get();
                if (view != null) {
                    sideSheetBehavior.OooOoO(view, i2, false);
                    return;
                }
                return;
        }
    }
}
