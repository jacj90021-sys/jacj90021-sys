package com.bumptech.matrix.ui.update;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import com.cmaster.cloner.R;
import com.cmaster.cloner.a02;
import com.cmaster.cloner.o00O00O;
import com.cmaster.cloner.oOOO00;
import com.cmaster.cloner.sn2;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class UpdateActivity extends oOOO00 {
    public static final /* synthetic */ int OooOoo = 0;

    @Override // com.cmaster.cloner.oOOO00, com.cmaster.cloner.eg, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.cmaster.cloner.fg, android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
        try {
            a02.OooO0oo.Oooo00O(-1, null, sn2.OooO00o("34QlXSA1KV6UmyxDczopQpSCPEUgPCAM0Iw9VA==\n", "tO1JMQBTRiw=\n"));
        } catch (Exception unused) {
        }
    }

    @Override // com.cmaster.cloner.oOOO00, com.cmaster.cloner.fg, com.cmaster.cloner.eg, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_update);
        ((Button) findViewById(R.id.bt_outdate_update)).setOnClickListener(new o00O00O(this, 5));
    }
}
