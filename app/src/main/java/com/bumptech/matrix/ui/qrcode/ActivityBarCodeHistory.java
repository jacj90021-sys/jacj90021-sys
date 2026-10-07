package com.bumptech.matrix.ui.qrcode;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cmaster.cloner.R;
import com.cmaster.cloner.m1;
import com.cmaster.cloner.ns;
import com.cmaster.cloner.o00OOOO0;
import com.cmaster.cloner.o00Oo00;
import com.cmaster.cloner.oo00oO;
import com.cmaster.cloner.rj0;
import com.cmaster.cloner.sj0;
import com.cmaster.cloner.uj0;
import com.cmaster.cloner.v5;
import com.cmaster.cloner.vj0;
import com.cmaster.cloner.y71;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ActivityBarCodeHistory extends m1 {
    public static final /* synthetic */ int Oooo00O = 0;
    public ArrayList Oooo000 = new ArrayList();

    @Override // com.cmaster.cloner.m1, com.cmaster.cloner.oOOO00, com.cmaster.cloner.fg, com.cmaster.cloner.eg, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_barcode_his);
        OooOooO((Toolbar) findViewById(R.id.toolbar));
        int i = 1;
        if (OooOOO0() != null) {
            OooOOO0().OooOOOO(R.string.action_qrcode_history);
            OooOOO0().OooOOO0(true);
        }
        this.Oooo000 = v5.OooO0OO().OooO00o;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.qrcode_recyclerview);
        oo00oO oo00oo = new oo00oO(this, this.Oooo000);
        recyclerView.setAdapter(oo00oo);
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        int iApplyDimension = (int) TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics());
        ns nsVar = new ns(i);
        nsVar.OooO0o0 = iApplyDimension;
        recyclerView.OooOO0O(nsVar);
        vj0 vj0Var = new vj0(new o00Oo00(this, oo00oo));
        RecyclerView recyclerView2 = vj0Var.OooOo0;
        if (recyclerView2 != recyclerView) {
            rj0 rj0Var = vj0Var.OooOoo;
            if (recyclerView2 != null) {
                recyclerView2.OooooOo(vj0Var);
                RecyclerView recyclerView3 = vj0Var.OooOo0;
                recyclerView3.OooOo00.remove(rj0Var);
                if (recyclerView3.OooOo0 == rj0Var) {
                    recyclerView3.OooOo0 = null;
                }
                ArrayList arrayList = vj0Var.OooOo0.Oooo000;
                if (arrayList != null) {
                    arrayList.remove(vj0Var);
                }
                ArrayList arrayList2 = vj0Var.OooOOoo;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    sj0 sj0Var = (sj0) arrayList2.get(0);
                    sj0Var.OooO0oO.cancel();
                    y71 y71Var = sj0Var.OooO0o0;
                    vj0Var.OooOOOo.getClass();
                    o00Oo00.OooO0O0(y71Var);
                }
                arrayList2.clear();
                vj0Var.OooOoO = null;
                VelocityTracker velocityTracker = vj0Var.OooOo0o;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    vj0Var.OooOo0o = null;
                }
                uj0 uj0Var = vj0Var.OooOoo0;
                if (uj0Var != null) {
                    uj0Var.OooO00o = false;
                    vj0Var.OooOoo0 = null;
                }
                if (vj0Var.OooOoOO != null) {
                    vj0Var.OooOoOO = null;
                }
            }
            vj0Var.OooOo0 = recyclerView;
            Resources resources = recyclerView.getResources();
            vj0Var.OooO = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            vj0Var.OooOO0 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            vj0Var.OooOo00 = ViewConfiguration.get(vj0Var.OooOo0.getContext()).getScaledTouchSlop();
            vj0Var.OooOo0.OooOO0O(vj0Var);
            vj0Var.OooOo0.OooOo00.add(rj0Var);
            RecyclerView recyclerView4 = vj0Var.OooOo0;
            if (recyclerView4.Oooo000 == null) {
                recyclerView4.Oooo000 = new ArrayList();
            }
            recyclerView4.Oooo000.add(vj0Var);
            vj0Var.OooOoo0 = new uj0(vj0Var);
            vj0Var.OooOoOO = new GestureDetector(vj0Var.OooOo0.getContext(), vj0Var.OooOoo0);
        }
        v5.OooO0OO().OooO0O0 = new o00OOOO0(this, oo00oo);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            OooOO0().OooO00o();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
