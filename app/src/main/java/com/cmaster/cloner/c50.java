package com.cmaster.cloner;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c50 implements Handler.Callback {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ c50(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.OooO0Oo) {
            case 0:
                d50 d50Var = (d50) this.OooO0o0;
                int i = message.what;
                if (i == 1) {
                    d50Var.OooO0O0((b50) message.obj);
                    return true;
                }
                if (i != 2) {
                    return false;
                }
                d50Var.OooO0Oo.OooOO0O((b50) message.obj);
                return false;
            case 1:
                synchronized (((t01) this.OooO0o0).OooOo0) {
                    try {
                        t01.o0000o0O((t01) this.OooO0o0);
                    } catch (s01 e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(e.getMessage());
                        Throwable cause = e;
                        while (true) {
                            cause = cause.getCause();
                            if (cause != null) {
                                sb.append(u7.OooO00o(new byte[]{-109, 24}, new byte[]{-87, 56, 63, 94, 94, -13, -77, -44}));
                                sb.append(cause.getMessage());
                            } else {
                                String string = sb.toString();
                                u7.OooO00o(new byte[]{-72, -122, -118, 45, -4, -77, -94, 1, -122, -108, -99, 39, -15, -72, -94, 58}, new byte[]{-24, -25, -23, 70, -99, -44, -57, 72});
                                u7.OooO00o(new byte[]{-61, -66, -94, 123, 68, -61, 65, 44, -26, -15, -68, 115, 94, -60, 8, 44, -18, -15}, new byte[]{-128, -47, -49, 22, 45, -73, 97, 67});
                                u7.OooO00o(new byte[]{25, 44, -79, -102, -78, 6, 24, -125, 25}, new byte[]{57, 74, -48, -13, -34, 99, 124, -71});
                                int i2 = fp0.OooO00o;
                                ((t01) this.OooO0o0).o00O00();
                                ((t01) this.OooO0o0).o00O00O(e.OooO0Oo, string);
                            }
                        }
                    }
                }
                return true;
            case 2:
                if (message.what != 0) {
                    return false;
                }
                ho1 ho1Var = (ho1) this.OooO0o0;
                uh1 uh1Var = (uh1) message.obj;
                synchronized (ho1Var.OooO0o0) {
                    if (((uh1) ho1Var.OooO0oO) == uh1Var || ((uh1) ho1Var.OooO0oo) == uh1Var) {
                        ho1Var.OooOOO(uh1Var, 2);
                    }
                }
                return true;
            default:
                int i3 = message.what;
                if (i3 == 0) {
                    synchronized (((b73) this.OooO0o0).OooO0Oo) {
                        try {
                            l23 l23Var = (l23) message.obj;
                            r33 r33Var = (r33) ((b73) this.OooO0o0).OooO0Oo.get(l23Var);
                            if (r33Var != null && r33Var.OooO0Oo.isEmpty()) {
                                if (r33Var.OooO0o) {
                                    r33Var.OooOO0.OooO0o.removeMessages(1, r33Var.OooO0oo);
                                    b73 b73Var = r33Var.OooOO0;
                                    b73Var.OooO0oO.Oooo0OO(b73Var.OooO0o0, r33Var);
                                    r33Var.OooO0o = false;
                                    r33Var.OooO0o0 = 2;
                                }
                                ((b73) this.OooO0o0).OooO0Oo.remove(l23Var);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i3 != 1) {
                        return false;
                    }
                    synchronized (((b73) this.OooO0o0).OooO0Oo) {
                        try {
                            l23 l23Var2 = (l23) message.obj;
                            r33 r33Var2 = (r33) ((b73) this.OooO0o0).OooO0Oo.get(l23Var2);
                            if (r33Var2 != null && r33Var2.OooO0o0 == 3) {
                                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(l23Var2)), new Exception());
                                ComponentName componentName = r33Var2.OooO;
                                if (componentName == null) {
                                    l23Var2.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = l23Var2.OooO0O0;
                                    by2.OooO0oo(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                r33Var2.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
