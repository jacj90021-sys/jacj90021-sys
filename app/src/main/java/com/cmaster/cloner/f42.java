package com.cmaster.cloner;

import android.app.Activity;
import android.os.Bundle;
import org.json.JSONException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f42 extends lz2 {
    public final /* synthetic */ int OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f42(Activity activity, int i) {
        super(activity);
        this.OooOoOO = i;
    }

    @Override // com.cmaster.cloner.lz2, com.google.android.gms.internal.ads.zzbtq
    public void zzl(Bundle bundle) throws JSONException, nm2 {
        switch (this.OooOoOO) {
            case 4:
                uh2.OooO00o("AdOverlayParcel is null or does not contain valid overlay type.");
                this.OooOoO0 = 4;
                this.OooO0Oo.finish();
                break;
            default:
                super.zzl(bundle);
                break;
        }
    }
}
