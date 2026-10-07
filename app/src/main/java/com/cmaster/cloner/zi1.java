package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class zi1 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ b51 OooO0o;
    public final /* synthetic */ aj1 OooO0o0;

    public /* synthetic */ zi1(aj1 aj1Var, b51 b51Var, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = aj1Var;
        this.OooO0o = b51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<ActivityInfo> listOooO0o;
        IntentFilter intentFilterOooO0O0;
        switch (this.OooO0Oo) {
            case 0:
                aj1 aj1Var = this.OooO0o0;
                b51 b51Var = this.OooO0o;
                synchronized (aj1Var) {
                    ListIterator listIterator = aj1Var.OooOO0.listIterator();
                    while (listIterator.hasNext()) {
                        yi1 yi1Var = (yi1) listIterator.next();
                        try {
                            if (TextUtils.equals(yi1Var.OooO00o.OooOO0O, b51Var.OooOO0O)) {
                                ((Context) aj1Var.OooOO0O.OooO0o0).unregisterReceiver(yi1Var);
                                listIterator.remove();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                return;
            default:
                aj1 aj1Var2 = this.OooO0o0;
                b51 b51Var2 = this.OooO0o;
                synchronized (aj1Var2) {
                    int i = b51Var2.OooO0o0;
                    String str = b51Var2.OooO0Oo.packageName;
                    i21.OooO0OO(b51Var2.OooOO0);
                    ox1 ox1Var = (ox1) aj1Var2.OooOO0O.OooO0o;
                    synchronized (ox1Var.OooOOOO) {
                        try {
                            listOooO0o = !ox1Var.OooOO0(i, str) ? Collections.EMPTY_LIST : ox1Var.OooOOOO.OooO0o(i, str);
                        } finally {
                        }
                    }
                    for (ActivityInfo activityInfo : listOooO0o) {
                        List<IntentFilter> listO00O00 = ((ox1) aj1Var2.OooOO0O.OooO0o).o00O00(new ComponentName(activityInfo.packageName, activityInfo.name), i);
                        if (!fn2.OooO0Oo(listO00O00)) {
                            int iO0OoO0o = ((ox1) aj1Var2.OooOO0O.OooO0o).o0OoO0o(new ComponentName(activityInfo.packageName, activityInfo.name), i);
                            boolean z = true;
                            int i2 = 0;
                            if (iO0OoO0o != 2) {
                                z = iO0OoO0o != 1 ? true ^ activityInfo.enabled : false;
                            }
                            if (!z && TextUtils.equals(activityInfo.processName, b51Var2.OooOO0O)) {
                                String str2 = u61.OooO00o;
                                ArrayList arrayList = new ArrayList(listO00O00.size());
                                for (IntentFilter intentFilter : listO00O00) {
                                    if (intentFilter.countActions() > 0 && (intentFilterOooO0O0 = u61.OooO0O0(intentFilter, str, i)) != null) {
                                        arrayList.add(intentFilterOooO0O0);
                                    }
                                }
                                if (!fn2.OooO0Oo(arrayList) && !b51Var2.OooOOO) {
                                    yi1 yi1Var2 = new yi1(aj1Var2.OooOO0O, b51Var2, activityInfo);
                                    ho1 ho1Var = aj1Var2.OooOO0O;
                                    xi1 xi1Var = (xi1) ho1Var.OooO0oO;
                                    int size = arrayList.size();
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        IntentFilter intentFilter2 = (IntentFilter) obj;
                                        boolean zOooO0oo = yn2.OooO0oo();
                                        Context context = (Context) ho1Var.OooO0o0;
                                        if (zOooO0oo) {
                                            context.registerReceiver(yi1Var2, intentFilter2, null, xi1Var, 2);
                                        } else {
                                            context.registerReceiver(yi1Var2, intentFilter2, null, xi1Var);
                                        }
                                    }
                                    aj1Var2.OooOO0.add(yi1Var2);
                                }
                            }
                        }
                    }
                }
                return;
        }
    }
}
