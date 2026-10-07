package com.cmaster.cloner;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xu0 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService OooO00o;

    public xu0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.OooO00o = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((zb0) iInterface).getClass();
        obj.getClass();
        this.OooO00o.OooO0o0.remove((Integer) obj);
    }
}
