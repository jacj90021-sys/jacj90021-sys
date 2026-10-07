package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.cmaster.cloner.R;
import com.cmaster.cloner.av0;
import com.cmaster.cloner.e53;
import com.cmaster.cloner.i61;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] OoooOOO;
    public final HashSet OoooOOo;
    public final CharSequence[] o000oOoO;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iOooO00o = e53.OooO00o(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iOooO00o);
        this.OoooOOo = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i61.OooO0o, iOooO00o, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.o000oOoO = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.OoooOOO = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object OooOOO(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void OooOOOO(Parcelable parcelable) {
        if (!parcelable.getClass().equals(av0.class)) {
            super.OooOOOO(parcelable);
            return;
        }
        av0 av0Var = (av0) parcelable;
        super.OooOOOO(av0Var.getSuperState());
        OooOoO(av0Var.OooO0Oo);
    }

    @Override // androidx.preference.Preference
    public final Parcelable OooOOOo() {
        super.OooOOOo();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.OooOo00) {
            return absSavedState;
        }
        av0 av0Var = new av0();
        av0Var.OooO0Oo = this.OoooOOo;
        return av0Var;
    }

    @Override // androidx.preference.Preference
    public final void OooOOo0(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (OooOoO0()) {
            stringSet = this.OooO0o0.OooO00o().getStringSet(this.OooOOO, stringSet);
        }
        OooOoO(stringSet);
    }

    public final void OooOoO(Set set) {
        HashSet hashSet = this.OoooOOo;
        hashSet.clear();
        hashSet.addAll(set);
        if (OooOoO0()) {
            boolean zOooOoO0 = OooOoO0();
            String str = this.OooOOO;
            if (!set.equals(zOooOoO0 ? this.OooO0o0.OooO00o().getStringSet(str, null) : null)) {
                SharedPreferences.Editor editorEdit = this.OooO0o0.OooO00o().edit();
                editorEdit.putStringSet(str, set);
                this.OooO0o0.getClass();
                editorEdit.apply();
            }
        }
        OooO0oO();
    }
}
