package com.cmaster.cloner;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOo0000O extends m implements DialogInterface {
    public final oO0OO00o OooO;

    public oOo0000O(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, OooO0oO(contextThemeWrapper, i));
        this.OooO = new oO0OO00o(getContext(), this, getWindow());
    }

    public static int OooO0oO(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // com.cmaster.cloner.m, com.cmaster.cloner.gg, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        oO0OO00o oo0oo00o = this.OooO;
        oo0oo00o.OooO0O0.setContentView(oo0oo00o.OooOoO);
        Context context = oo0oo00o.OooO00o;
        Window window = oo0oo00o.OooO0OO;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = oo0oo00o.OooO0oO;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !oO0OO00o.OooO00o(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (oo0oo00o.OooO0oo) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (oo0oo00o.OooO0o != null) {
                ((LinearLayout.LayoutParams) ((om0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupOooO0O0 = oO0OO00o.OooO0O0(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupOooO0O02 = oO0OO00o.OooO0O0(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupOooO0O03 = oO0OO00o.OooO0O0(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        oo0oo00o.OooOOo = nestedScrollView;
        nestedScrollView.setFocusable(false);
        oo0oo00o.OooOOo.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupOooO0O02.findViewById(android.R.id.message);
        oo0oo00o.OooOo0O = textView;
        if (textView != null) {
            CharSequence charSequence = oo0oo00o.OooO0o0;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                oo0oo00o.OooOOo.removeView(oo0oo00o.OooOo0O);
                if (oo0oo00o.OooO0o != null) {
                    ViewGroup viewGroup2 = (ViewGroup) oo0oo00o.OooOOo.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(oo0oo00o.OooOOo);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(oo0oo00o.OooO0o, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupOooO0O02.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupOooO0O03.findViewById(android.R.id.button1);
        oo0oo00o.OooO = button;
        o00O00O o00o00o = oo0oo00o.Oooo00O;
        button.setOnClickListener(o00o00o);
        boolean zIsEmpty = TextUtils.isEmpty(oo0oo00o.OooOO0);
        Button button2 = oo0oo00o.OooO;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(oo0oo00o.OooOO0);
            oo0oo00o.OooO.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupOooO0O03.findViewById(android.R.id.button2);
        oo0oo00o.OooOO0o = button3;
        button3.setOnClickListener(o00o00o);
        boolean zIsEmpty2 = TextUtils.isEmpty(oo0oo00o.OooOOO0);
        Button button4 = oo0oo00o.OooOO0o;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(oo0oo00o.OooOOO0);
            oo0oo00o.OooOO0o.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupOooO0O03.findViewById(android.R.id.button3);
        oo0oo00o.OooOOOO = button5;
        button5.setOnClickListener(o00o00o);
        boolean zIsEmpty3 = TextUtils.isEmpty(oo0oo00o.OooOOOo);
        Button button6 = oo0oo00o.OooOOOO;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(oo0oo00o.OooOOOo);
            oo0oo00o.OooOOOO.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = oo0oo00o.OooO;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = oo0oo00o.OooOO0o;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = oo0oo00o.OooOOOO;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupOooO0O03.setVisibility(8);
        }
        if (oo0oo00o.OooOo0o != null) {
            viewGroupOooO0O0.addView(oo0oo00o.OooOo0o, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            oo0oo00o.OooOo00 = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(oo0oo00o.OooO0Oo) || !oo0oo00o.OooOooo) {
                window.findViewById(R.id.title_template).setVisibility(8);
                oo0oo00o.OooOo00.setVisibility(8);
                viewGroupOooO0O0.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                oo0oo00o.OooOo0 = textView2;
                textView2.setText(oo0oo00o.OooO0Oo);
                Drawable drawable = oo0oo00o.OooOOoo;
                if (drawable != null) {
                    oo0oo00o.OooOo00.setImageDrawable(drawable);
                } else {
                    oo0oo00o.OooOo0.setPadding(oo0oo00o.OooOo00.getPaddingLeft(), oo0oo00o.OooOo00.getPaddingTop(), oo0oo00o.OooOo00.getPaddingRight(), oo0oo00o.OooOo00.getPaddingBottom());
                    oo0oo00o.OooOo00.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupOooO0O0 == null || viewGroupOooO0O0.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupOooO0O03.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupOooO0O02.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = oo0oo00o.OooOOo;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (oo0oo00o.OooO0o0 == null && oo0oo00o.OooO0o == null) ? null : viewGroupOooO0O0.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupOooO0O02.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = oo0oo00o.OooO0o;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.OooO0Oo, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.OooO0o0);
        }
        if (!z2) {
            View view2 = oo0oo00o.OooO0o;
            if (view2 == null) {
                view2 = oo0oo00o.OooOOo;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = nt1.OooO00o;
                gt1.OooO0O0(view2, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupOooO0O02.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupOooO0O02.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = oo0oo00o.OooO0o;
        if (alertController$RecycleListView2 == null || (listAdapter = oo0oo00o.OooOo) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = oo0oo00o.OooOoO0;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.OooO.OooOOo;
        if (nestedScrollView == null || !nestedScrollView.OooO(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.OooO.OooOOo;
        if (nestedScrollView == null || !nestedScrollView.OooO(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // com.cmaster.cloner.m, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        oO0OO00o oo0oo00o = this.OooO;
        oo0oo00o.OooO0Oo = charSequence;
        TextView textView = oo0oo00o.OooOo0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
