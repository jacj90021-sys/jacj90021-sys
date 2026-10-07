package com.cmaster.cloner;

import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yn1 implements xs1 {
    public Object OooO;
    public Object OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;
    public Object OooO0oo;
    public Object OooOO0;

    public static yn1 OooO00o(LayoutInflater layoutInflater) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(R.layout.activity_apps, (ViewGroup) null, false);
        int i = R.id.bannerHolder;
        CardView cardView = (CardView) l53.OooO00o(viewInflate, R.id.bannerHolder);
        if (cardView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) l53.OooO00o(viewInflate, R.id.container);
            if (frameLayout != null) {
                i = R.id.error;
                LinearLayout linearLayout = (LinearLayout) l53.OooO00o(viewInflate, R.id.error);
                if (linearLayout != null) {
                    i = R.id.permission;
                    TextView textView = (TextView) l53.OooO00o(viewInflate, R.id.permission);
                    if (textView != null) {
                        i = R.id.settings;
                        Button button = (Button) l53.OooO00o(viewInflate, R.id.settings);
                        if (button != null) {
                            i = R.id.viewLoading;
                            LinearLayout linearLayout2 = (LinearLayout) l53.OooO00o(viewInflate, R.id.viewLoading);
                            if (linearLayout2 != null) {
                                yn1 yn1Var = new yn1();
                                yn1Var.OooO0o0 = (LinearLayout) viewInflate;
                                yn1Var.OooO0o = cardView;
                                yn1Var.OooO0oO = frameLayout;
                                yn1Var.OooO0oo = linearLayout;
                                yn1Var.OooO0Oo = textView;
                                yn1Var.OooO = button;
                                yn1Var.OooOO0 = linearLayout2;
                                return yn1Var;
                            }
                        }
                    }
                }
            }
        }
        qa.OooOOO0(sn2.OooO00o("TajUmRxD1jJypNafHF/UdiC3zo8CDcZ7dKmHozEXkQ==\n", "AMGn6nUtsRI=\n").concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public void OooO0O0(g5 g5Var, int i) {
        Iterable iterable;
        r4 r4Var;
        String str;
        ac acVarOooOooO;
        String str2;
        Integer numValueOf;
        yn1 yn1Var;
        gp1 gp1VarOooO00o = ((ot0) this.OooO0o).OooO00o(g5Var.OooO00o);
        qc1 qc1Var = (qc1) this.OooO;
        int i2 = 0;
        Iterable iterable2 = (Iterable) qc1Var.OooO(new er1(this, g5Var, i2));
        if (iterable2.iterator().hasNext()) {
            if (gp1VarOooO00o == null) {
                nv2.OooO00o("Uploader", "Unknown backend for %s, deleting event batch for it...", g5Var);
                r4Var = new r4(3, -1L);
                iterable = iterable2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d5) it.next()).OooO0OO);
                }
                byte[] bArr = g5Var.OooO0O0;
                bc bcVar = (bc) gp1VarOooO00o;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    x4 x4Var = (x4) obj;
                    String str3 = x4Var.OooO00o;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(x4Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(x4Var);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    x4 x4Var2 = (x4) ((List) entry.getValue()).get(i2);
                    z51 z51Var = z51.OooO0Oo;
                    long jOooO0oo = bcVar.OooO0o.OooO0oo();
                    long jOooO0oo2 = bcVar.OooO0o0.OooO0oo();
                    t4 t4Var = new t4(new q4(Integer.valueOf(x4Var2.OooO0O0("sdk-version")), x4Var2.OooO00o("model"), x4Var2.OooO00o("hardware"), x4Var2.OooO00o("device"), x4Var2.OooO00o("product"), x4Var2.OooO00o("os-uild"), x4Var2.OooO00o("manufacturer"), x4Var2.OooO00o("fingerprint"), x4Var2.OooO00o("locale"), x4Var2.OooO00o("country"), x4Var2.OooO00o("mcc_mnc"), x4Var2.OooO00o("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (x4 x4Var3 : (List) entry.getValue()) {
                        xv xvVar = x4Var3.OooO0OO;
                        dw dwVar = xvVar.OooO00o;
                        byte[] bArr2 = xvVar.OooO0O0;
                        Iterable iterable3 = iterable2;
                        if (dwVar.equals(new dw("proto"))) {
                            yn1Var = new yn1();
                            yn1Var.OooO0oO = bArr2;
                        } else if (dwVar.equals(new dw("json"))) {
                            String str4 = new String(bArr2, Charset.forName("UTF-8"));
                            yn1 yn1Var2 = new yn1();
                            yn1Var2.OooO0oo = str4;
                            yn1Var = yn1Var2;
                        } else {
                            Log.w("TransportRuntime.".concat("CctTransportBackend"), "Received event of unsupported encoding " + dwVar + ". Skipping...");
                            iterable2 = iterable3;
                        }
                        yn1Var.OooO0o0 = Long.valueOf(x4Var3.OooO0Oo);
                        yn1Var.OooO0Oo = Long.valueOf(x4Var3.OooO0o0);
                        String str5 = (String) x4Var3.OooO0o.get("tz-offset");
                        yn1Var.OooO = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        yn1Var.OooOO0 = new c5((sw0) sw0.OooO0Oo.get(x4Var3.OooO0O0("net-type")), (rw0) rw0.OooO0Oo.get(x4Var3.OooO0O0("mobile-subtype")));
                        Integer num = x4Var3.OooO0O0;
                        if (num != null) {
                            yn1Var.OooO0o = num;
                        }
                        String strConcat = ((Long) yn1Var.OooO0o0) == null ? " eventTimeMs" : "";
                        if (((Long) yn1Var.OooO0Oo) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) yn1Var.OooO) == null) {
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat.isEmpty()) {
                            qa.OooO0o("Missing required properties:".concat(strConcat));
                            return;
                        } else {
                            arrayList4.add(new z4(((Long) yn1Var.OooO0o0).longValue(), (Integer) yn1Var.OooO0o, ((Long) yn1Var.OooO0Oo).longValue(), (byte[]) yn1Var.OooO0oO, (String) yn1Var.OooO0oo, ((Long) yn1Var.OooO).longValue(), (c5) yn1Var.OooOO0));
                            iterable2 = iterable3;
                        }
                    }
                    arrayList3.add(new a5(jOooO0oo, jOooO0oo2, t4Var, numValueOf, str2, arrayList4));
                    i2 = 0;
                }
                iterable = iterable2;
                s4 s4Var = new s4(arrayList3);
                URL urlOooO0O0 = bcVar.OooO0Oo;
                if (bArr != null) {
                    try {
                        ca caVarOooO00o = ca.OooO00o(bArr);
                        str = caVarOooO00o.OooO0O0;
                        if (str == null) {
                            str = null;
                        }
                        urlOooO0O0 = bc.OooO0O0(caVarOooO00o.OooO00o);
                    } catch (IllegalArgumentException unused2) {
                        r4Var = new r4(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    a02 a02Var = new a02(urlOooO0O0, s4Var, str);
                    o00OO000 o00oo000 = new o00OO000(bcVar, 8);
                    int i4 = 5;
                    do {
                        acVarOooOooO = o00oo000.OooOooO(a02Var);
                        URL url = acVarOooOooO.OooO0O0;
                        if (url != null) {
                            nv2.OooO00o("CctTransportBackend", "Following redirect to: %s", url);
                            a02Var = new a02(url, (s4) a02Var.OooO0oO, (String) a02Var.OooO0o);
                        } else {
                            a02Var = null;
                        }
                        if (a02Var == null) {
                            break;
                        } else {
                            i4--;
                        }
                    } while (i4 >= 1);
                    int i5 = acVarOooOooO.OooO00o;
                    if (i5 == 200) {
                        r4Var = new r4(1, acVarOooOooO.OooO0OO);
                    } else if (i5 >= 500 || i5 == 404) {
                        r4Var = new r4(2, -1L);
                    } else {
                        try {
                            r4Var = new r4(3, -1L);
                        } catch (IOException e) {
                            e = e;
                            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Could not make request to the backend", e);
                            r4Var = new r4(2, -1L);
                            qc1Var.OooO(new xb(this, r4Var, iterable, g5Var, i));
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            qc1Var.OooO(new xb(this, r4Var, iterable, g5Var, i));
        }
    }

    @Override // com.cmaster.cloner.xs1
    public View getRoot() {
        return (LinearLayout) this.OooO0o0;
    }
}
