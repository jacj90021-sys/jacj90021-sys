package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.cmaster.cloner.a02;
import com.cmaster.cloner.jt0;
import com.cmaster.cloner.l61;
import com.cmaster.cloner.ss0;
import com.cmaster.cloner.vs0;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements jt0, AbsListView.SelectionBoundsAdjuster {
    public TextView OooO;
    public vs0 OooO0Oo;
    public RadioButton OooO0o;
    public ImageView OooO0o0;
    public TextView OooO0oO;
    public CheckBox OooO0oo;
    public ImageView OooOO0;
    public ImageView OooOO0O;
    public LinearLayout OooOO0o;
    public final int OooOOO;
    public final Drawable OooOOO0;
    public final Context OooOOOO;
    public boolean OooOOOo;
    public final boolean OooOOo;
    public final Drawable OooOOo0;
    public LayoutInflater OooOOoo;
    public boolean OooOo00;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        a02 a02VarOooo0OO = a02.Oooo0OO(getContext(), attributeSet, l61.OooOOo, i);
        this.OooOOO0 = a02VarOooo0OO.OooOOo(5);
        TypedArray typedArray = (TypedArray) a02VarOooo0OO.OooO0o;
        this.OooOOO = typedArray.getResourceId(1, -1);
        this.OooOOOo = typedArray.getBoolean(7, false);
        this.OooOOOO = context;
        this.OooOOo0 = a02VarOooo0OO.OooOOo(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.cmaster.cloner.R.attr.dropDownListViewStyle, 0);
        this.OooOOo = typedArrayObtainStyledAttributes.hasValue(0);
        a02VarOooo0OO.Oooo0oO();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.OooOOoo == null) {
            this.OooOOoo = LayoutInflater.from(getContext());
        }
        return this.OooOOoo;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.OooOO0;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // com.cmaster.cloner.jt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(com.cmaster.cloner.vs0 r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.OooO00o(com.cmaster.cloner.vs0):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.OooOO0O;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.OooOO0O.getLayoutParams();
        rect.top = this.OooOO0O.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // com.cmaster.cloner.jt0
    public vs0 getItemData() {
        return this.OooO0Oo;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.OooOOO0);
        TextView textView = (TextView) findViewById(com.cmaster.cloner.R.id.title);
        this.OooO0oO = textView;
        int i = this.OooOOO;
        if (i != -1) {
            textView.setTextAppearance(this.OooOOOO, i);
        }
        this.OooO = (TextView) findViewById(com.cmaster.cloner.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.cmaster.cloner.R.id.submenuarrow);
        this.OooOO0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.OooOOo0);
        }
        this.OooOO0O = (ImageView) findViewById(com.cmaster.cloner.R.id.group_divider);
        this.OooOO0o = (LinearLayout) findViewById(com.cmaster.cloner.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.OooO0o0 != null && this.OooOOOo) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.OooO0o0.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.OooO0o == null && this.OooO0oo == null) {
            return;
        }
        if ((this.OooO0Oo.OooOoOO & 4) != 0) {
            if (this.OooO0o == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.cmaster.cloner.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.OooO0o = radioButton;
                LinearLayout linearLayout = this.OooOO0o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.OooO0o;
            view = this.OooO0oo;
        } else {
            if (this.OooO0oo == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.cmaster.cloner.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.OooO0oo = checkBox;
                LinearLayout linearLayout2 = this.OooOO0o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.OooO0oo;
            view = this.OooO0o;
        }
        if (z) {
            compoundButton.setChecked(this.OooO0Oo.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.OooO0oo;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.OooO0o;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.OooO0Oo.OooOoOO & 4) != 0) {
            if (this.OooO0o == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.cmaster.cloner.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.OooO0o = radioButton;
                LinearLayout linearLayout = this.OooOO0o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.OooO0o;
        } else {
            if (this.OooO0oo == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.cmaster.cloner.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.OooO0oo = checkBox;
                LinearLayout linearLayout2 = this.OooOO0o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.OooO0oo;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.OooOo00 = z;
        this.OooOOOo = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.OooOO0O;
        if (imageView != null) {
            imageView.setVisibility((this.OooOOo || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        ss0 ss0Var = this.OooO0Oo.OooOOo0;
        boolean z = this.OooOo00;
        if (z || this.OooOOOo) {
            ImageView imageView = this.OooO0o0;
            if (imageView == null && drawable == null && !this.OooOOOo) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(com.cmaster.cloner.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.OooO0o0 = imageView2;
                LinearLayout linearLayout = this.OooOO0o;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.OooOOOo) {
                this.OooO0o0.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.OooO0o0;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.OooO0o0.getVisibility() != 0) {
                this.OooO0o0.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.OooO0oO;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.OooO0oO.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.OooO0oO.getVisibility() != 0) {
                this.OooO0oO.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.cmaster.cloner.R.attr.listMenuViewStyle);
    }
}
