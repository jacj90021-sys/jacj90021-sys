package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.cmaster.cloner.bn;
import com.cmaster.cloner.bn2;
import com.cmaster.cloner.du;
import com.cmaster.cloner.gu0;
import com.cmaster.cloner.im2;
import com.cmaster.cloner.j50;
import com.cmaster.cloner.jp0;
import com.cmaster.cloner.k20;
import com.cmaster.cloner.k3;
import com.cmaster.cloner.k8;
import com.cmaster.cloner.kp0;
import com.cmaster.cloner.kw;
import com.cmaster.cloner.o00OO;
import com.cmaster.cloner.o00OO000;
import com.cmaster.cloner.o10;
import com.cmaster.cloner.oOOO00;
import com.cmaster.cloner.oh1;
import com.cmaster.cloner.op0;
import com.cmaster.cloner.os0;
import com.cmaster.cloner.p50;
import com.cmaster.cloner.pr1;
import com.cmaster.cloner.pv2;
import com.cmaster.cloner.px0;
import com.cmaster.cloner.q50;
import com.cmaster.cloner.qc3;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.x91;
import com.cmaster.cloner.xb1;
import com.cmaster.cloner.y91;
import com.cmaster.cloner.zx2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class OooO00o implements ComponentCallbacks2 {
    public static volatile OooO00o OooOO0O;
    public static volatile boolean OooOO0o;
    public final gu0 OooO;
    public final k8 OooO0Oo;
    public final j50 OooO0o;
    public final op0 OooO0o0;
    public final jp0 OooO0oO;
    public final y91 OooO0oo;
    public final ArrayList OooOO0 = new ArrayList();

    public OooO00o(Context context, kw kwVar, op0 op0Var, k8 k8Var, jp0 jp0Var, y91 y91Var, gu0 gu0Var, qc3 qc3Var, k3 k3Var, List list, ArrayList arrayList, bn2 bn2Var, o00OO000 o00oo000) {
        this.OooO0Oo = k8Var;
        this.OooO0oO = jp0Var;
        this.OooO0o0 = op0Var;
        this.OooO0oo = y91Var;
        this.OooO = gu0Var;
        this.OooO0o = new j50(context, jp0Var, new oh1(this, arrayList, bn2Var), new gu0(9), qc3Var, k3Var, list, kwVar, o00oo000);
    }

    public static OooO00o OooO00o(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (OooOO0O == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (OooO00o.class) {
                if (OooOO0O == null) {
                    if (OooOO0o) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    OooOO0o = true;
                    try {
                        OooO0O0(context, generatedAppGlideModule);
                        OooOO0o = false;
                    } catch (Throwable th) {
                        OooOO0o = false;
                        throw th;
                    }
                }
            }
        }
        return OooOO0O;
    }

    public static void OooO0O0(Context context, GeneratedAppGlideModule generatedAppGlideModule) throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        qc3 qc3Var;
        k3 k3Var;
        k3 k3Var2 = new k3(0);
        bn bnVar = new bn(2);
        qc3 qc3Var2 = new qc3(8);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        pv2.OooO00o(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw px0.OooOO0o(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw px0.OooOO0o(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw px0.OooOO0o(it3);
        }
        o00OO o00oo = new o00OO(1);
        if (q50.OooO0o0 == 0) {
            q50.OooO0o0 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = q50.OooO0o0;
        if (TextUtils.isEmpty("source")) {
            ra.OooOOO("Name must be non-null and non-empty, but given: source");
            return;
        }
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        p50 p50Var = new p50(o00oo, "source", false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        q50 q50Var = new q50(new ThreadPoolExecutor(i, i, 0L, timeUnit, priorityBlockingQueue, p50Var));
        o00OO o00oo2 = new o00OO(1);
        if (TextUtils.isEmpty("disk-cache")) {
            ra.OooOOO("Name must be non-null and non-empty, but given: disk-cache");
            return;
        }
        q50 q50Var2 = new q50(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new p50(o00oo2, "disk-cache", true)));
        if (q50.OooO0o0 == 0) {
            q50.OooO0o0 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = q50.OooO0o0 >= 4 ? 2 : 1;
        o00OO o00oo3 = new o00OO(1);
        if (TextUtils.isEmpty("animation")) {
            ra.OooOOO("Name must be non-null and non-empty, but given: animation");
            return;
        }
        q50 q50Var3 = new q50(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new p50(o00oo3, "animation", true)));
        os0 os0Var = new os0(applicationContext);
        du duVar = new du();
        Context context2 = os0Var.OooO00o;
        float f = os0Var.OooO0Oo;
        ActivityManager activityManager = os0Var.OooO0O0;
        int i3 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        duVar.OooO0OO = i3;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) os0Var.OooO0OO.OooO0o0;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i4 = iRound - i3;
        int i5 = iRound3 + iRound2;
        if (i5 <= i4) {
            duVar.OooO0O0 = iRound3;
            duVar.OooO00o = iRound2;
        } else {
            float f3 = i4 / (f + 2.0f);
            duVar.OooO0O0 = Math.round(2.0f * f3);
            duVar.OooO00o = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            qc3Var = qc3Var2;
            k3Var = k3Var2;
            sb.append(Formatter.formatFileSize(context2, duVar.OooO0O0));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context2, duVar.OooO00o));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context2, i3));
            sb.append(", memory class limited? ");
            sb.append(i5 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context2, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        } else {
            qc3Var = qc3Var2;
            k3Var = k3Var2;
        }
        gu0 gu0Var = new gu0(5);
        int i6 = duVar.OooO00o;
        k8 kp0Var = i6 > 0 ? new kp0(i6) : new im2();
        jp0 jp0Var = new jp0(duVar.OooO0OO);
        op0 op0Var = new op0(duVar.OooO0O0);
        OooO00o oooO00o = new OooO00o(applicationContext, new kw(op0Var, new xb1(applicationContext), q50Var2, q50Var, new q50(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, timeUnit, new SynchronousQueue(), new p50(new o00OO(1), "source-unlimited", false))), q50Var3), op0Var, kp0Var, jp0Var, new y91(), gu0Var, qc3Var, k3Var, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new o00OO000(bnVar));
        applicationContext.registerComponentCallbacks(oooO00o);
        OooOO0O = oooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v25, types: [android.view.View] */
    public static x91 OooO0OO(ImageView imageView) {
        View view;
        Context context = imageView.getContext();
        zx2.OooO0OO(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        y91 y91Var = OooO00o(context).OooO0oo;
        y91Var.getClass();
        char[] cArr = pr1.OooO00o;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return y91Var.OooO0OO(imageView.getContext().getApplicationContext());
        }
        zx2.OooO0OO(imageView.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityOooO00o = y91.OooO00o(imageView.getContext());
        if (activityOooO00o == null) {
            return y91Var.OooO0OO(imageView.getContext().getApplicationContext());
        }
        if (!(activityOooO00o instanceof oOOO00)) {
            return y91Var.OooO0OO(imageView.getContext().getApplicationContext());
        }
        oOOO00 oooo00 = (oOOO00) activityOooO00o;
        k3 k3Var = y91Var.OooO0o0;
        k3Var.clear();
        y91.OooO0O0(oooo00.OooOOO().OooO0OO.OooOo(), k3Var);
        View viewFindViewById = oooo00.findViewById(R.id.content);
        o10 o10Var = null;
        for (ImageView imageView2 = imageView; !imageView2.equals(viewFindViewById) && (o10Var = (o10) k3Var.get(imageView2)) == null && (imageView2.getParent() instanceof View); imageView2 = (View) imageView2.getParent()) {
        }
        k3Var.clear();
        if (o10Var == null) {
            return y91Var.OooO0Oo(oooo00);
        }
        zx2.OooO0OO(o10Var.OooOO0(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return y91Var.OooO0OO(o10Var.OooOO0().getApplicationContext());
        }
        if (o10Var.OooO0oo() != null) {
            y91Var.OooO0o.OooO0OO(o10Var.OooO0oo());
        }
        k20 k20VarOooO = o10Var.OooO();
        Context contextOooOO0 = o10Var.OooOO0();
        return y91Var.OooO0oO.OooOooo(contextOooOO0, OooO00o(contextOooOO0.getApplicationContext()), o10Var.OoooO0, k20VarOooO, (!o10Var.OooOOoo() || o10Var.OooOo00() || (view = o10Var.Oooo0) == null || view.getWindowToken() == null || o10Var.Oooo0.getVisibility() != 0) ? false : true);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        pr1.OooO00o();
        this.OooO0o0.OooO0o0(0L);
        this.OooO0Oo.OooO0oO();
        jp0 jp0Var = this.OooO0oO;
        synchronized (jp0Var) {
            jp0Var.OooO0O0(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        pr1.OooO00o();
        synchronized (this.OooOO0) {
            try {
                ArrayList arrayList = this.OooOO0;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((x91) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        op0 op0Var = this.OooO0o0;
        op0Var.getClass();
        if (i >= 40) {
            op0Var.OooO0o0(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (op0Var) {
                j = op0Var.OooO0O0;
            }
            op0Var.OooO0o0(j / 2);
        }
        this.OooO0Oo.OooO0o(i);
        jp0 jp0Var = this.OooO0oO;
        synchronized (jp0Var) {
            if (i >= 40) {
                synchronized (jp0Var) {
                    jp0Var.OooO0O0(0);
                }
            } else if (i >= 20 || i == 15) {
                jp0Var.OooO0O0(jp0Var.OooO0o0 / 2);
            }
        }
    }
}
