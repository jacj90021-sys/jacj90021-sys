package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k0 extends Spinner {
    public static final int[] OooOO0o = {android.R.attr.spinnerMode};
    public final j0 OooO;
    public final oO0OOo0o OooO0Oo;
    public final a0 OooO0o;
    public final Context OooO0o0;
    public SpinnerAdapter OooO0oO;
    public final boolean OooO0oo;
    public int OooOO0;
    public final Rect OooOO0O;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k0(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130969728(0x7f040480, float:1.7548146E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.OooOO0O = r1
            android.content.Context r1 = r12.getContext()
            com.cmaster.cloner.sm1.OooO00o(r1, r12)
            int[] r1 = com.cmaster.cloner.l61.OooOo0O
            com.cmaster.cloner.a02 r2 = com.cmaster.cloner.a02.Oooo0OO(r13, r14, r1, r0)
            java.lang.Object r3 = r2.OooO0o
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            com.cmaster.cloner.oO0OOo0o r4 = new com.cmaster.cloner.oO0OOo0o
            r4.<init>(r12)
            r12.OooO0Oo = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            com.cmaster.cloner.ej r6 = new com.cmaster.cloner.ej
            r6.<init>(r13, r4)
            r12.OooO0o0 = r6
            goto L37
        L35:
            r12.OooO0o0 = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = com.cmaster.cloner.k0.OooOO0o     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r12 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r12 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            com.cmaster.cloner.h0 r4 = new com.cmaster.cloner.h0
            android.content.Context r9 = r12.OooO0o0
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.OooO0o0
            com.cmaster.cloner.a02 r1 = com.cmaster.cloner.a02.Oooo0OO(r9, r14, r1, r0)
            java.lang.Object r9 = r1.OooO0o
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.OooOO0 = r9
            android.graphics.drawable.Drawable r9 = r1.OooOOo(r8)
            r4.OooO0oO(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.Oooo000 = r7
            r1.Oooo0oO()
            r12.OooO = r4
            com.cmaster.cloner.a0 r1 = new com.cmaster.cloner.a0
            r1.<init>(r12, r12, r4)
            r12.OooO0o = r1
            goto Laa
        L9d:
            com.cmaster.cloner.d0 r1 = new com.cmaster.cloner.d0
            r1.<init>(r12)
            r12.OooO = r1
            java.lang.String r4 = r3.getString(r7)
            r1.OooO0o = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131493019(0x7f0c009b, float:1.8609506E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.Oooo0oO()
            r12.OooO0oo = r8
            android.widget.SpinnerAdapter r13 = r12.OooO0oO
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.OooO0oO = r6
        Lcf:
            com.cmaster.cloner.oO0OOo0o r12 = r12.OooO0Oo
            r12.OooOO0o(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int OooO00o(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.OooOO0O;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooO0O0();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j0 j0Var = this.OooO;
        return j0Var != null ? j0Var.OooO0O0() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j0 j0Var = this.OooO;
        return j0Var != null ? j0Var.OooOOO() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.OooO != null ? this.OooOO0 : super.getDropDownWidth();
    }

    public final j0 getInternalPopup() {
        return this.OooO;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j0 j0Var = this.OooO;
        return j0Var != null ? j0Var.OooO0o0() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.OooO0o0;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j0 j0Var = this.OooO;
        return j0Var != null ? j0Var.OooO0Oo() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j0 j0Var = this.OooO;
        if (j0Var == null || !j0Var.OooO00o()) {
            return;
        }
        j0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.OooO == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), OooO00o(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i0 i0Var = (i0) parcelable;
        super.onRestoreInstanceState(i0Var.getSuperState());
        if (!i0Var.OooO0Oo || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b0(this, 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        i0 i0Var = new i0(super.onSaveInstanceState());
        j0 j0Var = this.OooO;
        i0Var.OooO0Oo = j0Var != null && j0Var.OooO00o();
        return i0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a0 a0Var = this.OooO0o;
        if (a0Var == null || !a0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        j0 j0Var = this.OooO;
        if (j0Var == null) {
            return super.performClick();
        }
        if (j0Var.OooO00o()) {
            return true;
        }
        j0Var.OooOOO0(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.OooO0oo) {
            this.OooO0oO = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        j0 j0Var = this.OooO;
        if (j0Var != null) {
            Context context = this.OooO0o0;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            e0 e0Var = new e0();
            e0Var.OooO0Oo = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                e0Var.OooO0o0 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                c0.OooO00o((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            j0Var.OooOOOO(e0Var);
        }
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        j0 j0Var = this.OooO;
        if (j0Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            j0Var.OooOO0(i);
            j0Var.OooO0OO(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        j0 j0Var = this.OooO;
        if (j0Var != null) {
            j0Var.OooO0oo(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.OooO != null) {
            this.OooOO0 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j0 j0Var = this.OooO;
        if (j0Var != null) {
            j0Var.OooO0oO(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(ym2.OooO00o(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j0 j0Var = this.OooO;
        if (j0Var != null) {
            j0Var.OooO0o(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
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
}
