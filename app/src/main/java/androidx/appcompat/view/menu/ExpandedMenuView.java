package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.cmaster.cloner.a02;
import com.cmaster.cloner.kt0;
import com.cmaster.cloner.rs0;
import com.cmaster.cloner.ss0;
import com.cmaster.cloner.vs0;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements rs0, kt0, AdapterView.OnItemClickListener {
    public static final int[] OooO0o0 = {R.attr.background, R.attr.divider};
    public ss0 OooO0Oo;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        a02 a02VarOooo0OO = a02.Oooo0OO(context, attributeSet, OooO0o0, i);
        TypedArray typedArray = (TypedArray) a02VarOooo0OO.OooO0o;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(a02VarOooo0OO.OooOOo(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(a02VarOooo0OO.OooOOo(1));
        }
        a02VarOooo0OO.Oooo0oO();
    }

    @Override // com.cmaster.cloner.kt0
    public final void OooO00o(ss0 ss0Var) {
        this.OooO0Oo = ss0Var;
    }

    @Override // com.cmaster.cloner.rs0
    public final boolean OooO0O0(vs0 vs0Var) {
        return this.OooO0Oo.OooOOo0(vs0Var, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        OooO0O0((vs0) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
