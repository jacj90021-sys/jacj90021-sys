package com.cmaster.cloner;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bd extends BaseAdapter {
    public final Intent OooO0Oo;
    public final Context OooO0o;
    public final LayoutInflater OooO0o0;
    public final ArrayList OooO0oO;
    public final /* synthetic */ cd OooO0oo;

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.BaseAdapter, com.cmaster.cloner.bd] */
    public bd(cd cdVar, Activity activity, Intent intent, Intent[] intentArr) {
        ActivityInfo activityInfoResolveActivityInfo;
        String packageName;
        String string;
        ActivityInfo activityInfoOooOOOO;
        a02 a02Var = cdVar.OooO0o;
        this.OooO0oo = cdVar;
        this.OooO0o = activity;
        Intent intent2 = new Intent(intent);
        this.OooO0Oo = intent2;
        this.OooO0o0 = (LayoutInflater) activity.getSystemService(u7.OooO00o(new byte[]{15, 67, -35, 6, 41, -32, -2, -46, 13, 68, -56, 8, 40, -15, -45}, new byte[]{99, 34, -92, 105, 92, -108, -95, -69}));
        this.OooO0oO = new ArrayList();
        mx1 mx1Var = cdVar.OooO0o0;
        List listOooOOO = mx1Var.OooOOO(intent, intent2.resolveTypeIfNeeded(activity.getContentResolver()), 65600, cdVar.OooO0oO);
        if (intentArr != null) {
            for (Intent intent3 : intentArr) {
                if (intent3 != null && (activityInfoOooOOOO = mx1Var.OooOOOO(cdVar.OooO0oO, intent3)) != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.activityInfo = activityInfoOooOOOO;
                    if (intent3 instanceof LabeledIntent) {
                        LabeledIntent labeledIntent = (LabeledIntent) intent3;
                        resolveInfo.resolvePackageName = labeledIntent.getSourcePackage();
                        resolveInfo.labelRes = labeledIntent.getLabelResource();
                        resolveInfo.nonLocalizedLabel = labeledIntent.getNonLocalizedLabel();
                        resolveInfo.icon = labeledIntent.getIconResource();
                    }
                    this.OooO0oO.add(new ad(false, resolveInfo, a02Var.Oooo0O0(cdVar.OooO0oO, resolveInfo), null, intent3));
                }
            }
        }
        bd bdVar = this;
        if (listOooOOO != null) {
            int size = listOooOOO.size();
            bdVar = this;
            if (size > 0) {
                ResolveInfo resolveInfo2 = (ResolveInfo) listOooOOO.get(0);
                int i = size;
                for (int i2 = 1; i2 < i; i2++) {
                    ResolveInfo resolveInfo3 = (ResolveInfo) listOooOOO.get(i2);
                    if (resolveInfo2.priority != resolveInfo3.priority || resolveInfo2.isDefault != resolveInfo3.isDefault) {
                        while (i2 < i) {
                            listOooOOO.remove(i2);
                            i--;
                        }
                    }
                }
                if (i > 1) {
                    Collections.sort(listOooOOO, new zc(cdVar.OooO0oO, a02Var));
                }
                ResolveInfo resolveInfo4 = (ResolveInfo) listOooOOO.get(0);
                ResolveInfo resolveInfo5 = resolveInfo4;
                CharSequence charSequenceOooo0O0 = a02Var.Oooo0O0(cdVar.OooO0oO, resolveInfo4);
                int i3 = 1;
                int i4 = 0;
                bd bdVar2 = this;
                while (i3 < i) {
                    charSequenceOooo0O0 = charSequenceOooo0O0 == null ? resolveInfo5.activityInfo.packageName : charSequenceOooo0O0;
                    ResolveInfo resolveInfo6 = (ResolveInfo) listOooOOO.get(i3);
                    CharSequence charSequenceOooo0O02 = a02Var.Oooo0O0(cdVar.OooO0oO, resolveInfo6);
                    charSequenceOooo0O02 = charSequenceOooo0O02 == null ? resolveInfo6.activityInfo.packageName : charSequenceOooo0O02;
                    if (!charSequenceOooo0O02.equals(charSequenceOooo0O0)) {
                        bdVar2.OooO0O0(listOooOOO, i4, i3 - 1, resolveInfo5, charSequenceOooo0O0);
                        i4 = i3;
                        resolveInfo5 = resolveInfo6;
                        charSequenceOooo0O0 = charSequenceOooo0O02;
                    }
                    i3++;
                    bdVar2 = this;
                }
                bd bdVar3 = this;
                bdVar3.OooO0O0(listOooOOO, i4, i - 1, resolveInfo5, charSequenceOooo0O0);
                bdVar = bdVar3;
            }
        }
        if (!bdVar.OooO0oO.isEmpty()) {
            Context context = bdVar.OooO0o;
            String str = rv1.OooO00o;
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(u7.OooO00o(new byte[]{-10}, new byte[]{-34, 114, 70, 34, -35, -42, 52, 93}));
                try {
                    string = context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                } catch (Exception unused) {
                    string = applicationInfo.packageName;
                }
                sb.append(string);
                packageName = rj.OooO0oo(new byte[]{115}, new byte[]{90, 111, -110, -48, -79, -50, -103, -116}, sb);
            } else {
                packageName = context.getPackageName();
            }
            ArrayList arrayList = bdVar.OooO0oO;
            int size2 = arrayList.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj = arrayList.get(i5);
                i5++;
                ad adVar = (ad) obj;
                adVar.OooO0OO = ((Object) adVar.OooO0OO) + " " + (cdVar.OooO0oO + 1) + packageName;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        PackageManager packageManager = activity.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = (listOooOOO == null || listOooOOO.isEmpty() || intent.getComponent() == null) ? packageManager.queryIntentActivities(intent, 65536) : null;
        if (intentArr != null) {
            for (Intent intent4 : intentArr) {
                if (intent4 != null && (activityInfoResolveActivityInfo = intent4.resolveActivityInfo(packageManager, 0)) != null && activityInfoResolveActivityInfo.exported && ((TextUtils.isEmpty(activityInfoResolveActivityInfo.permission) || bdVar.OooO0o.checkPermission(activityInfoResolveActivityInfo.permission, Process.myPid(), Process.myUid()) == 0) && !TextUtils.equals(activityInfoResolveActivityInfo.packageName, bdVar.OooO0o.getPackageName()))) {
                    ResolveInfo resolveInfo7 = new ResolveInfo();
                    resolveInfo7.activityInfo = activityInfoResolveActivityInfo;
                    if (intent4 instanceof LabeledIntent) {
                        LabeledIntent labeledIntent2 = (LabeledIntent) intent4;
                        resolveInfo7.resolvePackageName = labeledIntent2.getSourcePackage();
                        resolveInfo7.labelRes = labeledIntent2.getLabelResource();
                        resolveInfo7.nonLocalizedLabel = labeledIntent2.getNonLocalizedLabel();
                        resolveInfo7.icon = labeledIntent2.getIconResource();
                    }
                    arrayList2.add(new ad(true, resolveInfo7, resolveInfo7.loadLabel(packageManager), null, intent4));
                }
            }
        }
        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
            for (ResolveInfo resolveInfo8 : listQueryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo8.activityInfo;
                if (activityInfo.exported && (TextUtils.isEmpty(activityInfo.permission) || bdVar.OooO0o.checkPermission(resolveInfo8.activityInfo.permission, Process.myPid(), Process.myUid()) == 0)) {
                    String str2 = resolveInfo8.activityInfo.packageName;
                    if (str2 == null || !str2.contains(activity.getPackageName())) {
                        arrayList2.add(new ad(true, resolveInfo8, resolveInfo8.loadLabel(packageManager), null, null));
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        bdVar.OooO0oO.addAll(arrayList2);
    }

    public final Intent OooO00o(int i) {
        ArrayList arrayList = this.OooO0oO;
        if (arrayList == null) {
            return null;
        }
        ad adVar = (ad) arrayList.get(i);
        Intent intent = adVar.OooO0o;
        if (intent == null) {
            intent = this.OooO0Oo;
        }
        Intent intent2 = new Intent(intent);
        intent2.addFlags(50331648);
        ActivityInfo activityInfo = adVar.OooO0O0.activityInfo;
        intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
        return intent2;
    }

    public final void OooO0O0(List list, int i, int i2, ResolveInfo resolveInfo, CharSequence charSequence) {
        cd cdVar = this.OooO0oo;
        a02 a02Var = cdVar.OooO0o;
        boolean z = true;
        int i3 = (i2 - i) + 1;
        ArrayList arrayList = this.OooO0oO;
        if (i3 == 1) {
            arrayList.add(new ad(false, resolveInfo, charSequence, null, null));
            return;
        }
        CharSequence charSequenceOooo0 = a02Var.Oooo0(cdVar.OooO0oO, resolveInfo.activityInfo.applicationInfo);
        boolean z2 = charSequenceOooo0 == null;
        if (!z2) {
            HashSet hashSet = new HashSet();
            hashSet.add(charSequenceOooo0);
            int i4 = i + 1;
            while (true) {
                if (i4 > i2) {
                    z = z2;
                    break;
                }
                CharSequence charSequenceOooo02 = a02Var.Oooo0(cdVar.OooO0oO, ((ResolveInfo) list.get(i4)).activityInfo.applicationInfo);
                if (charSequenceOooo02 == null || hashSet.contains(charSequenceOooo02)) {
                    break;
                }
                hashSet.add(charSequenceOooo02);
                i4++;
            }
            hashSet.clear();
            z2 = z;
        }
        while (i <= i2) {
            ResolveInfo resolveInfo2 = (ResolveInfo) list.get(i);
            if (z2) {
                arrayList.add(new ad(false, resolveInfo2, charSequence, resolveInfo2.activityInfo.packageName, null));
            } else {
                arrayList.add(new ad(false, resolveInfo2, charSequence, a02Var.Oooo0(cdVar.OooO0oO, resolveInfo2.activityInfo.applicationInfo), null));
            }
            i++;
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayList = this.OooO0oO;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int iconResource;
        Drawable drawableOooOOoo;
        int i2;
        Drawable drawableOooOOoo2;
        cd cdVar = this.OooO0oo;
        if (view == null) {
            view = this.OooO0o0.inflate(cdVar.OooO0oo, viewGroup, false);
        }
        ad adVar = (ad) this.OooO0oO.get(i);
        TextView textView = (TextView) view.findViewById(rv1.OooO0oO);
        TextView textView2 = (TextView) view.findViewById(rv1.OooO0oo);
        ImageView imageView = (ImageView) view.findViewById(rv1.OooO0o);
        CharSequence charSequence = adVar.OooO0OO;
        ResolveInfo resolveInfo = adVar.OooO0O0;
        textView.setText(charSequence);
        CharSequence charSequence2 = adVar.OooO0o0;
        if (charSequence2 != null) {
            textView2.setVisibility(0);
            textView2.setText(charSequence2);
        } else {
            textView2.setVisibility(8);
        }
        if (adVar.OooO0Oo == null) {
            if (adVar.OooO00o) {
                adVar.OooO0Oo = resolveInfo.loadIcon(this.OooO0o.getPackageManager());
            } else {
                a02 a02Var = cdVar.OooO0o;
                int i3 = cdVar.OooO0oO;
                a02Var.getClass();
                ComponentInfo componentInfo = resolveInfo.activityInfo;
                Drawable defaultActivityIcon = null;
                if (componentInfo == null && (componentInfo = resolveInfo.serviceInfo) == null && (componentInfo = resolveInfo.providerInfo) == null) {
                    componentInfo = null;
                }
                if (componentInfo != null) {
                    ApplicationInfo applicationInfo = componentInfo.applicationInfo;
                    String str = applicationInfo != null ? applicationInfo.sourceDir : null;
                    if (str != null) {
                        String str2 = resolveInfo.resolvePackageName;
                        if (str2 == null || (i2 = resolveInfo.icon) == 0 || (drawableOooOOoo2 = a02Var.OooOOoo(i3, i2, str2, str)) == null) {
                            int i4 = resolveInfo.icon;
                            if (i4 == 0 || (drawableOooOOoo = a02Var.OooOOoo(i3, i4, componentInfo.packageName, str)) == null) {
                                ApplicationInfo applicationInfo2 = componentInfo.applicationInfo;
                                String str3 = applicationInfo2 != null ? applicationInfo2.sourceDir : null;
                                if (str3 != null && ((iconResource = componentInfo.getIconResource()) == 0 || (defaultActivityIcon = a02Var.OooOOoo(i3, iconResource, componentInfo.packageName, str3)) == null)) {
                                    defaultActivityIcon = ((Context) a02Var.OooO0o0).getPackageManager().getDefaultActivityIcon();
                                }
                            } else {
                                defaultActivityIcon = drawableOooOOoo;
                            }
                        } else {
                            defaultActivityIcon = drawableOooOOoo2;
                        }
                    }
                }
                adVar.OooO0Oo = defaultActivityIcon;
            }
        }
        imageView.setImageDrawable(adVar.OooO0Oo);
        return view;
    }
}
