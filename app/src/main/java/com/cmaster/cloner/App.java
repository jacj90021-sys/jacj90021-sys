package com.cmaster.cloner;

import android.app.Application;
import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class App extends Application {
    public final oOO0OO OooO0Oo = new oOO0OO();

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        try {
            this.OooO0Oo.getClass();
            oOO0OO.OooOOO0(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        try {
            this.OooO0Oo.getClass();
            oOO0OO.OooOOO(this);
        } catch (Exception unused) {
        }
    }
}
