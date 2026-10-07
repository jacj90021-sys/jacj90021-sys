package com.cmaster.cloner;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f22 extends l22 {
    public final /* synthetic */ Intent OooO0Oo;
    public final /* synthetic */ GoogleApiActivity OooO0o0;

    public f22(Intent intent, GoogleApiActivity googleApiActivity) {
        this.OooO0Oo = intent;
        this.OooO0o0 = googleApiActivity;
    }

    @Override // com.cmaster.cloner.l22
    public final void OooO00o() {
        Intent intent = this.OooO0Oo;
        if (intent != null) {
            this.OooO0o0.startActivityForResult(intent, 2);
        }
    }
}
