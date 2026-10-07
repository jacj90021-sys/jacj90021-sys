package org.chromium.support_lib_boundary;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public interface ProfileBoundaryInterface {
    CookieManager getCookieManager();

    GeolocationPermissions getGeoLocationPermissions();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();
}
