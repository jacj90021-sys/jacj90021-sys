package com.cmaster.cloner;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n0 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o;
    public final int OooO0o0;
    public final Object OooO0oO;

    public n0(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.OooO0Oo = 1;
        this.OooO0oO = bottomSheetBehavior;
        this.OooO0o = view;
        this.OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0O0oo0o o0o0oo0o;
        int i = this.OooO0Oo;
        int i2 = this.OooO0o0;
        Object obj = this.OooO0oO;
        Object obj2 = this.OooO0o;
        switch (i) {
            case 0:
                ((TextView) obj2).setTypeface((Typeface) obj, i2);
                break;
            case 1:
                ((BottomSheetBehavior) obj).Oooo0o((View) obj2, i2, false);
                break;
            case 2:
                zf zfVar = (zf) obj;
                Object obj3 = ((o0O0O0Oo) obj2).OooO0O0;
                String str = (String) zfVar.OooO00o.get(Integer.valueOf(i2));
                if (str != null) {
                    o0O0OOOo o0o0oooo = (o0O0OOOo) zfVar.OooO0o0.get(str);
                    if (o0o0oooo != null && (o0o0oo0o = o0o0oooo.OooO00o) != null) {
                        if (zfVar.OooO0Oo.remove(str)) {
                            o0o0oo0o.OooO0o0(obj3);
                            break;
                        }
                    } else {
                        zfVar.OooO0oO.remove(str);
                        zfVar.OooO0o.put(str, obj3);
                        break;
                    }
                }
                break;
            case 3:
                ((zf) obj).OooO00o(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj2));
                break;
            case 4:
                ((fm) obj).OooO0o0.onNavigationEvent(i2, (Bundle) obj2);
                break;
            case 5:
                ((el1) obj2).OooO00o(i2, (Intent) obj);
                break;
            case 6:
                ((SystemForegroundService) obj).OooO0oo.notify(i2, (Notification) obj2);
                break;
            default:
                try {
                    rx1.OooO00o();
                    rx2.OooO00o((Context) obj2, (Intent) obj, i2);
                    break;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return;
                }
        }
    }

    public /* synthetic */ n0(Object obj, Object obj2, int i, int i2) {
        this.OooO0Oo = i2;
        this.OooO0o = obj;
        this.OooO0oO = obj2;
        this.OooO0o0 = i;
    }

    public /* synthetic */ n0(Object obj, int i, Object obj2, int i2) {
        this.OooO0Oo = i2;
        this.OooO0oO = obj;
        this.OooO0o0 = i;
        this.OooO0o = obj2;
    }
}
