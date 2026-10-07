package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cmaster.cloner.R;
import com.cmaster.cloner.oO0oO000;
import com.cmaster.cloner.ow2;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView OooO0Oo;
    public final TimeInterpolator OooO0o;
    public Button OooO0o0;
    public int OooO0oO;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0o = ow2.OooO0Oo(context, R.attr.motionEasingEmphasizedInterpolator, oO0oO000.OooO0O0);
    }

    public final boolean OooO00o(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.OooO0Oo.getPaddingTop() == i2 && this.OooO0Oo.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.OooO0Oo;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.OooO0o0;
    }

    public TextView getMessageView() {
        return this.OooO0Oo;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.OooO0Oo = (TextView) findViewById(R.id.snackbar_text);
        this.OooO0o0 = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.OooO0Oo.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.OooO0oO <= 0 || this.OooO0o0.getMeasuredWidth() <= this.OooO0oO) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!OooO00o(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!OooO00o(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.OooO0oO = i;
    }

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }
}
