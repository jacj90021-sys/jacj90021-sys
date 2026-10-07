package com.cmaster.cloner;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class my1 {
    public static boolean OooO00o(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode OooO0O0(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
