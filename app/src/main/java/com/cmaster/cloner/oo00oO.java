package com.cmaster.cloner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.matrix.ui.qrcode.ActivityBarCodeHistory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oo00oO extends a71 {
    public final List OooO0Oo;
    public final /* synthetic */ ActivityBarCodeHistory OooO0o0;

    public oo00oO(ActivityBarCodeHistory activityBarCodeHistory, List list) {
        this.OooO0o0 = activityBarCodeHistory;
        this.OooO0Oo = list;
    }

    @Override // com.cmaster.cloner.a71
    public final int OooO00o() {
        return this.OooO0Oo.size();
    }

    @Override // com.cmaster.cloner.a71
    public final void OooO0o0(y71 y71Var, int i) {
        o0O00o0 o0o00o0 = (o0O00o0) y71Var;
        s5 s5Var = (s5) this.OooO0Oo.get(i);
        o0o00o0.OooOo0.setText(s5Var.OooO0Oo);
        o0o00o0.OooOo0O.setText(new SimpleDateFormat(sn2.OooO00o("0KXBGf0MPPLNuJgomHscsg==\n", "qdy4YNBBcd8=\n"), Locale.getDefault()).format(new Date(s5Var.OooO0o0)));
        o0o00o0.OooO00o.setOnClickListener(new o0O0ooO(this, s5Var, 1));
        o0o00o0.OooOo0o.setOnClickListener(new o0oOO(this, s5Var));
    }

    @Override // com.cmaster.cloner.a71
    public final y71 OooO0oO(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.barcode_history_item, viewGroup, false);
        o0O00o0 o0o00o0 = new o0O00o0(viewInflate);
        o0o00o0.OooOo0 = (TextView) viewInflate.findViewById(R.id.tv_qrcode_result);
        o0o00o0.OooOo0O = (TextView) viewInflate.findViewById(R.id.tv_qrcode_time);
        o0o00o0.OooOo0o = (ImageView) viewInflate.findViewById(R.id.iv_qrcode_result_copy);
        return o0o00o0;
    }
}
