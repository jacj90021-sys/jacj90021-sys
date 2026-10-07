package com.cmaster.cloner;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class je1 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBarPreference OooO00o;

    public je1(SeekBarPreference seekBarPreference) {
        this.OooO00o = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBarPreference seekBarPreference = this.OooO00o;
        if (!z || (!seekBarPreference.OoooOo0 && seekBarPreference.OoooO)) {
            int i2 = i + seekBarPreference.OoooO00;
            TextView textView = seekBarPreference.o000oOoO;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
                return;
            }
            return;
        }
        int progress = seekBar.getProgress() + seekBarPreference.OoooO00;
        if (progress != seekBarPreference.Oooo) {
            seekBarPreference.OooOoO(progress, false);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.OooO00o.OoooO = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        SeekBarPreference seekBarPreference = this.OooO00o;
        seekBarPreference.OoooO = false;
        int progress2 = seekBar.getProgress();
        int i = seekBarPreference.OoooO00;
        if (progress2 + i == seekBarPreference.Oooo || (progress = seekBar.getProgress() + i) == seekBarPreference.Oooo) {
            return;
        }
        seekBarPreference.OooOoO(progress, false);
    }
}
