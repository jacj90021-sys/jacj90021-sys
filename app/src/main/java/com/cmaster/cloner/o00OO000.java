package com.cmaster.cloner;

import android.content.ClipData;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import com.google.android.gms.internal.ads.zzbcj;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class o00OO000 implements qs0, xs1, ni, t0, de1, ju0, s3, oy0, qi, iy, go, o0O0oo0o, l50, zf1, zs1, hb, ok1 {
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o0;

    public o00OO000(Class cls, String str, Class[] clsArr) throws SecurityException {
        Method method;
        this.OooO0Oo = 25;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            this.OooO0o0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } finally {
            if (method != null) {
            }
        }
    }

    public static o00OO000 Oooo00o(Class cls, String str, Class... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return new o00OO000(cls, str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.cmaster.cloner.ok1
    public void OooO(nk1 nk1Var) {
        pk1 pk1Var = (pk1) this.OooO0o0;
        int length = pk1Var.OooO0oO.length;
        for (int i = 1; i < length; i++) {
            int i2 = pk1Var.OooO0oO[i];
            if (i2 == 1) {
                nk1Var.OooO00o(i, pk1Var.OooO0oo[i]);
            } else if (i2 == 2) {
                nk1Var.OooO0o0(i, pk1Var.OooO[i]);
            } else if (i2 == 3) {
                String str = pk1Var.OooOO0[i];
                str.getClass();
                nk1Var.OooO0Oo(i, str);
            } else if (i2 == 4) {
                byte[] bArr = pk1Var.OooOO0O[i];
                bArr.getClass();
                nk1Var.OooOO0(i, bArr);
            } else if (i2 == 5) {
                nk1Var.OooO0O0(i);
            }
        }
    }

    @Override // com.cmaster.cloner.l50
    public Class OooO00o() {
        return Drawable.class;
    }

    @Override // com.cmaster.cloner.l50
    public /* bridge */ /* synthetic */ void OooO0O0(Object obj) {
    }

    @Override // com.cmaster.cloner.qi
    public ClipData OooO0OO() {
        return ((ContentInfo) this.OooO0o0).getClip();
    }

    @Override // com.cmaster.cloner.qs0
    public boolean OooO0Oo(ss0 ss0Var, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        o00OO00O o00oo00o = ((ActionMenuView) this.OooO0o0).OooOooO;
        if (o00oo00o != null) {
            Toolbar toolbar = (Toolbar) ((nz0) o00oo00o).OooO0o0;
            Iterator it = ((CopyOnWriteArrayList) toolbar.Oooo0O0.OooO0o).iterator();
            while (true) {
                if (!it.hasNext()) {
                    qn1 qn1Var = toolbar.Oooo0o0;
                    zOnMenuItemSelected = qn1Var != null ? ((sn1) ((vk1) qn1Var).OooO0o0).OooO0O0.onMenuItemSelected(0, menuItem) : false;
                } else if (((e20) it.next()).OooO00o.OooOOOO(menuItem)) {
                    zOnMenuItemSelected = true;
                    break;
                }
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.zs1
    public int OooO0o(View view) {
        return i71.OooOoo0(view) - ((ViewGroup.MarginLayoutParams) ((j71) view.getLayoutParams())).topMargin;
    }

    @Override // com.cmaster.cloner.o0O0oo0o
    public void OooO0o0(Object obj) {
        o0oO0O0o o0oo0o0o = (o0oO0O0o) obj;
        k20 k20Var = (k20) this.OooO0o0;
        h20 h20Var = (h20) k20Var.OooOoo.pollFirst();
        if (h20Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = h20Var.OooO0Oo;
        int i = h20Var.OooO0o0;
        o10 o10VarOooOOo = k20Var.OooO0OO.OooOOo(str);
        if (o10VarOooOOo != null) {
            o10VarOooOOo.OooOo0o(i, o0oo0o0o.OooO0Oo, o0oo0o0o.OooO0o0);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // com.cmaster.cloner.de1
    public void OooO0oO(String str) {
        switch (this.OooO0Oo) {
            case 5:
                d01 d01Var = ((t1) this.OooO0o0).Ooooo0o;
                if (!TextUtils.equals(str, d01Var.OooO0oO)) {
                    d01Var.OooO0oO = str != null ? str.toLowerCase() : null;
                    d01Var.OooO00o();
                    break;
                }
                break;
            default:
                d01 d01Var2 = ((m80) this.OooO0o0).Ooooo0o;
                if (!TextUtils.equals(str, d01Var2.OooO0oO)) {
                    d01Var2.OooO0oO = str != null ? str.toLowerCase() : null;
                    d01Var2.OooO00o();
                    break;
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.go
    public int OooO0oo() {
        return OooOOoo() | (OooOOoo() << 8);
    }

    @Override // com.cmaster.cloner.qs0
    public void OooOO0(ss0 ss0Var) {
        qs0 qs0Var = ((ActionMenuView) this.OooO0o0).OooOoO0;
        if (qs0Var != null) {
            qs0Var.OooOO0(ss0Var);
        }
    }

    @Override // com.cmaster.cloner.t0
    public void OooOO0O(int i) {
    }

    @Override // com.cmaster.cloner.l50
    public Object OooOO0o(Resources resources, ApplicationInfo applicationInfo) {
        return applicationInfo.loadIcon(((App) this.OooO0o0).getPackageManager());
    }

    @Override // com.cmaster.cloner.oy0
    public qz1 OooOOO(View view, qz1 qz1Var) {
        f7 f7Var = (f7) this.OooO0o0;
        f7Var.OooOO0o = qz1Var.OooO00o();
        f7Var.OooOOO0 = qz1Var.OooO0O0();
        f7Var.OooOOO = qz1Var.OooO0OO();
        f7Var.OooO0o0();
        return qz1Var;
    }

    @Override // com.cmaster.cloner.zs1
    public int OooOOO0() {
        return ((i71) this.OooO0o0).Oooo00O();
    }

    @Override // com.cmaster.cloner.ok1
    public String OooOOOO() {
        return ((pk1) this.OooO0o0).OooO0o0;
    }

    @Override // com.cmaster.cloner.zf1
    public qj OooOOOo(qj qjVar) {
        return qjVar instanceof z81 ? qjVar : new oO00O0o(-((wq0) this.OooO0o0).OooO0oO(), qjVar);
    }

    @Override // com.cmaster.cloner.qi
    public int OooOOo() {
        return ((ContentInfo) this.OooO0o0).getFlags();
    }

    @Override // com.cmaster.cloner.zs1
    public int OooOOo0() {
        i71 i71Var = (i71) this.OooO0o0;
        return i71Var.OooOOOO - i71Var.OooOooO();
    }

    @Override // com.cmaster.cloner.go
    public short OooOOoo() throws IOException {
        int i = ((InputStream) this.OooO0o0).read();
        if (i != -1) {
            return (short) i;
        }
        throw new fo();
    }

    @Override // com.cmaster.cloner.qi
    public int OooOo() {
        return ((ContentInfo) this.OooO0o0).getSource();
    }

    @Override // com.cmaster.cloner.qi
    public ContentInfo OooOo0() {
        return (ContentInfo) this.OooO0o0;
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        switch (this.OooO0Oo) {
            case 6:
                return new t3((AssetManager) this.OooO0o0, this, 0);
            default:
                return new t3((App) this.OooO0o0, this);
        }
    }

    @Override // com.cmaster.cloner.s3
    public in OooOo0O(AssetManager assetManager, String str) {
        return new qz(assetManager, str, 1);
    }

    @Override // com.cmaster.cloner.t0
    public void OooOo0o(int i) {
    }

    @Override // com.cmaster.cloner.zs1
    public View OooOoO(int i) {
        return ((i71) this.OooO0o0).OooOo0(i);
    }

    @Override // com.cmaster.cloner.go
    public int OooOoO0(int i, byte[] bArr) throws fo {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.OooO0o0).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new fo();
        }
        return i2;
    }

    @Override // com.cmaster.cloner.zs1
    public int OooOoOO(View view) {
        return view.getBottom() + ((j71) view.getLayoutParams()).OooO0O0.bottom + ((ViewGroup.MarginLayoutParams) ((j71) view.getLayoutParams())).bottomMargin;
    }

    public void OooOoo(xt0 xt0Var) {
        xt0Var.getClass();
        int i = xt0Var.OooO00o;
        int i2 = xt0Var.OooO0O0;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.OooO0o0;
        Integer numValueOf = Integer.valueOf(i);
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + xt0Var);
        }
        treeMap2.put(Integer.valueOf(i2), xt0Var);
    }

    @Override // com.cmaster.cloner.t0
    public void OooOoo0(int i, float f) {
    }

    public ac OooOooO(a02 a02Var) throws IOException {
        bc bcVar = (bc) this.OooO0o0;
        URL url = (URL) a02Var.OooO0o0;
        nv2.OooO00o("CctTransportBackend", "Making request to: %s", url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bcVar.OooO0oO);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/2.3.3 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) a02Var.OooO0o;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ay1 ay1Var = bcVar.OooO00o;
                    s4 s4Var = (s4) a02Var.OooO0oO;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    uk0 uk0Var = (uk0) ay1Var.OooO0o0;
                    wk0 wk0Var = new wk0(bufferedWriter, uk0Var.OooO0Oo, uk0Var.OooO0o0, uk0Var.OooO0o, uk0Var.OooO0oO);
                    wk0Var.OooO0o0(s4Var);
                    wk0Var.OooO0oO();
                    wk0Var.OooO0O0.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), px0.OooOOO(responseCode, "Status Code: "));
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new ac(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new ac(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            ac acVar = new ac(responseCode, null, b5.OooO00o(new BufferedReader(new InputStreamReader(gZIPInputStream))).OooO00o);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return acVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        } catch (ew e) {
            e = e;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new ac(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new ac(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new ac(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new ac(400, null, 0L);
        }
    }

    public Object OooOooo(Object obj, Object... objArr) {
        try {
            return ((Method) this.OooO0o0).invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            if (e.getCause() != null) {
                e.getCause().printStackTrace();
                return null;
            }
            e.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public Object Oooo000(Object obj, Object... objArr) throws Exception {
        try {
            return ((Method) this.OooO0o0).invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Exception) {
                throw ((Exception) cause);
            }
            throw e;
        }
    }

    public void Oooo00O(Set set) {
        Object obj;
        int[] iArr;
        set.getClass();
        if (set.isEmpty()) {
            return;
        }
        si1 si1Var = (si1) this.OooO0o0;
        do {
            si1Var.getClass();
            Object obj2 = si1.OooO0O0.get(si1Var);
            obj = k72.OooO00o;
            if (obj2 == obj) {
                obj2 = null;
            }
            int[] iArr2 = (int[]) obj2;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = set.contains(Integer.valueOf(i)) ? iArr2[i] + 1 : iArr2[i];
            }
            if (obj2 != null) {
                obj = obj2;
            }
        } while (!si1Var.OooO00o(obj, iArr));
    }

    @Override // com.cmaster.cloner.q51
    public Object get() {
        switch (this.OooO0Oo) {
            case 10:
                return new a02((Context) ((uf) this.OooO0o0).OooO0Oo, new qc3(14), new v03(), 6);
            default:
                Context context = (Context) ((q51) this.OooO0o0).get();
                List list = sd1.OooO0o;
                return new sd1(context, "com.google.android.datatransport.events", 4);
        }
    }

    @Override // com.cmaster.cloner.xs1
    public View getRoot() {
        return (CardView) this.OooO0o0;
    }

    @Override // com.cmaster.cloner.hb
    public void onCancel() {
        ((ei1) this.OooO0o0).OooO00o();
    }

    @Override // com.cmaster.cloner.go
    public long skip(long j) throws IOException {
        InputStream inputStream = (InputStream) this.OooO0o0;
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j2 -= jSkip;
        }
        return j - j2;
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 9:
                return "ContentInfoCompat{" + ((ContentInfo) this.OooO0o0) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o00OO000(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    public o00OO000(bn bnVar) {
        this.OooO0Oo = 17;
        this.OooO0o0 = Collections.unmodifiableMap(new HashMap(bnVar.OooO00o));
    }

    public o00OO000(EditText editText) {
        this.OooO0Oo = 13;
        this.OooO0o0 = new o0O000O(editText);
    }

    public o00OO000(ContentInfo contentInfo) {
        this.OooO0Oo = 9;
        contentInfo.getClass();
        this.OooO0o0 = t8.OooOOo(contentInfo);
    }

    public o00OO000(int i) {
        this.OooO0Oo = 22;
        this.OooO0o0 = new si1(new int[i]);
    }

    public o00OO000(int i, byte b) {
        this.OooO0Oo = i;
        switch (i) {
            case 12:
                this.OooO0o0 = new ArrayDeque();
                break;
            case zzbcj.zzt.zzm /* 21 */:
                this.OooO0o0 = new eu0(500L);
                break;
            case 26:
                this.OooO0o0 = new LinkedHashMap();
                break;
        }
    }
}
