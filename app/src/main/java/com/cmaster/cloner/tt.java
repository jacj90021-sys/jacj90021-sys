package com.cmaster.cloner;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tt extends jw {
    public final o0oOOo OooO;
    public final int OooO0o;
    public final int OooO0o0;
    public final TimeInterpolator OooO0oO;
    public AutoCompleteTextView OooO0oo;
    public final wd OooOO0;
    public final st OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public long OooOOOO;
    public AccessibilityManager OooOOOo;
    public ValueAnimator OooOOo;
    public ValueAnimator OooOOo0;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.cmaster.cloner.st] */
    public tt(iw iwVar) {
        super(iwVar);
        this.OooO = new o0oOOo(this, 2);
        this.OooOO0 = new wd(this, 1);
        this.OooOO0O = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.cmaster.cloner.st
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                tt ttVar = this.OooO00o;
                AutoCompleteTextView autoCompleteTextView = ttVar.OooO0oo;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                ttVar.OooO0Oo.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.OooOOOO = Long.MAX_VALUE;
        this.OooO0o = ow2.OooO0OO(iwVar.getContext(), R.attr.motionDurationShort3, 67);
        this.OooO0o0 = ow2.OooO0OO(iwVar.getContext(), R.attr.motionDurationShort3, 50);
        this.OooO0oO = ow2.OooO0Oo(iwVar.getContext(), R.attr.motionEasingLinearInterpolator, oO0oO000.OooO00o);
    }

    @Override // com.cmaster.cloner.jw
    public final boolean OooO(int i) {
        return i != 0;
    }

    @Override // com.cmaster.cloner.jw
    public final void OooO00o() {
        if (this.OooOOOo.isTouchExplorationEnabled() && this.OooO0oo.getInputType() != 0 && !this.OooO0Oo.hasFocus()) {
            this.OooO0oo.dismissDropDown();
        }
        this.OooO0oo.post(new o00OOOOo(this, 8));
    }

    @Override // com.cmaster.cloner.jw
    public final int OooO0OO() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.cmaster.cloner.jw
    public final int OooO0Oo() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.cmaster.cloner.jw
    public final View.OnClickListener OooO0o() {
        return this.OooO;
    }

    @Override // com.cmaster.cloner.jw
    public final View.OnFocusChangeListener OooO0o0() {
        return this.OooOO0;
    }

    @Override // com.cmaster.cloner.jw
    public final AccessibilityManager.TouchExplorationStateChangeListener OooO0oo() {
        return this.OooOO0O;
    }

    @Override // com.cmaster.cloner.jw
    public final boolean OooOO0O() {
        return this.OooOOO;
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOO0o(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            ra.OooOOO0("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.OooO0oo = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.cmaster.cloner.qt
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    tt ttVar = this.OooO0Oo;
                    long j = jUptimeMillis - ttVar.OooOOOO;
                    if (j < 0 || j > 300) {
                        ttVar.OooOOO0 = false;
                    }
                    ttVar.OooOo00();
                    ttVar.OooOOO0 = true;
                    ttVar.OooOOOO = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.OooO0oo.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.cmaster.cloner.rt
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                tt ttVar = this.OooO00o;
                ttVar.OooOOO0 = true;
                ttVar.OooOOOO = SystemClock.uptimeMillis();
                ttVar.OooOOoo(false);
            }
        });
        this.OooO0oo.setThreshold(0);
        TextInputLayout textInputLayout = this.OooO00o;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.OooOOOo.isTouchExplorationEnabled()) {
            this.OooO0Oo.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOOO(AccessibilityEvent accessibilityEvent) {
        if (this.OooOOOo.isEnabled() && this.OooO0oo.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.OooOOO && !this.OooO0oo.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                OooOo00();
                this.OooOOO0 = true;
                this.OooOOOO = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOOO0(o000O00O o000o00o) {
        AccessibilityNodeInfo accessibilityNodeInfo = o000o00o.OooO00o;
        if (this.OooO0oo.getInputType() == 0) {
            accessibilityNodeInfo.setClassName("android.widget.Spinner");
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 ? accessibilityNodeInfo.isShowingHintText() : o000o00o.OooO0Oo(4)) {
            if (i >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOOo() {
        AutoCompleteTextView autoCompleteTextView = this.OooO0oo;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.OooO0oo.setOnDismissListener(null);
        }
    }

    @Override // com.cmaster.cloner.jw
    public final void OooOOo0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.OooO0oO;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.OooO0o);
        int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new wp(this, i));
        this.OooOOo = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.OooO0o0);
        valueAnimatorOfFloat2.addUpdateListener(new wp(this, i));
        this.OooOOo0 = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new oOO00O(this, 3));
        this.OooOOOo = (AccessibilityManager) this.OooO0OO.getSystemService("accessibility");
    }

    public final void OooOOoo(boolean z) {
        if (this.OooOOO != z) {
            this.OooOOO = z;
            this.OooOOo.cancel();
            this.OooOOo0.start();
        }
    }

    public final void OooOo00() {
        if (this.OooO0oo == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.OooOOOO;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.OooOOO0 = false;
        }
        if (this.OooOOO0) {
            this.OooOOO0 = false;
            return;
        }
        OooOOoo(!this.OooOOO);
        boolean z = this.OooOOO;
        AutoCompleteTextView autoCompleteTextView = this.OooO0oo;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.OooO0oo.showDropDown();
        }
    }
}
