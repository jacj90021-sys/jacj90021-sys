package com.cmaster.cloner;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qg0 extends InputConnectionWrapper {
    public final /* synthetic */ pg0 OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg0(InputConnection inputConnection, pg0 pg0Var) {
        super(inputConnection, false);
        this.OooO00o = pg0Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ay1 ay1Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            ay1Var = new ay1(new sg0(inputContentInfo), 26);
        }
        if (this.OooO00o.OooO00o(ay1Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
