package com.cmaster.cloner;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w20 implements j70, jd1, eu1 {
    public final o10 OooO0Oo;
    public bu1 OooO0o;
    public final du1 OooO0o0;
    public jm0 OooO0oO = null;
    public e81 OooO0oo = null;

    public w20(o10 o10Var, du1 du1Var) {
        this.OooO0Oo = o10Var;
        this.OooO0o0 = du1Var;
    }

    @Override // com.cmaster.cloner.j70
    public final bu1 OooO00o() {
        Application application;
        o10 o10Var = this.OooO0Oo;
        bu1 bu1VarOooO00o = o10Var.OooO00o();
        if (!bu1VarOooO00o.equals(o10Var.OoooOO0)) {
            this.OooO0o = bu1VarOooO00o;
            return bu1VarOooO00o;
        }
        if (this.OooO0o == null) {
            Context applicationContext = o10Var.Oooo().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.OooO0o = new kd1(application, this, o10Var.OooO);
        }
        return this.OooO0o;
    }

    @Override // com.cmaster.cloner.j70
    public final fv0 OooO0O0() {
        Application application;
        o10 o10Var = this.OooO0Oo;
        Context applicationContext = o10Var.Oooo().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        fv0 fv0Var = new fv0();
        LinkedHashMap linkedHashMap = fv0Var.OooO00o;
        if (application != null) {
            linkedHashMap.put(au1.OooOO0O, application);
        }
        linkedHashMap.put(h82.OooO00o, this);
        linkedHashMap.put(h82.OooO0O0, this);
        Bundle bundle = o10Var.OooO;
        if (bundle != null) {
            linkedHashMap.put(h82.OooO0OO, bundle);
        }
        return fv0Var;
    }

    @Override // com.cmaster.cloner.eu1
    public final du1 OooO0OO() {
        OooO0oO();
        return this.OooO0o0;
    }

    @Override // com.cmaster.cloner.jd1
    public final o0O000O OooO0Oo() {
        OooO0oO();
        return (o0O000O) this.OooO0oo.OooO0o;
    }

    @Override // com.cmaster.cloner.hm0
    public final jm0 OooO0o() {
        OooO0oO();
        return this.OooO0oO;
    }

    public final void OooO0o0(wl0 wl0Var) {
        this.OooO0oO.OooO(wl0Var);
    }

    public final void OooO0oO() {
        if (this.OooO0oO == null) {
            this.OooO0oO = new jm0(this);
            id1 id1Var = new id1(this, new wf(this, 5));
            this.OooO0oo = new e81(id1Var);
            id1Var.OooO00o();
            h82.OooO0O0(this);
        }
    }
}
