package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ma extends o00000O {
    public final /* synthetic */ na OooOO0O;

    public ma(na naVar) {
        this.OooOO0O = naVar;
    }

    @Override // com.cmaster.cloner.o00000O
    public final String OooO0o() {
        la laVar = (la) this.OooOO0O.OooO0Oo.get();
        if (laVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + laVar.OooO00o + "]";
    }
}
