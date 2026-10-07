package com.cmaster.cloner;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class en {
    public static final DataBinderMapperImpl OooO00o;

    static {
        DataBinderMapperImpl dataBinderMapperImpl = new DataBinderMapperImpl();
        dataBinderMapperImpl.OooO00o = new HashSet();
        dataBinderMapperImpl.OooO0O0 = new CopyOnWriteArrayList();
        dataBinderMapperImpl.OooO0OO = new CopyOnWriteArrayList();
        dataBinderMapperImpl.OooO0OO(new com.bumptech.matrix.DataBinderMapperImpl());
        OooO00o = dataBinderMapperImpl;
    }

    public static rt1 OooO00o(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        return OooO00o.OooO0O0(layoutInflater.inflate(i, viewGroup, false), i);
    }
}
