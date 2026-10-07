package com.cmaster.cloner;

import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ry extends ef1 {
    public Handler OooOO0O;

    @Override // com.cmaster.cloner.x7, com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        t43.OooO0OO(yqVar);
        if (Messenger.class.isAssignableFrom(yqVar.OooO0o0.getReturnType())) {
            if (this.OooOO0O == null) {
                this.OooOO0O = new Handler(Looper.getMainLooper());
            }
            yqVar.OooO0oo(new Messenger(this.OooOO0O));
        }
    }

    @Override // com.cmaster.cloner.i80
    public final boolean OooO0OO() {
        return true;
    }
}
