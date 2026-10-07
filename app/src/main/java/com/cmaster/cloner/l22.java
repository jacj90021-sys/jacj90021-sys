package com.cmaster.cloner;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class l22 implements DialogInterface.OnClickListener {
    public abstract void OooO00o();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                OooO00o();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
