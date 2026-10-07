package com.cmaster.cloner;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tl extends jw {
    public final /* synthetic */ int OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl(iw iwVar, int i) {
        super(iwVar);
        this.OooO0o0 = i;
    }

    @Override // com.cmaster.cloner.jw
    public void OooOOo0() {
        switch (this.OooO0o0) {
            case 0:
                iw iwVar = this.OooO0O0;
                iwVar.OooOOo = null;
                CheckableImageButton checkableImageButton = iwVar.OooOO0;
                checkableImageButton.setOnLongClickListener(null);
                ut2.OooO0Oo(checkableImageButton, null);
                break;
        }
    }
}
