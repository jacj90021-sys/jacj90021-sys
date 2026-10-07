package com.cmaster.cloner;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class b30 implements p30 {
    public final /* synthetic */ int OooO0Oo;

    public /* synthetic */ b30(int i) {
        this.OooO0Oo = i;
    }

    @Override // com.cmaster.cloner.p30
    public final Object OooO00o() {
        Class<?> returnType;
        int i = this.OooO0Oo;
        vq1 vq1Var = vq1.OooO00o;
        switch (i) {
            case 0:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                try {
                    String[] strArr = c30.OooO0o0;
                    Method method = (Method) c30.OooO0o.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 2:
            case 3:
                return vq1Var;
            default:
                return Boolean.TRUE;
        }
    }
}
