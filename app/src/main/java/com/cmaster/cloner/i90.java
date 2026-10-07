package com.cmaster.cloner;

import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i90 implements jo1 {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ i90(int i) {
        this.OooO00o = i;
    }

    public static void OooO0O0(Object obj, String str) throws IllegalAccessException, IllegalArgumentException {
        String string;
        if (obj == null || str == null) {
            return;
        }
        l81 l81Var = e4.OooO0OO;
        String str2 = l81Var != null ? (String) l81Var.OooO0O0(obj) : null;
        if (str2 == null || !str2.contains(u7.OooO00o(new byte[]{-103}, new byte[]{-65, 48, -41, 124, 100, -125, -109, -61}))) {
            string = str;
        } else {
            StringBuilder sbOooOO0 = rj.OooOO0(str);
            sbOooOO0.append(u7.OooO00o(new byte[]{93}, new byte[]{123, 11, -33, -103, 43, -3, -58, -51}));
            sbOooOO0.append(t43.OooO0O0(""));
            string = sbOooOO0.toString();
        }
        if (l81Var != null) {
            l81Var.OooO0oo(obj, string);
        }
        l81 l81Var2 = e4.OooO0o0;
        Parcelable[] parcelableArr = l81Var2 != null ? (Parcelable[]) l81Var2.OooO0O0(obj) : null;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                OooO0O0(parcelable, str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a7  */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.cmaster.cloner.we0] */
    /* JADX WARN: Type inference failed for: r18v1, types: [int] */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.cmaster.cloner.yq] */
    /* JADX WARN: Type inference failed for: r2v28, types: [int] */
    @Override // com.cmaster.cloner.jo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(com.cmaster.cloner.yq r28) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 2766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.i90.OooO00o(com.cmaster.cloner.yq):void");
    }
}
