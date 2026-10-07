package com.cmaster.cloner;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xb1 implements ht0, ez0, ju0, s3, k6, us0, oi, go, jy, o0O0oo0o, l50, nn, lr, zs1 {
    public static volatile xb1 OooO;
    public static xb1 OooO0o;
    public static final yb1 OooO0oO = new yb1(0, 0, 0, false, false);
    public static final Object OooO0oo = new Object();
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o0;

    public xb1(Bundle bundle) {
        this.OooO0Oo = 12;
        bundle.getString(qn2.OooO00o("ppA8KDT6IQWGpAQFBZ81\n", "w+hIWlXUck0=\n"));
        bundle.getString(qn2.OooO00o("wU0ocU56wAfnfh1EagveB+lw\n", "pDVcAy9UkEY=\n"));
        bundle.getLong(qn2.OooO00o("D3/NYF3QsPY4VPBdcqGl/C5C\n", "age5Ejz+5rM=\n"));
        bundle.getString(qn2.OooO00o("K5mEZ/48YjsBorVGzE18KAOk\n", "TuHwFZ8SMmk=\n"));
        bundle.getInt(qn2.OooO00o("9FAGWpKOtzfUeg==\n", "kShyKPOg4mQ=\n"));
        byte[] byteArray = bundle.getByteArray(qn2.OooO00o("e3jLJULi\n", "HgC/VyORRJE=\n"));
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(byteArray, 0, byteArray.length);
            parcelObtain.setDataPosition(0);
            Exception excOooo00o = Oooo00o(parcelObtain);
            if (excOooo00o != null) {
                Exception exc = excOooo00o;
                while (true) {
                    Exception excOooo00o2 = Oooo00o(parcelObtain);
                    if (excOooo00o2 == null) {
                        break;
                    }
                    exc.initCause(excOooo00o2);
                    exc = excOooo00o2;
                }
            } else {
                parcelObtain.recycle();
                excOooo00o = null;
            }
            this.OooO0o0 = excOooo00o;
        } finally {
            parcelObtain.recycle();
        }
    }

    public static synchronized xb1 OooOooO() {
        try {
            if (OooO0o == null) {
                OooO0o = new xb1(0, false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return OooO0o;
    }

    public static xb1 OooOooo() {
        if (OooO == null) {
            synchronized (OooO0oo) {
                try {
                    if (OooO == null) {
                        OooO = new xb1(1);
                    }
                } finally {
                }
            }
        }
        xb1 xb1Var = OooO;
        by2.OooO0oo(xb1Var);
        return xb1Var;
    }

    public static xb1 Oooo00O(Class cls, Class... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return new xb1(cls, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Exception Oooo00o(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        Exception exc = new Exception(parcel.readString());
        int i = parcel.readInt();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        for (int i2 = 0; i2 < i; i2++) {
            stackTraceElementArr[i2] = new StackTraceElement(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }
        exc.setStackTrace(stackTraceElementArr);
        return exc;
    }

    public static void Oooo0o0(Parcel parcel, Throwable th, String str, int i) {
        if (i <= 0) {
            return;
        }
        parcel.writeInt(1);
        String message = th.getMessage();
        if (message != null && message.length() > 5000) {
            message = message.substring(0, 5000);
        }
        if (str == null) {
            str = message;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int iMin = Math.min(stackTrace.length, i);
        parcel.writeString(str);
        parcel.writeInt(iMin + 1);
        String name = th.getClass().getName();
        String strOooO00o = qn2.OooO00o("GXa+58A=\n", "fATMiLILft8=\n");
        String strOooO00o2 = qn2.OooO00o("Pe+rkQ==\n", "dIHC5dTpJOU=\n");
        parcel.writeString(name);
        parcel.writeString(strOooO00o);
        parcel.writeString(strOooO00o2);
        parcel.writeInt(1);
        for (int i2 = 0; i2 < iMin; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            int lineNumber = stackTraceElement.getLineNumber();
            parcel.writeString(className);
            parcel.writeString(methodName);
            parcel.writeString(fileName);
            parcel.writeInt(lineNumber);
        }
        int i3 = i - iMin;
        if (th.getCause() == null || i3 <= 0) {
            parcel.writeInt(0);
        } else {
            Oooo0o0(parcel, th.getCause(), null, i3);
        }
    }

    @Override // com.cmaster.cloner.nn
    public Object OooO() {
        w61 w61Var = (w61) this.OooO0o0;
        w61Var.reset();
        return w61Var;
    }

    @Override // com.cmaster.cloner.l50
    public Class OooO00o() {
        return AssetFileDescriptor.class;
    }

    @Override // com.cmaster.cloner.l50
    public void OooO0O0(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // com.cmaster.cloner.ht0
    public void OooO0OO(ss0 ss0Var, boolean z) {
        if (ss0Var instanceof vj1) {
            ((vj1) ss0Var).OooOoo.OooOO0O().OooO0OO(false);
        }
        ht0 ht0Var = ((o00O0OOO) this.OooO0o0).OooO0oo;
        if (ht0Var != null) {
            ht0Var.OooO0OO(ss0Var, z);
        }
    }

    @Override // com.cmaster.cloner.nn
    public void OooO0Oo() {
        ((w61) this.OooO0o0).OooO0o();
    }

    @Override // com.cmaster.cloner.zs1
    public int OooO0o(View view) {
        return (view.getLeft() - ((j71) view.getLayoutParams()).OooO0O0.left) - ((ViewGroup.MarginLayoutParams) ((j71) view.getLayoutParams())).leftMargin;
    }

    @Override // com.cmaster.cloner.o0O0oo0o
    public void OooO0o0(Object obj) {
        o0oO0O0o o0oo0o0o = (o0oO0O0o) obj;
        k20 k20Var = (k20) this.OooO0o0;
        h20 h20Var = (h20) k20Var.OooOoo.pollFirst();
        if (h20Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = h20Var.OooO0Oo;
        int i = h20Var.OooO0o0;
        o10 o10VarOooOOo = k20Var.OooO0OO.OooOOo(str);
        if (o10VarOooOOo != null) {
            o10VarOooOOo.OooOo0o(i, o0oo0o0o.OooO0Oo, o0oo0o0o.OooO0o0);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // com.cmaster.cloner.jy
    public Object OooO0oO() {
        t62 t62Var = (t62) this.OooO0o0;
        return new ow((q50) t62Var.OooO0Oo, (q50) t62Var.OooO0o0, (q50) t62Var.OooO0o, (q50) t62Var.OooO0oO, (kw) t62Var.OooO0oo, (kw) t62Var.OooO, (hx2) t62Var.OooOO0);
    }

    @Override // com.cmaster.cloner.go
    public int OooO0oo() {
        return OooOOoo() | (OooOOoo() << 8);
    }

    @Override // com.cmaster.cloner.ez0
    public void OooOO0(View view, xj0 xj0Var) {
        t1 t1Var = (t1) this.OooO0o0;
        cc ccVar = xj0Var.OooOo0O;
        if (!(ccVar instanceof o2)) {
            if (ccVar != null) {
                ccVar.OooOO0(view, xj0Var);
            }
        } else {
            PackageInfo packageInfo = ((o2) ccVar).OooO0o0;
            Intent intent = new Intent();
            intent.putExtra(sn2.OooO00o("mbaYH8DnUQ==\n", "6df7dKGANK8=\n"), packageInfo);
            t1Var.Oooo0oO().setResult(-1, intent);
            t1Var.Oooo0oO().finish();
        }
    }

    @Override // com.cmaster.cloner.us0
    public void OooOO0O(ss0 ss0Var, MenuItem menuItem) {
        ((ub) this.OooO0o0).OooO.removeCallbacksAndMessages(ss0Var);
    }

    @Override // com.cmaster.cloner.l50
    public Object OooOO0o(Resources resources, ApplicationInfo applicationInfo) {
        return resources.openRawResourceFd(applicationInfo.icon);
    }

    @Override // com.cmaster.cloner.oi
    public void OooOOO(Uri uri) {
        ((ContentInfo.Builder) this.OooO0o0).setLinkUri(uri);
    }

    @Override // com.cmaster.cloner.zs1
    public int OooOOO0() {
        return ((i71) this.OooO0o0).OooOooo();
    }

    @Override // com.cmaster.cloner.ht0
    public boolean OooOOOO(ss0 ss0Var) {
        o00O0OOO o00o0ooo = (o00O0OOO) this.OooO0o0;
        if (ss0Var == o00o0ooo.OooO0o) {
            return false;
        }
        ((vj1) ss0Var).OooOooO.getClass();
        ht0 ht0Var = o00o0ooo.OooO0oo;
        if (ht0Var != null) {
            return ht0Var.OooOOOO(ss0Var);
        }
        return false;
    }

    @Override // com.cmaster.cloner.oi
    public void OooOOOo(int i) {
        ((ContentInfo.Builder) this.OooO0o0).setFlags(i);
    }

    @Override // com.cmaster.cloner.k6
    public void OooOOo(gh ghVar) {
        boolean z = ghVar.OooO0o0 == 0;
        m6 m6Var = (m6) this.OooO0o0;
        if (z) {
            m6Var.getRemoteService(null, m6Var.getScopes());
        } else if (m6Var.zzx != null) {
            m6Var.zzx.onConnectionFailed(ghVar);
        }
    }

    @Override // com.cmaster.cloner.zs1
    public int OooOOo0() {
        i71 i71Var = (i71) this.OooO0o0;
        return i71Var.OooOOO - i71Var.Oooo000();
    }

    @Override // com.cmaster.cloner.go
    public short OooOOoo() throws fo {
        ByteBuffer byteBuffer = (ByteBuffer) this.OooO0o0;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new fo();
    }

    @Override // com.cmaster.cloner.lr
    public boolean OooOo(float f) {
        if (f == 0.0f) {
            return false;
        }
        OooOoo();
        ((NestedScrollView) this.OooO0o0).OooOO0((int) f);
        return true;
    }

    @Override // com.cmaster.cloner.us0
    public void OooOo0(ss0 ss0Var, vs0 vs0Var) {
        ub ubVar = (ub) this.OooO0o0;
        Handler handler = ubVar.OooO;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = ubVar.OooOO0O;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ss0Var == ((tb) arrayList.get(i)).OooO0O0) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new sb(this, i2 < arrayList.size() ? (tb) arrayList.get(i2) : null, vs0Var, ss0Var, 0), ss0Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        switch (this.OooO0Oo) {
            case 5:
                return new t3((AssetManager) this.OooO0o0, this, 0);
            case 17:
                return new t3((App) this.OooO0o0, this);
            default:
                return new u80((o00OO000) this.OooO0o0);
        }
    }

    @Override // com.cmaster.cloner.s3
    public in OooOo0O(AssetManager assetManager, String str) {
        return new qz(assetManager, str, 0);
    }

    @Override // com.cmaster.cloner.zs1
    public View OooOoO(int i) {
        return ((i71) this.OooO0o0).OooOo0(i);
    }

    @Override // com.cmaster.cloner.go
    public int OooOoO0(int i, byte[] bArr) {
        ByteBuffer byteBuffer = (ByteBuffer) this.OooO0o0;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // com.cmaster.cloner.zs1
    public int OooOoOO(View view) {
        return view.getRight() + ((j71) view.getLayoutParams()).OooO0O0.right + ((ViewGroup.MarginLayoutParams) ((j71) view.getLayoutParams())).rightMargin;
    }

    @Override // com.cmaster.cloner.lr
    public void OooOoo() {
        ((NestedScrollView) this.OooO0o0).OooO0oO.abortAnimation();
    }

    @Override // com.cmaster.cloner.lr
    public float OooOoo0() {
        return -((NestedScrollView) this.OooO0o0).getVerticalScrollFactorCompat();
    }

    public synchronized void Oooo0(f50 f50Var) {
        f50Var.OooO0O0 = null;
        f50Var.OooO0OO = null;
        ((ArrayDeque) this.OooO0o0).offer(f50Var);
    }

    public Object Oooo000(Object... objArr) {
        try {
            return ((Constructor) this.OooO0o0).newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public void Oooo0O0(int i) {
        RecyclerView recyclerView = (RecyclerView) this.OooO0o0;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.OooOOoo(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void Oooo0OO(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.OooO0o0;
        if ((serviceConnection instanceof r33) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public boolean Oooo0o(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.OooO0o0;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((e12.OooO00o(context).OooO0o0(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof r33) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }

    @Override // com.cmaster.cloner.oi
    public ri build() {
        return new ri(new o00OO000(((ContentInfo.Builder) this.OooO0o0).build()));
    }

    @Override // com.cmaster.cloner.oi
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.OooO0o0).setExtras(bundle);
    }

    @Override // com.cmaster.cloner.go
    public long skip(long j) {
        ByteBuffer byteBuffer = (ByteBuffer) this.OooO0o0;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public /* synthetic */ xb1(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    public xb1(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 8:
                char[] cArr = pr1.OooO00o;
                this.OooO0o0 = new ArrayDeque(0);
                break;
            case 18:
                this.OooO0o0 = new ArrayList(20);
                break;
            case 19:
                this.OooO0o0 = new o00OO000(21, (byte) 0);
                break;
            case 22:
                this.OooO0o0 = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.OooO0o0 = new ConcurrentHashMap();
                break;
        }
    }

    public xb1(Class cls, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        this.OooO0Oo = 29;
        Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
        this.OooO0o0 = declaredConstructor;
        declaredConstructor.setAccessible(true);
    }

    public /* synthetic */ xb1(int i, boolean z) {
        this.OooO0Oo = i;
    }

    public xb1(InputStream inputStream, jp0 jp0Var) {
        this.OooO0Oo = 20;
        w61 w61Var = new w61(inputStream, jp0Var);
        this.OooO0o0 = w61Var;
        w61Var.mark(5242880);
    }

    public xb1(Context context) {
        this.OooO0Oo = 21;
        this.OooO0o0 = new hg(context, 3);
    }

    public xb1(TextView textView) {
        this.OooO0Oo = 14;
        this.OooO0o0 = new fv(textView);
    }

    public xb1(ByteBuffer byteBuffer) {
        this.OooO0Oo = 13;
        this.OooO0o0 = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public xb1(ClipData clipData, int i) {
        this.OooO0Oo = 11;
        this.OooO0o0 = t8.OooOOOo(clipData, i);
    }
}
