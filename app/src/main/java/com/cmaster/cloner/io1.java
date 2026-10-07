package com.cmaster.cloner;

import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class io1 implements c02 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.os.Bundle] */
    @Override // com.cmaster.cloner.c02
    public final Bundle OooO00o(Context context, int i, Bundle bundle) {
        String string = bundle.getString(qn2.OooO00o("bVz1XT5C\n", "CDKSNFAnh+k=\n"), null);
        String string2 = bundle.getString(qn2.OooO00o("oUs3bGNB\n", "zC5DBAwludA=\n"), null);
        Bundle bundle2 = bundle.getBundle(qn2.OooO00o("8hAGXA==\n", "k2JhL+++bHw=\n"));
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient((String) string);
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    string = contentProviderClientAcquireUnstableContentProviderClient.call(string2, null, bundle2);
                    return string;
                } finally {
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
            Log.e(qn2.OooO00o("jyEXlQ==\n", "yWBD1H59534=\n"), qn2.OooO00o("024IaXUZ59TeZhFiclGh3c0vRyc=\n", "vw99BxZxx7I=\n") + string);
        }
        return Bundle.EMPTY;
    }
}
