package com.cmaster.cloner;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0 {
    public static final int OooO;
    public static final o0 OooO0oO = new o0();
    public static final int OooO0oo;
    public volatile IBinder OooO0Oo;
    public final ConditionVariable OooO00o = new ConditionVariable();
    public final MessageQueue OooO0O0 = Looper.getMainLooper().getQueue();
    public final Handler OooO0OO = (Handler) o0OO0oO0.OooO00o.OooO0O0(o0OO0oO0.OooO00o());
    public final ThreadLocal OooO0o0 = new ThreadLocal();
    public final WeakHashMap OooO0o = new WeakHashMap();

    static {
        m81 m81Var = o0OO0o00.OooO0O0;
        OooO0oo = m81Var != null ? m81Var.OooO00o() : 0;
        m81 m81Var2 = o0OO0o00.OooO00o;
        OooO = m81Var2 != null ? m81Var2.OooO00o() : 0;
    }

    public o0() {
        new ConcurrentHashMap();
    }

    public static void OooO0O0(IBinder iBinder) {
        Object objOooO00o = o0OO0oO0.OooO00o();
        l81 l81Var = o0OO0oO0.OooOOo0;
        if (l81Var != null) {
            ((AtomicInteger) l81Var.OooO0O0(objOooO00o)).decrementAndGet();
        }
        l81 l81Var2 = o0OO0oO0.OooOOo;
        if (l81Var2 != null) {
            ((Map) l81Var2.OooO0O0(objOooO00o)).remove(iBinder);
        }
    }

    public final void OooO00o(IBinder iBinder, Intent intent) {
        synchronized (this.OooO0o) {
            this.OooO0o.put(iBinder, intent);
        }
    }

    public final void OooO0OO() {
        ThreadLocal threadLocal = this.OooO0o0;
        IBinder iBinder = (IBinder) threadLocal.get();
        if (iBinder != null) {
            threadLocal.remove();
            lw1 lw1VarOooO0O0 = lw1.OooO0O0();
            lw1VarOooO0O0.getClass();
            try {
                lw1VarOooO0O0.OooO00o.OooOo(iBinder);
            } catch (Exception e) {
                lw1.OooO00o(e);
            }
        }
    }

    public final Intent OooO0Oo(IBinder iBinder) {
        Intent intent;
        synchronized (this.OooO0o) {
            intent = (Intent) this.OooO0o.get(iBinder);
        }
        return intent;
    }

    public final boolean OooO0o(Object obj) {
        l81 l81Var;
        l81 l81Var2 = de.OooO0OO;
        List list = l81Var2 != null ? (List) l81Var2.OooO0O0(obj) : null;
        if (list == null && (l81Var = de.OooO0O0) != null) {
            list = (List) l81Var.OooO0O0(obj);
        }
        try {
            if (!fn2.OooO0Oo(list)) {
                l81 l81Var3 = de.OooO00o;
                IBinder iBinder = l81Var3 != null ? (IBinder) l81Var3.OooO0O0(obj) : null;
                boolean z = iBinder == null;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (z) {
                        if (next != null) {
                            o00OO000 o00oo000 = fe.OooO00o;
                            if (o00oo000 != null) {
                                iBinder = (IBinder) o00oo000.OooOooo(next, new Object[0]);
                            }
                        } else {
                            o00OO000 o00oo0002 = fe.OooO00o;
                        }
                        iBinder = null;
                    }
                    if (OooO0Oo(iBinder) != null) {
                        it.remove();
                    } else {
                        if (fl0.OooO00o.isInstance(next)) {
                            OooO0oO(iBinder, next);
                        }
                        if (OooO0Oo(iBinder) != null) {
                            it.remove();
                        }
                    }
                }
                if (OooO0Oo(iBinder) != null) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            u7.OooO00o(new byte[]{65, -85}, new byte[]{0, -26, -76, -111, -10, 41, 49, -17});
            u7.OooO00o(new byte[]{-63, 61, 42, 14, -20, -120, 6, -96, -58, 55, 38, 51, -15, -121, 72, -74, -43, 38, 61, 40, -66}, new byte[]{-89, 84, 82, 90, -98, -23, 104, -45});
            int i = fp0.OooO00o;
            return false;
        }
    }

    public final boolean OooO0o0(Object obj) throws IllegalAccessException, IllegalArgumentException {
        Intent intent;
        ho1 ho1VarOooo0O0;
        ho1 ho1VarOooo0O02;
        int iOooO0O0;
        IBinder iBinder = (IBinder) o0OO0.OooO0o.OooO0O0(obj);
        if (OooO0Oo(iBinder) == null) {
            l81 l81Var = o0OO0.OooO0o0;
            Intent intent2 = (Intent) l81Var.OooO0O0(obj);
            l81 l81Var2 = o0OO0.OooO0OO;
            boolean zOooOO0 = jx1.OooOO0(intent2);
            if (this.OooO0Oo != null && zOooOO0 && (ho1VarOooo0O02 = ho1.Oooo0O0(intent2)) != null && Objects.equals((IBinder) ho1VarOooo0O02.OooO0o, this.OooO0Oo) && (iOooO0O0 = o0O00O0o.OooO0O0(iBinder)) != -1 && lw1.OooO0O0().OooO0oO((IBinder) ho1VarOooo0O02.OooO0o0, iBinder, iOooO0O0)) {
                l81Var.OooO0oo(obj, (Intent) ho1VarOooo0O02.OooO0oO);
                l81Var2.OooO0oo(obj, (ActivityInfo) ho1VarOooo0O02.OooO0oo);
                l81 l81Var3 = o0OO0.OooO0Oo;
                if (l81Var3 != null) {
                    l81Var3.OooO0oo(obj, ((ActivityInfo) ho1VarOooo0O02.OooO0oo).packageName);
                }
                this.OooO0o0.set((IBinder) ho1VarOooo0O02.OooO0o0);
                return false;
            }
            boolean zOooO = jx1.OooO(intent2);
            if (zOooOO0 || zOooO) {
                OooO00o(iBinder, intent2);
                OooO0O0(iBinder);
            }
            if (zOooO) {
                Parcelable parcelableExtra = intent2.getParcelableExtra(u7.OooO00o(new byte[]{127, -29, -44, 56, 14, 87, 96, -94, 119, -29, -60, 47, 15, 74, 42, -23, 102, -7, -62, 43, 79, 119, 74, -40, 91, -61, -28}, new byte[]{30, -115, -80, 74, 97, 62, 4, -116}));
                if (this.OooO0Oo != null && (parcelableExtra instanceof Intent) && (ho1VarOooo0O0 = ho1.Oooo0O0((intent = (Intent) parcelableExtra))) != null && Objects.equals((IBinder) ho1VarOooo0O0.OooO0o, this.OooO0Oo)) {
                    intent.addFlags(33554432);
                    o0O000 o0o000OooO0OO = o0O000.OooO0OO(intent, null, iBinder, null, -1, null);
                    pi1.OooO00o(o0o000OooO0OO);
                    o0o000OooO0OO.OooO0Oo = null;
                    o0o000OooO0OO.OooO0o = null;
                    o0o000OooO0OO.OooOO0 = null;
                    o0o000OooO0OO.OooOO0O = null;
                }
            }
            if (OooO0Oo(iBinder) != null) {
                o0O00O0o.OooO00o(iBinder, -1, null);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oO(android.os.IBinder r13, java.lang.Object r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.o0.OooO0oO(android.os.IBinder, java.lang.Object):void");
    }

    public final void OooO0oo(IBinder iBinder) {
        this.OooO0Oo = iBinder;
        int i = yn2.OooO0OO() ? OooO0oo : OooO;
        Message messageObtain = Message.obtain();
        Object obj = new Object();
        messageObtain.obj = obj;
        u7.OooO00o(new byte[]{-122, -78}, new byte[]{-57, -1, -32, 25, -17, -95, 38, 42});
        u7.OooO00o(new byte[]{120, 77, -69, -5, 2, -4, 127, -55, 121, 65, -110, -61, 2, -6, 105, -110, 62}, new byte[]{30, 36, -61, -74, 103, -113, 12, -88});
        int i2 = fp0.OooO00o;
        this.OooO0OO.sendMessage(messageObtain);
        synchronized (this.OooO0O0) {
            try {
                Message message = (Message) nt0.OooO0O0.OooO0O0(this.OooO0O0);
                Message message2 = (Message) mt0.OooO0O0.OooO0O0(message);
                ArrayList arrayList = new ArrayList();
                while (message != messageObtain && message != null) {
                    if (message.getTarget() == this.OooO0OO && message.obj != obj) {
                        boolean zOooO0OO = yn2.OooO0OO();
                        int i3 = message.what;
                        if (zOooO0OO) {
                            if (i == i3) {
                                if (OooO0o(message.obj)) {
                                    message.obj = obj;
                                    arrayList.add(message);
                                }
                                OooO0OO();
                            }
                        } else if (i == i3) {
                            if (OooO0o0(message.obj)) {
                                message.obj = obj;
                                arrayList.add(message);
                            }
                            OooO0OO();
                        } else {
                            pl0 pl0Var = pl0.OooO0O0;
                            if (i3 > 100 && i3 < 110) {
                                pl0.OooO0O0.getClass();
                                Object obj2 = message.obj;
                                if ((obj2 instanceof IBinder) && OooO0oO.OooO0Oo((IBinder) obj2) != null) {
                                    message.obj = obj;
                                    arrayList.add(message);
                                }
                            }
                        }
                    }
                    Message message3 = message2;
                    message2 = (Message) mt0.OooO0O0.OooO0O0(message);
                    message = message3;
                }
                messageObtain.obj = obj;
                this.OooO0OO.removeCallbacksAndMessages(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.OooO00o.open();
    }
}
