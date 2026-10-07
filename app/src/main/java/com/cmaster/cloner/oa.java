package com.cmaster.cloner;

import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oa implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o;
    public final int OooO0o0;

    public oa(List list, int i, Throwable th) {
        this.OooO0Oo = 1;
        fy2.OooO00o(list, "initCallbacks cannot be null");
        this.OooO0o = new ArrayList(list);
        this.OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OooO0Oo;
        int i2 = this.OooO0o0;
        Object obj = this.OooO0o;
        switch (i) {
            case 0:
                py2 py2Var = (py2) ((nz0) obj).OooO0o0;
                if (py2Var != null) {
                    py2Var.OooO0O0(i2);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((qu) arrayList.get(i3)).OooO0O0();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((qu) arrayList.get(i3)).OooO00o();
                        i3++;
                    }
                    break;
                }
            case 2:
                ((SystemForegroundService) obj).OooO0oo.cancel(i2);
                break;
            default:
                ((s12) obj).OooO0o(i2);
                break;
        }
    }

    public /* synthetic */ oa(int i, int i2, Object obj) {
        this.OooO0Oo = i2;
        this.OooO0o = obj;
        this.OooO0o0 = i;
    }
}
