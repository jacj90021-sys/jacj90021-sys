package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d6 extends th {
    public int OooOO0O;
    public int OooOO0o;
    public e6 OooOOO0;

    public boolean getAllowsGoneWidget() {
        return this.OooOOO0.oo000o;
    }

    public int getMargin() {
        return this.OooOOO0.o00oO0o;
    }

    public int getType() {
        return this.OooOO0O;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.OooOOO0.oo000o = z;
    }

    public void setDpMargin(int i) {
        this.OooOOO0.o00oO0o = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.OooOOO0.o00oO0o = i;
    }

    public void setType(int i) {
        this.OooOO0O = i;
    }
}
