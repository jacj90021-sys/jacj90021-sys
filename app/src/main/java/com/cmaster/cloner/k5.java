package com.cmaster.cloner;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k5 implements i20 {
    public String OooO;
    public final ArrayList OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public int OooOO0;
    public CharSequence OooOO0O;
    public int OooOO0o;
    public ArrayList OooOOO;
    public CharSequence OooOOO0;
    public ArrayList OooOOOO;
    public boolean OooOOOo;
    public boolean OooOOo;
    public final k20 OooOOo0;
    public int OooOOoo;

    public k5(k20 k20Var) {
        k20Var.OooOoo();
        q10 q10Var = k20Var.OooOo00;
        if (q10Var != null) {
            q10Var.OooO0o0.getClassLoader();
        }
        this.OooO00o = new ArrayList();
        this.OooO0oo = true;
        this.OooOOOo = false;
        this.OooOOoo = -1;
        this.OooOOo0 = k20Var;
    }

    @Override // com.cmaster.cloner.i20
    public final boolean OooO00o(ArrayList arrayList, ArrayList arrayList2) {
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.OooO0oO) {
            return true;
        }
        k20 k20Var = this.OooOOo0;
        if (k20Var.OooO0Oo == null) {
            k20Var.OooO0Oo = new ArrayList();
        }
        k20Var.OooO0Oo.add(this);
        return true;
    }

    public final void OooO0O0(v20 v20Var) {
        this.OooO00o.add(v20Var);
        v20Var.OooO0Oo = this.OooO0O0;
        v20Var.OooO0o0 = this.OooO0OO;
        v20Var.OooO0o = this.OooO0Oo;
        v20Var.OooO0oO = this.OooO0o0;
    }

    public final void OooO0OO(int i) {
        if (this.OooO0oO) {
            if (k20.Oooo000(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.OooO00o;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                v20 v20Var = (v20) arrayList.get(i2);
                o10 o10Var = v20Var.OooO0O0;
                if (o10Var != null) {
                    o10Var.OooOo00 += i;
                    if (k20.Oooo000(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + v20Var.OooO0O0 + " to " + v20Var.OooO0O0.OooOo00);
                    }
                }
            }
        }
    }

    public final int OooO0Oo(boolean z) {
        if (this.OooOOo) {
            qa.OooO0o("commit already called");
            return 0;
        }
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new dp0());
            OooO0o("  ", printWriter, true);
            printWriter.close();
        }
        this.OooOOo = true;
        boolean z2 = this.OooO0oO;
        k20 k20Var = this.OooOOo0;
        if (z2) {
            this.OooOOoo = k20Var.OooO.getAndIncrement();
        } else {
            this.OooOOoo = -1;
        }
        k20Var.OooOo0O(this, z);
        return this.OooOOoo;
    }

    public final void OooO0o(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.OooO);
            printWriter.print(" mIndex=");
            printWriter.print(this.OooOOoo);
            printWriter.print(" mCommitted=");
            printWriter.println(this.OooOOo);
            if (this.OooO0o != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.OooO0o));
            }
            if (this.OooO0O0 != 0 || this.OooO0OO != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.OooO0O0));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.OooO0OO));
            }
            if (this.OooO0Oo != 0 || this.OooO0o0 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.OooO0Oo));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.OooO0o0));
            }
            if (this.OooOO0 != 0 || this.OooOO0O != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.OooOO0));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.OooOO0O);
            }
            if (this.OooOO0o != 0 || this.OooOOO0 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.OooOO0o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.OooOOO0);
            }
        }
        ArrayList arrayList = this.OooO00o;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v20 v20Var = (v20) arrayList.get(i);
            switch (v20Var.OooO00o) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + v20Var.OooO00o;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(v20Var.OooO0O0);
            if (z) {
                if (v20Var.OooO0Oo != 0 || v20Var.OooO0o0 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(v20Var.OooO0Oo));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(v20Var.OooO0o0));
                }
                if (v20Var.OooO0o != 0 || v20Var.OooO0oO != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(v20Var.OooO0o));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(v20Var.OooO0oO));
                }
            }
        }
    }

    public final void OooO0o0(int i, o10 o10Var, String str, int i2) {
        String str2 = o10Var.Oooo;
        if (str2 != null) {
            t20.OooO0OO(o10Var, str2);
        }
        Class<?> cls = o10Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = o10Var.OooOoOO;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(o10Var);
                String str4 = o10Var.OooOoOO;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            o10Var.OooOoOO = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + o10Var + " with tag " + str + " to container view with no id");
            }
            int i3 = o10Var.OooOoO0;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(o10Var);
                int i4 = o10Var.OooOoO0;
                sb2.append(": was ");
                sb2.append(i4);
                sb2.append(" now ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
            o10Var.OooOoO0 = i;
            o10Var.OooOoO = i;
        }
        OooO0O0(new v20(i2, o10Var));
        o10Var.OooOo0 = this.OooOOo0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.OooOOoo >= 0) {
            sb.append(" #");
            sb.append(this.OooOOoo);
        }
        if (this.OooO != null) {
            sb.append(" ");
            sb.append(this.OooO);
        }
        sb.append("}");
        return sb.toString();
    }
}
