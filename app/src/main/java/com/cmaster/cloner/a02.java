package com.cmaster.cloner;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.widget.NumberPicker;
import androidx.work.OverwritingInputMerger;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzhhh;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.Adler32;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a02 implements qa1, yf0, oc1, iy, v31, aw, zzbee {
    public static e51 OooO;
    public static a02 OooO0oo;
    public static volatile a02 OooOO0;
    public static final Object OooOO0O = new Object();
    public static a02 OooOO0o;
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;

    public a02(hx2 hx2Var) {
        this.OooO0Oo = 4;
        j7 j7Var = (j7) hx2Var.OooO0o0;
        int iOooO = j7Var.OooO();
        this.OooO0o0 = new ke[iOooO];
        this.OooO0o = new ke[iOooO];
        this.OooO0oO = new ke[iOooO];
        int length = j7Var.OooO0o0.length;
        for (int i = 0; i < length; i++) {
            i7 i7Var = (i7) j7Var.OooO0o0(i);
            dh0 dh0Var = i7Var.OooO0O0;
            int i2 = i7Var.OooO00o;
            ((ke[]) this.OooO0o0)[i2] = new ke(((ch0) dh0Var.OooO0o0(0)).OooO0o0);
            zh1 zh1Var = dh0Var.OooO().OooO0o0;
            ((ke[]) this.OooO0o)[i2] = new ke(zh1Var);
            ((ke[]) this.OooO0oO)[i2] = new ke(zh1Var);
        }
    }

    public static IBinder OooO00o(a02 a02Var) {
        IBinder binder;
        synchronized (a02Var) {
            try {
                Bundle bundleOooO00o = OooO.OooO00o(null, qn2.OooO00o("X4fRlBOpRCxXh8GDErQOZ0adx4dSiW5We6fh\n", "Pum15nzAIAI=\n"));
                if (bundleOooO00o == null) {
                    throw new RemoteException(qn2.OooO00o("QPvh2TYBVC1G5v3YIQ==\n", "I5SPt1NiIA0=\n"));
                }
                yz1 yz1Var = (yz1) a02Var.OooO0o0;
                if (yz1Var != null) {
                    yz1Var.binderDied();
                }
                binder = bundleOooO00o.getBinder(qn2.OooO00o("Y46JuOJXmjNrjpmv40rQeHqUn6ujd7BJR665\n", "AuDtyo0+/h0=\n"));
                if (binder != null) {
                    a02Var.OooO0o0 = new yz1(a02Var, binder);
                    synchronized (a02Var) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return binder;
    }

    public static a02 OooOoO0(Context context) {
        if (OooOO0 == null) {
            synchronized (OooOO0O) {
                try {
                    if (OooOO0 == null) {
                        OooOO0 = new a02(context, 1);
                    }
                } finally {
                }
            }
        }
        return OooOO0;
    }

    public static a02 Oooo0OO(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new a02(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static a02 Oooo0o0(Class cls, String str, Class... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return new a02(cls, str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void OoooO() {
    }

    private final void OoooO0O() {
    }

    @Override // com.cmaster.cloner.yf0
    public Bitmap OooO(BitmapFactory.Options options) {
        switch (this.OooO0Oo) {
            case 10:
                return BitmapFactory.decodeStream(new z9(ba.OooO0OO((ByteBuffer) this.OooO0o0)), null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.OooO00o) this.OooO0oO).OooO00o().getFileDescriptor(), null, options);
        }
    }

    public int OooO0O0(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(0);
            ((zz1) this.OooO0oO).transact(26, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public mz0 OooO0OO() {
        UUID uuid = (UUID) this.OooO0o0;
        w02 w02Var = (w02) this.OooO0o;
        HashSet hashSet = (HashSet) this.OooO0oO;
        mz0 mz0Var = new mz0();
        mz0Var.OooO00o = uuid;
        mz0Var.OooO0O0 = w02Var;
        mz0Var.OooO0OO = hashSet;
        ji jiVar = w02Var.OooOO0;
        boolean z = jiVar.OooO0oo.OooO00o.size() > 0 || jiVar.OooO0Oo || jiVar.OooO0O0 || jiVar.OooO0OO;
        if (((w02) this.OooO0o).OooOOo0 && z) {
            ra.OooOOO("Expedited jobs only support network and storage constraints");
            return null;
        }
        this.OooO0o0 = UUID.randomUUID();
        w02 w02Var2 = (w02) this.OooO0o;
        w02 w02Var3 = new w02();
        w02Var3.OooO0O0 = 1;
        cn cnVar = cn.OooO0OO;
        w02Var3.OooO0o0 = cnVar;
        w02Var3.OooO0o = cnVar;
        w02Var3.OooOO0 = ji.OooO;
        w02Var3.OooOO0o = 1;
        w02Var3.OooOOO0 = 30000L;
        w02Var3.OooOOOo = -1L;
        w02Var3.OooOOo = 1;
        w02Var3.OooO00o = w02Var2.OooO00o;
        w02Var3.OooO0OO = w02Var2.OooO0OO;
        w02Var3.OooO0O0 = w02Var2.OooO0O0;
        w02Var3.OooO0Oo = w02Var2.OooO0Oo;
        w02Var3.OooO0o0 = new cn(w02Var2.OooO0o0);
        w02Var3.OooO0o = new cn(w02Var2.OooO0o);
        w02Var3.OooO0oO = w02Var2.OooO0oO;
        w02Var3.OooO0oo = w02Var2.OooO0oo;
        w02Var3.OooO = w02Var2.OooO;
        ji jiVar2 = w02Var2.OooOO0;
        ji jiVar3 = new ji();
        jiVar3.OooO00o = 1;
        jiVar3.OooO0o = -1L;
        jiVar3.OooO0oO = -1L;
        jiVar3.OooO0oo = new aj();
        jiVar3.OooO0O0 = jiVar2.OooO0O0;
        jiVar3.OooO0OO = jiVar2.OooO0OO;
        jiVar3.OooO00o = jiVar2.OooO00o;
        jiVar3.OooO0Oo = jiVar2.OooO0Oo;
        jiVar3.OooO0o0 = jiVar2.OooO0o0;
        jiVar3.OooO0oo = jiVar2.OooO0oo;
        w02Var3.OooOO0 = jiVar3;
        w02Var3.OooOO0O = w02Var2.OooOO0O;
        w02Var3.OooOO0o = w02Var2.OooOO0o;
        w02Var3.OooOOO0 = w02Var2.OooOOO0;
        w02Var3.OooOOO = w02Var2.OooOOO;
        w02Var3.OooOOOO = w02Var2.OooOOOO;
        w02Var3.OooOOOo = w02Var2.OooOOOo;
        w02Var3.OooOOo0 = w02Var2.OooOOo0;
        w02Var3.OooOOo = w02Var2.OooOOo;
        this.OooO0o = w02Var3;
        w02Var3.OooO00o = ((UUID) this.OooO0o0).toString();
        return mz0Var;
    }

    @Override // com.cmaster.cloner.yf0
    public int OooO0Oo() throws Throwable {
        int i = 0;
        switch (this.OooO0Oo) {
            case 10:
                List list = (List) this.OooO0o;
                ByteBuffer byteBufferOooO0OO = ba.OooO0OO((ByteBuffer) this.OooO0o0);
                jp0 jp0Var = (jp0) this.OooO0oO;
                if (byteBufferOooO0OO == null) {
                    return -1;
                }
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    try {
                        int iOooO0Oo = ((wf0) list.get(i2)).OooO0Oo(byteBufferOooO0OO, jp0Var);
                        if (iOooO0Oo != -1) {
                            return iOooO0Oo;
                        }
                    } finally {
                    }
                }
                return -1;
            default:
                List list2 = (List) this.OooO0o;
                com.bumptech.glide.load.data.OooO00o oooO00o = (com.bumptech.glide.load.data.OooO00o) this.OooO0oO;
                jp0 jp0Var2 = (jp0) this.OooO0o0;
                int size2 = list2.size();
                while (i < size2) {
                    wf0 wf0Var = (wf0) list2.get(i);
                    w61 w61Var = null;
                    try {
                        w61 w61Var2 = new w61(new FileInputStream(oooO00o.OooO00o().getFileDescriptor()), jp0Var2);
                        try {
                            int iOooO0O0 = wf0Var.OooO0O0(w61Var2, jp0Var2);
                            w61Var2.OooO0o();
                            oooO00o.OooO00o();
                            if (iOooO0O0 != -1) {
                                return iOooO0O0;
                            }
                            i++;
                        } catch (Throwable th) {
                            th = th;
                            w61Var = w61Var2;
                            if (w61Var != null) {
                                w61Var.OooO0o();
                            }
                            oooO00o.OooO00o();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return -1;
        }
    }

    public Object OooO0o(Object... objArr) throws Exception {
        try {
            return ((Method) this.OooO0oO).invoke(null, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Exception) {
                throw ((Exception) cause);
            }
            throw e;
        }
    }

    public Object OooO0o0(Object... objArr) {
        try {
            return ((Method) this.OooO0oO).invoke(null, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.cmaster.cloner.aw
    public /* bridge */ /* synthetic */ aw OooO0oO(Class cls, zx0 zx0Var) {
        ((HashMap) this.OooO0o0).put(cls, zx0Var);
        ((HashMap) this.OooO0o).remove(cls);
        return this;
    }

    public int OooO0oo(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(i);
            ((zz1) this.OooO0oO).transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.qa1
    public fa1 OooOO0(fa1 fa1Var, xz0 xz0Var) {
        Drawable drawable = (Drawable) fa1Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((oOo000Oo) this.OooO0o).OooOO0(l8.OooO0OO(((BitmapDrawable) drawable).getBitmap(), (k8) this.OooO0o0), xz0Var);
        }
        if (drawable instanceof x40) {
            return ((im2) this.OooO0oO).OooOO0(fa1Var, xz0Var);
        }
        return null;
    }

    public int OooOO0O(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(i);
            ((zz1) this.OooO0oO).transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.yf0
    public void OooOO0o() {
        int i = this.OooO0Oo;
    }

    public void OooOOO(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet = (HashSet) this.OooO0o;
        String string = ((Context) this.OooO0oO).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (og0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    OooOOOO((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new tf(e);
            }
        }
    }

    @Override // com.cmaster.cloner.yf0
    public ImageHeaderParser$ImageType OooOOO0() throws Throwable {
        switch (this.OooO0Oo) {
            case 10:
                return yt2.OooO0OO((List) this.OooO0o, ba.OooO0OO((ByteBuffer) this.OooO0o0));
            default:
                List list = (List) this.OooO0o;
                com.bumptech.glide.load.data.OooO00o oooO00o = (com.bumptech.glide.load.data.OooO00o) this.OooO0oO;
                jp0 jp0Var = (jp0) this.OooO0o0;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    wf0 wf0Var = (wf0) list.get(i);
                    w61 w61Var = null;
                    try {
                        w61 w61Var2 = new w61(new FileInputStream(oooO00o.OooO00o().getFileDescriptor()), jp0Var);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeOooO0OO = wf0Var.OooO0OO(w61Var2);
                            w61Var2.OooO0o();
                            oooO00o.OooO00o();
                            if (imageHeaderParser$ImageTypeOooO0OO != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeOooO0OO;
                            }
                        } catch (Throwable th) {
                            th = th;
                            w61Var = w61Var2;
                            if (w61Var != null) {
                                w61Var.OooO0o();
                            }
                            oooO00o.OooO00o();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public Object OooOOOO(Class cls, HashSet hashSet) {
        Object objOooO0O0;
        HashMap map = (HashMap) this.OooO0o0;
        if (s43.OooO0O0()) {
            try {
                s43.OooO00o(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objOooO0O0 = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                og0 og0Var = (og0) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listOooO00o = og0Var.OooO00o();
                if (!listOooO00o.isEmpty()) {
                    for (Class cls2 : listOooO00o) {
                        if (!map.containsKey(cls2)) {
                            OooOOOO(cls2, hashSet);
                        }
                    }
                }
                objOooO0O0 = og0Var.OooO0O0((Context) this.OooO0oO);
                hashSet.remove(cls);
                map.put(cls, objOooO0O0);
            } catch (Throwable th) {
                throw new tf(th);
            }
        }
        return objOooO0O0;
    }

    public ColorStateList OooOOOo(int i) {
        int resourceId;
        ColorStateList colorStateListOooO0O0;
        TypedArray typedArray = (TypedArray) this.OooO0o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListOooO0O0 = ep2.OooO0O0((Context) this.OooO0o0, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListOooO0O0;
    }

    public Drawable OooOOo(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.OooO0o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : ym2.OooO00o((Context) this.OooO0o0, resourceId);
    }

    public Bundle OooOOo0(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            ((zz1) this.OooO0oO).transact(20, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) l63.OooO00o(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public Drawable OooOOoo(int i, int i2, String str, String str2) {
        synchronized (this) {
            y11 y11VarOooOoOO = OooOoOO(i, str, str2);
            if (y11VarOooOoOO == null) {
                return null;
            }
            try {
                return y11VarOooOoOO.OooO00o.getDrawable(i2, y11VarOooOoOO.OooO0O0);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
    }

    public int[] OooOo(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            ((zz1) this.OooO0oO).transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public Typeface OooOo0(int i, int i2, m0 m0Var) {
        int resourceId = ((TypedArray) this.OooO0o).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.OooO0oO) == null) {
            this.OooO0oO = new TypedValue();
        }
        Context context = (Context) this.OooO0o0;
        TypedValue typedValue = (TypedValue) this.OooO0oO;
        ThreadLocal threadLocal = ta1.OooO00o;
        if (context.isRestricted()) {
            return null;
        }
        return ta1.OooO00o(context, resourceId, typedValue, i2, m0Var, true, false);
    }

    public Drawable OooOo00(int i) {
        int resourceId;
        Drawable drawableOooO0o0;
        if (!((TypedArray) this.OooO0o).hasValue(i) || (resourceId = ((TypedArray) this.OooO0o).getResourceId(i, 0)) == 0) {
            return null;
        }
        n nVarOooO00o = n.OooO00o();
        Context context = (Context) this.OooO0o0;
        synchronized (nVarOooO00o) {
            drawableOooO0o0 = nVarOooO00o.OooO00o.OooO0o0(context, resourceId, true);
        }
        return drawableOooO0o0;
    }

    public ArrayList OooOo0O(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeInt(8192);
            parcelObtain.writeInt(i);
            ((zz1) this.OooO0oO).transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createStringArrayList();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public ArrayList OooOo0o(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(i);
            ((zz1) this.OooO0oO).transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createTypedArrayList(PackageInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public PackageInfo OooOoO(int i, int i2, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            ((zz1) this.OooO0oO).transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (PackageInfo) l63.OooO00o(parcelObtain2, PackageInfo.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public y11 OooOoOO(int i, String str, String str2) {
        z11 z11Var = new z11();
        z11Var.OooO00o = i;
        z11Var.OooO0O0 = str;
        WeakHashMap weakHashMap = (WeakHashMap) this.OooO0o;
        y11 y11Var = (y11) weakHashMap.get(z11Var);
        if (y11Var != null) {
            return y11Var;
        }
        try {
            Resources resourcesOooOoo = OooOoo((Context) this.OooO0o0, str2);
            y11 y11Var2 = new y11(resourcesOooOoo, resourcesOooOoo.newTheme());
            weakHashMap.put(z11Var, y11Var2);
            return y11Var2;
        } catch (Exception unused) {
            return null;
        }
    }

    public Resources OooOoo(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (context == null || str == null) {
            throw new InvalidParameterException(String.format(u7.OooO00o(new byte[]{-123, -94, 5, 31, -5, 93, -30, 67, -37, -19, 78, 24, -78, 5, -9, 19, -115, -19, 86, 75, -69, 86}, new byte[]{-26, -51, 107, 107, -98, 37, -106, 99}), context, str));
        }
        if (yn2.OooO0OO()) {
            synchronized (((WeakHashMap) this.OooO0oO)) {
                try {
                    Resources resources = (Resources) ((WeakHashMap) this.OooO0oO).get(new a21(str));
                    if (resources != null) {
                        return resources;
                    }
                } finally {
                }
            }
        }
        AssetManager assetManager = (AssetManager) AssetManager.class.getConstructor(null).newInstance(null);
        Method declaredMethod = AssetManager.class.getDeclaredMethod(u7.OooO00o(new byte[]{3, -71, -105, -99, -102, -92, -89, -83, 50, -68, -121, -76}, new byte[]{98, -35, -13, -36, -23, -41, -62, -39}), String.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(assetManager, str);
        Resources resources2 = context.getResources();
        Resources resources3 = new Resources(assetManager, resources2.getDisplayMetrics(), resources2.getConfiguration());
        if (!yn2.OooO0OO()) {
            return resources3;
        }
        synchronized (((WeakHashMap) this.OooO0oO)) {
            ((WeakHashMap) this.OooO0oO).put(new a21(str), resources3);
        }
        return resources3;
    }

    public Bundle OooOoo0(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(i);
            ((zz1) this.OooO0oO).transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) l63.OooO00o(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public HashMap OooOooO() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeInt(-1);
            ((zz1) this.OooO0oO).transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readHashMap(a02.class.getClassLoader());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public CharSequence OooOooo(int i, int i2, String str, String str2) {
        synchronized (this) {
            y11 y11VarOooOoOO = OooOoOO(i, str, str2);
            if (y11VarOooOoOO == null) {
                return null;
            }
            try {
                return y11VarOooOoOO.OooO00o.getText(i2);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
    }

    public Bundle Oooo(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(i);
            ((zz1) this.OooO0oO).transact(19, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) l63.OooO00o(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public CharSequence Oooo0(int i, ApplicationInfo applicationInfo) {
        CharSequence charSequenceOooOooo;
        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
        if (charSequence != null) {
            return charSequence;
        }
        String str = applicationInfo.sourceDir;
        if (str == null) {
            return null;
        }
        int i2 = applicationInfo.labelRes;
        if (i2 != 0 && (charSequenceOooOooo = OooOooo(i, i2, applicationInfo.packageName, str)) != null) {
            return charSequenceOooOooo.toString().trim();
        }
        String str2 = applicationInfo.name;
        return str2 != null ? str2 : applicationInfo.packageName;
    }

    public Bundle Oooo000(String str, int i, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            ((zz1) this.OooO0oO).transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) l63.OooO00o(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void Oooo00O(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            ((zz1) this.OooO0oO).transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public int Oooo00o(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(i);
            ((zz1) this.OooO0oO).transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public CharSequence Oooo0O0(int i, ResolveInfo resolveInfo) {
        int i2;
        int i3;
        CharSequence charSequenceOooOooo;
        int i4;
        CharSequence charSequenceOooOooo2;
        CharSequence charSequence = resolveInfo.nonLocalizedLabel;
        if (charSequence != null) {
            return charSequence;
        }
        ComponentInfo componentInfo = resolveInfo.activityInfo;
        CharSequence charSequenceOooOooo3 = null;
        if (componentInfo == null && (componentInfo = resolveInfo.serviceInfo) == null && (componentInfo = resolveInfo.providerInfo) == null) {
            componentInfo = null;
        }
        if (componentInfo == null) {
            return null;
        }
        ApplicationInfo applicationInfo = componentInfo.applicationInfo;
        String str = applicationInfo != null ? applicationInfo.sourceDir : null;
        if (str == null) {
            return null;
        }
        String str2 = resolveInfo.resolvePackageName;
        if (str2 != null && (i4 = resolveInfo.labelRes) != 0 && (charSequenceOooOooo2 = OooOooo(i, i4, str2, str)) != null) {
            return charSequenceOooOooo2.toString().trim();
        }
        int i5 = resolveInfo.labelRes;
        if (i5 != 0 && (charSequenceOooOooo = OooOooo(i, i5, componentInfo.packageName, str)) != null) {
            return charSequenceOooOooo.toString().trim();
        }
        CharSequence charSequence2 = componentInfo.nonLocalizedLabel;
        if (charSequence2 != null) {
            charSequenceOooOooo3 = charSequence2;
        } else {
            ApplicationInfo applicationInfo2 = componentInfo.applicationInfo;
            String str3 = applicationInfo2 != null ? applicationInfo2.sourceDir : null;
            if (str3 != null && (((i2 = componentInfo.labelRes) == 0 || (charSequenceOooOooo3 = OooOooo(i, i2, componentInfo.packageName, str3)) == null) && (charSequenceOooOooo3 = applicationInfo2.nonLocalizedLabel) == null && ((i3 = applicationInfo2.labelRes) == 0 || (charSequenceOooOooo3 = OooOooo(i, i3, componentInfo.packageName, str3)) == null))) {
                charSequenceOooOooo3 = componentInfo.name;
            }
        }
        return charSequenceOooOooo3 != null ? charSequenceOooOooo3.toString().trim() : charSequenceOooOooo3;
    }

    public void Oooo0o(wl0 wl0Var) {
        gf1 gf1Var = (gf1) this.OooO0oO;
        if (gf1Var != null) {
            gf1Var.run();
        }
        gf1 gf1Var2 = new gf1((jm0) this.OooO0o0, wl0Var);
        this.OooO0oO = gf1Var2;
        ((Handler) this.OooO0o).postAtFrontOfQueue(gf1Var2);
    }

    public void Oooo0oO() {
        ((TypedArray) this.OooO0o).recycle();
    }

    public boolean Oooo0oo(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            ((zz1) this.OooO0oO).transact(21, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public boolean OoooO0(int i, String str, String str2, String str3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString(str3);
            parcelObtain.writeInt(i);
            ((zz1) this.OooO0oO).transact(22, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public void OoooO00(g5 g5Var, int i, boolean z) {
        e5 e5Var = (e5) this.OooO0oO;
        Context context = (Context) this.OooO0o0;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = g5Var.OooO00o;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        s41 s41Var = g5Var.OooO0OO;
        adler32.update(byteBufferAllocate.putInt(v41.OooO00o(s41Var)).array());
        byte[] bArr = g5Var.OooO0O0;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        nv2.OooO00o("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", g5Var);
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ((qc1) this.OooO0o).OooO0OO().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(v41.OooO00o(s41Var))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(e5Var.OooO00o(s41Var, jLongValue, i));
            Set set = ((f5) e5Var.OooO0O0.get(s41Var)).OooO0OO;
            if (set.contains(pd1.OooO0Oo)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(pd1.OooO0o)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(pd1.OooO0o0)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", v41.OooO00o(s41Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Log.d("TransportRuntime.".concat("JobInfoScheduler"), String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", g5Var, Integer.valueOf(value), Long.valueOf(e5Var.OooO00o(s41Var, jLongValue, i)), lValueOf, Integer.valueOf(i)));
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public int OoooOO0(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken((String) this.OooO0o);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(0);
            parcelObtain.writeInt(i);
            ((zz1) this.OooO0oO).transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.cmaster.cloner.oc1
    public Object apply(Object obj) {
        qc1 qc1Var;
        qc1 qc1Var2 = (qc1) this.OooO0o0;
        ArrayList arrayList = (ArrayList) this.OooO0o;
        g5 g5Var = (g5) this.OooO0oO;
        Cursor cursor = (Cursor) obj;
        dw dwVar = qc1.OooO0oo;
        while (true) {
            if (!cursor.moveToNext()) {
                break;
            }
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            oO0Ooooo oo0ooooo = new oO0Ooooo(3);
            oo0ooooo.OooOO0 = new HashMap();
            String string = cursor.getString(1);
            if (string == null) {
                qa.OooOOO0("Null transportName");
                break;
            }
            oo0ooooo.OooO0o0 = string;
            oo0ooooo.OooO0oo = Long.valueOf(cursor.getLong(2));
            oo0ooooo.OooO = Long.valueOf(cursor.getLong(3));
            if (z) {
                String string2 = cursor.getString(4);
                oo0ooooo.OooO0oO = new xv(string2 == null ? qc1.OooO0oo : new dw(string2), cursor.getBlob(5));
                qc1Var = qc1Var2;
            } else {
                String string3 = cursor.getString(4);
                dw dwVar2 = string3 == null ? qc1.OooO0oo : new dw(string3);
                Cursor cursorQuery = qc1Var2.OooO0OO().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                try {
                    dw dwVar3 = qc1.OooO0oo;
                    ArrayList arrayList2 = new ArrayList();
                    int length = 0;
                    while (cursorQuery.moveToNext()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        arrayList2.add(blob);
                        length += blob.length;
                    }
                    byte[] bArr = new byte[length];
                    int i = 0;
                    int length2 = 0;
                    while (i < arrayList2.size()) {
                        byte[] bArr2 = (byte[]) arrayList2.get(i);
                        qc1 qc1Var3 = qc1Var2;
                        System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                        length2 += bArr2.length;
                        i++;
                        qc1Var2 = qc1Var3;
                    }
                    qc1Var = qc1Var2;
                    cursorQuery.close();
                    oo0ooooo.OooO0oO = new xv(dwVar2, bArr);
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!cursor.isNull(6)) {
                oo0ooooo.OooO0o = Integer.valueOf(cursor.getInt(6));
            }
            arrayList.add(new d5(j, g5Var, oo0ooooo.OooO0Oo()));
            qc1Var2 = qc1Var;
        }
        return null;
    }

    @Override // com.cmaster.cloner.q51
    public Object get() {
        switch (this.OooO0Oo) {
            case 18:
                return new a02((Context) ((q51) this.OooO0o0).get(), (qc1) ((q51) this.OooO0o).get(), (e5) ((v03) this.OooO0oO).get(), 12);
            default:
                return new ip1(new qc3(14), new v03(), (xo) ((yo) this.OooO0o0).get(), (yn1) ((oO0Ooooo) this.OooO0o).get(), (ho1) ((ho1) this.OooO0oO).get());
        }
    }

    @Override // com.cmaster.cloner.v31
    public void onMenuItemClick(MenuItem menuItem) {
        g80 g80Var;
        xj0 xj0Var = (xj0) this.OooO0o;
        wu1 wu1Var = (wu1) this.OooO0oO;
        String str = wu1Var.OooO0o0;
        qj0 qj0Var = wu1Var.OooOOO0;
        View view = (View) this.OooO0o0;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_create_shortcut) {
            g80 g80Var2 = (g80) j1.OooO0O0(view);
            if (g80Var2 != null) {
                new sl(g80Var2.Oooo(), xj0Var, true).show();
                return;
            }
            return;
        }
        int i = 0;
        if (itemId == R.id.action_icon_fake) {
            g80 g80Var3 = (g80) j1.OooO0O0(view);
            if (g80Var3 != null) {
                new sl(g80Var3.Oooo(), xj0Var, false).show();
                return;
            }
            return;
        }
        if (itemId == R.id.action_force_stop) {
            try {
                OooO0oo.Oooo00O(wu1Var.OooOOO, qj0Var.OooO0O0, sn2.OooO00o("56FBPwr0f8z+\n", "ktIkTSqfFqA=\n"));
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (itemId == R.id.action_clean) {
            g80 g80Var4 = (g80) j1.OooO0O0(view);
            if (g80Var4 == null || str == null) {
                return;
            }
            Context contextOooo = g80Var4.Oooo();
            oO0Ooooo oo0ooooo = new oO0Ooooo(contextOooo);
            oo0ooooo.OooO0o = sn2.OooO00o("I093Z+PVxL4RSGAiusPe60JKcynumsXxQl5+IvvIkf0DXnoitd7Q6gMC\n", "Yj0SR5q6sZ4=\n");
            oo0ooooo.OooO0oO = contextOooo.getText(R.string.action_clear_storage);
            oo0ooooo.OooO0oo = contextOooo.getText(R.string.action_clear_cache);
            oo0ooooo.OooO = contextOooo.getText(R.string.negative);
            oOo000o0 ooo000o0 = new oOo000o0(oo0ooooo);
            ooo000o0.OooOOo0.show();
            ooo000o0.OooO0o0(g80Var4.OooOOOo(), new k1(wu1Var, 15));
            return;
        }
        if (itemId == R.id.action_uninstall) {
            g80 g80Var5 = (g80) j1.OooO0O0(view);
            if (g80Var5 == null || str == null) {
                return;
            }
            new AlertDialog.Builder(g80Var5.Oooo()).setMessage(sn2.OooO00o("tSvsLbN1TR6HLPto6mNXS9Qu6GO+OkxR1CznZKRpTF+YNbY=\n", "9FmJDcoaOD4=\n")).setCancelable(false).setPositiveButton(sn2.OooO00o("qzPo\n", "8labp0xSOUA=\n"), new bv1(g80Var5, wu1Var, i)).setNegativeButton(sn2.OooO00o("4Dc=\n", "rljG15g5OyU=\n"), new av1(0)).create().show();
            return;
        }
        if (itemId == R.id.action_app_hide_show) {
            if (qj0Var.OooO0O0() == 1) {
                qj0Var.OooO0o0(0);
                qj0Var.OooO0OO();
                wu1Var.OooOOo0 = 0;
                wu1Var.OooO0o0();
                return;
            }
            qj0Var.OooO0o0(1);
            qj0Var.OooO0OO();
            wu1Var.OooOOo0 = 1;
            wu1Var.OooO0o0();
            return;
        }
        if (itemId == R.id.action_clone_next) {
            g80 g80Var6 = (g80) j1.OooO0O0(view);
            if (g80Var6 != null) {
                NumberPicker numberPicker = new NumberPicker(g80Var6.Oooo());
                numberPicker.setMinValue(1);
                numberPicker.setMaxValue(20);
                new AlertDialog.Builder(g80Var6.Oooo()).setView(numberPicker).setCancelable(true).setPositiveButton(R.string.positive, new zu1(g80Var6, numberPicker, wu1Var)).setNegativeButton(R.string.negative, (DialogInterface.OnClickListener) null).create().show();
                return;
            }
            return;
        }
        if (itemId == R.id.action_note) {
            g80 g80Var7 = (g80) j1.OooO0O0(view);
            if (g80Var7 != null) {
                new AlertDialog.Builder(g80Var7.Oooo()).setView(R.layout.edit_note).setCancelable(true).setPositiveButton(R.string.positive, new jn0(wu1Var, 2)).setNegativeButton(R.string.negative, (DialogInterface.OnClickListener) null).create().show();
                return;
            }
            return;
        }
        if ((itemId == R.id.action_clone_mode || itemId == R.id.action_auto_fix) && (g80Var = (g80) j1.OooO0O0(view)) != null) {
            g80Var.OoooOOO().OooOo0(new u91(this, 9));
        }
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 16:
                StringBuilder sb = new StringBuilder();
                sb.append(u7.OooO00o(new byte[]{101, 126, 45, 5, -25, 5, 17, -14, 84, 86, 46, 34, -5, 11, 1, -32}, new byte[]{55, 27, 75, 86, -109, 100, 101, -101}));
                sb.append((String) this.OooO0o);
                sb.append(u7.OooO00o(new byte[]{38}, new byte[]{102, -99, 93, 104, -128, -40, 92, -16}));
                sb.append((String) this.OooO0o0);
                sb.append(u7.OooO00o(new byte[]{77, -120, -85, 82, -83, -8}, new byte[]{109, -18, -62, 60, -55, -59, 118, -45}));
                sb.append(((Method) this.OooO0oO) != null);
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public void zza() {
        zzbef zzbefVar = (zzbef) this.OooO0o0;
        o0O000O o0o000oOooO0O0 = new km(zzbefVar.zza()).OooO0O0();
        Intent intent = (Intent) o0o000oOooO0O0.OooO0o0;
        Context context = (Context) this.OooO0o;
        intent.setPackage(zzhhh.zza(context));
        intent.setData((Uri) this.OooO0oO);
        context.startActivity(intent, (Bundle) o0o000oOooO0O0.OooO0o);
        zzbefVar.zzf((Activity) context);
    }

    public /* synthetic */ a02(Object obj, Object obj2, Object obj3, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
        this.OooO0oO = obj3;
    }

    public /* synthetic */ a02(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj2;
        this.OooO0o = obj3;
        this.OooO0oO = obj4;
    }

    public a02(Class cls, String str, Class[] clsArr) throws SecurityException {
        Method method;
        this.OooO0Oo = 16;
        this.OooO0o0 = str;
        this.OooO0o = cls.getName();
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            this.OooO0oO = declaredMethod;
            declaredMethod.setAccessible(true);
        } finally {
            if (method != null) {
            }
        }
    }

    public a02(lm0 lm0Var) {
        this.OooO0Oo = 19;
        this.OooO0o0 = new jm0(lm0Var);
        this.OooO0o = new Handler();
    }

    public /* synthetic */ a02(int i, boolean z) {
        this.OooO0Oo = i;
    }

    public a02(Context context, TypedArray typedArray) {
        this.OooO0Oo = 21;
        this.OooO0o0 = context;
        this.OooO0o = typedArray;
    }

    public a02(Runnable runnable) {
        this.OooO0Oo = 13;
        this.OooO0o = new CopyOnWriteArrayList();
        this.OooO0oO = new HashMap();
        this.OooO0o0 = runnable;
    }

    public a02(Context context, int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 15:
                this.OooO0o = new WeakHashMap();
                this.OooO0oO = new WeakHashMap();
                new Configuration();
                this.OooO0o0 = context;
                break;
            default:
                this.OooO0oO = context.getApplicationContext();
                this.OooO0o = new HashSet();
                this.OooO0o0 = new HashMap();
                break;
        }
    }

    public a02(Class cls) {
        this.OooO0Oo = 14;
        HashSet hashSet = new HashSet();
        this.OooO0oO = hashSet;
        this.OooO0o0 = UUID.randomUUID();
        this.OooO0o = new w02(((UUID) this.OooO0o0).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((w02) this.OooO0o).OooO0Oo = OverwritingInputMerger.class.getName();
    }

    public a02(String str) {
        this.OooO0Oo = 0;
        this.OooO0oO = new zz1(this);
        this.OooO0o = str;
    }

    public a02(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, jp0 jp0Var) {
        this.OooO0Oo = 11;
        zx2.OooO0OO(jp0Var, "Argument must not be null");
        this.OooO0o0 = jp0Var;
        zx2.OooO0OO(arrayList, "Argument must not be null");
        this.OooO0o = arrayList;
        this.OooO0oO = new com.bumptech.glide.load.data.OooO00o(parcelFileDescriptor);
    }

    public a02(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 24:
                List list = Collections.EMPTY_LIST;
                this.OooO0o0 = list;
                this.OooO0o = list;
                break;
            case 25:
                this.OooO0o0 = new HashMap();
                this.OooO0o = new HashMap();
                this.OooO0oO = rk0.OooO0Oo;
                break;
            default:
                this.OooO0o0 = vv1.OooO00o();
                this.OooO0o = new SparseArray();
                this.OooO0oO = new SparseArray();
                break;
        }
    }

    public a02(URL url, s4 s4Var, String str) {
        this.OooO0Oo = 5;
        this.OooO0o0 = url;
        this.OooO0oO = s4Var;
        this.OooO0o = str;
    }

    public a02(kw kwVar, kh1 kh1Var, ow owVar) {
        this.OooO0Oo = 9;
        this.OooO0oO = kwVar;
        this.OooO0o = kh1Var;
        this.OooO0o0 = owVar;
    }
}
