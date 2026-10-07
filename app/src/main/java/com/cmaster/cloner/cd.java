package com.cmaster.cloner;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.widget.CompoundButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cd implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener, CompoundButton.OnCheckedChangeListener {
    public final Activity OooO;
    public bd OooO0Oo;
    public int OooO0oO;
    public int OooO0oo;
    public final Intent OooOO0;
    public final mx1 OooO0o0 = mx1.OooO0oO();
    public final a02 OooO0o = a02.OooOO0o;

    public cd(Activity activity, Intent intent) {
        this.OooO = activity;
        this.OooOO0 = intent;
    }

    public final void OooO00o() {
        Activity activity = this.OooO;
        if (activity != null) {
            activity.finish();
        }
    }

    public final void OooO0O0(int i, Intent intent, boolean z) {
        Activity activity = this.OooO;
        if (!z) {
            IBinder iBinder = (IBinder) o0O00oO0.OooO00o.OooO0O0(activity);
            if (this.OooO0o0.OooOOOO(i, intent) != null) {
                cx1.OooO0o.execute(new yc(this, intent, iBinder, 0));
                return;
            } else {
                activity.startActivity(intent);
                return;
            }
        }
        lr2.OooO00o(i, intent, activity.getPackageName());
        Uri uriOooO0O0 = lr2.OooO0O0(i, intent.getData(), activity.getPackageName());
        if (uriOooO0O0 != null) {
            intent.setDataAndType(uriOooO0O0, intent.getType());
        }
        activity.startActivity(intent);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        OooO00o();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ArrayList arrayList = this.OooO0Oo.OooO0oO;
        if (arrayList != null) {
            ResolveInfo resolveInfo = ((ad) arrayList.get(i)).OooO0O0;
        }
        Intent intentOooO00o = this.OooO0Oo.OooO00o(i);
        ArrayList arrayList2 = this.OooO0Oo.OooO0oO;
        boolean z = arrayList2 == null ? false : ((ad) arrayList2.get(i)).OooO00o;
        if (intentOooO00o != null) {
            OooO0O0(this.OooO0oO, intentOooO00o, z);
        }
        this.OooO.setVisible(false);
        OooO00o();
    }
}
