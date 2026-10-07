package com.cmaster.cloner;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class so implements cm0 {
    public final /* synthetic */ int OooO0Oo = 2;
    public final Object OooO0o;
    public final Object OooO0o0;

    public so(gm0 gm0Var) {
        this.OooO0o0 = gm0Var;
        ud udVar = ud.OooO0OO;
        Class<?> cls = gm0Var.getClass();
        sd sdVar = (sd) udVar.OooO00o.get(cls);
        this.OooO0o = sdVar == null ? udVar.OooO00o(cls, null) : sdVar;
    }

    @Override // com.cmaster.cloner.cm0
    public final void OooO0o(hm0 hm0Var, wl0 wl0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        Object obj2 = this.OooO0o;
        switch (i) {
            case 0:
                tu tuVar = (tu) obj;
                switch (ro.OooO00o[wl0Var.ordinal()]) {
                    case 1:
                        tuVar.getClass();
                        break;
                    case 2:
                        tuVar.getClass();
                        break;
                    case 3:
                        EmojiCompatInitializer emojiCompatInitializer = tuVar.OooO0o0;
                        (Build.VERSION.SDK_INT >= 28 ? tg.OooO00o(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new oOOoOOO0(2), 500L);
                        tuVar.OooO0Oo.OooOOOO(tuVar);
                        break;
                    case 4:
                        tuVar.getClass();
                        break;
                    case 5:
                        tuVar.getClass();
                        break;
                    case 6:
                        tuVar.getClass();
                        break;
                    case 7:
                        ra.OooOOO("ON_ANY must not been send by anybody");
                        return;
                    default:
                        throw new tf();
                }
                cm0 cm0Var = (cm0) obj2;
                if (cm0Var != null) {
                    cm0Var.OooO0o(hm0Var, wl0Var);
                    return;
                }
                return;
            case 1:
                if (wl0Var == wl0.ON_START) {
                    ((jm0) obj).OooOOOO(this);
                    ((o0O000O) obj2).OoooOOO();
                    return;
                }
                return;
            case 2:
                HashMap map = ((sd) obj2).OooO00o;
                sd.OooO00o((List) map.get(wl0Var), hm0Var, wl0Var, obj);
                sd.OooO00o((List) map.get(wl0.ON_ANY), hm0Var, wl0Var, obj);
                return;
            default:
                if (wl0Var == wl0.ON_PAUSE) {
                    ((CircularProgressIndicator) ((gv1) obj2).OooO0Oo.OooO0o0).setVisibility(4);
                    ((m1) obj).OooO0oO.OooOOOO(this);
                    return;
                }
                return;
        }
    }

    public so(tu tuVar, cm0 cm0Var) {
        tuVar.getClass();
        this.OooO0o0 = tuVar;
        this.OooO0o = cm0Var;
    }

    public so(o0O000O o0o000o, jm0 jm0Var) {
        this.OooO0o0 = jm0Var;
        this.OooO0o = o0o000o;
    }

    public so(gv1 gv1Var, m1 m1Var) {
        this.OooO0o = gv1Var;
        this.OooO0o0 = m1Var;
    }
}
