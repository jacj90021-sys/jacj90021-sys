package com.cmaster.cloner;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ny extends vo1 {
    public static final String[] OooOooo = {"android:visibility:visibility", "android:visibility:parent"};
    public final int OooOooO;

    public ny() {
        this.OooOooO = 3;
    }

    public static void Oooo0(fp1 fp1Var) {
        View view = fp1Var.OooO0O0;
        int visibility = view.getVisibility();
        HashMap map = fp1Var.OooO00o;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float Oooo0OO(fp1 fp1Var, float f) {
        Float f2;
        return (fp1Var == null || (f2 = (Float) fp1Var.OooO00o.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.cmaster.cloner.mv1 Oooo0o0(com.cmaster.cloner.fp1 r8, com.cmaster.cloner.fp1 r9) {
        /*
            com.cmaster.cloner.mv1 r0 = new com.cmaster.cloner.mv1
            r0.<init>()
            r1 = 0
            r0.OooO00o = r1
            r0.OooO0O0 = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.OooO00o
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.OooO0OO = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.OooO0o0 = r6
            goto L33
        L2f:
            r0.OooO0OO = r3
            r0.OooO0o0 = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.OooO00o
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.OooO0Oo = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.OooO0o = r2
            goto L56
        L52:
            r0.OooO0Oo = r3
            r0.OooO0o = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.OooO0OO
            int r9 = r0.OooO0Oo
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.OooO0o0
            android.view.ViewGroup r4 = r0.OooO0o
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.OooO0O0 = r1
            r0.OooO00o = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.OooO0O0 = r2
            r0.OooO00o = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.OooO0o
            if (r8 != 0) goto L81
            r0.OooO0O0 = r1
            r0.OooO00o = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.OooO0o0
            if (r8 != 0) goto L9f
            r0.OooO0O0 = r2
            r0.OooO00o = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.OooO0Oo
            if (r8 != 0) goto L95
            r0.OooO0O0 = r2
            r0.OooO00o = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.OooO0OO
            if (r8 != 0) goto L9f
            r0.OooO0O0 = r1
            r0.OooO00o = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ny.Oooo0o0(com.cmaster.cloner.fp1, com.cmaster.cloner.fp1):com.cmaster.cloner.mv1");
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooO0Oo(fp1 fp1Var) {
        Oooo0(fp1Var);
    }

    @Override // com.cmaster.cloner.vo1
    public final void OooO0oO(fp1 fp1Var) {
        Oooo0(fp1Var);
        View view = fp1Var.OooO0O0;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(mu1.OooO00o.OooO00o(view)) : Float.valueOf(0.0f);
        }
        fp1Var.OooO00o.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (Oooo0o0(OooOOO(r3, false), OooOOo(r3, false)).OooO00o != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0213  */
    @Override // com.cmaster.cloner.vo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator OooOO0O(android.view.ViewGroup r24, com.cmaster.cloner.fp1 r25, com.cmaster.cloner.fp1 r26) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ny.OooOO0O(android.view.ViewGroup, com.cmaster.cloner.fp1, com.cmaster.cloner.fp1):android.animation.Animator");
    }

    @Override // com.cmaster.cloner.vo1
    public final String[] OooOOo0() {
        return OooOooo;
    }

    @Override // com.cmaster.cloner.vo1
    public final boolean OooOOoo(fp1 fp1Var, fp1 fp1Var2) {
        if (fp1Var == null && fp1Var2 == null) {
            return false;
        }
        if (fp1Var != null && fp1Var2 != null && fp1Var2.OooO00o.containsKey("android:visibility:visibility") != fp1Var.OooO00o.containsKey("android:visibility:visibility")) {
            return false;
        }
        mv1 mv1VarOooo0o0 = Oooo0o0(fp1Var, fp1Var2);
        if (mv1VarOooo0o0.OooO00o) {
            return mv1VarOooo0o0.OooO0OO == 0 || mv1VarOooo0o0.OooO0Oo == 0;
        }
        return false;
    }

    public final ObjectAnimator Oooo0O0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        mu1.OooO00o.OooO0O0(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, mu1.OooO0O0, f2);
        my myVar = new my(view);
        objectAnimatorOfFloat.addListener(myVar);
        OooOOOO().OooO00o(myVar);
        return objectAnimatorOfFloat;
    }

    public ny(int i) {
        this();
        this.OooOooO = i;
    }
}
