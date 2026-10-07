package com.cmaster.cloner;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class q extends EditText implements iz0 {
    public p OooO;
    public final oO0OOo0o OooO0Oo;
    public final o0O000O OooO0o;
    public final s0 OooO0o0;
    public final rm1 OooO0oO;
    public final e81 OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        hn1.OooO00o(context);
        sm1.OooO00o(getContext(), this);
        oO0OOo0o oo0ooo0o = new oO0OOo0o(this);
        this.OooO0Oo = oo0ooo0o;
        oo0ooo0o.OooOO0o(attributeSet, i);
        s0 s0Var = new s0(this);
        this.OooO0o0 = s0Var;
        s0Var.OooO0o(attributeSet, i);
        s0Var.OooO0O0();
        o0O000O o0o000o = new o0O000O(6, false);
        o0o000o.OooO0o0 = this;
        this.OooO0o = o0o000o;
        this.OooO0oO = new rm1();
        e81 e81Var = new e81(this);
        this.OooO0oo = e81Var;
        e81Var.OooOOo(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerOooOO0o = e81Var.OooOO0o(keyListener);
        if (keyListenerOooOO0o == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerOooOO0o);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private p getSuperCaller() {
        if (this.OooO == null) {
            this.OooO = new p(this);
        }
        return this.OooO;
    }

    @Override // com.cmaster.cloner.iz0
    public final ri OooO00o(ri riVar) {
        this.OooO0oO.getClass();
        return rm1.OooO00o(this, riVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooO0O0();
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o43.OooO0o0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            return oo0ooo0o.OooO();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            return oo0ooo0o.OooOO0();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.OooO0o0.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.OooO0o0.OooO0o0();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        o0O000O o0o000o;
        if (Build.VERSION.SDK_INT >= 28 || (o0o000o = this.OooO0o) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) o0o000o.OooO0o;
        return textClassifier == null ? l0.OooO00o((TextView) o0o000o.OooO0o0) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[PHI: r1
      0x0056: PHI (r1v9 java.lang.String[]) = (r1v4 java.lang.String[]), (r1v10 java.lang.String[]) binds: [B:30:0x0069, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            com.cmaster.cloner.s0 r1 = r7.OooO0o0
            r1.getClass()
            com.cmaster.cloner.s0.OooO0oo(r8, r0, r7)
            com.cmaster.cloner.um2.OooO00o(r8, r0, r7)
            if (r0 == 0) goto L76
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L76
            java.lang.String[] r2 = com.cmaster.cloner.nt1.OooO0oO(r7)
            if (r2 == 0) goto L76
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            com.cmaster.cloner.lu.OooOOoo(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            com.cmaster.cloner.pg0 r2 = new com.cmaster.cloner.pg0
            r2.<init>(r7)
            if (r1 < r5) goto L4c
            com.cmaster.cloner.qg0 r1 = new com.cmaster.cloner.qg0
            r1.<init>(r0, r2)
        L4a:
            r0 = r1
            goto L76
        L4c:
            java.lang.String[] r6 = com.cmaster.cloner.zp1.OooO00o
            if (r1 < r5) goto L58
            java.lang.String[] r1 = com.cmaster.cloner.lu.OooOo0(r8)
            if (r1 == 0) goto L6c
        L56:
            r6 = r1
            goto L6c
        L58:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5d
            goto L6c
        L5d:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L69
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L69:
            if (r1 == 0) goto L6c
            goto L56
        L6c:
            int r1 = r6.length
            if (r1 != 0) goto L70
            goto L76
        L70:
            com.cmaster.cloner.rg0 r1 = new com.cmaster.cloner.rg0
            r1.<init>(r0, r2)
            goto L4a
        L76:
            com.cmaster.cloner.e81 r7 = r7.OooO0oo
            com.cmaster.cloner.xu r7 = r7.OooOOoo(r0, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.q.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zOooO00o = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && nt1.OooO0oO(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zOooO00o = x.OooO00o(dragEvent, this, activity);
            }
        }
        if (zOooO00o) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        oi xb1Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || nt1.OooO0oO(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                xb1Var = new xb1(primaryClip, 1);
            } else {
                pi piVar = new pi();
                piVar.OooO0o0 = primaryClip;
                piVar.OooO0o = 1;
                xb1Var = piVar;
            }
            xb1Var.OooOOOo(i == 16908322 ? 0 : 1);
            nt1.OooO(this, xb1Var.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOOO();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOOOO(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o43.OooO0o(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.OooO0oo.OooOoOO(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.OooO0oo.OooOO0o(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOo0(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooOo0O(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        s0 s0Var = this.OooO0o0;
        s0Var.OooOO0o(colorStateList);
        s0Var.OooO0O0();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        s0 s0Var = this.OooO0o0;
        s0Var.OooOOO0(mode);
        s0Var.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO0oO(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        o0O000O o0o000o;
        if (Build.VERSION.SDK_INT >= 28 || (o0o000o = this.OooO0o) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o0o000o.OooO0o = textClassifier;
        }
    }
}
