package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class aj1 extends ze1 {
    public static final /* synthetic */ int OooOO0o = 0;
    public final HashSet OooO;
    public final ArrayList OooOO0;
    public final /* synthetic */ ho1 OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj1(ho1 ho1Var) {
        super(1);
        this.OooOO0O = ho1Var;
        this.OooO = new HashSet();
        this.OooOO0 = new ArrayList();
    }

    public final synchronized void OooO0OO(b51 b51Var) {
        if (this.OooO.add(b51Var)) {
            execute(new zi1(this, b51Var, 1));
            return;
        }
        int i = ho1.OooOOO0;
        u7.OooO00o(new byte[]{37, -99, 10, -16, -116, -99, 118, -98, 4, -116, 12, -19, -106, -118, 65, -119, 52, -99, 4, -17, -102, -101, 51, -115, 59, -118, 8, -8, -101, -112, 51, -120, 56, -106, 8, -71, -103, -122, 97, -52}, new byte[]{87, -8, 109, -103, -1, -23, 19, -20});
        String str = b51Var.OooO0Oo.packageName;
        int i2 = fp0.OooO00o;
    }
}
