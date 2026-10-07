package com.cmaster.cloner;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.cmaster.cloner.ui.HomeActivity;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u70 implements iy0 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ HomeActivity OooO0o0;

    public /* synthetic */ u70(HomeActivity homeActivity, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = homeActivity;
    }

    @Override // com.cmaster.cloner.iy0
    public final void OooO00o(Object obj) {
        int i = this.OooO0Oo;
        HomeActivity homeActivity = this.OooO0o0;
        int i2 = 1;
        switch (i) {
            case 0:
                if (((Integer) obj).intValue() >= 1) {
                    Intent intent = homeActivity.getIntent();
                    int i3 = HomeActivity.Oooo00O;
                    yu1 yu1Var = yu1.OooOOO0;
                    yu1Var.OooO0o.OooO0o0(homeActivity, new t70(homeActivity, yu1Var, intent));
                    homeActivity.OooOoO(g80.class, Bundle.EMPTY);
                    break;
                }
                break;
            default:
                if (((Integer) obj).intValue() < 1) {
                    jn0 jn0Var = new jn0(this, i2);
                    zp0 zp0Var = new zp0(homeActivity);
                    oO00o0 oo00o0 = (oO00o0) zp0Var.OooO0o0;
                    oo00o0.OooO = oo00o0.OooO00o.getText(R.string.privacy_negative);
                    oo00o0.OooOO0 = jn0Var;
                    oo00o0.OooO0oO = oo00o0.OooO00o.getText(R.string.privacy_positive);
                    oo00o0.OooO0oo = jn0Var;
                    oo00o0.OooOOO0 = false;
                    oo00o0.OooO0Oo = oo00o0.OooO00o.getText(R.string.privacy_dialog_title);
                    String string = homeActivity.getString(R.string.privacy_dialog_body);
                    oOO0OO ooo0oo = new oOO0OO();
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) Html.fromHtml(string);
                    for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                        int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                        w41 w41Var = new w41(uRLSpan.getURL(), uRLSpan, ooo0oo);
                        spannableStringBuilder.removeSpan(uRLSpan);
                        spannableStringBuilder.setSpan(w41Var, spanStart, spanEnd, spanFlags);
                    }
                    oo00o0.OooO0o = spannableStringBuilder;
                    oOo0000O ooo0000oOooO0OO = zp0Var.OooO0OO();
                    ooo0000oOooO0OO.show();
                    ((TextView) ooo0000oOooO0OO.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());
                    break;
                }
                break;
        }
    }
}
