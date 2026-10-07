package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import com.cmaster.cloner.dn;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.rt1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class DataBinderMapperImpl extends dn {
    public static final SparseIntArray OooO00o = new SparseIntArray(0);

    @Override // com.cmaster.cloner.dn
    public final List OooO00o() {
        return new ArrayList(0);
    }

    @Override // com.cmaster.cloner.dn
    public final rt1 OooO0O0(View view, int i) {
        if (OooO00o.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        ra.OooOOO0("view must have a tag");
        return null;
    }
}
