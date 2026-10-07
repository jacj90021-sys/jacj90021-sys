package com.cmaster.cloner;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class vz1 extends Activity {
    public final /* synthetic */ int OooO0Oo;

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        switch (this.OooO0Oo) {
            case 1:
                super.onActivityResult(i, i2, intent);
                try {
                    o63.OooO00o.invoke(null, 10202, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), intent});
                    break;
                } catch (Throwable unused) {
                    return;
                }
            default:
                super.onActivityResult(i, i2, intent);
                break;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        switch (this.OooO0Oo) {
            case 0:
                moveTaskToBack(false);
                break;
            default:
                super.onBackPressed();
                break;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        switch (this.OooO0Oo) {
            case 1:
                super.onNewIntent(intent);
                try {
                    o63.OooO00o.invoke(null, 10201, new Object[]{this, intent});
                    break;
                } catch (Throwable unused) {
                    return;
                }
            default:
                super.onNewIntent(intent);
                break;
        }
    }
}
