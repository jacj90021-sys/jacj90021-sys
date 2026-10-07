package com.cmaster.cloner;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ly2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static y81 OooO00o(com.bumptech.glide.OooO00o oooO00o, ArrayList arrayList) {
        Class cls;
        ia1 t9Var;
        ia1 e8Var;
        k8 k8Var;
        int i;
        boolean z;
        ContentResolver contentResolver;
        Class cls2;
        k8 k8Var2 = oooO00o.OooO0Oo;
        jp0 jp0Var = oooO00o.OooO0oO;
        j50 j50Var = oooO00o.OooO0o;
        Context applicationContext = j50Var.getApplicationContext();
        o00OO000 o00oo000 = j50Var.OooO0oo;
        y81 y81Var = new y81();
        ho hoVar = new ho();
        cw cwVar = y81Var.OooO0oO;
        synchronized (cwVar) {
            cwVar.OooO00o.add(hoVar);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            wx wxVar = new wx();
            cw cwVar2 = y81Var.OooO0oO;
            synchronized (cwVar2) {
                cls = AssetFileDescriptor.class;
                cwVar2.OooO00o.add(wxVar);
            }
        } else {
            cls = AssetFileDescriptor.class;
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListOooO0o0 = y81Var.OooO0o0();
        w9 w9Var = new w9(applicationContext, arrayListOooO0o0, k8Var2, jp0Var);
        ia1 vs1Var = new vs1(k8Var2, new gu0(14));
        us usVar = new us(y81Var.OooO0o0(), resources.getDisplayMetrics(), k8Var2, jp0Var);
        if (i2 < 28 || !((Map) o00oo000.OooO0o0).containsKey(h50.class)) {
            t9Var = new t9(usVar, 0);
            e8Var = new e8(usVar, jp0Var, 2);
        } else {
            e8Var = new u9(1);
            t9Var = new u9(0);
        }
        if (i2 >= 28) {
            i = i2;
            k8Var = k8Var2;
            y81Var.OooO0Oo("Animation", InputStream.class, Drawable.class, new oOo0o0oO(1, new e81(arrayListOooO0o0, jp0Var, 2)));
            z = false;
            y81Var.OooO0Oo("Animation", ByteBuffer.class, Drawable.class, new oOo0o0oO(0 == true ? 1 : 0, new e81(arrayListOooO0o0, jp0Var, 2)));
        } else {
            k8Var = k8Var2;
            i = i2;
            z = false;
        }
        ia1 ka1Var = new ka1(applicationContext);
        la1 g8Var = new g8(jp0Var);
        qa1 ooo000oo = new oOo000Oo(2, z);
        qa1 im2Var = new im2();
        ContentResolver contentResolver2 = applicationContext.getContentResolver();
        int i3 = 4;
        y81Var.OooO00o(ByteBuffer.class, new iu(i3));
        y81Var.OooO00o(InputStream.class, new nz0(jp0Var, i3));
        y81Var.OooO0Oo("Bitmap", ByteBuffer.class, Bitmap.class, t9Var);
        y81Var.OooO0Oo("Bitmap", InputStream.class, Bitmap.class, e8Var);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            contentResolver = contentResolver2;
            cls2 = ParcelFileDescriptor.class;
        } else {
            contentResolver = contentResolver2;
            ia1 t9Var2 = new t9(usVar, 1);
            cls2 = ParcelFileDescriptor.class;
            y81Var.OooO0Oo("Bitmap", cls2, Bitmap.class, t9Var2);
        }
        k8 k8Var3 = k8Var;
        y81Var.OooO0Oo("Bitmap", cls, Bitmap.class, new vs1(k8Var3, new je(14)));
        y81Var.OooO0Oo("Bitmap", cls2, Bitmap.class, vs1Var);
        ju0 ju0Var = je.OooO0o;
        y81Var.OooO0OO(Bitmap.class, Bitmap.class, ju0Var);
        y81Var.OooO0Oo("Bitmap", Bitmap.class, Bitmap.class, new pz(1));
        y81Var.OooO0O0(Bitmap.class, g8Var);
        y81Var.OooO0Oo("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new e8(resources, t9Var));
        y81Var.OooO0Oo("BitmapDrawable", InputStream.class, BitmapDrawable.class, new e8(resources, e8Var));
        y81Var.OooO0Oo("BitmapDrawable", cls2, BitmapDrawable.class, new e8(resources, vs1Var));
        y81Var.OooO0O0(BitmapDrawable.class, new e81(k8Var3, g8Var, 7));
        y81Var.OooO0Oo("Animation", InputStream.class, x40.class, new hj1(arrayListOooO0o0, w9Var, jp0Var));
        y81Var.OooO0Oo("Animation", ByteBuffer.class, x40.class, w9Var);
        y81Var.OooO0O0(x40.class, new v03());
        y81Var.OooO0OO(ni1.class, ni1.class, ju0Var);
        y81Var.OooO0Oo("Bitmap", ni1.class, Bitmap.class, new h8(k8Var3));
        y81Var.OooO0Oo("legacy_append", Uri.class, Drawable.class, ka1Var);
        y81Var.OooO0Oo("legacy_append", Uri.class, Bitmap.class, new e8(ka1Var, k8Var3, 1));
        y81Var.OooO(new x9(0));
        y81Var.OooO0OO(File.class, ByteBuffer.class, new s60());
        y81Var.OooO0OO(File.class, InputStream.class, new rz(new d83(7)));
        y81Var.OooO0Oo("legacy_append", File.class, File.class, new pz(0));
        y81Var.OooO0OO(File.class, cls2, new rz(new v03()));
        y81Var.OooO0OO(File.class, File.class, ju0Var);
        y81Var.OooO(new wg0(jp0Var));
        if (!"robolectric".equals(str)) {
            y81Var.OooO(new x9(2));
        }
        ju0 prVar = new pr(applicationContext, 0);
        ju0 orVar = new or(applicationContext, 0);
        ju0 hgVar = new hg(applicationContext, 2);
        Class cls3 = Integer.TYPE;
        y81Var.OooO0OO(cls3, InputStream.class, prVar);
        y81Var.OooO0OO(Integer.class, InputStream.class, prVar);
        Class cls4 = cls;
        y81Var.OooO0OO(cls3, cls4, orVar);
        y81Var.OooO0OO(Integer.class, cls4, orVar);
        y81Var.OooO0OO(cls3, Drawable.class, hgVar);
        y81Var.OooO0OO(Integer.class, Drawable.class, hgVar);
        y81Var.OooO0OO(Uri.class, InputStream.class, new pr(applicationContext, 4));
        y81Var.OooO0OO(Uri.class, cls4, new hg(applicationContext, 5));
        ju0 f8Var = new f8(resources);
        ju0 nz0Var = new nz0(resources, 3);
        ju0 na1Var = new na1(resources, 0);
        y81Var.OooO0OO(Integer.class, Uri.class, f8Var);
        y81Var.OooO0OO(cls3, Uri.class, f8Var);
        y81Var.OooO0OO(Integer.class, cls4, nz0Var);
        y81Var.OooO0OO(cls3, cls4, nz0Var);
        y81Var.OooO0OO(Integer.class, InputStream.class, na1Var);
        y81Var.OooO0OO(cls3, InputStream.class, na1Var);
        y81Var.OooO0OO(String.class, InputStream.class, new ay1(15));
        y81Var.OooO0OO(Uri.class, InputStream.class, new ay1(15));
        int i4 = 13;
        y81Var.OooO0OO(String.class, InputStream.class, new je(i4));
        y81Var.OooO0OO(String.class, cls2, new oOO0OO());
        y81Var.OooO0OO(String.class, cls4, new qc3(12));
        y81Var.OooO0OO(Uri.class, InputStream.class, new o00OO000(applicationContext.getAssets(), 6));
        y81Var.OooO0OO(Uri.class, cls4, new xb1(applicationContext.getAssets(), 5));
        y81Var.OooO0OO(Uri.class, InputStream.class, new pr(applicationContext, 2));
        y81Var.OooO0OO(Uri.class, InputStream.class, new or(applicationContext, 1));
        if (i >= 29) {
            y81Var.OooO0OO(Uri.class, InputStream.class, new w51(applicationContext, InputStream.class));
            y81Var.OooO0OO(Uri.class, cls2, new w51(applicationContext, cls2));
        }
        ContentResolver contentResolver3 = contentResolver;
        y81Var.OooO0OO(Uri.class, InputStream.class, new bn1(contentResolver3));
        y81Var.OooO0OO(Uri.class, cls2, new nz0(contentResolver3, 9));
        y81Var.OooO0OO(Uri.class, cls4, new cn1(contentResolver3));
        y81Var.OooO0OO(Uri.class, InputStream.class, new qc3(13));
        y81Var.OooO0OO(URL.class, InputStream.class, new d83(i4));
        int i5 = 4;
        y81Var.OooO0OO(Uri.class, File.class, new hg(applicationContext, i5));
        y81Var.OooO0OO(s50.class, InputStream.class, new xb1(19));
        y81Var.OooO0OO(byte[].class, ByteBuffer.class, new qc3(3));
        y81Var.OooO0OO(byte[].class, InputStream.class, new je(i5));
        y81Var.OooO0OO(Uri.class, Uri.class, ju0Var);
        y81Var.OooO0OO(Drawable.class, Drawable.class, ju0Var);
        y81Var.OooO0Oo("legacy_append", Drawable.class, Drawable.class, new pz(2));
        y81Var.OooOO0(Bitmap.class, BitmapDrawable.class, new f8(resources));
        y81Var.OooOO0(Bitmap.class, byte[].class, ooo000oo);
        y81Var.OooOO0(Drawable.class, byte[].class, new a02(k8Var3, ooo000oo, im2Var, 8));
        y81Var.OooOO0(x40.class, byte[].class, im2Var);
        ia1 vs1Var2 = new vs1(k8Var3, new iu(14));
        y81Var.OooO0Oo("legacy_append", ByteBuffer.class, Bitmap.class, vs1Var2);
        y81Var.OooO0Oo("legacy_append", ByteBuffer.class, BitmapDrawable.class, new e8(resources, vs1Var2));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw px0.OooOO0o(it);
        }
        return y81Var;
    }
}
