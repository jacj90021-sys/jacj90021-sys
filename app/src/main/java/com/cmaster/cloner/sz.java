package com.cmaster.cloner;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sz implements in {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o;
    public final Comparable OooO0o0;
    public Object OooO0oO;

    public /* synthetic */ sz(int i, Comparable comparable, Object obj) {
        this.OooO0Oo = i;
        this.OooO0o0 = comparable;
        this.OooO0o = obj;
    }

    public static sz OooO0O0(Context context, Uri uri, dn1 dn1Var) {
        return new sz(1, uri, new ho1(com.bumptech.glide.OooO00o.OooO00o(context).OooO0o.OooO00o().OooO0o0(), dn1Var, com.bumptech.glide.OooO00o.OooO00o(context).OooO0oO, context.getContentResolver()));
    }

    private final void OooO0OO() {
    }

    private final void OooO0oO() {
    }

    @Override // com.cmaster.cloner.in
    public final Class OooO00o() {
        switch (this.OooO0Oo) {
            case 0:
                return ((tz) this.OooO0o).OooO00o();
            default:
                return InputStream.class;
        }
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0Oo() throws IOException {
        switch (this.OooO0Oo) {
            case 0:
                Object obj = this.OooO0oO;
                if (obj != null) {
                    try {
                        ((tz) this.OooO0o).OooO0O0(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.OooO0oO;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.in
    public final int OooO0o() {
        switch (this.OooO0Oo) {
        }
        return 1;
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0o0(t41 t41Var, hn hnVar) throws Throwable {
        switch (this.OooO0Oo) {
            case 0:
                try {
                    Object objOooOO0 = ((tz) this.OooO0o).OooOO0((File) this.OooO0o0);
                    this.OooO0oO = objOooOO0;
                    hnVar.OooO0oO(objOooOO0);
                    break;
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e);
                    }
                    hnVar.OooO0O0(e);
                    return;
                }
            default:
                try {
                    InputStream inputStreamOooO0oo = OooO0oo();
                    this.OooO0oO = inputStreamOooO0oo;
                    hnVar.OooO0oO(inputStreamOooO0oo);
                    break;
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
                    }
                    hnVar.OooO0O0(e2);
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x002c: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:45), block:B:11:0x002c */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[PHI: r6
      0x0033: PHI (r6v7 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v10 android.database.Cursor) binds: [B:26:0x0056, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #8 {all -> 0x002b, blocks: (B:6:0x001c, B:8:0x0022, B:23:0x0041, B:25:0x0047), top: B:83:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream OooO0oo() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.sz.OooO0oo():java.io.InputStream");
    }

    @Override // com.cmaster.cloner.in
    public final void cancel() {
        int i = this.OooO0Oo;
    }
}
