package androidx.databinding;

import android.util.Log;
import android.view.View;
import com.cmaster.cloner.dn;
import com.cmaster.cloner.rt1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class MergedDataBinderMapper extends dn {
    public HashSet OooO00o;
    public CopyOnWriteArrayList OooO0O0;
    public CopyOnWriteArrayList OooO0OO;

    @Override // com.cmaster.cloner.dn
    public final rt1 OooO0O0(View view, int i) throws ClassNotFoundException {
        Iterator it = this.OooO0O0.iterator();
        while (it.hasNext()) {
            rt1 rt1VarOooO0O0 = ((dn) it.next()).OooO0O0(view, i);
            if (rt1VarOooO0O0 != null) {
                return rt1VarOooO0O0;
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooO0OO;
        Iterator it2 = copyOnWriteArrayList.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            try {
                Class<?> cls = Class.forName(str);
                if (dn.class.isAssignableFrom(cls)) {
                    OooO0OO((dn) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        if (z) {
            return OooO0O0(view, i);
        }
        return null;
    }

    public final void OooO0OO(dn dnVar) {
        if (this.OooO00o.add(dnVar.getClass())) {
            this.OooO0O0.add(dnVar);
            Iterator it = dnVar.OooO00o().iterator();
            while (it.hasNext()) {
                OooO0OO((dn) it.next());
            }
        }
    }
}
