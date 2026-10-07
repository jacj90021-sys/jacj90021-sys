package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.cmaster.cloner.R;
import com.cmaster.cloner.e53;
import com.cmaster.cloner.q41;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, e53.OooO00o(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean OooO0o() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void OooOO0O(q41 q41Var) {
        super.OooOO0O(q41Var);
        if (Build.VERSION.SDK_INT >= 28) {
            q41Var.OooO00o.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean OooOo() {
        return !super.OooO0o();
    }
}
