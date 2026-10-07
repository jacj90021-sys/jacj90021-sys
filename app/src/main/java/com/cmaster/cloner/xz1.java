package com.cmaster.cloner;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import java.lang.Thread;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xz1 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ String OooO0Oo;

    public xz1(String str) {
        this.OooO0Oo = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        e51 e51Var;
        String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : null;
        String str = this.OooO0Oo;
        Bundle bundle = new Bundle();
        bundle.putInt(qn2.OooO00o("Yz90\n", "AFIQK/8+Er8=\n"), 5);
        bundle.putString(qn2.OooO00o("4vd+MSLiimrIzE8QEJOUecrK\n", "h48KQ0PM2jg=\n"), processName);
        String strOooO00o = qn2.OooO00o("p2psXsrU\n", "whIYLKun+FQ=\n");
        Parcel parcelObtain = Parcel.obtain();
        try {
            xb1.Oooo0o0(parcelObtain, th, str.concat(" ") + th.getMessage() + qn2.OooO00o("B9VXldmNEo4a\n", "J6Ul+rroYf0=\n") + processName + qn2.OooO00o("bx8N6w==\n", "H3Zp1nVFnZE=\n") + Process.myPid() + qn2.OooO00o("J5gCCwQ=\n", "B+xrbzm+1dE=\n") + Process.myTid() + "\n", 60);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            bundle.putByteArray(strOooO00o, bArrMarshall);
            String strOooO00o2 = qn2.OooO00o("K5Czfc0Vscw8mqx9zRS/0S2N8DDBFf7cJZ6tJ8sK/twkkLA23FaW9g2z+hDCEbXRPA==\n", "SP/eU6540L8=\n");
            try {
                LinkedHashMap linkedHashMap = e51.OooO0Oo;
                synchronized (linkedHashMap) {
                    try {
                        e51Var = (e51) linkedHashMap.get(strOooO00o2);
                        if (e51Var == null) {
                            e51Var = new e51(a02.OooO.OooO00o, strOooO00o2);
                            linkedHashMap.put(strOooO00o2, e51Var);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                e51Var.OooO00o(bundle, qn2.OooO00o("NjYnmg==\n", "WFdK/9CMyNE=\n"));
            } catch (RemoteException unused) {
                Bundle bundle2 = Bundle.EMPTY;
            }
            System.exit(0);
        } catch (Throwable th3) {
            parcelObtain.recycle();
            throw th3;
        }
    }
}
