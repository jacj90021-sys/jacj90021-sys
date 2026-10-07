package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l23 {
    public static final Uri OooO0Oo = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String OooO00o;
    public final String OooO0O0;
    public final boolean OooO0OO;

    public l23(boolean z, String str, String str2) {
        by2.OooO0o0(str);
        this.OooO00o = str;
        by2.OooO0o0(str2);
        this.OooO0O0 = str2;
        this.OooO0OO = z;
    }

    public final Intent OooO00o(Context context) {
        Bundle bundleCall;
        String str = this.OooO00o;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.OooO0OO) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(OooO0Oo, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.OooO0O0) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l23)) {
            return false;
        }
        l23 l23Var = (l23) obj;
        return uw2.OooO00o(this.OooO00o, l23Var.OooO00o) && uw2.OooO00o(this.OooO0O0, l23Var.OooO0O0) && uw2.OooO00o(null, null) && this.OooO0OO == l23Var.OooO0OO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.OooO00o, this.OooO0O0, null, 4225, Boolean.valueOf(this.OooO0OO)});
    }

    public final String toString() {
        String str = this.OooO00o;
        if (str != null) {
            return str;
        }
        by2.OooO0oo(null);
        throw null;
    }
}
