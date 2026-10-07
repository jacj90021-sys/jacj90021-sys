package com.cmaster.cloner;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gv extends qu {
    public final /* synthetic */ int OooO00o = 0;
    public final WeakReference OooO0O0;

    public gv(EditText editText) {
        this.OooO0O0 = new WeakReference(editText);
    }

    @Override // com.cmaster.cloner.qu
    public void OooO00o() {
        switch (this.OooO00o) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.OooO0O0.get();
                if (switchCompat != null) {
                    switchCompat.OooO0OO();
                    break;
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.qu
    public final void OooO0O0() {
        int i = this.OooO00o;
        WeakReference weakReference = this.OooO0O0;
        switch (i) {
            case 0:
                hv.OooO00o((EditText) weakReference.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) weakReference.get();
                if (switchCompat != null) {
                    switchCompat.OooO0OO();
                    break;
                }
                break;
        }
    }

    public gv(SwitchCompat switchCompat) {
        this.OooO0O0 = new WeakReference(switchCompat);
    }
}
