package com.cmaster.cloner;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mt1 {
    public static final ArrayList OooO0Oo = new ArrayList();
    public WeakHashMap OooO00o;
    public SparseArray OooO0O0;
    public WeakReference OooO0OO;

    public final View OooO00o(View view) {
        int size;
        WeakHashMap weakHashMap = this.OooO00o;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewOooO00o = OooO00o(viewGroup.getChildAt(childCount));
                    if (viewOooO00o != null) {
                        return viewOooO00o;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                ra.OooOO0o();
            }
        }
        return null;
    }
}
