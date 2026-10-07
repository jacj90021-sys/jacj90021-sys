package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v00 implements mi {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ v00(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.cmaster.cloner.mi
    public final void accept(Object obj) {
        switch (this.OooO00o) {
            case 0:
                w00 w00Var = (w00) obj;
                if (w00Var == null) {
                    w00Var = new w00(-3);
                }
                ((o0O000O) this.OooO0O0).OoooOO0(w00Var);
                return;
            default:
                w00 w00Var2 = (w00) obj;
                synchronized (x00.OooO0OO) {
                    try {
                        gh1 gh1Var = x00.OooO0Oo;
                        ArrayList arrayList = (ArrayList) gh1Var.get((String) this.OooO0O0);
                        if (arrayList == null) {
                            return;
                        }
                        gh1Var.remove((String) this.OooO0O0);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((mi) arrayList.get(i)).accept(w00Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
