package com.cmaster.cloner;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rr0 implements in {
    public static final String[] OooO0oO = {"_data"};
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public final Object OooO0o0;

    public /* synthetic */ rr0(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
    }

    private final void OooO() {
    }

    private final void OooO0O0() {
    }

    private final void OooO0OO() {
    }

    private final void OooO0oO() {
    }

    private final void OooO0oo() {
    }

    @Override // com.cmaster.cloner.in
    public final Class OooO00o() {
        switch (this.OooO0Oo) {
            case 0:
                return File.class;
            case 1:
                return ((r9) this.OooO0o).OooO00o();
            default:
                return InputStream.class;
        }
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0Oo() throws IOException {
        switch (this.OooO0Oo) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.OooO0o).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
        }
    }

    @Override // com.cmaster.cloner.in
    public final int OooO0o() {
        switch (this.OooO0Oo) {
        }
        return 1;
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0o0(t41 t41Var, hn hnVar) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                Cursor cursorQuery = ((Context) obj).getContentResolver().query((Uri) this.OooO0o, OooO0oO, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    hnVar.OooO0oO(new File(string));
                    return;
                }
                hnVar.OooO0O0(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.OooO0o)));
                return;
            case 1:
                hnVar.OooO0oO(((r9) this.OooO0o).OooO0oO((byte[]) obj));
                return;
            default:
                try {
                    ByteArrayInputStream byteArrayInputStreamOooO00o = s60.OooO00o((String) obj);
                    this.OooO0o = byteArrayInputStreamOooO00o;
                    hnVar.OooO0oO(byteArrayInputStreamOooO00o);
                    return;
                } catch (IllegalArgumentException e) {
                    hnVar.OooO0O0(e);
                    return;
                }
        }
    }

    @Override // com.cmaster.cloner.in
    public final void cancel() {
        int i = this.OooO0Oo;
    }

    public rr0(String str, s60 s60Var) {
        this.OooO0Oo = 2;
        this.OooO0o0 = str;
    }
}
