package com.cmaster.cloner;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class oO000OOo {
    public abstract ls1 getSDKVersionInfo();

    public abstract ls1 getVersionInfo();

    public abstract void initialize(Context context, mg0 mg0Var, List<gu0> list);

    public void loadAppOpenAd(as0 as0Var, wr0 wr0Var) {
        wr0Var.onFailure(new o0OOO0OO(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(bs0 bs0Var, wr0 wr0Var) {
        wr0Var.onFailure(new o0OOO0OO(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(fs0 fs0Var, wr0 wr0Var) {
        wr0Var.onFailure(new o0OOO0OO(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(hs0 hs0Var, wr0 wr0Var) {
        wr0Var.onFailure(new o0OOO0OO(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(hs0 hs0Var, wr0 wr0Var) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(ks0 ks0Var, wr0 wr0Var) {
        wr0Var.onFailure(new o0OOO0OO(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(ks0 ks0Var, wr0 wr0Var) {
        wr0Var.onFailure(new o0OOO0OO(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
