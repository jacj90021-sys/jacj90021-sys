package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t3 implements iu0 {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;

    public t3(App app, l50 l50Var) {
        this.OooO00o = 2;
        this.OooO0O0 = app.getApplicationContext();
        this.OooO0OO = l50Var;
    }

    @Override // com.cmaster.cloner.iu0
    public final boolean OooO00o(Object obj) {
        int i = this.OooO00o;
        Object obj2 = this.OooO0O0;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    if (((iu0) obj3).OooO00o(obj)) {
                        break;
                    }
                }
                break;
            case 4:
                break;
            default:
                Uri uri2 = (Uri) obj;
                if ("android.resource".equals(uri2.getScheme()) && ((Context) obj2).getPackageName().equals(uri2.getAuthority())) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // com.cmaster.cloner.iu0
    public final hu0 OooO0O0(Object obj, int i, int i2, xz0 xz0Var) throws NumberFormatException {
        hu0 hu0VarOooO0O0;
        Uri uri;
        int i3 = this.OooO00o;
        hu0 hu0VarOooO0O02 = null;
        Object obj2 = this.OooO0O0;
        Object obj3 = this.OooO0OO;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new hu0(new by0(uri2), ((s3) obj3).OooOo0O((AssetManager) obj2, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) xz0Var.OooO0OO(ka1.OooO0O0);
                return new hu0(new by0(num), new qr(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (rr) obj3, num.intValue()));
            case 2:
                ApplicationInfo applicationInfo = (ApplicationInfo) obj;
                Resources.Theme theme2 = (Resources.Theme) xz0Var.OooO0OO(ka1.OooO0O0);
                return new hu0(new by0(applicationInfo.sourceDir), new k50(theme2, theme2 != null ? theme2.getResources() : ((Context) obj2).getResources(), (l50) obj3, applicationInfo));
            case 3:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                zk0 zk0Var = null;
                for (int i4 = 0; i4 < size; i4++) {
                    iu0 iu0Var = (iu0) arrayList.get(i4);
                    if (iu0Var.OooO00o(obj) && (hu0VarOooO0O0 = iu0Var.OooO0O0(obj, i, i2, xz0Var)) != null) {
                        zk0Var = hu0VarOooO0O0.OooO00o;
                        arrayList2.add(hu0VarOooO0O0.OooO0OO);
                    }
                }
                if (arrayList2.isEmpty() || zk0Var == null) {
                    return null;
                }
                return new hu0(zk0Var, new yu0(arrayList2, (r31) obj3));
            case 4:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) obj3;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((iu0) obj2).OooO0O0(uri, i, i2, xz0Var);
            default:
                Uri uri3 = (Uri) obj;
                iu0 iu0Var2 = (iu0) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int i5 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i5 != 0) {
                            hu0VarOooO0O02 = iu0Var2.OooO0O0(Integer.valueOf(i5), i, i2, xz0Var);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return hu0VarOooO0O02;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return hu0VarOooO0O02;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return hu0VarOooO0O02;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                Context context = (Context) obj2;
                int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                if (identifier != 0) {
                    return iu0Var2.OooO0O0(Integer.valueOf(identifier), i, i2, xz0Var);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.OooO00o) {
            case 3:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.OooO0O0).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public t3(Resources resources, iu0 iu0Var) {
        this.OooO00o = 4;
        this.OooO0OO = resources;
        this.OooO0O0 = iu0Var;
    }

    public /* synthetic */ t3(Object obj, Object obj2, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
    }

    public t3(Context context, rr rrVar) {
        this.OooO00o = 1;
        this.OooO0O0 = context.getApplicationContext();
        this.OooO0OO = rrVar;
    }

    public t3(Context context, iu0 iu0Var) {
        this.OooO00o = 5;
        this.OooO0O0 = context.getApplicationContext();
        this.OooO0OO = iu0Var;
    }
}
