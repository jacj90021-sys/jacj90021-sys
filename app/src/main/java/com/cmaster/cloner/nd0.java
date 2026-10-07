package com.cmaster.cloner;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class nd0 implements jo1 {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public nd0(pd0 pd0Var, Object obj) {
        this.OooO00o = 0;
        this.OooO0O0 = obj;
    }

    @Override // com.cmaster.cloner.jo1
    public void OooO00o(yq yqVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        int iOooO00o;
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                Object[] objArr = yqVar.OooO0o;
                if (yn2.OooO0oO() && (iOooO00o = fn2.OooO00o(objArr, CompletableFuture.class, 2)) >= 0) {
                    ((CompletableFuture) objArr[iOooO00o]).complete(obj);
                }
                if (yqVar.OooO0o0.getReturnType() != m21.OooO00o) {
                    Object obj2 = null;
                    if (yqVar.OooO0o0.getReturnType() != oO0O00o0.OooO00o) {
                        if (yqVar.OooO0o0.getReturnType() != Void.TYPE) {
                            if (yqVar.OooO0o0.getReturnType() == Boolean.TYPE) {
                                Boolean bool = (Boolean) obj;
                                bool.booleanValue();
                                yqVar.OooO0oo(bool);
                                break;
                            }
                        } else {
                            yqVar.OooO0oo(null);
                            break;
                        }
                    } else {
                        xb1 xb1Var = oO0O00o0.OooO0O0;
                        if (xb1Var != null) {
                            try {
                                objNewInstance = ((Constructor) xb1Var.OooO0o0).newInstance(null);
                            } catch (Exception unused) {
                                objNewInstance = null;
                            }
                            try {
                                CompletableFuture completableFuture = (CompletableFuture) objNewInstance;
                                completableFuture.complete(obj);
                                obj2 = completableFuture;
                            } catch (Exception unused2) {
                            }
                        }
                        yqVar.OooO0oo(obj2);
                        break;
                    }
                } else {
                    yqVar.OooO0oo(pd0.OooOO0o());
                    break;
                }
                break;
            case 1:
                yqVar.OooO0oo(obj);
                break;
            default:
                yqVar.OooO00o();
                if (yqVar.OooO0O0()) {
                    yqVar.OooO0oo(obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nd0(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }
}
