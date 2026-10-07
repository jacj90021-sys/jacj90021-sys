package com.cmaster.cloner;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0OO000o extends Handler {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ o0OO00o0 OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0OO000o(o0OO00o0 o0oo00o0, Looper looper, int i) {
        super(looper);
        this.OooO00o = i;
        this.OooO0O0 = o0oo00o0;
    }

    public void OooO00o(Message message) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method declaredMethod;
        int i = message.what;
        o0OO00o0 o0oo00o0 = this.OooO0O0;
        if (i == 109) {
            rx1.OooO00o();
            Integer num = qx1.OooO00o;
            try {
                qx1.OooO0o0 = new lq(((rx1) rx1.OooO0o.OooO0O0()).OooO0o0.o000oOoO());
                Context context = e92.OooO00o;
                context.getPackageName();
                new File(context.getApplicationInfo().sourceDir).getParentFile().getCanonicalPath();
                context.getCacheDir().getParentFile().getCanonicalPath();
                String str = context.getApplicationInfo().deviceProtectedDataDir;
                pr2.OooO0O0(context.getExternalMediaDirs());
                pr2.OooO0O0(context.getObbDirs());
                pr2.OooO00o(context.getExternalFilesDirs(null));
                pr2.OooO00o(new File[]{Environment.getExternalStorageDirectory()});
            } catch (Throwable unused) {
            }
            qx1.OooO0oO = e92.OooO00o.getApplicationInfo();
            y7 y7Var = y7.OooO0o0;
            y7Var.OooO0O0();
            System.currentTimeMillis();
            for (x7 x7Var : y7Var.OooO00o.values()) {
                x7Var.getClass();
                try {
                    if (x7Var.OooO0o0 != null && !x7Var.OooO0O0) {
                        synchronized (x7Var) {
                            try {
                                if (!x7Var.OooO0O0) {
                                    x7Var.OooO0Oo();
                                    x7Var.OooO0oo();
                                    x7Var.OooO0O0 = true;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable unused2) {
                    u7.OooO00o(new byte[]{-38, 80, -114, 44, -58, -61, 85, 27, -42, 76, -106, 38, -41, -105, 9, 84, -63, 30}, new byte[]{-77, 62, -28, 73, -91, -73, 111, 59});
                    int i2 = fp0.OooO00o;
                }
            }
            int i3 = d02.OooO00o;
            try {
                declaredMethod = mu2.OooO00o;
                if (declaredMethod == null) {
                    Class<?> cls = Class.forName(u7.OooO00o(new byte[]{-79, 24, -36, -30, 74, -37, 9, 59, -65, 5, -106, -46, 76, -36, 9, 112, -94, 38, -54, -1, 93, -53}, new byte[]{-48, 118, -72, -112, 37, -78, 109, 21}));
                    String strOooO00o = u7.OooO00o(new byte[]{112, 93, -73, -9, 41, -33, 12, 63, 74, 78, -94, -16, 44, -37}, new byte[]{4, 47, -42, -103, 90, -66, 111, 75});
                    Class cls2 = Integer.TYPE;
                    declaredMethod = cls.getDeclaredMethod(strOooO00o, cls2, Parcel.class, Parcel.class, cls2);
                    mu2.OooO00o = declaredMethod;
                }
            } catch (Exception unused3) {
                declaredMethod = null;
            }
            PAM.LDCE(new Object[]{declaredMethod, null});
            o0OO00o0.OooOOo0.getClass();
            Binder binderOooO0OO = o0OO0oO0.OooO0OO();
            n2 n2Var = new n2();
            n2Var.attachInterface(n2Var, u7.OooO00o(new byte[]{-41, 59, 25, 9, -9, -68, -21, -24, -41, 37, 13, 85, -47, -108, -1, -74, -38, 60, 30, 26, -20, -68, -32, -88, -30, 61, 15, 30, -7, -79, -85, -74, -60, 58, 5, 2}, new byte[]{-74, 85, 125, 123, -104, -43, -113, -58}));
            n2Var.OooO0o0 = binderOooO0OO;
            n2Var.OooO0Oo = v2.OooOO0o;
            int i4 = d02.OooO00o;
            PAM.UBSR(binderOooO0OO, n2Var);
            ComponentName componentName = pi1.OooO00o;
            Context context2 = e92.OooO00o;
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setComponent(pi1.OooO00o);
            context2.startActivity(intent);
            o0oo00o0.OooO0O0();
            o0oo00o0.OooOOOo.open();
            return;
        }
        o0oo00o0.OooOOOo.block();
        int i5 = message.what;
        if (i5 == 108) {
            oo0oO0 oo0oo0 = (oo0oO0) message.obj;
            ArrayList arrayList = new ArrayList(oo0oo0.OooO00o.size());
            for (q81 q81Var : oo0oo0.OooO00o) {
                arrayList.add(p81.OooO00o.Oooo000(q81Var.OooO0o0, q81Var.OooO0Oo));
            }
            o00OO000 o00oo000 = o0OO00OO.OooO0O0;
            if (o00oo000 != null) {
                o00oo000.OooOooo(o0OO0oO0.OooO00o(), oo0oo0.OooO0O0, arrayList);
                return;
            }
            o00OO000 o00oo0002 = o0OO.OooO00o;
            if (o00oo0002 != null) {
                o00oo0002.OooOooo(o0OO0oO0.OooO00o(), oo0oo0.OooO0O0, arrayList, Boolean.TRUE);
                return;
            }
            o00OO000 o00oo0003 = o0OOO00.OooO0O0;
            if (o00oo0003 != null) {
                o00oo0003.OooOooo(o0OO0oO0.OooO00o(), ((Map) o0OO00OO.OooO00o.OooO0O0(o0OO0oO0.OooO00o())).get(oo0oo0.OooO0O0), arrayList);
                return;
            }
            o00OO000 o00oo0004 = o0OOO00.OooO00o;
            if (o00oo0004 != null) {
                o00oo0004.OooOooo(o0OO0oO0.OooO00o(), oo0oo0.OooO0O0, arrayList);
                return;
            }
            return;
        }
        if (i5 == 110) {
            o0OO00o0.OooO00o(this.OooO0O0, (p2) message.obj);
            return;
        }
        if (i5 == 121) {
            throw px0.OooOO0O(message.obj);
        }
        if (i5 == 122) {
            throw px0.OooOO0O(message.obj);
        }
        switch (i5) {
            case 114:
                o0OO00o0 o0oo00o02 = this.OooO0O0;
                o0OO000 o0oo000 = (o0OO000) message.obj;
                o0oo00o02.OooO00o.block(0L);
                Object obj = o0oo00o02.OooO0oo;
                try {
                    try {
                        o00OO000 o00oo0005 = ao0.OooO0OO;
                        if (o00oo0005 != null) {
                        }
                    } catch (Exception unused4) {
                        u7.OooO00o(new byte[]{77, 16, 87, -74, 73, -85, 73, 102, 119, 94, 95, -70, 86, -70, 8, 124, 108, 23, 87, -96, 64, -18, 26, 119, 106, 8, 95, -73, 64, -18}, new byte[]{24, 126, 54, -44, 37, -50, 105, 18});
                        o0oo000.getClass();
                        throw null;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                o0oo000.getClass();
                throw null;
            case 115:
                throw px0.OooOO0O(message.obj);
            case 116:
                o0OO00o0 o0oo00o03 = this.OooO0O0;
                IBinder iBinder = (IBinder) message.obj;
                Service service = (Service) o0oo00o03.OooO.remove(iBinder);
                if (service == null) {
                    u7.OooO00o(new byte[]{-51, -31, 22, -123, -24, 72, -40, 29, -54, -16, 43, -124, -10, 91, -30, 10, -64, -70, 88, -107, -21, 70, -18, 7, -104}, new byte[]{-91, -128, 120, -31, -124, 45, -117, 105});
                    Objects.toString(iBinder);
                    u7.OooO00o(new byte[]{-53, -110, 56, 54, 18, 76, 8, -68, -123, -104, 121}, new byte[]{-21, -4, 87, 66, 50, 42, 103, -55});
                    int i6 = fp0.OooO00o;
                    return;
                }
                try {
                    service.onDestroy();
                    lw1 lw1VarOooO0O0 = lw1.OooO0O0();
                    lw1VarOooO0O0.getClass();
                    try {
                        lw1VarOooO0O0.OooO00o.Oooo000(iBinder, 2, 0, 0);
                    } catch (Exception e2) {
                        lw1.OooO00o(e2);
                    }
                    return;
                } catch (Exception unused5) {
                    u7.OooO00o(new byte[]{-83, 30, -14, 46, -12, 81, 98, 85, -86, 15, -49, 47, -22, 66, 88, 66, -96, 69, -68, 47, -32, 87, 84, 81, -79, 22, -13, 36, -72, 82, 94, 83, -27}, new byte[]{-59, 127, -100, 74, -104, 52, 49, 33});
                    Objects.toString(iBinder);
                    int i7 = fp0.OooO00o;
                    return;
                }
            default:
                return;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.OooO00o) {
            case 0:
                try {
                    OooO00o(message);
                } catch (Exception unused) {
                }
                super.handleMessage(message);
                return;
            default:
                int i = message.what;
                if (i == 13) {
                    o0OO00o0 o0oo00o0 = this.OooO0O0;
                    oo0ooO oo0ooo = (oo0ooO) message.obj;
                    if (!o0oo00o0.OooO00o.block(1L)) {
                        u7.OooO00o(new byte[]{-65, 12, -59, -58, 84, 46, 85, -114, -84, 77, -51, -62, 4, 32, 85, -125, -87, 25, -59, -35, 26, 108, 90, -113, -70, 77, -50, -37, 26, 40, 28, -109, -83, 31, -38, -37, 23, 41, 28, -105, -70, 12, -36, -62, 17, 62}, new byte[]{-56, 109, -84, -78, 116, 76, 60, -32});
                        int i2 = fp0.OooO00o;
                        o0oo00o0.OooO00o.block(0L);
                    }
                    Integer num = qx1.OooO00o;
                    if (e92.OooO00o.bindService(oo0ooo.OooO0Oo, oo0ooo, 1)) {
                        synchronized (o0oo00o0.OooOO0) {
                            o0oo00o0.OooOO0.put(oo0ooo.OooO0o0.asBinder(), oo0ooo);
                        }
                    }
                } else if (i == 14) {
                    o0OO00o0 o0oo00o02 = this.OooO0O0;
                    oo0ooO oo0ooo2 = (oo0ooO) message.obj;
                    if (!o0oo00o02.OooO00o.block(1L)) {
                        u7.OooO00o(new byte[]{102, 51, -5, 37, 79, 20, 4, -72, 117, 114, -13, 33, 31, 26, 4, -75, 112, 38, -5, 62, 1, 86, 11, -71, 99, 114, -25, 63, 13, 31, 3, -78, 49, 33, -9, 35, 25, 31, 14, -77, 49, 37, -32, 48, 31, 6, 8, -92}, new byte[]{17, 82, -110, 81, 111, 118, 109, -42});
                        int i3 = fp0.OooO00o;
                        o0oo00o02.OooO0o.block(0L);
                    }
                    Integer num2 = qx1.OooO00o;
                    Context context = e92.OooO00o;
                    if (oo0ooo2 != null) {
                        context.unbindService(oo0ooo2);
                    }
                }
                super.handleMessage(message);
                return;
        }
    }
}
