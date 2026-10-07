package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.cmaster.cloner.R;
import com.cmaster.cloner.ay1;
import com.cmaster.cloner.dt1;
import com.cmaster.cloner.f61;
import com.cmaster.cloner.ft1;
import com.cmaster.cloner.gh1;
import com.cmaster.cloner.ho1;
import com.cmaster.cloner.kj;
import com.cmaster.cloner.lj;
import com.cmaster.cloner.mj;
import com.cmaster.cloner.nj;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.oj;
import com.cmaster.cloner.om;
import com.cmaster.cloner.ow0;
import com.cmaster.cloner.p12;
import com.cmaster.cloner.pj;
import com.cmaster.cloner.pw0;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.qw0;
import com.cmaster.cloner.qz1;
import com.cmaster.cloner.t31;
import com.cmaster.cloner.vt1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements ow0, pw0 {
    public static final Class[] OooOo;
    public static final String OooOo0o;
    public static final p12 OooOoO;
    public static final ThreadLocal OooOoO0;
    public static final t31 OooOoOO;
    public final int[] OooO;
    public final ArrayList OooO0Oo;
    public final ArrayList OooO0o;
    public final ho1 OooO0o0;
    public final ArrayList OooO0oO;
    public final int[] OooO0oo;
    public boolean OooOO0;
    public boolean OooOO0O;
    public final int[] OooOO0o;
    public View OooOOO;
    public View OooOOO0;
    public om OooOOOO;
    public boolean OooOOOo;
    public boolean OooOOo;
    public qz1 OooOOo0;
    public Drawable OooOOoo;
    public ay1 OooOo0;
    public ViewGroup.OnHierarchyChangeListener OooOo00;
    public final qw0 OooOo0O;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        OooOo0o = r0 != null ? r0.getName() : null;
        OooOoO = new p12(1);
        OooOo = new Class[]{Context.class, AttributeSet.class};
        OooOoO0 = new ThreadLocal();
        OooOoOO = new t31(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i);
        this.OooO0Oo = new ArrayList();
        this.OooO0o0 = new ho1(8);
        this.OooO0o = new ArrayList();
        this.OooO0oO = new ArrayList();
        this.OooO0oo = new int[2];
        this.OooO = new int[2];
        this.OooOo0O = new qw0();
        int[] iArr = f61.OooO00o;
        TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i == 0) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
            coordinatorLayout = this;
            context2 = context;
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.OooOO0o = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                coordinatorLayout.OooOO0o[i2] = (int) (r9[i2] * f);
            }
        }
        coordinatorLayout.OooOOoo = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.OooOoO0();
        super.setOnHierarchyChangeListener(new nj(coordinatorLayout));
        WeakHashMap weakHashMap = nt1.OooO00o;
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    public static Rect OooO0oO() {
        Rect rect = (Rect) OooOoOO.OooO0oo();
        return rect == null ? new Rect() : rect;
    }

    public static void OooOOO0(int i, Rect rect, Rect rect2, oj ojVar, int i2, int i3) {
        int i4 = ojVar.OooO0OO;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = ojVar.OooO0Oo;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static oj OooOOOO(View view) {
        oj ojVar = (oj) view.getLayoutParams();
        if (!ojVar.OooO0O0) {
            if (view instanceof kj) {
                lj behavior = ((kj) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                ojVar.OooO0O0(behavior);
                ojVar.OooO0O0 = true;
                return ojVar;
            }
            mj mjVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                mjVar = (mj) superclass.getAnnotation(mj.class);
                if (mjVar != null) {
                    break;
                }
            }
            if (mjVar != null) {
                try {
                    ojVar.OooO0O0((lj) mjVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + mjVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            ojVar.OooO0O0 = true;
        }
        return ojVar;
    }

    public static void OooOo(View view, int i) {
        oj ojVar = (oj) view.getLayoutParams();
        int i2 = ojVar.OooOO0;
        if (i2 != i) {
            WeakHashMap weakHashMap = nt1.OooO00o;
            view.offsetTopAndBottom(i - i2);
            ojVar.OooOO0 = i;
        }
    }

    public static void OooOo0o(View view, int i) {
        oj ojVar = (oj) view.getLayoutParams();
        int i2 = ojVar.OooO;
        if (i2 != i) {
            WeakHashMap weakHashMap = nt1.OooO00o;
            view.offsetLeftAndRight(i - i2);
            ojVar.OooO = i;
        }
    }

    public final void OooO(View view) {
        List list = (List) ((gh1) this.OooO0o0.OooO0o).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            lj ljVar = ((oj) view2.getLayoutParams()).OooO00o;
            if (ljVar != null) {
                ljVar.OooO0oo(this, view2, view);
            }
        }
    }

    @Override // com.cmaster.cloner.pw0
    public final void OooO00o(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        lj ljVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                oj ojVar = (oj) childAt.getLayoutParams();
                if (ojVar.OooO00o(i5) && (ljVar = ojVar.OooO00o) != null) {
                    int[] iArr2 = this.OooO0oo;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ljVar.OooOOOo(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            OooOOo0(1);
        }
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0O0(View view, int i, int i2, int i3, int i4, int i5) {
        OooO00o(view, i, i2, i3, i4, 0, this.OooO);
    }

    @Override // com.cmaster.cloner.ow0
    public final boolean OooO0OO(View view, View view2, int i, int i2) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z = false;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view3 = view;
                i3 = i;
                i4 = i2;
            } else {
                oj ojVar = (oj) childAt.getLayoutParams();
                lj ljVar = ojVar.OooO00o;
                if (ljVar != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    boolean zOooOo00 = ljVar.OooOo00(coordinatorLayout, childAt, view3, i3, i4);
                    z |= zOooOo00;
                    if (i4 == 0) {
                        ojVar.OooOOO0 = zOooOo00;
                    } else if (i4 == 1) {
                        ojVar.OooOOO = zOooOo00;
                    }
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    if (i4 == 0) {
                        ojVar.OooOOO0 = false;
                    } else if (i4 == 1) {
                        ojVar.OooOOO = false;
                    }
                }
            }
            i5++;
            this = coordinatorLayout;
            view = view3;
            i = i3;
            i2 = i4;
        }
        return z;
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0Oo(View view, View view2, int i, int i2) {
        qw0 qw0Var = this.OooOo0O;
        if (i2 == 1) {
            qw0Var.OooO0O0 = i;
        } else {
            qw0Var.OooO00o = i;
        }
        this.OooOOO = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((oj) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0o(View view, int i, int i2, int[] iArr, int i3) {
        lj ljVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                oj ojVar = (oj) childAt.getLayoutParams();
                if (ojVar.OooO00o(i3) && (ljVar = ojVar.OooO00o) != null) {
                    int[] iArr2 = this.OooO0oo;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ljVar.OooOOOO(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            OooOOo0(1);
        }
    }

    @Override // com.cmaster.cloner.ow0
    public final void OooO0o0(View view, int i) {
        qw0 qw0Var = this.OooOo0O;
        if (i == 1) {
            qw0Var.OooO0O0 = 0;
        } else {
            qw0Var.OooO00o = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            oj ojVar = (oj) childAt.getLayoutParams();
            if (ojVar.OooO00o(i)) {
                lj ljVar = ojVar.OooO00o;
                if (ljVar != null) {
                    ljVar.OooOo0(this, childAt, view, i);
                }
                if (i == 0) {
                    ojVar.OooOOO0 = false;
                } else if (i == 1) {
                    ojVar.OooOOO = false;
                }
                ojVar.OooOOOO = false;
            }
        }
        this.OooOOO = null;
    }

    public final void OooO0oo(oj ojVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ojVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) ojVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) ojVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) ojVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void OooOO0(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            OooOO0o(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList OooOO0O(View view) {
        gh1 gh1Var = (gh1) this.OooO0o0.OooO0o;
        int i = gh1Var.OooO0o;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) gh1Var.OooOO0(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(gh1Var.OooO0o(i2));
            }
        }
        ArrayList arrayList3 = this.OooO0oO;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void OooOO0o(View view, Rect rect) {
        ThreadLocal threadLocal = vt1.OooO00o;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = vt1.OooO00o;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        vt1.OooO00o(this, view, matrix);
        ThreadLocal threadLocal3 = vt1.OooO0O0;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int OooOOO(int i) {
        int[] iArr = this.OooOO0o;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean OooOOOo(View view, int i, int i2) {
        t31 t31Var = OooOoOO;
        Rect rectOooO0oO = OooO0oO();
        OooOO0o(view, rectOooO0oO);
        try {
            return rectOooO0oO.contains(i, i2);
        } finally {
            rectOooO0oO.setEmpty();
            t31Var.OooO0O0(rectOooO0oO);
        }
    }

    public final void OooOOo(View view, int i) {
        Rect rectOooO0oO;
        Rect rectOooO0oO2;
        oj ojVar = (oj) view.getLayoutParams();
        View view2 = ojVar.OooOO0O;
        if (view2 == null && ojVar.OooO0o != -1) {
            qa.OooO0o("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        t31 t31Var = OooOoOO;
        if (view2 != null) {
            rectOooO0oO = OooO0oO();
            rectOooO0oO2 = OooO0oO();
            try {
                OooOO0o(view2, rectOooO0oO);
                oj ojVar2 = (oj) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                OooOOO0(i, rectOooO0oO, rectOooO0oO2, ojVar2, measuredWidth, measuredHeight);
                OooO0oo(ojVar2, rectOooO0oO2, measuredWidth, measuredHeight);
                view.layout(rectOooO0oO2.left, rectOooO0oO2.top, rectOooO0oO2.right, rectOooO0oO2.bottom);
                return;
            } finally {
                rectOooO0oO.setEmpty();
                t31Var.OooO0O0(rectOooO0oO);
                rectOooO0oO2.setEmpty();
                t31Var.OooO0O0(rectOooO0oO2);
            }
        }
        int i2 = ojVar.OooO0o0;
        if (i2 < 0) {
            oj ojVar3 = (oj) view.getLayoutParams();
            rectOooO0oO = OooO0oO();
            rectOooO0oO.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ojVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) ojVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) ojVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) ojVar3).bottomMargin);
            if (this.OooOOo0 != null) {
                WeakHashMap weakHashMap = nt1.OooO00o;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectOooO0oO.left = this.OooOOo0.OooO0O0() + rectOooO0oO.left;
                    rectOooO0oO.top = this.OooOOo0.OooO0Oo() + rectOooO0oO.top;
                    rectOooO0oO.right -= this.OooOOo0.OooO0OO();
                    rectOooO0oO.bottom -= this.OooOOo0.OooO00o();
                }
            }
            rectOooO0oO2 = OooO0oO();
            int i3 = ojVar3.OooO0OO;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectOooO0oO, rectOooO0oO2, i);
            view.layout(rectOooO0oO2.left, rectOooO0oO2.top, rectOooO0oO2.right, rectOooO0oO2.bottom);
            return;
        }
        oj ojVar4 = (oj) view.getLayoutParams();
        int i4 = ojVar4.OooO0OO;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int iOooOOO = OooOOO(i2) - measuredWidth2;
        if (i5 == 1) {
            iOooOOO += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iOooOOO += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ojVar4).leftMargin, Math.min(iOooOOO, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) ojVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) ojVar4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) ojVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOo0(int r23) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.OooOOo0(int):void");
    }

    public final void OooOOoo(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOo0() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.OooOo0():void");
    }

    public final boolean OooOo00(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.OooO0o;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        p12 p12Var = OooOoO;
        if (p12Var != null) {
            Collections.sort(arrayList, p12Var);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zOooOO0O = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            lj ljVar = ((oj) view.getLayoutParams()).OooO00o;
            if (zOooOO0O && actionMasked != 0) {
                if (ljVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        ljVar.OooOO0O(this, view, motionEventObtain);
                    } else if (i == 1) {
                        ljVar.OooOo0O(this, view, motionEventObtain);
                    }
                }
            } else if (!zOooOO0O && ljVar != null) {
                if (i == 0) {
                    zOooOO0O = ljVar.OooOO0O(this, view, motionEvent);
                } else if (i == 1) {
                    zOooOO0O = ljVar.OooOo0O(this, view, motionEvent);
                }
                if (zOooOO0O) {
                    this.OooOOO0 = view;
                }
            }
        }
        arrayList.clear();
        return zOooOO0O;
    }

    public final void OooOo0O(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            lj ljVar = ((oj) childAt.getLayoutParams()).OooO00o;
            if (ljVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    ljVar.OooOO0O(this, childAt, motionEventObtain);
                } else {
                    ljVar.OooOo0O(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((oj) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.OooOOO0 = null;
        this.OooOO0 = false;
    }

    public final void OooOoO0() {
        WeakHashMap weakHashMap = nt1.OooO00o;
        if (!getFitsSystemWindows()) {
            ft1.OooOO0O(this, null);
            return;
        }
        if (this.OooOo0 == null) {
            this.OooOo0 = new ay1(this, 14);
        }
        ft1.OooOO0O(this, this.OooOo0);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof oj) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        lj ljVar = ((oj) view.getLayoutParams()).OooO00o;
        if (ljVar != null) {
            ljVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.OooOOoo;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new oj();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof oj ? new oj((oj) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new oj((ViewGroup.MarginLayoutParams) layoutParams) : new oj(layoutParams);
    }

    public final List<View> getDependencySortedChildren() throws Resources.NotFoundException {
        OooOo0();
        return Collections.unmodifiableList(this.OooO0Oo);
    }

    public final qz1 getLastWindowInsets() {
        return this.OooOOo0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        qw0 qw0Var = this.OooOo0O;
        return qw0Var.OooO0O0 | qw0Var.OooO00o;
    }

    public Drawable getStatusBarBackground() {
        return this.OooOOoo;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOo0O(false);
        if (this.OooOOOo) {
            if (this.OooOOOO == null) {
                this.OooOOOO = new om(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.OooOOOO);
        }
        if (this.OooOOo0 == null) {
            WeakHashMap weakHashMap = nt1.OooO00o;
            if (getFitsSystemWindows()) {
                dt1.OooO0OO(this);
            }
        }
        this.OooOO0O = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOo0O(false);
        if (this.OooOOOo && this.OooOOOO != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.OooOOOO);
        }
        View view = this.OooOOO;
        if (view != null) {
            OooO0o0(view, 0);
        }
        this.OooOO0O = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.OooOOo || this.OooOOoo == null) {
            return;
        }
        qz1 qz1Var = this.OooOOo0;
        int iOooO0Oo = qz1Var != null ? qz1Var.OooO0Oo() : 0;
        if (iOooO0Oo > 0) {
            this.OooOOoo.setBounds(0, 0, getWidth(), iOooO0Oo);
            this.OooOOoo.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            OooOo0O(true);
        }
        boolean zOooOo00 = OooOo00(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zOooOo00;
        }
        OooOo0O(true);
        return zOooOo00;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        lj ljVar;
        WeakHashMap weakHashMap = nt1.OooO00o;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.OooO0Oo;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((ljVar = ((oj) view.getLayoutParams()).OooO00o) == null || !ljVar.OooOO0o(this, view, layoutDirection))) {
                OooOOo(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r27, int r28) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                oj ojVar = (oj) childAt.getLayoutParams();
                if (ojVar.OooO00o(0)) {
                    lj ljVar = ojVar.OooO00o;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        lj ljVar;
        int childCount = getChildCount();
        boolean zOooOOO = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                oj ojVar = (oj) childAt.getLayoutParams();
                if (ojVar.OooO00o(0) && (ljVar = ojVar.OooO00o) != null) {
                    zOooOOO |= ljVar.OooOOO(view);
                }
            }
        }
        return zOooOOO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        OooO0o(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        OooO0O0(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        OooO0Oo(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof pj)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pj pjVar = (pj) parcelable;
        super.onRestoreInstanceState(pjVar.OooO0Oo);
        SparseArray sparseArray = pjVar.OooO0o;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            lj ljVar = OooOOOO(childAt).OooO00o;
            if (id != -1 && ljVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                ljVar.OooOOo(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOooOOoo;
        pj pjVar = new pj(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            lj ljVar = ((oj) childAt.getLayoutParams()).OooO00o;
            if (id != -1 && ljVar != null && (parcelableOooOOoo = ljVar.OooOOoo(childAt)) != null) {
                sparseArray.append(id, parcelableOooOOoo);
            }
        }
        pjVar.OooO0o = sparseArray;
        return pjVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return OooO0OO(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        OooO0o0(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.OooOOO0
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.OooOo00(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.OooOOO0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.cmaster.cloner.oj r6 = (com.cmaster.cloner.oj) r6
            com.cmaster.cloner.lj r6 = r6.OooO00o
            if (r6 == 0) goto L15
            android.view.View r7 = r0.OooOOO0
            boolean r6 = r6.OooOo0O(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.OooOOO0
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.OooOo0O(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        lj ljVar = ((oj) view.getLayoutParams()).OooO00o;
        if (ljVar == null || !ljVar.OooOOo0(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.OooOO0) {
            return;
        }
        OooOo0O(false);
        this.OooOO0 = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        OooOoO0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.OooOo00 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.OooOOoo;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.OooOOoo = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.OooOOoo.setState(getDrawableState());
                }
                Drawable drawable3 = this.OooOOoo;
                WeakHashMap weakHashMap = nt1.OooO00o;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.OooOOoo.setVisible(getVisibility() == 0, false);
                this.OooOOoo.setCallback(this);
            }
            WeakHashMap weakHashMap2 = nt1.OooO00o;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.OooOOoo;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.OooOOoo.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.OooOOoo;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new oj(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
