package com.cmaster.cloner;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO0Ooooo implements iy, dg2 {
    public Object OooO;
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;
    public Object OooO0oO;
    public Object OooO0oo;
    public Object OooOO0;

    public oO0Ooooo() {
        this.OooO0Oo = 2;
        this.OooO0o0 = new int[]{2131230836, 2131230834, 2131230760};
        this.OooO0o = new int[]{2131230784, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.OooO0oO = new int[]{2131230833, 2131230835, 2131230777, R.drawable.abc_text_cursor_material, 2131230830, 2131230831, 2131230832};
        this.OooO0oo = new int[]{2131230809, R.drawable.abc_cab_background_internal_bg, 2131230808};
        this.OooO = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.OooOO0 = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean OooO0OO(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static LayerDrawable OooO0o(pa1 pa1Var, Context context, int i) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableOooO0Oo = pa1Var.OooO0Oo(context, R.drawable.abc_star_black_48dp);
        Drawable drawableOooO0Oo2 = pa1Var.OooO0Oo(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableOooO0Oo instanceof BitmapDrawable) && drawableOooO0Oo.getIntrinsicWidth() == dimensionPixelSize && drawableOooO0Oo.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableOooO0Oo;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableOooO0Oo.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableOooO0Oo.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableOooO0Oo2 instanceof BitmapDrawable) && drawableOooO0Oo2.getIntrinsicWidth() == dimensionPixelSize && drawableOooO0Oo2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableOooO0Oo2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableOooO0Oo2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableOooO0Oo2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static ColorStateList OooO0o0(Context context, int i) {
        int iOooO0OO = sm1.OooO0OO(context, R.attr.colorControlHighlight);
        int iOooO0O0 = sm1.OooO0O0(context, R.attr.colorButtonNormal);
        int[] iArr = sm1.OooO0O0;
        int[] iArr2 = sm1.OooO0Oo;
        int iOooO0O02 = ye.OooO0O0(iOooO0OO, i);
        return new ColorStateList(new int[][]{iArr, iArr2, sm1.OooO0OO, sm1.OooO0o}, new int[]{iOooO0O0, iOooO0O02, ye.OooO0O0(iOooO0OO, i), i});
    }

    public static void OooO0oo(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = n.OooO0O0;
        }
        drawableMutate.setColorFilter(n.OooO0OO(i, mode));
    }

    public ShortcutInfo OooO() {
        lu.OooOO0O();
        ShortcutInfo.Builder intents = lu.OooOo0O((Context) this.OooO0o0, (String) this.OooO0o).setShortLabel((String) this.OooO0oo).setIntents((Intent[]) this.OooO0oO);
        intents.setIcon(((IconCompat) this.OooO).OooO0oO((Context) this.OooO0o0));
        if (!TextUtils.isEmpty(null)) {
            intents.setLongLabel(null);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        intents.setRank(0);
        PersistableBundle persistableBundle = (PersistableBundle) this.OooOO0;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            intents.setLongLived(false);
        } else {
            if (((PersistableBundle) this.OooOO0) == null) {
                this.OooOO0 = new PersistableBundle();
            }
            ((PersistableBundle) this.OooOO0).putBoolean("extraLongLived", false);
            intents.setExtras((PersistableBundle) this.OooOO0);
        }
        if (i >= 33) {
            o000O0o.OooO0Oo(intents);
        }
        return intents.build();
    }

    public void OooO00o(String str, String str2) {
        HashMap map = (HashMap) this.OooOO0;
        if (map != null) {
            map.put(str, str2);
        } else {
            qa.OooO0o("Property \"autoMetadata\" has not been set");
        }
    }

    public void OooO0O0(Intent intent) {
        Bitmap bitmapOooO00o;
        Object obj;
        ApplicationInfo applicationInfo;
        Resources resourcesForApplication;
        Intent[] intentArr = (Intent[]) this.OooO0oO;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", ((String) this.OooO0oo).toString());
        IconCompat iconCompat = (IconCompat) this.OooO;
        Context context = (Context) this.OooO0o0;
        if (iconCompat.OooO00o == 2 && (obj = iconCompat.OooO0O0) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                } else {
                    String strOooO0Oo = iconCompat.OooO0Oo();
                    if ("android".equals(strOooO0Oo)) {
                        resourcesForApplication = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            applicationInfo = packageManager.getApplicationInfo(strOooO0Oo, 8192);
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.e("IconCompat", "Unable to find pkg=" + strOooO0Oo + " for icon", e);
                        }
                        resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (iconCompat.OooO0o0 != identifier) {
                        Log.i("IconCompat", "Id has changed for " + strOooO0Oo + " " + str);
                        iconCompat.OooO0o0 = identifier;
                    }
                }
            }
        }
        int i = iconCompat.OooO00o;
        if (i == 1) {
            bitmapOooO00o = (Bitmap) iconCompat.OooO0O0;
        } else {
            if (i == 2) {
                try {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context.createPackageContext(iconCompat.OooO0Oo(), 0), iconCompat.OooO0o0));
                    return;
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException("Can't find package " + iconCompat.OooO0O0, e2);
                }
            }
            if (i != 5) {
                ra.OooOOO("Icon type not supported for intent shortcuts");
                return;
            }
            bitmapOooO00o = IconCompat.OooO00o((Bitmap) iconCompat.OooO0O0, true);
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapOooO00o);
    }

    public x4 OooO0Oo() {
        String strConcat = ((String) this.OooO0o0) == null ? " transportName" : "";
        if (((xv) this.OooO0oO) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.OooO0oo) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.OooO) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.OooOO0) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new x4((String) this.OooO0o0, (Integer) this.OooO0o, (xv) this.OooO0oO, ((Long) this.OooO0oo).longValue(), ((Long) this.OooO).longValue(), (HashMap) this.OooOO0);
        }
        qa.OooO0o("Missing required properties:".concat(strConcat));
        return null;
    }

    public ColorStateList OooO0oO(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return ep2.OooO0O0(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230826) {
            return ep2.OooO0O0(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return OooO0o0(context, sm1.OooO0OO(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return OooO0o0(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return OooO0o0(context, sm1.OooO0OO(context, R.attr.colorAccent));
            }
            if (i == 2131230821 || i == R.drawable.abc_spinner_textfield_background_material) {
                return ep2.OooO0O0(context, R.color.abc_tint_spinner);
            }
            if (OooO0OO((int[]) this.OooO0o, i)) {
                return sm1.OooO0Oo(context, R.attr.colorControlNormal);
            }
            if (OooO0OO((int[]) this.OooO, i)) {
                return ep2.OooO0O0(context, R.color.abc_tint_default);
            }
            if (OooO0OO((int[]) this.OooOO0, i)) {
                return ep2.OooO0O0(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return ep2.OooO0O0(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListOooO0Oo = sm1.OooO0Oo(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListOooO0Oo == null || !colorStateListOooO0Oo.isStateful()) {
            iArr[0] = sm1.OooO0O0;
            iArr2[0] = sm1.OooO0O0(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = sm1.OooO0o0;
            iArr2[1] = sm1.OooO0OO(context, R.attr.colorControlActivated);
            iArr[2] = sm1.OooO0o;
            iArr2[2] = sm1.OooO0OO(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = sm1.OooO0O0;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListOooO0Oo.getColorForState(iArr3, 0);
            iArr[1] = sm1.OooO0o0;
            iArr2[1] = sm1.OooO0OO(context, R.attr.colorControlActivated);
            iArr[2] = sm1.OooO0o;
            iArr2[2] = colorStateListOooO0Oo.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public k42 OooOO0() {
        Application application = (Application) ((lg2) this.OooO0o0).zza();
        qa2 qa2Var = (qa2) ((zf2) this.OooO0o).zza();
        Handler handler = kd2.OooO00o;
        u73.OooO00o(handler);
        gd2 gd2Var = kd2.OooO0O0;
        u73.OooO00o(gd2Var);
        return new k42(application, qa2Var, handler, gd2Var, (qh2) ((lg2) this.OooO0oO).zza(), ((n52) ((lg2) this.OooO0oo)).zza(), (q72) ((na1) this.OooO).zza(), (s52) ((lg2) this.OooOO0).zza());
    }

    @Override // com.cmaster.cloner.q51
    public Object get() {
        Context context = (Context) ((q51) this.OooO0o0).get();
        ot0 ot0Var = (ot0) ((q51) this.OooO0o).get();
        qc1 qc1Var = (qc1) ((q51) this.OooO0oO).get();
        a02 a02Var = (a02) ((a02) this.OooO0oo).get();
        Executor executor = (Executor) ((q51) this.OooO).get();
        qc1 qc1Var2 = (qc1) ((q51) this.OooOO0).get();
        qc3 qc3Var = new qc3(14);
        yn1 yn1Var = new yn1();
        yn1Var.OooO0o0 = context;
        yn1Var.OooO0o = ot0Var;
        yn1Var.OooO0Oo = qc1Var;
        yn1Var.OooO0oO = a02Var;
        yn1Var.OooO0oo = executor;
        yn1Var.OooO = qc1Var2;
        yn1Var.OooOO0 = qc3Var;
        return yn1Var;
    }

    @Override // com.cmaster.cloner.lg2
    public Object zza() {
        switch (this.OooO0Oo) {
            case 7:
                Application application = (Application) ((lg2) this.OooO0o0).zza();
                return new q72(application, (qa2) ((zf2) this.OooO0oO).zza(), (s52) ((lg2) this.OooO0oo).zza(), (o92) ((uf) this.OooO).OooO0Oo, (vr1) this.OooOO0);
            default:
                return OooOO0();
        }
    }

    public /* synthetic */ oO0Ooooo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
        this.OooO0oO = obj3;
        this.OooO0oo = obj4;
        this.OooO = obj5;
        this.OooOO0 = obj6;
    }

    public oO0Ooooo(Context context, String str) {
        String strConcat;
        this.OooO0Oo = 10;
        this.OooO0o0 = context.getApplicationContext();
        this.OooO0o = str;
        this.OooO0oO = new TreeMap();
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + e12.OooO00o(context).OooO0oO(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            int i = uh2.OooO0O0;
            uh2.OooO0oo("Unable to get package version name for reporting", e);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.OooOO0 = strConcat;
    }

    public oO0Ooooo(Set set, String str, String str2) {
        this.OooO0Oo = 4;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.OooO0o0 = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.OooO0oO = str;
        this.OooO0oo = str2;
        this.OooO = ch1.OooO0O0;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.OooO0o = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw px0.OooOO0o(it);
    }

    public oO0Ooooo(Context context) {
        this.OooO0Oo = 1;
        this.OooO0o0 = context;
        this.OooOO0 = (hm0) j1.OooO00o(context);
    }

    public /* synthetic */ oO0Ooooo(int i) {
        this.OooO0Oo = i;
    }
}
