package com.cmaster.cloner;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.Window;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class er1 implements bl1, oy0, zy0, nr1, vh2, dg2, g2 {
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;

    public er1(Context context) {
        hx2 hx2Var;
        this.OooO0Oo = 12;
        this.OooO0o0 = new s33(context, e60.OooO0O0);
        synchronized (hx2.class) {
            try {
                if (hx2.OooO0oo == null) {
                    hx2.OooO0oo = new hx2(context.getApplicationContext());
                }
                hx2Var = hx2.OooO0oo;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.OooO0o = hx2Var;
    }

    @Override // com.cmaster.cloner.g2
    public ac3 OooO00o() {
        ac3 ac3VarOooO00o = ((s33) this.OooO0o0).OooO00o();
        nz0 nz0Var = new nz0(this, 24);
        ac3VarOooO00o.getClass();
        yc1 yc1Var = am1.OooO00o;
        ac3 ac3Var = new ac3();
        ac3VarOooO00o.OooO0O0.OooO0o0(new he2(yc1Var, nz0Var, ac3Var, 1));
        ac3VarOooO00o.OooOO0o();
        return ac3Var;
    }

    public View OooO0O0(int i, int i2, int i3, int i4) {
        ys1 ys1Var = (ys1) this.OooO0o;
        zs1 zs1Var = (zs1) this.OooO0o0;
        int iOooOOO0 = zs1Var.OooOOO0();
        int iOooOOo0 = zs1Var.OooOOo0();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewOooOoO = zs1Var.OooOoO(i);
            int iOooO0o = zs1Var.OooO0o(viewOooOoO);
            int iOooOoOO = zs1Var.OooOoOO(viewOooOoO);
            ys1Var.OooO0O0 = iOooOOO0;
            ys1Var.OooO0OO = iOooOOo0;
            ys1Var.OooO0Oo = iOooO0o;
            ys1Var.OooO0o0 = iOooOoOO;
            if (i3 != 0) {
                ys1Var.OooO00o = i3;
                if (ys1Var.OooO00o()) {
                    return viewOooOoO;
                }
            }
            if (i4 != 0) {
                ys1Var.OooO00o = i4;
                if (ys1Var.OooO00o()) {
                    view = viewOooOoO;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean OooO0OO(View view) {
        ys1 ys1Var = (ys1) this.OooO0o;
        zs1 zs1Var = (zs1) this.OooO0o0;
        int iOooOOO0 = zs1Var.OooOOO0();
        int iOooOOo0 = zs1Var.OooOOo0();
        int iOooO0o = zs1Var.OooO0o(view);
        int iOooOoOO = zs1Var.OooOoOO(view);
        ys1Var.OooO0O0 = iOooOOO0;
        ys1Var.OooO0OO = iOooOOo0;
        ys1Var.OooO0Oo = iOooO0o;
        ys1Var.OooO0o0 = iOooOoOO;
        ys1Var.OooO00o = 24579;
        return ys1Var.OooO00o();
    }

    @Override // com.cmaster.cloner.nr1
    public void OooO0Oo(q72 q72Var) {
        Activity activity = (Activity) this.OooO0o0;
        oO0o0o oo0o0o = (oO0o0o) this.OooO0o;
        q72Var.getClass();
        kd2.OooO00o();
        int i = 0;
        if (!q72Var.OooO0oo.compareAndSet(false, true)) {
            oo0o0o.OooO00o(new hm2(3, true != q72Var.OooOO0o ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").OooO00o());
            return;
        }
        ha2 ha2Var = q72Var.OooO0oO;
        k42 k42Var = ha2Var.OooO0o0;
        Objects.requireNonNull(k42Var);
        ha2Var.OooO0Oo.post(new w92(k42Var, i));
        r62 r62Var = new r62(q72Var, activity);
        q72Var.OooO00o.registerActivityLifecycleCallbacks(r62Var);
        q72Var.OooOO0O.set(r62Var);
        q72Var.OooO0O0.OooO00o = activity;
        Dialog dialog = new Dialog(activity, android.R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(q72Var.OooO0oO);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            oo0o0o.OooO00o(new hm2(3, "Activity with null windows is passed in.").OooO00o());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        h63.OooO00o(window, false);
        q72Var.OooOO0.set(oo0o0o);
        dialog.show();
        q72Var.OooO0o = dialog;
        q72Var.OooO0oO.OooO00o("UMP_messagePresented", "");
    }

    @Override // com.cmaster.cloner.lg2
    /* renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public vr1 zza() {
        return new vr1((Application) ((uf) this.OooO0o0).OooO0Oo, (s52) ((zf2) this.OooO0o).zza(), 10);
    }

    @Override // com.cmaster.cloner.bl1
    public Object OooOO0O() {
        yn1 yn1Var = (yn1) this.OooO0o0;
        g5 g5Var = (g5) this.OooO0o;
        qc1 qc1Var = (qc1) yn1Var.OooO0Oo;
        qc1Var.getClass();
        return (Iterable) qc1Var.OooO0oo(new o0O000O(qc1Var, g5Var, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    @Override // com.cmaster.cloner.oy0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.cmaster.cloner.qz1 OooOOO(android.view.View r18, com.cmaster.cloner.qz1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.OooO0o0
            com.cmaster.cloner.v8 r3 = (com.cmaster.cloner.v8) r3
            java.lang.Object r0 = r0.OooO0o
            com.cmaster.cloner.du r0 = (com.cmaster.cloner.du) r0
            int r4 = r0.OooO00o
            int r5 = r0.OooO0O0
            int r0 = r0.OooO0OO
            com.cmaster.cloner.mz1 r6 = r2.OooO00o
            r7 = 519(0x207, float:7.27E-43)
            com.cmaster.cloner.zg0 r7 = r6.OooO0o(r7)
            r8 = 32
            com.cmaster.cloner.zg0 r6 = r6.OooO0o(r8)
            java.lang.Object r8 = r3.OooO0o0
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r8
            int r9 = r7.OooO0O0
            int r10 = r7.OooO0OO
            int r11 = r7.OooO00o
            r8.OooOo0o = r9
            int r9 = r1.getLayoutDirection()
            r13 = 1
            if (r9 != r13) goto L37
            r9 = r13
            goto L38
        L37:
            r9 = 0
        L38:
            int r14 = r1.getPaddingBottom()
            int r15 = r1.getPaddingLeft()
            int r16 = r1.getPaddingRight()
            boolean r12 = r8.OooOOOO
            if (r12 == 0) goto L4f
            int r14 = r2.OooO00o()
            r8.OooOo0O = r14
            int r14 = r14 + r0
        L4f:
            boolean r0 = r8.OooOOOo
            if (r0 == 0) goto L5a
            if (r9 == 0) goto L57
            r0 = r5
            goto L58
        L57:
            r0 = r4
        L58:
            int r15 = r0 + r11
        L5a:
            boolean r0 = r8.OooOOo0
            if (r0 == 0) goto L64
            if (r9 == 0) goto L61
            goto L62
        L61:
            r4 = r5
        L62:
            int r16 = r4 + r10
        L64:
            r0 = r16
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r8.OooOOoo
            if (r5 == 0) goto L78
            int r5 = r4.leftMargin
            if (r5 == r11) goto L78
            r4.leftMargin = r11
            r5 = r13
            goto L79
        L78:
            r5 = 0
        L79:
            boolean r9 = r8.OooOo00
            if (r9 == 0) goto L84
            int r9 = r4.rightMargin
            if (r9 == r10) goto L84
            r4.rightMargin = r10
            r5 = r13
        L84:
            boolean r9 = r8.OooOo0
            if (r9 == 0) goto L91
            int r9 = r4.topMargin
            int r7 = r7.OooO0O0
            if (r9 == r7) goto L91
            r4.topMargin = r7
            goto L92
        L91:
            r13 = r5
        L92:
            if (r13 == 0) goto L97
            r1.setLayoutParams(r4)
        L97:
            int r4 = r1.getPaddingTop()
            r1.setPadding(r15, r4, r0, r14)
            boolean r0 = r3.OooO0Oo
            if (r0 == 0) goto La6
            int r1 = r6.OooO0Oo
            r8.OooOOO0 = r1
        La6:
            if (r12 != 0) goto Lac
            if (r0 == 0) goto Lab
            goto Lac
        Lab:
            return r2
        Lac:
            r8.OoooO00()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.er1.OooOOO(android.view.View, com.cmaster.cloner.qz1):com.cmaster.cloner.qz1");
    }

    @Override // com.cmaster.cloner.zy0
    public void onComplete(xl1 xl1Var) {
        ((Map) ((vr1) this.OooO0o).OooO0o).remove((yl1) this.OooO0o0);
    }

    @Override // com.cmaster.cloner.vh2
    public j83 zza(String str) {
        int i = this.OooO0Oo;
        j83 j83Var = j83.OooO0Oo;
        switch (i) {
            case 8:
                new le2((zj2) this.OooO0o0, (Context) this.OooO0o, str).start();
                break;
            default:
                yj2 yj2Var = a73.OooOO0o;
                a73 a73Var = ya3.OooOooO.OooO0OO;
                new la2((Context) this.OooO0o0, (String) this.OooO0o, str, null).zzb();
                break;
        }
        return j83Var;
    }

    public er1(vr1 vr1Var, yl1 yl1Var) {
        this.OooO0Oo = 4;
        this.OooO0o = vr1Var;
        this.OooO0o0 = yl1Var;
    }

    public /* synthetic */ er1(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
    }

    public er1(a02 a02Var) {
        this.OooO0Oo = 10;
        this.OooO0o = new ax2();
        this.OooO0o0 = a02Var;
        v03.OooOOo0();
    }

    public er1(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 6:
                break;
            default:
                d60 d60Var = d60.OooO0Oo;
                this.OooO0o0 = new SparseIntArray();
                this.OooO0o = d60Var;
                break;
        }
    }

    public er1(WorkDatabase_Impl workDatabase_Impl) {
        this.OooO0Oo = 3;
        this.OooO0o0 = workDatabase_Impl;
        this.OooO0o = new sp(workDatabase_Impl, 3);
    }

    public er1(zs1 zs1Var) {
        this.OooO0Oo = 1;
        this.OooO0o0 = zs1Var;
        ys1 ys1Var = new ys1();
        ys1Var.OooO00o = 0;
        this.OooO0o = ys1Var;
    }
}
