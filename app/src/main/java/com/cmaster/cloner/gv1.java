package com.cmaster.cloner;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gv1 extends Dialog {
    public yo OooO0Oo;
    public fv1 OooO0o0;

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        m1 m1Var = (m1) j1.OooO00o(getContext());
        View viewInflate = getLayoutInflater().inflate(R.layout.launch_preview, (ViewGroup) null, false);
        int i = R.id.circular_indicator;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l53.OooO00o(viewInflate, R.id.circular_indicator);
        if (circularProgressIndicator != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) l53.OooO00o(viewInflate, R.id.container);
            if (frameLayout != null) {
                i = R.id.image_view;
                ImageView imageView = (ImageView) l53.OooO00o(viewInflate, R.id.image_view);
                if (imageView != null) {
                    i = R.id.title;
                    TextView textView = (TextView) l53.OooO00o(viewInflate, R.id.title);
                    if (textView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        yo yoVar = new yo();
                        yoVar.OooO0Oo = constraintLayout;
                        yoVar.OooO0o0 = circularProgressIndicator;
                        yoVar.OooO0o = frameLayout;
                        yoVar.OooO0oO = imageView;
                        yoVar.OooO0oo = textView;
                        this.OooO0Oo = yoVar;
                        setContentView(constraintLayout);
                        h1.OooO0Oo.execute(new u91(this, 11));
                        ((CircularProgressIndicator) this.OooO0Oo.OooO0o0).setIndeterminate(true);
                        m1Var.OooO0oO.OooO0OO(new so(this, m1Var));
                        return;
                    }
                }
            }
        }
        qa.OooOOO0(sn2.OooO00o("BPVthrpq0Bc7+W+AunbSU2nqd5CkJMBePfQ+vJc+lw==\n", "SZwe9dMEtzc=\n").concat(viewInflate.getResources().getResourceName(i)));
    }
}
