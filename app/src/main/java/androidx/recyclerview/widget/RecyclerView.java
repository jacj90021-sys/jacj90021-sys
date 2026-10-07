package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.cmaster.cloner.a71;
import com.cmaster.cloner.a81;
import com.cmaster.cloner.bz;
import com.cmaster.cloner.cj;
import com.cmaster.cloner.d71;
import com.cmaster.cloner.e71;
import com.cmaster.cloner.ed;
import com.cmaster.cloner.f71;
import com.cmaster.cloner.ft1;
import com.cmaster.cloner.fz;
import com.cmaster.cloner.g71;
import com.cmaster.cloner.gh1;
import com.cmaster.cloner.gp0;
import com.cmaster.cloner.ht1;
import com.cmaster.cloner.i71;
import com.cmaster.cloner.j61;
import com.cmaster.cloner.j71;
import com.cmaster.cloner.k71;
import com.cmaster.cloner.kr;
import com.cmaster.cloner.l71;
import com.cmaster.cloner.m71;
import com.cmaster.cloner.mw0;
import com.cmaster.cloner.n71;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.nw0;
import com.cmaster.cloner.o00Oo00;
import com.cmaster.cloner.o40;
import com.cmaster.cloner.o71;
import com.cmaster.cloner.oO0OOo0o;
import com.cmaster.cloner.ooOOOOoo;
import com.cmaster.cloner.ot1;
import com.cmaster.cloner.p71;
import com.cmaster.cloner.q31;
import com.cmaster.cloner.q71;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.qo;
import com.cmaster.cloner.qq2;
import com.cmaster.cloner.qw0;
import com.cmaster.cloner.r71;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.rj;
import com.cmaster.cloner.sa;
import com.cmaster.cloner.sc;
import com.cmaster.cloner.tj0;
import com.cmaster.cloner.u71;
import com.cmaster.cloner.um0;
import com.cmaster.cloner.v71;
import com.cmaster.cloner.vj0;
import com.cmaster.cloner.vr1;
import com.cmaster.cloner.w71;
import com.cmaster.cloner.wt1;
import com.cmaster.cloner.x61;
import com.cmaster.cloner.x71;
import com.cmaster.cloner.xb;
import com.cmaster.cloner.xb1;
import com.cmaster.cloner.xx2;
import com.cmaster.cloner.y61;
import com.cmaster.cloner.y71;
import com.cmaster.cloner.z61;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements mw0 {
    public static final tj0 o00000O;
    public static final Class[] o00000O0;
    public static final v71 o00000OO;
    public static boolean o000OOo;
    public static boolean o0O0O00;
    public final xb OooO;
    public final float OooO0Oo;
    public final p71 OooO0o;
    public final bz OooO0o0;
    public r71 OooO0oO;
    public final oO0OOo0o OooO0oo;
    public final vr1 OooOO0;
    public boolean OooOO0O;
    public final x61 OooOO0o;
    public final Rect OooOOO;
    public final Rect OooOOO0;
    public final RectF OooOOOO;
    public a71 OooOOOo;
    public final ArrayList OooOOo;
    public i71 OooOOo0;
    public final ArrayList OooOOoo;
    public boolean OooOo;
    public l71 OooOo0;
    public final ArrayList OooOo00;
    public boolean OooOo0O;
    public boolean OooOo0o;
    public boolean OooOoO;
    public int OooOoO0;
    public boolean OooOoOO;
    public int OooOoo;
    public boolean OooOoo0;
    public boolean OooOooO;
    public final AccessibilityManager OooOooo;
    public f71 Oooo;
    public int Oooo0;
    public ArrayList Oooo000;
    public boolean Oooo00O;
    public boolean Oooo00o;
    public int Oooo0O0;
    public e71 Oooo0OO;
    public EdgeEffect Oooo0o;
    public EdgeEffect Oooo0o0;
    public EdgeEffect Oooo0oO;
    public EdgeEffect Oooo0oo;
    public int OoooO;
    public int OoooO0;
    public int OoooO00;
    public VelocityTracker OoooO0O;
    public int OoooOO0;
    public int OoooOOO;
    public int OoooOOo;
    public final int OoooOo0;
    public final int OoooOoO;
    public final float OoooOoo;
    public final float Ooooo00;
    public boolean Ooooo0o;
    public final x71 OooooO0;
    public o40 OooooOO;
    public final ed OooooOo;
    public m71 Oooooo;
    public final u71 Oooooo0;
    public ArrayList OoooooO;
    public boolean Ooooooo;
    public int o000oOoO;
    public boolean o00O0O;
    public a81 o00Oo0;
    public final int[] o00Ooo;
    public nw0 o00o0O;
    public final ArrayList o00oO0O;
    public final int[] o00oO0o;
    public final int[] o00ooo;
    public final y61 o0OO00O;
    public int o0OOO0o;
    public final boolean o0Oo0oo;
    public boolean o0OoOo0;
    public final x61 o0ooOO0;
    public boolean o0ooOOo;
    public int o0ooOoO;
    public final int[] oo000o;
    public final kr oo0o0Oo;
    public final z61 ooOO;
    public static final int[] o000000 = {R.attr.nestedScrollingEnabled};
    public static final float o000000O = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean o000000o = true;
    public static final boolean o00000 = true;

    public void o0000o0o(View child, int index, LayoutParams params) {
        attachViewToParent(child, index, params);
    }

    public void o0000o0O(int index) {
        detachViewFromParent(index);
    }

    public boolean o00oO0oO() {
        return awakenScrollBars();
    }

    static {
        Class cls = Integer.TYPE;
        o00000O0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        o00000O = new tj0(2);
        o00000OO = new v71();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Class[]] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        float fOooO00o;
        char c;
        boolean z;
        Throwable th;
        char c2;
        int i2;
        TypedArray typedArray;
        int i3;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        int i4 = 1;
        this.OooO0o0 = new bz(this, i4);
        this.OooO0o = new p71(this);
        this.OooOO0 = new vr1(1);
        this.OooOO0o = new x61(this, 0);
        this.OooOOO0 = new Rect();
        this.OooOOO = new Rect();
        this.OooOOOO = new RectF();
        this.OooOOo = new ArrayList();
        this.OooOOoo = new ArrayList();
        this.OooOo00 = new ArrayList();
        this.OooOoO0 = 0;
        this.Oooo00O = false;
        this.Oooo00o = false;
        this.Oooo0 = 0;
        this.Oooo0O0 = 0;
        this.Oooo0OO = o00000OO;
        qo qoVar = new qo();
        qoVar.OooO00o = null;
        qoVar.OooO0O0 = new ArrayList();
        qoVar.OooO0OO = 120L;
        qoVar.OooO0Oo = 120L;
        qoVar.OooO0o0 = 250L;
        qoVar.OooO0o = 250L;
        qoVar.OooO0oO = true;
        qoVar.OooO0oo = new ArrayList();
        qoVar.OooO = new ArrayList();
        qoVar.OooOO0 = new ArrayList();
        qoVar.OooOO0O = new ArrayList();
        qoVar.OooOO0o = new ArrayList();
        qoVar.OooOOO0 = new ArrayList();
        qoVar.OooOOO = new ArrayList();
        qoVar.OooOOOO = new ArrayList();
        qoVar.OooOOOo = new ArrayList();
        qoVar.OooOOo0 = new ArrayList();
        qoVar.OooOOo = new ArrayList();
        this.Oooo = qoVar;
        this.OoooO00 = 0;
        this.OoooO0 = -1;
        this.OoooOoo = Float.MIN_VALUE;
        this.Ooooo00 = Float.MIN_VALUE;
        this.Ooooo0o = true;
        this.OooooO0 = new x71(this);
        this.OooooOo = o00000 ? new ed() : null;
        u71 u71Var = new u71();
        u71Var.OooO00o = -1;
        u71Var.OooO0O0 = 0;
        u71Var.OooO0OO = 0;
        u71Var.OooO0Oo = 1;
        u71Var.OooO0o0 = 0;
        u71Var.OooO0o = false;
        u71Var.OooO0oO = false;
        u71Var.OooO0oo = false;
        u71Var.OooO = false;
        u71Var.OooOO0 = false;
        u71Var.OooOO0O = false;
        this.Oooooo0 = u71Var;
        this.Ooooooo = false;
        this.o0OoOo0 = false;
        z61 z61Var = new z61(this);
        this.ooOO = z61Var;
        this.o00O0O = false;
        this.o00Ooo = new int[2];
        this.o00ooo = new int[2];
        this.oo000o = new int[2];
        this.o00oO0o = new int[2];
        this.o00oO0O = new ArrayList();
        this.o0ooOO0 = new x61(this, i4);
        this.o0ooOoO = 0;
        this.o0OOO0o = 0;
        this.o0OO00O = new y61(this);
        this.oo0o0Oo = new kr(getContext(), new z61(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.OoooOOo = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = ot1.OooO00o;
            fOooO00o = cj.OooO0oO(viewConfiguration);
        } else {
            fOooO00o = ot1.OooO00o(viewConfiguration, context);
        }
        this.OoooOoo = fOooO00o;
        this.Ooooo00 = i5 >= 26 ? cj.OooO0oo(viewConfiguration) : ot1.OooO00o(viewConfiguration, context);
        this.OoooOo0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.OoooOoO = viewConfiguration.getScaledMaximumFlingVelocity();
        this.OooO0Oo = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.Oooo.OooO00o = z61Var;
        this.OooO0oo = new oO0OOo0o(new y61(this));
        this.OooO = new xb(new xb1(this, 27));
        WeakHashMap weakHashMap = nt1.OooO00o;
        if ((i5 >= 26 ? ht1.OooO00o(this) : 0) == 0 && i5 >= 26) {
            ht1.OooO0O0(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.OooOooo = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new a81(this));
        int[] iArr = j61.OooO00o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        nt1.OooOO0o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.OooOO0O = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                ra.OooOOO("Trying to set fast scroller without both required drawables.".concat(OooOooO()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c2 = 2;
            z = true;
            typedArray = typedArrayObtainStyledAttributes;
            i2 = i;
            c = 3;
            th = null;
            i3 = 4;
            new fz(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.cmaster.cloner.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.cmaster.cloner.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.cmaster.cloner.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            z = true;
            th = null;
            c2 = 2;
            i2 = i;
            typedArray = typedArrayObtainStyledAttributes;
            i3 = 4;
        }
        typedArray.recycle();
        this.o0Oo0oo = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            try {
                                classLoader = context.getClassLoader();
                            } catch (ClassNotFoundException e) {
                                Throwable eVar = e;
                                th = null;
                                ra.OooO0Oo(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, eVar);
                                throw th;
                            } catch (IllegalAccessException e2) {
                                        th = null;
                                        ra.OooO0Oo(attributeSet.getPositionDescription(), ": Cannot access non-public constructor " str, e2);
                                        throw th;
                            }
                        }
                        Class<? extends i71> AsSubclass = Class.forName(str, false, classLoader).asSubclass(i71.class);
                        try {
                            constructor = AsSubclass.getConstructor(o00000O0);
                            objArr = new Object[i3];
                            objArr[0] = context;
                            objArr[1] = attributeSet;
                            objArr[c2] = Integer.valueOf(i2);
                            objArr[c] = 0;
                        } catch (NoSuchMethodException e5) {
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e5);
                        }
                        constructor.setAccessible(z);
                        setLayoutManager((i71) constructor.newInstance(objArr));
                    } catch (ClassCastException e7) {
                        ra.OooO0Oo(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e7);
                        throw null;
                    }
                } catch (ClassNotFoundException e8) {

                } catch (IllegalAccessException e9) {

                } catch (InstantiationException e10) {

                } catch (InvocationTargetException e11) {

                }
            }
        }
        int[] iArr2 = o000000;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        nt1.OooOO0o(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.cmaster.cloner.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static void OooOOO0(y71 y71Var) {
        WeakReference weakReference = y71Var.OooO0O0;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == y71Var.OooO00o) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            y71Var.OooO0O0 = null;
        }
    }

    public static int OooOOOo(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && qq2.OooO00o(edgeEffect) != 0.0f) {
            int iRound = Math.round(qq2.OooO0O0(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || qq2.OooO00o(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(qq2.OooO0O0(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static RecyclerView Oooo0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewOooo0 = Oooo0(viewGroup.getChildAt(i));
            if (recyclerViewOooo0 != null) {
                return recyclerViewOooo0;
            }
        }
        return null;
    }

    public static y71 Oooo0oo(View view) {
        if (view == null) {
            return null;
        }
        return ((j71) view.getLayoutParams()).OooO00o;
    }

    private nw0 getScrollingChildHelper() {
        if (this.o00o0O == null) {
            this.o00o0O = new nw0(this);
        }
        return this.o00o0O;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        o0O0O00 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        o000OOo = z;
    }

    public final void OooOO0(y71 y71Var) {
        View view = y71Var.OooO00o;
        boolean z = view.getParent() == this;
        this.OooO0o.OooOOO0(Oooo0oO(view));
        boolean zOooOO0o = y71Var.OooOO0o();
        xb xbVar = this.OooO;
        if (zOooOO0o) {
            xbVar.OooO0Oo(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            xbVar.OooO0O0(view, -1, true);
            return;
        }
        int iIndexOfChild = ((RecyclerView) ((xb1) xbVar.OooO0o).OooO0o0).indexOfChild(view);
        if (iIndexOfChild < 0) {
            sa.OooOO0o(view, "view is not a child, cannot hide ");
        } else {
            ((sc) xbVar.OooO0oO).OooO0oo(iIndexOfChild);
            xbVar.OooOOOO(view);
        }
    }

    public final void OooOO0O(g71 g71Var) {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null) {
            i71Var.OooO0OO("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.OooOOoo;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(g71Var);
        OoooO();
        requestLayout();
    }

    public final void OooOO0o(String str) {
        if (!OoooO0()) {
            if (this.Oooo0O0 > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(OooOooO()));
            }
        } else if (str == null) {
            qa.OooO0o("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(OooOooO()));
        } else {
            qa.OooO0o(str);
        }
    }

    public final void OooOOO() {
        xb xbVar = this.OooO;
        int iOooOOO = xbVar.OooOOO();
        for (int i = 0; i < iOooOOO; i++) {
            y71 y71VarOooo0oo = Oooo0oo(xbVar.OooOOO0(i));
            if (!y71VarOooo0oo.OooOOo0()) {
                y71VarOooo0oo.OooO0Oo = -1;
                y71VarOooo0oo.OooO0oO = -1;
            }
        }
        p71 p71Var = this.OooO0o;
        ArrayList arrayList = p71Var.OooO00o;
        ArrayList arrayList2 = p71Var.OooO0OO;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            y71 y71Var = (y71) arrayList2.get(i2);
            y71Var.OooO0Oo = -1;
            y71Var.OooO0oO = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            y71 y71Var2 = (y71) arrayList.get(i3);
            y71Var2.OooO0Oo = -1;
            y71Var2.OooO0oO = -1;
        }
        ArrayList arrayList3 = p71Var.OooO0O0;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                y71 y71Var3 = (y71) p71Var.OooO0O0.get(i4);
                y71Var3.OooO0Oo = -1;
                y71Var3.OooO0oO = -1;
            }
        }
    }

    public final void OooOOOO(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.Oooo0o0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.Oooo0o0.onRelease();
            zIsFinished = this.Oooo0o0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.Oooo0oO;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.Oooo0oO.onRelease();
            zIsFinished |= this.Oooo0oO.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Oooo0o;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.Oooo0o.onRelease();
            zIsFinished |= this.Oooo0o.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Oooo0oo;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.Oooo0oo.onRelease();
            zIsFinished |= this.Oooo0oo.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void OooOOo(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = nt1.OooO00o;
        setMeasuredDimension(i71.OooO0oO(i, paddingRight, getMinimumWidth()), i71.OooO0oO(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void OooOOo0() {
        if (!this.OooOo || this.Oooo00O) {
            Trace.beginSection("RV FullInvalidate");
            OooOo00();
            Trace.endSection();
            return;
        }
        oO0OOo0o oo0ooo0o = this.OooO0oo;
        if (oo0ooo0o.OooOO0O()) {
            int i = oo0ooo0o.OooO00o;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (oo0ooo0o.OooOO0O()) {
                    Trace.beginSection("RV FullInvalidate");
                    OooOo00();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            o00O0O();
            o000oOoO();
            oo0ooo0o.OooOOo();
            if (!this.OooOoO) {
                xb xbVar = this.OooO;
                int iOooOO0 = xbVar.OooOO0();
                int i2 = 0;
                while (true) {
                    if (i2 < iOooOO0) {
                        y71 y71VarOooo0oo = Oooo0oo(xbVar.OooO(i2));
                        if (y71VarOooo0oo != null && !y71VarOooo0oo.OooOOo0() && y71VarOooo0oo.OooOOO0()) {
                            OooOo00();
                            break;
                        }
                        i2++;
                    } else {
                        oo0ooo0o.OooO0Oo();
                        break;
                    }
                }
            }
            o00Ooo(true);
            OoooOOO(true);
            Trace.endSection();
        }
    }

    public final void OooOOoo(View view) {
        y71 y71VarOooo0oo = Oooo0oo(view);
        a71 a71Var = this.OooOOOo;
        if (a71Var != null && y71VarOooo0oo != null) {
            a71Var.OooOO0(y71VarOooo0oo);
        }
        ArrayList arrayList = this.Oooo000;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                vj0 vj0Var = (vj0) this.Oooo000.get(size);
                if (view == vj0Var.OooOoO) {
                    vj0Var.OooOoO = null;
                }
                y71 y71VarOooo0oO = vj0Var.OooOo0.Oooo0oO(view);
                if (y71VarOooo0oO != null) {
                    y71 y71Var = vj0Var.OooO0o;
                    if (y71Var == null || y71VarOooo0oO != y71Var) {
                        vj0Var.OooOO0(y71VarOooo0oO, false);
                        if (vj0Var.OooO0Oo.remove(y71VarOooo0oO.OooO00o)) {
                            vj0Var.OooOOOo.getClass();
                            o00Oo00.OooO0O0(y71VarOooo0oO);
                        }
                    } else {
                        vj0Var.OooOOOO(null, 0);
                    }
                }
            }
        }
    }

    public final void OooOo(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().OooO0Oo(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void OooOo0() {
        wt1 wt1Var;
        View viewOooo000;
        u71 u71Var = this.Oooooo0;
        u71Var.OooO00o(1);
        OooOooo(u71Var);
        u71Var.OooO = false;
        o00O0O();
        vr1 vr1Var = this.OooOO0;
        gh1 gh1Var = (gh1) vr1Var.OooO0o0;
        gh1 gh1Var2 = (gh1) vr1Var.OooO0o0;
        gh1Var.clear();
        gp0 gp0Var = (gp0) vr1Var.OooO0o;
        gp0Var.OooO00o();
        o000oOoO();
        OoooOoO();
        y71 y71VarOooo0oO = null;
        View focusedChild = (this.Ooooo0o && hasFocus() && this.OooOOOo != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewOooo000 = Oooo000(focusedChild)) != null) {
            y71VarOooo0oO = Oooo0oO(viewOooo000);
        }
        if (y71VarOooo0oO == null) {
            u71Var.OooOOO0 = -1L;
            u71Var.OooOO0o = -1;
            u71Var.OooOOO = -1;
        } else {
            u71Var.OooOOO0 = this.OooOOOo.OooO0O0 ? y71VarOooo0oO.OooO0o0 : -1L;
            u71Var.OooOO0o = this.Oooo00O ? -1 : y71VarOooo0oO.OooOO0() ? y71VarOooo0oO.OooO0Oo : y71VarOooo0oO.OooO0O0();
            View focusedChild2 = y71VarOooo0oO.OooO00o;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            u71Var.OooOOO = id;
        }
        u71Var.OooO0oo = u71Var.OooOO0 && this.o0OoOo0;
        this.o0OoOo0 = false;
        this.Ooooooo = false;
        u71Var.OooO0oO = u71Var.OooOO0O;
        u71Var.OooO0o0 = this.OooOOOo.OooO00o();
        Oooo00o(this.o00Ooo);
        boolean z = u71Var.OooOO0;
        xb xbVar = this.OooO;
        if (z) {
            int iOooOO0 = xbVar.OooOO0();
            for (int i = 0; i < iOooOO0; i++) {
                y71 y71VarOooo0oo = Oooo0oo(xbVar.OooO(i));
                if (!y71VarOooo0oo.OooOOo0() && (!y71VarOooo0oo.OooO0oo() || this.OooOOOo.OooO0O0)) {
                    f71 f71Var = this.Oooo;
                    f71.OooO0O0(y71VarOooo0oo);
                    y71VarOooo0oo.OooO0o0();
                    f71Var.getClass();
                    qw0 qw0Var = new qw0();
                    qw0Var.OooO00o(y71VarOooo0oo);
                    wt1 wt1VarOooO00o = (wt1) gh1Var2.get(y71VarOooo0oo);
                    if (wt1VarOooO00o == null) {
                        wt1VarOooO00o = wt1.OooO00o();
                        gh1Var2.put(y71VarOooo0oo, wt1VarOooO00o);
                    }
                    wt1VarOooO00o.OooO0O0 = qw0Var;
                    wt1VarOooO00o.OooO00o |= 4;
                    if (u71Var.OooO0oo && y71VarOooo0oo.OooOOO0() && !y71VarOooo0oo.OooOO0() && !y71VarOooo0oo.OooOOo0() && !y71VarOooo0oo.OooO0oo()) {
                        gp0Var.OooO0Oo(Oooo0o(y71VarOooo0oo), y71VarOooo0oo);
                    }
                }
            }
        }
        if (u71Var.OooOO0O) {
            int iOooOOO = xbVar.OooOOO();
            for (int i2 = 0; i2 < iOooOOO; i2++) {
                y71 y71VarOooo0oo2 = Oooo0oo(xbVar.OooOOO0(i2));
                if (o0O0O00 && y71VarOooo0oo2.OooO0OO == -1 && !y71VarOooo0oo2.OooOO0()) {
                    qa.OooO0o("view holder cannot have position -1 unless it is removed".concat(OooOooO()));
                    return;
                }
                if (!y71VarOooo0oo2.OooOOo0() && y71VarOooo0oo2.OooO0Oo == -1) {
                    y71VarOooo0oo2.OooO0Oo = y71VarOooo0oo2.OooO0OO;
                }
            }
            boolean z2 = u71Var.OooO0o;
            u71Var.OooO0o = false;
            this.OooOOo0.OooooOo(this.OooO0o, u71Var);
            u71Var.OooO0o = z2;
            for (int i3 = 0; i3 < xbVar.OooOO0(); i3++) {
                y71 y71VarOooo0oo3 = Oooo0oo(xbVar.OooO(i3));
                if (!y71VarOooo0oo3.OooOOo0() && ((wt1Var = (wt1) gh1Var2.get(y71VarOooo0oo3)) == null || (wt1Var.OooO00o & 4) == 0)) {
                    f71.OooO0O0(y71VarOooo0oo3);
                    boolean z3 = (y71VarOooo0oo3.OooOO0 & 8192) != 0;
                    f71 f71Var2 = this.Oooo;
                    y71VarOooo0oo3.OooO0o0();
                    f71Var2.getClass();
                    qw0 qw0Var2 = new qw0();
                    qw0Var2.OooO00o(y71VarOooo0oo3);
                    if (z3) {
                        Ooooo00(y71VarOooo0oo3, qw0Var2);
                    } else {
                        wt1 wt1VarOooO00o2 = (wt1) gh1Var2.get(y71VarOooo0oo3);
                        if (wt1VarOooO00o2 == null) {
                            wt1VarOooO00o2 = wt1.OooO00o();
                            gh1Var2.put(y71VarOooo0oo3, wt1VarOooO00o2);
                        }
                        wt1VarOooO00o2.OooO00o |= 2;
                        wt1VarOooO00o2.OooO0O0 = qw0Var2;
                    }
                }
            }
            OooOOO();
        } else {
            OooOOO();
        }
        OoooOOO(true);
        o00Ooo(false);
        u71Var.OooO0Oo = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0447  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOo00() {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooOo00():void");
    }

    public final void OooOo0O() {
        o00O0O();
        o000oOoO();
        u71 u71Var = this.Oooooo0;
        u71Var.OooO00o(6);
        this.OooO0oo.OooO0o0();
        u71Var.OooO0o0 = this.OooOOOo.OooO00o();
        u71Var.OooO0OO = 0;
        if (this.OooO0oO != null) {
            a71 a71Var = this.OooOOOo;
            int iOooOOoo = rj.OooOOoo(a71Var.OooO0OO);
            if (iOooOOoo == 1 ? a71Var.OooO00o() > 0 : iOooOOoo != 2) {
                Parcelable parcelable = this.OooO0oO.OooO0o;
                if (parcelable != null) {
                    this.OooOOo0.Oooooo(parcelable);
                }
                this.OooO0oO = null;
            }
        }
        u71Var.OooO0oO = false;
        this.OooOOo0.OooooOo(this.OooO0o, u71Var);
        u71Var.OooO0o = false;
        u71Var.OooOO0 = u71Var.OooOO0 && this.Oooo != null;
        u71Var.OooO0Oo = 4;
        OoooOOO(true);
        o00Ooo(false);
    }

    public final boolean OooOo0o(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().OooO0OO(i, i2, i3, iArr, iArr2);
    }

    public final void OooOoO() {
        if (this.Oooo0oo != null) {
            return;
        }
        ((v71) this.Oooo0OO).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Oooo0oo = edgeEffect;
        if (this.OooOO0O) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void OooOoO0(int i, int i2) {
        this.Oooo0O0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m71 m71Var = this.Oooooo;
        if (m71Var != null) {
            m71Var.OooO00o(this);
        }
        ArrayList arrayList = this.OoooooO;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((m71) this.OoooooO.get(size)).OooO00o(this);
            }
        }
        this.Oooo0O0--;
    }

    public final void OooOoOO() {
        if (this.Oooo0o0 != null) {
            return;
        }
        ((v71) this.Oooo0OO).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Oooo0o0 = edgeEffect;
        if (this.OooOO0O) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void OooOoo() {
        if (this.Oooo0o != null) {
            return;
        }
        ((v71) this.Oooo0OO).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Oooo0o = edgeEffect;
        if (this.OooOO0O) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void OooOoo0() {
        if (this.Oooo0oO != null) {
            return;
        }
        ((v71) this.Oooo0OO).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Oooo0oO = edgeEffect;
        if (this.OooOO0O) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final String OooOooO() {
        return " " + super.toString() + ", adapter:" + this.OooOOOo + ", layout:" + this.OooOOo0 + ", context:" + getContext();
    }

    public final void OooOooo(u71 u71Var) {
        if (getScrollState() != 2) {
            u71Var.getClass();
            return;
        }
        OverScroller overScroller = this.OooooO0.OooO0o;
        overScroller.getFinalX();
        overScroller.getCurrX();
        u71Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final Rect Oooo(View view) {
        j71 j71Var = (j71) view.getLayoutParams();
        boolean z = j71Var.OooO0OO;
        Rect rect = j71Var.OooO0O0;
        if (!z || (this.Oooooo0.OooO0oO && (j71Var.OooO00o.OooOOO0() || j71Var.OooO00o.OooO0oo()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.OooOOoo;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.OooOOO0;
            rect2.set(0, 0, 0, 0);
            ((g71) arrayList.get(i)).OooO0Oo(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        j71Var.OooO0OO = false;
        return rect;
    }

    public final View Oooo000(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean Oooo00O(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.OooOo00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l71 l71Var = (l71) arrayList.get(i);
            if (l71Var.OooO0O0(motionEvent) && action != 3) {
                this.OooOo0 = l71Var;
                return true;
            }
        }
        return false;
    }

    public final void Oooo00o(int[] iArr) {
        xb xbVar = this.OooO;
        int iOooOO0 = xbVar.OooOO0();
        if (iOooOO0 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iOooOO0; i3++) {
            y71 y71VarOooo0oo = Oooo0oo(xbVar.OooO(i3));
            if (!y71VarOooo0oo.OooOOo0()) {
                int iOooO0Oo = y71VarOooo0oo.OooO0Oo();
                if (iOooO0Oo < i) {
                    i = iOooO0Oo;
                }
                if (iOooO0Oo > i2) {
                    i2 = iOooO0Oo;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final y71 Oooo0O0(int i) {
        y71 y71Var = null;
        if (this.Oooo00O) {
            return null;
        }
        xb xbVar = this.OooO;
        int iOooOOO = xbVar.OooOOO();
        for (int i2 = 0; i2 < iOooOOO; i2++) {
            y71 y71VarOooo0oo = Oooo0oo(xbVar.OooOOO0(i2));
            if (y71VarOooo0oo != null && !y71VarOooo0oo.OooOO0() && Oooo0o0(y71VarOooo0oo) == i) {
                if (!((ArrayList) xbVar.OooO0oo).contains(y71VarOooo0oo.OooO00o)) {
                    return y71VarOooo0oo;
                }
                y71Var = y71VarOooo0oo;
            }
        }
        return y71Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Oooo0OO(int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Oooo0OO(int, int, int, int):boolean");
    }

    public final long Oooo0o(y71 y71Var) {
        return this.OooOOOo.OooO0O0 ? y71Var.OooO0o0 : y71Var.OooO0OO;
    }

    public final int Oooo0o0(y71 y71Var) {
        if ((y71Var.OooOO0 & 524) == 0 && y71Var.OooO0oO()) {
            int i = y71Var.OooO0OO;
            ArrayList arrayList = (ArrayList) this.OooO0oo.OooO0OO;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ooOOOOoo oooooooo = (ooOOOOoo) arrayList.get(i2);
                int i3 = oooooooo.OooO00o;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = oooooooo.OooO0O0;
                        if (i4 <= i) {
                            int i5 = oooooooo.OooO0Oo;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = oooooooo.OooO0O0;
                        if (i6 == i) {
                            i = oooooooo.OooO0Oo;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (oooooooo.OooO0Oo <= i) {
                                i++;
                            }
                        }
                    }
                } else if (oooooooo.OooO0O0 <= i) {
                    i += oooooooo.OooO0Oo;
                }
            }
            return i;
        }
        return -1;
    }

    public final y71 Oooo0oO(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return Oooo0oo(view);
        }
        ra.OooO0oo("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final void OoooO() {
        xb xbVar = this.OooO;
        int iOooOOO = xbVar.OooOOO();
        for (int i = 0; i < iOooOOO; i++) {
            ((j71) xbVar.OooOOO0(i).getLayoutParams()).OooO0OO = true;
        }
        ArrayList arrayList = this.OooO0o.OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            j71 j71Var = (j71) ((y71) arrayList.get(i2)).OooO00o.getLayoutParams();
            if (j71Var != null) {
                j71Var.OooO0OO = true;
            }
        }
    }

    public final boolean OoooO0() {
        return this.Oooo0 > 0;
    }

    public final boolean OoooO00() {
        return !this.OooOo || this.Oooo00O || this.OooO0oo.OooOO0O();
    }

    public final void OoooO0O(int i) {
        if (this.OooOOo0 == null) {
            return;
        }
        setScrollState(2);
        this.OooOOo0.oo000o(i);
        awakenScrollBars();
    }

    public final void OoooOO0(int i, int i2, boolean z) {
        int i3 = i + i2;
        xb xbVar = this.OooO;
        int iOooOOO = xbVar.OooOOO();
        for (int i4 = 0; i4 < iOooOOO; i4++) {
            y71 y71VarOooo0oo = Oooo0oo(xbVar.OooOOO0(i4));
            if (y71VarOooo0oo != null && !y71VarOooo0oo.OooOOo0()) {
                int i5 = y71VarOooo0oo.OooO0OO;
                u71 u71Var = this.Oooooo0;
                if (i5 >= i3) {
                    if (o000OOo) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + y71VarOooo0oo + " now at position " + (y71VarOooo0oo.OooO0OO - i2));
                    }
                    y71VarOooo0oo.OooOOO(-i2, z);
                    u71Var.OooO0o = true;
                } else if (i5 >= i) {
                    if (o000OOo) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + y71VarOooo0oo + " now REMOVED");
                    }
                    y71VarOooo0oo.OooO00o(8);
                    y71VarOooo0oo.OooOOO(-i2, z);
                    y71VarOooo0oo.OooO0OO = i - 1;
                    u71Var.OooO0o = true;
                }
            }
        }
        p71 p71Var = this.OooO0o;
        ArrayList arrayList = p71Var.OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y71 y71Var = (y71) arrayList.get(size);
            if (y71Var != null) {
                int i6 = y71Var.OooO0OO;
                if (i6 >= i3) {
                    if (o000OOo) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + y71Var + " now at position " + (y71Var.OooO0OO - i2));
                    }
                    y71Var.OooOOO(-i2, z);
                } else if (i6 >= i) {
                    y71Var.OooO00o(8);
                    p71Var.OooO0oo(size);
                }
            }
        }
        requestLayout();
    }

    public final void OoooOOO(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.Oooo0 - 1;
        this.Oooo0 = i2;
        if (i2 < 1) {
            if (o0O0O00 && i2 < 0) {
                qa.OooO0o("layout or scroll counter cannot go below zero.Some calls are not matching".concat(OooOooO()));
                return;
            }
            this.Oooo0 = 0;
            if (z) {
                int i3 = this.OooOoo;
                this.OooOoo = 0;
                if (i3 != 0 && (accessibilityManager = this.OooOooo) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.o00oO0O;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    y71 y71Var = (y71) arrayList.get(size);
                    if (y71Var.OooO00o.getParent() == this && !y71Var.OooOOo0() && (i = y71Var.OooOOo0) != -1) {
                        y71Var.OooO00o.setImportantForAccessibility(i);
                        y71Var.OooOOo0 = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void OoooOOo(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.OoooO0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.OoooO0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.o000oOoO = x;
            this.OoooO = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.OoooOOO = y;
            this.OoooOO0 = y;
        }
    }

    public final void OoooOo0() {
        if (this.o00O0O || !this.OooOo0O) {
            return;
        }
        WeakHashMap weakHashMap = nt1.OooO00o;
        postOnAnimation(this.o0ooOO0);
        this.o00O0O = true;
    }

    public final void OoooOoO() {
        boolean z;
        boolean z2 = this.Oooo00O;
        oO0OOo0o oo0ooo0o = this.OooO0oo;
        boolean z3 = false;
        if (z2) {
            oo0ooo0o.OooOOoo((ArrayList) oo0ooo0o.OooO0OO);
            oo0ooo0o.OooOOoo((ArrayList) oo0ooo0o.OooO0Oo);
            oo0ooo0o.OooO00o = 0;
            if (this.Oooo00o) {
                this.OooOOo0.Ooooo00();
            }
        }
        if (this.Oooo != null && this.OooOOo0.o000000()) {
            oo0ooo0o.OooOOo();
        } else {
            oo0ooo0o.OooO0o0();
        }
        boolean z4 = this.Ooooooo || this.o0OoOo0;
        boolean z5 = this.OooOo && this.Oooo != null && ((z = this.Oooo00O) || z4 || this.OooOOo0.OooO0o) && (!z || this.OooOOOo.OooO0O0);
        u71 u71Var = this.Oooooo0;
        u71Var.OooOO0 = z5;
        if (z5 && z4 && !this.Oooo00O && this.Oooo != null && this.OooOOo0.o000000()) {
            z3 = true;
        }
        u71Var.OooOO0O = z3;
    }

    public final void OoooOoo(boolean z) {
        this.Oooo00o = z | this.Oooo00o;
        this.Oooo00O = true;
        xb xbVar = this.OooO;
        int iOooOOO = xbVar.OooOOO();
        for (int i = 0; i < iOooOOO; i++) {
            y71 y71VarOooo0oo = Oooo0oo(xbVar.OooOOO0(i));
            if (y71VarOooo0oo != null && !y71VarOooo0oo.OooOOo0()) {
                y71VarOooo0oo.OooO00o(6);
            }
        }
        OoooO();
        p71 p71Var = this.OooO0o;
        ArrayList arrayList = p71Var.OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            y71 y71Var = (y71) arrayList.get(i2);
            if (y71Var != null) {
                y71Var.OooO00o(6);
                y71Var.OooO00o(1024);
            }
        }
        a71 a71Var = p71Var.OooO0oo.OooOOOo;
        if (a71Var == null || !a71Var.OooO0O0) {
            p71Var.OooO0oO();
        }
    }

    public final void Ooooo00(y71 y71Var, qw0 qw0Var) {
        y71Var.OooOO0 &= -8193;
        boolean z = this.Oooooo0.OooO0oo;
        vr1 vr1Var = this.OooOO0;
        if (z && y71Var.OooOOO0() && !y71Var.OooOO0() && !y71Var.OooOOo0()) {
            ((gp0) vr1Var.OooO0o).OooO0Oo(Oooo0o(y71Var), y71Var);
        }
        gh1 gh1Var = (gh1) vr1Var.OooO0o0;
        wt1 wt1VarOooO00o = (wt1) gh1Var.get(y71Var);
        if (wt1VarOooO00o == null) {
            wt1VarOooO00o = wt1.OooO00o();
            gh1Var.put(y71Var, wt1VarOooO00o);
        }
        wt1VarOooO00o.OooO0O0 = qw0Var;
        wt1VarOooO00o.OooO00o |= 4;
    }

    public final void Ooooo0o() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.Oooo0o0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.Oooo0o0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.Oooo0o;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.Oooo0o.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Oooo0oO;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.Oooo0oO.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Oooo0oo;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.Oooo0oo.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final int OooooO0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.Oooo0o0;
        float f2 = 0.0f;
        if (edgeEffect == null || qq2.OooO00o(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.Oooo0oO;
            if (edgeEffect2 != null && qq2.OooO00o(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.Oooo0oO;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fOooO0O0 = qq2.OooO0O0(edgeEffect3, width, height);
                    if (qq2.OooO00o(this.Oooo0oO) == 0.0f) {
                        this.Oooo0oO.onRelease();
                    }
                    f2 = fOooO0O0;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.Oooo0o0;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -qq2.OooO0O0(edgeEffect4, -width, 1.0f - height);
                if (qq2.OooO00o(this.Oooo0o0) == 0.0f) {
                    this.Oooo0o0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public final int OooooOO(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.Oooo0o;
        float f2 = 0.0f;
        if (edgeEffect == null || qq2.OooO00o(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.Oooo0oo;
            if (edgeEffect2 != null && qq2.OooO00o(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.Oooo0oo;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fOooO0O0 = qq2.OooO0O0(edgeEffect3, height, 1.0f - width);
                    if (qq2.OooO00o(this.Oooo0oo) == 0.0f) {
                        this.Oooo0oo.onRelease();
                    }
                    f2 = fOooO0O0;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.Oooo0o;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -qq2.OooO0O0(edgeEffect4, -height, width);
                if (qq2.OooO00o(this.Oooo0o) == 0.0f) {
                    this.Oooo0o.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void OooooOo(g71 g71Var) {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null) {
            i71Var.OooO0OO("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.OooOOoo;
        arrayList.remove(g71Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        OoooO();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Oooooo(int r19, int r20, int r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Oooooo(int, int, int, android.view.MotionEvent):boolean");
    }

    public final void Oooooo0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.OooOOO0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof j71) {
            j71 j71Var = (j71) layoutParams;
            if (!j71Var.OooO0OO) {
                Rect rect2 = j71Var.OooO0O0;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.OooOOo0.o00Ooo(this, view, this.OooOOO0, !this.OooOo, view2 == null);
    }

    public final void OoooooO(int[] iArr, int i, int i2) {
        y71 y71Var;
        o00O0O();
        o000oOoO();
        Trace.beginSection("RV Scroll");
        u71 u71Var = this.Oooooo0;
        OooOooo(u71Var);
        p71 p71Var = this.OooO0o;
        int iO00ooo = i != 0 ? this.OooOOo0.o00ooo(i, p71Var, u71Var) : 0;
        int iO00oO0o = i2 != 0 ? this.OooOOo0.o00oO0o(i2, p71Var, u71Var) : 0;
        Trace.endSection();
        xb xbVar = this.OooO;
        int iOooOO0 = xbVar.OooOO0();
        for (int i3 = 0; i3 < iOooOO0; i3++) {
            View viewOooO = xbVar.OooO(i3);
            y71 y71VarOooo0oO = Oooo0oO(viewOooO);
            if (y71VarOooo0oO != null && (y71Var = y71VarOooo0oO.OooO) != null) {
                View view = y71Var.OooO00o;
                int left = viewOooO.getLeft();
                int top = viewOooO.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        OoooOOO(true);
        o00Ooo(false);
        if (iArr != null) {
            iArr[0] = iO00ooo;
            iArr[1] = iO00oO0o;
        }
    }

    public final boolean Ooooooo(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fOooO00o = qq2.OooO00o(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.OooO0Oo * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = o000000O;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fOooO00o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null) {
            i71Var.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof j71) && this.OooOOo0.OooO0o((j71) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null && i71Var.OooO0Oo()) {
            return this.OooOOo0.OooOO0(this.Oooooo0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null && i71Var.OooO0Oo()) {
            return this.OooOOo0.OooOO0O(this.Oooooo0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null && i71Var.OooO0Oo()) {
            return this.OooOOo0.OooOO0o(this.Oooooo0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null && i71Var.OooO0o0()) {
            return this.OooOOo0.OooOOO0(this.Oooooo0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null && i71Var.OooO0o0()) {
            return this.OooOOo0.OooOOO(this.Oooooo0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null && i71Var.OooO0o0()) {
            return this.OooOOo0.OooOOOO(this.Oooooo0);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        i71 layoutManager = getLayoutManager();
        int iOooO00o = 0;
        if (layoutManager != null) {
            if (layoutManager.OooO0o0()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        o0OoOo0(0, measuredHeight, false);
                        return true;
                    }
                    o0OoOo0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zOooo0o = layoutManager.Oooo0o();
                    if (keyCode == 122) {
                        if (zOooo0o) {
                            iOooO00o = getAdapter().OooO00o();
                        }
                    } else if (!zOooo0o) {
                        iOooO00o = getAdapter().OooO00o();
                    }
                    ooOO(iOooO00o);
                    return true;
                }
            } else if (layoutManager.OooO0Oo()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        o0OoOo0(measuredWidth, 0, false);
                        return true;
                    }
                    o0OoOo0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zOooo0o2 = layoutManager.Oooo0o();
                    if (keyCode2 == 122) {
                        if (zOooo0o2) {
                            iOooO00o = getAdapter().OooO00o();
                        }
                    } else if (!zOooo0o2) {
                        iOooO00o = getAdapter().OooO00o();
                    }
                    ooOO(iOooO00o);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().OooO00o(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().OooO0O0(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().OooO0OO(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().OooO0Oo(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.OooOOoo;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((g71) arrayList.get(i)).OooO0o(canvas, this);
        }
        EdgeEffect edgeEffect = this.Oooo0o0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.OooOO0O ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.Oooo0o0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.Oooo0o;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.OooOO0O) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.Oooo0o;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.Oooo0oO;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.OooOO0O ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.Oooo0oO;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.Oooo0oo;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.OooOO0O) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.Oooo0oo;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.Oooo == null || arrayList.size() <= 0 || !this.Oooo.OooO0o()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null) {
            return i71Var.OooOOo();
        }
        qa.OooO0o("RecyclerView has no LayoutManager".concat(OooOooO()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null) {
            return i71Var.OooOOoo(getContext(), attributeSet);
        }
        qa.OooO0o("RecyclerView has no LayoutManager".concat(OooOooO()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public a71 getAdapter() {
        return this.OooOOOo;
    }

    @Override // android.view.View
    public int getBaseline() {
        i71 i71Var = this.OooOOo0;
        if (i71Var == null) {
            return super.getBaseline();
        }
        i71Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.OooOO0O;
    }

    public a81 getCompatAccessibilityDelegate() {
        return this.o00Oo0;
    }

    public e71 getEdgeEffectFactory() {
        return this.Oooo0OO;
    }

    public f71 getItemAnimator() {
        return this.Oooo;
    }

    public int getItemDecorationCount() {
        return this.OooOOoo.size();
    }

    public i71 getLayoutManager() {
        return this.OooOOo0;
    }

    public int getMaxFlingVelocity() {
        return this.OoooOoO;
    }

    public int getMinFlingVelocity() {
        return this.OoooOo0;
    }

    public long getNanoTime() {
        if (o00000) {
            return System.nanoTime();
        }
        return 0L;
    }

    public k71 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.Ooooo0o;
    }

    public o71 getRecycledViewPool() {
        return this.OooO0o.OooO0OO();
    }

    public int getScrollState() {
        return this.OoooO00;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().OooO0o(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.OooOo0O;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.OooOoOO;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().OooO0Oo;
    }

    public final void o000oOoO() {
        this.Oooo0++;
    }

    public final void o00O0O() {
        int i = this.OooOoO0 + 1;
        this.OooOoO0 = i;
        if (i != 1 || this.OooOoOO) {
            return;
        }
        this.OooOoO = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o00Oo0(int i) {
        boolean zOooO0Oo = this.OooOOo0.OooO0Oo();
        int i2 = (zOooO0Oo ? 1 : 0);
        if (this.OooOOo0.OooO0o0()) {
            i2 = (zOooO0Oo ? 1 : 0) | 2;
        }
        getScrollingChildHelper().OooO0oO(i2, i);
    }

    public final void o00Ooo(boolean z) {
        if (this.OooOoO0 < 1) {
            if (o0O0O00) {
                qa.OooO0o("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(OooOooO()));
                return;
            }
            this.OooOoO0 = 1;
        }
        if (!z && !this.OooOoOO) {
            this.OooOoO = false;
        }
        if (this.OooOoO0 == 1) {
            if (z && this.OooOoO && !this.OooOoOO && this.OooOOo0 != null && this.OooOOOo != null) {
                OooOo00();
            }
            if (!this.OooOoOO) {
                this.OooOoO = false;
            }
        }
        this.OooOoO0--;
    }

    public final void o00o0O(int i) {
        getScrollingChildHelper().OooO0oo(i);
    }

    public final void o00ooo() {
        um0 um0Var;
        setScrollState(0);
        x71 x71Var = this.OooooO0;
        x71Var.OooOO0.removeCallbacks(x71Var);
        x71Var.OooO0o.abortAnimation();
        i71 i71Var = this.OooOOo0;
        if (i71Var == null || (um0Var = i71Var.OooO0o0) == null) {
            return;
        }
        um0Var.OooO0oo();
    }

    public final void o0OoOo0(int i, int i2, boolean z) {
        i71 i71Var = this.OooOOo0;
        if (i71Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.OooOoOO) {
            return;
        }
        if (!i71Var.OooO0Oo()) {
            i = 0;
        }
        if (!this.OooOOo0.OooO0o0()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().OooO0oO(i3, 1);
        }
        this.OooooO0.OooO0OO(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.Oooo0 = r0
            r1 = 1
            r5.OooOo0O = r1
            boolean r2 = r5.OooOo
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.OooOo = r2
            com.cmaster.cloner.p71 r2 = r5.OooO0o
            r2.OooO0o0()
            com.cmaster.cloner.i71 r2 = r5.OooOOo0
            if (r2 == 0) goto L26
            r2.OooO0oO = r1
            r2.OoooO(r5)
        L26:
            r5.o00O0O = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.o00000
            if (r0 == 0) goto L7e
            java.lang.ThreadLocal r0 = com.cmaster.cloner.o40.OooO0oo
            java.lang.Object r1 = r0.get()
            com.cmaster.cloner.o40 r1 = (com.cmaster.cloner.o40) r1
            r5.OooooOO = r1
            if (r1 != 0) goto L66
            com.cmaster.cloner.o40 r1 = new com.cmaster.cloner.o40
            r1.<init>()
            r5.OooooOO = r1
            java.util.WeakHashMap r1 = com.cmaster.cloner.nt1.OooO00o
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L58
            if (r1 == 0) goto L58
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L58
            goto L5a
        L58:
            r1 = 1114636288(0x42700000, float:60.0)
        L5a:
            com.cmaster.cloner.o40 r2 = r5.OooooOO
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.OooO0o = r3
            r0.set(r2)
        L66:
            com.cmaster.cloner.o40 r0 = r5.OooooOO
            java.util.ArrayList r0 = r0.OooO0Oo
            boolean r1 = androidx.recyclerview.widget.RecyclerView.o0O0O00
            if (r1 == 0) goto L7b
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7b
        L75:
            java.lang.String r5 = "RecyclerView already present in worker list!"
            com.cmaster.cloner.qa.OooO0o(r5)
            return
        L7b:
            r0.add(r5)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        o40 o40Var;
        super.onDetachedFromWindow();
        f71 f71Var = this.Oooo;
        if (f71Var != null) {
            f71Var.OooO0o0();
        }
        o00ooo();
        int i = 0;
        this.OooOo0O = false;
        i71 i71Var = this.OooOOo0;
        if (i71Var != null) {
            i71Var.OooO0oO = false;
            i71Var.OoooOO0(this);
        }
        this.o00oO0O.clear();
        removeCallbacks(this.o0ooOO0);
        this.OooOO0.getClass();
        while (wt1.OooO0Oo.OooO0oo() != null) {
        }
        p71 p71Var = this.OooO0o;
        ArrayList arrayList = p71Var.OooO0OO;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            xx2.OooO00o(((y71) arrayList.get(i2)).OooO00o);
        }
        p71Var.OooO0o(p71Var.OooO0oo.OooOOOo, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            q31 q31Var = (q31) childAt.getTag(com.cmaster.cloner.R.id.pooling_container_listener_holder_tag);
            if (q31Var == null) {
                q31Var = new q31();
                childAt.setTag(com.cmaster.cloner.R.id.pooling_container_listener_holder_tag, q31Var);
            }
            ArrayList arrayList2 = q31Var.OooO00o;
            arrayList2.getClass();
            int size = arrayList2.size() - 1;
            if (-1 < size) {
                arrayList2.get(size).getClass();
                ra.OooOO0o();
                return;
            }
            i = i3;
        }
        if (!o00000 || (o40Var = this.OooooOO) == null) {
            return;
        }
        boolean zRemove = o40Var.OooO0Oo.remove(this);
        if (!o0O0O00 || zRemove) {
            this.OooooOO = null;
        } else {
            qa.OooO0o("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.OooOOoo;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((g71) arrayList.get(i)).OooO0o0(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f = 0.0f;
        float axisValue;
        int i;
        boolean z;
        if (this.OooOOo0 != null && !this.OooOoOO && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.OooOOo0.OooO0o0() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.OooOOo0.OooO0Oo() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.OooOOo0.OooO0o0()) {
                    float f2 = -axisValue;
                    axisValue = 0.0f;
                    f = f2;
                } else if (!this.OooOOo0.OooO0Oo()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.o0Oo0oo;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.Ooooo00);
            int i3 = (int) (axisValue * this.OoooOoo);
            if (z) {
                OverScroller overScroller = this.OooooO0.OooO0o;
                o0OoOo0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                i71 i71Var = this.OooOOo0;
                if (i71Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.OooOoOO) {
                    int[] iArr = this.o00oO0o;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zOooO0Oo = i71Var.OooO0Oo();
                    boolean zOooO0o0 = this.OooOOo0.OooO0o0();
                    int i4 = zOooO0o0 ? (zOooO0Oo ? 1 : 0) | 2 : zOooO0Oo ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iOooooO0 = i3 - OooooO0(i3, y);
                    int iOooooOO = i2 - OooooOO(i2, x);
                    getScrollingChildHelper().OooO0oO(i4, 1);
                    if (OooOo0o(zOooO0Oo ? iOooooO0 : 0, zOooO0o0 ? iOooooOO : 0, 1, this.o00oO0o, this.o00ooo)) {
                        iOooooO0 -= iArr[0];
                        iOooooOO -= iArr[1];
                    }
                    Oooooo(zOooO0Oo ? iOooooO0 : 0, zOooO0o0 ? iOooooOO : 0, 1, motionEvent);
                    o40 o40Var = this.OooooOO;
                    if (o40Var != null && (iOooooO0 != 0 || iOooooOO != 0)) {
                        o40Var.OooO00o(this, iOooooO0, iOooooOO);
                    }
                    o00o0O(1);
                }
            }
            if (i != 0 && !z) {
                this.oo0o0Oo.OooO00o(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.OooOoOO) {
            this.OooOo0 = null;
            if (Oooo00O(motionEvent)) {
                VelocityTracker velocityTracker = this.OoooO0O;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                o00o0O(0);
                Ooooo0o();
                setScrollState(0);
                return true;
            }
            i71 i71Var = this.OooOOo0;
            if (i71Var != null) {
                boolean zOooO0Oo = i71Var.OooO0Oo();
                boolean zOooO0o0 = this.OooOOo0.OooO0o0();
                if (this.OoooO0O == null) {
                    this.OoooO0O = VelocityTracker.obtain();
                }
                this.OoooO0O.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.OooOoo0) {
                        this.OooOoo0 = false;
                    }
                    this.OoooO0 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.o000oOoO = x;
                    this.OoooO = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.OoooOOO = y;
                    this.OoooOO0 = y;
                    EdgeEffect edgeEffect = this.Oooo0o0;
                    if (edgeEffect == null || qq2.OooO00o(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        qq2.OooO0O0(this.Oooo0o0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.Oooo0oO;
                    if (edgeEffect2 != null && qq2.OooO00o(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        qq2.OooO0O0(this.Oooo0oO, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.Oooo0o;
                    if (edgeEffect3 != null && qq2.OooO00o(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        qq2.OooO0O0(this.Oooo0o, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.Oooo0oo;
                    if (edgeEffect4 != null && qq2.OooO00o(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        qq2.OooO0O0(this.Oooo0oo, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.OoooO00 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        o00o0O(1);
                    }
                    int[] iArr = this.oo000o;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    o00Oo0(0);
                } else if (actionMasked == 1) {
                    this.OoooO0O.clear();
                    o00o0O(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.OoooO0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.OoooO0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.OoooO00 != 1) {
                        int i = x2 - this.OoooO;
                        int i2 = y2 - this.OoooOO0;
                        if (!zOooO0Oo || Math.abs(i) <= this.OoooOOo) {
                            z2 = false;
                        } else {
                            this.o000oOoO = x2;
                            z2 = true;
                        }
                        if (zOooO0o0 && Math.abs(i2) > this.OoooOOo) {
                            this.OoooOOO = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.OoooO0O;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    o00o0O(0);
                    Ooooo0o();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.OoooO0 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.o000oOoO = x3;
                    this.OoooO = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.OoooOOO = y3;
                    this.OoooOO0 = y3;
                } else if (actionMasked == 6) {
                    OoooOOo(motionEvent);
                }
                if (this.OoooO00 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        OooOo00();
        Trace.endSection();
        this.OooOo = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        i71 i71Var = this.OooOOo0;
        if (i71Var == null) {
            OooOOo(i, i2);
            return;
        }
        boolean zOooo0o0 = i71Var.Oooo0o0();
        boolean z = false;
        u71 u71Var = this.Oooooo0;
        if (zOooo0o0) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.OooOOo0.OooO0O0.OooOOo(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.o0ooOOo = z;
            if (z || this.OooOOOo == null) {
                return;
            }
            if (u71Var.OooO0Oo == 1) {
                OooOo0();
            }
            this.OooOOo0.o0ooOO0(i, i2);
            u71Var.OooO = true;
            OooOo0O();
            this.OooOOo0.o0ooOoO(i, i2);
            if (this.OooOOo0.o0OO00O()) {
                this.OooOOo0.o0ooOO0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                u71Var.OooO = true;
                OooOo0O();
                this.OooOOo0.o0ooOoO(i, i2);
            }
            this.o0ooOoO = getMeasuredWidth();
            this.o0OOO0o = getMeasuredHeight();
            return;
        }
        if (this.OooOo0o) {
            this.OooOOo0.OooO0O0.OooOOo(i, i2);
            return;
        }
        if (this.OooOooO) {
            o00O0O();
            o000oOoO();
            OoooOoO();
            OoooOOO(true);
            if (u71Var.OooOO0O) {
                u71Var.OooO0oO = true;
            } else {
                this.OooO0oo.OooO0o0();
                u71Var.OooO0oO = false;
            }
            this.OooOooO = false;
            o00Ooo(false);
        } else if (u71Var.OooOO0O) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        a71 a71Var = this.OooOOOo;
        if (a71Var != null) {
            u71Var.OooO0o0 = a71Var.OooO00o();
        } else {
            u71Var.OooO0o0 = 0;
        }
        o00O0O();
        this.OooOOo0.OooO0O0.OooOOo(i, i2);
        o00Ooo(false);
        u71Var.OooO0oO = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (OoooO0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r71)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r71 r71Var = (r71) parcelable;
        this.OooO0oO = r71Var;
        super.onRestoreInstanceState(r71Var.OooO0Oo);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        r71 r71Var = new r71(super.onSaveInstanceState());
        r71 r71Var2 = this.OooO0oO;
        if (r71Var2 != null) {
            r71Var.OooO0o = r71Var2.OooO0o;
            return r71Var;
        }
        i71 i71Var = this.OooOOo0;
        if (i71Var != null) {
            r71Var.OooO0o = i71Var.OoooooO();
            return r71Var;
        }
        r71Var.OooO0o = null;
        return r71Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.Oooo0oo = null;
        this.Oooo0o = null;
        this.Oooo0oO = null;
        this.Oooo0o0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010f A[PHI: r1
      0x010f: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void ooOO(int i) {
        if (this.OooOoOO) {
            return;
        }
        i71 i71Var = this.OooOOo0;
        if (i71Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            i71Var.o0O0O00(this, i);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        y71 y71VarOooo0oo = Oooo0oo(view);
        if (y71VarOooo0oo != null) {
            if (y71VarOooo0oo.OooOO0o()) {
                y71VarOooo0oo.OooOO0 &= -257;
            } else if (!y71VarOooo0oo.OooOOo0()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(y71VarOooo0oo);
                sa.OooO(sb, OooOooO());
                return;
            }
        } else if (o0O0O00) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sa.OooO(sb2, OooOooO());
            return;
        }
        view.clearAnimation();
        OooOOoo(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        um0 um0Var = this.OooOOo0.OooO0o0;
        if ((um0Var == null || !um0Var.OooO0o0) && !OoooO0() && view2 != null) {
            Oooooo0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.OooOOo0.o00Ooo(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.OooOo00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((l71) arrayList.get(i)).OooO0OO(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.OooOoO0 != 0 || this.OooOoOO) {
            this.OooOoO = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        i71 i71Var = this.OooOOo0;
        if (i71Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.OooOoOO) {
            return;
        }
        boolean zOooO0Oo = i71Var.OooO0Oo();
        boolean zOooO0o0 = this.OooOOo0.OooO0o0();
        if (zOooO0Oo || zOooO0o0) {
            if (!zOooO0Oo) {
                i = 0;
            }
            if (!zOooO0o0) {
                i2 = 0;
            }
            Oooooo(i, i2, 0, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!OoooO0()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.OooOoo |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(a81 a81Var) {
        this.o00Oo0 = a81Var;
        nt1.OooOOO0(this, a81Var);
    }

    public void setAdapter(a71 a71Var) {
        setLayoutFrozen(false);
        a71 a71Var2 = this.OooOOOo;
        bz bzVar = this.OooO0o0;
        if (a71Var2 != null) {
            a71Var2.OooO00o.unregisterObserver(bzVar);
            this.OooOOOo.OooO0oo();
        }
        f71 f71Var = this.Oooo;
        if (f71Var != null) {
            f71Var.OooO0o0();
        }
        i71 i71Var = this.OooOOo0;
        p71 p71Var = this.OooO0o;
        if (i71Var != null) {
            i71Var.ooOO(p71Var);
            this.OooOOo0.o00O0O(p71Var);
        }
        p71Var.OooO00o.clear();
        p71Var.OooO0oO();
        oO0OOo0o oo0ooo0o = this.OooO0oo;
        oo0ooo0o.OooOOoo((ArrayList) oo0ooo0o.OooO0OO);
        oo0ooo0o.OooOOoo((ArrayList) oo0ooo0o.OooO0Oo);
        oo0ooo0o.OooO00o = 0;
        a71 a71Var3 = this.OooOOOo;
        this.OooOOOo = a71Var;
        if (a71Var != null) {
            a71Var.OooO00o.registerObserver(bzVar);
            a71Var.OooO0Oo(this);
        }
        i71 i71Var2 = this.OooOOo0;
        if (i71Var2 != null) {
            i71Var2.OoooO0O(this.OooOOOo);
        }
        a71 a71Var4 = this.OooOOOo;
        p71Var.OooO00o.clear();
        p71Var.OooO0oO();
        p71Var.OooO0o(a71Var3, true);
        o71 o71VarOooO0OO = p71Var.OooO0OO();
        if (a71Var3 != null) {
            o71VarOooO0OO.OooO0O0--;
        }
        if (o71VarOooO0OO.OooO0O0 == 0) {
            SparseArray sparseArray = o71VarOooO0OO.OooO00o;
            for (int i = 0; i < sparseArray.size(); i++) {
                n71 n71Var = (n71) sparseArray.valueAt(i);
                ArrayList arrayList = n71Var.OooO00o;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    xx2.OooO00o(((y71) obj).OooO00o);
                }
                n71Var.OooO00o.clear();
            }
        }
        if (a71Var4 != null) {
            o71VarOooO0OO.OooO0O0++;
        }
        p71Var.OooO0o0();
        this.Oooooo0.OooO0o = true;
        OoooOoo(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(d71 d71Var) {
        if (d71Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.OooOO0O) {
            this.Oooo0oo = null;
            this.Oooo0o = null;
            this.Oooo0oO = null;
            this.Oooo0o0 = null;
        }
        this.OooOO0O = z;
        super.setClipToPadding(z);
        if (this.OooOo) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(e71 e71Var) {
        e71Var.getClass();
        this.Oooo0OO = e71Var;
        this.Oooo0oo = null;
        this.Oooo0o = null;
        this.Oooo0oO = null;
        this.Oooo0o0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.OooOo0o = z;
    }

    public void setItemAnimator(f71 f71Var) {
        f71 f71Var2 = this.Oooo;
        if (f71Var2 != null) {
            f71Var2.OooO0o0();
            this.Oooo.OooO00o = null;
        }
        this.Oooo = f71Var;
        if (f71Var != null) {
            f71Var.OooO00o = this.ooOO;
        }
    }

    public void setItemViewCacheSize(int i) {
        p71 p71Var = this.OooO0o;
        p71Var.OooO0o0 = i;
        p71Var.OooOOO();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(i71 i71Var) {
        RecyclerView recyclerView;
        if (i71Var == this.OooOOo0) {
            return;
        }
        o00ooo();
        i71 i71Var2 = this.OooOOo0;
        p71 p71Var = this.OooO0o;
        if (i71Var2 != null) {
            f71 f71Var = this.Oooo;
            if (f71Var != null) {
                f71Var.OooO0o0();
            }
            this.OooOOo0.ooOO(p71Var);
            this.OooOOo0.o00O0O(p71Var);
            p71Var.OooO00o.clear();
            p71Var.OooO0oO();
            if (this.OooOo0O) {
                i71 i71Var3 = this.OooOOo0;
                i71Var3.OooO0oO = false;
                i71Var3.OoooOO0(this);
            }
            this.OooOOo0.o0OOO0o(null);
            this.OooOOo0 = null;
        } else {
            p71Var.OooO00o.clear();
            p71Var.OooO0oO();
        }
        xb xbVar = this.OooO;
        ((sc) xbVar.OooO0oO).OooO0oO();
        ArrayList arrayList = (ArrayList) xbVar.OooO0oo;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((xb1) xbVar.OooO0o).OooO0o0;
            if (size < 0) {
                break;
            }
            y71 y71VarOooo0oo = Oooo0oo((View) arrayList.get(size));
            if (y71VarOooo0oo != null) {
                int i = y71VarOooo0oo.OooOOOo;
                if (recyclerView.OoooO0()) {
                    y71VarOooo0oo.OooOOo0 = i;
                    recyclerView.o00oO0O.add(y71VarOooo0oo);
                } else {
                    y71VarOooo0oo.OooO00o.setImportantForAccessibility(i);
                }
                y71VarOooo0oo.OooOOOo = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.OooOOoo(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.OooOOo0 = i71Var;
        if (i71Var != null) {
            if (i71Var.OooO0O0 != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(i71Var);
                qa.OooO0oo(sb, " is already attached to a RecyclerView:", i71Var.OooO0O0.OooOooO());
                return;
            } else {
                i71Var.o0OOO0o(this);
                if (this.OooOo0O) {
                    i71 i71Var4 = this.OooOOo0;
                    i71Var4.OooO0oO = true;
                    i71Var4.OoooO(this);
                }
            }
        }
        p71Var.OooOOO();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            ra.OooOOO("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        nw0 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.OooO0Oo) {
            ViewGroup viewGroup = scrollingChildHelper.OooO0OO;
            WeakHashMap weakHashMap = nt1.OooO00o;
            ft1.OooOO0o(viewGroup);
        }
        scrollingChildHelper.OooO0Oo = z;
    }

    public void setOnFlingListener(k71 k71Var) {
    }

    @Deprecated
    public void setOnScrollListener(m71 m71Var) {
        this.Oooooo = m71Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.Ooooo0o = z;
    }

    public void setRecycledViewPool(o71 o71Var) {
        p71 p71Var = this.OooO0o;
        RecyclerView recyclerView = p71Var.OooO0oo;
        p71Var.OooO0o(recyclerView.OooOOOo, false);
        if (p71Var.OooO0oO != null) {
            p71Var.OooO0oO.OooO0O0--;
        }
        p71Var.OooO0oO = o71Var;
        if (o71Var != null && recyclerView.getAdapter() != null) {
            p71Var.OooO0oO.OooO0O0++;
        }
        p71Var.OooO0o0();
    }

    @Deprecated
    public void setRecyclerListener(q71 q71Var) {
    }

    public void setScrollState(int i) {
        um0 um0Var;
        if (i == this.OoooO00) {
            return;
        }
        if (o000OOo) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.OoooO00, new Exception());
        }
        this.OoooO00 = i;
        if (i != 2) {
            x71 x71Var = this.OooooO0;
            x71Var.OooOO0.removeCallbacks(x71Var);
            x71Var.OooO0o.abortAnimation();
            i71 i71Var = this.OooOOo0;
            if (i71Var != null && (um0Var = i71Var.OooO0o0) != null) {
                um0Var.OooO0oo();
            }
        }
        i71 i71Var2 = this.OooOOo0;
        if (i71Var2 != null) {
            i71Var2.Ooooooo(i);
        }
        ArrayList arrayList = this.OoooooO;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((m71) this.OoooooO.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.OoooOOo = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.OoooOOo = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(w71 w71Var) {
        this.OooO0o.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().OooO0oO(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().OooO0oo(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.OooOoOO) {
            OooOO0o("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.OooOoOO = true;
                this.OooOoo0 = true;
                o00ooo();
                return;
            }
            this.OooOoOO = false;
            if (this.OooOoO && this.OooOOo0 != null && this.OooOOOo != null) {
                requestLayout();
            }
            this.OooOoO = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        i71 i71Var = this.OooOOo0;
        if (i71Var != null) {
            return i71Var.OooOo00(layoutParams);
        }
        qa.OooO0o("RecyclerView has no LayoutManager".concat(OooOooO()));
        return null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.cmaster.cloner.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
