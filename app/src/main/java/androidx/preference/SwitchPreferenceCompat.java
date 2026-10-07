package androidx.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import com.cmaster.cloner.R;
import com.cmaster.cloner.i61;
import com.cmaster.cloner.nc;
import com.cmaster.cloner.q41;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final nc OoooOO0;
    public final String OoooOOO;
    public final String o000oOoO;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.OoooOO0 = new nc(this, 3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i61.OooOOO0, R.attr.switchPreferenceCompatStyle, 0);
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
    public final void OooOO0O(q41 q41Var) throws Resources.NotFoundException {
        super.OooOO0O(q41Var);
        OooOoo0(q41Var.OooOOoo(R.id.switchWidget));
        OooOoOO(q41Var.OooOOoo(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void OooOOo(View view) throws Resources.NotFoundException {
        super.OooOOo(view);
        if (((AccessibilityManager) this.OooO0Oo.getSystemService("accessibility")).isEnabled()) {
            OooOoo0(view.findViewById(R.id.switchWidget));
            OooOoOO(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoo0(View view) throws Resources.NotFoundException {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Oooo);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.o000oOoO);
            switchCompat.setTextOff(this.OoooOOO);
            switchCompat.setOnCheckedChangeListener(this.OoooOO0);
        }
    }
}
