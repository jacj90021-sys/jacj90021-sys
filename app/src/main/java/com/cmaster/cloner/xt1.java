package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xt1 extends h6 implements e40, l40 {
    public int OooO0o;
    public final int OooO0o0;
    public /* synthetic */ Object OooO0oO;
    public final /* synthetic */ View OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt1(View view, gj gjVar) {
        super(gjVar);
        this.OooO0oo = view;
        if (gjVar == null || gjVar.getContext() == lv.OooO0Oo) {
            this.OooO0o0 = 2;
        } else {
            ra.OooOOO("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // com.cmaster.cloner.h6
    public final Object OooO(Object obj) throws Throwable {
        Object obj2;
        int i = this.OooO0o;
        View view = this.OooO0oo;
        Object obj3 = gk.OooO0Oo;
        if (i == 0) {
            ty2.OooO0O0(obj);
            ve1 ve1Var = (ve1) this.OooO0oO;
            this.OooO0oO = ve1Var;
            this.OooO0o = 1;
            ve1Var.OooO0o0 = view;
            ve1Var.OooO0Oo = 3;
            ve1Var.OooO0oO = this;
            return obj3;
        }
        Object obj4 = vq1.OooO00o;
        if (i != 1) {
            if (i == 2) {
                ty2.OooO0O0(obj);
                return obj4;
            }
            qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ve1 ve1Var2 = (ve1) this.OooO0oO;
        ty2.OooO0O0(obj);
        if (view instanceof ViewGroup) {
            this.OooO0oO = null;
            this.OooO0o = 2;
            ve1Var2.getClass();
            jp1 jp1Var = new jp1(new oo000o((ViewGroup) view, 1));
            if (jp1Var.OooO0o0.hasNext()) {
                ve1Var2.OooO0o = jp1Var;
                ve1Var2.OooO0Oo = 2;
                ve1Var2.OooO0oO = this;
                obj2 = obj3;
            } else {
                obj2 = obj4;
            }
            if (obj2 != obj3) {
                obj2 = obj4;
            }
            if (obj2 == obj3) {
                return obj3;
            }
        }
        return obj4;
    }

    @Override // com.cmaster.cloner.l40
    public final int OooO0O0() {
        return this.OooO0o0;
    }

    @Override // com.cmaster.cloner.e40
    public final Object OooO0oO(Object obj, Object obj2) {
        return ((xt1) OooO0oo((gj) obj2, (ve1) obj)).OooO(vq1.OooO00o);
    }

    @Override // com.cmaster.cloner.h6
    public final gj OooO0oo(gj gjVar, Object obj) {
        xt1 xt1Var = new xt1(this.OooO0oo, gjVar);
        xt1Var.OooO0oO = obj;
        return xt1Var;
    }

    @Override // com.cmaster.cloner.gj
    public final vj getContext() {
        return lv.OooO0Oo;
    }

    @Override // com.cmaster.cloner.h6
    public final String toString() {
        if (this.OooO0Oo != null) {
            return super.toString();
        }
        r81.OooO00o.getClass();
        return s81.OooO00o(this);
    }
}
