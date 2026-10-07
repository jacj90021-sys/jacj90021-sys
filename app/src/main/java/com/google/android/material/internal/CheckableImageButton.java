package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import com.cmaster.cloner.b7;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.oc;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] OooOO0 = {R.attr.state_checked};
    public boolean OooO;
    public boolean OooO0oO;
    public boolean OooO0oo;

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooO0oo = true;
        this.OooO = true;
        nt1.OooOOO0(this, new b7(this, 2));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.OooO0oO;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.OooO0oO ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), OooOO0) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof oc)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oc ocVar = (oc) parcelable;
        super.onRestoreInstanceState(ocVar.OooO0Oo);
        setChecked(ocVar.OooO0o);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        oc ocVar = new oc(super.onSaveInstanceState());
        ocVar.OooO0o = this.OooO0oO;
        return ocVar;
    }

    public void setCheckable(boolean z) {
        if (this.OooO0oo != z) {
            this.OooO0oo = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.OooO0oo || this.OooO0oO == z) {
            return;
        }
        this.OooO0oO = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.OooO = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.OooO) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.OooO0oO);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.cmaster.cloner.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
