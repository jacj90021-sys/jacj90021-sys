package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.cmaster.cloner.R;
import com.cmaster.cloner.eg0;
import com.cmaster.cloner.fd;
import com.cmaster.cloner.gs1;
import com.cmaster.cloner.h;
import com.cmaster.cloner.hd;
import com.cmaster.cloner.hs1;
import com.cmaster.cloner.jd;
import com.cmaster.cloner.ld;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.ta1;
import com.cmaster.cloner.u6;
import com.cmaster.cloner.yp;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class CircularProgressIndicator extends u6 {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ld ldVar = this.OooO0Oo;
        fd fdVar = new fd(ldVar);
        Context context2 = getContext();
        h jdVar = ldVar.OooOOOO == 1 ? new jd(context2, ldVar) : new hd(ldVar);
        eg0 eg0Var = new eg0(context2, ldVar);
        eg0Var.OooOOo0 = fdVar;
        eg0Var.OooOOo = jdVar;
        jdVar.OooO0Oo = eg0Var;
        Resources resources = context2.getResources();
        hs1 hs1Var = new hs1();
        ThreadLocal threadLocal = ta1.OooO00o;
        hs1Var.OooO0Oo = resources.getDrawable(R.drawable.ic_mtrl_arrow_circle, null);
        new gs1(hs1Var.OooO0Oo.getConstantState());
        eg0Var.OooOOoo = hs1Var;
        setIndeterminateDrawable(eg0Var);
        setProgressDrawable(new yp(getContext(), ldVar, fdVar));
        this.OooOO0O = true;
    }

    public int getIndeterminateAnimationType() {
        return this.OooO0Oo.OooOOOO;
    }

    public int getIndicatorDirection() {
        return this.OooO0Oo.OooOOo;
    }

    public int getIndicatorInset() {
        return this.OooO0Oo.OooOOo0;
    }

    public int getIndicatorSize() {
        return this.OooO0Oo.OooOOOo;
    }

    public void setIndeterminateAnimationType(int i) {
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooOOOO == i) {
            return;
        }
        if (OooO0O0() && isIndeterminate()) {
            qa.OooO0o("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ldVar.OooOOOO = i;
        ldVar.OooO0O0();
        h jdVar = i == 1 ? new jd(getContext(), ldVar) : new hd(ldVar);
        eg0 indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.OooOOo = jdVar;
        jdVar.OooO0Oo = indeterminateDrawable;
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().OooOOo.OooOO0o(this.OooOOO);
        }
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        this.OooO0Oo.OooOOo = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooOOo0 != i) {
            ldVar.OooOOo0 = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        ld ldVar = this.OooO0Oo;
        if (ldVar.OooOOOo != iMax) {
            ldVar.OooOOOo = iMax;
            ldVar.OooO0O0();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.cmaster.cloner.u6
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        this.OooO0Oo.OooO0O0();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
