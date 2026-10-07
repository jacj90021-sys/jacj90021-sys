package com.cmaster.cloner;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b71 extends Observable {
    public final boolean OooO00o() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void OooO0O0() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            bz bzVar = (bz) ((Observable) this).mObservers.get(size);
            switch (bzVar.OooO00o) {
                case 0:
                    ((cz) bzVar.OooO0O0).o0000Ooo.clear();
                    break;
                default:
                    RecyclerView recyclerView = bzVar.OooO0O0;
                    recyclerView.OooOO0o(null);
                    recyclerView.Oooooo0.OooO0o = true;
                    recyclerView.OoooOoo(true);
                    if (recyclerView.OooO0oo.OooOO0O()) {
                        break;
                    } else {
                        recyclerView.requestLayout();
                        break;
                    }
            }
        }
    }

    public final void OooO0OO(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            bz bzVar = (bz) ((Observable) this).mObservers.get(size);
            switch (bzVar.OooO00o) {
                case 0:
                    ((cz) bzVar.OooO0O0).o0000Ooo.clear();
                    break;
                default:
                    RecyclerView recyclerView = bzVar.OooO0O0;
                    recyclerView.OooOO0o(null);
                    oO0OOo0o oo0ooo0o = recyclerView.OooO0oo;
                    ArrayList arrayList = (ArrayList) oo0ooo0o.OooO0OO;
                    if (i == i2) {
                        break;
                    } else {
                        arrayList.add(oo0ooo0o.OooOOO0(8, i, i2, null));
                        oo0ooo0o.OooO00o |= 8;
                        if (arrayList.size() == 1) {
                            bzVar.OooO00o();
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
    }

    public final void OooO0Oo(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            bz bzVar = (bz) ((Observable) this).mObservers.get(size);
            switch (bzVar.OooO00o) {
                case 0:
                    ((cz) bzVar.OooO0O0).o0000Ooo.clear();
                    break;
                default:
                    RecyclerView recyclerView = bzVar.OooO0O0;
                    recyclerView.OooOO0o(null);
                    oO0OOo0o oo0ooo0o = recyclerView.OooO0oo;
                    ArrayList arrayList = (ArrayList) oo0ooo0o.OooO0OO;
                    if (i2 < 1) {
                        break;
                    } else {
                        arrayList.add(oo0ooo0o.OooOOO0(4, i, i2, obj));
                        oo0ooo0o.OooO00o = 4 | oo0ooo0o.OooO00o;
                        if (arrayList.size() == 1) {
                            bzVar.OooO00o();
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
    }

    public final void OooO0o(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            bz bzVar = (bz) ((Observable) this).mObservers.get(size);
            switch (bzVar.OooO00o) {
                case 0:
                    ((cz) bzVar.OooO0O0).o0000Ooo.clear();
                    break;
                default:
                    RecyclerView recyclerView = bzVar.OooO0O0;
                    recyclerView.OooOO0o(null);
                    oO0OOo0o oo0ooo0o = recyclerView.OooO0oo;
                    ArrayList arrayList = (ArrayList) oo0ooo0o.OooO0OO;
                    if (i2 < 1) {
                        break;
                    } else {
                        arrayList.add(oo0ooo0o.OooOOO0(2, i, i2, null));
                        oo0ooo0o.OooO00o |= 2;
                        if (arrayList.size() == 1) {
                            bzVar.OooO00o();
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
    }

    public final void OooO0o0(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            bz bzVar = (bz) ((Observable) this).mObservers.get(size);
            switch (bzVar.OooO00o) {
                case 0:
                    ((cz) bzVar.OooO0O0).o0000Ooo.clear();
                    break;
                default:
                    RecyclerView recyclerView = bzVar.OooO0O0;
                    recyclerView.OooOO0o(null);
                    oO0OOo0o oo0ooo0o = recyclerView.OooO0oo;
                    ArrayList arrayList = (ArrayList) oo0ooo0o.OooO0OO;
                    if (i2 < 1) {
                        break;
                    } else {
                        arrayList.add(oo0ooo0o.OooOOO0(1, i, i2, null));
                        oo0ooo0o.OooO00o |= 1;
                        if (arrayList.size() == 1) {
                            bzVar.OooO00o();
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
    }
}
