package com.cmaster.cloner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qm1 implements ActionMode.Callback {
    public final ActionMode.Callback OooO00o;
    public final TextView OooO0O0;
    public Class OooO0OO;
    public Method OooO0Oo;
    public boolean OooO0o = false;
    public boolean OooO0o0;

    public qm1(ActionMode.Callback callback, TextView textView) {
        this.OooO00o = callback;
        this.OooO0O0 = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.OooO00o.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.OooO00o.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.OooO00o.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        String str;
        TextView textView = this.OooO0O0;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z = this.OooO0o;
        Class cls = Integer.TYPE;
        if (!z) {
            this.OooO0o = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.OooO0OO = cls2;
                this.OooO0Oo = cls2.getDeclaredMethod("removeItemAt", cls);
                this.OooO0o0 = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.OooO0OO = null;
                this.OooO0Oo = null;
                this.OooO0o0 = false;
            }
        }
        try {
            Method declaredMethod = (this.OooO0o0 && this.OooO0OO.isInstance(menu)) ? this.OooO0Oo : menu.getClass().getDeclaredMethod("removeItemAt", cls);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                MenuItem menuItemAdd = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.OooO00o.onPrepareActionMode(actionMode, menu);
    }
}
