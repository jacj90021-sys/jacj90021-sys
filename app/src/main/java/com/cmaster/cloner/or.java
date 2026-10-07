package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Process;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class or implements ju0, rr, jk1 {
    public final /* synthetic */ int OooO0Oo;
    public final Context OooO0o0;

    public /* synthetic */ or(Context context, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = context;
    }

    @Override // com.cmaster.cloner.rr
    public Class OooO00o() {
        return AssetFileDescriptor.class;
    }

    @Override // com.cmaster.cloner.rr
    public void OooO0O0(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // com.cmaster.cloner.rr
    public Object OooO0OO(int i, Resources.Theme theme, Resources resources) {
        return resources.openRawResourceFd(i);
    }

    @Override // com.cmaster.cloner.jk1
    public kk1 OooO0Oo(km kmVar) {
        String str = (String) kmVar.OooO0OO;
        qb qbVar = (qb) kmVar.OooO0Oo;
        qbVar.getClass();
        if (str == null || str.length() == 0) {
            ra.OooOOO("Must set a non-null database name to a configuration that uses the no backup directory.");
            return null;
        }
        km kmVar2 = new km(this.OooO0o0, str, qbVar, true);
        return new h30((Context) kmVar2.OooO0O0, (String) kmVar2.OooO0OO, (qb) kmVar2.OooO0Oo, kmVar2.OooO00o);
    }

    public CharSequence OooO0o(String str) {
        Context context = this.OooO0o0;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public ApplicationInfo OooO0o0(int i, String str) {
        return this.OooO0o0.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo OooO0oO(int i, String str) {
        return this.OooO0o0.getPackageManager().getPackageInfo(str, i);
    }

    public boolean OooO0oo() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.OooO0o0;
        if (callingUid == iMyUid) {
            return hh0.OooO00o(context);
        }
        if (!vx2.OooO00o() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        int i = this.OooO0Oo;
        Context context = this.OooO0o0;
        switch (i) {
            case 0:
                return new t3(context, this);
            default:
                return new sr0(context, 2);
        }
    }
}
