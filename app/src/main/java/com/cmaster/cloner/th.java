package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class th extends View {
    public String OooO;
    public int[] OooO0Oo;
    public Context OooO0o;
    public int OooO0o0;
    public e6 OooO0oO;
    public String OooO0oo;
    public HashMap OooOO0;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(java.lang.String r6) throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            android.content.Context r0 = r5.OooO0o
            int r1 = r6.length()
            if (r1 != 0) goto La
            goto La4
        La:
            if (r0 != 0) goto Le
            goto La4
        Le:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L20
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L20:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L30
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L31
        L30:
            r1 = r2
        L31:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L58
            if (r1 == 0) goto L58
            if (r6 == 0) goto L4c
            java.util.HashMap r3 = r1.OooOOOo
            if (r3 == 0) goto L4c
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4c
            java.util.HashMap r3 = r1.OooOOOo
            java.lang.Object r3 = r3.get(r6)
            goto L4d
        L4c:
            r3 = r2
        L4d:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L58
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L59
        L58:
            r3 = 0
        L59:
            if (r3 != 0) goto L61
            if (r1 == 0) goto L61
            int r3 = r5.OooO0Oo(r1, r6)
        L61:
            if (r3 != 0) goto L6d
            java.lang.Class<com.cmaster.cloner.c61> r1 = com.cmaster.cloner.c61.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L6d
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L6d
        L6d:
            if (r3 != 0) goto L7d
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L7d:
            if (r3 == 0) goto L8c
            java.util.HashMap r0 = r5.OooOO0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.OooO0O0(r3)
            goto La4
        L8c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find id of \""
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = "\""
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ConstraintHelper"
            android.util.Log.w(r6, r5)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.th.OooO00o(java.lang.String):void");
    }

    public final void OooO0O0(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.OooO0o0 + 1;
        int[] iArr = this.OooO0Oo;
        if (i2 > iArr.length) {
            this.OooO0Oo = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.OooO0Oo;
        int i3 = this.OooO0o0;
        iArr2[i3] = i;
        this.OooO0o0 = i3 + 1;
    }

    public final void OooO0OO(String str) {
        if (str.length() == 0 || this.OooO0o == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof vh) && strTrim.equals(((vh) layoutParams).OoooOOo)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    OooO0O0(childAt.getId());
                }
            }
        }
    }

    public final int OooO0Oo(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.OooO0o.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public final void OooO0o0() {
        if (this.OooO0oO == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof vh) {
            ((vh) layoutParams).o00Ooo = this.OooO0oO;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.OooO0Oo, this.OooO0o0);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.OooO0oo;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.OooO;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.OooO0oo = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.OooO0o0 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                OooO00o(str.substring(i));
                return;
            } else {
                OooO00o(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.OooO = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.OooO0o0 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                OooO0OO(str.substring(i));
                return;
            } else {
                OooO0OO(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.OooO0oo = null;
        this.OooO0o0 = 0;
        for (int i : iArr) {
            OooO0O0(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.OooO0oo == null) {
            OooO0O0(i);
        }
    }
}
