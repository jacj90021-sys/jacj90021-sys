package com.cmaster.cloner;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sg0 implements tg0 {
    public final InputContentInfo OooO0Oo;

    public sg0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.OooO0Oo = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // com.cmaster.cloner.tg0
    public final Uri OooO0OO() {
        return this.OooO0Oo.getContentUri();
    }

    @Override // com.cmaster.cloner.tg0
    public final Uri OooO0o() {
        return this.OooO0Oo.getLinkUri();
    }

    @Override // com.cmaster.cloner.tg0
    public final void OooO0o0() {
        this.OooO0Oo.requestPermission();
    }

    @Override // com.cmaster.cloner.tg0
    public final Object OooOO0() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.tg0
    public final ClipDescription getDescription() {
        return this.OooO0Oo.getDescription();
    }

    public sg0(Object obj) {
        this.OooO0Oo = (InputContentInfo) obj;
    }
}
