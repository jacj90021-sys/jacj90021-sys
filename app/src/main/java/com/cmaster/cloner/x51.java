package com.cmaster.cloner;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x51 implements in {
    public static final String[] OooOOO = {"_data"};
    public final int OooO;
    public final Context OooO0Oo;
    public final iu0 OooO0o;
    public final iu0 OooO0o0;
    public final Uri OooO0oO;
    public final int OooO0oo;
    public final xz0 OooOO0;
    public final Class OooOO0O;
    public volatile boolean OooOO0o;
    public volatile in OooOOO0;

    public x51(Context context, iu0 iu0Var, iu0 iu0Var2, Uri uri, int i, int i2, xz0 xz0Var, Class cls) {
        this.OooO0Oo = context.getApplicationContext();
        this.OooO0o0 = iu0Var;
        this.OooO0o = iu0Var2;
        this.OooO0oO = uri;
        this.OooO0oo = i;
        this.OooO = i2;
        this.OooOO0 = xz0Var;
        this.OooOO0O = cls;
    }

    @Override // com.cmaster.cloner.in
    public final Class OooO00o() {
        return this.OooOO0O;
    }

    public final in OooO0O0() throws Throwable {
        hu0 hu0VarOooO0O0;
        Throwable th;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.OooO0Oo;
        xz0 xz0Var = this.OooOO0;
        int i = this.OooO;
        int i2 = this.OooO0oo;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.OooO0oO;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, OooOOO, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            hu0VarOooO0O0 = this.OooO0o0.OooO0O0(file, i2, i, xz0Var);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            Uri requireOriginal = this.OooO0oO;
            boolean zOooO00o = ew2.OooO00o(requireOriginal);
            iu0 iu0Var = this.OooO0o;
            if (zOooO00o && requireOriginal.getPathSegments().contains("picker")) {
                hu0VarOooO0O0 = iu0Var.OooO0O0(requireOriginal, i2, i, xz0Var);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                hu0VarOooO0O0 = iu0Var.OooO0O0(requireOriginal, i2, i, xz0Var);
            }
        }
        if (hu0VarOooO0O0 != null) {
            return hu0VarOooO0O0.OooO0OO;
        }
        return null;
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0Oo() {
        in inVar = this.OooOOO0;
        if (inVar != null) {
            inVar.OooO0Oo();
        }
    }

    @Override // com.cmaster.cloner.in
    public final int OooO0o() {
        return 1;
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0o0(t41 t41Var, hn hnVar) throws Throwable {
        try {
            in inVarOooO0O0 = OooO0O0();
            if (inVarOooO0O0 == null) {
                hnVar.OooO0O0(new IllegalArgumentException("Failed to build fetcher for: " + this.OooO0oO));
            } else {
                this.OooOOO0 = inVarOooO0O0;
                if (this.OooOO0o) {
                    cancel();
                } else {
                    inVarOooO0O0.OooO0o0(t41Var, hnVar);
                }
            }
        } catch (FileNotFoundException e) {
            hnVar.OooO0O0(e);
        }
    }

    @Override // com.cmaster.cloner.in
    public final void cancel() {
        this.OooOO0o = true;
        in inVar = this.OooOOO0;
        if (inVar != null) {
            inVar.cancel();
        }
    }
}
