package com.cmaster.cloner;

import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.bumptech.matrix.ui.qrcode.ActivityBarCodeHistory;
import com.bumptech.matrix.ui.qrcode.ActivityBarCodePreview;
import com.bumptech.matrix.ui.update.UpdateActivity;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00O00O implements View.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ o00O00O(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.OooO0Oo;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                ((o00OO0O0) obj).OooO00o();
                break;
            case 1:
                ActivityBarCodePreview activityBarCodePreview = (ActivityBarCodePreview) obj;
                activityBarCodePreview.startActivity(new Intent(activityBarCodePreview, (Class<?>) ActivityBarCodeHistory.class));
                break;
            case 2:
                oO0OO00o oo0oo00o = (oO0OO00o) obj;
                if (view == oo0oo00o.OooO && (message3 = oo0oo00o.OooOO0O) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == oo0oo00o.OooOO0o && (message2 = oo0oo00o.OooOOO) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == oo0oo00o.OooOOOO && (message = oo0oo00o.OooOOo0) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                oo0oo00o.Oooo000.obtainMessage(1, oo0oo00o.OooO0O0).sendToTarget();
                break;
            case 3:
                ((Preference) obj).OooOOo(view);
                break;
            case 4:
                on1 on1Var = ((Toolbar) obj).Oooo;
                vs0 vs0Var = on1Var != null ? on1Var.OooO0o0 : null;
                if (vs0Var != null) {
                    vs0Var.collapseActionView();
                    break;
                }
                break;
            case 5:
                UpdateActivity updateActivity = (UpdateActivity) obj;
                String packageName = updateActivity.getPackageName();
                int i2 = UpdateActivity.OooOoo;
                Intent intent = new Intent(sn2.OooO00o("SddSpcWca9tB10KyxIEhlEvNX7jE21m8be4=\n", "KLk216r1D/U=\n"));
                intent.addFlags(268435456);
                intent.setData(Uri.parse(sn2.OooO00o("QYRm3Hmj0YgDgXHDfb6H1BOMcIo=\n", "LOUUtxzX66c=\n") + packageName));
                intent.setPackage(sn2.OooO00o("LCXj9dqY/2kgI+r1zZP1fyYk6Q==\n", "T0qO27v2mxs=\n"));
                if (intent.resolveActivity(updateActivity.getPackageManager()) != null) {
                    updateActivity.startActivity(intent);
                    break;
                } else {
                    intent.setPackage(null);
                    intent.setData(Uri.parse(sn2.OooO00o("ls04/SlCoJGO1S30dB/g0ZnVKaM5F+KRjc0j/z9X7s6OymPpPwzu15LKc+Q+RQ==\n", "/rlMjVp4j74=\n") + packageName));
                    try {
                        updateActivity.startActivity(intent);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
            default:
                lz2 lz2Var = (lz2) obj;
                lz2Var.OooOoO0 = 2;
                lz2Var.OooO0Oo.finish();
                break;
        }
    }
}
