package com.cmaster.cloner;

import android.location.ILocationListener;
import android.location.Location;
import android.os.Bundle;
import android.os.IRemoteCallback;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tb0 extends ILocationListener.Stub {
    public final ILocationListener OooO0Oo;
    public String OooO0o0;

    public tb0(ILocationListener iLocationListener, String str) {
        String str2 = vb0.OooOOO;
        this.OooO0Oo = iLocationListener;
        this.OooO0o0 = str;
    }

    public final void onFlushComplete(int i) {
        this.OooO0Oo.onFlushComplete(i);
    }

    public final void onLocationChanged(List list, IRemoteCallback iRemoteCallback) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Location) it.next()).setProvider(this.OooO0o0);
            }
        }
        this.OooO0Oo.onLocationChanged(list, iRemoteCallback);
    }

    public final void onProviderDisabled(String str) {
        this.OooO0Oo.onProviderDisabled(str);
    }

    public final void onProviderEnabled(String str) {
        this.OooO0Oo.onProviderEnabled(str);
    }

    public final void onProviderEnabledChanged(String str, boolean z) {
        this.OooO0Oo.onProviderEnabledChanged(str, z);
    }

    public final void onRemoved() {
        this.OooO0Oo.onRemoved();
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
        this.OooO0Oo.onStatusChanged(str, i, bundle);
    }

    public final void onLocationChanged(Location location) {
        if (location != null) {
            location.setProvider(this.OooO0o0);
        }
        this.OooO0Oo.onLocationChanged(location);
    }
}
