package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class hn0 implements wg1 {
    public static final Method OooOooO;
    public static final Method OooOooo;
    public int OooO;
    public final Context OooO0Oo;
    public ot OooO0o;
    public ListAdapter OooO0o0;
    public int OooOO0;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public View OooOOo;
    public pl OooOOo0;
    public AdapterView.OnItemClickListener OooOOoo;
    public AdapterView.OnItemSelectedListener OooOo00;
    public final Handler OooOoO0;
    public Rect OooOoOO;
    public final u OooOoo;
    public boolean OooOoo0;
    public final int OooO0oO = -2;
    public int OooO0oo = -2;
    public final int OooOO0O = 1002;
    public int OooOOOO = 0;
    public final int OooOOOo = Integer.MAX_VALUE;
    public final en0 OooOo0 = new en0(this, 1);
    public final gn0 OooOo0O = new gn0(this, 0);
    public final fn0 OooOo0o = new fn0(this);
    public final en0 OooOo = new en0(this, 0);
    public final Rect OooOoO = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                OooOooO = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                OooOooo = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public hn0(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.OooO0Oo = context;
        this.OooOoO0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l61.OooOOOO, i, 0);
        this.OooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.OooOO0 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.OooOO0o = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        u uVar = new u(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, l61.OooOOoo, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            uVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        uVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : ym2.OooO00o(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.OooOoo = uVar;
        uVar.setInputMethodMode(1);
    }

    @Override // com.cmaster.cloner.wg1
    public final void OooO() {
        int i;
        int paddingBottom;
        ot otVar;
        ot otVar2 = this.OooO0o;
        Context context = this.OooO0Oo;
        int i2 = 1;
        u uVar = this.OooOoo;
        if (otVar2 == null) {
            ot otVarOooOOOo = OooOOOo(context, !this.OooOoo0);
            this.OooO0o = otVarOooOOOo;
            otVarOooOOOo.setAdapter(this.OooO0o0);
            this.OooO0o.setOnItemClickListener(this.OooOOoo);
            this.OooO0o.setFocusable(true);
            this.OooO0o.setFocusableInTouchMode(true);
            this.OooO0o.setOnItemSelectedListener(new pt(this, i2));
            this.OooO0o.setOnScrollListener(this.OooOo0o);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.OooOo00;
            if (onItemSelectedListener != null) {
                this.OooO0o.setOnItemSelectedListener(onItemSelectedListener);
            }
            uVar.setContentView(this.OooO0o);
        }
        Drawable background = uVar.getBackground();
        Rect rect = this.OooOoO;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.OooOO0o) {
                this.OooOO0 = -i3;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iOooO00o = cn0.OooO00o(uVar, this.OooOOo, this.OooOO0, uVar.getInputMethodMode() == 2);
        int i4 = this.OooO0oO;
        if (i4 == -1) {
            paddingBottom = iOooO00o + i;
        } else {
            int i5 = this.OooO0oo;
            int iOooO00o2 = this.OooO0o.OooO00o(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iOooO00o);
            paddingBottom = iOooO00o2 + (iOooO00o2 > 0 ? this.OooO0o.getPaddingBottom() + this.OooO0o.getPaddingTop() + i : 0);
        }
        boolean z = uVar.getInputMethodMode() == 2;
        uVar.setWindowLayoutType(this.OooOO0O);
        if (uVar.isShowing()) {
            if (this.OooOOo.isAttachedToWindow()) {
                int width = this.OooO0oo;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.OooOOo.getWidth();
                }
                if (i4 == -1) {
                    i4 = z ? paddingBottom : -1;
                    int i6 = this.OooO0oo;
                    if (z) {
                        uVar.setWidth(i6 == -1 ? -1 : 0);
                        uVar.setHeight(0);
                    } else {
                        uVar.setWidth(i6 == -1 ? -1 : 0);
                        uVar.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                uVar.setOutsideTouchable(true);
                int i7 = width;
                View view = this.OooOOo;
                int i8 = this.OooO;
                int i9 = this.OooOO0;
                int i10 = i7 < 0 ? -1 : i7;
                if (i4 < 0) {
                    i4 = -1;
                }
                uVar.update(view, i8, i9, i10, i4);
                return;
            }
            return;
        }
        int width2 = this.OooO0oo;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.OooOOo.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        uVar.setWidth(width2);
        uVar.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = OooOooO;
            if (method != null) {
                try {
                    method.invoke(uVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            dn0.OooO0O0(uVar, true);
        }
        uVar.setOutsideTouchable(true);
        uVar.setTouchInterceptor(this.OooOo0O);
        if (this.OooOOO) {
            uVar.setOverlapAnchor(this.OooOOO0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = OooOooo;
            if (method2 != null) {
                try {
                    method2.invoke(uVar, this.OooOoOO);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            dn0.OooO00o(uVar, this.OooOoOO);
        }
        uVar.showAsDropDown(this.OooOOo, this.OooO, this.OooOO0, this.OooOOOO);
        this.OooO0o.setSelection(-1);
        if ((!this.OooOoo0 || this.OooO0o.isInTouchMode()) && (otVar = this.OooO0o) != null) {
            otVar.setListSelectionHidden(true);
            otVar.requestLayout();
        }
        if (this.OooOoo0) {
            return;
        }
        this.OooOoO0.post(this.OooOo);
    }

    @Override // com.cmaster.cloner.wg1
    public final boolean OooO00o() {
        return this.OooOoo.isShowing();
    }

    public final int OooO0O0() {
        return this.OooO;
    }

    public final void OooO0OO(int i) {
        this.OooO = i;
    }

    public final Drawable OooO0o0() {
        return this.OooOoo.getBackground();
    }

    public final void OooO0oO(Drawable drawable) {
        this.OooOoo.setBackgroundDrawable(drawable);
    }

    public final void OooO0oo(int i) {
        this.OooOO0 = i;
        this.OooOO0o = true;
    }

    @Override // com.cmaster.cloner.wg1
    public final ot OooOO0o() {
        return this.OooO0o;
    }

    public final int OooOOO() {
        if (this.OooOO0o) {
            return this.OooOO0;
        }
        return 0;
    }

    public void OooOOOO(ListAdapter listAdapter) {
        pl plVar = this.OooOOo0;
        if (plVar == null) {
            this.OooOOo0 = new pl(this, 1);
        } else {
            ListAdapter listAdapter2 = this.OooO0o0;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(plVar);
            }
        }
        this.OooO0o0 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.OooOOo0);
        }
        ot otVar = this.OooO0o;
        if (otVar != null) {
            otVar.setAdapter(this.OooO0o0);
        }
    }

    public ot OooOOOo(Context context, boolean z) {
        return new ot(context, z);
    }

    public final void OooOOo0(int i) {
        Drawable background = this.OooOoo.getBackground();
        if (background == null) {
            this.OooO0oo = i;
            return;
        }
        Rect rect = this.OooOoO;
        background.getPadding(rect);
        this.OooO0oo = rect.left + rect.right + i;
    }

    @Override // com.cmaster.cloner.wg1
    public final void dismiss() {
        u uVar = this.OooOoo;
        uVar.dismiss();
        uVar.setContentView(null);
        this.OooO0o = null;
        this.OooOoO0.removeCallbacks(this.OooOo0);
    }
}
