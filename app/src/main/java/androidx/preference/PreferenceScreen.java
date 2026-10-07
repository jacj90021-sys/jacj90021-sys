package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.cmaster.cloner.R;
import com.cmaster.cloner.e53;
import com.cmaster.cloner.o10;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean o000oOoO;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, e53.OooO00o(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
        this.o000oOoO = true;
    }

    @Override // androidx.preference.Preference
    public final void OooOO0o() {
        o10 o10Var;
        if (this.OooOOOO != null || this.OooOOOo != null || this.OoooO00.size() == 0 || (o10Var = this.OooO0o0.OooO0oo) == null) {
            return;
        }
        for (o10Var = this.OooO0o0.OooO0oo; o10Var != null; o10Var = o10Var.OooOo) {
        }
    }
}
