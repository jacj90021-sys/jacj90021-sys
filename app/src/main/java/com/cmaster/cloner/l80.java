package com.cmaster.cloner;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l80 implements View.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ m80 OooO0o0;

    public /* synthetic */ l80(m80 m80Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = m80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.OooO0Oo;
        m80 m80Var = this.OooO0o0;
        switch (i) {
            case 0:
                try {
                    Intent intent = new Intent();
                    intent.setAction(sn2.OooO00o("2OzCqgL578zK59KsBP7skZfD9ogh2cij7cvpljLUzrb4y+qLMsPOtu3L6J8+\n", "uYKm2G2Qi+I=\n"));
                    intent.setData(Uri.fromParts(sn2.OooO00o("uFjPIZKDHQ==\n", "yDmsSvPkeAg=\n"), e2.OooO.OooO00o.getPackageName(), null));
                    m80Var.OoooOOO().OooOo(intent).OooO0o0(m80Var.OooOOOo(), new k1(this, 11));
                    break;
                } catch (Throwable unused) {
                    return;
                }
            default:
                m80Var.OoooOOO().OooOo(new Intent(sn2.OooO00o("VT50k71MG2NHNWSVu0sYPhoRQLGebDwMYBlfr41hOhl1GVyyjXY6GWAZXqaB\n", "NFAQ4dIlf00=\n")).setData(Uri.fromParts(sn2.OooO00o("a6sKy4A69g==\n", "G8ppoOFdk3k=\n"), m80Var.Oooo0oO().getPackageName(), null))).OooO0o0(m80Var.OooOOOo(), new k80(m80Var, 1));
                break;
        }
    }
}
