package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class se extends we {
    public static final List OooO(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final void OooO0Oo(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, a40 a40Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            pj1.OooO00o(sb, obj, a40Var);
        }
        sb.append(charSequence3);
    }

    public static List OooO0o(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listOooO = OooO(iterable);
            if (((ArrayList) listOooO).size() > 1) {
                Collections.sort(listOooO);
            }
            return listOooO;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return OooO0oo(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static String OooO0o0(Collection collection, String str, String str2, String str3, OooOOO0 oooOOO0, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            oooOOO0 = null;
        }
        collection.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        StringBuilder sb = new StringBuilder();
        OooO0Oo(collection, sb, str4, str5, str6, "...", oooOOO0);
        return sb.toString();
    }

    public static List OooO0oO(Comparator comparator, Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listOooO = OooO(iterable);
            if (((ArrayList) listOooO).size() > 1) {
                Collections.sort(listOooO, comparator);
            }
            return listOooO;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return OooO0oo(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List OooO0oo(Iterable iterable) {
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        nv nvVar = nv.OooO0Oo;
        if (!z) {
            List listOooO = OooO(iterable);
            ArrayList arrayList = (ArrayList) listOooO;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? listOooO : te.OooO0O0(arrayList.get(0)) : nvVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return nvVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return te.OooO0O0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }
}
