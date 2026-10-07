package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import com.cmaster.cloner.nz0;
import com.cmaster.cloner.r72;
import com.cmaster.cloner.un2;
import com.cmaster.cloner.x2;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws PackageManager.NameNotFoundException, IOException {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            r72.OooO0O0(context, new x2(1), new nz0(this, 2), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                nz0 nz0Var = new nz0(this, 2);
                try {
                    r72.OooO00o(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    nz0Var.OooO0oo(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    nz0Var.OooO0oo(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            nz0 nz0Var2 = new nz0(this, 2);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                nz0Var2.OooO0oo(16, null);
                return;
            }
            if (un2.OooO00o(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                nz0Var2.OooO0oo(14, null);
            } else {
                nz0Var2.OooO0oo(15, null);
            }
        }
    }
}
