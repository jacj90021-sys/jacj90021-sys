package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w91 implements jh {
    public final oh1 OooO00o;
    public final /* synthetic */ x91 OooO0O0;

    public w91(x91 x91Var, oh1 oh1Var) {
        this.OooO0O0 = x91Var;
        this.OooO00o = oh1Var;
    }

    @Override // com.cmaster.cloner.jh
    public final void OooO00o(boolean z) {
        if (z) {
            synchronized (this.OooO0O0) {
                oh1 oh1Var = this.OooO00o;
                ArrayList arrayListOooO0o0 = pr1.OooO0o0((Set) oh1Var.OooO0o);
                int size = arrayListOooO0o0.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListOooO0o0.get(i);
                    i++;
                    m91 m91Var = (m91) obj;
                    if (!m91Var.OooOO0() && !m91Var.OooO0o()) {
                        m91Var.clear();
                        if (oh1Var.OooO0o0) {
                            ((HashSet) oh1Var.OooO0oO).add(m91Var);
                        } else {
                            m91Var.OooO0oo();
                        }
                    }
                }
            }
        }
    }
}
