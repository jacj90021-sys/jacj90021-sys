package com.cmaster.cloner;

import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class oOO00OO extends ooooO000 {
    public final /* synthetic */ int OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oOO00OO(int i, String str, String str2) {
        super(str, str2);
        this.OooO0Oo = i;
    }

    @Override // com.cmaster.cloner.ooooO000
    public final boolean OooO00o() {
        switch (this.OooO0Oo) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Build.VERSION.SDK_INT >= 26;
            case 4:
                return Build.VERSION.SDK_INT >= 27;
            case 5:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }
}
