package com.cmaster.cloner;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e8 implements ia1 {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;

    public e8(Resources resources, ia1 ia1Var) {
        this.OooO00o = 0;
        this.OooO0OO = resources;
        this.OooO0O0 = ia1Var;
    }

    @Override // com.cmaster.cloner.ia1
    public final fa1 OooO00o(Object obj, int i, int i2, xz0 xz0Var) throws PackageManager.NameNotFoundException, NumberFormatException {
        boolean z;
        w61 w61Var;
        cx cxVar;
        switch (this.OooO00o) {
            case 0:
                fa1 fa1VarOooO00o = ((ia1) this.OooO0O0).OooO00o(obj, i, i2, xz0Var);
                Resources resources = (Resources) this.OooO0OO;
                if (fa1VarOooO00o == null) {
                    return null;
                }
                return new l8(resources, fa1VarOooO00o);
            case 1:
                fa1 fa1VarOooO0OO = ((ka1) this.OooO0O0).OooO0OO((Uri) obj, xz0Var);
                if (fa1VarOooO0OO == null) {
                    return null;
                }
                return ly0.OooO00o((k8) this.OooO0OO, (Drawable) ((y40) fa1VarOooO0OO).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof w61) {
                    w61Var = (w61) inputStream;
                    z = false;
                } else {
                    z = true;
                    w61Var = new w61(inputStream, (jp0) this.OooO0OO);
                }
                ArrayDeque arrayDeque = cx.OooO0o;
                synchronized (arrayDeque) {
                    cxVar = (cx) arrayDeque.poll();
                }
                if (cxVar == null) {
                    cxVar = new cx();
                }
                cx cxVar2 = cxVar;
                cxVar2.OooO0Oo = w61Var;
                yp0 yp0Var = new yp0(cxVar2);
                e81 e81Var = new e81(w61Var, cxVar2, 29);
                try {
                    us usVar = (us) this.OooO0O0;
                    l8 l8VarOooO00o = usVar.OooO00o(new hx2(yp0Var, usVar.OooO0Oo, usVar.OooO0OO), i, i2, xz0Var, e81Var);
                    cxVar2.OooO0o0 = null;
                    cxVar2.OooO0Oo = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(cxVar2);
                    }
                    if (z) {
                        w61Var.OooO0o();
                    }
                    return l8VarOooO00o;
                } catch (Throwable th) {
                    cxVar2.OooO0o0 = null;
                    cxVar2.OooO0Oo = null;
                    ArrayDeque arrayDeque2 = cx.OooO0o;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(cxVar2);
                        if (!z) {
                            throw th;
                        }
                        w61Var.OooO0o();
                        throw th;
                    }
                }
        }
    }

    @Override // com.cmaster.cloner.ia1
    public final boolean OooO0O0(Object obj, xz0 xz0Var) {
        switch (this.OooO00o) {
            case 0:
                return ((ia1) this.OooO0O0).OooO0O0(obj, xz0Var);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public /* synthetic */ e8(Object obj, Object obj2, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
    }
}
