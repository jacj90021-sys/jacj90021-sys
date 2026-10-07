package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.cmaster.cloner.C0006r;
import com.cmaster.cloner.a1;
import com.cmaster.cloner.f53;
import com.cmaster.cloner.gq1;
import com.cmaster.cloner.hn1;
import com.cmaster.cloner.l0;
import com.cmaster.cloner.nu1;
import com.cmaster.cloner.o000Oo0;
import com.cmaster.cloner.o00OO000;
import com.cmaster.cloner.o0O000O;
import com.cmaster.cloner.o43;
import com.cmaster.cloner.oO0OOo0o;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.s0;
import com.cmaster.cloner.sm1;
import com.cmaster.cloner.t0;
import com.cmaster.cloner.u0;
import com.cmaster.cloner.um2;
import com.cmaster.cloner.v0;
import com.cmaster.cloner.y31;
import com.cmaster.cloner.ym2;
import com.cmaster.cloner.z31;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    public o00OO000 OooO;
    public final oO0OOo0o OooO0Oo;
    public final o0O000O OooO0o;
    public final s0 OooO0o0;
    public C0006r OooO0oO;
    public boolean OooO0oo;
    public Future OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        hn1.OooO00o(context);
        this.OooO0oo = false;
        this.OooO = null;
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
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
    }

    private C0006r getEmojiTextViewHelper() {
        if (this.OooO0oO == null) {
            this.OooO0oO = new C0006r(this);
        }
        return this.OooO0oO;
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
    public int getAutoSizeMaxTextSize() {
        if (nu1.OooO0OO) {
            return super.getAutoSizeMaxTextSize();
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            return Math.round(((a1) s0Var.OooOO0o).OooO0o0);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (nu1.OooO0OO) {
            return super.getAutoSizeMinTextSize();
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            return Math.round(((a1) s0Var.OooOO0o).OooO0Oo);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (nu1.OooO0OO) {
            return super.getAutoSizeStepGranularity();
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            return Math.round(((a1) s0Var.OooOO0o).OooO0OO);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (nu1.OooO0OO) {
            return super.getAutoSizeTextAvailableSizes();
        }
        s0 s0Var = this.OooO0o0;
        return s0Var != null ? ((a1) s0Var.OooOO0o).OooO0o : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (nu1.OooO0OO) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            return ((a1) s0Var.OooOO0o).OooO00o;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o43.OooO0o0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public t0 getSuperCaller() {
        if (this.OooO == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.OooO = new v0(this);
            } else if (i >= 28) {
                this.OooO = new u0(this);
            } else if (i >= 26) {
                this.OooO = new o00OO000(this, 4);
            }
        }
        return this.OooO;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.OooOO0;
        if (future != null) {
            try {
                this.OooOO0 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                o43.OooO00o(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
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

    public y31 getTextMetricsParamsCompat() {
        return o43.OooO00o(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.OooO0o0.getClass();
        s0.OooO0oo(editorInfo, inputConnectionOnCreateInputConnection, this);
        um2.OooO00o(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        s0 s0Var = this.OooO0o0;
        if (s0Var == null || nu1.OooO0OO) {
            return;
        }
        ((a1) s0Var.OooOO0o).OooO00o();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.OooOO0;
        if (future != null) {
            try {
                this.OooOO0 = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                o43.OooO00o(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            a1 a1Var = (a1) s0Var.OooOO0o;
            if (nu1.OooO0OO || !a1Var.OooO0o()) {
                return;
            }
            a1Var.OooO00o();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (nu1.OooO0OO) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (nu1.OooO0OO) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooOO0(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (nu1.OooO0OO) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooOO0O(i);
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ym2.OooO00o(context, i) : null, i2 != 0 ? ym2.OooO00o(context, i2) : null, i3 != 0 ? ym2.OooO00o(context, i3) : null, i4 != 0 ? ym2.OooO00o(context, i4) : null);
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ym2.OooO00o(context, i) : null, i2 != 0 ? ym2.OooO00o(context, i2) : null, i3 != 0 ? ym2.OooO00o(context, i3) : null, i4 != 0 ? ym2.OooO00o(context, i4) : null);
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
        getEmojiTextViewHelper().OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().OooOo0o(i);
        } else {
            o43.OooO0O0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().OooOO0O(i);
        } else {
            o43.OooO0OO(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().OooOoo0(i, f);
        } else if (i2 >= 34) {
            o000Oo0.OooO0oo(this, i, f);
        } else {
            o43.OooO0Oo(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(z31 z31Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        o43.OooO00o(this);
        throw null;
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
    public void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
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

    public void setTextFuture(Future<z31> future) {
        this.OooOO0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(y31 y31Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = y31Var.OooO0O0;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(y31Var.OooO00o);
        setBreakStrategy(y31Var.OooO0OO);
        setHyphenationFrequency(y31Var.OooO0Oo);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = nu1.OooO0OO;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            a1 a1Var = (a1) s0Var.OooOO0o;
            if (z || a1Var.OooO0o()) {
                return;
            }
            a1Var.OooO0oO(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.OooO0oo) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            f53 f53Var = gq1.OooO00o;
            if (context == null) {
                ra.OooOOO("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.OooO0oo = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.OooO0oo = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        o43.OooO0Oo(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        s0 s0Var = this.OooO0o0;
        if (s0Var != null) {
            s0Var.OooO0O0();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }
}
