package com.cmaster.cloner;

import android.animation.Animator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.bumptech.matrix.business.BusinessDatabase;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e81 implements v31, la1, hb, xs1, bv, iy, hn, ts {
    public static final rz0 OooO0oO = new rz0();
    public static final qz0 OooO0oo = new qz0();
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;

    public e81(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 3:
                this.OooO0o0 = Choreographer.getInstance();
                this.OooO0o = Looper.myLooper();
                break;
            case 4:
                this.OooO0o0 = new Rect();
                this.OooO0o = new Rect();
                break;
            case 13:
                this.OooO0o0 = new HashMap();
                this.OooO0o = new o00OO000(12, (byte) 0);
                break;
            case 19:
                this.OooO0o0 = new z60(null);
                this.OooO0o = new HashMap();
                break;
            case 22:
                this.OooO0o0 = new AtomicReference();
                this.OooO0o = new k3(0);
                break;
            case 25:
                this.OooO0o0 = new ArrayList();
                this.OooO0o = new HashMap();
                break;
            case 26:
                this.OooO0o0 = new mp0(1000L);
                this.OooO0o = z52.OooO00o(10, new s60());
                break;
            default:
                this.OooO0o0 = new gv0();
                this.OooO0o = new uf1();
                OooOoo(OooO0oo);
                break;
        }
    }

    public static oO0O0Oo0 OooO0OO(ImageDecoder.Source source, int i, int i2, xz0 xz0Var) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new vo(i, i2, xz0Var));
        if (o0000oo.OooOo0O(drawableDecodeDrawable)) {
            return new oO0O0Oo0(o0000oo.OooO0o(drawableDecodeDrawable), 0);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public static Activity OooOO0() {
        Object objValueAt;
        l81 l81Var;
        Object objOooO00o = o0OO0oO0.OooO00o();
        l81 l81Var2 = o0OO0oO0.OooO0O0;
        ArrayMap arrayMap = l81Var2 != null ? (ArrayMap) l81Var2.OooO0O0(objOooO00o) : null;
        if (arrayMap == null || arrayMap.isEmpty() || (objValueAt = arrayMap.valueAt(0)) == null || (l81Var = o0OO0.OooO0O0) == null) {
            return null;
        }
        return (Activity) l81Var.OooO0O0(objValueAt);
    }

    public static e81 OooOOOo(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(R.layout.device_item, viewGroup, false);
        viewGroup.addView(viewInflate);
        TextInputEditText textInputEditText = (TextInputEditText) l53.OooO00o(viewInflate, R.id.input);
        if (textInputEditText != null) {
            return new e81((TextInputLayout) viewInflate, textInputEditText, 12);
        }
        qa.OooOOO0(sn2.OooO00o("U4Z2F6Y22r5sinQRpirY+j6ZbAG4eMr3aoclLYtinQ==\n", "Hu8FZM9YvZ4=\n").concat(viewInflate.getResources().getResourceName(R.id.input)));
        return null;
    }

    public Object OooO(g31 g31Var) {
        HashMap map = (HashMap) this.OooO0o;
        z60 z60Var = (z60) map.get(g31Var);
        if (z60Var == null) {
            z60Var = new z60(g31Var);
            map.put(g31Var, z60Var);
        } else {
            g31Var.OooO00o();
        }
        z60 z60Var2 = z60Var.OooO0Oo;
        z60Var2.OooO0OO = z60Var.OooO0OO;
        z60Var.OooO0OO.OooO0Oo = z60Var2;
        z60 z60Var3 = (z60) this.OooO0o0;
        z60Var.OooO0Oo = z60Var3;
        z60 z60Var4 = z60Var3.OooO0OO;
        z60Var.OooO0OO = z60Var4;
        z60Var4.OooO0Oo = z60Var;
        z60Var.OooO0Oo.OooO0OO = z60Var;
        ArrayList arrayList = z60Var.OooO0O0;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return z60Var.OooO0O0.remove(size - 1);
        }
        return null;
    }

    @Override // com.cmaster.cloner.bv
    public boolean OooO00o(CharSequence charSequence, int i, int i2, nq1 nq1Var) {
        if ((nq1Var.OooO0OO & 4) > 0) {
            return true;
        }
        if (((ar1) this.OooO0o0) == null) {
            this.OooO0o0 = new ar1(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((je) this.OooO0o).getClass();
        ((ar1) this.OooO0o0).setSpan(new oq1(nq1Var), i, i2, 33);
        return true;
    }

    @Override // com.cmaster.cloner.hn
    public void OooO0O0(Exception exc) {
        yh1 yh1Var = (yh1) this.OooO0o;
        hu0 hu0Var = (hu0) this.OooO0o0;
        hu0 hu0Var2 = yh1Var.OooO;
        if (hu0Var2 == null || hu0Var2 != hu0Var) {
            return;
        }
        yh1 yh1Var2 = (yh1) this.OooO0o;
        hu0 hu0Var3 = (hu0) this.OooO0o0;
        vn vnVar = yh1Var2.OooO0o0;
        gn gnVar = yh1Var2.OooOO0;
        in inVar = hu0Var3.OooO0OO;
        vnVar.OooO0O0(gnVar, exc, inVar, inVar.OooO0o());
    }

    @Override // com.cmaster.cloner.ts
    public void OooO0Oo() {
        w61 w61Var = (w61) this.OooO0o0;
        synchronized (w61Var) {
            w61Var.OooO0o = w61Var.OooO0Oo.length;
        }
    }

    @Override // com.cmaster.cloner.la1
    public int OooO0o(xz0 xz0Var) {
        return 2;
    }

    @Override // com.cmaster.cloner.ts
    public void OooO0o0(Bitmap bitmap, k8 k8Var) throws IOException {
        IOException iOException = ((cx) this.OooO0o).OooO0o0;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            k8Var.OooO0O0(bitmap);
            throw iOException;
        }
    }

    @Override // com.cmaster.cloner.hn
    public void OooO0oO(Object obj) {
        yh1 yh1Var = (yh1) this.OooO0o;
        hu0 hu0Var = (hu0) this.OooO0o0;
        hu0 hu0Var2 = yh1Var.OooO;
        if (hu0Var2 == null || hu0Var2 != hu0Var) {
            return;
        }
        yh1 yh1Var2 = (yh1) this.OooO0o;
        hu0 hu0Var3 = (hu0) this.OooO0o0;
        vr vrVar = yh1Var2.OooO0Oo.OooOOOo;
        if (obj == null || !vrVar.OooO0OO(hu0Var3.OooO0OO.OooO0o())) {
            vn vnVar = yh1Var2.OooO0o0;
            zk0 zk0Var = hu0Var3.OooO00o;
            in inVar = hu0Var3.OooO0OO;
            vnVar.OooO00o(zk0Var, obj, inVar, inVar.OooO0o(), yh1Var2.OooOO0);
            return;
        }
        yh1Var2.OooO0oo = obj;
        vn vnVar2 = yh1Var2.OooO0o0;
        vnVar2.Oooo00O = 2;
        ow owVar = vnVar2.OooOOoo;
        (owVar.OooOOOo ? owVar.OooOO0o : owVar.OooOO0O).execute(vnVar2);
    }

    public void OooO0oo(Activity activity) {
        oO00Oo0 oo00oo0 = (oO00Oo0) this.OooO0o;
        oo00oo0.OooO0o.OooO0OO().o000Oo0O((ce) this.OooO0o0);
        Toast.makeText(activity, u7.OooO00o(new byte[]{-67, -74, -104, 91, 9, -121, -23, -127, -72}, new byte[]{-56, -59, -3, 123, 125, -11, -100, -20}) + oo00oo0.OooO0o0, 0).show();
    }

    @Override // com.cmaster.cloner.zv
    public boolean OooOO0O(Object obj, File file, xz0 xz0Var) {
        return ((g8) this.OooO0o).OooOO0O(new l8(((BitmapDrawable) ((fa1) obj).get()).getBitmap(), (k8) this.OooO0o0), file, xz0Var);
    }

    public KeyListener OooOO0o(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((o0O000O) ((o00OO000) this.OooO0o).OooO0o0).getClass();
        if (keyListener instanceof av) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new av(keyListener);
    }

    public synchronized ArrayList OooOOO(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.OooO0o0;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            List<ja1> list = (List) ((HashMap) this.OooO0o).get((String) obj);
            if (list != null) {
                for (ja1 ja1Var : list) {
                    if ((ja1Var.OooO00o.isAssignableFrom(cls) && cls2.isAssignableFrom(ja1Var.OooO0O0)) && !arrayList.contains(ja1Var.OooO0O0)) {
                        arrayList.add(ja1Var.OooO0O0);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List OooOOO0(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.OooO0o0).contains(str)) {
                ((ArrayList) this.OooO0o0).add(str);
            }
            arrayList = (List) ((HashMap) this.OooO0o).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.OooO0o).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public String OooOOOO(zk0 zk0Var) {
        String str;
        synchronized (((mp0) this.OooO0o0)) {
            str = (String) ((mp0) this.OooO0o0).OooO00o(zk0Var);
        }
        if (str == null) {
            xc1 xc1Var = (xc1) ((hx2) this.OooO0o).OooO0oo();
            try {
                zk0Var.OooO00o(xc1Var.OooO0Oo);
                byte[] bArrDigest = xc1Var.OooO0Oo.digest();
                char[] cArr = pr1.OooO0O0;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = pr1.OooO00o;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((hx2) this.OooO0o).OooO0O0(xc1Var);
            }
        }
        synchronized (((mp0) this.OooO0o0)) {
            ((mp0) this.OooO0o0).OooO0Oo(zk0Var, str);
        }
        return str;
    }

    public void OooOOo(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.OooO0o0).getContext().obtainStyledAttributes(attributeSet, l61.OooO, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            OooOoOO(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void OooOOo0(c81 c81Var) {
        aq2.OooO0O0((tb1) this.OooO0o0, false, true, new OooOOO0(this, c81Var, 3));
    }

    public xu OooOOoo(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        o00OO000 o00oo000 = (o00OO000) this.OooO0o;
        if (inputConnection == null) {
            o00oo000.getClass();
            inputConnection2 = null;
        } else {
            o0O000O o0o000o = (o0O000O) o00oo000.OooO0o0;
            o0o000o.getClass();
            if (!(inputConnection instanceof xu)) {
                inputConnection = new xu(editorInfo, inputConnection, (EditText) o0o000o.OooO0o0);
            }
            inputConnection2 = inputConnection;
        }
        return (xu) inputConnection2;
    }

    public void OooOo(String str) {
        wr wrVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.OooO0o0).get(str);
                zx2.OooO0OO(obj, "Argument must not be null");
                wrVar = (wr) obj;
                int i = wrVar.OooO0O0;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + wrVar.OooO0O0);
                }
                int i2 = i - 1;
                wrVar.OooO0O0 = i2;
                if (i2 == 0) {
                    wr wrVar2 = (wr) ((HashMap) this.OooO0o0).remove(str);
                    if (!wrVar2.equals(wrVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + wrVar + ", but actually removed: " + wrVar2 + ", safeKey: " + str);
                    }
                    o00OO000 o00oo000 = (o00OO000) this.OooO0o;
                    synchronized (((ArrayDeque) o00oo000.OooO0o0)) {
                        try {
                            if (((ArrayDeque) o00oo000.OooO0o0).size() < 10) {
                                ((ArrayDeque) o00oo000.OooO0o0).offer(wrVar2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wrVar.OooO00o.unlock();
    }

    public void OooOo0(Bundle bundle) {
        id1 id1Var = (id1) this.OooO0o0;
        jd1 jd1Var = id1Var.OooO00o;
        if (!id1Var.OooO0o0) {
            id1Var.OooO00o();
        }
        if (jd1Var.OooO0o().OooO0o.compareTo(xl0.OooO0oO) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + jd1Var.OooO0o().OooO0o).toString());
        }
        if (id1Var.OooO0oO) {
            qa.OooO0o("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleOooO00o = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleOooO00o = w33.OooO00o(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        id1Var.OooO0o = bundleOooO00o;
        id1Var.OooO0oO = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0205, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105 A[Catch: IOException -> 0x008d, XmlPullParserException -> 0x0090, TryCatch #2 {IOException -> 0x008d, XmlPullParserException -> 0x0090, blocks: (B:19:0x005e, B:96:0x0205, B:27:0x0070, B:28:0x007e, B:30:0x0083, B:37:0x0093, B:45:0x00ad, B:40:0x009c, B:43:0x00a5, B:46:0x00bb, B:50:0x00ca, B:52:0x00d2, B:53:0x00dc, B:62:0x0105, B:63:0x010c, B:64:0x0124, B:56:0x00e5, B:58:0x00ed, B:59:0x00fb, B:65:0x0125, B:67:0x012d, B:68:0x013b, B:71:0x0145, B:72:0x0150, B:73:0x0168, B:74:0x0169, B:77:0x0173, B:78:0x017e, B:79:0x0196, B:80:0x0197, B:82:0x019f, B:83:0x01a8, B:86:0x01b2, B:87:0x01bc, B:88:0x01d4, B:89:0x01d5, B:92:0x01df, B:93:0x01e9, B:94:0x0201, B:95:0x0202), top: B:104:0x005e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooOo00(android.content.Context r10, android.content.res.XmlResourceParser r11) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.e81.OooOo00(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void OooOo0O(Bundle bundle) {
        id1 id1Var = (id1) this.OooO0o0;
        Bundle bundleOooO00o = co2.OooO00o((k21[]) Arrays.copyOf(new k21[0], 0));
        Bundle bundle2 = id1Var.OooO0o;
        if (bundle2 != null) {
            bundleOooO00o.putAll(bundle2);
        }
        synchronized (id1Var.OooO0OO) {
            for (Map.Entry entry : id1Var.OooO0Oo.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleOooO00o2 = ((gd1) entry.getValue()).OooO00o();
                str.getClass();
                bundleOooO00o.putBundle(str, bundleOooO00o2);
            }
        }
        if (bundleOooO00o.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleOooO00o);
    }

    public void OooOo0o(g31 g31Var, Object obj) {
        HashMap map = (HashMap) this.OooO0o;
        z60 z60Var = (z60) map.get(g31Var);
        if (z60Var == null) {
            z60Var = new z60(g31Var);
            z60Var.OooO0Oo = z60Var;
            z60 z60Var2 = (z60) this.OooO0o0;
            z60Var.OooO0Oo = z60Var2.OooO0Oo;
            z60Var.OooO0OO = z60Var2;
            z60Var2.OooO0Oo = z60Var;
            z60Var.OooO0Oo.OooO0OO = z60Var;
            map.put(g31Var, z60Var);
        } else {
            g31Var.OooO00o();
        }
        if (z60Var.OooO0O0 == null) {
            z60Var.OooO0O0 = new ArrayList();
        }
        z60Var.OooO0O0.add(obj);
    }

    public void OooOoO(AlertDialog alertDialog) {
        Window window = alertDialog.getWindow();
        if (window == null) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius((int) (16.0f * ((Context) this.OooO0o0).getResources().getDisplayMetrics().density));
        window.setBackgroundDrawable(gradientDrawable);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (OooOO0().getResources().getDisplayMetrics().widthPixels * 0.9f);
        window.setDimAmount(0.4f);
        window.setAttributes(attributes);
    }

    public Object OooOoO0() {
        z60 z60Var = (z60) this.OooO0o0;
        z60 z60Var2 = z60Var.OooO0Oo;
        while (true) {
            boolean zEquals = z60Var2.equals(z60Var);
            Object obj = z60Var2.OooO00o;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = z60Var2.OooO0O0;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? z60Var2.OooO0O0.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            z60 z60Var3 = z60Var2.OooO0Oo;
            z60Var3.OooO0OO = z60Var2.OooO0OO;
            z60Var2.OooO0OO.OooO0Oo = z60Var3;
            ((HashMap) this.OooO0o).remove(obj);
            ((g31) obj).OooO00o();
            z60Var2 = z60Var2.OooO0Oo;
        }
    }

    public void OooOoOO(boolean z) {
        hv hvVar = (hv) ((o0O000O) ((o00OO000) this.OooO0o).OooO0o0).OooO0o;
        if (hvVar.OooO0o != z) {
            if (hvVar.OooO0o0 != null) {
                su suVarOooO00o = su.OooO00o();
                gv gvVar = hvVar.OooO0o0;
                suVarOooO00o.getClass();
                fy2.OooO00o(gvVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = suVarOooO00o.OooO00o;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    suVarOooO00o.OooO0O0.remove(gvVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            hvVar.OooO0o = z;
            if (z) {
                hv.OooO00o(hvVar.OooO0Oo, su.OooO00o().OooO0O0());
            }
        }
    }

    public void OooOoo(yw2 yw2Var) {
        uf1 uf1Var = (uf1) this.OooO0o;
        ((gv0) this.OooO0o0).OooOO0(yw2Var);
        if (yw2Var instanceof rz0) {
            uf1Var.OooO0oo((rz0) yw2Var);
        } else if (yw2Var instanceof pz0) {
            uf1Var.OooO(((pz0) yw2Var).OooO00o);
        }
    }

    public void OooOoo0(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.OooO0o;
        cardView.OooO0oO.set(i, i2, i3, i4);
        Rect rect = cardView.OooO0o;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    @Override // com.cmaster.cloner.q51
    public Object get() {
        return new ot0((Context) ((uf) this.OooO0o0).OooO0Oo, (a02) ((o00OO000) this.OooO0o).get());
    }

    @Override // com.cmaster.cloner.bv
    public Object getResult() {
        return (ar1) this.OooO0o0;
    }

    @Override // com.cmaster.cloner.xs1
    public View getRoot() {
        return (TextInputLayout) this.OooO0o0;
    }

    @Override // com.cmaster.cloner.hb
    public void onCancel() {
        ((Animator) this.OooO0o0).end();
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((ei1) this.OooO0o) + " has been canceled.");
        }
    }

    @Override // com.cmaster.cloner.v31
    public void onMenuItemClick(MenuItem menuItem) {
        g80 g80Var = (g80) this.OooO0o0;
        k2 k2Var = (k2) this.OooO0o;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_import) {
            g80Var.OoooOoO(k2Var.OooO0o0);
            return;
        }
        if (itemId == R.id.action_device) {
            Context contextOooo = g80Var.Oooo();
            int i = k2Var.OooO0o0;
            Bundle bundle = new Bundle();
            bundle.putInt(sn2.OooO00o("py3jUs+gZQyvLfNFzr0vR7439UGOnFJnlA==\n", "xkOHIKDJASI=\n"), i);
            bundle.putString(sn2.OooO00o("WU0JK/X/cStRTRk89OI7YEBXHzi0xlRGc2IqHMXYVEh9\n", "OCNtWZqWFQU=\n"), null);
            j1.OooO0Oo(contextOooo, gq.class, bundle);
            return;
        }
        if (itemId == R.id.action_add_account) {
            int i2 = k2Var.OooO0o0;
            int i3 = t60.OooO00o;
            try {
                a02.OooO0oo.OooO0O0(i2);
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 19:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                z60 z60Var = (z60) this.OooO0o0;
                z60 z60Var2 = z60Var.OooO0OO;
                boolean z = false;
                while (!z60Var2.equals(z60Var)) {
                    sb.append('{');
                    sb.append(z60Var2.OooO00o);
                    sb.append(':');
                    ArrayList arrayList = z60Var2.OooO0O0;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    z60Var2 = z60Var2.OooO0OO;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e81(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o = null;
        this.OooO0o0 = obj;
    }

    public /* synthetic */ e81(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
    }

    public /* synthetic */ e81(Object obj, Object obj2, int i, boolean z) {
        this.OooO0Oo = i;
        this.OooO0o = obj;
        this.OooO0o0 = obj2;
    }

    public e81(id1 id1Var) {
        this.OooO0Oo = 27;
        this.OooO0o0 = id1Var;
        this.OooO0o = new o0O000O(id1Var, 27);
    }

    public e81(BusinessDatabase businessDatabase) {
        this.OooO0Oo = 0;
        this.OooO0o0 = businessDatabase;
        this.OooO0o = new v03();
    }

    public /* synthetic */ e81(int i, boolean z) {
        this.OooO0Oo = i;
    }

    public e81(EditText editText) {
        this.OooO0Oo = 5;
        this.OooO0o0 = editText;
        this.OooO0o = new o00OO000(editText);
    }

    public e81(im2 im2Var, int i, int i2, int i3, int i4) {
        this.OooO0Oo = 23;
        this.OooO0o0 = new b01(im2Var, i, i3, i4);
        this.OooO0o = new ArrayList(i2);
    }

    public e81(Animator animator) {
        this.OooO0Oo = 16;
        this.OooO0o0 = null;
        this.OooO0o = animator;
    }

    public e81(ArrayList arrayList, ArrayList arrayList2) {
        this.OooO0Oo = 18;
        int size = arrayList.size();
        this.OooO0o0 = new int[size];
        this.OooO0o = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.OooO0o0)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.OooO0o)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public e81(int i, int i2) {
        this.OooO0Oo = 18;
        this.OooO0o0 = new int[]{i, i2};
        this.OooO0o = new float[]{0.0f, 1.0f};
    }

    public e81(int i, int i2, int i3) {
        this.OooO0Oo = 18;
        this.OooO0o0 = new int[]{i, i2, i3};
        this.OooO0o = new float[]{0.0f, 0.5f, 1.0f};
    }

    public e81(CardView cardView) {
        this.OooO0Oo = 8;
        this.OooO0o = cardView;
    }
}
