package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.cmaster.cloner.a02;
import com.cmaster.cloner.hm0;
import com.cmaster.cloner.jm0;
import com.cmaster.cloner.og0;
import com.cmaster.cloner.pr;
import com.cmaster.cloner.su;
import com.cmaster.cloner.t00;
import com.cmaster.cloner.tu;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements og0 {
    @Override // com.cmaster.cloner.og0
    public final List OooO00o() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // com.cmaster.cloner.og0
    public final Object OooO0O0(Context context) {
        Object objOooOOOO;
        t00 t00Var = new t00(new pr(context));
        t00Var.OooO00o = 1;
        if (su.OooOO0O == null) {
            synchronized (su.OooOO0) {
                try {
                    if (su.OooOO0O == null) {
                        su.OooOO0O = new su(t00Var);
                    }
                } finally {
                }
            }
        }
        a02 a02VarOooOoO0 = a02.OooOoO0(context);
        a02VarOooOoO0.getClass();
        synchronized (a02.OooOO0O) {
            try {
                objOooOOOO = ((HashMap) a02VarOooOoO0.OooO0o0).get(ProcessLifecycleInitializer.class);
                if (objOooOOOO == null) {
                    objOooOOOO = a02VarOooOoO0.OooOOOO(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        jm0 jm0VarOooO0o = ((hm0) objOooOOOO).OooO0o();
        jm0VarOooO0o.OooO0OO(new tu(this, jm0VarOooO0o));
        return Boolean.TRUE;
    }
}
