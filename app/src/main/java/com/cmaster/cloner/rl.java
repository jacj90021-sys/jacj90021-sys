package com.cmaster.cloner;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rl extends Filter {
    public ql OooO00o;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.OooO00o.OooO0OO((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
            r3 = this;
            com.cmaster.cloner.ql r3 = r3.OooO00o
            com.cmaster.cloner.yj1 r3 = (com.cmaster.cloner.yj1) r3
            androidx.appcompat.widget.SearchView r0 = r3.OooOOO
            if (r4 != 0) goto Lb
            java.lang.String r4 = ""
            goto Lf
        Lb:
            java.lang.String r4 = r4.toString()
        Lf:
            int r1 = r0.getVisibility()
            r2 = 0
            if (r1 != 0) goto L31
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L1d
            goto L31
        L1d:
            android.app.SearchableInfo r0 = r3.OooOOOO     // Catch: java.lang.RuntimeException -> L29
            android.database.Cursor r3 = r3.OooO0o(r0, r4)     // Catch: java.lang.RuntimeException -> L29
            if (r3 == 0) goto L31
            r3.getCount()     // Catch: java.lang.RuntimeException -> L29
            goto L32
        L29:
            r3 = move-exception
            java.lang.String r4 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions query threw an exception."
            android.util.Log.w(r4, r0, r3)
        L31:
            r3 = r2
        L32:
            android.widget.Filter$FilterResults r4 = new android.widget.Filter$FilterResults
            r4.<init>()
            if (r3 == 0) goto L42
            int r0 = r3.getCount()
            r4.count = r0
            r4.values = r3
            goto L47
        L42:
            r3 = 0
            r4.count = r3
            r4.values = r2
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.rl.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        ql qlVar = this.OooO00o;
        Cursor cursor = qlVar.OooO0o;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        qlVar.OooO0O0((Cursor) obj);
    }
}
