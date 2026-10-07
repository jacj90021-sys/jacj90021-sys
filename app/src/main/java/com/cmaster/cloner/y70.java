package com.cmaster.cloner;

import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class y70 implements View.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ g80 OooO0o0;

    public /* synthetic */ y70(g80 g80Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = g80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        String string;
        int i = this.OooO0Oo;
        String string2 = null;
        g80 g80Var = this.OooO0o0;
        switch (i) {
            case 0:
                o0O00000 o0o00000 = g80Var.Ooooo0o;
                if (o0o00000 == null) {
                    ij0.OooO(sn2.OooO00o("Oz+jez4pSw==\n", "WVbNH1dHLKA=\n"));
                    throw null;
                }
                Editable text = ((EditText) o0o00000.OooO0o).getText();
                if (text != null && (string = text.toString()) != null) {
                    string2 = uj1.OooO(string).toString();
                }
                if (string2 == null || string2.length() <= 0) {
                    return;
                }
                g80Var.OoooOo0(string2);
                return;
            case 1:
                o0O00000 o0o000002 = g80Var.Ooooo0o;
                if (o0o000002 == null) {
                    ij0.OooO(sn2.OooO00o("OvCVnvew6w==\n", "WJn7+p7ejIE=\n"));
                    throw null;
                }
                Editable text2 = ((EditText) o0o000002.OooO0o).getText();
                if (text2 != null) {
                    text2.clear();
                }
                g80Var.Ooooo0o();
                return;
            case 2:
                g80Var.OoooOoO(-10000);
                return;
            default:
                yu1 yu1Var = g80Var.OooooOO;
                m1 m1VarOoooOOO = g80Var.OoooOOO();
                yu1Var.getClass();
                Intent intent = new Intent();
                String packageName = e2.OooO.OooO00o.getPackageName();
                PowerManager powerManager = (PowerManager) m1VarOoooOOO.getSystemService(PowerManager.class);
                if (powerManager == null || powerManager.isIgnoringBatteryOptimizations(packageName)) {
                    return;
                }
                intent.setAction(sn2.OooO00o("xWAz+E8v34TXayP+SSjc2YpcEtt1A+j++0cQxG8U/vXmTwPeZRTi9eteA8NtD+Hr8EcYxHM=\n", "pA5XiiBGu6o=\n"));
                intent.setData(Uri.parse(sn2.OooO00o("LdZpnBUFysQ=\n", "XbcK93Rir/4=\n") + packageName));
                m1VarOoooOOO.OooOo(intent).OooO0o0(m1VarOoooOOO, new k1(yu1Var, 14));
                return;
        }
    }
}
