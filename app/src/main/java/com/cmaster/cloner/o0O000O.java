package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Menu;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class o0O000O implements nc1, oc1 {
    public static final int[] OooO0oO;
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;

    public o0O000O(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 9:
                this.OooO0o0 = new HashMap();
                this.OooO0o = new SparseArray();
                break;
            case 13:
                this.OooO0o0 = new LinkedHashMap();
                break;
            case 19:
                this.OooO0o0 = new SparseIntArray();
                this.OooO0o = new SparseIntArray();
                break;
            default:
                this.OooO0o0 = new ComponentName(e92.OooO00o.getPackageName(), jx1.OooO0oO());
                this.OooO0o = new ComponentName(e92.OooO00o.getPackageName(), jx1.OooO0oo());
                o0O0o000 o0o0o000 = o0O0o000.OooO0oO;
                o0o0o000.OooO0Oo.add(new te1(0));
                te1 te1Var = new te1(4);
                CopyOnWriteArrayList copyOnWriteArrayList = o0o0o000.OooO0Oo;
                copyOnWriteArrayList.add(te1Var);
                copyOnWriteArrayList.add(new te1(2));
                cx1.OooO0o.execute(new oOOoOOO0(1));
                break;
        }
    }

    public static native boolean OooO0Oo(o0O00OOO o0o00ooo);

    public static native int Oooo00O(int i, int i2);

    public static native Intent Oooo00o(o0O00OOO o0o00ooo);

    public static native void OoooOOo(b51 b51Var, Intent intent, String str, IBinder iBinder, String str2, int i, Bundle bundle);

    public native void OooO(kz kzVar, int i);

    public native void OooO00o(Object obj, String str);

    public native int OooO0O0(Class cls, c2 c2Var);

    public native boolean OooO0OO();

    public native Bundle OooO0o(String str);

    public native void OooO0o0();

    @Override // com.cmaster.cloner.nc1
    public native mc1 OooO0oO(String str);

    public native rp1 OooO0oo(tt0 tt0Var);

    public native void OooOO0(boolean z);

    public native void OooOO0O(boolean z);

    public native void OooOO0o(boolean z);

    public native void OooOOO(boolean z);

    public native void OooOOO0(boolean z);

    public native void OooOOOO(boolean z);

    public native void OooOOOo(boolean z);

    public native void OooOOo(boolean z);

    public native void OooOOo0(boolean z);

    public native void OooOOoo(boolean z);

    public native void OooOo(String str, String str2, Exception exc);

    public native void OooOo0(boolean z);

    public native void OooOo00(boolean z);

    public native void OooOo0O(boolean z);

    public native void OooOo0o(boolean z);

    public native byte[] OooOoO();

    public native void OooOoO0(int i);

    public native CctBackendFactory OooOoOO(String str);

    public native int OooOoo(int i, Object obj);

    public native ArrayList OooOoo0(String str);

    public native Long OooOooO(String str);

    public native x91 OooOooo(Context context, com.bumptech.glide.OooO00o oooO00o, jm0 jm0Var, k20 k20Var, boolean z);

    public native void Oooo(int i, int i2);

    public native uq Oooo0(xp1 xp1Var);

    public native gd1 Oooo000();

    public native c2 Oooo0O0(int i);

    public native void Oooo0OO(String str);

    public native void Oooo0o();

    public native void Oooo0o0(f41 f41Var);

    public native void Oooo0oO(AttributeSet attributeSet, int i);

    public native void Oooo0oo();

    public native boolean OoooO(o00OO0O0 o00oo0o0, Menu menu);

    public native void OoooO0(i10 i10Var);

    public native void OoooO00(int i, int i2);

    public native void OoooO0O(o00OO0O0 o00oo0o0);

    public native void OoooOO0(w00 w00Var);

    public native void OoooOOO();

    public native Drawable OoooOo0(Drawable drawable, boolean z);

    public native void OoooOoO();

    public native String OoooOoo(String str);

    @Override // com.cmaster.cloner.oc1
    public native Object apply(Object obj);

    public native void o000oOoO(String str, gd1 gd1Var);

    public native String toString();

    static {
        DexUtils.classesInit0(36);
        OooO0oO = new int[]{android.R.attr.indeterminateDrawable, android.R.attr.progressDrawable};
    }

    public /* synthetic */ o0O000O(int i, boolean z) {
        this.OooO0Oo = i;
    }

    public /* synthetic */ o0O000O(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    public /* synthetic */ o0O000O(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
    }

    public /* synthetic */ o0O000O(Object obj) {
        this.OooO0Oo = 23;
        this.OooO0o = obj;
        this.OooO0o0 = new ArrayList();
    }

    public o0O000O(String str, m12 m12Var, iu iuVar) {
        this.OooO0Oo = 4;
        this.OooO0o = str;
        this.OooO0o0 = m12Var;
    }

    public o0O000O(String str, String str2) {
        this.OooO0Oo = 18;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.OooO0o0 = str;
            this.OooO0o = (str2 == null || str2.length() <= 0) ? null : str2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public o0O000O(WorkDatabase_Impl workDatabase_Impl, int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 24:
                this.OooO0o0 = workDatabase_Impl;
                this.OooO0o = new sp(workDatabase_Impl, 1);
                break;
            default:
                this.OooO0o0 = workDatabase_Impl;
                this.OooO0o = new sp(workDatabase_Impl, 0);
                break;
        }
    }

    public o0O000O(oOO0OO ooo0oo) {
        this.OooO0Oo = 20;
        this.OooO0o0 = new HashMap();
        this.OooO0o = ooo0oo;
    }

    public o0O000O(hx2 hx2Var) {
        this.OooO0Oo = 22;
        ho1 ho1Var = new ho1(hx2Var);
        this.OooO0o = new lu0();
        this.OooO0o0 = ho1Var;
    }

    public o0O000O(String str) {
        this.OooO0Oo = 16;
        this.OooO0o0 = str.concat(".lck");
    }

    public o0O000O(t62 t62Var) {
        this.OooO0Oo = 28;
        this.OooO0o0 = new AtomicInteger(10000);
        this.OooO0o = new f21(t62Var, this);
    }

    public o0O000O(wy0 wy0Var) {
        this.OooO0Oo = 10;
        this.OooO0o0 = new AtomicInteger(0);
        this.OooO0o = new AtomicBoolean(false);
    }

    public /* synthetic */ o0O000O(int i, Object obj, boolean z) {
        this.OooO0Oo = i;
        this.OooO0o = obj;
    }

    public o0O000O(k20 k20Var) {
        this.OooO0Oo = 17;
        this.OooO0o0 = new CopyOnWriteArrayList();
        this.OooO0o = k20Var;
    }

    public o0O000O(pb1 pb1Var, nc1 nc1Var) {
        this.OooO0Oo = 7;
        nc1Var.getClass();
        this.OooO0o = pb1Var;
        this.OooO0o0 = nc1Var;
    }

    public o0O000O(Context context) {
        this.OooO0Oo = 21;
        this.OooO0o = null;
        this.OooO0o0 = context;
    }

    public o0O000O(EditText editText) {
        this.OooO0Oo = 14;
        this.OooO0o0 = editText;
        hv hvVar = new hv(editText);
        this.OooO0o = hvVar;
        editText.addTextChangedListener(hvVar);
        if (vu.OooO0O0 == null) {
            synchronized (vu.OooO00o) {
                try {
                    if (vu.OooO0O0 == null) {
                        vu vuVar = new vu();
                        try {
                            vu.OooO0OO = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, vu.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        vu.OooO0O0 = vuVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(vu.OooO0O0);
    }

    public o0O000O(k kVar, ho1 ho1Var) {
        this.OooO0Oo = 5;
        this.OooO0o = kVar;
        this.OooO0o0 = ho1Var;
    }
}
