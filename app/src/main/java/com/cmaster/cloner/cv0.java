package com.cmaster.cloner;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class cv0 extends h41 {
    public CharSequence[] o0OOO0o;
    public CharSequence[] o0Oo0oo;
    public final HashSet o0ooOOo = new HashSet();
    public boolean o0ooOoO;

    @Override // com.cmaster.cloner.h41, com.cmaster.cloner.er, com.cmaster.cloner.o10
    public final void OooOoO0(Bundle bundle) {
        super.OooOoO0(bundle);
        HashSet hashSet = this.o0ooOOo;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.o0ooOoO = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.o0OOO0o = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.o0Oo0oo = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) OoooOOo();
        CharSequence[] charSequenceArr = multiSelectListPreference.o000oOoO;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.OoooOOO;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            qa.OooO0o("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.OoooOOo);
        this.o0ooOoO = false;
        this.o0OOO0o = multiSelectListPreference.o000oOoO;
        this.o0Oo0oo = charSequenceArr2;
    }

    @Override // com.cmaster.cloner.h41, com.cmaster.cloner.er, com.cmaster.cloner.o10
    public final void Oooo00o(Bundle bundle) {
        super.Oooo00o(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.o0ooOOo));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.o0ooOoO);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.o0OOO0o);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.o0Oo0oo);
    }

    @Override // com.cmaster.cloner.h41
    public final void OoooOoO(boolean z) {
        if (z && this.o0ooOoO) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) OoooOOo();
            multiSelectListPreference.getClass();
            multiSelectListPreference.OooOoO(this.o0ooOOo);
        }
        this.o0ooOoO = false;
    }

    @Override // com.cmaster.cloner.h41
    public final void OoooOoo(oOo000Oo ooo000oo) {
        int length = this.o0Oo0oo.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.o0ooOOo.contains(this.o0Oo0oo[i].toString());
        }
        CharSequence[] charSequenceArr = this.o0OOO0o;
        bv0 bv0Var = new bv0(this);
        oO00o0 oo00o0 = (oO00o0) ooo000oo.OooO0o0;
        oo00o0.OooOOOO = charSequenceArr;
        oo00o0.OooOo0o = bv0Var;
        oo00o0.OooOOoo = zArr;
        oo00o0.OooOo00 = true;
    }
}
