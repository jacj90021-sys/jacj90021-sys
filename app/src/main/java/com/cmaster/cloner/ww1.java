package com.cmaster.cloner;

import android.database.IContentObserver;
import android.net.Uri;
import android.os.IBinder;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ww1 {
    public final String OooO00o;
    public final ArrayList OooO0O0 = new ArrayList();
    public final ArrayList OooO0OO = new ArrayList();

    public ww1(String str) {
        this.OooO00o = str;
    }

    public final void OooO00o(Uri uri, int i, IContentObserver iContentObserver, boolean z, Object obj, int i2) {
        if (i == (uri == null ? 0 : uri.getPathSegments().size() + 1)) {
            this.OooO0OO.add(new vw1(this, iContentObserver, z, obj, i2));
            return;
        }
        String authority = uri != null ? i == 0 ? uri.getAuthority() : uri.getPathSegments().get(i - 1) : null;
        if (authority == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(u7.OooO00o(new byte[]{17, 96, -43, -63, -103, 96, -114, -38, 13, 124, -54, -128, -35}, new byte[]{88, 14, -93, -96, -11, 9, -22, -6}));
            sb.append(uri);
            ra.OooOOO(rj.OooO0oo(new byte[]{107, -27, 63, -21, -64, 79, 99, -77, 45, -73, 106, -9, -57, 88, 38, -89, 52, -96, 56}, new byte[]{66, -59, 74, -104, -91, 43, 67, -43}, sb));
            return;
        }
        ArrayList arrayList = this.OooO0O0;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ww1 ww1Var = (ww1) arrayList.get(i3);
            if (ww1Var.OooO00o.equals(authority)) {
                ww1Var.OooO00o(uri, i + 1, iContentObserver, z, obj, i2);
                return;
            }
        }
        ww1 ww1Var2 = new ww1(authority);
        arrayList.add(ww1Var2);
        ww1Var2.OooO00o(uri, i + 1, iContentObserver, z, obj, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0O0(boolean r10, android.database.IContentObserver r11, boolean r12, int r13, int r14, java.util.ArrayList r15) {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.OooO0OO
            int r1 = r0.size()
            if (r11 != 0) goto La
            r11 = 0
            goto Le
        La:
            android.os.IBinder r11 = r11.asBinder()
        Le:
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L4c
            java.lang.Object r4 = r0.get(r3)
            com.cmaster.cloner.vw1 r4 = (com.cmaster.cloner.vw1) r4
            android.database.IContentObserver r5 = r4.OooO0Oo
            boolean r6 = r4.OooO0o0
            int r7 = r4.OooO0o
            android.os.IBinder r5 = r5.asBinder()
            if (r5 != r11) goto L26
            r5 = 1
            goto L27
        L26:
            r5 = r2
        L27:
            if (r5 == 0) goto L2c
            if (r12 != 0) goto L2c
            goto L49
        L2c:
            r8 = -1
            if (r14 == r8) goto L33
            if (r7 == r8) goto L33
            if (r14 != r7) goto L49
        L33:
            if (r10 == 0) goto L3c
            r7 = r13 & 2
            if (r7 == 0) goto L3f
            if (r6 == 0) goto L3f
            goto L49
        L3c:
            if (r6 != 0) goto L3f
            goto L49
        L3f:
            com.cmaster.cloner.uw1 r6 = new com.cmaster.cloner.uw1
            android.database.IContentObserver r4 = r4.OooO0Oo
            r6.<init>(r9, r4, r5)
            r15.add(r6)
        L49:
            int r3 = r3 + 1
            goto L10
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ww1.OooO0O0(boolean, android.database.IContentObserver, boolean, int, int, java.util.ArrayList):void");
    }

    public final void OooO0OO(Uri uri, int i, IContentObserver iContentObserver, boolean z, int i2, int i3, ArrayList arrayList) {
        int size = uri == null ? 0 : uri.getPathSegments().size() + 1;
        if (i >= size) {
            OooO0O0(true, iContentObserver, z, i2, i3, arrayList);
        } else if (i < size) {
            authority = uri != null ? i == 0 ? uri.getAuthority() : uri.getPathSegments().get(i - 1) : null;
            OooO0O0(false, iContentObserver, z, i2, i3, arrayList);
        }
        ArrayList arrayList2 = this.OooO0O0;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ww1 ww1Var = (ww1) arrayList2.get(i4);
            if (authority == null || ww1Var.OooO00o.equals(authority)) {
                ww1Var.OooO0OO(uri, i + 1, iContentObserver, z, i2, i3, arrayList);
                if (authority != null) {
                    return;
                }
            }
        }
    }

    public final boolean OooO0Oo(IContentObserver iContentObserver) {
        ArrayList arrayList = this.OooO0O0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            if (((ww1) arrayList.get(i)).OooO0Oo(iContentObserver)) {
                arrayList.remove(i);
                i--;
                size--;
            }
            i++;
        }
        IBinder iBinderAsBinder = iContentObserver.asBinder();
        ArrayList arrayList2 = this.OooO0OO;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                break;
            }
            vw1 vw1Var = (vw1) arrayList2.get(i2);
            if (vw1Var.OooO0Oo.asBinder() == iBinderAsBinder) {
                arrayList2.remove(i2);
                iBinderAsBinder.unlinkToDeath(vw1Var, 0);
                break;
            }
            i2++;
        }
        return arrayList.size() == 0 && arrayList2.size() == 0;
    }
}
