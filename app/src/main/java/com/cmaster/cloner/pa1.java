package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pa1 {
    public static pa1 OooO0oO;
    public WeakHashMap OooO00o;
    public final WeakHashMap OooO0O0 = new WeakHashMap(0);
    public TypedValue OooO0OO;
    public boolean OooO0Oo;
    public oO0Ooooo OooO0o0;
    public static final PorterDuff.Mode OooO0o = PorterDuff.Mode.SRC_IN;
    public static final oa1 OooO0oo = new oa1(6);

    public static synchronized pa1 OooO0OO() {
        try {
            if (OooO0oO == null) {
                OooO0oO = new pa1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return OooO0oO;
    }

    public static synchronized PorterDuffColorFilter OooO0o(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        oa1 oa1Var = OooO0oo;
        oa1Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) oa1Var.OooO0o(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final void OooO00o(Context context, int i, ColorStateList colorStateList) {
        if (this.OooO00o == null) {
            this.OooO00o = new WeakHashMap();
        }
        ci1 ci1Var = (ci1) this.OooO00o.get(context);
        if (ci1Var == null) {
            ci1Var = new ci1();
            this.OooO00o.put(context, ci1Var);
        }
        int i2 = ci1Var.OooO0o;
        if (i2 != 0) {
            int[] iArr = ci1Var.OooO0Oo;
            if (i <= iArr[i2 - 1]) {
                int iOooO00o = tf0.OooO00o(iArr, i2, i);
                if (iOooO00o >= 0) {
                    ci1Var.OooO0o0[iOooO00o] = colorStateList;
                    return;
                }
                int i3 = ~iOooO00o;
                int i4 = ci1Var.OooO0o;
                if (i3 < i4) {
                    Object[] objArr = ci1Var.OooO0o0;
                    if (objArr[i3] == p82.OooO00o) {
                        ci1Var.OooO0Oo[i3] = i;
                        objArr[i3] = colorStateList;
                        return;
                    }
                }
                if (i4 >= ci1Var.OooO0Oo.length) {
                    int i5 = (i4 + 1) * 4;
                    int i6 = 4;
                    while (true) {
                        if (i6 >= 32) {
                            break;
                        }
                        int i7 = (1 << i6) - 12;
                        if (i5 <= i7) {
                            i5 = i7;
                            break;
                        }
                        i6++;
                    }
                    int i8 = i5 / 4;
                    ci1Var.OooO0Oo = Arrays.copyOf(ci1Var.OooO0Oo, i8);
                    ci1Var.OooO0o0 = Arrays.copyOf(ci1Var.OooO0o0, i8);
                }
                int i9 = ci1Var.OooO0o;
                if (i9 - i3 != 0) {
                    int[] iArr2 = ci1Var.OooO0Oo;
                    int i10 = i3 + 1;
                    o3.OooO00o(i10, i3, i9, iArr2, iArr2);
                    Object[] objArr2 = ci1Var.OooO0o0;
                    o3.OooO0O0(objArr2, i10, objArr2, i3, ci1Var.OooO0o);
                }
                ci1Var.OooO0Oo[i3] = i;
                ci1Var.OooO0o0[i3] = colorStateList;
                ci1Var.OooO0o++;
                return;
            }
        }
        if (i2 >= ci1Var.OooO0Oo.length) {
            int i11 = (i2 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            ci1Var.OooO0Oo = Arrays.copyOf(ci1Var.OooO0Oo, i14);
            ci1Var.OooO0o0 = Arrays.copyOf(ci1Var.OooO0o0, i14);
        }
        ci1Var.OooO0Oo[i2] = i;
        ci1Var.OooO0o0[i2] = colorStateList;
        ci1Var.OooO0o = i2 + 1;
    }

    public final Drawable OooO0O0(Context context, int i) throws Resources.NotFoundException {
        LayerDrawable layerDrawableOooO0o;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        if (this.OooO0OO == null) {
            this.OooO0OO = new TypedValue();
        }
        TypedValue typedValue = this.OooO0OO;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            gp0 gp0Var = (gp0) this.OooO0O0.get(context);
            layerDrawableOooO0o = null;
            if (gp0Var != null && (weakReference = (WeakReference) gp0Var.OooO0O0(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iOooO0O0 = tf0.OooO0O0(gp0Var.OooO0o0, gp0Var.OooO0oO, j);
                    if (iOooO0O0 >= 0) {
                        Object[] objArr = gp0Var.OooO0o;
                        Object obj = objArr[iOooO0O0];
                        Object obj2 = o62.OooO00o;
                        if (obj != obj2) {
                            objArr[iOooO0O0] = obj2;
                            gp0Var.OooO0Oo = true;
                        }
                    }
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.OooO0o0 != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableOooO0o = new LayerDrawable(new Drawable[]{OooO0Oo(context, R.drawable.abc_cab_background_internal_bg), OooO0Oo(context, 2131230777)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableOooO0o = oO0Ooooo.OooO0o(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableOooO0o = oO0Ooooo.OooO0o(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableOooO0o = oO0Ooooo.OooO0o(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableOooO0o == null) {
            return layerDrawableOooO0o;
        }
        layerDrawableOooO0o.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableOooO0o.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableOooO0o;
                }
                gp0 gp0Var2 = (gp0) this.OooO0O0.get(context);
                if (gp0Var2 == null) {
                    gp0Var2 = new gp0();
                    this.OooO0O0.put(context, gp0Var2);
                }
                gp0Var2.OooO0Oo(j, new WeakReference(constantState2));
                return layerDrawableOooO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable OooO0Oo(Context context, int i) {
        return OooO0o0(context, i, false);
    }

    public final synchronized Drawable OooO0o0(Context context, int i, boolean z) {
        Drawable drawableOooO0O0;
        try {
            if (!this.OooO0Oo) {
                this.OooO0Oo = true;
                Drawable drawableOooO0Oo = OooO0Oo(context, R.drawable.abc_vector_test);
                if (drawableOooO0Oo == null || (!(drawableOooO0Oo instanceof hs1) && !"android.graphics.drawable.VectorDrawable".equals(drawableOooO0Oo.getClass().getName()))) {
                    this.OooO0Oo = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableOooO0O0 = OooO0O0(context, i);
            if (drawableOooO0O0 == null) {
                drawableOooO0O0 = context.getDrawable(i);
            }
            if (drawableOooO0O0 != null) {
                drawableOooO0O0 = OooO0oo(context, i, z, drawableOooO0O0);
            }
            if (drawableOooO0O0 != null) {
                ct.OooO00o(drawableOooO0O0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableOooO0O0;
    }

    public final synchronized ColorStateList OooO0oO(Context context, int i) {
        ColorStateList colorStateList;
        ci1 ci1Var;
        Object obj;
        WeakHashMap weakHashMap = this.OooO00o;
        ColorStateList colorStateListOooO0oO = null;
        if (weakHashMap == null || (ci1Var = (ci1) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int iOooO00o = tf0.OooO00o(ci1Var.OooO0Oo, ci1Var.OooO0o, i);
            if (iOooO00o < 0 || (obj = ci1Var.OooO0o0[iOooO00o]) == p82.OooO00o) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            oO0Ooooo oo0ooooo = this.OooO0o0;
            if (oo0ooooo != null) {
                colorStateListOooO0oO = oo0ooooo.OooO0oO(context, i);
            }
            if (colorStateListOooO0oO != null) {
                OooO00o(context, i, colorStateListOooO0oO);
            }
            colorStateList = colorStateListOooO0oO;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable OooO0oo(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.pa1.OooO0oo(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
