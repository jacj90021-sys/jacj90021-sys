package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.cmaster.cloner.R;
import com.cmaster.cloner.hn1;
import com.cmaster.cloner.in1;
import com.cmaster.cloner.o00Oo00;
import com.cmaster.cloner.oO0OOo0o;
import com.cmaster.cloner.sm1;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    public final oO0OOo0o OooO0Oo;
    public boolean OooO0o;
    public final o00Oo00 OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        hn1.OooO00o(context);
        this.OooO0o = false;
        sm1.OooO00o(getContext(), this);
        oO0OOo0o oo0ooo0o = new oO0OOo0o(this);
        this.OooO0Oo = oo0ooo0o;
        oo0ooo0o.OooOO0o(attributeSet, i);
        o00Oo00 o00oo00 = new o00Oo00(this);
        this.OooO0o0 = o00oo00;
        o00oo00.OooO0oo(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        oO0OOo0o oo0ooo0o = this.OooO0Oo;
        if (oo0ooo0o != null) {
            oo0ooo0o.OooO0O0();
        }
        o00Oo00 o00oo00 = this.OooO0o0;
        if (o00oo00 != null) {
            o00oo00.OooO00o();
        }
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

    public ColorStateList getSupportImageTintList() {
        in1 in1Var;
        o00Oo00 o00oo00 = this.OooO0o0;
        if (o00oo00 == null || (in1Var = (in1) o00oo00.OooO0oO) == null) {
            return null;
        }
        return in1Var.OooO00o;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        in1 in1Var;
        o00Oo00 o00oo00 = this.OooO0o0;
        if (o00oo00 == null || (in1Var = (in1) o00oo00.OooO0oO) == null) {
            return null;
        }
        return in1Var.OooO0O0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.OooO0o0.OooO0o).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        o00Oo00 o00oo00 = this.OooO0o0;
        if (o00oo00 != null) {
            o00oo00.OooO00o();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        o00Oo00 o00oo00 = this.OooO0o0;
        if (o00oo00 != null && drawable != null && !this.OooO0o) {
            o00oo00.OooO0o0 = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (o00oo00 != null) {
            o00oo00.OooO00o();
            if (this.OooO0o) {
                return;
            }
            ImageView imageView = (ImageView) o00oo00.OooO0o;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(o00oo00.OooO0o0);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.OooO0o = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.OooO0o0.OooOOO0(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o00Oo00 o00oo00 = this.OooO0o0;
        if (o00oo00 != null) {
            o00oo00.OooO00o();
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        o00Oo00 o00oo00 = this.OooO0o0;
        if (o00oo00 != null) {
            if (((in1) o00oo00.OooO0oO) == null) {
                o00oo00.OooO0oO = new in1();
            }
            in1 in1Var = (in1) o00oo00.OooO0oO;
            in1Var.OooO00o = colorStateList;
            in1Var.OooO0Oo = true;
            o00oo00.OooO00o();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        o00Oo00 o00oo00 = this.OooO0o0;
        if (o00oo00 != null) {
            if (((in1) o00oo00.OooO0oO) == null) {
                o00oo00.OooO0oO = new in1();
            }
            in1 in1Var = (in1) o00oo00.OooO0oO;
            in1Var.OooO0O0 = mode;
            in1Var.OooO0OO = true;
            o00oo00.OooO00o();
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public AppCompatImageButton(Context context) {
        this(context, null);
    }
}
