package com.cmaster.cloner;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class y71 {
    public static final List OooOo00 = Collections.EMPTY_LIST;
    public final View OooO00o;
    public WeakReference OooO0O0;
    public int OooOO0;
    public RecyclerView OooOOo;
    public a71 OooOOoo;
    public int OooO0OO = -1;
    public int OooO0Oo = -1;
    public long OooO0o0 = -1;
    public int OooO0o = -1;
    public int OooO0oO = -1;
    public y71 OooO0oo = null;
    public y71 OooO = null;
    public ArrayList OooOO0O = null;
    public List OooOO0o = null;
    public int OooOOO0 = 0;
    public p71 OooOOO = null;
    public boolean OooOOOO = false;
    public int OooOOOo = 0;
    public int OooOOo0 = -1;

    public y71(View view) {
        if (view != null) {
            this.OooO00o = view;
        } else {
            ra.OooOOO("itemView may not be null");
            throw null;
        }
    }

    public final boolean OooO() {
        if ((this.OooOO0 & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = nt1.OooO00o;
        return !this.OooO00o.hasTransientState();
    }

    public final void OooO00o(int i) {
        this.OooOO0 = i | this.OooOO0;
    }

    public final int OooO0O0() {
        RecyclerView recyclerView = this.OooOOo;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.Oooo0o0(this);
    }

    public final int OooO0OO() {
        RecyclerView recyclerView;
        a71 adapter;
        int iOooo0o0;
        if (this.OooOOoo == null || (recyclerView = this.OooOOo) == null || (adapter = recyclerView.getAdapter()) == null || (iOooo0o0 = this.OooOOo.Oooo0o0(this)) == -1 || this.OooOOoo != adapter) {
            return -1;
        }
        return iOooo0o0;
    }

    public final int OooO0Oo() {
        int i = this.OooO0oO;
        return i == -1 ? this.OooO0OO : i;
    }

    public final boolean OooO0o() {
        View view = this.OooO00o;
        return (view.getParent() == null || view.getParent() == this.OooOOo) ? false : true;
    }

    public final List OooO0o0() {
        ArrayList arrayList;
        return ((this.OooOO0 & 1024) != 0 || (arrayList = this.OooOO0O) == null || arrayList.size() == 0) ? OooOo00 : this.OooOO0o;
    }

    public final boolean OooO0oO() {
        return (this.OooOO0 & 1) != 0;
    }

    public final boolean OooO0oo() {
        return (this.OooOO0 & 4) != 0;
    }

    public final boolean OooOO0() {
        return (this.OooOO0 & 8) != 0;
    }

    public final boolean OooOO0O() {
        return this.OooOOO != null;
    }

    public final boolean OooOO0o() {
        return (this.OooOO0 & 256) != 0;
    }

    public final void OooOOO(int i, boolean z) {
        if (this.OooO0Oo == -1) {
            this.OooO0Oo = this.OooO0OO;
        }
        if (this.OooO0oO == -1) {
            this.OooO0oO = this.OooO0OO;
        }
        if (z) {
            this.OooO0oO += i;
        }
        this.OooO0OO += i;
        View view = this.OooO00o;
        if (view.getLayoutParams() != null) {
            ((j71) view.getLayoutParams()).OooO0OO = true;
        }
    }

    public final boolean OooOOO0() {
        return (this.OooOO0 & 2) != 0;
    }

    public final void OooOOOO() {
        if (RecyclerView.o0O0O00 && OooOO0o()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.OooOO0 = 0;
        this.OooO0OO = -1;
        this.OooO0Oo = -1;
        this.OooO0o0 = -1L;
        this.OooO0oO = -1;
        this.OooOOO0 = 0;
        this.OooO0oo = null;
        this.OooO = null;
        ArrayList arrayList = this.OooOO0O;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.OooOO0 &= -1025;
        this.OooOOOo = 0;
        this.OooOOo0 = -1;
        RecyclerView.OooOOO0(this);
    }

    public final void OooOOOo(boolean z) {
        int i = this.OooOOO0;
        int i2 = z ? i - 1 : i + 1;
        this.OooOOO0 = i2;
        if (i2 < 0) {
            this.OooOOO0 = 0;
            if (RecyclerView.o0O0O00) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.OooOO0 |= 16;
        } else if (z && i2 == 0) {
            this.OooOO0 &= -17;
        }
        if (RecyclerView.o000OOo) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    public final boolean OooOOo() {
        return (this.OooOO0 & 32) != 0;
    }

    public final boolean OooOOo0() {
        return (this.OooOO0 & 128) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.OooO0OO + " id=" + this.OooO0o0 + ", oldPos=" + this.OooO0Oo + ", pLpos:" + this.OooO0oO);
        if (OooOO0O()) {
            sb.append(" scrap ");
            sb.append(this.OooOOOO ? "[changeScrap]" : "[attachedScrap]");
        }
        if (OooO0oo()) {
            sb.append(" invalid");
        }
        if (!OooO0oO()) {
            sb.append(" unbound");
        }
        if ((this.OooOO0 & 2) != 0) {
            sb.append(" update");
        }
        if (OooOO0()) {
            sb.append(" removed");
        }
        if (OooOOo0()) {
            sb.append(" ignored");
        }
        if (OooOO0o()) {
            sb.append(" tmpDetached");
        }
        if (!OooO()) {
            sb.append(" not recyclable(" + this.OooOOO0 + ")");
        }
        if ((this.OooOO0 & 512) != 0 || OooO0oo()) {
            sb.append(" undefined adapter position");
        }
        if (this.OooO00o.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
