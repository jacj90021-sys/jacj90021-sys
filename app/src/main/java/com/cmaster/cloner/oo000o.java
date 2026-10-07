package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class oo000o implements Iterator {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public int OooO0o0;

    public /* synthetic */ oo000o(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o;
        switch (i) {
            case 0:
                if (this.OooO0o0 < ((o0OOO0o) obj).OooO00o()) {
                    break;
                }
                break;
            default:
                if (this.OooO0o0 < ((ViewGroup) obj).getChildCount()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    sa.OooOO0O();
                    return null;
                }
                int i2 = this.OooO0o0;
                this.OooO0o0 = i2 + 1;
                return ((o0OOO0o) obj).get(i2);
            default:
                int i3 = this.OooO0o0;
                this.OooO0o0 = i3 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i3);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.OooO0o;
                int i = this.OooO0o0 - 1;
                this.OooO0o0 = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }
}
