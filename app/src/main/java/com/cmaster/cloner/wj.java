package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wj extends el0 implements e40 {
    public static final wj OooO;
    public static final wj OooO0o;
    public static final wj OooO0oO;
    public static final wj OooO0oo;
    public static final wj OooOO0;
    public final /* synthetic */ int OooO0o0;

    static {
        int i = 2;
        OooO0o = new wj(i, 0);
        OooO0oO = new wj(i, 1);
        OooO0oo = new wj(i, 2);
        OooO = new wj(i, 3);
        OooOO0 = new wj(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj(int i, int i2) {
        super(i);
        this.OooO0o0 = i2;
    }

    @Override // com.cmaster.cloner.e40
    public final Object OooO0oO(Object obj, Object obj2) {
        switch (this.OooO0o0) {
            case 0:
                return ((vj) obj).OooO((tj) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                tj tjVar = (tj) obj2;
                if (!(tjVar instanceof um1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? tjVar : Integer.valueOf(iIntValue + 1);
            case 3:
                um1 um1Var = (um1) obj;
                tj tjVar2 = (tj) obj2;
                if (um1Var != null) {
                    return um1Var;
                }
                if (tjVar2 instanceof um1) {
                    return (um1) tjVar2;
                }
                return null;
            case 4:
                ym1 ym1Var = (ym1) obj;
                tj tjVar3 = (tj) obj2;
                if (tjVar3 instanceof um1) {
                    um1 um1Var2 = (um1) tjVar3;
                    vj vjVar = ym1Var.OooO00o;
                    ThreadLocal threadLocal = um1Var2.OooO0o0;
                    Object obj3 = threadLocal.get();
                    threadLocal.set(um1Var2.OooO0Oo);
                    Object[] objArr = ym1Var.OooO0O0;
                    int i = ym1Var.OooO0Oo;
                    objArr[i] = obj3;
                    um1[] um1VarArr = ym1Var.OooO0OO;
                    ym1Var.OooO0Oo = i + 1;
                    um1VarArr[i] = um1Var2;
                }
                return ym1Var;
            default:
                return ((vj) obj).OooO((tj) obj2);
        }
    }
}
