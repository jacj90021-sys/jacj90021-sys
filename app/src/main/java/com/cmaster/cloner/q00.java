package com.cmaster.cloner;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class q00 {
    public static final np0 OooO00o = new np0(2);
    public static final jg OooO0O0 = new jg(1);

    public static oOo000Oo OooO00o(Context context, List list) {
        String str;
        Typeface typefaceOooO0OO;
        s43.OooO00o("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                r00 r00Var = (r00) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceOooO0OO = gq1.OooO0OO((str = r00Var.OooO0o0))) == null || gq1.OooO0Oo(typefaceOooO0OO) == null) {
                    ProviderInfo providerInfoOooO0O0 = OooO0O0(context.getPackageManager(), r00Var, context.getResources());
                    if (providerInfoOooO0O0 == null) {
                        return new oOo000Oo(6, false);
                    }
                    arrayList.add(OooO0OO(context, r00Var, providerInfoOooO0O0.authority));
                } else {
                    arrayList.add(new c10[]{new c10(str, r00Var.OooO0o)});
                }
            }
            return new oOo000Oo(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo OooO0O0(PackageManager packageManager, r00 r00Var, Resources resources) {
        jg jgVar = OooO0O0;
        np0 np0Var = OooO00o;
        s43.OooO00o("FontProvider.getProvider");
        try {
            List listOooO0O0 = r00Var.OooO0Oo;
            String str = r00Var.OooO00o;
            String str2 = r00Var.OooO0O0;
            if (listOooO0O0 == null) {
                listOooO0O0 = tr2.OooO0O0(resources, 0);
            }
            p00 p00Var = new p00();
            p00Var.OooO00o = str;
            p00Var.OooO0O0 = str2;
            p00Var.OooO0OO = listOooO0O0;
            ProviderInfo providerInfo = (ProviderInfo) np0Var.OooO0o(p00Var);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, jgVar);
            for (int i = 0; i < listOooO0O0.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listOooO0O0.get(i));
                Collections.sort(arrayList2, jgVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    np0Var.OooOO0(p00Var, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static c10[] OooO0OO(Context context, r00 r00Var, String str) {
        s43.OooO00o("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                s43.OooO00o("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {r00Var.OooO0OO};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new c10(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (c10[]) arrayList.toArray(new c10[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
