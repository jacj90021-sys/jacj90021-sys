package com.cmaster.cloner;

import androidx.core.widget.ContentLoadingProgressBar;

public final class ti implements Runnable {
    public final int OooO0Oo;
    public final ContentLoadingProgressBar OooO0o0;

    public ti(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = contentLoadingProgressBar;
    }

    @Override
    public final void run() {
        int i = this.OooO0Oo;
        ContentLoadingProgressBar contentLoadingProgressBar = this.OooO0o0;
        if (i == 0) {
            contentLoadingProgressBar.setVisibility(8);
            return;
        }
        System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }
}