package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import com.cmaster.cloner.oO0Oo0o0;
import com.cmaster.cloner.og0;
import com.cmaster.cloner.s60;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements og0 {
    @Override // com.cmaster.cloner.og0
    public final List OooO00o() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.cmaster.cloner.og0
    public final Object OooO0O0(Context context) {
        Choreographer.getInstance().postFrameCallback(new oO0Oo0o0(this, context.getApplicationContext()));
        return new s60();
    }
}
