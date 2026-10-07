package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import com.cmaster.cloner.jt0;
import com.cmaster.cloner.l61;
import com.cmaster.cloner.o00O0O0;
import com.cmaster.cloner.o00O0O0O;
import com.cmaster.cloner.oo0oOO0;
import com.cmaster.cloner.r43;
import com.cmaster.cloner.rs0;
import com.cmaster.cloner.ss0;
import com.cmaster.cloner.vs0;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements jt0, View.OnClickListener, oo0oOO0 {
    public vs0 OooOO0O;
    public CharSequence OooOO0o;
    public rs0 OooOOO;
    public Drawable OooOOO0;
    public o00O0O0 OooOOOO;
    public o00O0O0O OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;
    public final int OooOOoo;
    public final int OooOo0;
    public int OooOo00;

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.OooOOo0 = OooO0oO();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l61.OooO0OO, i, 0);
        this.OooOOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.OooOo0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.OooOo00 = -1;
        setSaveEnabled(false);
    }

    @Override // com.cmaster.cloner.jt0
    public final void OooO00o(vs0 vs0Var) {
        this.OooOO0O = vs0Var;
        setIcon(vs0Var.getIcon());
        setTitle(vs0Var.getTitleCondensed());
        setId(vs0Var.OooO0Oo);
        setVisibility(vs0Var.isVisible() ? 0 : 8);
        setEnabled(vs0Var.isEnabled());
        if (vs0Var.hasSubMenu() && this.OooOOOO == null) {
            this.OooOOOO = new o00O0O0(this);
        }
    }

    @Override // com.cmaster.cloner.oo0oOO0
    public final boolean OooO0O0() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // com.cmaster.cloner.oo0oOO0
    public final boolean OooO0OO() {
        return !TextUtils.isEmpty(getText()) && this.OooOO0O.getIcon() == null;
    }

    public final boolean OooO0oO() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void OooO0oo() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.OooOO0o);
        if (this.OooOOO0 != null && ((this.OooOO0O.OooOoo0 & 4) != 4 || (!this.OooOOo0 && !this.OooOOo))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.OooOO0o : null);
        CharSequence charSequence = this.OooOO0O.OooOo00;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.OooOO0O.OooO0oo);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.OooOO0O.OooOo0;
        if (TextUtils.isEmpty(charSequence2)) {
            r43.OooO00o(this, z3 ? null : this.OooOO0O.OooO0oo);
        } else {
            r43.OooO00o(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // com.cmaster.cloner.jt0
    public vs0 getItemData() {
        return this.OooOO0O;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rs0 rs0Var = this.OooOOO;
        if (rs0Var != null) {
            rs0Var.OooO0O0(this.OooOO0O);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.OooOOo0 = OooO0oO();
        OooO0oo();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.OooOo00) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.OooOOoo;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.OooOOO0 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.OooOOO0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o00O0O0 o00o0o0;
        if (this.OooOO0O.hasSubMenu() && (o00o0o0 = this.OooOOOO) != null && o00o0o0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.OooOOo != z) {
            this.OooOOo = z;
            vs0 vs0Var = this.OooOO0O;
            if (vs0Var != null) {
                ss0 ss0Var = vs0Var.OooOOo0;
                ss0Var.OooOOO = true;
                ss0Var.OooOOOo(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.OooOOO0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.OooOo0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        OooO0oo();
    }

    public void setItemInvoker(rs0 rs0Var) {
        this.OooOOO = rs0Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.OooOo00 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(o00O0O0O o00o0o0o) {
        this.OooOOOo = o00o0o0o;
    }

    public void setTitle(CharSequence charSequence) {
        this.OooOO0o = charSequence;
        OooO0oo();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
