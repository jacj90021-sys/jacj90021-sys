package com.cmaster.cloner;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class kj0 extends m40 implements a40 {
    public final /* synthetic */ int OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.OooOO0o = i4;
    }

    @Override // com.cmaster.cloner.a40
    public final Object OooO0o(Object obj) {
        int i = this.OooOO0o;
        vq1 vq1Var = vq1.OooO00o;
        Object obj2 = this.OooO0o0;
        switch (i) {
            case 0:
                ((Set) obj).getClass();
                mj0 mj0Var = (mj0) obj2;
                ReentrantLock reentrantLock = mj0Var.OooO0Oo;
                reentrantLock.lock();
                try {
                    List listOooO0oo = se.OooO0oo(mj0Var.OooO0OO.values());
                    reentrantLock.unlock();
                    Iterator it = listOooO0oo.iterator();
                    if (!it.hasNext()) {
                        return vq1Var;
                    }
                    ((jy0) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                ((fj0) obj2).OooO0o0((Throwable) obj);
                return vq1Var;
        }
    }
}
