package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.cmaster.cloner.ui.RouterActivity;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.TimeZone;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOO0OO implements uj, r9, e41, ly, e00, zv, ju0, mr1, eu, ig {
    public static App OooO0Oo;
    public static oOO0OO OooO0oO;
    public static oOO0OO OooO0oo;
    public static final /* synthetic */ oOO0OO OooO0o0 = new oOO0OO();
    public static final oOO0OO OooO0o = new oOO0OO();

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooOOO(App app) {
        synchronized (e2.class) {
            e2 e2Var = new e2(app);
            e2.OooO = e2Var;
            if (e2Var.OooO0OO) {
                e2Var.OooO0OO();
            }
        }
        int i = 0;
        if (e2.OooO.OooO0OO) {
            y81 y81VarOooO00o = com.bumptech.glide.OooO00o.OooO00o(app).OooO0o.OooO00o();
            y81VarOooO00o.OooO0OO(ApplicationInfo.class, Drawable.class, new o00OO000(app, 16));
            y81VarOooO00o.OooO0OO(ApplicationInfo.class, InputStream.class, new ay1(app, 23));
            y81VarOooO00o.OooO0OO(ApplicationInfo.class, AssetFileDescriptor.class, new xb1(app, 17));
            y81VarOooO00o.OooO0oo(Drawable.class, new oOO0OO());
            y81VarOooO00o.OooO0oo(Bitmap.class, new d83(8));
            ArrayList arrayList = j1.OooO00o;
            j1.OooO0o0 = new ComponentName(e2.OooO.OooO00o, (Class<?>) RouterActivity.class);
            o0OOOO0o.OooO0OO.OooO00o.OooO0oO(new oOO0OO0O(4));
            w50 w50Var = new w50();
            if (TextUtils.equals(TimeZone.getDefault().getID(), "Asia/Shanghai")) {
                w50Var.OooO0Oo = true;
            }
            dr0.OooO00o().OooO0O0 = w50Var;
            oO0Ooooo oo0ooooo = new oO0Ooooo(i);
            oo0ooooo.OooO0oo = new er0(sn2.OooO00o("ktY1a8UoE9mE1TUzhW8OmMWDLT2NbQ6bxI8oJYZqCJHIjyA6jGo=\n", "8bcYCrVYPqk=\n"));
            oo0ooooo.OooO = new er0(sn2.OooO00o("e7TZPZ6FzS5tt9ll3sLQbyzhwWvWwNBsLe3Ec9jH1W4r4sBq28Q=\n", "GNX0XO714F4=\n"));
            oo0ooooo.OooO0oO = new er0(sn2.OooO00o("t51CMiCPncehnkJqYMiAhuDIWmRoyoCF4cRffGnLhIXiyltiZMo=\n", "1PxvU1D/sLc=\n"));
            oo0ooooo.OooOO0 = new er0(sn2.OooO00o("kM4XX4yuLXKGzRcHzOkwM8ebDwnE6zAwxpcKEcXoNDDLnQ4Jyes=\n", "8686PvzeAAI=\n"));
            oo0ooooo.OooO0o = new er0(sn2.OooO00o("8EyFexBNCuHmT4UjUAoXoKcZnS1YCBejphWYNVkKFKaqGJooVwo=\n", "ky2oGmA9J5E=\n"));
            oo0ooooo.OooO0o0 = new er0("");
            kn2.OooO00o = oo0ooooo;
            i81.OooO0oo.OooO0O0.OooO0oO(new oOO0OO0O(2));
            do0 do0Var = do0.OooO0OO;
            int i2 = 3;
            boolean zOooO00o = do0Var.OooO00o(3);
            int i3 = do0Var.OooO00o(3) ? 140180 : do0Var.OooO00o(7) ? 100150 : 99120;
            int i4 = zOooO00o ? 50 : 20;
            dr0.OooO00o().OooO0O0(2, (er0) kn2.OooO00o.OooOO0).OooO0Oo.add(new o5(zOooO00o ? 20 : 10));
            dr0.OooO00o().OooO0O0(4, (er0) kn2.OooO00o.OooO0o).OooO0Oo.add(new p5(sn2.OooO00o("ber+7RTteA577fP+Aw==\n", "HpqSjGeFJ3w=\n"), i3, i4));
            dr0.OooO00o().OooO0O0(3, (er0) kn2.OooO00o.OooO0oO).OooO0Oo.add(new r5(sn2.OooO00o("frqsoie/\n", "DN/bw1Xbuu0=\n"), i3, i4));
            ((x41) x41.OooO0O0.OooO0O0()).OooO00o.OooO0oO(new oOO0OO0O(i));
            h01.OooO0OO.OooO0O0 = new gu0(i2);
        }
        String simpleName = oOO0OO.class.getSimpleName();
        Object obj = eo0.OooO0o0.get(qn2.OooO00o("NAghxHbGmJMeMxDlRLecmAE1\n", "UXBVthfoyME=\n"));
        if (((Integer) (obj != null ? obj : 0)).intValue() == 0) {
            Thread.setDefaultUncaughtExceptionHandler(new xz1(simpleName));
        }
    }

    public static void OooOOO0(App app) {
        OooO0Oo = app;
        v7.OooO00o = 0;
        t7.OooO00o = 0;
        a02.OooO = new e51(app, qn2.OooO00o("l806xdHgGQ6AxyXF0eEXE5HQeYjd4FYemcMkn9f/Vh6YzTmOwKM+NLHuc7jX/w4Ul8c=\n", "9KJX67KNeH0=\n"));
        a02.OooO0oo = new a02(qn2.OooO00o("Si8GQq8oVuddJRlCrylY+kwyRTyNCHzZZg0x\n", "KUBrbMxFN5Q=\n"));
    }

    @Override // com.cmaster.cloner.e41
    public CharSequence OooO(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.o000oOoO) ? editTextPreference.OooO0Oo.getString(R.string.not_set) : editTextPreference.o000oOoO;
    }

    @Override // com.cmaster.cloner.r9, com.cmaster.cloner.tz
    public Class OooO00o() {
        return InputStream.class;
    }

    @Override // com.cmaster.cloner.mr1
    public void OooO0O0(i10 i10Var) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(i10Var.OooO0OO)));
    }

    @Override // com.cmaster.cloner.e00
    public void OooO0OO(RectF rectF, float f, pa paVar) {
        rectF.bottom -= Math.abs(paVar.OooO0o - paVar.OooO0Oo) * f;
    }

    @Override // com.cmaster.cloner.ly
    public void OooO0Oo(Object obj) {
    }

    @Override // com.cmaster.cloner.ig
    public Object OooO0o0(ab1 ab1Var) {
        return new pg1((Context) ab1Var.OooO00o(Context.class));
    }

    @Override // com.cmaster.cloner.r9
    public Object OooO0oO(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // com.cmaster.cloner.eu
    public du OooO0oo(Context context, String str, cu cuVar) {
        du duVar = new du();
        int iOooOO0o = cuVar.OooOO0o(context, str, true);
        duVar.OooO0O0 = iOooOO0o;
        if (iOooOO0o != 0) {
            duVar.OooO0OO = 1;
            return duVar;
        }
        int iOooOOO0 = cuVar.OooOOO0(context, str);
        duVar.OooO00o = iOooOOO0;
        if (iOooOOO0 != 0) {
            duVar.OooO0OO = -1;
        }
        return duVar;
    }

    @Override // com.cmaster.cloner.e00
    public pa OooOO0(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float fOooO0Oo = dp1.OooO0Oo(f4, f6, f2, f3, f, true);
        float f8 = fOooO0Oo / f4;
        float f9 = fOooO0Oo / f6;
        return new pa(f8, f9, fOooO0Oo, f5 * f8, fOooO0Oo, f7 * f9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.io.IOException, java.lang.Throwable] */
    @Override // com.cmaster.cloner.zv
    public boolean OooOO0O(Object obj, File file, xz0 xz0Var) throws Throwable {
        Bitmap bitmap;
        File file2;
        FileOutputStream fileOutputStream;
        Drawable drawable = (Drawable) obj;
        boolean z = false;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 1024) {
                intrinsicWidth = 1024;
            }
            if (intrinsicHeight > 1024) {
                intrinsicHeight = 1024;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            bitmap = bitmapCreateBitmap;
        }
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        try {
            try {
                file2 = new File(file.getParent(), file.getName() + ".glide");
                file2.getParentFile().mkdirs();
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e) {
            e = e;
        }
        try {
            boolean zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            file.delete();
            file2.renameTo(file);
            try {
                fileOutputStream.close();
                return zCompress;
            } catch (IOException e2) {
                e2.printStackTrace();
                z = zCompress;
                fileOutputStream2 = e2;
                return z;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            fileOutputStream3 = fileOutputStream;
            e.printStackTrace();
            fileOutputStream2 = fileOutputStream3;
            if (fileOutputStream3 != null) {
                try {
                    fileOutputStream3.close();
                    fileOutputStream2 = fileOutputStream3;
                } catch (IOException e4) {
                    e4.printStackTrace();
                    fileOutputStream2 = fileOutputStream3;
                }
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    @Override // com.cmaster.cloner.e00
    public boolean OooOO0o(pa paVar) {
        return paVar.OooO0Oo > paVar.OooO0o;
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        return new nj1(ho1Var.OooOO0O(Uri.class, ParcelFileDescriptor.class), 0);
    }
}
