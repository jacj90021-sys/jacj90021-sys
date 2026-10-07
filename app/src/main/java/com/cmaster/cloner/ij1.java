package com.cmaster.cloner;

import android.content.UriMatcher;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ij1 extends r3 {
    public static final UriMatcher OooO0oo;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        OooO0oo = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    @Override // com.cmaster.cloner.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO(android.net.Uri r3, android.content.ContentResolver r4) throws java.io.FileNotFoundException {
        /*
            r2 = this;
            android.content.UriMatcher r2 = com.cmaster.cloner.ij1.OooO0oo
            int r2 = r2.match(r3)
            r0 = 1
            if (r2 == r0) goto L19
            r1 = 3
            if (r2 == r1) goto L14
            r1 = 5
            if (r2 == r1) goto L19
            java.io.InputStream r2 = r4.openInputStream(r3)
            goto L23
        L14:
            java.io.InputStream r2 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r3, r0)
            goto L23
        L19:
            android.net.Uri r2 = android.provider.ContactsContract.Contacts.lookupContact(r4, r3)
            if (r2 == 0) goto L2d
            java.io.InputStream r2 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r4, r2, r0)
        L23:
            if (r2 == 0) goto L26
            return r2
        L26:
            java.lang.String r2 = "InputStream is null for "
            com.cmaster.cloner.qa.OooOO0o(r3, r2)
            r2 = 0
            return r2
        L2d:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.String r3 = "Contact cannot be found"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ij1.OooO(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }

    @Override // com.cmaster.cloner.in
    public final Class OooO00o() {
        return InputStream.class;
    }

    @Override // com.cmaster.cloner.r3
    public final void OooO0oO(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
