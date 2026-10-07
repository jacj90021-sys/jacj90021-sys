package com.cmaster.cloner;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d41 implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference OooO0Oo;

    public d41(Preference preference) {
        this.OooO0Oo = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.OooO0Oo;
        CharSequence charSequenceOooO0o0 = preference.OooO0o0();
        if (!preference.OooOooo || TextUtils.isEmpty(charSequenceOooO0o0)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceOooO0o0);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.OooO0Oo;
        Context context = preference.OooO0Oo;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        CharSequence charSequenceOooO0o0 = preference.OooO0o0();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceOooO0o0));
        Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceOooO0o0), 0).show();
        return true;
    }
}
