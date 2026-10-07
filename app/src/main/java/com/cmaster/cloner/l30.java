package com.cmaster.cloner;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class l30 extends o1 {
    public final cr0 Ooooo00 = dr0.OooO00o().OooO0O0(3, (er0) kn2.OooO00o.OooO0oO);
    public f81 Ooooo0o;
    public xx0 OooooO0;

    @Override // com.cmaster.cloner.o10
    public final View OooOoOO(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        OoooOOO().setTitle(sn2.OooO00o("dAs0yslSMtcTOCma\n", "M25A6o8gV7I=\n"));
        int i = x10.OooOo0o;
        x10 x10Var = (x10) en.OooO00o(layoutInflater, R.layout.fragment_free_vip, viewGroup);
        i81 i81Var = i81.OooO0oo;
        if (!i81Var.OooO0O0()) {
            kn2.OooO0O0(this, x10Var.OooOOo0);
        }
        this.Ooooo0o = new f81(x10Var.OooOo0);
        this.OooooO0 = new xx0(x10Var.OooOOo);
        int i2 = 1;
        i81Var.OooO0O0.OooO0o0(OooOOOo(), new q5(this, x10Var, i2));
        f81 f81Var = this.Ooooo0o;
        List listAsList = Arrays.asList(new j81(zzbcj.zzq.zzf, 1), new j81(2600, 3));
        SparseIntArray sparseIntArray = f81Var.OooO0O0;
        RadioGroup radioGroup = f81Var.OooO00o;
        radioGroup.removeAllViews();
        SparseArray sparseArray = f81Var.OooO0OO;
        sparseArray.clear();
        int i3 = 0;
        for (int i4 = 0; i4 < listAsList.size(); i4++) {
            int iGenerateViewId = sparseIntArray.get(i4);
            if (iGenerateViewId == 0) {
                iGenerateViewId = View.generateViewId();
                sparseIntArray.put(i4, iGenerateViewId);
            }
            Context context = radioGroup.getContext();
            j81 j81Var = (j81) listAsList.get(i4);
            v vVar = new v(context, null, 0);
            vVar.setLayoutParams(new RadioGroup.LayoutParams(-2, -2));
            vVar.setId(View.generateViewId());
            vVar.setText(String.format(Locale.ENGLISH, context.getString(R.string.banner_vip_item_1), Integer.valueOf(j81Var.OooO00o), Integer.valueOf(j81Var.OooO0O0)));
            vVar.setId(iGenerateViewId);
            sparseArray.put(iGenerateViewId, (j81) listAsList.get(i4));
            radioGroup.addView(vVar);
            if (i4 == listAsList.size() - 1) {
                radioGroup.check(iGenerateViewId);
                f81Var.OooO0Oo = iGenerateViewId;
            }
        }
        x10Var.OooOOoo.setOnClickListener(new k30(this, x10Var, i3));
        x10Var.OooOo00.setOnClickListener(new k30(this, x10Var, i2));
        return x10Var.OooO0oo;
    }
}
