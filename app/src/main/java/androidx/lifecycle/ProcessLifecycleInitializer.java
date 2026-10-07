package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.cmaster.cloner.a02;
import com.cmaster.cloner.am0;
import com.cmaster.cloner.bm0;
import com.cmaster.cloner.nv;
import com.cmaster.cloner.og0;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.wl0;
import com.cmaster.cloner.y41;
import com.cmaster.cloner.z41;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements og0 {
    @Override // com.cmaster.cloner.og0
    public final List OooO00o() {
        return nv.OooO0Oo;
    }

    @Override // com.cmaster.cloner.og0
    public final Object OooO0O0(Context context) {
        context.getClass();
        a02 a02VarOooOoO0 = a02.OooOoO0(context);
        a02VarOooOoO0.getClass();
        if (!((HashSet) a02VarOooOoO0.OooO0o).contains(ProcessLifecycleInitializer.class)) {
            qa.OooO0o("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!bm0.OooO00o.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new am0());
        }
        z41 z41Var = z41.OooOO0o;
        z41Var.getClass();
        z41Var.OooO0oo = new Handler();
        z41Var.OooO.OooO(wl0.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new y41(z41Var));
        return z41Var;
    }
}
