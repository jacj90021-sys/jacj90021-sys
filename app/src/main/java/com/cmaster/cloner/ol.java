package com.cmaster.cloner;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ol extends ContentObserver {
    public final /* synthetic */ yj1 OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(yj1 yj1Var) {
        super(new Handler());
        this.OooO00o = yj1Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        yj1 yj1Var = this.OooO00o;
        if (!yj1Var.OooO0o0 || (cursor = yj1Var.OooO0o) == null || cursor.isClosed()) {
            return;
        }
        yj1Var.OooO0Oo = yj1Var.OooO0o.requery();
    }
}
