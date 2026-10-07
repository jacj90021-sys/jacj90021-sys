package com.cmaster.cloner;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class kn0 extends h41 {
    public CharSequence[] o0OOO0o;
    public int o0ooOOo;
    public CharSequence[] o0ooOoO;

    @Override // com.cmaster.cloner.h41, com.cmaster.cloner.er, com.cmaster.cloner.o10
    public final void OooOoO0(Bundle bundle) {
        super.OooOoO0(bundle);
        if (bundle != null) {
            this.o0ooOOo = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.o0ooOoO = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.o0OOO0o = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) OoooOOo();
        CharSequence[] charSequenceArr = listPreference.o000oOoO;
        CharSequence[] charSequenceArr2 = listPreference.OoooOOO;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            qa.OooO0o("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.o0ooOOo = listPreference.OooOoO(listPreference.OoooOOo);
        this.o0ooOoO = listPreference.o000oOoO;
        this.o0OOO0o = charSequenceArr2;
    }

    @Override // com.cmaster.cloner.h41, com.cmaster.cloner.er, com.cmaster.cloner.o10
    public final void Oooo00o(Bundle bundle) {
        super.Oooo00o(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.o0ooOOo);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.o0ooOoO);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.o0OOO0o);
    }

    @Override // com.cmaster.cloner.h41
    public final void OoooOoO(boolean z) {
        int i;
        if (!z || (i = this.o0ooOOo) < 0) {
            return;
        }
        String string = this.o0OOO0o[i].toString();
        ListPreference listPreference = (ListPreference) OoooOOo();
        listPreference.getClass();
        listPreference.OooOoOO(string);
    }

    @Override // com.cmaster.cloner.h41
    public final void OoooOoo(oOo000Oo ooo000oo) {
        CharSequence[] charSequenceArr = this.o0ooOoO;
        int i = this.o0ooOOo;
        jn0 jn0Var = new jn0(this, 0);
        oO00o0 oo00o0 = (oO00o0) ooo000oo.OooO0o0;
        oo00o0.OooOOOO = charSequenceArr;
        oo00o0.OooOOo0 = jn0Var;
        oo00o0.OooOo0O = i;
        oo00o0.OooOo0 = true;
        ooo000oo.OooO0o0(null, null);
    }
}
