package com.cmaster.cloner;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nu extends sq2 {
    public final /* synthetic */ ou OooO00o;

    public nu(ou ouVar) {
        this.OooO00o = ouVar;
    }

    @Override // com.cmaster.cloner.sq2
    public final void OooO00o(Throwable th) {
        this.OooO00o.OooO00o.OooO0Oo(th);
    }

    @Override // com.cmaster.cloner.sq2
    public final void OooO0O0(ho1 ho1Var) {
        ou ouVar = this.OooO00o;
        ouVar.OooO0OO = ho1Var;
        ho1 ho1Var2 = ouVar.OooO0OO;
        su suVar = ouVar.OooO00o;
        ouVar.OooO0O0 = new hx2(ho1Var2, suVar.OooO0oO, suVar.OooO, Build.VERSION.SDK_INT >= 34 ? wu.OooO00o() : xq2.OooO00o());
        su suVar2 = ouVar.OooO00o;
        ArrayList arrayList = new ArrayList();
        suVar2.OooO00o.writeLock().lock();
        try {
            suVar2.OooO0OO = 1;
            arrayList.addAll(suVar2.OooO0O0);
            suVar2.OooO0O0.clear();
            suVar2.OooO00o.writeLock().unlock();
            suVar2.OooO0Oo.post(new oa(arrayList, suVar2.OooO0OO, (Throwable) null));
        } catch (Throwable th) {
            suVar2.OooO00o.writeLock().unlock();
            throw th;
        }
    }
}
