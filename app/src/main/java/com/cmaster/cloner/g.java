package com.cmaster.cloner;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g extends BroadcastReceiver {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public g(ox1 ox1Var) {
        this.OooO00o = 3;
        this.OooO0O0 = ox1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IntentSender.SendIntentException {
        switch (this.OooO00o) {
            case 0:
                ((h) this.OooO0O0).OooOO0O();
                return;
            case 1:
                if (intent != null) {
                    ((j9) this.OooO0O0).OooO0oO(intent);
                    return;
                }
                return;
            case 2:
                ((lh) this.OooO0O0).OooOO0o(intent);
                return;
            case 3:
                String action = intent.getAction();
                Uri data = intent.getData();
                String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
                if (schemeSpecificPart == null) {
                    return;
                }
                ((ox1) this.OooO0O0).OooOOO0.execute(new oO000o00(this, schemeSpecificPart, u7.OooO00o(new byte[]{124, -9, 4, -79, -15, -127, -93, -107, 116, -9, 20, -90, -16, -100, -23, -38, 126, -19, 9, -84, -16, -58, -105, -6, 94, -46, 33, -124, -37, -73, -107, -2, 80, -42, 54, -122, -38}, new byte[]{29, -103, 96, -61, -98, -24, -57, -69}).equals(action)));
                return;
            case 4:
                try {
                    ((IntentSender) this.OooO0O0).sendIntent(context, 0, null, null, null);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            case 5:
                synchronized (((yw1) this.OooO0O0).OooOO0O) {
                    try {
                        if (u7.OooO00o(new byte[]{-2, -90, -107, -50, 19, -94, -82, 94, -10, -90, -123, -39, 18, -65, -28, 17, -4, -68, -104, -45, 18, -27, -122, 63, -36, -119, -67, -7, 35, -120, -126, 49, -47, -113, -76, -8}, new byte[]{-97, -56, -15, -68, 124, -53, -54, 112}).equals(intent.getAction())) {
                            ((yw1) this.OooO0O0).OooOO0O.clear();
                        }
                    } finally {
                    }
                }
                return;
            case 6:
                ec2 ec2Var = (ec2) this.OooO0O0;
                synchronized (ec2Var) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ec2Var.OooO0O0.entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
                        }
                    } finally {
                    }
                }
                return;
            default:
                a73 a73Var = (a73) this.OooO0O0;
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
                    a73Var.OooO0o0 = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        a73Var.OooO0o0 = false;
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ g(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }
}
