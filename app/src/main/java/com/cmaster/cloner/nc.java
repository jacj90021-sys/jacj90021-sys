package com.cmaster.cloner;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nc implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ nc(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                ((CheckBoxPreference) obj).OooOoO(z);
                break;
            case 1:
                ((nj0) obj).OooO0Oo();
                break;
            case 2:
                ((SwitchPreference) obj).OooOoO(z);
                break;
            default:
                ((SwitchPreferenceCompat) obj).OooOoO(z);
                break;
        }
    }
}
