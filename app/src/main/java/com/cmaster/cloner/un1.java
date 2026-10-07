package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class un1 implements xn {
    public final CharSequence OooO;
    public final Toolbar OooO00o;
    public int OooO0O0;
    public final View OooO0OO;
    public Drawable OooO0Oo;
    public final Drawable OooO0o;
    public Drawable OooO0o0;
    public boolean OooO0oO;
    public CharSequence OooO0oo;
    public final CharSequence OooOO0;
    public Window.Callback OooOO0O;
    public boolean OooOO0o;
    public final int OooOOO;
    public o00O0OOO OooOOO0;
    public final Drawable OooOOOO;

    public un1(Toolbar toolbar, boolean z) throws Resources.NotFoundException {
        Drawable drawable;
        this.OooOOO = 0;
        this.OooO00o = toolbar;
        this.OooO0oo = toolbar.getTitle();
        this.OooO = toolbar.getSubtitle();
        this.OooO0oO = this.OooO0oo != null;
        this.OooO0o = toolbar.getNavigationIcon();
        a02 a02VarOooo0OO = a02.Oooo0OO(toolbar.getContext(), null, l61.OooO00o, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) a02VarOooo0OO.OooO0o;
        int i = 15;
        this.OooOOOO = a02VarOooo0OO.OooOOo(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.OooO0oO = true;
                this.OooO0oo = text;
                if ((this.OooO0O0 & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.OooO0oO) {
                        nt1.OooOOO(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.OooO = text2;
                if ((this.OooO0O0 & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableOooOOo = a02VarOooo0OO.OooOOo(20);
            if (drawableOooOOo != null) {
                this.OooO0o0 = drawableOooOOo;
                OooO0OO();
            }
            Drawable drawableOooOOo2 = a02VarOooo0OO.OooOOo(17);
            if (drawableOooOOo2 != null) {
                this.OooO0Oo = drawableOooOOo2;
                OooO0OO();
            }
            if (this.OooO0o == null && (drawable = this.OooOOOO) != null) {
                this.OooO0o = drawable;
                if ((this.OooO0O0 & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            OooO00o(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.OooO0OO;
                if (view != null && (this.OooO0O0 & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.OooO0OO = viewInflate;
                if (viewInflate != null && (this.OooO0O0 & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                OooO00o(this.OooO0O0 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.OooO0Oo();
                toolbar.OooOo0o.OooO00o(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.OooOOOO = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.OooO0o0;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.OooOOOo = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.OooO0o;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.OooOOOO = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.OooO0O0 = i;
        }
        a02VarOooo0OO.Oooo0oO();
        if (R.string.abc_action_bar_up_description != this.OooOOO) {
            this.OooOOO = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.OooOOO;
                this.OooOO0 = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                OooO0O0();
            }
        }
        this.OooOO0 = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new o0oOO(this));
    }

    public final void OooO00o(int i) throws Resources.NotFoundException {
        View view;
        int i2 = this.OooO0O0 ^ i;
        this.OooO0O0 = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.OooO00o;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    OooO0O0();
                }
                if ((this.OooO0O0 & 4) != 0) {
                    Drawable drawable = this.OooO0o;
                    if (drawable == null) {
                        drawable = this.OooOOOO;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                OooO0OO();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.OooO0oo);
                    toolbar.setSubtitle(this.OooO);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.OooO0OO) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void OooO0O0() {
        if ((this.OooO0O0 & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.OooOO0);
            Toolbar toolbar = this.OooO00o;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.OooOOO);
            } else {
                toolbar.setNavigationContentDescription(this.OooOO0);
            }
        }
    }

    public final void OooO0OO() {
        Drawable drawable;
        int i = this.OooO0O0;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.OooO0o0) == null) {
            drawable = this.OooO0Oo;
        }
        this.OooO00o.setLogo(drawable);
    }
}
