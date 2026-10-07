package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.cmaster.cloner.R;
import com.cmaster.cloner.e53;
import com.cmaster.cloner.i61;
import com.cmaster.cloner.ju;
import com.cmaster.cloner.oOO0OO;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String o000oOoO;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iOooO00o = e53.OooO00o(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iOooO00o);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i61.OooO0Oo, iOooO00o, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (oOO0OO.OooO0oO == null) {
                oOO0OO.OooO0oO = new oOO0OO();
            }
            this.Oooo0oO = oOO0OO.OooO0oO;
            OooO0oO();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object OooOOO(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void OooOOOO(Parcelable parcelable) {
        if (!parcelable.getClass().equals(ju.class)) {
            super.OooOOOO(parcelable);
            return;
        }
        ju juVar = (ju) parcelable;
        super.OooOOOO(juVar.getSuperState());
        OooOoO(juVar.OooO0Oo);
    }

    @Override // androidx.preference.Preference
    public final Parcelable OooOOOo() {
        super.OooOOOo();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.OooOo00) {
            return absSavedState;
        }
        ju juVar = new ju();
        juVar.OooO0Oo = this.o000oOoO;
        return juVar;
    }

    @Override // androidx.preference.Preference
    public final void OooOOo0(Object obj) {
        OooOoO(OooO0Oo((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean OooOo() {
        return TextUtils.isEmpty(this.o000oOoO) || super.OooOo();
    }

    public final void OooOoO(String str) {
        boolean zOooOo = OooOo();
        this.o000oOoO = str;
        OooOOoo(str);
        boolean zOooOo2 = OooOo();
        if (zOooOo2 != zOooOo) {
            OooO0oo(zOooOo2);
        }
        OooO0oO();
    }
}
