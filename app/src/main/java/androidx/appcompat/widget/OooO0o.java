package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class OooO0o implements Runnable {
    public final /* synthetic */ SearchView.SearchAutoComplete OooO0Oo;

    public OooO0o(SearchView.SearchAutoComplete searchAutoComplete) {
        this.OooO0Oo = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.OooO0Oo;
        if (searchAutoComplete.OooOO0) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.OooOO0 = false;
        }
    }
}
