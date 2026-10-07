package com.cmaster.cloner;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO0OO00o {
    public Button OooO;
    public final Context OooO00o;
    public final oOo0000O OooO0O0;
    public final Window OooO0OO;
    public CharSequence OooO0Oo;
    public AlertController$RecycleListView OooO0o;
    public CharSequence OooO0o0;
    public View OooO0oO;
    public CharSequence OooOO0;
    public Message OooOO0O;
    public Button OooOO0o;
    public Message OooOOO;
    public CharSequence OooOOO0;
    public Button OooOOOO;
    public CharSequence OooOOOo;
    public NestedScrollView OooOOo;
    public Message OooOOo0;
    public Drawable OooOOoo;
    public ListAdapter OooOo;
    public TextView OooOo0;
    public ImageView OooOo00;
    public TextView OooOo0O;
    public View OooOo0o;
    public final int OooOoO;
    public final int OooOoOO;
    public final int OooOoo;
    public final int OooOoo0;
    public final int OooOooO;
    public final boolean OooOooo;
    public final oOo00o0o Oooo000;
    public boolean OooO0oo = false;
    public int OooOoO0 = -1;
    public final o00O00O Oooo00O = new o00O00O(this, 2);

    public oO0OO00o(Context context, oOo0000O ooo0000o, Window window) {
        this.OooO00o = context;
        this.OooO0O0 = ooo0000o;
        this.OooO0OO = window;
        oOo00o0o ooo00o0o = new oOo00o0o();
        ooo00o0o.OooO0O0 = new WeakReference(ooo0000o);
        this.Oooo000 = ooo00o0o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, l61.OooO0o0, R.attr.alertDialogStyle, 0);
        this.OooOoO = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.OooOoOO = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.OooOoo0 = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.OooOoo = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.OooOooO = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.OooOooo = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ooo0000o.OooO0OO().OooO0oo(1);
    }

    public static boolean OooO00o(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (OooO00o(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup OooO0O0(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void OooO0OO(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.Oooo000.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.OooOOOo = charSequence;
            this.OooOOo0 = messageObtainMessage;
        } else if (i == -2) {
            this.OooOOO0 = charSequence;
            this.OooOOO = messageObtainMessage;
        } else if (i != -1) {
            ra.OooOOO("Button does not exist");
        } else {
            this.OooOO0 = charSequence;
            this.OooOO0O = messageObtainMessage;
        }
    }
}
