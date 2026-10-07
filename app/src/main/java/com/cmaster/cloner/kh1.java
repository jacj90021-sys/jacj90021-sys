package com.cmaster.cloner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kh1 implements m91 {
    public static final boolean OooOooO = Log.isLoggable("GlideRequest", 2);
    public final Class OooO;
    public final String OooO00o;
    public final vi1 OooO0O0;
    public final Object OooO0OO;
    public final t91 OooO0Oo;
    public final Context OooO0o;
    public final r91 OooO0o0;
    public final j50 OooO0oO;
    public final Object OooO0oo;
    public final w6 OooOO0;
    public final int OooOO0O;
    public final int OooOO0o;
    public final sl1 OooOOO;
    public final t41 OooOOO0;
    public final List OooOOOO;
    public final im2 OooOOOo;
    public fa1 OooOOo;
    public final Executor OooOOo0;
    public a02 OooOOoo;
    public Drawable OooOo;
    public volatile kw OooOo0;
    public long OooOo00;
    public Drawable OooOo0O;
    public Drawable OooOo0o;
    public int OooOoO;
    public int OooOoO0;
    public boolean OooOoOO;
    public int OooOoo;
    public final RuntimeException OooOoo0;

    public kh1(Context context, j50 j50Var, Object obj, Object obj2, Class cls, w6 w6Var, int i, int i2, t41 t41Var, sl1 sl1Var, t91 t91Var, ArrayList arrayList, r91 r91Var, kw kwVar, im2 im2Var, Executor executor) {
        this.OooO00o = OooOooO ? String.valueOf(hashCode()) : null;
        this.OooO0O0 = new vi1();
        this.OooO0OO = obj;
        this.OooO0o = context;
        this.OooO0oO = j50Var;
        this.OooO0oo = obj2;
        this.OooO = cls;
        this.OooOO0 = w6Var;
        this.OooOO0O = i;
        this.OooOO0o = i2;
        this.OooOOO0 = t41Var;
        this.OooOOO = sl1Var;
        this.OooO0Oo = t91Var;
        this.OooOOOO = arrayList;
        this.OooO0o0 = r91Var;
        this.OooOo0 = kwVar;
        this.OooOOOo = im2Var;
        this.OooOOo0 = executor;
        this.OooOoo = 1;
        if (this.OooOoo0 == null && ((Map) j50Var.OooO0oo.OooO0o0).containsKey(i50.class)) {
            this.OooOoo0 = new RuntimeException("Glide request origin trace");
        }
    }

    public final void OooO(fa1 fa1Var, int i) {
        this.OooO0O0.OooO00o();
        fa1 fa1Var2 = null;
        try {
            synchronized (this.OooO0OO) {
                try {
                    this.OooOOoo = null;
                    if (fa1Var == null) {
                        OooO0oO(new n50("Expected to receive a Resource<R> with an object of " + this.OooO + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = fa1Var.get();
                    try {
                        if (obj == null || !this.OooO.isAssignableFrom(obj.getClass())) {
                            this.OooOOo = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.OooO);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(fa1Var);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            OooO0oO(new n50(sb.toString()), 5);
                        } else {
                            r91 r91Var = this.OooO0o0;
                            if (r91Var == null || r91Var.OooO0O0(this)) {
                                OooOO0o(fa1Var, obj, i);
                                return;
                            } else {
                                this.OooOOo = null;
                                this.OooOoo = 4;
                            }
                        }
                        this.OooOo0.getClass();
                        kw.OooO0o(fa1Var);
                    } catch (Throwable th) {
                        fa1Var2 = fa1Var;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (fa1Var2 != null) {
                this.OooOo0.getClass();
                kw.OooO0o(fa1Var2);
            }
            throw th3;
        }
    }

    @Override // com.cmaster.cloner.m91
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.OooO0OO) {
            z = this.OooOoo == 4;
        }
        return z;
    }

    public final void OooO0O0() {
        if (this.OooOoOO) {
            qa.OooO0o("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.OooO0O0.OooO00o();
        this.OooOOO.OooO0OO(this);
        a02 a02Var = this.OooOOoo;
        if (a02Var != null) {
            synchronized (((kw) a02Var.OooO0oO)) {
                ((ow) a02Var.OooO0o0).OooO0oO((kh1) a02Var.OooO0o);
            }
            this.OooOOoo = null;
        }
    }

    public final Drawable OooO0OO() {
        if (this.OooOo0o == null) {
            w6 w6Var = this.OooOO0;
            w6Var.getClass();
            this.OooOo0o = null;
            int i = w6Var.OooO0oO;
            if (i > 0) {
                w6Var.getClass();
                Context context = this.OooO0o;
                this.OooOo0o = kq2.OooO00o(context, context, i, context.getTheme());
            }
        }
        return this.OooOo0o;
    }

    @Override // com.cmaster.cloner.m91
    public final void OooO0Oo() {
        synchronized (this.OooO0OO) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.m91
    public final boolean OooO0o() {
        boolean z;
        synchronized (this.OooO0OO) {
            z = this.OooOoo == 6;
        }
        return z;
    }

    public final void OooO0o0(String str) {
        Log.v("GlideRequest", str + " this: " + this.OooO00o);
    }

    public final void OooO0oO(n50 n50Var, int i) {
        Drawable drawableOooO0OO;
        this.OooO0O0.OooO00o();
        synchronized (this.OooO0OO) {
            try {
                n50Var.getClass();
                int i2 = this.OooO0oO.OooO;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.OooO0oo + "] with dimensions [" + this.OooOoO0 + "x" + this.OooOoO + "]", n50Var);
                    if (i2 <= 4) {
                        n50Var.OooO0Oo();
                    }
                }
                this.OooOOoo = null;
                this.OooOoo = 5;
                r91 r91Var = this.OooO0o0;
                if (r91Var != null) {
                    r91Var.OooO(this);
                }
                boolean z = true;
                this.OooOoOO = true;
                try {
                    List<t91> list = this.OooOOOO;
                    if (list != null) {
                        for (t91 t91Var : list) {
                            r91 r91Var2 = this.OooO0o0;
                            if (r91Var2 != null) {
                                r91Var2.getRoot().OooO00o();
                            }
                            t91Var.OooOO0o(n50Var);
                        }
                    }
                    t91 t91Var2 = this.OooO0Oo;
                    if (t91Var2 != null) {
                        r91 r91Var3 = this.OooO0o0;
                        if (r91Var3 != null) {
                            r91Var3.getRoot().OooO00o();
                        }
                        t91Var2.OooOO0o(n50Var);
                    }
                    r91 r91Var4 = this.OooO0o0;
                    if (r91Var4 != null && !r91Var4.OooO0OO(this)) {
                        z = false;
                    }
                    if (z) {
                        if (this.OooO0oo == null) {
                            if (this.OooOo == null) {
                                this.OooOO0.getClass();
                                this.OooOo = null;
                            }
                            drawableOooO0OO = this.OooOo;
                        } else {
                            drawableOooO0OO = null;
                        }
                        if (drawableOooO0OO == null) {
                            if (this.OooOo0O == null) {
                                this.OooOO0.getClass();
                                this.OooOo0O = null;
                            }
                            drawableOooO0OO = this.OooOo0O;
                        }
                        if (drawableOooO0OO == null) {
                            drawableOooO0OO = OooO0OO();
                        }
                        this.OooOOO.OooO0Oo(drawableOooO0OO);
                    }
                } finally {
                    this.OooOoOO = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.m91
    public final void OooO0oo() {
        synchronized (this.OooO0OO) {
            try {
                if (this.OooOoOO) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.OooO0O0.OooO00o();
                int i = cp0.OooO0O0;
                this.OooOo00 = SystemClock.elapsedRealtimeNanos();
                if (this.OooO0oo == null) {
                    if (pr1.OooO(this.OooOO0O, this.OooOO0o)) {
                        this.OooOoO0 = this.OooOO0O;
                        this.OooOoO = this.OooOO0o;
                    }
                    if (this.OooOo == null) {
                        this.OooOO0.getClass();
                        this.OooOo = null;
                    }
                    OooO0oO(new n50("Received null model"), this.OooOo == null ? 5 : 3);
                    return;
                }
                int i2 = this.OooOoo;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    OooO(this.OooOOo, 5);
                    return;
                }
                List<t91> list = this.OooOOOO;
                if (list != null) {
                    for (t91 t91Var : list) {
                    }
                }
                this.OooOoo = 3;
                if (pr1.OooO(this.OooOO0O, this.OooOO0o)) {
                    OooOOO0(this.OooOO0O, this.OooOO0o);
                } else {
                    this.OooOOO.OooOO0(this);
                }
                int i3 = this.OooOoo;
                if (i3 == 2 || i3 == 3) {
                    r91 r91Var = this.OooO0o0;
                    if (r91Var == null || r91Var.OooO0OO(this)) {
                        this.OooOOO.OooO0o(OooO0OO());
                    }
                }
                if (OooOooO) {
                    OooO0o0("finished run method in " + cp0.OooO00o(this.OooOo00));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.m91
    public final boolean OooOO0() {
        boolean z;
        synchronized (this.OooO0OO) {
            z = this.OooOoo == 4;
        }
        return z;
    }

    @Override // com.cmaster.cloner.m91
    public final boolean OooOO0O(m91 m91Var) {
        int i;
        int i2;
        Object obj;
        Class cls;
        w6 w6Var;
        t41 t41Var;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        w6 w6Var2;
        t41 t41Var2;
        int size2;
        if (!(m91Var instanceof kh1)) {
            return false;
        }
        synchronized (this.OooO0OO) {
            try {
                i = this.OooOO0O;
                i2 = this.OooOO0o;
                obj = this.OooO0oo;
                cls = this.OooO;
                w6Var = this.OooOO0;
                t41Var = this.OooOOO0;
                List list = this.OooOOOO;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        kh1 kh1Var = (kh1) m91Var;
        synchronized (kh1Var.OooO0OO) {
            try {
                i3 = kh1Var.OooOO0O;
                i4 = kh1Var.OooOO0o;
                obj2 = kh1Var.OooO0oo;
                cls2 = kh1Var.OooO;
                w6Var2 = kh1Var.OooOO0;
                t41Var2 = kh1Var.OooOOO0;
                List list2 = kh1Var.OooOOOO;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = pr1.OooO00o;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
                if ((w6Var == null ? w6Var2 == null : w6Var.OooO0o(w6Var2)) && t41Var == t41Var2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void OooOO0o(fa1 fa1Var, Object obj, int i) {
        r91 r91Var = this.OooO0o0;
        if (r91Var != null) {
            r91Var.getRoot().OooO00o();
        }
        this.OooOoo = 4;
        this.OooOOo = fa1Var;
        if (this.OooO0oO.OooO <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + rj.OooOo00(i) + " for " + this.OooO0oo + " with size [" + this.OooOoO0 + "x" + this.OooOoO + "] in " + cp0.OooO00o(this.OooOo00) + " ms");
        }
        if (r91Var != null) {
            r91Var.OooO0oO(this);
        }
        this.OooOoOO = true;
        try {
            List list = this.OooOOOO;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((t91) it.next()).OooOOO0(obj);
                }
            }
            t91 t91Var = this.OooO0Oo;
            if (t91Var != null) {
                t91Var.OooOOO0(obj);
            }
            this.OooOOOo.getClass();
            this.OooOOO.OooO0O0(obj);
            this.OooOoOO = false;
        } catch (Throwable th) {
            this.OooOoOO = false;
            throw th;
        }
    }

    public final void OooOOO0(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.OooO0O0.OooO00o();
        Object obj2 = this.OooO0OO;
        synchronized (obj2) {
            try {
                try {
                    boolean z = OooOooO;
                    if (z) {
                        OooO0o0("Got onSizeReady in " + cp0.OooO00o(this.OooOo00));
                    }
                    if (this.OooOoo != 3) {
                        return;
                    }
                    this.OooOoo = 2;
                    this.OooOO0.getClass();
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * 1.0f);
                    }
                    this.OooOoO0 = iRound;
                    this.OooOoO = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                    if (z) {
                        OooO0o0("finished setup for calling load in " + cp0.OooO00o(this.OooOo00));
                    }
                    kw kwVar = this.OooOo0;
                    j50 j50Var = this.OooO0oO;
                    Object obj3 = this.OooO0oo;
                    w6 w6Var = this.OooOO0;
                    try {
                        try {
                            try {
                                try {
                                    this.OooOOoo = kwVar.OooO00o(j50Var, obj3, w6Var.OooOO0O, this.OooOoO0, this.OooOoO, w6Var.OooOOOO, this.OooO, this.OooOOO0, w6Var.OooO0o0, w6Var.OooOOO, w6Var.OooOO0o, w6Var.OooOOo, w6Var.OooOOO0, w6Var.OooO0oo, w6Var.OooOOoo, this, this.OooOOo0);
                                    if (this.OooOoo != 2) {
                                        this.OooOOoo = null;
                                    }
                                    if (z) {
                                        OooO0o0("finished onSizeReady in " + cp0.OooO00o(this.OooOo00));
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    obj = obj2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
    }

    @Override // com.cmaster.cloner.m91
    public final void clear() {
        synchronized (this.OooO0OO) {
            try {
                if (this.OooOoOO) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.OooO0O0.OooO00o();
                if (this.OooOoo == 6) {
                    return;
                }
                OooO0O0();
                fa1 fa1Var = this.OooOOo;
                if (fa1Var != null) {
                    this.OooOOo = null;
                } else {
                    fa1Var = null;
                }
                r91 r91Var = this.OooO0o0;
                if (r91Var == null || r91Var.OooO0o0(this)) {
                    this.OooOOO.OooO0oo(OooO0OO());
                }
                this.OooOoo = 6;
                if (fa1Var != null) {
                    this.OooOo0.getClass();
                    kw.OooO0o(fa1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.m91
    public final boolean isRunning() {
        boolean z;
        synchronized (this.OooO0OO) {
            int i = this.OooOoo;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.OooO0OO) {
            obj = this.OooO0oo;
            cls = this.OooO;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
