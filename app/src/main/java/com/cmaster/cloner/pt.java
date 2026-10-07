package com.cmaster.cloner;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pt implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ pt(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    private final void OooO00o(AdapterView adapterView) {
    }

    private final void OooO0O0(AdapterView adapterView) {
    }

    private final void OooO0OO(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ot otVar;
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i2) {
            case 0:
                DropDownPreference dropDownPreference = (DropDownPreference) obj;
                if (i >= 0) {
                    String string = dropDownPreference.OoooOOO[i].toString();
                    if (!string.equals(dropDownPreference.OoooOOo)) {
                        dropDownPreference.OooOoOO(string);
                        break;
                    }
                }
                break;
            case 1:
                if (i != -1 && (otVar = ((hn0) obj).OooO0o) != null) {
                    otVar.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).OooOOO(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.OooO0Oo;
    }
}
