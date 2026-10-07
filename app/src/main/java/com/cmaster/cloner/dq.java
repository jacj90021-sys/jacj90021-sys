package com.cmaster.cloner;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dq implements iy0 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ gq OooO0o0;

    public /* synthetic */ dq(gq gqVar, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = gqVar;
    }

    @Override // com.cmaster.cloner.iy0
    public final void OooO00o(Object obj) throws Resources.NotFoundException {
        int i = this.OooO0Oo;
        gq gqVar = this.OooO0o0;
        switch (i) {
            case 0:
                bq bqVar = (bq) obj;
                gqVar.Ooooo0o.OooOo0O.removeAllViews();
                ArrayList arrayList = new ArrayList();
                e81 e81VarOooOOOo = e81.OooOOOo(gqVar.OooOO0O(), gqVar.Ooooo0o.OooOo0O);
                ((TextInputLayout) e81VarOooOOOo.OooO0o0).setHint(sn2.OooO00o("zemBpSxd2R8=\n", "iYz3zE84kHs=\n"));
                TextInputEditText textInputEditText = (TextInputEditText) e81VarOooOOOo.OooO0o;
                textInputEditText.setEnabled(false);
                textInputEditText.setText(bqVar.OooO00o.getString(sn2.OooO00o("jQCaMEQW0NuKDJYwUAHJ1pwK\n", "/2/iHjRkv78=\n")));
                arrayList.add(e81VarOooOOOo);
                e81 e81VarOooOOOo2 = e81.OooOOOo(gqVar.OooOO0O(), gqVar.Ooooo0o.OooOo0O);
                ((TextInputLayout) e81VarOooOOOo2.OooO0o0).setHint(sn2.OooO00o("fhUeayB8AoV2Hw==\n", "P3t6GU8VZqU=\n"));
                TextInputEditText textInputEditText2 = (TextInputEditText) e81VarOooOOOo2.OooO0o;
                textInputEditText2.setEnabled(false);
                String strOooO00o = sn2.OooO00o("r9k8vk7qNeGo1TC+X/Y+97LfIA==\n", "3bZEkD6YWoU=\n");
                Bundle bundle = bqVar.OooO00o;
                textInputEditText2.setText(bundle.getString(strOooO00o));
                arrayList.add(e81VarOooOOOo2);
                e81 e81VarOooOOOo3 = e81.OooOOOo(gqVar.OooOO0O(), gqVar.Ooooo0o.OooOo0O);
                ((TextInputLayout) e81VarOooOOOo3.OooO0o0).setHint(sn2.OooO00o("JqWFUV+Pb9UM6b1VSA==\n", "ZMnwNCvgAKE=\n"));
                TextInputEditText textInputEditText3 = (TextInputEditText) e81VarOooOOOo3.OooO0o;
                textInputEditText3.setEnabled(false);
                textInputEditText3.setText(bundle.getString(sn2.OooO00o("FI+vmCCfKBcTg6OYMoEyFhKPuMI4\n", "ZuDXtlDtR3M=\n")));
                arrayList.add(e81VarOooOOOo3);
                e81 e81VarOooOOOo4 = e81.OooOOOo(gqVar.OooOO0O(), gqVar.Ooooo0o.OooOo0O);
                ((TextInputLayout) e81VarOooOOOo4.OooO0o0).setHint(sn2.OooO00o("KkZrH4LFiTQ=\n", "fS8NdqKI6Fc=\n"));
                TextInputEditText textInputEditText4 = (TextInputEditText) e81VarOooOOOo4.OooO0o;
                textInputEditText4.setEnabled(false);
                textInputEditText4.setText(bundle.getString(sn2.OooO00o("w3WeUwqtyebEeZJTDbbA6w==\n", "sRrmfXrfpoI=\n")));
                arrayList.add(e81VarOooOOOo4);
                e81 e81VarOooOOOo5 = e81.OooOOOo(gqVar.OooOO0O(), gqVar.Ooooo0o.OooOo0O);
                ((TextInputLayout) e81VarOooOOOo5.OooO0o0).setHint(sn2.OooO00o("Zf6Jhxe8\n", "Npv77nbQLe0=\n"));
                TextInputEditText textInputEditText5 = (TextInputEditText) e81VarOooOOOo5.OooO0o;
                textInputEditText5.setEnabled(false);
                textInputEditText5.setText(bundle.getString(sn2.OooO00o("9rWL0+P5joXxuYfT4O6TiOW2\n", "hNrz/ZOL4eE=\n")));
                arrayList.add(e81VarOooOOOo5);
                gqVar.Oooooo0 = Collections.EMPTY_LIST;
                break;
            default:
                oOOO00 oooo00Oooo0oO = gqVar.Oooo0oO();
                StringBuilder sb = new StringBuilder();
                sb.append(sn2.OooO00o("Bh5uATdfpg==\n", "QnsYaFQ6i+Y=\n"));
                sb.append(obj);
                oooo00Oooo0oO.setTitle(sb.toString());
                break;
        }
    }
}
