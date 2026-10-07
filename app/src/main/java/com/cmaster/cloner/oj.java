package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oj extends ViewGroup.MarginLayoutParams {
    public int OooO;
    public lj OooO00o;
    public boolean OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public View OooOO0O;
    public View OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public final Rect OooOOOo;

    public oj(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet);
        this.OooO0O0 = false;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOOOo = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f61.OooO0O0);
        this.OooO0OO = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.OooO0o = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.OooO0Oo = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.OooO0o0 = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.OooO0oO = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.OooO0oo = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.OooO0O0 = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.OooOo0o;
            lj ljVar = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.OooOo0o;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.OooOoO0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.OooOo);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    ljVar = (lj) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    qa.OooO0oO("Could not inflate Behavior subclass ".concat(string), e);
                    throw null;
                }
            }
            this.OooO00o = ljVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        lj ljVar2 = this.OooO00o;
        if (ljVar2 != null) {
            ljVar2.OooO0oO(this);
        }
    }

    public final boolean OooO00o(int i) {
        if (i == 0) {
            return this.OooOOO0;
        }
        if (i != 1) {
            return false;
        }
        return this.OooOOO;
    }

    public final void OooO0O0(lj ljVar) {
        lj ljVar2 = this.OooO00o;
        if (ljVar2 != ljVar) {
            if (ljVar2 != null) {
                ljVar2.OooOO0();
            }
            this.OooO00o = ljVar;
            this.OooO0O0 = true;
            if (ljVar != null) {
                ljVar.OooO0oO(this);
            }
        }
    }

    public oj() {
        super(-2, -2);
        this.OooO0O0 = false;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOOOo = new Rect();
    }

    public oj(oj ojVar) {
        super((ViewGroup.MarginLayoutParams) ojVar);
        this.OooO0O0 = false;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOOOo = new Rect();
    }

    public oj(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.OooO0O0 = false;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOOOo = new Rect();
    }

    public oj(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.OooO0O0 = false;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOOOo = new Rect();
    }
}
