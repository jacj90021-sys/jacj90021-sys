package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.cmaster.cloner.OooOO0;
import com.cmaster.cloner.a02;
import com.cmaster.cloner.ag1;
import com.cmaster.cloner.ap1;
import com.cmaster.cloner.ct;
import com.cmaster.cloner.ep2;
import com.cmaster.cloner.gp2;
import com.cmaster.cloner.gw;
import com.cmaster.cloner.hc1;
import com.cmaster.cloner.ig0;
import com.cmaster.cloner.iu;
import com.cmaster.cloner.iw;
import com.cmaster.cloner.iw0;
import com.cmaster.cloner.jg0;
import com.cmaster.cloner.k61;
import com.cmaster.cloner.lm1;
import com.cmaster.cloner.mm1;
import com.cmaster.cloner.n;
import com.cmaster.cloner.ne;
import com.cmaster.cloner.nm1;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.ny;
import com.cmaster.cloner.o00OOOOo;
import com.cmaster.cloner.oO0oO000;
import com.cmaster.cloner.om1;
import com.cmaster.cloner.ow2;
import com.cmaster.cloner.pg0;
import com.cmaster.cloner.pm1;
import com.cmaster.cloner.qi1;
import com.cmaster.cloner.qj;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.rj;
import com.cmaster.cloner.rm;
import com.cmaster.cloner.s62;
import com.cmaster.cloner.s7;
import com.cmaster.cloner.sm;
import com.cmaster.cloner.sv2;
import com.cmaster.cloner.t82;
import com.cmaster.cloner.tt;
import com.cmaster.cloner.u8;
import com.cmaster.cloner.u91;
import com.cmaster.cloner.uq0;
import com.cmaster.cloner.ut2;
import com.cmaster.cloner.uv2;
import com.cmaster.cloner.v8;
import com.cmaster.cloner.vp;
import com.cmaster.cloner.wi1;
import com.cmaster.cloner.wq0;
import com.cmaster.cloner.wv2;
import com.cmaster.cloner.ye;
import com.cmaster.cloner.yf1;
import com.cmaster.cloner.ym2;
import com.cmaster.cloner.yv2;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] o000000 = {new int[]{R.attr.state_pressed}, new int[0]};
    public CharSequence OooO;
    public final FrameLayout OooO0Oo;
    public final iw OooO0o;
    public final qi1 OooO0o0;
    public final int OooO0oO;
    public EditText OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public final jg0 OooOOO;
    public int OooOOO0;
    public boolean OooOOOO;
    public int OooOOOo;
    public om1 OooOOo;
    public boolean OooOOo0;
    public AppCompatTextView OooOOoo;
    public AppCompatTextView OooOo;
    public int OooOo0;
    public int OooOo00;
    public CharSequence OooOo0O;
    public boolean OooOo0o;
    public int OooOoO;
    public ColorStateList OooOoO0;
    public ny OooOoOO;
    public ColorStateList OooOoo;
    public ny OooOoo0;
    public ColorStateList OooOooO;
    public ColorStateList OooOooo;
    public ag1 Oooo;
    public boolean Oooo0;
    public ColorStateList Oooo000;
    public boolean Oooo00O;
    public CharSequence Oooo00o;
    public wq0 Oooo0O0;
    public wq0 Oooo0OO;
    public boolean Oooo0o;
    public StateListDrawable Oooo0o0;
    public wq0 Oooo0oO;
    public wq0 Oooo0oo;
    public int OoooO;
    public final int OoooO0;
    public boolean OoooO00;
    public int OoooO0O;
    public int OoooOO0;
    public int OoooOOO;
    public int OoooOOo;
    public int OoooOo0;
    public final Rect OoooOoO;
    public final Rect OoooOoo;
    public final RectF Ooooo00;
    public Typeface Ooooo0o;
    public ColorDrawable OooooO0;
    public int OooooOO;
    public final LinkedHashSet OooooOo;
    public int Oooooo;
    public ColorDrawable Oooooo0;
    public Drawable OoooooO;
    public ColorStateList Ooooooo;
    public boolean o000OOo;
    public int o000oOoO;
    public int o00O0O;
    public int o00Oo0;
    public ColorStateList o00Ooo;
    public int o00o0O;
    public int o00oO0O;
    public int o00oO0o;
    public int o00ooo;
    public boolean o0O0O00;
    public ValueAnimator o0OO00O;
    public boolean o0OOO0o;
    public boolean o0Oo0oo;
    public ColorStateList o0OoOo0;
    public int o0ooOO0;
    public boolean o0ooOOo;
    public final ne o0ooOoO;
    public int oo000o;
    public boolean oo0o0Oo;
    public int ooOO;

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(s62.OooO00o(context, attributeSet, i, com.cmaster.cloner.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.OooOO0 = -1;
        this.OooOO0O = -1;
        this.OooOO0o = -1;
        this.OooOOO0 = -1;
        this.OooOOO = new jg0(this);
        this.OooOOo = new ra(13);
        this.OoooOoO = new Rect();
        this.OoooOoo = new Rect();
        this.Ooooo00 = new RectF();
        this.OooooOo = new LinkedHashSet();
        ne neVar = new ne(this);
        this.o0ooOoO = neVar;
        this.o000OOo = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.OooO0Oo = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = oO0oO000.OooO00o;
        neVar.OoooO0 = linearInterpolator;
        neVar.OooOO0(false);
        neVar.OoooO00 = linearInterpolator;
        neVar.OooOO0(false);
        if (neVar.OooO0oO != 8388659) {
            neVar.OooO0oO = 8388659;
            neVar.OooOO0(false);
        }
        t82.OooO00o(context2, attributeSet, i, com.cmaster.cloner.R.style.Widget_Design_TextInputLayout);
        int[] iArr = k61.OooOo;
        t82.OooO0O0(context2, attributeSet, iArr, i, com.cmaster.cloner.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.cmaster.cloner.R.style.Widget_Design_TextInputLayout);
        a02 a02Var = new a02(context2, typedArrayObtainStyledAttributes);
        qi1 qi1Var = new qi1(this, a02Var);
        this.OooO0o0 = qi1Var;
        this.Oooo00O = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.o0Oo0oo = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.o0OOO0o = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.Oooo = ag1.OooO0O0(context2, attributeSet, i, com.cmaster.cloner.R.style.Widget_Design_TextInputLayout).OooO00o();
        this.OoooO0 = context2.getResources().getDimensionPixelOffset(com.cmaster.cloner.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.OoooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.OooO0oO = getResources().getDimensionPixelSize(com.cmaster.cloner.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.o000oOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.cmaster.cloner.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.OoooOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.cmaster.cloner.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.OoooOO0 = this.o000oOoO;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        yf1 yf1VarOooO0o = this.Oooo.OooO0o();
        if (dimension >= 0.0f) {
            yf1VarOooO0o.OooO0o0 = new OooOO0(dimension);
        }
        if (dimension2 >= 0.0f) {
            yf1VarOooO0o.OooO0o = new OooOO0(dimension2);
        }
        if (dimension3 >= 0.0f) {
            yf1VarOooO0o.OooO0oO = new OooOO0(dimension3);
        }
        if (dimension4 >= 0.0f) {
            yf1VarOooO0o.OooO0oo = new OooOO0(dimension4);
        }
        this.Oooo = yf1VarOooO0o.OooO00o();
        ColorStateList colorStateListOooO0O0 = wv2.OooO0O0(context2, a02Var, 7);
        if (colorStateListOooO0O0 != null) {
            int defaultColor = colorStateListOooO0O0.getDefaultColor();
            this.o00o0O = defaultColor;
            this.OoooOo0 = defaultColor;
            if (colorStateListOooO0O0.isStateful()) {
                this.o00ooo = colorStateListOooO0O0.getColorForState(new int[]{-16842910}, -1);
                this.oo000o = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.o00oO0o = colorStateListOooO0O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.oo000o = this.o00o0O;
                ColorStateList colorStateListOooO0O02 = ep2.OooO0O0(context2, com.cmaster.cloner.R.color.mtrl_filled_background_color);
                this.o00ooo = colorStateListOooO0O02.getColorForState(new int[]{-16842910}, -1);
                this.o00oO0o = colorStateListOooO0O02.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.OoooOo0 = 0;
            this.o00o0O = 0;
            this.o00ooo = 0;
            this.oo000o = 0;
            this.o00oO0o = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListOooOOOo = a02Var.OooOOOo(1);
            this.o0OoOo0 = colorStateListOooOOOo;
            this.Ooooooo = colorStateListOooOOOo;
        }
        ColorStateList colorStateListOooO0O03 = wv2.OooO0O0(context2, a02Var, 14);
        this.o00Oo0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.ooOO = context2.getColor(com.cmaster.cloner.R.color.mtrl_textinput_default_box_stroke_color);
        this.o00oO0O = context2.getColor(com.cmaster.cloner.R.color.mtrl_textinput_disabled_color);
        this.o00O0O = context2.getColor(com.cmaster.cloner.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListOooO0O03 != null) {
            setBoxStrokeColorStateList(colorStateListOooO0O03);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(wv2.OooO0O0(context2, a02Var, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.OooOooo = a02Var.OooOOOo(24);
        this.Oooo000 = a02Var.OooOOOo(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i2 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.OooOo0 = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.OooOo00 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.OooOo00);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.OooOo0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(a02Var.OooOOOo(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(a02Var.OooOOOo(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(a02Var.OooOOOo(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(a02Var.OooOOOo(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(a02Var.OooOOOo(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(a02Var.OooOOOo(59));
        }
        iw iwVar = new iw(this, a02Var);
        this.OooO0o = iwVar;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        a02Var.Oooo0oO();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(qi1Var);
        frameLayout.addView(iwVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    public static void OooOOO0(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                OooOOO0((ViewGroup) childAt, z);
            }
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.OooO0oo;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.Oooo0O0;
        }
        int iOooO0OO = uv2.OooO0OO(this.OooO0oo, com.cmaster.cloner.R.attr.colorControlHighlight);
        int i = this.OoooO0O;
        int[][] iArr = o000000;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            wq0 wq0Var = this.Oooo0O0;
            int i2 = this.OoooOo0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{uv2.OooO0o0(iOooO0OO, i2, 0.1f), i2}), wq0Var, wq0Var);
        }
        Context context = getContext();
        wq0 wq0Var2 = this.Oooo0O0;
        TypedValue typedValueOooO00o = sv2.OooO00o(context, com.cmaster.cloner.R.attr.colorSurface);
        if (typedValueOooO00o == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", "TextInputLayout", context.getResources().getResourceName(com.cmaster.cloner.R.attr.colorSurface)));
        }
        int i3 = typedValueOooO00o.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValueOooO00o.data;
        wq0 wq0Var3 = new wq0(wq0Var2.OooO0o0.OooO00o);
        int iOooO0o0 = uv2.OooO0o0(iOooO0OO, color, 0.1f);
        wq0Var3.OooOO0o(new ColorStateList(iArr, new int[]{iOooO0o0, 0}));
        wq0Var3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iOooO0o0, color});
        wq0 wq0Var4 = new wq0(wq0Var2.OooO0o0.OooO00o);
        wq0Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, wq0Var3, wq0Var4), wq0Var2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.Oooo0o0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.Oooo0o0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.Oooo0o0.addState(new int[0], OooO0oo(false));
        }
        return this.Oooo0o0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.Oooo0OO == null) {
            this.Oooo0OO = OooO0oo(true);
        }
        return this.Oooo0OO;
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.OooO0oo != null) {
            ra.OooOOO("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.OooO0oo = editText;
        int i = this.OooOO0;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.OooOO0o);
        }
        int i2 = this.OooOO0O;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.OooOOO0);
        }
        this.Oooo0o = false;
        OooOO0O();
        setTextInputAccessibilityDelegate(new nm1(this));
        Typeface typeface = this.OooO0oo.getTypeface();
        ne neVar = this.o0ooOoO;
        neVar.OooOOO(typeface);
        float textSize = this.OooO0oo.getTextSize();
        if (neVar.OooO0oo != textSize) {
            neVar.OooO0oo = textSize;
            neVar.OooOO0(false);
        }
        float letterSpacing = this.OooO0oo.getLetterSpacing();
        if (neVar.OoooOOo != letterSpacing) {
            neVar.OoooOOo = letterSpacing;
            neVar.OooOO0(false);
        }
        int gravity = this.OooO0oo.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (neVar.OooO0oO != i3) {
            neVar.OooO0oO = i3;
            neVar.OooOO0(false);
        }
        if (neVar.OooO0o != gravity) {
            neVar.OooO0o = gravity;
            neVar.OooOO0(false);
        }
        this.o0ooOO0 = editText.getMinimumHeight();
        this.OooO0oo.addTextChangedListener(new mm1(this, editText));
        if (this.Ooooooo == null) {
            this.Ooooooo = this.OooO0oo.getHintTextColors();
        }
        if (this.Oooo00O) {
            if (TextUtils.isEmpty(this.Oooo00o)) {
                CharSequence hint = this.OooO0oo.getHint();
                this.OooO = hint;
                setHint(hint);
                this.OooO0oo.setHint((CharSequence) null);
            }
            this.Oooo0 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            OooOOo();
        }
        if (this.OooOOoo != null) {
            OooOOOo(this.OooO0oo.getText());
        }
        OooOo00();
        this.OooOOO.OooO0O0();
        this.OooO0o0.bringToFront();
        iw iwVar = this.OooO0o;
        iwVar.bringToFront();
        Iterator it = this.OooooOo.iterator();
        while (it.hasNext()) {
            ((gw) it.next()).OooO00o(this);
        }
        iwVar.OooOO0o();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        OooOo0o(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.Oooo00o)) {
            return;
        }
        this.Oooo00o = charSequence;
        ne neVar = this.o0ooOoO;
        if (charSequence == null || !TextUtils.equals(neVar.OooOoo0, charSequence)) {
            neVar.OooOoo0 = charSequence;
            neVar.OooOoo = null;
            neVar.OooOO0(false);
        }
        if (this.o0ooOOo) {
            return;
        }
        OooOO0o();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.OooOo0o == z) {
            return;
        }
        AppCompatTextView appCompatTextView = this.OooOo;
        if (!z) {
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            this.OooOo = null;
        } else if (appCompatTextView != null) {
            this.OooO0Oo.addView(appCompatTextView);
            this.OooOo.setVisibility(0);
        }
        this.OooOo0o = z;
    }

    public final int OooO(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.OooO0oo.getCompoundPaddingLeft() : this.OooO0o.OooO0O0() : this.OooO0o0.OooO00o()) + i;
    }

    public final void OooO00o() {
        if (this.OooO0oo == null || this.OoooO0O != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.OooO0oo;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.o0ooOoO.OooO0o() + this.OooO0oO), this.OooO0oo.getPaddingEnd(), getResources().getDimensionPixelSize(com.cmaster.cloner.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.OooO0oo;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.cmaster.cloner.R.dimen.material_filled_edittext_font_2_0_padding_top), this.OooO0oo.getPaddingEnd(), getResources().getDimensionPixelSize(com.cmaster.cloner.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (wv2.OooO0Oo(getContext())) {
            EditText editText3 = this.OooO0oo;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.cmaster.cloner.R.dimen.material_filled_edittext_font_1_3_padding_top), this.OooO0oo.getPaddingEnd(), getResources().getDimensionPixelSize(com.cmaster.cloner.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    public final void OooO0O0(float f) {
        ne neVar = this.o0ooOoO;
        if (neVar.OooO0O0 == f) {
            return;
        }
        if (this.o0OO00O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.o0OO00O = valueAnimator;
            valueAnimator.setInterpolator(ow2.OooO0Oo(getContext(), com.cmaster.cloner.R.attr.motionEasingEmphasizedInterpolator, oO0oO000.OooO0O0));
            this.o0OO00O.setDuration(ow2.OooO0OO(getContext(), com.cmaster.cloner.R.attr.motionDurationMedium4, 167));
            this.o0OO00O.addUpdateListener(new u8(this, 7));
        }
        this.o0OO00O.setFloatValues(neVar.OooO0O0, f);
        this.o0OO00O.start();
    }

    public final void OooO0OO() {
        int i;
        int i2;
        wq0 wq0Var = this.Oooo0O0;
        if (wq0Var == null) {
            return;
        }
        ag1 ag1Var = wq0Var.OooO0o0.OooO00o;
        ag1 ag1Var2 = this.Oooo;
        if (ag1Var != ag1Var2) {
            wq0Var.setShapeAppearanceModel(ag1Var2);
        }
        if (this.OoooO0O == 2 && (i = this.OoooOO0) > -1 && (i2 = this.OoooOOo) != 0) {
            wq0 wq0Var2 = this.Oooo0O0;
            wq0Var2.OooO0o0.OooOO0O = i;
            wq0Var2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            uq0 uq0Var = wq0Var2.OooO0o0;
            if (uq0Var.OooO0o0 != colorStateListValueOf) {
                uq0Var.OooO0o0 = colorStateListValueOf;
                wq0Var2.onStateChange(wq0Var2.getState());
            }
        }
        int iOooO0O0 = this.OoooOo0;
        if (this.OoooO0O == 1) {
            iOooO0O0 = ye.OooO0O0(this.OoooOo0, uv2.OooO0O0(getContext(), com.cmaster.cloner.R.attr.colorSurface, 0));
        }
        this.OoooOo0 = iOooO0O0;
        this.Oooo0O0.OooOO0o(ColorStateList.valueOf(iOooO0O0));
        wq0 wq0Var3 = this.Oooo0oO;
        if (wq0Var3 != null && this.Oooo0oo != null) {
            if (this.OoooOO0 > -1 && this.OoooOOo != 0) {
                wq0Var3.OooOO0o(this.OooO0oo.isFocused() ? ColorStateList.valueOf(this.ooOO) : ColorStateList.valueOf(this.OoooOOo));
                this.Oooo0oo.OooOO0o(ColorStateList.valueOf(this.OoooOOo));
            }
            invalidate();
        }
        OooOo0();
    }

    public final Rect OooO0Oo(Rect rect) {
        if (this.OooO0oo == null) {
            ra.OooO0O0();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.OoooOoo;
        rect2.bottom = i;
        int i2 = this.OoooO0O;
        if (i2 == 1) {
            rect2.left = OooO(rect.left, z);
            rect2.top = rect.top + this.OoooO;
            rect2.right = OooOO0(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = OooO(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = OooOO0(rect.right, z);
            return rect2;
        }
        rect2.left = this.OooO0oo.getPaddingLeft() + i3;
        rect2.top = rect.top - OooO0o0();
        rect2.right = rect.right - this.OooO0oo.getPaddingRight();
        return rect2;
    }

    public final ny OooO0o() {
        ny nyVar = new ny();
        nyVar.OooO0o = ow2.OooO0OO(getContext(), com.cmaster.cloner.R.attr.motionDurationShort2, 87);
        nyVar.OooO0oO = ow2.OooO0Oo(getContext(), com.cmaster.cloner.R.attr.motionEasingLinearInterpolator, oO0oO000.OooO00o);
        return nyVar;
    }

    public final int OooO0o0() {
        if (this.Oooo00O) {
            int i = this.OoooO0O;
            ne neVar = this.o0ooOoO;
            if (i == 0) {
                return (int) neVar.OooO0o();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (neVar.OooO0o() / 2.0f);
                }
                float fOooO0o = neVar.OooO0o();
                TextPaint textPaint = neVar.Oooo;
                textPaint.setTextSize(neVar.OooO);
                textPaint.setTypeface(neVar.OooOOoo);
                textPaint.setLetterSpacing(neVar.OoooOOO);
                return Math.max(0, (int) (fOooO0o - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final boolean OooO0oO() {
        return this.Oooo00O && !TextUtils.isEmpty(this.Oooo00o) && (this.Oooo0O0 instanceof sm);
    }

    public final wq0 OooO0oo(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.cmaster.cloner.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.OooO0oo;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.cmaster.cloner.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.cmaster.cloner.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        hc1 hc1Var = new hc1();
        hc1 hc1Var2 = new hc1();
        hc1 hc1Var3 = new hc1();
        hc1 hc1Var4 = new hc1();
        int i = 0;
        iu iuVar = new iu(i);
        iu iuVar2 = new iu(i);
        iu iuVar3 = new iu(i);
        iu iuVar4 = new iu(i);
        OooOO0 oooOO0 = new OooOO0(f);
        OooOO0 oooOO02 = new OooOO0(f);
        OooOO0 oooOO03 = new OooOO0(dimensionPixelOffset);
        OooOO0 oooOO04 = new OooOO0(dimensionPixelOffset);
        ag1 ag1Var = new ag1();
        ag1Var.OooO00o = hc1Var;
        ag1Var.OooO0O0 = hc1Var2;
        ag1Var.OooO0OO = hc1Var3;
        ag1Var.OooO0Oo = hc1Var4;
        ag1Var.OooO0o0 = oooOO0;
        ag1Var.OooO0o = oooOO02;
        ag1Var.OooO0oO = oooOO04;
        ag1Var.OooO0oo = oooOO03;
        ag1Var.OooO = iuVar;
        ag1Var.OooOO0 = iuVar2;
        ag1Var.OooOO0O = iuVar3;
        ag1Var.OooOO0o = iuVar4;
        EditText editText2 = this.OooO0oo;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = wq0.Oooo0;
            String simpleName = wq0.class.getSimpleName();
            TypedValue typedValueOooO00o = sv2.OooO00o(context, com.cmaster.cloner.R.attr.colorSurface);
            if (typedValueOooO00o == null) {
                throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", simpleName, context.getResources().getResourceName(com.cmaster.cloner.R.attr.colorSurface)));
            }
            int i2 = typedValueOooO00o.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : typedValueOooO00o.data);
        }
        wq0 wq0Var = new wq0();
        wq0Var.OooO(context);
        wq0Var.OooOO0o(dropDownBackgroundTintList);
        wq0Var.OooOO0O(popupElevation);
        wq0Var.setShapeAppearanceModel(ag1Var);
        uq0 uq0Var = wq0Var.OooO0o0;
        if (uq0Var.OooO0oo == null) {
            uq0Var.OooO0oo = new Rect();
        }
        wq0Var.OooO0o0.OooO0oo.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        wq0Var.invalidateSelf();
        return wq0Var;
    }

    public final int OooOO0(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.OooO0oo.getCompoundPaddingRight() : this.OooO0o0.OooO00o() : this.OooO0o.OooO0O0());
    }

    public final void OooOO0O() throws Resources.NotFoundException {
        int i = this.OoooO0O;
        if (i == 0) {
            this.Oooo0O0 = null;
            this.Oooo0oO = null;
            this.Oooo0oo = null;
        } else if (i == 1) {
            this.Oooo0O0 = new wq0(this.Oooo);
            this.Oooo0oO = new wq0();
            this.Oooo0oo = new wq0();
        } else {
            if (i != 2) {
                ra.OooOOO(rj.OooO0o(new StringBuilder(), this.OoooO0O, " is illegal; only @BoxBackgroundMode constants are supported."));
                return;
            }
            if (!this.Oooo00O || (this.Oooo0O0 instanceof sm)) {
                this.Oooo0O0 = new wq0(this.Oooo);
            } else {
                ag1 ag1Var = this.Oooo;
                int i2 = sm.Oooo0o0;
                if (ag1Var == null) {
                    ag1Var = new ag1();
                }
                rm rmVar = new rm(ag1Var, new RectF());
                sm smVar = new sm(rmVar);
                smVar.Oooo0OO = rmVar;
                this.Oooo0O0 = smVar;
            }
            this.Oooo0oO = null;
            this.Oooo0oo = null;
        }
        OooOo0();
        OooOoO();
        if (this.OoooO0O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.OoooO = getResources().getDimensionPixelSize(com.cmaster.cloner.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (wv2.OooO0Oo(getContext())) {
                this.OoooO = getResources().getDimensionPixelSize(com.cmaster.cloner.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        OooO00o();
        if (this.OoooO0O != 0) {
            OooOo0O();
        }
        EditText editText = this.OooO0oo;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.OoooO0O;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOO0o() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooOO0o():void");
    }

    public final void OooOOO(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.cmaster.cloner.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(com.cmaster.cloner.R.color.design_error));
    }

    public final boolean OooOOOO() {
        jg0 jg0Var = this.OooOOO;
        return (jg0Var.OooOOOO != 1 || jg0Var.OooOOo == null || TextUtils.isEmpty(jg0Var.OooOOOo)) ? false : true;
    }

    public final void OooOOOo(Editable editable) throws Resources.NotFoundException {
        ((ra) this.OooOOo).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.OooOOo0;
        int i = this.OooOOOo;
        String string = null;
        if (i == -1) {
            this.OooOOoo.setText(String.valueOf(length));
            this.OooOOoo.setContentDescription(null);
            this.OooOOo0 = false;
        } else {
            this.OooOOo0 = length > i;
            this.OooOOoo.setContentDescription(getContext().getString(this.OooOOo0 ? com.cmaster.cloner.R.string.character_counter_overflowed_content_description : com.cmaster.cloner.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.OooOOOo)));
            if (z != this.OooOOo0) {
                OooOOo0();
            }
            String str = s7.OooO0O0;
            s7 s7Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? s7.OooO0o0 : s7.OooO0Oo;
            AppCompatTextView appCompatTextView = this.OooOOoo;
            String string2 = getContext().getString(com.cmaster.cloner.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.OooOOOo));
            s7Var.getClass();
            v8 v8Var = lm1.OooO0OO;
            if (string2 != null) {
                String str2 = s7.OooO0OO;
                String str3 = s7.OooO0O0;
                boolean z2 = s7Var.OooO00o;
                boolean zOooO0O0 = v8Var.OooO0O0(string2, string2.length());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean zOooO0O02 = (zOooO0O0 ? lm1.OooO0O0 : lm1.OooO00o).OooO0O0(string2, string2.length());
                spannableStringBuilder.append((CharSequence) ((z2 || !(zOooO0O02 || s7.OooO00o(string2) == 1)) ? (!z2 || (zOooO0O02 && s7.OooO00o(string2) != -1)) ? "" : str2 : str3));
                if (zOooO0O0 != z2) {
                    spannableStringBuilder.append(zOooO0O0 ? (char) 8235 : (char) 8234);
                    spannableStringBuilder.append((CharSequence) string2);
                    spannableStringBuilder.append((char) 8236);
                } else {
                    spannableStringBuilder.append((CharSequence) string2);
                }
                boolean zOooO0O03 = (zOooO0O0 ? lm1.OooO0O0 : lm1.OooO00o).OooO0O0(string2, string2.length());
                if (!z2 && (zOooO0O03 || s7.OooO0O0(string2) == 1)) {
                    str2 = str3;
                } else if (!z2 || (zOooO0O03 && s7.OooO0O0(string2) != -1)) {
                    str2 = "";
                }
                spannableStringBuilder.append((CharSequence) str2);
                string = spannableStringBuilder.toString();
            }
            appCompatTextView.setText(string);
        }
        if (this.OooO0oo == null || z == this.OooOOo0) {
            return;
        }
        OooOo0o(false, false);
        OooOoO();
        OooOo00();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOo() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.OooOooo
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968852(0x7f040114, float:1.754637E38)
            android.util.TypedValue r1 = com.cmaster.cloner.sv2.OooO00o(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = com.cmaster.cloner.ep2.OooO0O0(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.OooO0oo
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = com.cmaster.cloner.xs.OooO0oo(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.OooO0oo
            android.graphics.drawable.Drawable r1 = com.cmaster.cloner.xs.OooO0oo(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.OooOOOO()
            if (r2 != 0) goto L49
            androidx.appcompat.widget.AppCompatTextView r2 = r4.OooOOoo
            if (r2 == 0) goto L4e
            boolean r2 = r4.OooOOo0
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r4 = r4.Oooo000
            if (r4 == 0) goto L4e
            r0 = r4
        L4e:
            r1.setTintList(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooOOo():void");
    }

    public final void OooOOo0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.OooOOoo;
        if (appCompatTextView != null) {
            OooOOO(appCompatTextView, this.OooOOo0 ? this.OooOo00 : this.OooOo0);
            if (!this.OooOOo0 && (colorStateList2 = this.OooOoo) != null) {
                this.OooOOoo.setTextColor(colorStateList2);
            }
            if (!this.OooOOo0 || (colorStateList = this.OooOooO) == null) {
                return;
            }
            this.OooOOoo.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOoo() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooOOoo():boolean");
    }

    public final void OooOo(Editable editable) {
        ((ra) this.OooOOo).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.OooO0Oo;
        if (length != 0 || this.o0ooOOo) {
            AppCompatTextView appCompatTextView = this.OooOo;
            if (appCompatTextView == null || !this.OooOo0o) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            ap1.OooO00o(frameLayout, this.OooOoo0);
            this.OooOo.setVisibility(4);
            return;
        }
        if (this.OooOo == null || !this.OooOo0o || TextUtils.isEmpty(this.OooOo0O)) {
            return;
        }
        this.OooOo.setText(this.OooOo0O);
        ap1.OooO00o(frameLayout, this.OooOoOO);
        this.OooOo.setVisibility(0);
        this.OooOo.bringToFront();
    }

    public final void OooOo0() {
        EditText editText = this.OooO0oo;
        if (editText == null || this.Oooo0O0 == null) {
            return;
        }
        if ((this.Oooo0o || editText.getBackground() == null) && this.OoooO0O != 0) {
            this.OooO0oo.setBackground(getEditTextBoxBackground());
            this.Oooo0o = true;
        }
    }

    public final void OooOo00() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.OooO0oo;
        if (editText == null || this.OoooO0O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = ct.OooO00o;
        Drawable drawableMutate = background.mutate();
        if (OooOOOO()) {
            drawableMutate.setColorFilter(n.OooO0OO(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.OooOOo0 && (appCompatTextView = this.OooOOoo) != null) {
            drawableMutate.setColorFilter(n.OooO0OO(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.OooO0oo.refreshDrawableState();
        }
    }

    public final void OooOo0O() {
        if (this.OoooO0O != 1) {
            FrameLayout frameLayout = this.OooO0Oo;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iOooO0o0 = OooO0o0();
            if (iOooO0o0 != layoutParams.topMargin) {
                layoutParams.topMargin = iOooO0o0;
                frameLayout.requestLayout();
            }
        }
    }

    public final void OooOo0o(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.OooO0oo;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.OooO0oo;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.Ooooooo;
        ne neVar = this.o0ooOoO;
        if (colorStateList2 != null) {
            neVar.OooOO0O(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.Ooooooo;
            int colorForState = this.o00oO0O;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            neVar.OooOO0O(ColorStateList.valueOf(colorForState));
        } else if (OooOOOO()) {
            AppCompatTextView appCompatTextView2 = this.OooOOO.OooOOo;
            neVar.OooOO0O(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.OooOOo0 && (appCompatTextView = this.OooOOoo) != null) {
            neVar.OooOO0O(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.o0OoOo0) != null && neVar.OooOO0O != colorStateList) {
            neVar.OooOO0O = colorStateList;
            neVar.OooOO0(false);
        }
        iw iwVar = this.OooO0o;
        qi1 qi1Var = this.OooO0o0;
        if (z3 || !this.o0OOO0o || (isEnabled() && z4)) {
            if (z2 || this.o0ooOOo) {
                ValueAnimator valueAnimator = this.o0OO00O;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.o0OO00O.cancel();
                }
                if (z && this.o0Oo0oo) {
                    OooO0O0(1.0f);
                } else {
                    neVar.OooOOO0(1.0f);
                }
                this.o0ooOOo = false;
                if (OooO0oO()) {
                    OooOO0o();
                }
                EditText editText3 = this.OooO0oo;
                OooOo(editText3 != null ? editText3.getText() : null);
                qi1Var.OooOOO0 = false;
                qi1Var.OooO0o0();
                iwVar.OooOo0 = false;
                iwVar.OooOOO0();
                return;
            }
            return;
        }
        if (z2 || !this.o0ooOOo) {
            ValueAnimator valueAnimator2 = this.o0OO00O;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.o0OO00O.cancel();
            }
            if (z && this.o0Oo0oo) {
                OooO0O0(0.0f);
            } else {
                neVar.OooOOO0(0.0f);
            }
            if (OooO0oO() && !((sm) this.Oooo0O0).Oooo0OO.OooOOoo.isEmpty() && OooO0oO()) {
                ((sm) this.Oooo0O0).OooOo0(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.o0ooOOo = true;
            AppCompatTextView appCompatTextView3 = this.OooOo;
            if (appCompatTextView3 != null && this.OooOo0o) {
                appCompatTextView3.setText((CharSequence) null);
                ap1.OooO00o(this.OooO0Oo, this.OooOoo0);
                this.OooOo.setVisibility(4);
            }
            qi1Var.OooOOO0 = true;
            qi1Var.OooO0o0();
            iwVar.OooOo0 = true;
            iwVar.OooOOO0();
        }
    }

    public final void OooOoO() throws Resources.NotFoundException {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.Oooo0O0 == null || this.OoooO0O == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.OooO0oo) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.OooO0oo) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.OoooOOo = this.o00oO0O;
        } else if (OooOOOO()) {
            if (this.o00Ooo != null) {
                OooOoO0(z2, z);
            } else {
                this.OoooOOo = getErrorCurrentTextColors();
            }
        } else if (!this.OooOOo0 || (appCompatTextView = this.OooOOoo) == null) {
            if (z2) {
                this.OoooOOo = this.o00Oo0;
            } else if (z) {
                this.OoooOOo = this.o00O0O;
            } else {
                this.OoooOOo = this.ooOO;
            }
        } else if (this.o00Ooo != null) {
            OooOoO0(z2, z);
        } else {
            this.OoooOOo = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            OooOOo();
        }
        iw iwVar = this.OooO0o;
        TextInputLayout textInputLayout = iwVar.OooO0Oo;
        CheckableImageButton checkableImageButton = iwVar.OooOO0;
        TextInputLayout textInputLayout2 = iwVar.OooO0Oo;
        iwVar.OooOO0O();
        ut2.OooO0OO(textInputLayout2, iwVar.OooO0o, iwVar.OooO0oO);
        ut2.OooO0OO(textInputLayout2, checkableImageButton, iwVar.OooOOO);
        if (iwVar.OooO00o() instanceof tt) {
            if (!textInputLayout.OooOOOO() || checkableImageButton.getDrawable() == null) {
                ut2.OooO00o(textInputLayout, checkableImageButton, iwVar.OooOOO, iwVar.OooOOOO);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        qi1 qi1Var = this.OooO0o0;
        ut2.OooO0OO(qi1Var.OooO0Oo, qi1Var.OooO0oO, qi1Var.OooO0oo);
        if (this.OoooO0O == 2) {
            int i = this.OoooOO0;
            if (z2 && isEnabled()) {
                this.OoooOO0 = this.OoooOOO;
            } else {
                this.OoooOO0 = this.o000oOoO;
            }
            if (this.OoooOO0 != i && OooO0oO() && !this.o0ooOOo) {
                if (OooO0oO()) {
                    ((sm) this.Oooo0O0).OooOo0(0.0f, 0.0f, 0.0f, 0.0f);
                }
                OooOO0o();
            }
        }
        if (this.OoooO0O == 1) {
            if (!isEnabled()) {
                this.OoooOo0 = this.o00ooo;
            } else if (z && !z2) {
                this.OoooOo0 = this.o00oO0o;
            } else if (z2) {
                this.OoooOo0 = this.oo000o;
            } else {
                this.OoooOo0 = this.o00o0O;
            }
        }
        OooO0OO();
    }

    public final void OooOoO0(boolean z, boolean z2) {
        int defaultColor = this.o00Ooo.getDefaultColor();
        int colorForState = this.o00Ooo.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.o00Ooo.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.OoooOOo = colorForState2;
        } else if (z2) {
            this.OoooOOo = colorForState;
        } else {
            this.OoooOOo = defaultColor;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.OooO0Oo;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        OooOo0O();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.OooO0oo;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.OooO != null) {
            boolean z = this.Oooo0;
            this.Oooo0 = false;
            CharSequence hint = editText.getHint();
            this.OooO0oo.setHint(this.OooO);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.OooO0oo.setHint(hint);
                this.Oooo0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.OooO0Oo;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.OooO0oo) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.o0O0O00 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.o0O0O00 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        wq0 wq0Var;
        super.draw(canvas);
        boolean z = this.Oooo00O;
        ne neVar = this.o0ooOoO;
        if (z) {
            TextPaint textPaint = neVar.Oooo0oo;
            RectF rectF = neVar.OooO0o0;
            int iSave = canvas.save();
            if (neVar.OooOoo != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(neVar.Oooo00O);
                float f = neVar.OooOOo0;
                float f2 = neVar.OooOOo;
                float f3 = neVar.Oooo000;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if ((neVar.OooooOO > 1 || neVar.OooooOo > 1) && !neVar.OooOooO && neVar.OooOOOO()) {
                    float lineStart = neVar.OooOOo0 - neVar.OoooOoO.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (neVar.Ooooo0o * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        textPaint.setShadowLayer(neVar.Oooo00o, neVar.Oooo0, neVar.Oooo0O0, uv2.OooO00o(neVar.Oooo0OO, textPaint.getAlpha()));
                    }
                    neVar.OoooOoO.draw(canvas);
                    textPaint.setAlpha((int) (neVar.Ooooo00 * f4));
                    if (i >= 31) {
                        textPaint.setShadowLayer(neVar.Oooo00o, neVar.Oooo0, neVar.Oooo0O0, uv2.OooO00o(neVar.Oooo0OO, textPaint.getAlpha()));
                    }
                    int lineBaseline = neVar.OoooOoO.getLineBaseline(0);
                    CharSequence charSequence = neVar.OooooO0;
                    float f5 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(neVar.Oooo00o, neVar.Oooo0, neVar.Oooo0O0, neVar.Oooo0OO);
                    }
                    String strTrim = neVar.OooooO0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(neVar.OoooOoO.getLineEnd(0), str.length()), 0.0f, f5, (Paint) textPaint);
                    canvas = canvas;
                } else {
                    canvas.translate(f, f2);
                    neVar.OoooOoO.draw(canvas);
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.Oooo0oo == null || (wq0Var = this.Oooo0oO) == null) {
            return;
        }
        wq0Var.draw(canvas);
        if (this.OooO0oo.isFocused()) {
            Rect bounds = this.Oooo0oo.getBounds();
            Rect bounds2 = this.Oooo0oO.getBounds();
            float f6 = neVar.OooO0O0;
            int iCenterX = bounds2.centerX();
            bounds.left = oO0oO000.OooO0OO(iCenterX, bounds2.left, f6);
            bounds.right = oO0oO000.OooO0OO(iCenterX, bounds2.right, f6);
            this.Oooo0oo.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.oo0o0Oo
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.oo0o0Oo = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            com.cmaster.cloner.ne r3 = r4.o0ooOoO
            if (r3 == 0) goto L2f
            r3.Oooo0o = r1
            android.content.res.ColorStateList r1 = r3.OooOO0O
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.OooOO0
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.OooOO0(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.OooO0oo
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.OooOo0o(r0, r2)
        L45:
            r4.OooOo00()
            r4.OooOoO()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.oo0o0Oo = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.OooO0oo;
        if (editText == null) {
            return super.getBaseline();
        }
        return OooO0o0() + getPaddingTop() + editText.getBaseline();
    }

    public wq0 getBoxBackground() {
        int i = this.OoooO0O;
        if (i == 1 || i == 2) {
            return this.Oooo0O0;
        }
        ra.OooO0O0();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.OoooOo0;
    }

    public int getBoxBackgroundMode() {
        return this.OoooO0O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.OoooO;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        ag1 ag1Var = this.Oooo;
        RectF rectF = this.Ooooo00;
        return layoutDirection == 1 ? ag1Var.OooO0oo.OooO00o(rectF) : ag1Var.OooO0oO.OooO00o(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        ag1 ag1Var = this.Oooo;
        RectF rectF = this.Ooooo00;
        return layoutDirection == 1 ? ag1Var.OooO0oO.OooO00o(rectF) : ag1Var.OooO0oo.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        ag1 ag1Var = this.Oooo;
        RectF rectF = this.Ooooo00;
        return layoutDirection == 1 ? ag1Var.OooO0o0.OooO00o(rectF) : ag1Var.OooO0o.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        ag1 ag1Var = this.Oooo;
        RectF rectF = this.Ooooo00;
        return layoutDirection == 1 ? ag1Var.OooO0o.OooO00o(rectF) : ag1Var.OooO0o0.OooO00o(rectF);
    }

    public int getBoxStrokeColor() {
        return this.o00Oo0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.o00Ooo;
    }

    public int getBoxStrokeWidth() {
        return this.o000oOoO;
    }

    public int getBoxStrokeWidthFocused() {
        return this.OoooOOO;
    }

    public int getCounterMaxLength() {
        return this.OooOOOo;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.OooOOOO && this.OooOOo0 && (appCompatTextView = this.OooOOoo) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.OooOooO;
    }

    public ColorStateList getCounterTextColor() {
        return this.OooOoo;
    }

    public ColorStateList getCursorColor() {
        return this.OooOooo;
    }

    public ColorStateList getCursorErrorColor() {
        return this.Oooo000;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.Ooooooo;
    }

    public EditText getEditText() {
        return this.OooO0oo;
    }

    public CharSequence getEndIconContentDescription() {
        return this.OooO0o.OooOO0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.OooO0o.OooOO0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.OooO0o.OooOOOo;
    }

    public int getEndIconMode() {
        return this.OooO0o.OooOO0o;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.OooO0o.OooOOo0;
    }

    public CheckableImageButton getEndIconView() {
        return this.OooO0o.OooOO0;
    }

    public CharSequence getError() {
        jg0 jg0Var = this.OooOOO;
        if (jg0Var.OooOOo0) {
            return jg0Var.OooOOOo;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.OooOOO.OooOo00;
    }

    public CharSequence getErrorContentDescription() {
        return this.OooOOO.OooOOoo;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.OooOOO.OooOOo;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.OooO0o.OooO0o.getDrawable();
    }

    public CharSequence getHelperText() {
        jg0 jg0Var = this.OooOOO;
        if (jg0Var.OooOo) {
            return jg0Var.OooOo0o;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.OooOOO.OooOoO0;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.Oooo00O) {
            return this.Oooo00o;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.o0ooOoO.OooO0o();
    }

    public final int getHintCurrentCollapsedTextColor() {
        ne neVar = this.o0ooOoO;
        return neVar.OooO0oO(neVar.OooOO0O);
    }

    public int getHintMaxLines() {
        return this.o0ooOoO.OooooOO;
    }

    public ColorStateList getHintTextColor() {
        return this.o0OoOo0;
    }

    public om1 getLengthCounter() {
        return this.OooOOo;
    }

    public int getMaxEms() {
        return this.OooOO0O;
    }

    public int getMaxWidth() {
        return this.OooOOO0;
    }

    public int getMinEms() {
        return this.OooOO0;
    }

    public int getMinWidth() {
        return this.OooOO0o;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.OooO0o.OooOO0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.OooO0o.OooOO0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.OooOo0o) {
            return this.OooOo0O;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.OooOoO;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.OooOoO0;
    }

    public CharSequence getPrefixText() {
        return this.OooO0o0.OooO0o;
    }

    public ColorStateList getPrefixTextColor() {
        return this.OooO0o0.OooO0o0.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.OooO0o0.OooO0o0;
    }

    public ag1 getShapeAppearanceModel() {
        return this.Oooo;
    }

    public CharSequence getStartIconContentDescription() {
        return this.OooO0o0.OooO0oO.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.OooO0o0.OooO0oO.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.OooO0o0.OooOO0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.OooO0o0.OooOO0O;
    }

    public CharSequence getSuffixText() {
        return this.OooO0o.OooOOoo;
    }

    public ColorStateList getSuffixTextColor() {
        return this.OooO0o.OooOo00.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.OooO0o.OooOo00;
    }

    public Typeface getTypeface() {
        return this.Ooooo0o;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o0ooOoO.OooO(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        iw iwVar = this.OooO0o;
        iwVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.o000OOo = false;
        if (this.OooO0oo != null && this.OooO0oo.getMeasuredHeight() < (iMax = Math.max(iwVar.getMeasuredHeight(), this.OooO0o0.getMeasuredHeight()))) {
            this.OooO0oo.setMinimumHeight(iMax);
            z = true;
        }
        boolean zOooOOoo = OooOOoo();
        if (z || zOooOOoo) {
            this.OooO0oo.post(new o00OOOOo(this, 15));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.OooO0oo;
        if (editText != null) {
            Rect rect = this.OoooOoO;
            vp.OooO00o(this, editText, rect);
            wq0 wq0Var = this.Oooo0oO;
            if (wq0Var != null) {
                int i6 = rect.bottom;
                wq0Var.setBounds(rect.left, i6 - this.o000oOoO, rect.right, i6);
            }
            wq0 wq0Var2 = this.Oooo0oo;
            if (wq0Var2 != null) {
                int i7 = rect.bottom;
                wq0Var2.setBounds(rect.left, i7 - this.OoooOOO, rect.right, i7);
            }
            if (this.Oooo00O) {
                float textSize = this.OooO0oo.getTextSize();
                ne neVar = this.o0ooOoO;
                float f = neVar.OooO0oo;
                TextPaint textPaint = neVar.Oooo;
                if (f != textSize) {
                    neVar.OooO0oo = textSize;
                    neVar.OooOO0(false);
                }
                int gravity = this.OooO0oo.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (neVar.OooO0oO != i8) {
                    neVar.OooO0oO = i8;
                    neVar.OooOO0(false);
                }
                if (neVar.OooO0o != gravity) {
                    neVar.OooO0o = gravity;
                    neVar.OooOO0(false);
                }
                Rect rectOooO0Oo = OooO0Oo(rect);
                int i9 = rectOooO0Oo.left;
                int i10 = rectOooO0Oo.top;
                int i11 = rectOooO0Oo.right;
                int i12 = rectOooO0Oo.bottom;
                Rect rect2 = neVar.OooO0Oo;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    neVar.Oooo0oO = true;
                }
                if (this.OooO0oo == null) {
                    ra.OooO0O0();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(neVar.OooO0oo);
                    textPaint.setTypeface(neVar.OooOo0O);
                    textPaint.setLetterSpacing(neVar.OoooOOo);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(neVar.OooO0oo);
                    textPaint.setTypeface(neVar.OooOo0O);
                    textPaint.setLetterSpacing(neVar.OoooOOo);
                    fDescent = neVar.OooOO0o * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.OooO0oo.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.OoooOoo;
                rect3.left = compoundPaddingLeft;
                if (this.OoooO0O != 1 || this.OooO0oo.getMinLines() > 1) {
                    if (this.OoooO0O != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(neVar.OooO0oo);
                        textPaint.setTypeface(neVar.OooOo0O);
                        textPaint.setLetterSpacing(neVar.OoooOOo);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.OooO0oo.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.OooO0oo.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.OoooO0O != 1 || this.OooO0oo.getMinLines() > 1) ? rect.bottom - this.OooO0oo.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = neVar.OooO0OO;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != neVar.o0OoOo0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    neVar.Oooo0oO = true;
                    neVar.o0OoOo0 = true;
                }
                neVar.OooOO0(false);
                if (!OooO0oO() || this.o0ooOOo) {
                    return;
                }
                OooOO0o();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.o000OOo;
        iw iwVar = this.OooO0o;
        if (!z) {
            iwVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.o000OOo = true;
        }
        if (this.OooOo != null && (editText = this.OooO0oo) != null) {
            this.OooOo.setGravity(editText.getGravity());
            this.OooOo.setPadding(this.OooO0oo.getCompoundPaddingLeft(), this.OooO0oo.getCompoundPaddingTop(), this.OooO0oo.getCompoundPaddingRight(), this.OooO0oo.getCompoundPaddingBottom());
        }
        iwVar.OooOO0o();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.OooO0oo.getMeasuredWidth() - this.OooO0oo.getCompoundPaddingLeft()) - this.OooO0oo.getCompoundPaddingRight();
        ne neVar = this.o0ooOoO;
        TextPaint textPaint = neVar.Oooo;
        textPaint.setTextSize(neVar.OooO);
        textPaint.setTypeface(neVar.OooOOoo);
        textPaint.setLetterSpacing(neVar.OoooOOO);
        float f2 = measuredWidth;
        neVar.OoooooO = neVar.OooO0o0(neVar.OooooOo, textPaint, neVar.OooOoo0, (neVar.OooO / neVar.OooO0oo) * f2, neVar.OooOooO).getHeight();
        textPaint.setTextSize(neVar.OooO0oo);
        textPaint.setTypeface(neVar.OooOo0O);
        textPaint.setLetterSpacing(neVar.OoooOOo);
        neVar.Ooooooo = neVar.OooO0o0(neVar.OooooOO, textPaint, neVar.OooOoo0, f2, neVar.OooOooO).getHeight();
        EditText editText2 = this.OooO0oo;
        Rect rect = this.OoooOoO;
        vp.OooO00o(this, editText2, rect);
        Rect rectOooO0Oo = OooO0Oo(rect);
        int i3 = rectOooO0Oo.left;
        int i4 = rectOooO0Oo.top;
        int i5 = rectOooO0Oo.right;
        int i6 = rectOooO0Oo.bottom;
        Rect rect2 = neVar.OooO0Oo;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            neVar.Oooo0oO = true;
        }
        OooOo0O();
        OooO00o();
        if (this.OooO0oo == null) {
            return;
        }
        int i7 = neVar.Ooooooo;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = neVar.Oooo;
            textPaint2.setTextSize(neVar.OooO0oo);
            textPaint2.setTypeface(neVar.OooOo0O);
            textPaint2.setLetterSpacing(neVar.OoooOOo);
            f = -textPaint2.ascent();
        }
        if (this.OooOo0O != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.OooOo.getPaint());
            textPaint3.setTextSize(this.OooOo.getTextSize());
            textPaint3.setTypeface(this.OooOo.getTypeface());
            textPaint3.setLetterSpacing(this.OooOo.getLetterSpacing());
            wi1 wi1Var = new wi1(this.OooOo0O, textPaint3, measuredWidth);
            wi1Var.OooOO0O = getLayoutDirection() == 1;
            wi1Var.OooOO0 = true;
            float lineSpacingExtra = this.OooOo.getLineSpacingExtra();
            float lineSpacingMultiplier = this.OooOo.getLineSpacingMultiplier();
            wi1Var.OooO0oO = lineSpacingExtra;
            wi1Var.OooO0oo = lineSpacingMultiplier;
            wi1Var.OooOOO0 = new pg0(this);
            fOooO0o = (this.OoooO0O == 1 ? neVar.OooO0o() + this.OoooO + this.OooO0oO : 0.0f) + wi1Var.OooO00o().getHeight();
        }
        float fMax = Math.max(f, fOooO0o);
        if (this.OooO0oo.getMeasuredHeight() < fMax) {
            this.OooO0oo.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof pm1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pm1 pm1Var = (pm1) parcelable;
        super.onRestoreInstanceState(pm1Var.OooO0Oo);
        setError(pm1Var.OooO0o);
        if (pm1Var.OooO0oO) {
            post(new u91(this, 4));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.OoooO00) {
            qj qjVar = this.Oooo.OooO0o0;
            RectF rectF = this.Ooooo00;
            float fOooO00o = qjVar.OooO00o(rectF);
            float fOooO00o2 = this.Oooo.OooO0o.OooO00o(rectF);
            float fOooO00o3 = this.Oooo.OooO0oo.OooO00o(rectF);
            float fOooO00o4 = this.Oooo.OooO0oO.OooO00o(rectF);
            ag1 ag1Var = this.Oooo;
            gp2 gp2Var = ag1Var.OooO00o;
            gp2 gp2Var2 = ag1Var.OooO0O0;
            gp2 gp2Var3 = ag1Var.OooO0Oo;
            gp2 gp2Var4 = ag1Var.OooO0OO;
            iu iuVar = new iu(0);
            iu iuVar2 = new iu(0);
            iu iuVar3 = new iu(0);
            iu iuVar4 = new iu(0);
            OooOO0 oooOO0 = new OooOO0(fOooO00o2);
            OooOO0 oooOO02 = new OooOO0(fOooO00o);
            OooOO0 oooOO03 = new OooOO0(fOooO00o4);
            OooOO0 oooOO04 = new OooOO0(fOooO00o3);
            ag1 ag1Var2 = new ag1();
            ag1Var2.OooO00o = gp2Var2;
            ag1Var2.OooO0O0 = gp2Var;
            ag1Var2.OooO0OO = gp2Var3;
            ag1Var2.OooO0Oo = gp2Var4;
            ag1Var2.OooO0o0 = oooOO0;
            ag1Var2.OooO0o = oooOO02;
            ag1Var2.OooO0oO = oooOO04;
            ag1Var2.OooO0oo = oooOO03;
            ag1Var2.OooO = iuVar;
            ag1Var2.OooOO0 = iuVar2;
            ag1Var2.OooOO0O = iuVar3;
            ag1Var2.OooOO0o = iuVar4;
            this.OoooO00 = z;
            setShapeAppearanceModel(ag1Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        pm1 pm1Var = new pm1(super.onSaveInstanceState());
        if (OooOOOO()) {
            pm1Var.OooO0o = getError();
        }
        iw iwVar = this.OooO0o;
        pm1Var.OooO0oO = iwVar.OooOO0o != 0 && iwVar.OooOO0.OooO0oO;
        return pm1Var;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.OoooOo0 != i) {
            this.OoooOo0 = i;
            this.o00o0O = i;
            this.oo000o = i;
            this.o00oO0o = i;
            OooO0OO();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.o00o0O = defaultColor;
        this.OoooOo0 = defaultColor;
        this.o00ooo = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.oo000o = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.o00oO0o = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        OooO0OO();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.OoooO0O) {
            return;
        }
        this.OoooO0O = i;
        if (this.OooO0oo != null) {
            OooOO0O();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.OoooO = i;
    }

    public void setBoxCornerFamily(int i) {
        yf1 yf1VarOooO0o = this.Oooo.OooO0o();
        qj qjVar = this.Oooo.OooO0o0;
        yf1VarOooO0o.OooO00o = yv2.OooO00o(i);
        yf1VarOooO0o.OooO0o0 = qjVar;
        qj qjVar2 = this.Oooo.OooO0o;
        yf1VarOooO0o.OooO0O0 = yv2.OooO00o(i);
        yf1VarOooO0o.OooO0o = qjVar2;
        qj qjVar3 = this.Oooo.OooO0oo;
        yf1VarOooO0o.OooO0Oo = yv2.OooO00o(i);
        yf1VarOooO0o.OooO0oo = qjVar3;
        qj qjVar4 = this.Oooo.OooO0oO;
        yf1VarOooO0o.OooO0OO = yv2.OooO00o(i);
        yf1VarOooO0o.OooO0oO = qjVar4;
        this.Oooo = yf1VarOooO0o.OooO00o();
        OooO0OO();
    }

    public void setBoxStrokeColor(int i) throws Resources.NotFoundException {
        if (this.o00Oo0 != i) {
            this.o00Oo0 = i;
            OooOoO();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.ooOO = colorStateList.getDefaultColor();
            this.o00oO0O = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.o00O0O = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.o00Oo0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.o00Oo0 != colorStateList.getDefaultColor()) {
            this.o00Oo0 = colorStateList.getDefaultColor();
        }
        OooOoO();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.o00Ooo != colorStateList) {
            this.o00Ooo = colorStateList;
            OooOoO();
        }
    }

    public void setBoxStrokeWidth(int i) throws Resources.NotFoundException {
        this.o000oOoO = i;
        OooOoO();
    }

    public void setBoxStrokeWidthFocused(int i) throws Resources.NotFoundException {
        this.OoooOOO = i;
        OooOoO();
    }

    public void setBoxStrokeWidthFocusedResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) throws Resources.NotFoundException {
        if (this.OooOOOO != z) {
            jg0 jg0Var = this.OooOOO;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.OooOOoo = appCompatTextView;
                appCompatTextView.setId(com.cmaster.cloner.R.id.textinput_counter);
                Typeface typeface = this.Ooooo0o;
                if (typeface != null) {
                    this.OooOOoo.setTypeface(typeface);
                }
                this.OooOOoo.setMaxLines(1);
                jg0Var.OooO00o(this.OooOOoo, 2);
                ((ViewGroup.MarginLayoutParams) this.OooOOoo.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.cmaster.cloner.R.dimen.mtrl_textinput_counter_margin_start));
                OooOOo0();
                if (this.OooOOoo != null) {
                    EditText editText = this.OooO0oo;
                    OooOOOo(editText != null ? editText.getText() : null);
                }
            } else {
                jg0Var.OooO0oO(this.OooOOoo, 2);
                this.OooOOoo = null;
            }
            this.OooOOOO = z;
        }
    }

    public void setCounterMaxLength(int i) throws Resources.NotFoundException {
        if (this.OooOOOo != i) {
            if (i > 0) {
                this.OooOOOo = i;
            } else {
                this.OooOOOo = -1;
            }
            if (!this.OooOOOO || this.OooOOoo == null) {
                return;
            }
            EditText editText = this.OooO0oo;
            OooOOOo(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.OooOo00 != i) {
            this.OooOo00 = i;
            OooOOo0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.OooOooO != colorStateList) {
            this.OooOooO = colorStateList;
            OooOOo0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.OooOo0 != i) {
            this.OooOo0 = i;
            OooOOo0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.OooOoo != colorStateList) {
            this.OooOoo = colorStateList;
            OooOOo0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.OooOooo != colorStateList) {
            this.OooOooo = colorStateList;
            OooOOo();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.Oooo000 != colorStateList) {
            this.Oooo000 = colorStateList;
            if (OooOOOO() || (this.OooOOoo != null && this.OooOOo0)) {
                OooOOo();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.Ooooooo = colorStateList;
        this.o0OoOo0 = colorStateList;
        if (this.OooO0oo != null) {
            OooOo0o(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        OooOOO0(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.OooO0o.OooOO0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.OooO0o.OooOO0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        iw iwVar = this.OooO0o;
        CharSequence text = i != 0 ? iwVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = iwVar.OooOO0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        iw iwVar = this.OooO0o;
        Drawable drawableOooO00o = i != 0 ? ym2.OooO00o(iwVar.getContext(), i) : null;
        TextInputLayout textInputLayout = iwVar.OooO0Oo;
        CheckableImageButton checkableImageButton = iwVar.OooOO0;
        checkableImageButton.setImageDrawable(drawableOooO00o);
        if (drawableOooO00o != null) {
            ut2.OooO00o(textInputLayout, checkableImageButton, iwVar.OooOOO, iwVar.OooOOOO);
            ut2.OooO0OO(textInputLayout, checkableImageButton, iwVar.OooOOO);
        }
    }

    public void setEndIconMinSize(int i) {
        iw iwVar = this.OooO0o;
        if (i < 0) {
            iwVar.getClass();
            ra.OooOOO("endIconSize cannot be less than 0");
        } else if (i != iwVar.OooOOOo) {
            iwVar.OooOOOo = i;
            CheckableImageButton checkableImageButton = iwVar.OooOO0;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = iwVar.OooO0o;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.OooO0o.OooO0o(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        iw iwVar = this.OooO0o;
        CheckableImageButton checkableImageButton = iwVar.OooOO0;
        View.OnLongClickListener onLongClickListener = iwVar.OooOOo;
        checkableImageButton.setOnClickListener(onClickListener);
        ut2.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        iw iwVar = this.OooO0o;
        iwVar.OooOOo = onLongClickListener;
        CheckableImageButton checkableImageButton = iwVar.OooOO0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ut2.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        iw iwVar = this.OooO0o;
        iwVar.OooOOo0 = scaleType;
        iwVar.OooOO0.setScaleType(scaleType);
        iwVar.OooO0o.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        iw iwVar = this.OooO0o;
        if (iwVar.OooOOO != colorStateList) {
            iwVar.OooOOO = colorStateList;
            ut2.OooO00o(iwVar.OooO0Oo, iwVar.OooOO0, colorStateList, iwVar.OooOOOO);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        iw iwVar = this.OooO0o;
        if (iwVar.OooOOOO != mode) {
            iwVar.OooOOOO = mode;
            ut2.OooO00o(iwVar.OooO0Oo, iwVar.OooOO0, iwVar.OooOOO, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.OooO0o.OooO0oO(z);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        jg0 jg0Var = this.OooOOO;
        if (!jg0Var.OooOOo0) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            jg0Var.OooO0o();
            return;
        }
        jg0Var.OooO0OO();
        jg0Var.OooOOOo = charSequence;
        jg0Var.OooOOo.setText(charSequence);
        int i = jg0Var.OooOOO;
        if (i != 1) {
            jg0Var.OooOOOO = 1;
        }
        jg0Var.OooO(i, jg0Var.OooOOOO, jg0Var.OooO0oo(jg0Var.OooOOo, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        jg0 jg0Var = this.OooOOO;
        jg0Var.OooOo00 = i;
        AppCompatTextView appCompatTextView = jg0Var.OooOOo;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        jg0 jg0Var = this.OooOOO;
        jg0Var.OooOOoo = charSequence;
        AppCompatTextView appCompatTextView = jg0Var.OooOOo;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) throws Resources.NotFoundException {
        jg0 jg0Var = this.OooOOO;
        TextInputLayout textInputLayout = jg0Var.OooO0oo;
        if (jg0Var.OooOOo0 == z) {
            return;
        }
        jg0Var.OooO0OO();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(jg0Var.OooO0oO);
            jg0Var.OooOOo = appCompatTextView;
            appCompatTextView.setId(com.cmaster.cloner.R.id.textinput_error);
            jg0Var.OooOOo.setTextAlignment(5);
            Typeface typeface = jg0Var.OooOoo0;
            if (typeface != null) {
                jg0Var.OooOOo.setTypeface(typeface);
            }
            int i = jg0Var.OooOo0;
            jg0Var.OooOo0 = i;
            AppCompatTextView appCompatTextView2 = jg0Var.OooOOo;
            if (appCompatTextView2 != null) {
                jg0Var.OooO0oo.OooOOO(appCompatTextView2, i);
            }
            ColorStateList colorStateList = jg0Var.OooOo0O;
            jg0Var.OooOo0O = colorStateList;
            AppCompatTextView appCompatTextView3 = jg0Var.OooOOo;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = jg0Var.OooOOoo;
            jg0Var.OooOOoo = charSequence;
            AppCompatTextView appCompatTextView4 = jg0Var.OooOOo;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = jg0Var.OooOo00;
            jg0Var.OooOo00 = i2;
            AppCompatTextView appCompatTextView5 = jg0Var.OooOOo;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            jg0Var.OooOOo.setVisibility(4);
            jg0Var.OooO00o(jg0Var.OooOOo, 0);
        } else {
            jg0Var.OooO0o();
            jg0Var.OooO0oO(jg0Var.OooOOo, 0);
            jg0Var.OooOOo = null;
            textInputLayout.OooOo00();
            textInputLayout.OooOoO();
        }
        jg0Var.OooOOo0 = z;
    }

    public void setErrorIconDrawable(int i) {
        iw iwVar = this.OooO0o;
        iwVar.OooO0oo(i != 0 ? ym2.OooO00o(iwVar.getContext(), i) : null);
        ut2.OooO0OO(iwVar.OooO0Oo, iwVar.OooO0o, iwVar.OooO0oO);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        iw iwVar = this.OooO0o;
        CheckableImageButton checkableImageButton = iwVar.OooO0o;
        View.OnLongClickListener onLongClickListener = iwVar.OooO;
        checkableImageButton.setOnClickListener(onClickListener);
        ut2.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        iw iwVar = this.OooO0o;
        iwVar.OooO = onLongClickListener;
        CheckableImageButton checkableImageButton = iwVar.OooO0o;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ut2.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        iw iwVar = this.OooO0o;
        if (iwVar.OooO0oO != colorStateList) {
            iwVar.OooO0oO = colorStateList;
            ut2.OooO00o(iwVar.OooO0Oo, iwVar.OooO0o, colorStateList, iwVar.OooO0oo);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        iw iwVar = this.OooO0o;
        if (iwVar.OooO0oo != mode) {
            iwVar.OooO0oo = mode;
            ut2.OooO00o(iwVar.OooO0Oo, iwVar.OooO0o, iwVar.OooO0oO, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        jg0 jg0Var = this.OooOOO;
        jg0Var.OooOo0 = i;
        AppCompatTextView appCompatTextView = jg0Var.OooOOo;
        if (appCompatTextView != null) {
            jg0Var.OooO0oo.OooOOO(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        jg0 jg0Var = this.OooOOO;
        jg0Var.OooOo0O = colorStateList;
        AppCompatTextView appCompatTextView = jg0Var.OooOOo;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.o0OOO0o != z) {
            this.o0OOO0o = z;
            OooOo0o(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        jg0 jg0Var = this.OooOOO;
        if (zIsEmpty) {
            if (jg0Var.OooOo) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!jg0Var.OooOo) {
            setHelperTextEnabled(true);
        }
        jg0Var.OooO0OO();
        jg0Var.OooOo0o = charSequence;
        jg0Var.OooOoO0.setText(charSequence);
        int i = jg0Var.OooOOO;
        if (i != 2) {
            jg0Var.OooOOOO = 2;
        }
        jg0Var.OooO(i, jg0Var.OooOOOO, jg0Var.OooO0oo(jg0Var.OooOoO0, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        jg0 jg0Var = this.OooOOO;
        jg0Var.OooOoOO = colorStateList;
        AppCompatTextView appCompatTextView = jg0Var.OooOoO0;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) throws Resources.NotFoundException {
        jg0 jg0Var = this.OooOOO;
        TextInputLayout textInputLayout = jg0Var.OooO0oo;
        if (jg0Var.OooOo == z) {
            return;
        }
        jg0Var.OooO0OO();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(jg0Var.OooO0oO);
            jg0Var.OooOoO0 = appCompatTextView;
            appCompatTextView.setId(com.cmaster.cloner.R.id.textinput_helper_text);
            jg0Var.OooOoO0.setTextAlignment(5);
            Typeface typeface = jg0Var.OooOoo0;
            if (typeface != null) {
                jg0Var.OooOoO0.setTypeface(typeface);
            }
            jg0Var.OooOoO0.setVisibility(4);
            jg0Var.OooOoO0.setAccessibilityLiveRegion(1);
            int i = jg0Var.OooOoO;
            jg0Var.OooOoO = i;
            AppCompatTextView appCompatTextView2 = jg0Var.OooOoO0;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = jg0Var.OooOoOO;
            jg0Var.OooOoOO = colorStateList;
            AppCompatTextView appCompatTextView3 = jg0Var.OooOoO0;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            jg0Var.OooO00o(jg0Var.OooOoO0, 1);
            jg0Var.OooOoO0.setAccessibilityDelegate(new ig0(jg0Var));
        } else {
            jg0Var.OooO0OO();
            int i2 = jg0Var.OooOOO;
            if (i2 == 2) {
                jg0Var.OooOOOO = 0;
            }
            jg0Var.OooO(i2, jg0Var.OooOOOO, jg0Var.OooO0oo(jg0Var.OooOoO0, ""));
            jg0Var.OooO0oO(jg0Var.OooOoO0, 1);
            jg0Var.OooOoO0 = null;
            textInputLayout.OooOo00();
            textInputLayout.OooOoO();
        }
        jg0Var.OooOo = z;
    }

    public void setHelperTextTextAppearance(int i) {
        jg0 jg0Var = this.OooOOO;
        jg0Var.OooOoO = i;
        AppCompatTextView appCompatTextView = jg0Var.OooOoO0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.o0Oo0oo = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.Oooo00O) {
            this.Oooo00O = z;
            if (z) {
                CharSequence hint = this.OooO0oo.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.Oooo00o)) {
                        setHint(hint);
                    }
                    this.OooO0oo.setHint((CharSequence) null);
                }
                this.Oooo0 = true;
            } else {
                this.Oooo0 = false;
                if (!TextUtils.isEmpty(this.Oooo00o) && TextUtils.isEmpty(this.OooO0oo.getHint())) {
                    this.OooO0oo.setHint(this.Oooo00o);
                }
                setHintInternal(null);
            }
            if (this.OooO0oo != null) {
                OooOo0O();
            }
        }
    }

    public void setHintMaxLines(int i) {
        ne neVar = this.o0ooOoO;
        if (i != neVar.OooooOo) {
            neVar.OooooOo = i;
            neVar.OooOO0(false);
        }
        if (i != neVar.OooooOO) {
            neVar.OooooOO = i;
            neVar.OooOO0(false);
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setHintTextAppearance(int r14) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.setHintTextAppearance(int):void");
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.o0OoOo0 != colorStateList) {
            if (this.Ooooooo == null) {
                ne neVar = this.o0ooOoO;
                if (neVar.OooOO0O != colorStateList) {
                    neVar.OooOO0O = colorStateList;
                    neVar.OooOO0(false);
                }
            }
            this.o0OoOo0 = colorStateList;
            if (this.OooO0oo != null) {
                OooOo0o(false, false);
            }
        }
    }

    public void setLengthCounter(om1 om1Var) {
        this.OooOOo = om1Var;
    }

    public void setMaxEms(int i) {
        this.OooOO0O = i;
        EditText editText = this.OooO0oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.OooOOO0 = i;
        EditText editText = this.OooO0oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.OooOO0 = i;
        EditText editText = this.OooO0oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.OooOO0o = i;
        EditText editText = this.OooO0oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        iw iwVar = this.OooO0o;
        iwVar.OooOO0.setContentDescription(i != 0 ? iwVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        iw iwVar = this.OooO0o;
        iwVar.OooOO0.setImageDrawable(i != 0 ? ym2.OooO00o(iwVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        iw iwVar = this.OooO0o;
        if (z && iwVar.OooOO0o != 1) {
            iwVar.OooO0o(1);
        } else if (z) {
            iwVar.getClass();
        } else {
            iwVar.OooO0o(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        iw iwVar = this.OooO0o;
        iwVar.OooOOO = colorStateList;
        ut2.OooO00o(iwVar.OooO0Oo, iwVar.OooOO0, colorStateList, iwVar.OooOOOO);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        iw iwVar = this.OooO0o;
        iwVar.OooOOOO = mode;
        ut2.OooO00o(iwVar.OooO0Oo, iwVar.OooOO0, iwVar.OooOOO, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i = 1;
        if (this.OooOo == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.OooOo = appCompatTextView;
            appCompatTextView.setId(com.cmaster.cloner.R.id.textinput_placeholder);
            this.OooOo.setImportantForAccessibility(1);
            this.OooOo.setAccessibilityLiveRegion(1);
            ny nyVarOooO0o = OooO0o();
            this.OooOoOO = nyVarOooO0o;
            nyVarOooO0o.OooO0o0 = 67L;
            this.OooOoo0 = OooO0o();
            setPlaceholderTextAppearance(this.OooOoO);
            setPlaceholderTextColor(this.OooOoO0);
            nt1.OooOOO0(this.OooOo, new iw0(i));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.OooOo0o) {
                setPlaceholderTextEnabled(true);
            }
            this.OooOo0O = charSequence;
        }
        EditText editText = this.OooO0oo;
        OooOo(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i) {
        this.OooOoO = i;
        AppCompatTextView appCompatTextView = this.OooOo;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.OooOoO0 != colorStateList) {
            this.OooOoO0 = colorStateList;
            AppCompatTextView appCompatTextView = this.OooOo;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        qi1 qi1Var = this.OooO0o0;
        qi1Var.getClass();
        qi1Var.OooO0o = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qi1Var.OooO0o0.setText(charSequence);
        qi1Var.OooO0o0();
    }

    public void setPrefixTextAppearance(int i) {
        this.OooO0o0.OooO0o0.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.OooO0o0.OooO0o0.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(ag1 ag1Var) {
        wq0 wq0Var = this.Oooo0O0;
        if (wq0Var == null || wq0Var.OooO0o0.OooO00o == ag1Var) {
            return;
        }
        this.Oooo = ag1Var;
        OooO0OO();
    }

    public void setStartIconCheckable(boolean z) {
        this.OooO0o0.OooO0oO.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? ym2.OooO00o(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        qi1 qi1Var = this.OooO0o0;
        if (i < 0) {
            qi1Var.getClass();
            ra.OooOOO("startIconSize cannot be less than 0");
        } else if (i != qi1Var.OooOO0) {
            qi1Var.OooOO0 = i;
            CheckableImageButton checkableImageButton = qi1Var.OooO0oO;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        qi1 qi1Var = this.OooO0o0;
        CheckableImageButton checkableImageButton = qi1Var.OooO0oO;
        View.OnLongClickListener onLongClickListener = qi1Var.OooOO0o;
        checkableImageButton.setOnClickListener(onClickListener);
        ut2.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        qi1 qi1Var = this.OooO0o0;
        qi1Var.OooOO0o = onLongClickListener;
        CheckableImageButton checkableImageButton = qi1Var.OooO0oO;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ut2.OooO0Oo(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        qi1 qi1Var = this.OooO0o0;
        qi1Var.OooOO0O = scaleType;
        qi1Var.OooO0oO.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        qi1 qi1Var = this.OooO0o0;
        if (qi1Var.OooO0oo != colorStateList) {
            qi1Var.OooO0oo = colorStateList;
            ut2.OooO00o(qi1Var.OooO0Oo, qi1Var.OooO0oO, colorStateList, qi1Var.OooO);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        qi1 qi1Var = this.OooO0o0;
        if (qi1Var.OooO != mode) {
            qi1Var.OooO = mode;
            ut2.OooO00o(qi1Var.OooO0Oo, qi1Var.OooO0oO, qi1Var.OooO0oo, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.OooO0o0.OooO0OO(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        iw iwVar = this.OooO0o;
        iwVar.getClass();
        iwVar.OooOOoo = TextUtils.isEmpty(charSequence) ? null : charSequence;
        iwVar.OooOo00.setText(charSequence);
        iwVar.OooOOO0();
    }

    public void setSuffixTextAppearance(int i) {
        this.OooO0o.OooOo00.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.OooO0o.OooOo00.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(nm1 nm1Var) {
        EditText editText = this.OooO0oo;
        if (editText != null) {
            nt1.OooOOO0(editText, nm1Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.Ooooo0o) {
            this.Ooooo0o = typeface;
            this.o0ooOoO.OooOOO(typeface);
            jg0 jg0Var = this.OooOOO;
            if (typeface != jg0Var.OooOoo0) {
                jg0Var.OooOoo0 = typeface;
                AppCompatTextView appCompatTextView = jg0Var.OooOOo;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = jg0Var.OooOoO0;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.OooOOoo;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.Oooo00O) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.OooO0o0.OooO0oO;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.OooO0o0.OooO0O0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.OooO0o.OooOO0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.OooO0o.OooOO0.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.OooO0o.OooOO0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.OooO0o.OooO0oo(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        iw iwVar = this.OooO0o;
        TextInputLayout textInputLayout = iwVar.OooO0Oo;
        CheckableImageButton checkableImageButton = iwVar.OooOO0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ut2.OooO00o(textInputLayout, checkableImageButton, iwVar.OooOOO, iwVar.OooOOOO);
            ut2.OooO0OO(textInputLayout, checkableImageButton, iwVar.OooOOO);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.cmaster.cloner.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
