package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.cmaster.cloner.R;
import com.cmaster.cloner.ag1;
import com.cmaster.cloner.ah0;
import com.cmaster.cloner.dq0;
import com.cmaster.cloner.du;
import com.cmaster.cloner.er1;
import com.cmaster.cloner.ft1;
import com.cmaster.cloner.hq0;
import com.cmaster.cloner.j5;
import com.cmaster.cloner.k61;
import com.cmaster.cloner.lj;
import com.cmaster.cloner.n0;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.o000;
import com.cmaster.cloner.o0000;
import com.cmaster.cloner.o0000O00;
import com.cmaster.cloner.oO0oO000;
import com.cmaster.cloner.oOO00O;
import com.cmaster.cloner.oOo000Oo;
import com.cmaster.cloner.oj;
import com.cmaster.cloner.pt1;
import com.cmaster.cloner.px0;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.rj;
import com.cmaster.cloner.st1;
import com.cmaster.cloner.ty1;
import com.cmaster.cloner.u8;
import com.cmaster.cloner.uq0;
import com.cmaster.cloner.uy1;
import com.cmaster.cloner.v8;
import com.cmaster.cloner.vy1;
import com.cmaster.cloner.w8;
import com.cmaster.cloner.wq0;
import com.cmaster.cloner.wv2;
import com.cmaster.cloner.x8;
import com.cmaster.cloner.y8;
import com.cmaster.cloner.yy;
import com.cmaster.cloner.z8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends lj implements dq0 {
    public final wq0 OooO;
    public final int OooO00o;
    public boolean OooO0O0;
    public final float OooO0OO;
    public final int OooO0Oo;
    public boolean OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public final int OooO0oo;
    public final ColorStateList OooOO0;
    public final int OooOO0O;
    public final int OooOO0o;
    public final boolean OooOOO;
    public int OooOOO0;
    public final boolean OooOOOO;
    public final boolean OooOOOo;
    public final boolean OooOOo;
    public final boolean OooOOo0;
    public final boolean OooOOoo;
    public final boolean OooOo;
    public final boolean OooOo0;
    public final boolean OooOo00;
    public int OooOo0O;
    public int OooOo0o;
    public boolean OooOoO;
    public final ag1 OooOoO0;
    public final z8 OooOoOO;
    public final int OooOoo;
    public final ValueAnimator OooOoo0;
    public int OooOooO;
    public int OooOooo;
    public boolean Oooo;
    public boolean Oooo0;
    public final float Oooo000;
    public int Oooo00O;
    public final float Oooo00o;
    public boolean Oooo0O0;
    public final boolean Oooo0OO;
    public boolean Oooo0o;
    public final boolean Oooo0o0;
    public int Oooo0oO;
    public st1 Oooo0oo;
    public int OoooO;
    public boolean OoooO0;
    public int OoooO00;
    public final float OoooO0O;
    public int OoooOO0;
    public WeakReference OoooOOO;
    public WeakReference OoooOOo;
    public final ArrayList OoooOo0;
    public VelocityTracker OoooOoO;
    public hq0 OoooOoo;
    public int Ooooo00;
    public int Ooooo0o;
    public boolean OooooO0;
    public HashMap OooooOO;
    public final SparseIntArray OooooOo;
    public final w8 Oooooo0;
    public int o000oOoO;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i;
        int i2 = 0;
        this.OooO00o = 0;
        this.OooO0O0 = true;
        this.OooOO0O = -1;
        this.OooOO0o = -1;
        this.OooOoOO = new z8(this);
        this.Oooo000 = 0.5f;
        this.Oooo00o = -1.0f;
        this.Oooo0OO = true;
        this.Oooo0o0 = true;
        this.Oooo0oO = 4;
        this.OoooO0O = 0.1f;
        this.OoooOo0 = new ArrayList();
        this.Ooooo0o = -1;
        this.OooooOo = new SparseIntArray();
        this.Oooooo0 = new w8(this, i2);
        this.OooO0oo = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k61.OooO0Oo);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.OooOO0 = wv2.OooO00o(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.OooOoO0 = ag1.OooO0O0(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).OooO00o();
        }
        ag1 ag1Var = this.OooOoO0;
        if (ag1Var != null) {
            wq0 wq0Var = new wq0(ag1Var);
            this.OooO = wq0Var;
            wq0Var.OooO(context);
            ColorStateList colorStateList = this.OooOO0;
            if (colorStateList != null) {
                this.OooO.OooOO0o(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.OooO.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(OooOo(), 1.0f);
        this.OooOoo0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.OooOoo0.addUpdateListener(new u8(this, i2));
        this.Oooo00o = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.OooOO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.OooOO0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            Oooo0(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        } else {
            Oooo0(i);
        }
        Oooo00o(typedArrayObtainStyledAttributes.getBoolean(9, false));
        this.OooOOO = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.OooO0O0 != z) {
            this.OooO0O0 = z;
            if (this.OoooOOO != null) {
                OooOo0o();
            }
            Oooo0OO((this.OooO0O0 && this.Oooo0oO == 6) ? 3 : this.Oooo0oO);
            Oooo0oo(this.Oooo0oO, true);
            Oooo0oO();
        }
        this.Oooo0O0 = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.Oooo0OO = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.Oooo0o0 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.OooO00o = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            ra.OooOOO("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.Oooo000 = f;
        if (this.OoooOOO != null) {
            this.OooOooo = (int) ((1.0f - f) * this.o000oOoO);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            if (dimensionPixelOffset < 0) {
                ra.OooOOO("offset must be greater than or equal to 0");
                throw null;
            }
            this.OooOoo = dimensionPixelOffset;
            Oooo0oo(this.Oooo0oO, true);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                ra.OooOOO("offset must be greater than or equal to 0");
                throw null;
            }
            this.OooOoo = i3;
            Oooo0oo(this.Oooo0oO, true);
        }
        this.OooO0Oo = typedArrayObtainStyledAttributes.getInt(12, 500);
        this.OooOOOO = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.OooOOOo = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.OooOOo0 = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.OooOOo = typedArrayObtainStyledAttributes.getBoolean(21, true);
        this.OooOOoo = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.OooOo00 = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.OooOo0 = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.OooOo = typedArrayObtainStyledAttributes.getBoolean(24, true);
        typedArrayObtainStyledAttributes.recycle();
        this.OooO0OO = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View OooOoOO(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewOooOoOO = OooOoOO(viewGroup.getChildAt(i));
            if (viewOooOoOO != null) {
                return viewOooOoOO;
            }
        }
        return null;
    }

    public static int OooOoo(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static BottomSheetBehavior OooOoo0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof oj)) {
            ra.OooOOO("The view is not a child of CoordinatorLayout");
            return null;
        }
        lj ljVar = ((oj) layoutParams).OooO00o;
        if (ljVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) ljVar;
        }
        ra.OooOOO("The view is not associated with BottomSheetBehavior");
        return null;
    }

    @Override // com.cmaster.cloner.dq0
    public final void OooO00o(j5 j5Var) {
        hq0 hq0Var = this.OoooOoo;
        if (hq0Var == null) {
            return;
        }
        if (hq0Var.OooO0o == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        j5 j5Var2 = hq0Var.OooO0o;
        hq0Var.OooO0o = j5Var;
        if (j5Var2 == null) {
            return;
        }
        hq0Var.OooO0O0(j5Var.OooO0OO);
    }

    @Override // com.cmaster.cloner.dq0
    public final void OooO0O0(j5 j5Var) {
        hq0 hq0Var = this.OoooOoo;
        if (hq0Var == null) {
            return;
        }
        hq0Var.OooO0o = j5Var;
    }

    @Override // com.cmaster.cloner.dq0
    public final void OooO0OO() {
        hq0 hq0Var = this.OoooOoo;
        if (hq0Var == null) {
            return;
        }
        int i = hq0Var.OooO0Oo;
        int i2 = hq0Var.OooO0OO;
        j5 j5Var = hq0Var.OooO0o;
        hq0Var.OooO0o = null;
        if (j5Var != null) {
            float f = j5Var.OooO0OO;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.Oooo0) {
                    AnimatorSet animatorSetOooO00o = hq0Var.OooO00o();
                    animatorSetOooO00o.setDuration(oO0oO000.OooO0OO(i2, i, f));
                    animatorSetOooO00o.start();
                    Oooo0O0(4);
                    return;
                }
                oOO00O ooo00o = new oOO00O(this, 2);
                View view = hq0Var.OooO0O0;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new yy(1));
                objectAnimatorOfFloat.setDuration(oO0oO000.OooO0OO(i2, i, f));
                objectAnimatorOfFloat.addListener(new oOO00O(hq0Var, 9));
                objectAnimatorOfFloat.addListener(ooo00o);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        Oooo0O0(this.Oooo0 ? 5 : 4);
    }

    @Override // com.cmaster.cloner.dq0
    public final void OooO0Oo() {
        hq0 hq0Var = this.OoooOoo;
        if (hq0Var == null) {
            return;
        }
        if (hq0Var.OooO0o == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        j5 j5Var = hq0Var.OooO0o;
        hq0Var.OooO0o = null;
        if (j5Var == null) {
            return;
        }
        AnimatorSet animatorSetOooO00o = hq0Var.OooO00o();
        animatorSetOooO00o.setDuration(hq0Var.OooO0o0);
        animatorSetOooO00o.start();
    }

    @Override // com.cmaster.cloner.lj
    public final void OooO0oO(oj ojVar) {
        this.OoooOOO = null;
        this.Oooo0oo = null;
        this.OoooOoo = null;
    }

    @Override // com.cmaster.cloner.lj
    public final void OooOO0() {
        this.OoooOOO = null;
        this.Oooo0oo = null;
        this.OoooOoo = null;
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOO0O(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        st1 st1Var;
        if (!view.isShown() || !this.Oooo0OO) {
            this.Oooo = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Oooo00O();
        }
        if (this.OoooOoO == null) {
            this.OoooOoO = VelocityTracker.obtain();
        }
        this.OoooOoO.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.Ooooo0o = y;
            if (this.Oooo0oO != 2) {
                WeakReference weakReference = this.OoooOOo;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.OooOOOo(view2, x, y)) {
                    this.Ooooo00 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.OooooO0 = true;
                }
            }
            this.Oooo = this.Ooooo00 == -1 && !coordinatorLayout.OooOOOo(view, x, this.Ooooo0o);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.OooooO0 = false;
            this.Ooooo00 = -1;
            if (this.Oooo) {
                this.Oooo = false;
                return false;
            }
        }
        if (this.Oooo || (st1Var = this.Oooo0oo) == null || !st1Var.OooOOOo(motionEvent)) {
            WeakReference weakReference2 = this.OoooOOo;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.Oooo || this.Oooo0oO == 1 || coordinatorLayout.OooOOOo(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.Oooo0oo == null || (i = this.Ooooo0o) == -1 || Math.abs(i - motionEvent.getY()) <= this.Oooo0oo.OooO0O0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [int[], java.io.Serializable] */
    @Override // com.cmaster.cloner.lj
    public final boolean OooOO0o(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        int i2 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i3 = 2;
        int i4 = 0;
        if (this.OoooOOO == null) {
            this.OooO0oO = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i5 = Build.VERSION.SDK_INT;
            boolean z = (i5 < 29 || this.OooOOO || this.OooO0o) ? false : true;
            if (this.OooOOOO || this.OooOOOo || this.OooOOo0 || this.OooOOoo || this.OooOo00 || this.OooOo0 || z) {
                v8 v8Var = new v8(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                du duVar = new du();
                duVar.OooO00o = paddingStart;
                duVar.OooO0O0 = paddingEnd;
                duVar.OooO0OO = paddingBottom;
                er1 er1Var = new er1(v8Var, duVar, i3);
                WeakHashMap weakHashMap = nt1.OooO00o;
                ft1.OooOO0O(view, er1Var);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new pt1(i2));
                }
            }
            ah0 ah0Var = new ah0();
            ah0Var.OooO0o0 = new int[2];
            ah0Var.OooO0Oo = view;
            WeakHashMap weakHashMap2 = nt1.OooO00o;
            if (i5 >= 30) {
                view.setWindowInsetsAnimationCallback(new vy1(ah0Var));
            } else {
                PathInterpolator pathInterpolator = uy1.OooO0o0;
                View.OnApplyWindowInsetsListener ty1Var = new ty1(view, ah0Var);
                view.setTag(R.id.tag_window_insets_animation_callback, ty1Var);
                if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    view.setOnApplyWindowInsetsListener(ty1Var);
                }
            }
            this.OoooOOO = new WeakReference(view);
            this.OoooOoo = new hq0(view);
            wq0 wq0Var = this.OooO;
            if (wq0Var != null) {
                view.setBackground(wq0Var);
                float elevation = this.Oooo00o;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                wq0Var.OooOO0O(elevation);
            } else {
                ColorStateList colorStateList = this.OooOO0;
                if (colorStateList != null) {
                    ft1.OooO0oo(view, colorStateList);
                }
            }
            Oooo0oO();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Oooo0oo == null) {
            this.Oooo0oo = new st1(coordinatorLayout.getContext(), coordinatorLayout, this.Oooooo0);
        }
        int top = view.getTop();
        coordinatorLayout.OooOOo(view, i);
        this.OoooOO0 = coordinatorLayout.getWidth();
        this.o000oOoO = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.OoooO = height;
        int iMin = this.o000oOoO;
        int i6 = iMin - height;
        int i7 = this.OooOo0o;
        if (i6 < i7) {
            boolean z2 = this.OooOOo;
            int i8 = this.OooOO0o;
            if (z2) {
                if (i8 != -1) {
                    iMin = Math.min(iMin, i8);
                }
                this.OoooO = iMin;
            } else {
                int iMin2 = iMin - i7;
                if (i8 != -1) {
                    iMin2 = Math.min(iMin2, i8);
                }
                this.OoooO = iMin2;
            }
        }
        this.OooOooO = Math.max(0, this.o000oOoO - this.OoooO);
        this.OooOooo = (int) ((1.0f - this.Oooo000) * this.o000oOoO);
        OooOo0o();
        int i9 = this.Oooo0oO;
        if (i9 == 3) {
            int iOooOooO = OooOooO();
            WeakHashMap weakHashMap3 = nt1.OooO00o;
            view.offsetTopAndBottom(iOooOooO);
        } else if (i9 == 6) {
            int i10 = this.OooOooo;
            WeakHashMap weakHashMap4 = nt1.OooO00o;
            view.offsetTopAndBottom(i10);
        } else if (this.Oooo0 && i9 == 5) {
            int i11 = this.o000oOoO;
            WeakHashMap weakHashMap5 = nt1.OooO00o;
            view.offsetTopAndBottom(i11);
        } else if (i9 == 4) {
            int i12 = this.Oooo00O;
            WeakHashMap weakHashMap6 = nt1.OooO00o;
            view.offsetTopAndBottom(i12);
        } else if (i9 == 1 || i9 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap7 = nt1.OooO00o;
            view.offsetTopAndBottom(top2);
        }
        Oooo0oo(this.Oooo0oO, false);
        this.OoooOOo = new WeakReference(OooOoOO(view));
        while (true) {
            ArrayList arrayList = this.OoooOo0;
            if (i4 >= arrayList.size()) {
                return true;
            }
            ((x8) arrayList.get(i4)).OooO00o(view);
            i4++;
        }
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOOO(View view) {
        WeakReference weakReference = this.OoooOOo;
        return (weakReference == null || view != weakReference.get() || this.Oooo0oO == 3 || this.Oooo0o) ? false : true;
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOOO0(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(OooOoo(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.OooOO0O, marginLayoutParams.width), OooOoo(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.OooOO0o, marginLayoutParams.height));
        return true;
    }

    @Override // com.cmaster.cloner.lj
    public final void OooOOOO(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.OoooOOo;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.Oooo0OO;
        boolean z2 = this.Oooo0o0;
        if (i2 > 0) {
            if (!this.OoooO0 && !z2 && view2 == view3 && view2.canScrollVertically(1)) {
                this.Oooo0o = true;
                return;
            }
            if (i4 < OooOooO()) {
                int iOooOooO = top - OooOooO();
                iArr[1] = iOooOooO;
                WeakHashMap weakHashMap = nt1.OooO00o;
                view.offsetTopAndBottom(-iOooOooO);
                Oooo0OO(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = nt1.OooO00o;
                view.offsetTopAndBottom(-i2);
                Oooo0OO(1);
            }
        } else if (i2 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.OoooO0 && !z2 && view2 == view3 && zCanScrollVertically) {
                this.Oooo0o = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i5 = this.Oooo00O;
                if (i4 > i5 && !this.Oooo0) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    WeakHashMap weakHashMap3 = nt1.OooO00o;
                    view.offsetTopAndBottom(-i6);
                    Oooo0OO(4);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap4 = nt1.OooO00o;
                    view.offsetTopAndBottom(-i2);
                    Oooo0OO(1);
                }
            }
        }
        OooOoO(view.getTop());
        this.OoooO00 = i2;
        this.OoooO0 = true;
        this.Oooo0o = false;
    }

    @Override // com.cmaster.cloner.lj
    public final void OooOOOo(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // com.cmaster.cloner.lj
    public final void OooOOo(View view, Parcelable parcelable) {
        y8 y8Var = (y8) parcelable;
        int i = this.OooO00o;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.OooO0o0 = y8Var.OooO0oO;
            }
            if (i == -1 || (i & 2) == 2) {
                this.OooO0O0 = y8Var.OooO0oo;
            }
            if (i == -1 || (i & 4) == 4) {
                this.Oooo0 = y8Var.OooO;
            }
            if (i == -1 || (i & 8) == 8) {
                this.Oooo0O0 = y8Var.OooOO0;
            }
        }
        int i2 = y8Var.OooO0o;
        if (i2 == 1 || i2 == 2) {
            this.Oooo0oO = 4;
        } else {
            this.Oooo0oO = i2;
        }
    }

    @Override // com.cmaster.cloner.lj
    public final Parcelable OooOOoo(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new y8(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float OooOo() {
        /*
            r5 = this;
            r0 = 0
            com.cmaster.cloner.wq0 r1 = r5.OooO
            if (r1 == 0) goto L85
            java.lang.ref.WeakReference r2 = r5.OoooOOO
            if (r2 == 0) goto L85
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L85
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L85
            java.lang.ref.WeakReference r2 = r5.OoooOOO
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            boolean r5 = r5.Oooo000()
            if (r5 == 0) goto L85
            android.view.WindowInsets r5 = r2.getRootWindowInsets()
            if (r5 == 0) goto L85
            float[] r2 = r1.Oooo000
            if (r2 == 0) goto L31
            r3 = 3
            r2 = r2[r3]
            goto L3f
        L31:
            com.cmaster.cloner.uq0 r2 = r1.OooO0o0
            com.cmaster.cloner.ag1 r2 = r2.OooO00o
            com.cmaster.cloner.qj r2 = r2.OooO0o0
            android.graphics.RectF r3 = r1.OooO0o()
            float r2 = r2.OooO00o(r3)
        L3f:
            android.view.RoundedCorner r3 = com.cmaster.cloner.t8.OooOOoo(r5)
            if (r3 == 0) goto L54
            int r3 = com.cmaster.cloner.t8.OooO0o(r3)
            float r3 = (float) r3
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 <= 0) goto L54
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L54
            float r3 = r3 / r2
            goto L55
        L54:
            r3 = r0
        L55:
            float[] r2 = r1.Oooo000
            if (r2 == 0) goto L5d
            r1 = 0
            r1 = r2[r1]
            goto L6b
        L5d:
            com.cmaster.cloner.uq0 r2 = r1.OooO0o0
            com.cmaster.cloner.ag1 r2 = r2.OooO00o
            com.cmaster.cloner.qj r2 = r2.OooO0o
            android.graphics.RectF r1 = r1.OooO0o()
            float r1 = r2.OooO00o(r1)
        L6b:
            android.view.RoundedCorner r5 = com.cmaster.cloner.t8.OooOoo(r5)
            if (r5 == 0) goto L80
            int r5 = com.cmaster.cloner.t8.OooO0o(r5)
            float r5 = (float) r5
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L80
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L80
            float r0 = r5 / r1
        L80:
            float r5 = java.lang.Math.max(r3, r0)
            return r5
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OooOo():float");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // com.cmaster.cloner.lj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOo0(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.OooOooO()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.Oooo0OO(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.OoooOOo
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.OoooO0
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.OoooO00
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.OooO0O0
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.OooOooo
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.Oooo0
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.OoooOoO
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.OooO0OO
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.OoooOoO
            int r6 = r2.Ooooo00
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.Oooo0o0(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.OoooO00
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.OooO0O0
            if (r1 == 0) goto L74
            int r5 = r2.OooOooO
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.Oooo00O
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.OooOooo
            if (r3 >= r1) goto L83
            int r6 = r2.Oooo00O
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.Oooo00O
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.OooO0O0
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.OooOooo
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.Oooo00O
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.Oooo0o(r4, r0, r3)
            r2.OoooO0 = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OooOo0(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOo00(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.OoooO00 = 0;
        this.OoooO0 = false;
        return (i & 2) != 0;
    }

    @Override // com.cmaster.cloner.lj
    public final boolean OooOo0O(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.Oooo0oO;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        st1 st1Var = this.Oooo0oo;
        boolean z = this.Oooo0OO;
        if (st1Var != null && (z || i == 1)) {
            st1Var.OooOO0(motionEvent);
        }
        if (actionMasked == 0) {
            Oooo00O();
        }
        if (this.OoooOoO == null) {
            this.OoooOoO = VelocityTracker.obtain();
        }
        this.OoooOoO.addMovement(motionEvent);
        if (this.Oooo0oo != null && ((z || this.Oooo0oO == 1) && actionMasked == 2 && !this.Oooo)) {
            float fAbs = Math.abs(this.Ooooo0o - motionEvent.getY());
            st1 st1Var2 = this.Oooo0oo;
            if (fAbs > st1Var2.OooO0O0) {
                st1Var2.OooO0O0(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.Oooo;
    }

    public final void OooOo0o() {
        int iOooOoO0 = OooOoO0();
        boolean z = this.OooO0O0;
        int i = this.o000oOoO;
        if (z) {
            this.Oooo00O = Math.max(i - iOooOoO0, this.OooOooO);
        } else {
            this.Oooo00O = i - iOooOoO0;
        }
    }

    public final void OooOoO(int i) {
        View view = (View) this.OoooOOO.get();
        if (view != null) {
            ArrayList arrayList = this.OoooOo0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.Oooo00O;
            if (i <= i2 && i2 != OooOooO()) {
                OooOooO();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((x8) arrayList.get(i3)).OooO0O0(view);
            }
        }
    }

    public final int OooOoO0() {
        int iMin;
        int i;
        int i2;
        if (this.OooO0o) {
            iMin = Math.min(Math.max(this.OooO0oO, this.o000oOoO - ((this.OoooOO0 * 9) / 16)), this.OoooO);
            i = this.OooOo0O;
        } else {
            if (!this.OooOOO && !this.OooOOOO && (i2 = this.OooOOO0) > 0) {
                return Math.max(this.OooO0o0, i2 + this.OooO0oo);
            }
            iMin = this.OooO0o0;
            i = this.OooOo0O;
        }
        return iMin + i;
    }

    public final int OooOooO() {
        if (this.OooO0O0) {
            return this.OooOooO;
        }
        return Math.max(this.OooOoo, this.OooOOo ? 0 : this.OooOo0o);
    }

    public final int OooOooo(int i) {
        if (i == 3) {
            return OooOooO();
        }
        if (i == 4) {
            return this.Oooo00O;
        }
        if (i == 5) {
            return this.o000oOoO;
        }
        if (i == 6) {
            return this.OooOooo;
        }
        ra.OooOOO(px0.OooOOO(i, "Invalid state to get top offset: "));
        return 0;
    }

    public final void Oooo(boolean z) {
        WeakReference weakReference = this.OoooOOO;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.OooooOO != null) {
                    return;
                } else {
                    this.OooooOO = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.OoooOOO.get() && z) {
                    this.OooooOO.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.OooooOO = null;
        }
    }

    public final void Oooo0(int i) {
        boolean z = this.OooO0o;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.OooO0o = true;
            }
        } else {
            if (!z && this.OooO0o0 == i) {
                return;
            }
            this.OooO0o = false;
            this.OooO0o0 = Math.max(0, i);
        }
        OoooO00();
    }

    public final boolean Oooo000() {
        WeakReference weakReference = this.OoooOOO;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.OoooOOO.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void Oooo00O() {
        this.Ooooo00 = -1;
        this.Ooooo0o = -1;
        VelocityTracker velocityTracker = this.OoooOoO;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.OoooOoO = null;
        }
    }

    public final void Oooo00o(boolean z) throws Resources.NotFoundException {
        if (this.Oooo0 != z) {
            this.Oooo0 = z;
            if (!z && this.Oooo0oO == 5) {
                Oooo0O0(4);
            }
            Oooo0oO();
        }
    }

    public final void Oooo0O0(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(rj.OooO0oO(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.Oooo0 && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.OooO0O0 && OooOooo(i) <= this.OooOooO) ? 3 : i;
        WeakReference weakReference = this.OoooOOO;
        if (weakReference == null || weakReference.get() == null) {
            Oooo0OO(i);
            return;
        }
        View view = (View) this.OoooOOO.get();
        n0 n0Var = new n0(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(n0Var);
        } else {
            n0Var.run();
        }
    }

    public final void Oooo0OO(int i) {
        View view;
        if (this.Oooo0oO == i) {
            return;
        }
        this.Oooo0oO = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.Oooo0;
        }
        WeakReference weakReference = this.OoooOOO;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            Oooo(true);
        } else if (i == 6 || i == 5 || i == 4) {
            Oooo(false);
        }
        Oooo0oo(i, true);
        while (true) {
            ArrayList arrayList = this.OoooOo0;
            if (i2 >= arrayList.size()) {
                Oooo0oO();
                return;
            } else {
                ((x8) arrayList.get(i2)).OooO0OO(view, i);
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        Oooo0OO(2);
        Oooo0oo(r4, true);
        r2.OooOoOO.OooO0O0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.OooOOOO(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oooo0o(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.OooOooo(r4)
            com.cmaster.cloner.st1 r1 = r2.Oooo0oo
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.OooOOOO(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.OooOOo = r3
            r3 = -1
            r1.OooO0OO = r3
            r3 = 0
            boolean r3 = r1.OooO0oo(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.OooO00o
            if (r5 != 0) goto L30
            android.view.View r5 = r1.OooOOo
            if (r5 == 0) goto L30
            r5 = 0
            r1.OooOOo = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.Oooo0OO(r3)
            r3 = 1
            r2.Oooo0oo(r4, r3)
            com.cmaster.cloner.z8 r2 = r2.OooOoOO
            r2.OooO0O0(r4)
            return
        L40:
            r2.Oooo0OO(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.Oooo0o(android.view.View, int, boolean):void");
    }

    public final boolean Oooo0o0(View view, float f) {
        if (this.Oooo0O0) {
            return true;
        }
        if (view.getTop() < this.Oooo00O) {
            return false;
        }
        return Math.abs(((f * this.OoooO0O) + ((float) view.getTop())) - ((float) this.Oooo00O)) / ((float) OooOoO0()) > 0.5f;
    }

    public final void Oooo0oO() throws Resources.NotFoundException {
        View view;
        int iOooO00o;
        WeakReference weakReference = this.OoooOOO;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        nt1.OooOO0(view, 524288);
        nt1.OooO0oo(view, 0);
        nt1.OooOO0(view, 262144);
        nt1.OooO0oo(view, 0);
        nt1.OooOO0(view, 1048576);
        nt1.OooO0oo(view, 0);
        SparseIntArray sparseIntArray = this.OooooOo;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            nt1.OooOO0(view, i);
            nt1.OooO0oo(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.OooO0O0 && this.Oooo0oO != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            oOo000Oo ooo000oo = new oOo000Oo(this, i);
            ArrayList arrayListOooO0o = nt1.OooO0o(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListOooO0o.size()) {
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        int[] iArr = nt1.OooO0Oo;
                        if (i3 >= 32 || i4 != -1) {
                            break;
                        }
                        int i5 = iArr[i3];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListOooO0o.size(); i6++) {
                            z &= ((o000) arrayListOooO0o.get(i6)).OooO00o() != i5;
                        }
                        if (z) {
                            i4 = i5;
                        }
                        i3++;
                    }
                    iOooO00o = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((o000) arrayListOooO0o.get(i2)).OooO00o).getLabel())) {
                        iOooO00o = ((o000) arrayListOooO0o.get(i2)).OooO00o();
                        break;
                    }
                    i2++;
                }
            }
            if (iOooO00o != -1) {
                o000 o000Var = new o000(null, iOooO00o, string, ooo000oo, null);
                View.AccessibilityDelegate accessibilityDelegateOooO0Oo = nt1.OooO0Oo(view);
                o0000O00 o0000o00 = accessibilityDelegateOooO0Oo == null ? null : accessibilityDelegateOooO0Oo instanceof o0000 ? ((o0000) accessibilityDelegateOooO0Oo).OooO00o : new o0000O00(accessibilityDelegateOooO0Oo);
                if (o0000o00 == null) {
                    o0000o00 = new o0000O00();
                }
                nt1.OooOOO0(view, o0000o00);
                nt1.OooOO0(view, o000Var.OooO00o());
                nt1.OooO0o(view).add(o000Var);
                nt1.OooO0oo(view, 0);
            }
            sparseIntArray.put(0, iOooO00o);
        }
        if (this.Oooo0) {
            int i7 = 5;
            if (this.Oooo0oO != 5) {
                nt1.OooOO0O(view, o000.OooO, new oOo000Oo(this, i7));
            }
        }
        int i8 = this.Oooo0oO;
        int i9 = 4;
        int i10 = 3;
        if (i8 == 3) {
            nt1.OooOO0O(view, o000.OooO0oo, new oOo000Oo(this, this.OooO0O0 ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            nt1.OooOO0O(view, o000.OooO0oO, new oOo000Oo(this, this.OooO0O0 ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            nt1.OooOO0O(view, o000.OooO0oo, new oOo000Oo(this, i9));
            nt1.OooOO0O(view, o000.OooO0oO, new oOo000Oo(this, i10));
        }
    }

    public final void Oooo0oo(int i, boolean z) {
        wq0 wq0Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.Oooo0oO == 3 && (this.OooOo || Oooo000());
        if (this.OooOoO == z2 || (wq0Var = this.OooO) == null) {
            return;
        }
        this.OooOoO = z2;
        ValueAnimator valueAnimator = this.OooOoo0;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(wq0Var.OooO0o0.OooOO0, z2 ? OooOo() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fOooOo = this.OooOoO ? OooOo() : 1.0f;
        uq0 uq0Var = wq0Var.OooO0o0;
        if (uq0Var.OooOO0 != fOooOo) {
            uq0Var.OooOO0 = fOooOo;
            wq0Var.OooO = true;
            wq0Var.OooOO0 = true;
            wq0Var.invalidateSelf();
        }
    }

    public final void OoooO00() {
        View view;
        if (this.OoooOOO != null) {
            OooOo0o();
            if (this.Oooo0oO != 4 || (view = (View) this.OoooOOO.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public BottomSheetBehavior() {
        this.OooO00o = 0;
        this.OooO0O0 = true;
        this.OooOO0O = -1;
        this.OooOO0o = -1;
        this.OooOoOO = new z8(this);
        this.Oooo000 = 0.5f;
        this.Oooo00o = -1.0f;
        this.Oooo0OO = true;
        this.Oooo0o0 = true;
        this.Oooo0oO = 4;
        this.OoooO0O = 0.1f;
        this.OoooOo0 = new ArrayList();
        this.Ooooo0o = -1;
        this.OooooOo = new SparseIntArray();
        this.Oooooo0 = new w8(this, 0);
    }
}
