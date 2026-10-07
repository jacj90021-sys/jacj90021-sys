package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.cmaster.cloner.wu0;
import com.cmaster.cloner.xu0;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int OooO0Oo;
    public final LinkedHashMap OooO0o0 = new LinkedHashMap();
    public final xu0 OooO0o = new xu0(this);
    public final wu0 OooO0oO = new wu0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.OooO0oO;
    }
}
