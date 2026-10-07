package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.cmaster.cloner.by2;
import com.cmaster.cloner.d60;
import com.cmaster.cloner.gh;
import com.cmaster.cloner.h60;
import com.cmaster.cloner.px0;
import com.cmaster.cloner.xi1;
import com.google.android.gms.common.annotation.KeepName;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int OooO0o0 = 0;
    public int OooO0Oo = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.OooO0Oo = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                h60 h60VarOooO0o0 = h60.OooO0o0(this);
                if (i2 == -1) {
                    xi1 xi1Var = h60VarOooO0o0.OooOOOo;
                    xi1Var.sendMessage(xi1Var.obtainMessage(3));
                } else if (i2 == 0) {
                    h60VarOooO0o0.OooO0o(new gh(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.OooO0Oo = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.OooO0Oo = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.OooO0Oo = bundle.getInt("resolution");
        }
        if (this.OooO0Oo == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            by2.OooO0oo(num);
            d60.OooO0Oo.OooO0Oo(this, num.intValue(), this);
            this.OooO0Oo = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.OooO0Oo = 1;
            } catch (ActivityNotFoundException e) {
                e = e;
                ActivityNotFoundException activityNotFoundException = e;
                if (extras.getBoolean("notify_manager", true)) {
                    h60.OooO0o0(googleApiActivity).OooO0o(new gh(22, null), googleApiActivity.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strOooOOOO = px0.OooOOOO("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strOooOOOO = strOooOOOO.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strOooOOOO, activityNotFoundException);
                }
                googleApiActivity.OooO0Oo = 1;
                googleApiActivity.finish();
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                googleApiActivity.finish();
            }
        } catch (ActivityNotFoundException e3) {
            e = e3;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e4) {
            e = e4;
            googleApiActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.OooO0Oo);
        super.onSaveInstanceState(bundle);
    }
}
