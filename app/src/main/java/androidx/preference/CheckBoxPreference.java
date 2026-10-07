package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.cmaster.cloner.R;
import com.cmaster.cloner.e53;
import com.cmaster.cloner.i61;
import com.cmaster.cloner.nc;
import com.cmaster.cloner.q41;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final nc OoooOO0;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iOooO00o = e53.OooO00o(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iOooO00o);
        this.OoooOO0 = new nc(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i61.OooO0O0, iOooO00o, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.OoooO00 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.Oooo) {
            OooO0oO();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.OoooO0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.Oooo) {
            OooO0oO();
        }
        this.OoooO = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void OooOO0O(q41 q41Var) {
        super.OooOO0O(q41Var);
        OooOoo0(q41Var.OooOOoo(android.R.id.checkbox));
        OooOoOO(q41Var.OooOOoo(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void OooOOo(View view) {
        super.OooOOo(view);
        if (((AccessibilityManager) this.OooO0Oo.getSystemService("accessibility")).isEnabled()) {
            OooOoo0(view.findViewById(android.R.id.checkbox));
            OooOoOO(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoo0(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Oooo);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.OoooOO0);
        }
    }
}
