package com.cmaster.cloner;

import android.content.ClipDescription;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.content.pm.PermissionGroupInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.icu.text.AlphabeticIndex;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.ArrayMap;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hx2 implements g2, aw, bl1, r31, yf0, tg0, oc1, zl1, dg2 {
    public static final rk0 OooO = new rk0(4);
    public static hx2 OooO0oo;
    public static hx2 OooOO0;
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;

    public hx2(App app) {
        this.OooO0Oo = 2;
        LocaleList locales = app.getResources().getConfiguration().getLocales();
        this.OooO0oO = new ConcurrentHashMap();
        int size = locales.size();
        Locale locale = size == 0 ? Locale.ENGLISH : locales.get(0);
        AlphabeticIndex alphabeticIndex = new AlphabeticIndex(locale);
        for (int i = 1; i < size; i++) {
            alphabeticIndex.addLabels(locales.get(i));
        }
        alphabeticIndex.addLabels(Locale.ENGLISH);
        this.OooO0o = alphabeticIndex.buildImmutableIndex();
        if (locale.getLanguage().equals(Locale.JAPANESE.getLanguage())) {
            this.OooO0o0 = "他";
        } else {
            this.OooO0o0 = "∙";
        }
    }

    public static boolean OooOOOO(Editable editable, KeyEvent keyEvent, boolean z) {
        oq1[] oq1VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (oq1VarArr = (oq1[]) editable.getSpans(selectionStart, selectionEnd, oq1.class)) != null && oq1VarArr.length > 0) {
                for (oq1 oq1Var : oq1VarArr) {
                    int spanStart = editable.getSpanStart(oq1Var);
                    int spanEnd = editable.getSpanEnd(oq1Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final SharedPreferences OooOooo(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void Oooo000(Context context) {
        if (OooOooo(context).edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new dv2("Failed to store the app set ID last used time.");
    }

    @Override // com.cmaster.cloner.yf0
    public Bitmap OooO(BitmapFactory.Options options) {
        w61 w61Var = (w61) ((xb1) this.OooO0o0).OooO0o0;
        w61Var.reset();
        return BitmapFactory.decodeStream(w61Var, null, options);
    }

    @Override // com.cmaster.cloner.g2
    public ac3 OooO00o() {
        yl1 yl1Var = new yl1();
        ((ExecutorService) this.OooO0oO).execute(new bf1(this, yl1Var, 21, false));
        return yl1Var.OooO00o;
    }

    @Override // com.cmaster.cloner.r31
    public boolean OooO0O0(Object obj) {
        if (obj instanceof ky) {
            ((ky) obj).OooO0OO().OooO00o = true;
        }
        ((ly) this.OooO0o).OooO0Oo(obj);
        return ((t31) this.OooO0oO).OooO0O0(obj);
    }

    @Override // com.cmaster.cloner.tg0
    public Uri OooO0OO() {
        return (Uri) this.OooO0o0;
    }

    @Override // com.cmaster.cloner.yf0
    public int OooO0Oo() {
        List list = (List) this.OooO0oO;
        w61 w61Var = (w61) ((xb1) this.OooO0o0).OooO0o0;
        w61Var.reset();
        return yt2.OooO00o(list, w61Var, (jp0) this.OooO0o);
    }

    @Override // com.cmaster.cloner.tg0
    public Uri OooO0o() {
        return (Uri) this.OooO0oO;
    }

    @Override // com.cmaster.cloner.tg0
    public void OooO0o0() {
    }

    @Override // com.cmaster.cloner.aw
    public /* bridge */ /* synthetic */ aw OooO0oO(Class cls, zx0 zx0Var) {
        ((HashMap) this.OooO0o0).put(cls, zx0Var);
        ((HashMap) this.OooO0o).remove(cls);
        return this;
    }

    @Override // com.cmaster.cloner.r31
    public Object OooO0oo() {
        Object objOooO0oo = ((t31) this.OooO0oO).OooO0oo();
        if (objOooO0oo == null) {
            objOooO0oo = ((jy) this.OooO0o0).OooO0oO();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objOooO0oo.getClass());
            }
        }
        if (objOooO0oo instanceof ky) {
            ((ky) objOooO0oo).OooO0OO().OooO00o = false;
        }
        return objOooO0oo;
    }

    @Override // com.cmaster.cloner.tg0
    public Object OooOO0() {
        return null;
    }

    @Override // com.cmaster.cloner.bl1
    public Object OooOO0O() {
        xo xoVar = (xo) this.OooO0o0;
        g5 g5Var = (g5) this.OooO0o;
        x4 x4Var = (x4) this.OooO0oO;
        qc1 qc1Var = xoVar.OooO0Oo;
        qc1Var.getClass();
        s41 s41Var = g5Var.OooO0OO;
        String str = x4Var.OooO00o;
        String str2 = g5Var.OooO00o;
        Log.d("TransportRuntime.".concat("SQLiteEventStore"), "Storing event with priority=" + s41Var + ", name=" + str + " for destination " + str2);
        ((Long) qc1Var.OooO0oo(new hx2(qc1Var, g5Var, x4Var, 16))).getClass();
        xoVar.OooO00o.OoooO00(g5Var, 1, false);
        return null;
    }

    @Override // com.cmaster.cloner.yf0
    public void OooOO0o() {
        w61 w61Var = (w61) ((xb1) this.OooO0o0).OooO0o0;
        synchronized (w61Var) {
            w61Var.OooO0o = w61Var.OooO0Oo.length;
        }
    }

    public String OooOOO(String str) {
        String strReplaceAll;
        if (str == null) {
            Pattern pattern = sr1.OooO00o;
            strReplaceAll = "";
        } else {
            strReplaceAll = sr1.OooO00o.matcher(str).replaceAll("$1");
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.OooO0oO;
        String str2 = (String) concurrentHashMap.get(strReplaceAll);
        if (str2 != null) {
            return str2;
        }
        AlphabeticIndex.ImmutableIndex immutableIndex = (AlphabeticIndex.ImmutableIndex) this.OooO0o;
        String label = immutableIndex.getBucket(immutableIndex.getBucketIndex(strReplaceAll)).getLabel();
        if ((label != null ? sr1.OooO00o.matcher(label).replaceAll("$1") : "").isEmpty() && strReplaceAll.length() > 0) {
            int iCodePointAt = strReplaceAll.codePointAt(0);
            label = Character.isDigit(iCodePointAt) ? "#" : Character.isLetter(iCodePointAt) ? (String) this.OooO0o0 : "∙";
        }
        concurrentHashMap.put(strReplaceAll, label);
        return label;
    }

    @Override // com.cmaster.cloner.yf0
    public ImageHeaderParser$ImageType OooOOO0() {
        List list = (List) this.OooO0oO;
        w61 w61Var = (w61) ((xb1) this.OooO0o0).OooO0o0;
        w61Var.reset();
        return yt2.OooO0O0(list, w61Var, (jp0) this.OooO0o);
    }

    public void OooOOOo(Runnable runnable) {
        ((af1) this.OooO0o0).execute(runnable);
    }

    public gl1 OooOOo(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0o0;
        wb1 wb1VarOooO0OO = wb1.OooO0OO(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            wb1VarOooO0OO.OooO0O0(1);
        } else {
            wb1VarOooO0OO.OooO0Oo(1, str);
        }
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
        try {
            return cursorOooO0OO.moveToFirst() ? new gl1(cursorOooO0OO.getString(wp2.OooO00o(cursorOooO0OO, "work_spec_id")), cursorOooO0OO.getInt(wp2.OooO00o(cursorOooO0OO, "system_id"))) : null;
        } finally {
            cursorOooO0OO.close();
            wb1VarOooO0OO.OooO0o();
        }
    }

    public ArrayList OooOOo0(int i) {
        ArrayList arrayList;
        PermissionGroupInfo permissionGroupInfo;
        synchronized (((t62) this.OooO0o0)) {
            try {
                arrayList = new ArrayList(((ArrayMap) this.OooO0oO).size());
                for (f11 f11Var : ((ArrayMap) this.OooO0oO).values()) {
                    if (f11Var == null) {
                        permissionGroupInfo = null;
                    } else {
                        PermissionGroupInfo permissionGroupInfo2 = f11Var.OooO0o;
                        if ((i & 128) == 0) {
                            permissionGroupInfo = permissionGroupInfo2;
                        } else {
                            PermissionGroupInfo permissionGroupInfo3 = new PermissionGroupInfo(permissionGroupInfo2);
                            permissionGroupInfo3.metaData = f11Var.OooO0Oo;
                            permissionGroupInfo = permissionGroupInfo3;
                        }
                    }
                    arrayList.add(permissionGroupInfo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public hp1 OooOOoo(dw dwVar, qo1 qo1Var) {
        Set set = (Set) this.OooO0o0;
        if (set.contains(dwVar)) {
            return new hp1((g5) this.OooO0o, dwVar, qo1Var, (ip1) this.OooO0oO);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", dwVar, set));
    }

    public Object OooOo(CharSequence charSequence, int i, int i2, int i3, boolean z, bv bvVar) {
        int i4;
        char c;
        dv dvVar = new dv((rt0) ((ho1) this.OooO0o).OooO0oO);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zOooO00o = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zOooO00o) {
                SparseArray sparseArray = dvVar.OooO0OO.OooO00o;
                rt0 rt0Var = sparseArray == null ? null : (rt0) sparseArray.get(iCodePointAt);
                if (dvVar.OooO00o == 2) {
                    if (rt0Var != null) {
                        dvVar.OooO0OO = rt0Var;
                        dvVar.OooO0o++;
                    } else {
                        if (iCodePointAt == 65038) {
                            dvVar.OooO00o();
                        } else if (iCodePointAt != 65039) {
                            rt0 rt0Var2 = dvVar.OooO0OO;
                            if (rt0Var2.OooO0O0 != null) {
                                if (dvVar.OooO0o != 1) {
                                    dvVar.OooO0Oo = rt0Var2;
                                    dvVar.OooO00o();
                                } else if (dvVar.OooO0O0()) {
                                    dvVar.OooO0Oo = dvVar.OooO0OO;
                                    dvVar.OooO00o();
                                } else {
                                    dvVar.OooO00o();
                                }
                                c = 3;
                            } else {
                                dvVar.OooO00o();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (rt0Var == null) {
                    dvVar.OooO00o();
                    c = 1;
                } else {
                    dvVar.OooO00o = 2;
                    dvVar.OooO0OO = rt0Var;
                    dvVar.OooO0o = 1;
                    c = 2;
                }
                dvVar.OooO0o0 = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !OooOo00(charSequence, i4, iCharCount, dvVar.OooO0Oo.OooO0O0)) {
                        zOooO00o = bvVar.OooO00o(charSequence, i4, iCharCount, dvVar.OooO0Oo.OooO0O0);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (dvVar.OooO00o == 2 && dvVar.OooO0OO.OooO0O0 != null && ((dvVar.OooO0o > 1 || dvVar.OooO0O0()) && i5 < i3 && zOooO00o && (z || !OooOo00(charSequence, i4, iCharCount, dvVar.OooO0OO.OooO0O0)))) {
            bvVar.OooO00o(charSequence, i4, iCharCount, dvVar.OooO0OO.OooO0O0);
        }
        return bvVar.getResult();
    }

    public void OooOo0(d11 d11Var) {
        int size = d11Var.OooOO0.size();
        for (int i = 0; i < size; i++) {
            e11 e11Var = (e11) d11Var.OooOO0.get(i);
            e11Var.OooO0o.flags &= -1073741825;
            synchronized (((t62) this.OooO0o0)) {
                try {
                    if (d11Var.OooO0OO.targetSdkVersion > 22) {
                    }
                    ((ArrayMap) this.OooO0o).put(e11Var.OooO0o.name, e11Var);
                } finally {
                }
            }
        }
        int size2 = d11Var.OooOO0O.size();
        for (int i2 = 0; i2 < size2; i2++) {
            f11 f11Var = (f11) d11Var.OooOO0O.get(i2);
            synchronized (((t62) this.OooO0o0)) {
                f11 f11Var2 = (f11) ((ArrayMap) this.OooO0oO).get(f11Var.OooO0o.name);
                boolean zEquals = f11Var.OooO0o.packageName.equals(f11Var2 == null ? null : f11Var2.OooO0o.packageName);
                if (f11Var2 == null || zEquals) {
                    ((ArrayMap) this.OooO0oO).put(f11Var.OooO0o.name, f11Var);
                }
            }
        }
    }

    public boolean OooOo00(CharSequence charSequence, int i, int i2, nq1 nq1Var) {
        if ((nq1Var.OooO0OO & 3) == 0) {
            eo eoVar = (eo) this.OooO0oO;
            pt0 pt0VarOooO0O0 = nq1Var.OooO0O0();
            int iOooO00o = pt0VarOooO0O0.OooO00o(8);
            if (iOooO00o != 0) {
                ((ByteBuffer) pt0VarOooO0O0.OooO0oO).getShort(iOooO00o + pt0VarOooO0O0.OooO0Oo);
            }
            eoVar.getClass();
            ThreadLocal threadLocal = eo.OooO0O0;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = eoVar.OooO00o;
            String string = sb.toString();
            int i3 = j21.OooO00o;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i4 = nq1Var.OooO0OO & 4;
            nq1Var.OooO0OO = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return (nq1Var.OooO0OO & 3) == 2;
    }

    public void OooOo0O(gl1 gl1Var) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0o0;
        workDatabase_Impl.OooO0O0();
        workDatabase_Impl.OooO0OO();
        try {
            ((sp) this.OooO0o).OooO0o0(gl1Var);
            workDatabase_Impl.OooOOo0();
        } finally {
            workDatabase_Impl.OooOOO();
        }
    }

    public boolean OooOo0o(int i, wh whVar, hi hiVar) {
        k7 k7Var = (k7) this.OooO0o;
        int[] iArr = hiVar.o00Oo0;
        int[] iArr2 = hiVar.OooOOoo;
        k7Var.OooO00o = iArr[0];
        k7Var.OooO0O0 = iArr[1];
        k7Var.OooO0OO = hiVar.OooOO0o();
        k7Var.OooO0Oo = hiVar.OooO();
        k7Var.OooO = false;
        k7Var.OooOO0 = i;
        boolean z = k7Var.OooO00o == 3;
        boolean z2 = k7Var.OooO0O0 == 3;
        boolean z3 = z && hiVar.OoooOO0 > 0.0f;
        boolean z4 = z2 && hiVar.OoooOO0 > 0.0f;
        if (z3 && iArr2[0] == 4) {
            k7Var.OooO00o = 1;
        }
        if (z4 && iArr2[1] == 4) {
            k7Var.OooO0O0 = 1;
        }
        whVar.OooO0O0(hiVar, k7Var);
        hiVar.Oooo000(k7Var.OooO0o0);
        hiVar.OooOoo(k7Var.OooO0o);
        hiVar.OooOooO = k7Var.OooO0oo;
        int i2 = k7Var.OooO0oO;
        hiVar.OoooOo0 = i2;
        hiVar.OooOooO = i2 > 0;
        k7Var.OooOO0 = 0;
        return k7Var.OooO;
    }

    public void OooOoO(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.OooO0o0;
        workDatabase_Impl.OooO0O0();
        hl1 hl1Var = (hl1) this.OooO0oO;
        j30 j30VarOooO00o = hl1Var.OooO00o();
        if (str == null) {
            j30VarOooO00o.OooO0O0(1);
        } else {
            j30VarOooO00o.OooO0Oo(1, str);
        }
        workDatabase_Impl.OooO0OO();
        try {
            j30VarOooO00o.OooO0OO();
            workDatabase_Impl.OooOOo0();
        } finally {
            workDatabase_Impl.OooOOO();
            hl1Var.OooO0OO(j30VarOooO00o);
        }
    }

    public ArrayList OooOoO0(int i, String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (((t62) this.OooO0o0)) {
            if (str != null) {
                try {
                    if (!((ArrayMap) this.OooO0oO).containsKey(str)) {
                        return null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (e11 e11Var : ((ArrayMap) this.OooO0o).values()) {
                if (str == null) {
                    if (e11Var == null || e11Var.OooO0o.group == null) {
                        k11 k11Var = e11Var.OooO00o.OooO0o0;
                        arrayList.add(k11.OooO0Oo(e11Var, i));
                    }
                } else if (str.equals(e11Var.OooO0o.group)) {
                    k11 k11Var2 = e11Var.OooO00o.OooO0o0;
                    arrayList.add(k11.OooO0Oo(e11Var, i));
                }
            }
            return arrayList;
        }
    }

    public void OooOoOO(ii iiVar, int i, int i2, int i3) {
        int i4 = iiVar.OoooOoO;
        int i5 = iiVar.OoooOoo;
        iiVar.OoooOoO = 0;
        iiVar.OoooOoo = 0;
        iiVar.Oooo000(i2);
        iiVar.OooOoo(i3);
        if (i4 < 0) {
            iiVar.OoooOoO = 0;
        } else {
            iiVar.OoooOoO = i4;
        }
        if (i5 < 0) {
            iiVar.OoooOoo = 0;
        } else {
            iiVar.OoooOoo = i5;
        }
        ii iiVar2 = (ii) this.OooO0oO;
        iiVar2.oo000o = i;
        iiVar2.Oooo0o0();
    }

    public void OooOoo(String str, double d, double d2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) this.OooO0o;
        ArrayList arrayList3 = (ArrayList) this.OooO0oO;
        int i = 0;
        while (true) {
            arrayList = (ArrayList) this.OooO0o0;
            if (i >= arrayList.size()) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            } else {
                i++;
            }
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d));
        arrayList2.add(i, Double.valueOf(d2));
    }

    public void OooOoo0(ii iiVar) {
        ArrayList arrayList = (ArrayList) this.OooO0o0;
        arrayList.clear();
        int size = iiVar.o00Ooo.size();
        for (int i = 0; i < size; i++) {
            hi hiVar = (hi) iiVar.o00Ooo.get(i);
            int[] iArr = hiVar.o00Oo0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(hiVar);
            }
        }
        iiVar.o00ooo.OooO0O0 = true;
    }

    public hx2 OooOooO() {
        return new hx2((qh2) ((zf2) this.OooO0o0).zza(), ((n52) this.OooO0o).zza(), (s52) ((zf2) this.OooO0oO).zza(), 27);
    }

    @Override // com.cmaster.cloner.oc1
    public Object apply(Object obj) {
        long jInsert;
        qc1 qc1Var = (qc1) this.OooO0o0;
        g5 g5Var = (g5) this.OooO0o;
        x4 x4Var = (x4) this.OooO0oO;
        xv xvVar = x4Var.OooO0OO;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        dw dwVar = qc1.OooO0oo;
        long jSimpleQueryForLong = qc1Var.OooO0OO().compileStatement("PRAGMA page_size").simpleQueryForLong() * qc1Var.OooO0OO().compileStatement("PRAGMA page_count").simpleQueryForLong();
        y4 y4Var = qc1Var.OooO0oO;
        if (jSimpleQueryForLong >= y4Var.OooO00o) {
            return -1L;
        }
        Long lOooO0o = qc1.OooO0o(sQLiteDatabase, g5Var);
        if (lOooO0o != null) {
            jInsert = lOooO0o.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", g5Var.OooO00o);
            contentValues.put("priority", Integer.valueOf(v41.OooO00o(g5Var.OooO0OO)));
            contentValues.put("next_request_ms", (Integer) 0);
            byte[] bArr = g5Var.OooO0O0;
            if (bArr != null) {
                contentValues.put("extras", Base64.encodeToString(bArr, 0));
            }
            jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int i = y4Var.OooO0o0;
        byte[] bArr2 = xvVar.OooO0O0;
        boolean z = bArr2.length <= i;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(jInsert));
        contentValues2.put("transport_name", x4Var.OooO00o);
        contentValues2.put("timestamp_ms", Long.valueOf(x4Var.OooO0Oo));
        contentValues2.put("uptime_ms", Long.valueOf(x4Var.OooO0o0));
        contentValues2.put("payload_encoding", xvVar.OooO00o.OooO00o);
        contentValues2.put("code", x4Var.OooO0O0);
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        contentValues2.put("payload", z ? bArr2 : new byte[0]);
        long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
        if (!z) {
            int iCeil = (int) Math.ceil(bArr2.length / i);
            for (int i2 = 1; i2 <= iCeil; i2++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i2 - 1) * i, Math.min(i2 * i, bArr2.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(jInsert2));
                contentValues3.put("sequence_num", Integer.valueOf(i2));
                contentValues3.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Map.Entry entry : Collections.unmodifiableMap(x4Var.OooO0o).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(jInsert2));
            contentValues4.put("name", (String) entry.getKey());
            contentValues4.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(jInsert2);
    }

    @Override // com.cmaster.cloner.tg0
    public ClipDescription getDescription() {
        return (ClipDescription) this.OooO0o;
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 23:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.OooO0o0);
                sb.append('{');
                er1 er1Var = (er1) ((er1) this.OooO0o).OooO0o;
                String str = "";
                while (er1Var != null) {
                    Object obj = er1Var.OooO0o0;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
                    }
                    er1Var = (er1) er1Var.OooO0o;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.cmaster.cloner.lg2
    public /* bridge */ /* synthetic */ Object zza() {
        switch (this.OooO0Oo) {
            case 22:
                return OooOooO();
            default:
                s52 s52Var = (s52) ((zf2) this.OooO0o0).zza();
                k42 k42VarZza = ((t62) this.OooO0o).zza();
                return new ws2(s52Var, k42VarZza);
        }
    }

    public /* synthetic */ hx2(Object obj, Object obj2, Object obj3, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
        this.OooO0oO = obj3;
    }

    public hx2(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 24:
                this.OooO0o0 = new ArrayList();
                this.OooO0o = new ArrayList();
                this.OooO0oO = new ArrayList();
                break;
            default:
                this.OooO0o0 = new HashMap();
                this.OooO0o = new HashMap();
                this.OooO0oO = OooO;
                break;
        }
    }

    public hx2(Context context) {
        this.OooO0Oo = 0;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.OooO0o = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.OooO0oO = Executors.newSingleThreadExecutor();
        this.OooO0o0 = context;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new u91(this, 29), 0L, 86400L, TimeUnit.SECONDS);
    }

    public hx2(String str) {
        this.OooO0Oo = 23;
        er1 er1Var = new er1(6);
        this.OooO0o = er1Var;
        this.OooO0oO = er1Var;
        this.OooO0o0 = str;
    }

    public /* synthetic */ hx2(int i, boolean z) {
        this.OooO0Oo = i;
    }

    public hx2(Context context, IntentSender intentSender, String str) {
        this.OooO0Oo = 13;
        new g01(this);
        this.OooO0o0 = context;
        this.OooO0o = intentSender;
        this.OooO0oO = str;
    }

    public hx2(WorkDatabase_Impl workDatabase_Impl) {
        this.OooO0Oo = 18;
        this.OooO0o0 = workDatabase_Impl;
        this.OooO0o = new sp(workDatabase_Impl, 2);
        this.OooO0oO = new hl1(workDatabase_Impl, 0);
    }

    public hx2(ExecutorService executorService) {
        this.OooO0Oo = 21;
        this.OooO0o = new Handler(Looper.getMainLooper());
        this.OooO0oO = new yc1(this, 1);
        this.OooO0o0 = new af1(executorService);
    }

    public hx2(j7 j7Var) {
        this.OooO0Oo = 15;
        this.OooO0o0 = j7Var;
        this.OooO0o = null;
        this.OooO0oO = null;
    }

    public hx2(dq0 dq0Var, View view) {
        Object eq0Var;
        this.OooO0Oo = 12;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            eq0Var = new gq0();
        } else {
            eq0Var = i >= 33 ? new eq0() : null;
        }
        this.OooO0o0 = eq0Var;
        this.OooO0o = dq0Var;
        this.OooO0oO = view;
    }

    public hx2(hx2 hx2Var, int[] iArr, a02 a02Var) {
        this.OooO0Oo = 17;
        if (iArr == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{75, 90, -12, 72, -8, 35, 24, 51, 4, 70, -27, 65, -26}, new byte[]{36, 40, -112, 45, -118, 3, 37, 14}));
            throw null;
        }
        if (a02Var != null) {
            this.OooO0o0 = hx2Var;
            this.OooO0o = iArr;
            this.OooO0oO = a02Var;
            return;
        }
        qa.OooOOO0(u7.OooO00o(new byte[]{-101, -57, 23, 33, -15, -50, 40, 110, -119, -125, 78, 110, -76, -45, 46, 103, -106}, new byte[]{-6, -93, 115, 83, -108, -67, 91, 11}));
        throw null;
    }

    public hx2(t62 t62Var) {
        this.OooO0Oo = 14;
        this.OooO0o = new ArrayMap();
        this.OooO0oO = new ArrayMap();
        this.OooO0o0 = t62Var;
    }

    public hx2(Context context, LocationManager locationManager) {
        this.OooO0Oo = 20;
        this.OooO0oO = new tp1();
        this.OooO0o0 = context;
        this.OooO0o = locationManager;
    }

    public hx2(ii iiVar) {
        this.OooO0Oo = 3;
        this.OooO0o0 = new ArrayList();
        this.OooO0o = new k7();
        this.OooO0oO = iiVar;
    }

    public hx2(ho1 ho1Var, je jeVar, eo eoVar, Set set) {
        this.OooO0Oo = 8;
        this.OooO0o0 = jeVar;
        this.OooO0o = ho1Var;
        this.OooO0oO = eoVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            OooOo(str, 0, str.length(), 1, true, new cv(str));
        }
    }

    public hx2(t31 t31Var, jy jyVar, ly lyVar) {
        this.OooO0Oo = 9;
        this.OooO0oO = t31Var;
        this.OooO0o0 = jyVar;
        this.OooO0o = lyVar;
    }

    public hx2(yp0 yp0Var, ArrayList arrayList, jp0 jp0Var) {
        this.OooO0Oo = 10;
        zx2.OooO0OO(jp0Var, "Argument must not be null");
        this.OooO0o = jp0Var;
        zx2.OooO0OO(arrayList, "Argument must not be null");
        this.OooO0oO = arrayList;
        this.OooO0o0 = new xb1(yp0Var, jp0Var);
    }
}
