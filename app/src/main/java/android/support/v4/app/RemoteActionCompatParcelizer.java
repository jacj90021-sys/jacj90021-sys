package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import com.cmaster.cloner.ns1;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ns1 ns1Var) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(ns1Var);
    }

    public static void write(RemoteActionCompat remoteActionCompat, ns1 ns1Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, ns1Var);
    }
}
