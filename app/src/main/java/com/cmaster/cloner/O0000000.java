package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class O0000000 {
    public static final oo000000 OooO0Oo = new oo000000(new oo00(0));
    public static final int OooO0o0 = -100;
    public static ro0 OooO0o = null;
    public static ro0 OooO0oO = null;
    public static Boolean OooO0oo = null;
    public static boolean OooO = false;
    public static final m3 OooOO0 = new m3(0);
    public static final Object OooOO0O = new Object();
    public static final Object OooOO0o = new Object();

    public static boolean OooO0OO(Context context) {
        if (OooO0oo == null) {
            try {
                int i = x1.OooO0Oo;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) x1.class), w1.OooO00o() | 128).metaData;
                if (bundle != null) {
                    OooO0oo = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                OooO0oo = Boolean.FALSE;
            }
        }
        return OooO0oo.booleanValue();
    }

    public static void OooO0oO(k kVar) {
        synchronized (OooOO0O) {
            try {
                m3 m3Var = OooOO0;
                m3Var.getClass();
                h3 h3Var = new h3(m3Var);
                while (h3Var.hasNext()) {
                    O0000000 o0000000 = (O0000000) ((WeakReference) h3Var.next()).get();
                    if (o0000000 == kVar || o0000000 == null) {
                        h3Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void OooO(int i);

    public abstract void OooO00o();

    public abstract void OooO0O0();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    public abstract boolean OooO0oo(int i);

    public abstract void OooOO0O(View view);

    public abstract void OooOO0o(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void OooOOO0(CharSequence charSequence);
}
