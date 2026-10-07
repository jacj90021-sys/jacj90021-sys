package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import com.cmaster.cloner.R;
import com.cmaster.cloner.cv0;
import com.cmaster.cloner.e53;
import com.cmaster.cloner.er;
import com.cmaster.cloner.i61;
import com.cmaster.cloner.j41;
import com.cmaster.cloner.k20;
import com.cmaster.cloner.k5;
import com.cmaster.cloner.kn0;
import com.cmaster.cloner.ku;
import com.cmaster.cloner.o10;
import com.cmaster.cloner.ra;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence Oooo;
    public final String OoooO;
    public final Drawable OoooO0;
    public final String OoooO00;
    public final String OoooO0O;
    public final int OoooOO0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i61.OooO0OO, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.Oooo = string;
        if (string == null) {
            this.Oooo = this.OooOO0;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.OoooO00 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.OoooO0 = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.OoooO0O = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.OoooO = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.OoooOO0 = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void OooOO0o() {
        er cv0Var;
        j41 j41Var = this.OooO0o0.OooO0oO;
        if (j41Var != null) {
            for (o10 o10Var = j41Var; o10Var != null; o10Var = o10Var.OooOo) {
            }
            if (j41Var.OooOOO0().OooOoOO("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            boolean z = this instanceof EditTextPreference;
            String str = this.OooOOO;
            if (z) {
                cv0Var = new ku();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                cv0Var.OoooO0O(bundle);
            } else if (this instanceof ListPreference) {
                cv0Var = new kn0();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str);
                cv0Var.OoooO0O(bundle2);
            } else {
                if (!(this instanceof MultiSelectListPreference)) {
                    ra.OooO0o(getClass().getSimpleName(), "Cannot display dialog for an unknown Preference type: ", ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                    return;
                }
                cv0Var = new cv0();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str);
                cv0Var.OoooO0O(bundle3);
            }
            cv0Var.OoooOO0(j41Var);
            k20 k20VarOooOOO0 = j41Var.OooOOO0();
            cv0Var.o0OoOo0 = false;
            cv0Var.ooOO = true;
            k5 k5Var = new k5(k20VarOooOOO0);
            k5Var.OooOOOo = true;
            k5Var.OooO0o0(0, cv0Var, "androidx.preference.PreferenceFragment.DIALOG", 1);
            k5Var.OooO0Oo(false);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e53.OooO00o(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
