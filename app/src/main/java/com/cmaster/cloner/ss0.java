package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ss0 implements Menu {
    public static final int[] OooOoo0 = {1, 4, 5, 3, 2, 0};
    public final ArrayList OooO;
    public final Context OooO0Oo;
    public boolean OooO0o;
    public final Resources OooO0o0;
    public final boolean OooO0oO;
    public qs0 OooO0oo;
    public final ArrayList OooOO0;
    public boolean OooOO0O;
    public final ArrayList OooOO0o;
    public boolean OooOOO;
    public final ArrayList OooOOO0;
    public CharSequence OooOOOo;
    public View OooOOo;
    public Drawable OooOOo0;
    public vs0 OooOoO0;
    public boolean OooOoOO;
    public int OooOOOO = 0;
    public boolean OooOOoo = false;
    public boolean OooOo00 = false;
    public boolean OooOo0 = false;
    public boolean OooOo0O = false;
    public final ArrayList OooOo0o = new ArrayList();
    public final CopyOnWriteArrayList OooOo = new CopyOnWriteArrayList();
    public boolean OooOoO = false;

    public ss0(Context context) {
        boolean zOooOOOo;
        boolean z = false;
        this.OooO0Oo = context;
        Resources resources = context.getResources();
        this.OooO0o0 = resources;
        this.OooO = new ArrayList();
        this.OooOO0 = new ArrayList();
        this.OooOO0O = true;
        this.OooOO0o = new ArrayList();
        this.OooOOO0 = new ArrayList();
        this.OooOOO = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = ot1.OooO00o;
            if (Build.VERSION.SDK_INT >= 28) {
                zOooOOOo = ep.OooOOOo(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zOooOOOo = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zOooOOOo) {
                z = true;
            }
        }
        this.OooO0oO = z;
    }

    public final void OooO() {
        ArrayList arrayListOooOO0o = OooOO0o();
        if (this.OooOOO) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zOooO0o0 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                it0 it0Var = (it0) weakReference.get();
                if (it0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zOooO0o0 |= it0Var.OooO0o0();
                }
            }
            ArrayList arrayList = this.OooOO0o;
            ArrayList arrayList2 = this.OooOOO0;
            if (zOooO0o0) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListOooOO0o.size();
                for (int i = 0; i < size; i++) {
                    vs0 vs0Var = (vs0) arrayListOooOO0o.get(i);
                    if ((vs0Var.OooOoOO & 32) == 32) {
                        arrayList.add(vs0Var);
                    } else {
                        arrayList2.add(vs0Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(OooOO0o());
            }
            this.OooOOO = false;
        }
    }

    public final vs0 OooO00o(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            ra.OooOOO("order does not contain a valid category.");
            return null;
        }
        int i6 = (OooOoo0[i5] << 16) | (65535 & i3);
        vs0 vs0Var = new vs0(this, i, i2, i3, i6, charSequence, this.OooOOOO);
        ArrayList arrayList = this.OooO;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((vs0) arrayList.get(size)).OooO0oO <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, vs0Var);
        OooOOOo(true);
        return vs0Var;
    }

    public final void OooO0O0(it0 it0Var, Context context) {
        this.OooOo.add(new WeakReference(it0Var));
        it0Var.OooO0O0(context, this);
        this.OooOOO = true;
    }

    public final void OooO0OO(boolean z) {
        if (this.OooOo0O) {
            return;
        }
        this.OooOo0O = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            it0 it0Var = (it0) weakReference.get();
            if (it0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                it0Var.OooO0OO(this, z);
            }
        }
        this.OooOo0O = false;
    }

    public boolean OooO0Oo(vs0 vs0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo;
        boolean zOooO0oO = false;
        if (!copyOnWriteArrayList.isEmpty() && this.OooOoO0 == vs0Var) {
            OooOo0o();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                it0 it0Var = (it0) weakReference.get();
                if (it0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zOooO0oO = it0Var.OooO0oO(vs0Var);
                    if (zOooO0oO) {
                        break;
                    }
                }
            }
            OooOo0O();
            if (zOooO0oO) {
                this.OooOoO0 = null;
            }
        }
        return zOooO0oO;
    }

    public boolean OooO0o(vs0 vs0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo;
        boolean zOooO0o = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        OooOo0o();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            it0 it0Var = (it0) weakReference.get();
            if (it0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zOooO0o = it0Var.OooO0o(vs0Var);
                if (zOooO0o) {
                    break;
                }
            }
        }
        OooOo0O();
        if (zOooO0o) {
            this.OooOoO0 = vs0Var;
        }
        return zOooO0o;
    }

    public boolean OooO0o0(ss0 ss0Var, MenuItem menuItem) {
        qs0 qs0Var = this.OooO0oo;
        return qs0Var != null && qs0Var.OooO0Oo(ss0Var, menuItem);
    }

    public final vs0 OooO0oO(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.OooOo0o;
        arrayList.clear();
        OooO0oo(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (vs0) arrayList.get(0);
        }
        boolean zOooOOO = OooOOO();
        for (int i2 = 0; i2 < size; i2++) {
            vs0 vs0Var = (vs0) arrayList.get(i2);
            char c = zOooOOO ? vs0Var.OooOOO0 : vs0Var.OooOO0O;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zOooOOO && c == '\b' && i == 67))) {
                return vs0Var;
            }
        }
        return null;
    }

    public final void OooO0oo(List list, int i, KeyEvent keyEvent) {
        boolean zOooOOO = OooOOO();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.OooO;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                vs0 vs0Var = (vs0) arrayList.get(i2);
                if (vs0Var.hasSubMenu()) {
                    vs0Var.OooOOo.OooO0oo(list, i, keyEvent);
                }
                char c = zOooOOO ? vs0Var.OooOOO0 : vs0Var.OooOO0O;
                if ((modifiers & 69647) == ((zOooOOO ? vs0Var.OooOOO : vs0Var.OooOO0o) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zOooOOO && c == '\b' && i == 67)) && vs0Var.isEnabled()) {
                        list.add(vs0Var);
                    }
                }
            }
        }
    }

    public String OooOO0() {
        return "android:menu:actionviewstates";
    }

    public ss0 OooOO0O() {
        return this;
    }

    public final ArrayList OooOO0o() {
        boolean z = this.OooOO0O;
        ArrayList arrayList = this.OooOO0;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.OooO;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            vs0 vs0Var = (vs0) arrayList2.get(i);
            if (vs0Var.isVisible()) {
                arrayList.add(vs0Var);
            }
        }
        this.OooOO0O = false;
        this.OooOOO = true;
        return arrayList;
    }

    public boolean OooOOO() {
        return this.OooO0o;
    }

    public boolean OooOOO0() {
        return this.OooOoO;
    }

    public boolean OooOOOO() {
        return this.OooO0oO;
    }

    public final void OooOOOo(boolean z) {
        if (this.OooOOoo) {
            this.OooOo00 = true;
            if (z) {
                this.OooOo0 = true;
                return;
            }
            return;
        }
        if (z) {
            this.OooOO0O = true;
            this.OooOOO = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        OooOo0o();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            it0 it0Var = (it0) weakReference.get();
            if (it0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                it0Var.OooOO0();
            }
        }
        OooOo0O();
    }

    public final void OooOOo(it0 it0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            it0 it0Var2 = (it0) weakReference.get();
            if (it0Var2 == null || it0Var2 == it0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOo0(android.view.MenuItem r7, com.cmaster.cloner.it0 r8, int r9) {
        /*
            r6 = this;
            com.cmaster.cloner.vs0 r7 = (com.cmaster.cloner.vs0) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            com.cmaster.cloner.ss0 r1 = r7.OooOOo0
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.OooOOoo
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L43
        L1c:
            boolean r2 = r1.OooO0o0(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.OooOO0
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.OooO0Oo     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            com.cmaster.cloner.ws0 r1 = r7.OooOooO
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.OooO0O0
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            com.cmaster.cloner.ws0 r2 = r7.OooOooO
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.OooO0O0
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r3
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.OooO0o0()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.OooO0OO(r3)
            goto Ld1
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.OooO0OO(r3)
            goto Ld1
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.OooO0OO(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            com.cmaster.cloner.vj1 r9 = new com.cmaster.cloner.vj1
            android.content.Context r5 = r6.OooO0Oo
            r9.<init>(r5, r6, r7)
            r7.OooOOo = r9
            java.lang.CharSequence r5 = r7.OooO0oo
            r9.setHeaderTitle(r5)
        L90:
            com.cmaster.cloner.vj1 r7 = r7.OooOOo
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.OooO0O0
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.OooOo
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.OooO0oo(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            com.cmaster.cloner.it0 r4 = (com.cmaster.cloner.it0) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.OooO0oo(r7)
            goto Lac
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.OooO0OO(r3)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ss0.OooOOo0(android.view.MenuItem, com.cmaster.cloner.it0, int):boolean");
    }

    public final void OooOOoo(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(OooOO0());
        int size = this.OooO.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((vj1) item.getSubMenu()).OooOOoo(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void OooOo0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.OooOOo = view;
            this.OooOOOo = null;
            this.OooOOo0 = null;
        } else {
            if (i > 0) {
                this.OooOOOo = this.OooO0o0.getText(i);
            } else if (charSequence != null) {
                this.OooOOOo = charSequence;
            }
            if (i2 > 0) {
                this.OooOOo0 = this.OooO0Oo.getDrawable(i2);
            } else if (drawable != null) {
                this.OooOOo0 = drawable;
            }
            this.OooOOo = null;
        }
        OooOOOo(false);
    }

    public final void OooOo00(Bundle bundle) {
        int size = this.OooO.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState((android.util.SparseArray<android.os.Parcelable>) sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((vj1) item.getSubMenu()).OooOo00(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(OooOO0(), sparseArray);
        }
    }

    public final void OooOo0O() {
        this.OooOOoo = false;
        if (this.OooOo00) {
            this.OooOo00 = false;
            OooOOOo(this.OooOo0);
        }
    }

    public final void OooOo0o() {
        if (this.OooOOoo) {
            return;
        }
        this.OooOOoo = true;
        this.OooOo00 = false;
        this.OooOo0 = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return OooO00o(0, 0, 0, this.OooO0o0.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.OooO0Oo.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            vs0 vs0VarOooO00o = OooO00o(i, i2, i3, resolveInfo.loadLabel(packageManager));
            vs0VarOooO00o.setIcon(resolveInfo.loadIcon(packageManager));
            vs0VarOooO00o.OooOO0 = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = vs0VarOooO00o;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        vs0 vs0VarOooO00o = OooO00o(i, i2, i3, charSequence);
        vj1 vj1Var = new vj1(this.OooO0Oo, this, vs0VarOooO00o);
        vs0VarOooO00o.OooOOo = vj1Var;
        vj1Var.setHeaderTitle(vs0VarOooO00o.OooO0oo);
        return vj1Var;
    }

    @Override // android.view.Menu
    public final void clear() {
        vs0 vs0Var = this.OooOoO0;
        if (vs0Var != null) {
            OooO0Oo(vs0Var);
        }
        this.OooO.clear();
        OooOOOo(true);
    }

    public final void clearHeader() {
        this.OooOOo0 = null;
        this.OooOOOo = null;
        this.OooOOo = null;
        OooOOOo(false);
    }

    @Override // android.view.Menu
    public final void close() {
        OooO0OO(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vs0 vs0Var = (vs0) arrayList.get(i2);
            if (vs0Var.OooO0Oo == i) {
                return vs0Var;
            }
            if (vs0Var.hasSubMenu() && (menuItemFindItem = vs0Var.OooOOo.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.OooO.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.OooOoOO) {
            return true;
        }
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((vs0) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return OooO0oO(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return OooOOo0(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        vs0 vs0VarOooO0oO = OooO0oO(i, keyEvent);
        boolean zOooOOo0 = vs0VarOooO0oO != null ? OooOOo0(vs0VarOooO0oO, null, i2) : false;
        if ((i2 & 2) != 0) {
            OooO0OO(true);
        }
        return zOooOOo0;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((vs0) arrayList.get(i3)).OooO0o0 == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((vs0) arrayList.get(i3)).OooO0o0 != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            OooOOOo(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((vs0) arrayList.get(i2)).OooO0Oo == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        OooOOOo(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vs0 vs0Var = (vs0) arrayList.get(i2);
            if (vs0Var.OooO0o0 == i) {
                vs0Var.OooOoOO = (vs0Var.OooOoOO & (-5)) | (z2 ? 4 : 0);
                vs0Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.OooOoO = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vs0 vs0Var = (vs0) arrayList.get(i2);
            if (vs0Var.OooO0o0 == i) {
                vs0Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            vs0 vs0Var = (vs0) arrayList.get(i2);
            if (vs0Var.OooO0o0 == i) {
                int i3 = vs0Var.OooOoOO;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                vs0Var.OooOoOO = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            OooOOOo(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.OooO0o = z;
        OooOOOo(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.OooO.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return OooO00o(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO00o(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return OooO00o(i, i2, i3, this.OooO0o0.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.OooO0o0.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.OooO0o0.getString(i4));
    }
}
