package com.cmaster.cloner;

import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public interface oOO000 {
    Set OooO00o();

    void connect(k6 k6Var);

    void disconnect();

    void disconnect(String str);

    iz[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(w80 w80Var, Set set);

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(l6 l6Var);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
