package com.cmaster.cloner;

import android.accounts.AccountManagerCallback;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.RemoteException;
import android.widget.Toast;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class oO000o00 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ oO000o00(Intent intent, ah0 ah0Var) {
        this.OooO0Oo = 4;
        this.OooO0o = intent;
        this.OooO0o0 = ah0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oo000000 oo000000Var;
        switch (this.OooO0Oo) {
            case 0:
                try {
                    pw1.o00O0000().OooO(null, (Intent) this.OooO0o, null, null, null, -1, null, ((oO00O0o0) this.OooO0o0).OooO00o);
                    return;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return;
                }
            case 1:
                oo000000Var = (oo000000) this.OooO0o0;
                try {
                    ((Runnable) this.OooO0o).run();
                    return;
                } finally {
                }
            case 2:
                g80 g80Var = (g80) this.OooO0o0;
                AtomicLong atomicLong = (AtomicLong) this.OooO0o;
                Toast.makeText(g80Var.OooO0oo(), "Cleared " + atomicLong + "MB", 0).show();
                return;
            case 3:
                g gVar = (g) this.OooO0o0;
                String str = (String) this.OooO0o;
                ox1 ox1Var = (ox1) gVar.OooO0O0;
                synchronized (ox1Var.OooOOOO) {
                    try {
                        c21 c21VarO00O00Oo = ox1Var.o00O00Oo(str);
                        if (c21VarO00O00Oo != null) {
                            t62 t62Var = ox1Var.OooOOOO;
                            fh0 fh0Var = c21VarO00O00Oo.OooOOoo;
                            t62Var.getClass();
                            if (t62.OooO(fh0Var)) {
                                pw1.o00O0000().o000Oo0o(-1, -1, c21VarO00O00Oo.OooO00o, u7.OooO00o(new byte[]{15, -118, 29, -100, 108, 64, -2, -18, 23, -109}, new byte[]{103, -29, 121, -8, 9, 46, -34, -113}));
                                if (c21VarO00O00Oo.OooO0o(true)) {
                                    ((f21) ox1Var.OooOO0O.OooO0o).OooO0oo(c21VarO00O00Oo);
                                    ka kaVarOooO0O0 = ka.OooO0O0();
                                    String strOooO00o = u7.OooO00o(new byte[]{-38, 113, 8, -98, -73, 46, -34, -66, -62, 104}, new byte[]{-78, 24, 108, -6, -46, 64, -2, -33});
                                    kaVarOooO0O0.getClass();
                                    ka.OooO0OO(str, strOooO00o);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 4:
                try {
                    pw1.o00O0000().OooO(null, (Intent) this.OooO0o, null, null, null, -1, null, ((ah0) this.OooO0o0).OooO00o);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            case 5:
                ((py2) this.OooO0o0).OooO0OO((Typeface) this.OooO0o);
                return;
            case 6:
                ud1 ud1Var = (ud1) this.OooO0o0;
                Runnable runnable = (Runnable) this.OooO0o;
                if (ud1Var.OooO0o0.get()) {
                    return;
                }
                runnable.run();
                return;
            case 7:
                ho0 ho0Var = (ho0) this.OooO0o0;
                Activity activity = (Activity) this.OooO0o;
                if (ho0Var.OooO00o == 2) {
                    ad1 ad1Var = ad1.OooO0OO;
                    try {
                        String packageName = activity.getPackageName();
                        int i = jx1.OooO00o;
                        Intent intent = new Intent(packageName + u7.OooO00o(new byte[]{81, 107, 15, 38, -120, -83, -81, -81, 58, 123, 15, 34, -109, -88, -70, -66}, new byte[]{127, 36, 90, 114, -41, -23, -18, -5}));
                        intent.setPackage(activity.getPackageName());
                        activity.startActivity(intent);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 8:
                Runnable runnable2 = (Runnable) this.OooO0o0;
                oo000000Var = (oo000000) this.OooO0o;
                try {
                    runnable2.run();
                    return;
                } finally {
                }
            default:
                ((AccountManagerCallback) this.OooO0o0).run((uv1) this.OooO0o);
                return;
        }
    }

    public /* synthetic */ oO000o00(g gVar, String str, boolean z) {
        this.OooO0Oo = 3;
        this.OooO0o0 = gVar;
        this.OooO0o = str;
    }

    public /* synthetic */ oO000o00(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
    }
}
