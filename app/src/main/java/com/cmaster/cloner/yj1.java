package com.cmaster.cloner;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yj1 extends ql implements View.OnClickListener {
    public static final /* synthetic */ int OooOoOO = 0;
    public final int OooOO0O;
    public final int OooOO0o;
    public final SearchView OooOOO;
    public final LayoutInflater OooOOO0;
    public final SearchableInfo OooOOOO;
    public final Context OooOOOo;
    public final int OooOOo;
    public final WeakHashMap OooOOo0;
    public int OooOOoo;
    public int OooOo;
    public int OooOo0;
    public ColorStateList OooOo00;
    public int OooOo0O;
    public int OooOo0o;
    public int OooOoO;
    public int OooOoO0;

    public yj1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.OooO0o0 = true;
        this.OooO0o = null;
        this.OooO0Oo = false;
        this.OooO0oO = -1;
        this.OooO0oo = new ol(this);
        this.OooO = new pl(this, 0);
        this.OooOO0o = suggestionRowLayout;
        this.OooOO0O = suggestionRowLayout;
        this.OooOOO0 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.OooOOoo = 1;
        this.OooOo0 = -1;
        this.OooOo0O = -1;
        this.OooOo0o = -1;
        this.OooOo = -1;
        this.OooOoO0 = -1;
        this.OooOoO = -1;
        this.OooOOO = searchView;
        this.OooOOOO = searchableInfo;
        this.OooOOo = searchView.getSuggestionCommitIconResId();
        this.OooOOOo = context;
        this.OooOOo0 = weakHashMap;
    }

    public static String OooO0oO(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    @Override // com.cmaster.cloner.ql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(android.view.View r21, android.database.Cursor r22) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.yj1.OooO00o(android.view.View, android.database.Cursor):void");
    }

    @Override // com.cmaster.cloner.ql
    public final void OooO0O0(Cursor cursor) {
        try {
            super.OooO0O0(cursor);
            if (cursor != null) {
                this.OooOo0 = cursor.getColumnIndex("suggest_text_1");
                this.OooOo0O = cursor.getColumnIndex("suggest_text_2");
                this.OooOo0o = cursor.getColumnIndex("suggest_text_2_url");
                this.OooOo = cursor.getColumnIndex("suggest_icon_1");
                this.OooOoO0 = cursor.getColumnIndex("suggest_icon_2");
                this.OooOoO = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // com.cmaster.cloner.ql
    public final String OooO0OO(Cursor cursor) {
        String strOooO0oO;
        String strOooO0oO2;
        if (cursor == null) {
            return null;
        }
        String strOooO0oO3 = OooO0oO(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strOooO0oO3 != null) {
            return strOooO0oO3;
        }
        SearchableInfo searchableInfo = this.OooOOOO;
        if (searchableInfo.shouldRewriteQueryFromData() && (strOooO0oO2 = OooO0oO(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strOooO0oO2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strOooO0oO = OooO0oO(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strOooO0oO;
    }

    public final Drawable OooO0Oo(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            qa.OooOO0o(uri, "No authority: ");
            return null;
        }
        try {
            Resources resourcesForApplication = this.OooOOOo.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                qa.OooOO0o(uri, "No path: ");
                return null;
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    qa.OooOO0o(uri, "Single path segment is not a resource ID: ");
                    return null;
                }
            } else {
                if (size != 2) {
                    qa.OooOO0o(uri, "More than two path segments: ");
                    return null;
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            qa.OooOO0o(uri, "No resource found for: ");
            return null;
        } catch (PackageManager.NameNotFoundException unused2) {
            qa.OooOO0o(uri, "No package found for authority: ");
            return null;
        }
    }

    public final Cursor OooO0o(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.OooOOOo.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable OooO0o0(java.lang.String r11) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.yj1.OooO0o0(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // com.cmaster.cloner.ql, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.OooOOO0.inflate(this.OooOO0o, viewGroup, false);
            if (viewInflate != null) {
                ((xj1) viewInflate.getTag()).OooO00o.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // com.cmaster.cloner.ql, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.OooOOO0.inflate(this.OooOO0O, viewGroup, false);
            viewInflate.setTag(new xj1(viewInflate));
            ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.OooOOo);
            ((xj1) viewInflate.getTag()).OooO00o.setText(e.toString());
            return viewInflate;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.OooO0o;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.OooO0o;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.OooOOO.OooOOOO((CharSequence) tag);
        }
    }
}
