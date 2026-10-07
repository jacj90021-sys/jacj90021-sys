package com.cmaster.cloner;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class m6 {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    xa3 zza;
    final Handler zzb;
    protected k6 zzc;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private final Context zzl;
    private final Looper zzm;
    private final v50 zzn;
    private final e60 zzo;
    private gb0 zzr;
    private IInterface zzs;
    private oh2 zzu;
    private final i6 zzw;
    private final j6 zzx;
    private final int zzy;
    private final String zzz;
    private static final iz[] zze = new iz[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    private volatile String zzk = null;
    private final Object zzp = new Object();
    private final Object zzq = new Object();
    private final ArrayList zzt = new ArrayList();
    private int zzv = 1;
    private gh zzB = null;
    private boolean zzC = false;
    private volatile cv2 zzD = null;
    protected AtomicInteger zzd = new AtomicInteger(0);

    public m6(Context context, Looper looper, b73 b73Var, e60 e60Var, int i, i6 i6Var, j6 j6Var, String str) {
        by2.OooO(context, "Context must not be null");
        this.zzl = context;
        by2.OooO(looper, "Looper must not be null");
        this.zzm = looper;
        by2.OooO(b73Var, "Supervisor must not be null");
        this.zzn = b73Var;
        by2.OooO(e60Var, "API availability must not be null");
        this.zzo = e60Var;
        this.zzb = new v62(this, looper);
        this.zzy = i;
        this.zzw = i6Var;
        this.zzx = j6Var;
        this.zzz = str;
    }

    public static void zzj(m6 m6Var, cv2 cv2Var) {
        m6Var.zzD = cv2Var;
        if (m6Var.usesClientTelemetry()) {
            hh hhVar = cv2Var.OooO0oO;
            xb1 xb1VarOooOooO = xb1.OooOooO();
            yb1 yb1Var = hhVar == null ? null : hhVar.OooO0Oo;
            synchronized (xb1VarOooOooO) {
                if (yb1Var == null) {
                    xb1VarOooOooO.OooO0o0 = xb1.OooO0oO;
                    return;
                }
                yb1 yb1Var2 = (yb1) xb1VarOooOooO.OooO0o0;
                if (yb1Var2 == null || yb1Var2.OooO0Oo < yb1Var.OooO0Oo) {
                    xb1VarOooOooO.OooO0o0 = yb1Var;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(m6 m6Var, int i) {
        int i2;
        int i3;
        synchronized (m6Var.zzp) {
            i2 = m6Var.zzv;
        }
        if (i2 == 3) {
            m6Var.zzC = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = m6Var.zzb;
        handler.sendMessage(handler.obtainMessage(i3, m6Var.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(m6 m6Var, int i, int i2, IInterface iInterface) {
        synchronized (m6Var.zzp) {
            try {
                if (m6Var.zzv != i) {
                    return false;
                }
                m6Var.OooO0O0(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(m6 m6Var) throws ClassNotFoundException {
        if (m6Var.zzC || TextUtils.isEmpty(m6Var.getServiceDescriptor()) || TextUtils.isEmpty(m6Var.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(m6Var.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void OooO0O0(int i, IInterface iInterface) {
        xa3 xa3Var;
        by2.OooO0O0((i == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                if (i == 1) {
                    oh2 oh2Var = this.zzu;
                    if (oh2Var != null) {
                        v50 v50Var = this.zzn;
                        String str = this.zza.OooO00o;
                        by2.OooO0oo(str);
                        String str2 = this.zza.OooO0O0;
                        zze();
                        v50Var.OooO0O0(str, str2, oh2Var, this.zza.OooO0OO);
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    oh2 oh2Var2 = this.zzu;
                    if (oh2Var2 != null && (xa3Var = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + xa3Var.OooO00o + " on " + xa3Var.OooO0O0);
                        v50 v50Var2 = this.zzn;
                        String str3 = this.zza.OooO00o;
                        by2.OooO0oo(str3);
                        String str4 = this.zza.OooO0O0;
                        zze();
                        v50Var2.OooO0O0(str3, str4, oh2Var2, this.zza.OooO0OO);
                        this.zzd.incrementAndGet();
                    }
                    oh2 oh2Var3 = new oh2(this, this.zzd.get());
                    this.zzu = oh2Var3;
                    xa3 xa3Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new xa3(getUseDynamicLookup(), getStartServicePackage(), getStartServiceAction()) : new xa3(false, getContext().getPackageName(), getLocalStartServiceAction());
                    this.zza = xa3Var2;
                    if (xa3Var2.OooO0OO && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.OooO00o)));
                    }
                    v50 v50Var3 = this.zzn;
                    String str5 = this.zza.OooO00o;
                    by2.OooO0oo(str5);
                    if (!v50Var3.OooO0OO(new l23(this.zza.OooO0OO, str5, this.zza.OooO0O0), oh2Var3, zze(), getBindServiceExecutor())) {
                        xa3 xa3Var3 = this.zza;
                        Log.w("GmsClient", "unable to connect to service: " + xa3Var3.OooO00o + " on " + xa3Var3.OooO0O0);
                        zzl(16, null, this.zzd.get());
                    }
                } else if (i == 4) {
                    by2.OooO0oo(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iOooO0OO = this.zzo.OooO0OO(this.zzl, getMinApkVersion());
        if (iOooO0OO == 0) {
            connect(new xb1(this, 6));
        } else {
            OooO0O0(1, null);
            triggerNotAvailable(new xb1(this, 6), iOooO0OO, null);
        }
    }

    public final void checkConnected() {
        if (isConnected()) {
            return;
        }
        qa.OooO0o("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    public void connect(k6 k6Var) {
        by2.OooO(k6Var, "Connection progress callbacks cannot be null.");
        this.zzc = k6Var;
        OooO0O0(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.zzt;
                    if (i < size) {
                        a32 a32Var = (a32) arrayList.get(i);
                        synchronized (a32Var) {
                            a32Var.OooO00o = null;
                        }
                        i++;
                    } else {
                        arrayList.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        OooO0O0(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        gb0 gb0Var;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            gb0Var = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (gb0Var == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((t32) gb0Var).OooO0Oo)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            printWriterAppend.println(j + " " + simpleDateFormat.format(new Date(j)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzg;
            printWriterAppend2.println(j2 + " " + simpleDateFormat.format(new Date(j2)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) yo2.OooO00o(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzj;
            printWriterAppend3.println(j3 + " " + simpleDateFormat.format(new Date(j3)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public iz[] getApiFeatures() {
        return zze;
    }

    public final iz[] getAvailableFeatures() {
        cv2 cv2Var = this.zzD;
        if (cv2Var == null) {
            return null;
        }
        return cv2Var.OooO0o0;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        xa3 xa3Var;
        if (isConnected() && (xa3Var = this.zza) != null) {
            return xa3Var.OooO0O0;
        }
        ra.OooOOO0("Failed to connect when checking package");
        return null;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return e60.OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void getRemoteService(w80 w80Var, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i = e60.OooO00o;
        Scope[] scopeArr = t40.OooOOo;
        Bundle bundle = new Bundle();
        int i2 = this.zzy;
        iz[] izVarArr = t40.OooOOoo;
        t40 t40Var = new t40(6, i2, i, null, null, scopeArr, bundle, null, izVarArr, izVarArr, true, 0, false, str);
        t40Var.OooO0oO = this.zzl.getPackageName();
        t40Var.OooOO0 = getServiceRequestExtraArgs;
        if (set != null) {
            t40Var.OooO = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            t40Var.OooOO0O = account;
            if (w80Var != 0) {
                t40Var.OooO0oo = ((l12) w80Var).OooO0o0;
            }
        } else if (requiresAccount()) {
            t40Var.OooOO0O = getAccount();
        }
        t40Var.OooOO0o = zze;
        t40Var.OooOOO0 = getApiFeatures();
        if (usesClientTelemetry()) {
            t40Var.OooOOOo = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    gb0 gb0Var = this.zzr;
                    if (gb0Var != null) {
                        ((t32) gb0Var).o0000o0O(new ne2(this, this.zzd.get()), t40Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                by2.OooO(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                gb0 gb0Var = this.zzr;
                if (gb0Var == null) {
                    return null;
                }
                return ((t32) gb0Var).OooO0Oo;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public hh getTelemetryConfiguration() {
        cv2 cv2Var = this.zzD;
        if (cv2Var == null) {
            return null;
        }
        return cv2Var.OooO0oO;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(gh ghVar) {
        this.zzi = ghVar.OooO0o0;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i2, -1, new ck2(this, i, iBinder, bundle)));
    }

    public void onUserSignOut(l6 l6Var) {
        vk1 vk1Var = (vk1) l6Var;
        ((s12) vk1Var.OooO0o0).OooOOOo.OooOOOo.post(new u91(vk1Var, 16));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i));
    }

    public void triggerNotAvailable(k6 k6Var, int i, PendingIntent pendingIntent) {
        by2.OooO(k6Var, "Connection progress callbacks cannot be null.");
        this.zzc = k6Var;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i, Bundle bundle, int i2) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i2, -1, new qm2(this, i)));
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
