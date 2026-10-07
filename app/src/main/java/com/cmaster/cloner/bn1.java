package com.cmaster.cloner;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bn1 implements dn1, ju0, fr1 {
    public static final String[] OooO0o0 = {"_data"};
    public final ContentResolver OooO0Oo;

    public /* synthetic */ bn1(ContentResolver contentResolver) {
        this.OooO0Oo = contentResolver;
    }

    @Override // com.cmaster.cloner.dn1
    public Cursor OooO00o(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.OooO0Oo.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, OooO0o0, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // com.cmaster.cloner.fr1
    public in OooO0OO(Uri uri) {
        return new ij1(1, uri, this.OooO0Oo);
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        return new gr1(this);
    }
}
