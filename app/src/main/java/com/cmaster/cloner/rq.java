package com.cmaster.cloner;

import android.os.Binder;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import dalvik.system.BaseDexClassLoader;
import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class rq implements z7, IBinder, InvocationHandler {
    public static final ThreadLocal OooO0o = new ThreadLocal();
    public final Binder OooO0Oo;
    public final x7 OooO0o0;

    public rq(x7 x7Var, ClassLoader classLoader) {
        Class cls = x7Var.OooO0Oo;
        this.OooO0o0 = x7Var;
        BaseDexClassLoader baseDexClassLoader = wq.OooO00o;
        Object obj = null;
        try {
            Object objNewInstance = classLoader.loadClass(y7.OooO0o0.OooO0O0.OooO00o(cls)).newInstance();
            t51.OooO0Oo(objNewInstance, this);
            Class cls2 = x7Var.OooO0OO;
            try {
                try {
                    Field declaredField = objNewInstance.getClass().getDeclaredField(t51.OooO0o0);
                    declaredField.setAccessible(true);
                    if (declaredField.get(null) == null) {
                        declaredField.set(null, t51.OooO0OO(cls, cls2).toArray(new Method[0]));
                    }
                    obj = objNewInstance;
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        } catch (Throwable th) {
            u7.OooO00o(new byte[]{28, -101, 27, 126, -48}, new byte[]{90, -38, 79, 63, -100, 89, 5, -31});
            Thread.currentThread();
            new Throwable(cls.getName(), th);
            oO00OOOo oo00oooo = lw1.OooO0O0;
        }
        this.OooO0Oo = (Binder) obj;
    }

    public static IBinder OooO0O0() {
        return (IBinder) OooO0o.get();
    }

    public static boolean OooO0OO(Binder binder, int i, Parcel parcel, Parcel parcel2, int i2) throws Exception {
        Exception illegalStateException;
        try {
            return binder.transact(i, parcel, parcel2, i2);
        } catch (Throwable th) {
            boolean z = th instanceof RuntimeException;
            if (z) {
                if (th.getCause() instanceof DeadObjectException) {
                    throw th.getCause();
                }
            } else if (th instanceof DeadObjectException) {
                throw th;
            }
            if ((th instanceof RemoteException) || z) {
                illegalStateException = th;
            } else {
                u7.OooO00o(new byte[]{-17, -58, -41, 103, 57}, new byte[]{-86, -108, -123, 40, 107, -64, -48, -100});
                Thread.currentThread();
                oO00OOOo oo00oooo = lw1.OooO0O0;
                illegalStateException = new IllegalStateException(th);
            }
            if ((i2 & 1) == 0) {
                parcel2.setDataSize(0);
                parcel2.setDataPosition(0);
                try {
                    parcel2.writeException(illegalStateException);
                } catch (Throwable th2) {
                    parcel2.writeException(new IllegalStateException(u7.OooO00o(new byte[]{13, -36, -91, -30}, new byte[]{72, -114, -9, -40, 27, 111, -48, -70}) + th2.getMessage()));
                    u7.OooO00o(new byte[]{103, 17, -22}, new byte[]{34, 67, -72, -58, 16, -80, -19, -85});
                    Thread.currentThread();
                    oO00OOOo oo00oooo2 = lw1.OooO0O0;
                }
                parcel2.setDataPosition(0);
            }
            return true;
        }
    }

    @Override // com.cmaster.cloner.z7
    public final boolean OooO00o(IBinder iBinder, int i, Parcel parcel, Parcel parcel2, int i2) {
        if (OooO0O0() == iBinder) {
            if (iBinder instanceof Binder) {
                return iBinder.transact(i, parcel, parcel2, i2);
            }
            ThreadLocal threadLocal = b8.OooO00o;
            int i3 = d02.OooO00o;
            PAM.WAFXO(iBinder, i, parcel, parcel2, i2);
            return true;
        }
        ThreadLocal threadLocal2 = OooO0o;
        IBinder iBinder2 = (IBinder) threadLocal2.get();
        threadLocal2.set(iBinder);
        try {
            return OooO0OO(this.OooO0Oo, i, parcel, parcel2, i2);
        } finally {
            threadLocal2.set(iBinder2);
        }
    }

    @Override // android.os.IBinder
    public final void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        OooO0O0().dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        OooO0O0().dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final String getInterfaceDescriptor() {
        return OooO0O0().getInterfaceDescriptor();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        yq yqVarOooO0o0 = yq.OooO0o0(this.OooO0o0.OooO0oO(OooO0O0()), method, objArr);
        ((st0) st0.OooO0OO.get()).OooO00o.OooO00o(yqVarOooO0o0);
        yqVarOooO0o0.OooO00o();
        return yqVarOooO0o0.OooO0oO();
    }

    @Override // android.os.IBinder
    public final boolean isBinderAlive() {
        return OooO0O0().isBinderAlive();
    }

    @Override // android.os.IBinder
    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) throws RemoteException {
        OooO0O0().linkToDeath(deathRecipient, i);
    }

    @Override // android.os.IBinder
    public final boolean pingBinder() {
        return OooO0O0().pingBinder();
    }

    @Override // android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        return null;
    }

    @Override // android.os.IBinder
    public final boolean transact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinderOooO0O0 = OooO0O0();
        if (iBinderOooO0O0 instanceof Binder) {
            return iBinderOooO0O0.transact(i, parcel, parcel2, i2);
        }
        ThreadLocal threadLocal = b8.OooO00o;
        int i3 = d02.OooO00o;
        PAM.WAFXO(iBinderOooO0O0, i, parcel, parcel2, i2);
        return true;
    }

    @Override // android.os.IBinder
    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        return OooO0O0().unlinkToDeath(deathRecipient, i);
    }
}
