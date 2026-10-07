package com.cmaster.cloner;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ke1 implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference OooO0Oo;

    public ke1(SeekBarPreference seekBarPreference) {
        this.OooO0Oo = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SeekBarPreference seekBarPreference = this.OooO0Oo;
            if ((seekBarPreference.OoooOOO || (i != 21 && i != 22)) && i != 23 && i != 66) {
                SeekBar seekBar = seekBarPreference.OoooOO0;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
        }
        return false;
    }
}
