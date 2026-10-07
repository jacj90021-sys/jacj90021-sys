package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rk2 extends d91 {
    public final /* synthetic */ int OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rk2(String str, int i) {
        super(str);
        this.OooO00o = i;
    }

    @Override // com.cmaster.cloner.d91
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        switch (this.OooO00o) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return iInterfaceQueryLocalInterface instanceof we2 ? (we2) iInterfaceQueryLocalInterface : new we2(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return iInterfaceQueryLocalInterface2 instanceof ga2 ? (ga2) iInterfaceQueryLocalInterface2 : new ga2(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                return iInterfaceQueryLocalInterface3 instanceof qc2 ? (qc2) iInterfaceQueryLocalInterface3 : new qc2(iBinder);
        }
    }
}
