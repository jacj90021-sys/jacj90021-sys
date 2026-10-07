package androidx.work;

import com.cmaster.cloner.bn;
import com.cmaster.cloner.cn;
import com.cmaster.cloner.vg0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends vg0 {
    @Override // com.cmaster.cloner.vg0
    public final cn OooO00o(ArrayList arrayList) throws Throwable {
        int i = 0;
        bn bnVar = new bn(0);
        HashMap map = new HashMap();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            map.putAll(Collections.unmodifiableMap(((cn) obj).OooO00o));
        }
        bnVar.OooO0O0(map);
        cn cnVar = new cn(bnVar.OooO00o);
        cn.OooO0OO(cnVar);
        return cnVar;
    }
}
