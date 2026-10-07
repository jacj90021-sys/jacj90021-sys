package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0O0OOO0 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ String OooO0O0;
    public final /* synthetic */ o0O0O0o0 OooO0OO;
    public final /* synthetic */ zf OooO0Oo;

    public /* synthetic */ o0O0OOO0(zf zfVar, String str, o0O0O0o0 o0o0o0o0, int i) {
        this.OooO00o = i;
        this.OooO0Oo = zfVar;
        this.OooO0O0 = str;
        this.OooO0OO = o0o0o0o0;
    }

    public final void OooO00o(Object obj) {
        int i = this.OooO00o;
        String str = this.OooO0O0;
        zf zfVar = this.OooO0Oo;
        o0O0O0o0 o0o0o0o0 = this.OooO0OO;
        switch (i) {
            case 0:
                Integer num = (Integer) zfVar.OooO0O0.get(str);
                if (num == null) {
                    ra.OooOO0("Attempting to launch an unregistered ActivityResultLauncher with contract ", o0o0o0o0, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                zfVar.OooO0Oo.add(str);
                try {
                    zfVar.OooO0O0(num.intValue(), o0o0o0o0, obj);
                    return;
                } catch (Exception e) {
                    zfVar.OooO0Oo.remove(str);
                    throw e;
                }
            default:
                Integer num2 = (Integer) zfVar.OooO0O0.get(str);
                if (num2 == null) {
                    ra.OooOO0("Attempting to launch an unregistered ActivityResultLauncher with contract ", o0o0o0o0, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                zfVar.OooO0Oo.add(str);
                try {
                    zfVar.OooO0O0(num2.intValue(), o0o0o0o0, obj);
                    return;
                } catch (Exception e2) {
                    zfVar.OooO0Oo.remove(str);
                    throw e2;
                }
        }
    }
}
