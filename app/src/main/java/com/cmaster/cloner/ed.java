package com.cmaster.cloner;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ed {
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public Object OooO0Oo;

    public void OooO00o(ih ihVar) {
        Object[] objArr = (Object[]) this.OooO0Oo;
        int i = this.OooO0O0;
        objArr[i] = ihVar;
        int i2 = this.OooO0OO & (i + 1);
        this.OooO0O0 = i2;
        int i3 = this.OooO00o;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                ra.OooOOO0("Max array capacity exceeded");
                return;
            }
            Object[] objArr2 = new Object[i5];
            o3.OooO0O0(objArr, 0, objArr2, i3, length);
            o3.OooO0O0((Object[]) this.OooO0Oo, i4, objArr2, 0, this.OooO00o);
            this.OooO0Oo = objArr2;
            this.OooO00o = 0;
            this.OooO0O0 = length;
            this.OooO0OO = i5 - 1;
        }
    }

    public void OooO0O0(int i, int i2) {
        if (i < 0) {
            ra.OooOOO("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            ra.OooOOO("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.OooO0OO;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.OooO0Oo;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.OooO0Oo = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.OooO0Oo = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.OooO0Oo;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.OooO0OO++;
    }

    public void OooO0OO() {
        View view = (View) this.OooO0Oo;
        int top = this.OooO0OO - (view.getTop() - this.OooO00o);
        WeakHashMap weakHashMap = nt1.OooO00o;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.OooO0O0));
    }

    public void OooO0Oo(RecyclerView recyclerView, boolean z) {
        this.OooO0OO = 0;
        int[] iArr = (int[]) this.OooO0Oo;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        i71 i71Var = recyclerView.OooOOo0;
        if (recyclerView.OooOOOo == null || i71Var == null || !i71Var.OooO) {
            return;
        }
        if (z) {
            if (!recyclerView.OooO0oo.OooOO0O()) {
                i71Var.OooO(recyclerView.OooOOOo.OooO00o(), this);
            }
        } else if (!recyclerView.OoooO00()) {
            i71Var.OooO0oo(this.OooO00o, this.OooO0O0, recyclerView.Oooooo0, this);
        }
        int i = this.OooO0OO;
        if (i > i71Var.OooOO0) {
            i71Var.OooOO0 = i;
            i71Var.OooOO0O = z;
            recyclerView.OooO0o.OooOOO();
        }
    }
}
