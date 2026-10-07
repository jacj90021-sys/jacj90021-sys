package com.cmaster.cloner;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class OooOO0O implements ju0 {
    public Object OooO0Oo;

    public OooOO0O(int i) {
        switch (i) {
            case 1:
                char[] cArr = pr1.OooO00o;
                this.OooO0Oo = new ArrayDeque(20);
                break;
            case 2:
            default:
                s0 s0Var = new s0();
                this.OooO0Oo = s0Var;
                ((HashSet) s0Var.OooO0oO).add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
            case 3:
                this.OooO0Oo = new HashMap();
                break;
        }
    }

    public void OooO(String str) {
        by2.OooO(str, "Content URL must be non-null.");
        by2.OooO0o(str, "Content URL must be non-empty.");
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (!(length <= 512)) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        ((s0) this.OooO0Oo).OooOO0 = str;
    }

    public void OooO00o(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            uh2.OooOO0("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
        }
        ((Bundle) ((s0) this.OooO0Oo).OooO0oo).putString(str, str2);
    }

    public OooOO0O OooO0O0(Bundle bundle) {
        s0 s0Var = (s0) this.OooO0Oo;
        ((Bundle) s0Var.OooO0o0).putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            ((HashSet) s0Var.OooO0oO).remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return OooO0oo();
    }

    public abstract void OooO0OO(ho1 ho1Var);

    public abstract Object OooO0Oo(Object obj);

    public abstract String OooO0o();

    public Object OooO0o0(Object obj) {
        synchronized (((HashMap) this.OooO0Oo)) {
            try {
                if (((HashMap) this.OooO0Oo).containsKey(obj)) {
                    return ((HashMap) this.OooO0Oo).get(obj);
                }
                Object objOooO0Oo = OooO0Oo(obj);
                ((HashMap) this.OooO0Oo).put(obj, objOooO0Oo);
                return objOooO0Oo;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void OooO0oO(g31 g31Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.OooO0Oo;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(g31Var);
        }
    }

    public abstract OooOO0O OooO0oo();

    public void OooOO0(List list) {
        if (list == null) {
            uh2.OooOO0("neighboring content URLs list should not be null");
            return;
        }
        ArrayList arrayList = (ArrayList) ((s0) this.OooO0Oo).OooOO0O;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                uh2.OooOO0("neighboring content URL should not be null or empty");
            } else {
                arrayList.add(str);
            }
        }
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        return new s9((tz) this.OooO0Oo, 2);
    }

    public OooOO0O(tz tzVar) {
        this.OooO0Oo = tzVar;
    }
}
