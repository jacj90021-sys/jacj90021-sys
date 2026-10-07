package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c2 implements View.OnCreateContextMenuListener, ez0, fz0 {
    public final /* synthetic */ int OooO0Oo;

    public /* synthetic */ c2(int i) {
        this.OooO0Oo = i;
    }

    @Override // com.cmaster.cloner.fz0
    public boolean OooO00o(View view, xj0 xj0Var) {
        switch (this.OooO0Oo) {
            case 6:
                wu1 wu1Var = (wu1) (wu1.class.isInstance(xj0Var.OooOo0O) ? xj0Var.OooOo0O : null);
                if (wu1Var == null) {
                    return false;
                }
                Context context = view.getContext();
                ho1 ho1Var = new ho1(context, view);
                ct0 ct0Var = (ct0) ho1Var.OooO0oO;
                ss0 ss0Var = (ss0) ho1Var.OooO0o0;
                ct0Var.OooO0oO = true;
                at0 at0Var = ct0Var.OooO;
                if (at0Var != null) {
                    at0Var.OooOOOO(true);
                }
                new fk1(context).inflate(R.menu.menu_card_item, ss0Var);
                ss0Var.findItem(R.id.action_create_shortcut).setVisible(true);
                ss0Var.findItem(R.id.action_icon_fake).setVisible(true);
                ss0Var.findItem(R.id.action_force_stop).setVisible(true);
                ss0Var.findItem(R.id.action_clean).setVisible(true);
                ss0Var.findItem(R.id.action_uninstall).setVisible(true);
                ss0Var.findItem(R.id.action_app_hide_show).setTitle(wu1Var.OooOOO0.OooO0O0() == 0 ? R.string.action_app_hide : R.string.action_app_show).setVisible(true);
                ss0Var.findItem(R.id.action_clone_next).setVisible(true);
                ss0Var.findItem(R.id.action_note).setVisible(true);
                if (wu1Var.OooOOOO || wu1Var.OooOOOo) {
                    ss0Var.findItem(R.id.action_auto_fix).setVisible(true);
                } else {
                    ss0Var.findItem(R.id.action_clone_mode).setVisible(true);
                }
                ho1Var.OooO0oo = new a02(this, view, xj0Var, wu1Var, 23);
                if (!ct0Var.OooO0O0()) {
                    if (ct0Var.OooO0o0 == null) {
                        qa.OooO0o("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    ct0Var.OooO0Oo(0, 0, false, false);
                }
                return true;
            default:
                cc ccVar = xj0Var.OooOo0O;
                if (ccVar != null) {
                    return ccVar.OooO00o(view, xj0Var);
                }
                return false;
        }
    }

    public final void OooO0O0(xj0 xj0Var) {
        switch (this.OooO0Oo) {
            case 0:
                o2 o2Var = (o2) xj0Var.OooOo0O;
                v1 v1Var = (v1) xj0Var.OooOo0o;
                v1Var.OooO0oO.setText(o2Var.OooO0Oo());
                ImageView imageView = v1Var.OooO0o;
                PackageInfo packageInfo = o2Var.OooO0o0;
                o53.OooO00o(imageView, packageInfo.applicationInfo);
                v1Var.OooO0o0.setText(packageInfo.packageName);
                return;
            case 1:
                lb lbVar = (lb) xj0Var.OooOo0o;
                RecyclerView recyclerView = lbVar.OooO0o;
                AppCompatTextView appCompatTextView = lbVar.OooO0o0;
                qe qeVar = (qe) recyclerView.getAdapter();
                k2 k2Var = (k2) xj0Var.OooOo0O;
                if (qeVar == null) {
                    qeVar = new qe(k2Var.OooO0o, new o0O000O(9));
                    qeVar.OooO0o = true;
                    qeVar.OooOO0o(wu1.class, new c2(6));
                    recyclerView.setAdapter(qeVar);
                }
                appCompatTextView.setVisibility(0);
                appCompatTextView.setText(String.valueOf(k2Var.OooO0o0 + 1));
                re reVar = k2Var.OooO0o;
                o81 o81Var = qeVar.OooO0oo;
                re reVar2 = qeVar.OooO;
                if (reVar != reVar2) {
                    if (reVar2 != null) {
                        o81Var.getClass();
                        reVar.getClass();
                        if (!h1.OooO0O0()) {
                            qa.OooO0o("must be main thread");
                            return;
                        } else {
                            reVar.OooO0Oo.OooO00o.remove(o81Var);
                            o81Var.OooO0O0.remove(reVar);
                        }
                    }
                    qeVar.OooO = reVar;
                    o81Var.getClass();
                    reVar.getClass();
                    if (!h1.OooO0O0()) {
                        qa.OooO0o("must be main thread");
                        return;
                    }
                    reVar.OooO0Oo.OooO00o.add(o81Var);
                    o81Var.OooO0O0.add(reVar);
                    qeVar.OooO00o.OooO0O0();
                    return;
                }
                return;
            case 2:
                ((y50) xj0Var.OooOo0O).OooO0oo((ViewGroup) xj0Var.OooO00o);
                return;
            case 3:
                ((d2) xj0Var.OooOo0o).OooO0o0.setText(((sv) xj0Var.OooOo0O).OooO0o0.intValue());
                return;
            case 4:
                ((TextView) xj0Var.OooO00o).setText(((rl0) xj0Var.OooOo0O).OooO0o0);
                return;
            case 5:
                ((TextView) xj0Var.OooO00o).setText(String.valueOf(xj0Var.OooOo0O));
                return;
            default:
                u1 u1Var = (u1) ((rt1) xj0Var.OooOo0o);
                wu1 wu1Var = (wu1) xj0Var.OooOo0O;
                u1Var.OooOO0O(4, wu1Var);
                u1Var.OooOo0 = wu1Var;
                synchronized (u1Var) {
                    u1Var.OooOo0o |= 16;
                }
                u1Var.OooO0OO(1);
                u1Var.OooO();
                Context context = xj0Var.OooO00o.getContext();
                zx2.OooO0OO(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                x91 x91VarOooO0OO = com.bumptech.glide.OooO00o.OooO00o(context).OooO0oo.OooO0OO(context);
                Object objOooO0Oo = wu1Var.OooO0Oo();
                x91VarOooO0OO.getClass();
                ((p91) ((p91) new p91(x91VarOooO0OO.OooO0Oo, x91VarOooO0OO, Drawable.class, x91VarOooO0OO.OooO0o0).OooOoO(objOooO0Oo).OooOO0(R.drawable.ic_default)).OooO0Oo(vr.OooO00o)).OooOo(u1Var.OooOOoo);
                rt1 rt1Var = (rt1) xj0Var.OooOo0o;
                if (rt1Var.OooO) {
                    rt1Var.OooO();
                    return;
                } else {
                    if (rt1Var.OooO0o0()) {
                        rt1Var.OooO = true;
                        rt1Var.OooO0Oo();
                        rt1Var.OooO = false;
                        return;
                    }
                    return;
                }
        }
    }

    public final xj0 OooO0OO(qe qeVar, ViewGroup viewGroup) {
        switch (this.OooO0Oo) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_item, viewGroup, false);
                int i = R.id.des;
                TextView textView = (TextView) l53.OooO00o(viewInflate, R.id.des);
                if (textView != null) {
                    i = R.id.icon;
                    ImageView imageView = (ImageView) l53.OooO00o(viewInflate, R.id.icon);
                    if (imageView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) l53.OooO00o(viewInflate, R.id.title);
                        if (textView2 != null) {
                            return new xj0(new v1((RelativeLayout) viewInflate, textView, imageView, textView2), qeVar);
                        }
                    }
                }
                qa.OooOOO0(sn2.OooO00o("bMk/Std+5YFTxT1M12LnxQHWJVzJMPXIVchscPoqog==\n", "IaBMOb4QgqE=\n").concat(viewInflate.getResources().getResourceName(i)));
                return null;
            case 1:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_app_space, viewGroup, false);
                int i2 = R.id.anchor;
                AppCompatTextView appCompatTextView = (AppCompatTextView) l53.OooO00o(viewInflate2, R.id.anchor);
                if (appCompatTextView != null) {
                    CardView cardView = (CardView) viewInflate2;
                    int i3 = R.id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) l53.OooO00o(viewInflate2, R.id.recyclerView);
                    if (recyclerView != null) {
                        i3 = R.id.settings;
                        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) l53.OooO00o(viewInflate2, R.id.settings);
                        if (appCompatImageButton != null) {
                            lb lbVar = new lb(cardView, appCompatTextView, recyclerView, appCompatImageButton);
                            viewGroup.getContext();
                            recyclerView.setLayoutManager(new GridLayoutManager());
                            xj0 xj0Var = new xj0(lbVar, qeVar);
                            appCompatImageButton.setOnClickListener(new l2(this, xj0Var));
                            return xj0Var;
                        }
                    }
                    i2 = i3;
                }
                qa.OooOOO0(sn2.OooO00o("n5FGXbSlQ2SgnURbtLlBIPKOXEuq61MtppAVZ5nxBA==\n", "0vg1Lt3LJEQ=\n").concat(viewInflate2.getResources().getResourceName(i2)));
                return null;
            case 2:
                View viewInflate3 = qeVar.OooO0oO.inflate(R.layout.app_banner_view, viewGroup, false);
                if (viewInflate3 == null) {
                    qa.OooOOO0(sn2.OooO00o("ZcejZlBvL/U=\n", "F6jMEgYGSoI=\n"));
                    return null;
                }
                CardView cardView2 = (CardView) viewInflate3;
                o00OO000 o00oo000 = new o00OO000(cardView2, 2);
                xj0 xj0Var2 = new xj0(cardView2);
                xj0Var2.OooOo0o = o00oo000;
                return xj0Var2;
            case 3:
                View viewInflate4 = qeVar.OooO0oO.inflate(R.layout.app_retry, viewGroup, false);
                Button button = (Button) l53.OooO00o(viewInflate4, R.id.retry);
                if (button != null) {
                    xj0 xj0Var3 = new xj0(new d2((FrameLayout) viewInflate4, button), qeVar);
                    button.setOnClickListener(new l2(xj0Var3));
                    return xj0Var3;
                }
                qa.OooOOO0(sn2.OooO00o("G01NmI5fnrskQU+ejkOc/3ZSV46QEY7yIkweoqML2Q==\n", "ViQ+6+cx+Zs=\n").concat(viewInflate4.getResources().getResourceName(R.id.retry)));
                return null;
            case 4:
                TextView textView3 = new TextView(viewGroup.getContext());
                Context context = viewGroup.getContext();
                int i4 = xj0.OooOo;
                int i5 = (int) ((context.getResources().getDisplayMetrics().density * 18.0f) + 0.5d);
                textView3.setPadding(i5, 0, i5, 0);
                xj0 xj0Var4 = new xj0(textView3);
                xj0Var4.OooOo0 = qeVar;
                return xj0Var4;
            case 5:
                return new xj0(new TextView(viewGroup.getContext()));
            default:
                rt1 rt1VarOooO00o = en.OooO00o(LayoutInflater.from(viewGroup.getContext()), R.layout.app_installed_item, viewGroup);
                xj0 xj0Var5 = new xj0(rt1VarOooO00o.OooO0oo);
                xj0Var5.OooOo0o = rt1VarOooO00o;
                return xj0Var5;
        }
    }

    @Override // com.cmaster.cloner.ez0
    public void OooOO0(View view, xj0 xj0Var) {
        switch (this.OooO0Oo) {
            case 6:
                wu1 wu1Var = (wu1) (wu1.class.isInstance(xj0Var.OooOo0O) ? xj0Var.OooOo0O : null);
                if (wu1Var != null) {
                    int i = wu1Var.OooOOO;
                    if (!wu1Var.OooOOOo) {
                        if (wu1Var.OooOO0o != null) {
                            hv1.OooO0OO.OooO00o(view.getContext(), wu1Var.OooOO0o.packageName, i);
                            break;
                        }
                    } else {
                        g80 g80Var = (g80) j1.OooO0O0(view);
                        if (g80Var != null) {
                            g80Var.OoooOoo(i, wu1Var.OooO0o0);
                            break;
                        }
                    }
                }
                break;
            default:
                cc ccVar = xj0Var.OooOo0O;
                if (ccVar != null) {
                    ccVar.OooOO0(view, xj0Var);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
    }
}
