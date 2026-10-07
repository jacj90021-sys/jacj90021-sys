package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.cmaster.cloner.C0006r;
import com.cmaster.cloner.a02;
import com.cmaster.cloner.bt1;
import com.cmaster.cloner.ct;
import com.cmaster.cloner.ep2;
import com.cmaster.cloner.gv;
import com.cmaster.cloner.hc;
import com.cmaster.cloner.l61;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.nu1;
import com.cmaster.cloner.o43;
import com.cmaster.cloner.oO0;
import com.cmaster.cloner.s0;
import com.cmaster.cloner.sm1;
import com.cmaster.cloner.su;
import com.cmaster.cloner.ym2;
import com.cmaster.cloner.zq2;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final hc OoooOO0 = new hc(Float.class, "thumbPos", 10);
    public static final int[] o000oOoO = {R.attr.state_checked};
    public Drawable OooO;
    public Drawable OooO0Oo;
    public PorterDuff.Mode OooO0o;
    public ColorStateList OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public ColorStateList OooOO0;
    public PorterDuff.Mode OooOO0O;
    public boolean OooOO0o;
    public int OooOOO;
    public boolean OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public CharSequence OooOOo;
    public boolean OooOOo0;
    public CharSequence OooOOoo;
    public final int OooOo;
    public CharSequence OooOo0;
    public CharSequence OooOo00;
    public boolean OooOo0O;
    public int OooOo0o;
    public float OooOoO;
    public float OooOoO0;
    public final VelocityTracker OooOoOO;
    public float OooOoo;
    public final int OooOoo0;
    public int OooOooO;
    public int OooOooo;
    public final oO0 Oooo;
    public int Oooo0;
    public int Oooo000;
    public int Oooo00O;
    public int Oooo00o;
    public int Oooo0O0;
    public boolean Oooo0OO;
    public final ColorStateList Oooo0o;
    public final TextPaint Oooo0o0;
    public StaticLayout Oooo0oO;
    public StaticLayout Oooo0oo;
    public final Rect OoooO;
    public C0006r OoooO0;
    public ObjectAnimator OoooO00;
    public gv OoooO0O;

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int resourceId;
        super(context, attributeSet, i);
        this.OooO0o0 = null;
        this.OooO0o = null;
        this.OooO0oO = false;
        this.OooO0oo = false;
        this.OooOO0 = null;
        this.OooOO0O = null;
        this.OooOO0o = false;
        this.OooOOO0 = false;
        this.OooOoOO = VelocityTracker.obtain();
        this.Oooo0OO = true;
        this.OoooO = new Rect();
        sm1.OooO00o(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.Oooo0o0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = l61.OooOo0o;
        a02 a02VarOooo0OO = a02.Oooo0OO(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) a02VarOooo0OO.OooO0o;
        nt1.OooOO0o(this, context, iArr, attributeSet, typedArray, i);
        Drawable drawableOooOOo = a02VarOooo0OO.OooOOo(2);
        this.OooO0Oo = drawableOooOOo;
        if (drawableOooOOo != null) {
            drawableOooOOo.setCallback(this);
        }
        Drawable drawableOooOOo2 = a02VarOooo0OO.OooOOo(11);
        this.OooO = drawableOooOOo2;
        if (drawableOooOOo2 != null) {
            drawableOooOOo2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.OooOo0O = typedArray.getBoolean(3, true);
        this.OooOOO = typedArray.getDimensionPixelSize(8, 0);
        this.OooOOOO = typedArray.getDimensionPixelSize(5, 0);
        this.OooOOOo = typedArray.getDimensionPixelSize(6, 0);
        this.OooOOo0 = typedArray.getBoolean(4, false);
        ColorStateList colorStateListOooOOOo = a02VarOooo0OO.OooOOOo(9);
        if (colorStateListOooOOOo != null) {
            this.OooO0o0 = colorStateListOooOOOo;
            this.OooO0oO = true;
        }
        PorterDuff.Mode modeOooO0OO = ct.OooO0OO(typedArray.getInt(10, -1), null);
        if (this.OooO0o != modeOooO0OO) {
            this.OooO0o = modeOooO0OO;
            this.OooO0oo = true;
        }
        if (this.OooO0oO || this.OooO0oo) {
            OooO00o();
        }
        ColorStateList colorStateListOooOOOo2 = a02VarOooo0OO.OooOOOo(12);
        if (colorStateListOooOOOo2 != null) {
            this.OooOO0 = colorStateListOooOOOo2;
            this.OooOO0o = true;
        }
        PorterDuff.Mode modeOooO0OO2 = ct.OooO0OO(typedArray.getInt(13, -1), null);
        if (this.OooOO0O != modeOooO0OO2) {
            this.OooOO0O = modeOooO0OO2;
            this.OooOOO0 = true;
        }
        if (this.OooOO0o || this.OooOOO0) {
            OooO0O0();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, l61.OooOo);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = ep2.OooO0O0(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.Oooo0o = colorStateList;
            } else {
                this.Oooo0o = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                oO0 oo0 = new oO0();
                oo0.OooO0Oo = context2.getResources().getConfiguration().locale;
                this.Oooo = oo0;
            } else {
                this.Oooo = null;
            }
            setTextOnInternal(this.OooOOo);
            setTextOffInternal(this.OooOo00);
            typedArrayObtainStyledAttributes.recycle();
        }
        new s0(this).OooO0o(attributeSet, i);
        a02VarOooo0OO.Oooo0oO();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.OooOo = viewConfiguration.getScaledTouchSlop();
        this.OooOoo0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0006r getEmojiTextViewHelper() {
        if (this.OoooO0 == null) {
            this.OoooO0 = new C0006r(this);
        }
        return this.OoooO0;
    }

    private boolean getTargetCheckedState() {
        return this.OooOoo > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = nu1.OooO00o;
        int layoutDirection = getLayoutDirection();
        float f = this.OooOoo;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.OooO;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.OoooO;
        drawable.getPadding(rect);
        Drawable drawable2 = this.OooO0Oo;
        Rect rectOooO0O0 = drawable2 != null ? ct.OooO0O0(drawable2) : ct.OooO0OO;
        return ((((this.OooOooO - this.Oooo000) - rect.left) - rect.right) - rectOooO0O0.left) - rectOooO0O0.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.OooOo00 = charSequence;
        TransformationMethod transformationMethodOooO0o0 = ((zq2) getEmojiTextViewHelper().OooO0O0.OooO0o0).OooO0o0(this.Oooo);
        if (transformationMethodOooO0o0 != null) {
            charSequence = transformationMethodOooO0o0.getTransformation(charSequence, this);
        }
        this.OooOo0 = charSequence;
        this.Oooo0oo = null;
        if (this.OooOo0O) {
            OooO0Oo();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.OooOOo = charSequence;
        TransformationMethod transformationMethodOooO0o0 = ((zq2) getEmojiTextViewHelper().OooO0O0.OooO0o0).OooO0o0(this.Oooo);
        if (transformationMethodOooO0o0 != null) {
            charSequence = transformationMethodOooO0o0.getTransformation(charSequence, this);
        }
        this.OooOOoo = charSequence;
        this.Oooo0oO = null;
        if (this.OooOo0O) {
            OooO0Oo();
        }
    }

    public final void OooO00o() {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            if (this.OooO0oO || this.OooO0oo) {
                Drawable drawableMutate = drawable.mutate();
                this.OooO0Oo = drawableMutate;
                if (this.OooO0oO) {
                    drawableMutate.setTintList(this.OooO0o0);
                }
                if (this.OooO0oo) {
                    this.OooO0Oo.setTintMode(this.OooO0o);
                }
                if (this.OooO0Oo.isStateful()) {
                    this.OooO0Oo.setState(getDrawableState());
                }
            }
        }
    }

    public final void OooO0O0() {
        Drawable drawable = this.OooO;
        if (drawable != null) {
            if (this.OooOO0o || this.OooOOO0) {
                Drawable drawableMutate = drawable.mutate();
                this.OooO = drawableMutate;
                if (this.OooOO0o) {
                    drawableMutate.setTintList(this.OooOO0);
                }
                if (this.OooOOO0) {
                    this.OooO.setTintMode(this.OooOO0O);
                }
                if (this.OooO.isStateful()) {
                    this.OooO.setState(getDrawableState());
                }
            }
        }
    }

    public final void OooO0OO() {
        setTextOnInternal(this.OooOOo);
        setTextOffInternal(this.OooOo00);
        requestLayout();
    }

    public final void OooO0Oo() {
        if (this.OoooO0O == null && ((zq2) this.OoooO0.OooO0O0.OooO0o0).OooO0O0() && su.OooOO0O != null) {
            su suVarOooO00o = su.OooO00o();
            int iOooO0O0 = suVarOooO00o.OooO0O0();
            if (iOooO0O0 == 3 || iOooO0O0 == 0) {
                gv gvVar = new gv(this);
                this.OoooO0O = gvVar;
                suVarOooO00o.OooO0o(gvVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.Oooo00O;
        int i4 = this.Oooo00o;
        int i5 = this.Oooo0;
        int i6 = this.Oooo0O0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.OooO0Oo;
        Rect rectOooO0O0 = drawable != null ? ct.OooO0O0(drawable) : ct.OooO0OO;
        Drawable drawable2 = this.OooO;
        Rect rect = this.OoooO;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectOooO0O0 != null) {
                int i8 = rectOooO0O0.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectOooO0O0.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectOooO0O0.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectOooO0O0.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.OooO.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.OooO.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.OooO0Oo;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.Oooo000 + rect.right;
            this.OooO0Oo.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.OooO;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.OooO0Oo;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.OooO;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = nu1.OooO00o;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.OooOooO;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.OooOOOo : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = nu1.OooO00o;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.OooOooO;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.OooOOOo : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o43.OooO0o0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.OooOo0O;
    }

    public boolean getSplitTrack() {
        return this.OooOOo0;
    }

    public int getSwitchMinWidth() {
        return this.OooOOOO;
    }

    public int getSwitchPadding() {
        return this.OooOOOo;
    }

    public CharSequence getTextOff() {
        return this.OooOo00;
    }

    public CharSequence getTextOn() {
        return this.OooOOo;
    }

    public Drawable getThumbDrawable() {
        return this.OooO0Oo;
    }

    public final float getThumbPosition() {
        return this.OooOoo;
    }

    public int getThumbTextPadding() {
        return this.OooOOO;
    }

    public ColorStateList getThumbTintList() {
        return this.OooO0o0;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.OooO0o;
    }

    public Drawable getTrackDrawable() {
        return this.OooO;
    }

    public ColorStateList getTrackTintList() {
        return this.OooOO0;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.OooOO0O;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.OooO;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.OoooO00;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.OoooO00.end();
        this.OoooO00 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, o000oOoO);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.OooO;
        Rect rect = this.OoooO;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.Oooo00o;
        int i2 = this.Oooo0O0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.OooO0Oo;
        if (drawable != null) {
            if (!this.OooOOo0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectOooO0O0 = ct.OooO0O0(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectOooO0O0.left;
                rect.right -= rectOooO0O0.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.Oooo0oO : this.Oooo0oo;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.Oooo0o0;
            ColorStateList colorStateList = this.Oooo0o;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.OooOOo : this.OooOo00;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.OooO0Oo != null) {
            Drawable drawable = this.OooO;
            Rect rect = this.OoooO;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectOooO0O0 = ct.OooO0O0(this.OooO0Oo);
            iMax = Math.max(0, rectOooO0O0.left - rect.left);
            iMax2 = Math.max(0, rectOooO0O0.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = nu1.OooO00o;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.OooOooO + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.OooOooO) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.OooOooo;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.OooOooo + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.OooOooo;
        }
        this.Oooo00O = paddingLeft;
        this.Oooo00o = paddingTop;
        this.Oooo0O0 = height;
        this.Oooo0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.OooOo0O) {
            StaticLayout staticLayout = this.Oooo0oO;
            TextPaint textPaint = this.Oooo0o0;
            if (staticLayout == null) {
                CharSequence charSequence = this.OooOOoo;
                this.Oooo0oO = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.Oooo0oo == null) {
                CharSequence charSequence2 = this.OooOo0;
                this.Oooo0oo = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.OooO0Oo;
        Rect rect = this.OoooO;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.OooO0Oo.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.OooO0Oo.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.Oooo000 = Math.max(this.OooOo0O ? (this.OooOOO * 2) + Math.max(this.Oooo0oO.getWidth(), this.Oooo0oo.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.OooO;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.OooO.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.OooO0Oo;
        if (drawable3 != null) {
            Rect rectOooO0O0 = ct.OooO0O0(drawable3);
            iMax = Math.max(iMax, rectOooO0O0.left);
            iMax2 = Math.max(iMax2, rectOooO0O0.right);
        }
        boolean z = this.Oooo0OO;
        int iMax3 = this.OooOOOO;
        if (z) {
            iMax3 = Math.max(iMax3, (this.Oooo000 * 2) + iMax + iMax2);
        }
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.OooOooO = iMax3;
        this.OooOooo = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.OooOOo : this.OooOo00;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) throws Resources.NotFoundException {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.OooOOo;
                if (string == null) {
                    string = getResources().getString(com.cmaster.cloner.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = nt1.OooO00o;
                new bt1(com.cmaster.cloner.R.id.tag_state_description, CharSequence.class, 64, 30, 2).OooO0o(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.OooOo00;
            if (string2 == null) {
                string2 = getResources().getString(com.cmaster.cloner.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = nt1.OooO00o;
            new bt1(com.cmaster.cloner.R.id.tag_state_description, CharSequence.class, 64, 30, 2).OooO0o(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.OoooO00;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, OoooOO0, zIsChecked ? 1.0f : 0.0f);
        this.OoooO00 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.OoooO00.setAutoCancel(true);
        this.OoooO00.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o43.OooO0o(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
        setTextOnInternal(this.OooOOo);
        setTextOffInternal(this.OooOo00);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.Oooo0OO = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.OooOo0O != z) {
            this.OooOo0O = z;
            requestLayout();
            if (z) {
                OooO0Oo();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.OooOOo0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.OooOOOO = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.OooOOOo = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.Oooo0o0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.OooOo00;
        if (string == null) {
            string = getResources().getString(com.cmaster.cloner.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = nt1.OooO00o;
        new bt1(com.cmaster.cloner.R.id.tag_state_description, CharSequence.class, 64, 30, 2).OooO0o(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.OooOOo;
        if (string == null) {
            string = getResources().getString(com.cmaster.cloner.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = nt1.OooO00o;
        new bt1(com.cmaster.cloner.R.id.tag_state_description, CharSequence.class, 64, 30, 2).OooO0o(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.OooO0Oo;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.OooO0Oo = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.OooOoo = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(ym2.OooO00o(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.OooOOO = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.OooO0o0 = colorStateList;
        this.OooO0oO = true;
        OooO00o();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.OooO0o = mode;
        this.OooO0oo = true;
        OooO00o();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.OooO;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.OooO = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(ym2.OooO00o(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.OooOO0 = colorStateList;
        this.OooOO0o = true;
        OooO0O0();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.OooOO0O = mode;
        this.OooOOO0 = true;
        OooO0O0();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.OooO0Oo || drawable == this.OooO;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.cmaster.cloner.R.attr.switchStyle);
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}
