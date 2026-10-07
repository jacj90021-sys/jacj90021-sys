package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.cmaster.cloner.R;
import com.cmaster.cloner.e53;
import com.cmaster.cloner.i61;
import com.cmaster.cloner.nc;
import com.cmaster.cloner.q41;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final nc OoooOO0;
    public final String OoooOOO;
    public final String o000oOoO;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iOooO00o = e53.OooO00o(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iOooO00o);
        this.OoooOO0 = new nc(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i61.OooOO0o, iOooO00o, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.OoooO00 = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.Oooo) {
            OooO0oO();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.OoooO0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.Oooo) {
            OooO0oO();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.o000oOoO = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        OooO0oO();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.OoooOOO = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        OooO0oO();
        this.OoooO = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void OooOO0O(q41 q41Var) {
        super.OooOO0O(q41Var);
        OooOoo0(q41Var.OooOOoo(android.R.id.switch_widget));
        OooOoOO(q41Var.OooOOoo(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void OooOOo(View view) {
        super.OooOOo(view);
        if (((AccessibilityManager) this.OooO0Oo.getSystemService("accessibility")).isEnabled()) {
            OooOoo0(view.findViewById(android.R.id.switch_widget));
            OooOoOO(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoo0(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Oooo);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.o000oOoO);
            r4.setTextOff(this.OoooOOO);
            r4.setOnCheckedChangeListener(this.OoooOO0);
        }
    }
}
