package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w8 extends n53 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ lj OooO0O0;

    public /* synthetic */ w8(lj ljVar, int i) {
        this.OooO00o = i;
        this.OooO0O0 = ljVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    @Override // com.cmaster.cloner.n53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.OooO00o
            r1 = 1
            com.cmaster.cloner.lj r4 = r4.OooO0O0
            r2 = 0
            switch(r0) {
                case 0: goto L1d;
                default: goto L9;
            }
        L9:
            com.google.android.material.sidesheet.SideSheetBehavior r4 = (com.google.android.material.sidesheet.SideSheetBehavior) r4
            int r6 = r4.OooO0oo
            if (r6 != r1) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r4 = r4.OooOOOo
            if (r4 == 0) goto L1b
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            return r1
        L1d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4
            int r0 = r4.Oooo0oO
            if (r0 != r1) goto L24
            goto L54
        L24:
            boolean r3 = r4.OooooO0
            if (r3 == 0) goto L29
            goto L54
        L29:
            r3 = 3
            if (r0 != r3) goto L46
            int r0 = r4.Ooooo00
            if (r0 != r6) goto L46
            java.lang.ref.WeakReference r6 = r4.OoooOOo
            if (r6 == 0) goto L3b
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3c
        L3b:
            r6 = 0
        L3c:
            if (r6 == 0) goto L46
            r0 = -1
            boolean r6 = r6.canScrollVertically(r0)
            if (r6 == 0) goto L46
            goto L54
        L46:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r4 = r4.OoooOOO
            if (r4 == 0) goto L54
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L54
            goto L55
        L54:
            r1 = r2
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.w8.OooO(android.view.View, int):boolean");
    }

    @Override // com.cmaster.cloner.n53
    public final int OooO00o(View view, int i) {
        int iOooO00o;
        int i2;
        switch (this.OooO00o) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.OooO0O0;
                ol0 ol0Var = sideSheetBehavior.OooO00o;
                switch (ol0Var.OooO00o) {
                    case 0:
                        iOooO00o = -ol0Var.OooO0O0.OooOO0o;
                        break;
                    default:
                        iOooO00o = ol0Var.OooO00o();
                        break;
                }
                ol0 ol0Var2 = sideSheetBehavior.OooO00o;
                switch (ol0Var2.OooO00o) {
                    case 0:
                        i2 = ol0Var2.OooO0O0.OooOOOO;
                        break;
                    default:
                        i2 = ol0Var2.OooO0O0.OooOOO0;
                        break;
                }
                return cw2.OooO0O0(i, iOooO00o, i2);
        }
    }

    @Override // com.cmaster.cloner.n53
    public final int OooO0O0(View view, int i) {
        switch (this.OooO00o) {
            case 0:
                return cw2.OooO0O0(i, ((BottomSheetBehavior) this.OooO0O0).OooOooO(), OooO0Oo());
            default:
                return view.getTop();
        }
    }

    @Override // com.cmaster.cloner.n53
    public int OooO0OO(View view) {
        switch (this.OooO00o) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.OooO0O0;
                return sideSheetBehavior.OooOO0o + sideSheetBehavior.OooOOOO;
            default:
                return super.OooO0OO(view);
        }
    }

    @Override // com.cmaster.cloner.n53
    public int OooO0Oo() {
        switch (this.OooO00o) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.OooO0O0;
                return bottomSheetBehavior.Oooo0 ? bottomSheetBehavior.o000oOoO : bottomSheetBehavior.Oooo00O;
            default:
                return super.OooO0Oo();
        }
    }

    @Override // com.cmaster.cloner.n53
    public final void OooO0o(int i) {
        int i2 = this.OooO00o;
        lj ljVar = this.OooO0O0;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ljVar;
                    if (bottomSheetBehavior.Oooo0OO) {
                        bottomSheetBehavior.Oooo0OO(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ljVar;
                    if (sideSheetBehavior.OooO0oO) {
                        sideSheetBehavior.OooOo(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.n53
    public final void OooO0oO(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.OooO00o;
        lj ljVar = this.OooO0O0;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) ljVar).OooOoO(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ljVar;
                WeakReference weakReference = sideSheetBehavior.OooOOo0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    ol0 ol0Var = sideSheetBehavior.OooO00o;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (ol0Var.OooO00o) {
                        case 0:
                            if (left <= ol0Var.OooO0O0.OooOOO0) {
                                marginLayoutParams.leftMargin = right;
                                break;
                            }
                            break;
                        default:
                            int i4 = ol0Var.OooO0O0.OooOOO0;
                            if (left <= i4) {
                                marginLayoutParams.rightMargin = i4 - left;
                                break;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.OooOo0O;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                ol0 ol0Var2 = sideSheetBehavior.OooO00o;
                switch (ol0Var2.OooO00o) {
                    case 0:
                        ol0Var2.OooO0O0();
                        ol0Var2.OooO00o();
                        break;
                    default:
                        int i5 = ol0Var2.OooO0O0.OooOOO0;
                        ol0Var2.OooO00o();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw px0.OooOO0o(it);
                }
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0062. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013c A[PHI: r2
      0x013c: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v1 int), (r2v0 int), (r2v0 int) binds: [B:108:0x01c6, B:100:0x01a7, B:92:0x0177, B:95:0x018d, B:77:0x013a, B:75:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.cmaster.cloner.n53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oo(android.view.View r9, float r10, float r11) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.w8.OooO0oo(android.view.View, float, float):void");
    }
}
