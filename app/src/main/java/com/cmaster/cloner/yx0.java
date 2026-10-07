package com.cmaster.cloner;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class yx0 {
    public static <T, V> ObjectAnimator OooO00o(T t, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
