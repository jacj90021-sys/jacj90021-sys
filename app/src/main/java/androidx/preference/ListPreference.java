package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import com.cmaster.cloner.R;
import com.cmaster.cloner.e41;
import com.cmaster.cloner.e53;
import com.cmaster.cloner.i61;
import com.cmaster.cloner.in0;
import com.cmaster.cloner.v03;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] OoooOOO;
    public String OoooOOo;
    public final String OoooOo0;
    public boolean OoooOoO;
    public final CharSequence[] o000oOoO;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i61.OooO0o0, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.o000oOoO = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.OoooOOO = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (v03.OooO0oO == null) {
                v03.OooO0oO = new v03();
            }
            this.Oooo0oO = v03.OooO0oO;
            OooO0oO();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i61.OooO0oO, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.OoooOo0 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence OooO0o0() {
        CharSequence[] charSequenceArr;
        e41 e41Var = this.Oooo0oO;
        if (e41Var != null) {
            return e41Var.OooO(this);
        }
        int iOooOoO = OooOoO(this.OoooOOo);
        CharSequence charSequence = (iOooOoO < 0 || (charSequenceArr = this.o000oOoO) == null) ? null : charSequenceArr[iOooOoO];
        CharSequence charSequenceOooO0o0 = super.OooO0o0();
        String str = this.OoooOo0;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String str2 = String.format(str, charSequence);
            if (!TextUtils.equals(str2, charSequenceOooO0o0)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceOooO0o0;
    }

    @Override // androidx.preference.Preference
    public final Object OooOOO(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void OooOOOO(Parcelable parcelable) {
        if (!parcelable.getClass().equals(in0.class)) {
            super.OooOOOO(parcelable);
            return;
        }
        in0 in0Var = (in0) parcelable;
        super.OooOOOO(in0Var.getSuperState());
        OooOoOO(in0Var.OooO0Oo);
    }

    @Override // androidx.preference.Preference
    public final Parcelable OooOOOo() {
        super.OooOOOo();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.OooOo00) {
            return absSavedState;
        }
        in0 in0Var = new in0();
        in0Var.OooO0Oo = this.OoooOOo;
        return in0Var;
    }

    @Override // androidx.preference.Preference
    public final void OooOOo0(Object obj) {
        OooOoOO(OooO0Oo((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void OooOo0O(CharSequence charSequence) {
        throw null;
    }

    public final int OooOoO(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.OoooOOO) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final void OooOoOO(String str) {
        boolean zEquals = TextUtils.equals(this.OoooOOo, str);
        if (zEquals && this.OoooOoO) {
            return;
        }
        this.OoooOOo = str;
        this.OoooOoO = true;
        OooOOoo(str);
        if (zEquals) {
            return;
        }
        OooO0oO();
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e53.OooO00o(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
