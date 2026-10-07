package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class OooO00o implements View.OnClickListener {
    public final /* synthetic */ SearchView OooO0Oo;

    public OooO00o(SearchView searchView) {
        this.OooO0Oo = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SearchView searchView = this.OooO0Oo;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.OooOOoo;
        if (view == searchView.OooOo0o) {
            searchView.OooOo0o(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.Oooo;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.OooOoO0) {
            searchView.OooOO0o();
            return;
        }
        if (view == searchView.OooOo) {
            searchView.OooOOOo();
            return;
        }
        if (view != searchView.OooOoO) {
            if (view == searchAutoComplete) {
                searchView.OooOO0O();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.OooooO0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.OooOO0(searchView.Oooo0o0, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.Oooo0OO);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
