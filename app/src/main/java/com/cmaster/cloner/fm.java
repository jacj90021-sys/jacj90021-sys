package com.cmaster.cloner;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.customtabs.ICustomTabsCallback;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fm extends ICustomTabsCallback.Stub {
    public final Handler OooO0Oo = new Handler(Looper.getMainLooper());
    public final /* synthetic */ zl OooO0o0;

    public fm(zl zlVar) {
        this.OooO0o0 = zlVar;
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void extraCallback(String str, Bundle bundle) {
        if (this.OooO0o0 == null) {
            return;
        }
        this.OooO0Oo.post(new bm(this, str, bundle, 0));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        zl zlVar = this.OooO0o0;
        if (zlVar == null) {
            return null;
        }
        return zlVar.extraCallbackWithResult(str, bundle);
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        if (this.OooO0o0 == null) {
            return;
        }
        this.OooO0Oo.post(new em(this, i, i2, i3, i4, i5, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onActivityResized(int i, int i2, Bundle bundle) {
        if (this.OooO0o0 == null) {
            return;
        }
        this.OooO0Oo.post(new dm(this, i, i2, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle) {
        if (this.OooO0o0 == null) {
            return;
        }
        this.OooO0Oo.post(new am(this, bundle, 1));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onMinimized(Bundle bundle) {
        if (this.OooO0o0 == null) {
            return;
        }
        this.OooO0Oo.post(new am(this, bundle, 3));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        if (this.OooO0o0 == null) {
            return;
        }
        this.OooO0Oo.post(new n0(this, i, bundle, 4));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onPostMessage(String str, Bundle bundle) {
        if (this.OooO0o0 == null) {
            return;
        }
        this.OooO0Oo.post(new bm(this, str, bundle, 1));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        if (this.OooO0o0 == null) {
            return;
        }
        this.OooO0Oo.post(new cm(this, i, uri, z, bundle));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onUnminimized(Bundle bundle) {
        if (this.OooO0o0 == null) {
            return;
        }
        this.OooO0Oo.post(new am(this, bundle, 0));
    }

    @Override // android.support.customtabs.ICustomTabsCallback
    public final void onWarmupCompleted(Bundle bundle) {
        if (this.OooO0o0 == null) {
            return;
        }
        this.OooO0Oo.post(new am(this, bundle, 2));
    }
}
