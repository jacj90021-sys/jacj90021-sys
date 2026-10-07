package androidx.work;

import android.content.Context;
import com.cmaster.cloner.ep0;
import com.cmaster.cloner.og0;
import com.cmaster.cloner.q02;
import com.cmaster.cloner.v03;
import com.cmaster.cloner.xf1;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements og0 {
    public static final String OooO00o = ep0.OooO("WrkMgrInitializer");

    @Override // com.cmaster.cloner.og0
    public final List OooO00o() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.cmaster.cloner.og0
    public final Object OooO0O0(Context context) {
        ep0.OooO0oO().OooO0Oo(OooO00o, "Initializing WorkManager with default configuration.", new Throwable[0]);
        q02.OooO0OO(context, new xf1(new v03()));
        return q02.OooO0O0(context);
    }
}
