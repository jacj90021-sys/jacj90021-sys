package com.cmaster.cloner;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.matrix.ui.qrcode.ActivityBarCodePreview;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g80 extends o1 {
    public qe Ooooo00;
    public o0O00000 Ooooo0o;
    public h80 OooooO0;
    public boolean Oooooo0;
    public ProgressDialog Ooooooo;
    public final yu1 OooooOO = yu1.OooOOO0;
    public boolean OooooOo = true;
    public final ye1 Oooooo = new ye1(1);
    public final d80 OoooooO = new d80();

    @Override // com.cmaster.cloner.o10
    public final void OooOoO(Menu menu, MenuInflater menuInflater) {
        sn2.OooO00o("Z3z2uw==\n", "ChmYzp//AS0=\n");
        menu.getClass();
        sn2.OooO00o("nDRVfnLTM5w=\n", "9VozEhOnVu4=\n");
        menuInflater.getClass();
        menuInflater.inflate(R.menu.menu_main, menu);
    }

    @Override // com.cmaster.cloner.o10
    public final void OooOoO0(Bundle bundle) {
        super.OooOoO0(bundle);
        Oooo().bindService(new Intent(Oooo(), (Class<?>) AliveService.class), this.OoooooO, 1);
    }

    @Override // com.cmaster.cloner.o10
    public final View OooOoOO(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        sn2.OooO00o("83ejVwoT8vk=\n", "mhnFO2tnl4s=\n");
        layoutInflater.getClass();
        du1 du1VarOooO0OO = OooO0OO();
        bu1 bu1VarOooO00o = OooO00o();
        fv0 fv0VarOooO0O0 = OooO0O0();
        bu1VarOooO00o.getClass();
        ho1 ho1Var = new ho1(du1VarOooO0OO, bu1VarOooO00o, fv0VarOooO0O0);
        rd rdVarOooO00o = r81.OooO00o(h80.class);
        String strOooO0O0 = rdVarOooO00o.OooO0O0();
        if (strOooO0O0 == null) {
            ra.OooOOO("Local and anonymous classes can not be ViewModels");
            return null;
        }
        h80 h80Var = (h80) ho1Var.OooOoo0(rdVarOooO00o, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strOooO0O0));
        sn2.OooO00o("uDCegmDugw==\n", "hEP79k3RvZw=\n");
        this.OooooO0 = h80Var;
        int i = 0;
        View viewInflate = OooOO0O().inflate(R.layout.activity_home, viewGroup, false);
        int i2 = R.id.bannerHolder;
        CardView cardView = (CardView) l53.OooO00o(viewInflate, R.id.bannerHolder);
        if (cardView != null) {
            i2 = R.id.et_search_simple;
            EditText editText = (EditText) l53.OooO00o(viewInflate, R.id.et_search_simple);
            if (editText != null) {
                i2 = R.id.fab;
                FloatingActionButton floatingActionButton = (FloatingActionButton) l53.OooO00o(viewInflate, R.id.fab);
                if (floatingActionButton != null) {
                    i2 = R.id.fl_search_container;
                    FrameLayout frameLayout = (FrameLayout) l53.OooO00o(viewInflate, R.id.fl_search_container);
                    if (frameLayout != null) {
                        i2 = R.id.iv_clear_search;
                        ImageView imageView = (ImageView) l53.OooO00o(viewInflate, R.id.iv_clear_search);
                        if (imageView != null) {
                            i2 = R.id.iv_search_go;
                            ImageView imageView2 = (ImageView) l53.OooO00o(viewInflate, R.id.iv_search_go);
                            if (imageView2 != null) {
                                i2 = R.id.recyclerView;
                                RecyclerView recyclerView = (RecyclerView) l53.OooO00o(viewInflate, R.id.recyclerView);
                                if (recyclerView != null) {
                                    i2 = R.id.viewLoading;
                                    LinearLayout linearLayout = (LinearLayout) l53.OooO00o(viewInflate, R.id.viewLoading);
                                    if (linearLayout != null) {
                                        o0O00000 o0o00000 = new o0O00000();
                                        o0o00000.OooO0Oo = (CoordinatorLayout) viewInflate;
                                        o0o00000.OooO0o0 = cardView;
                                        o0o00000.OooO0o = editText;
                                        o0o00000.OooO0oO = floatingActionButton;
                                        o0o00000.OooO0oo = frameLayout;
                                        o0o00000.OooO = imageView;
                                        o0o00000.OooOO0 = imageView2;
                                        o0o00000.OooOO0O = recyclerView;
                                        o0o00000.OooOO0o = linearLayout;
                                        sn2.OooO00o("IgrVwP4CP3FlSp2F\n", "S2SzrJ92Wlk=\n");
                                        this.Ooooo0o = o0o00000;
                                        qe qeVar = new qe(new p4());
                                        this.Ooooo00 = qeVar;
                                        int i3 = 2;
                                        qeVar.OooOO0o(gr0.class, new c2(i3));
                                        qe qeVar2 = this.Ooooo00;
                                        if (qeVar2 == null) {
                                            ij0.OooO(sn2.OooO00o("qhECitljmA==\n", "y3Vj+q0G6sk=\n"));
                                            throw null;
                                        }
                                        int i4 = 1;
                                        qeVar2.OooOO0o(k2.class, new c2(i4));
                                        e80 e80Var = new e80(Integer.valueOf(R.string.action_add));
                                        o0O00000 o0o000002 = this.Ooooo0o;
                                        if (o0o000002 == null) {
                                            ij0.OooO(sn2.OooO00o("jsRS9hwQIQ==\n", "7K08knV+RlU=\n"));
                                            throw null;
                                        }
                                        CardView cardView2 = (CardView) o0o000002.OooO0o0;
                                        i81.OooO0oo.OooO0O0.OooO0o0(OooOOOo(), new q5(dr0.OooO00o().OooO0O0.OooO0o(Oooo0oO(), OooOOOo(), new o00OO000(kn2.OooO00o(OoooOOO()), 20), (er0) kn2.OooO00o.OooO0oo), (ViewGroup) cardView2, i));
                                        yu1.OooOOO0.OooO0o0.OooO0o0(OooOOOo(), new f80(new b80(e80Var, this, i)));
                                        yu1 yu1Var = this.OooooOO;
                                        yu1Var.OooO.execute(new xu1(yu1Var, i));
                                        this.OooooOO.OooO0o.OooO0o0(OooOOOo(), new f80(new v70(this, i4)));
                                        o0O00000 o0o000003 = this.Ooooo0o;
                                        if (o0o000003 == null) {
                                            ij0.OooO(sn2.OooO00o("uPhA4P65sw==\n", "2pEuhJfX1C8=\n"));
                                            throw null;
                                        }
                                        RecyclerView recyclerView2 = (RecyclerView) o0o000003.OooOO0O;
                                        Oooo();
                                        recyclerView2.setLayoutManager(new LinearLayoutManager(0));
                                        o0O00000 o0o000004 = this.Ooooo0o;
                                        if (o0o000004 == null) {
                                            ij0.OooO(sn2.OooO00o("exiPsvho4w==\n", "GXHh1pEGhF8=\n"));
                                            throw null;
                                        }
                                        RecyclerView recyclerView3 = (RecyclerView) o0o000004.OooOO0O;
                                        int iRound = Math.round(TypedValue.applyDimension(1, 16.0f, Oooo().getResources().getDisplayMetrics()));
                                        ns nsVar = new ns(i);
                                        nsVar.OooO0o0 = iRound;
                                        recyclerView3.OooOO0O(nsVar);
                                        o0O00000 o0o000005 = this.Ooooo0o;
                                        if (o0o000005 == null) {
                                            ij0.OooO(sn2.OooO00o("RLTAZbpP6A==\n", "Jt2uAdMhjwU=\n"));
                                            throw null;
                                        }
                                        RecyclerView recyclerView4 = (RecyclerView) o0o000005.OooOO0O;
                                        qe qeVar3 = this.Ooooo00;
                                        if (qeVar3 == null) {
                                            ij0.OooO(sn2.OooO00o("0lOQ2Fb+0A==\n", "szfxqCKbotw=\n"));
                                            throw null;
                                        }
                                        recyclerView4.setAdapter(qeVar3);
                                        o0O00000 o0o000006 = this.Ooooo0o;
                                        if (o0o000006 == null) {
                                            ij0.OooO(sn2.OooO00o("AKUt3qlUGA==\n", "YsxDusA6f8I=\n"));
                                            throw null;
                                        }
                                        ((FloatingActionButton) o0o000006.OooO0oO).setOnClickListener(new y70(this, i3));
                                        OoooO();
                                        m1 m1VarOoooOOO = OoooOOO();
                                        ws2 ws2Var = oO0OoOO0.OooO00o;
                                        if (dr0.OooO00o().OooO0O0.OooO0Oo()) {
                                            o0OOOO0o.OooO0OO.OooO00o();
                                        }
                                        Log.e("AdViewLoader", "gatherContent: " + ws2Var.OooO00o());
                                        gv0 gv0Var = new gv0();
                                        oOO0OO ooo0oo = new oOO0OO();
                                        a02 a02Var = new a02(m1VarOoooOOO, ws2Var, gv0Var, i3);
                                        o0O000O o0o000o = new o0O000O(ws2Var, gv0Var, i3);
                                        synchronized (ws2Var.OooO0OO) {
                                            ws2Var.OooO0Oo = true;
                                        }
                                        k42 k42Var = ws2Var.OooO0O0;
                                        k42Var.getClass();
                                        ((Executor) k42Var.OooO0o).execute(new o02(k42Var, m1VarOoooOOO, ooo0oo, a02Var, o0o000o, 2));
                                        gv0Var.OooO0o0(OooOOOo(), new f80(new v70(this, i3)));
                                        int i5 = 3;
                                        this.OooooOO.OooOO0O.OooO0o0(OooOOOo(), new f80(new v70(this, i5)));
                                        o0O00000 o0o000007 = this.Ooooo0o;
                                        if (o0o000007 == null) {
                                            ij0.OooO(sn2.OooO00o("xOIHFUSxbQ==\n", "potpcS3fCqg=\n"));
                                            throw null;
                                        }
                                        ((EditText) o0o000007.OooO0o).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.cmaster.cloner.x70
                                            @Override // android.widget.TextView.OnEditorActionListener
                                            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) throws NumberFormatException {
                                                CharSequence text;
                                                String string;
                                                if (i6 != 3) {
                                                    return false;
                                                }
                                                String string2 = (textView == null || (text = textView.getText()) == null || (string = text.toString()) == null) ? null : uj1.OooO(string).toString();
                                                if (string2 == null || string2.length() <= 0) {
                                                    return true;
                                                }
                                                g80 g80Var = this.OooO00o;
                                                Object systemService = g80Var.Oooo().getSystemService(sn2.OooO00o("l4oJr6y2EsWKjBa+\n", "/uR52tjpf6A=\n"));
                                                sn2.OooO00o("olPmaI3U8R+iSf4kz9KwEq1V/iTZ2LAfo0inatjb/FG4X/phjdb+Fb5J42CDwfkUuwjjat3C5Byp\nUuJryZnZH7xT/knIw/geqGvraszQ9QM=\n", "zCaKBK23kHE=\n");
                                                systemService.getClass();
                                                ((InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                                                g80Var.OoooOo0(string2);
                                                return true;
                                            }
                                        });
                                        o0O00000 o0o000008 = this.Ooooo0o;
                                        if (o0o000008 == null) {
                                            ij0.OooO(sn2.OooO00o("AUVm4bLDSA==\n", "YywIhdutL18=\n"));
                                            throw null;
                                        }
                                        ((ImageView) o0o000008.OooOO0).setOnClickListener(new y70(this, i));
                                        o0O00000 o0o000009 = this.Ooooo0o;
                                        if (o0o000009 == null) {
                                            ij0.OooO(sn2.OooO00o("LJQUPwPoCw==\n", "Tv16W2qGbEw=\n"));
                                            throw null;
                                        }
                                        ((ImageView) o0o000009.OooO).setOnClickListener(new y70(this, i4));
                                        Context contextOooOO0 = OooOO0();
                                        final pr prVar = new pr(contextOooOO0, i5);
                                        r61 r61Var = r61.OooO00o;
                                        if (contextOooOO0 == null) {
                                            r61Var.getClass();
                                        } else {
                                            r61Var.getClass();
                                            SharedPreferences sharedPreferencesOooO00o = r61.OooO00o(contextOooOO0);
                                            if (!sharedPreferencesOooO00o.getBoolean(r61.OooO0OO, false)) {
                                                String str = r61.OooO0Oo;
                                                long j = sharedPreferencesOooO00o.getLong(str, 0L);
                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                if (j == 0) {
                                                    SharedPreferences.Editor editorEdit = sharedPreferencesOooO00o.edit();
                                                    editorEdit.putLong(str, jCurrentTimeMillis);
                                                    editorEdit.apply();
                                                } else if (jCurrentTimeMillis - j > 86400000) {
                                                    String str2 = r61.OooO0o0;
                                                    long j2 = sharedPreferencesOooO00o.getLong(str2, 0L);
                                                    if (j2 == 0 || jCurrentTimeMillis - j2 > 86400000) {
                                                        View viewInflate2 = LayoutInflater.from(contextOooOO0).inflate(R.layout.dialog_rate_us, (ViewGroup) null);
                                                        oOo000Oo ooo000oo = new oOo000Oo(contextOooOO0);
                                                        ((oO00o0) ooo000oo.OooO0o0).OooOOo = viewInflate2;
                                                        final oOo0000O ooo0000oOooO0OO = ooo000oo.OooO0OO();
                                                        sn2.OooO00o("rQ2gNxD3VajgUew=\n", "zn/FVmSSfYY=\n");
                                                        Window window = ooo0000oOooO0OO.getWindow();
                                                        if (window != null) {
                                                            window.setBackgroundDrawable(new ColorDrawable(0));
                                                        }
                                                        ooo0000oOooO0OO.setCancelable(false);
                                                        View viewFindViewById = viewInflate2.findViewById(R.id.rating_bar);
                                                        sn2.OooO00o("3sN1uiIvV/b601K6XGgcr5E=\n", "uKob3nRGMoE=\n");
                                                        viewFindViewById.getClass();
                                                        final RatingBar ratingBar = (RatingBar) viewFindViewById;
                                                        View viewFindViewById2 = viewInflate2.findViewById(R.id.btn_submit_rating);
                                                        sn2.OooO00o("YCbYNRGhDEhENv81b+ZHES8=\n", "Bk+2UUfIaT8=\n");
                                                        viewFindViewById2.getClass();
                                                        final Button button = (Button) viewFindViewById2;
                                                        View viewFindViewById3 = viewInflate2.findViewById(R.id.tv_cancel);
                                                        sn2.OooO00o("uJ1LjKGgb9acjWyM3+ckj/c=\n", "3vQl6PfJCqE=\n");
                                                        viewFindViewById3.getClass();
                                                        View viewFindViewById4 = viewInflate2.findViewById(R.id.tv_rate_subtitle);
                                                        sn2.OooO00o("Gq+kb1fxo7I+v4NvKbbo61U=\n", "fMbKCwGYxsU=\n");
                                                        viewFindViewById4.getClass();
                                                        final TextView textView = (TextView) viewFindViewById4;
                                                        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: com.cmaster.cloner.p61
                                                            @Override // android.widget.RatingBar.OnRatingBarChangeListener
                                                            public final void onRatingChanged(RatingBar ratingBar2, float f, boolean z) {
                                                                Context context = prVar.OooO0o0;
                                                                TextView textView2 = textView;
                                                                Button button2 = button;
                                                                if (f < 4.0f) {
                                                                    textView2.setText(context.getString(R.string.rate_dialog_subtitle_feedback));
                                                                    button2.setText(context.getString(R.string.rate_dialog_submit_feedback));
                                                                } else {
                                                                    textView2.setText(context.getString(R.string.rate_dialog_subtitle_positive));
                                                                    button2.setText(context.getString(R.string.rate_dialog_go_to_store));
                                                                }
                                                            }
                                                        });
                                                        button.setOnClickListener(new View.OnClickListener() { // from class: com.cmaster.cloner.q61
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                float rating = ratingBar.getRating();
                                                                Context context = prVar.OooO0o0;
                                                                if (rating >= 4.0f) {
                                                                    if (context != null) {
                                                                        try {
                                                                            string = context.getPackageName();
                                                                        } catch (ActivityNotFoundException unused) {
                                                                        }
                                                                    }
                                                                    Intent intent = new Intent(sn2.OooO00o("EtugyoxNEMoa27DdjVBahRDBrdeNCiKtNuI=\n", "c7XEuOMkdOQ=\n"), Uri.parse("https://play.google.com/store/apps/details?id=" + string));
                                                                    intent.addFlags(268435456);
                                                                    if (context != null) {
                                                                        context.startActivity(intent);
                                                                    }
                                                                } else {
                                                                    String string = context != null ? context.getString(R.string.feedback_email_subject, context.getPackageName()) : null;
                                                                    string = context != null ? context.getString(R.string.feedback_email_body) : null;
                                                                    Intent intent2 = new Intent(sn2.OooO00o("kQZH15xLYoOZBlfAnVYozJMcSsqdDFXovix36g==\n", "8GgjpfMiBq0=\n"));
                                                                    intent2.setData(Uri.parse(sn2.OooO00o("0mTDT7FxDg==\n", "vwWqI8UeNKs=\n")));
                                                                    intent2.putExtra(sn2.OooO00o("0q/vNFpD5BHar/8jW16uWsu1+Scbb81++o0=\n", "s8GLRjUqgD8=\n"), new String[]{sn2.OooO00o("l/ZTLj+RbfOA/05uMplg8LT9USEzkCLjm/c=\n", "9Jo8QFr8DIA=\n")});
                                                                    intent2.putExtra(sn2.OooO00o("UGLEwHKD7sJYYtTXc56kiUl40tMzud+ue0nj5g==\n", "MQygsh3qiuw=\n"), string);
                                                                    intent2.putExtra(sn2.OooO00o("A0DotA0hhGYLQPijDDzOLRpa/qdMHKUQNg==\n", "Yi6MxmJI4Eg=\n"), string);
                                                                    try {
                                                                        intent2.addFlags(268435456);
                                                                        if (context != null) {
                                                                            context.startActivity(intent2);
                                                                        }
                                                                    } catch (ActivityNotFoundException unused2) {
                                                                        Toast.makeText(context, R.string.feedback_toast_no_email_app, 0).show();
                                                                    }
                                                                }
                                                                r61.OooO00o.getClass();
                                                                sn2.OooO00o("ntQ63ixMTg==\n", "/btUqkk0OrU=\n");
                                                                context.getClass();
                                                                SharedPreferences.Editor editorEdit2 = r61.OooO00o(context).edit();
                                                                editorEdit2.putBoolean(r61.OooO0OO, true);
                                                                editorEdit2.apply();
                                                                ooo0000oOooO0OO.dismiss();
                                                            }
                                                        });
                                                        ((TextView) viewFindViewById3).setOnClickListener(new o0O0ooO(prVar, ooo0000oOooO0OO, i3));
                                                        sn2.OooO00o("XGaCXdDnDQ==\n", "PwnsKbWfeVI=\n");
                                                        SharedPreferences.Editor editorEdit2 = r61.OooO00o(contextOooOO0).edit();
                                                        editorEdit2.putLong(str2, System.currentTimeMillis());
                                                        editorEdit2.apply();
                                                        ooo0000oOooO0OO.show();
                                                        Window window2 = ooo0000oOooO0OO.getWindow();
                                                        if (window2 != null) {
                                                            DisplayMetrics displayMetrics = contextOooOO0.getResources().getDisplayMetrics();
                                                            window2.setLayout(displayMetrics.widthPixels - (((int) (36.0f * displayMetrics.density)) * 2), -2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        o0O00000 o0o0000010 = this.Ooooo0o;
                                        if (o0o0000010 == null) {
                                            ij0.OooO(sn2.OooO00o("2mNafye+Cw==\n", "uAo0G07QbNs=\n"));
                                            throw null;
                                        }
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) o0o0000010.OooO0Oo;
                                        sn2.OooO00o("zUW1UU/3t+GEDu8q\n", "qiDBAyCYw8k=\n");
                                        coordinatorLayout.getClass();
                                        return coordinatorLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        qa.OooOOO0(sn2.OooO00o("cNLfqgXOVQRP3t2sBdJXQB3NxbwbgEVNSdOMkCiaEg==\n", "Pbus2WygMiQ=\n").concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // com.cmaster.cloner.o10
    public final void OooOoo0() {
        this.Oooo00O = true;
        try {
            Oooo().unbindService(this.OoooooO);
        } catch (Throwable unused) {
        }
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo0() {
        this.Oooo00O = true;
    }

    @Override // com.cmaster.cloner.o10
    public final boolean Oooo000(MenuItem menuItem) {
        sn2.OooO00o("JbXjOQ==\n", "TMGGVPOaWxc=\n");
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        int i = 0;
        int i2 = 1;
        if (itemId == R.id.action_mode) {
            this.OooooOo = !this.OooooOo;
            return false;
        }
        if (itemId == R.id.action_assist) {
            this.Oooooo0 = !this.Oooooo0;
            return false;
        }
        if (itemId == R.id.action_connect_us) {
            j1.OooO0o0(this, OooO00o.class);
            return false;
        }
        if (itemId == R.id.action_about_us) {
            j1.OooO0o0(this, OooO00o.class);
            return false;
        }
        if (itemId == R.id.action_install_gms) {
            OoooOoo(-10000, sn2.OooO00o("UVsRuUESAmtdXRi5VhkIfVtaGw==\n", "MjR8lyB8Zhk=\n"));
            return false;
        }
        if (itemId == R.id.action_backup) {
            OoooOOo(false);
            return false;
        }
        if (itemId == R.id.action_full_backup) {
            OoooOOo(true);
            return false;
        }
        if (itemId == R.id.action_restore) {
            m1 m1VarOoooOOO = OoooOOO();
            String strOooO00o = sn2.OooO00o("javdMzZouwCFtMNwJWKq\n", "7NutX18L2nQ=\n");
            m1VarOoooOOO.getClass();
            uz uzVar = new uz(strOooO00o);
            m1VarOoooOOO.OooOoo.OooOO0o(uzVar);
            uzVar.OooO0o0(OooOOOo(), new f80(new v70(this, i)));
            return false;
        }
        if (itemId == R.id.action_app_visible) {
            h80 h80Var = this.OooooO0;
            if (h80Var == null) {
                ij0.OooO(sn2.OooO00o("s4wYAwTrN5y7tg==\n", "3tpxZnOmWPg=\n"));
                throw null;
            }
            boolean z = !yu1.OooOOO0.OooOO0o;
            yu1 yu1Var = h80Var.OooO0o;
            ConcurrentHashMap concurrentHashMap = yu1Var.OooO0oO;
            if (yu1Var.OooOO0o != z) {
                yu1Var.OooOO0o = z;
                ArrayList arrayList = new ArrayList(concurrentHashMap.size());
                for (k2 k2Var : concurrentHashMap.values()) {
                    if (k2Var.OooO0oo != z) {
                        k2Var.OooO0oo = z;
                        k2Var.OooO0Oo();
                    }
                    arrayList.add(k2Var);
                }
                yu1Var.OooO0o0.OooOO0o(arrayList);
                return false;
            }
        } else {
            if (itemId == R.id.action_remove_ads) {
                j1.OooO0o0(this, l30.class);
                return false;
            }
            if (itemId == R.id.action_remove_ads_icon) {
                j1.OooO0o0(this, l30.class);
                return false;
            }
            if (itemId == R.id.action_remove_gms) {
                new AlertDialog.Builder(Oooo()).setMessage(sn2.OooO00o("t6he0ivBPeKFr0mXctcnt9atWpwmjjyt1q9VmzzdPKOatgQ=\n", "9to78lKuSMI=\n")).setCancelable(false).setPositiveButton(sn2.OooO00o("K7wb\n", "ctlo89udpLc=\n"), new wc(this, i2)).setNegativeButton(sn2.OooO00o("FC4=\n", "WkHELo/Q4kg=\n"), new z70()).create().show();
                return false;
            }
            if (itemId == R.id.action_qrcode_scan) {
                o000oOoO(new Intent(Oooo(), (Class<?>) ActivityBarCodePreview.class));
                return false;
            }
            if (itemId == R.id.action_qrcode_scan_top) {
                o000oOoO(new Intent(Oooo(), (Class<?>) ActivityBarCodePreview.class));
                return false;
            }
            if (itemId == R.id.action_force_stop_all) {
                this.Oooooo.execute(new w70(this, i));
                return false;
            }
            if (itemId == R.id.action_search) {
                Ooooo0o();
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo00O(Menu menu) {
        String str;
        String str2;
        String str3;
        String str4;
        sn2.OooO00o("RHhK8w==\n", "KR0khnPeCsQ=\n");
        menu.getClass();
        MenuItem menuItemFindItem = menu.findItem(R.id.action_mode);
        if (menuItemFindItem != null) {
            if (this.OooooOo) {
                str3 = "PtADGnxPt1yYAOM=\n";
                str4 = "fbxsdBmpH/0=\n";
            } else {
                str3 = "cdmBJbPZtv7VCWE=\n";
                str4 = "MLXuS9Y/Hl8=\n";
            }
            menuItemFindItem.setTitle(sn2.OooO00o(str3, str4));
            menuItemFindItem.setVisible(false);
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.action_assist);
        if (menuItemFindItem2 != null) {
            if (this.Oooooo0) {
                str = "ENrUXJAZV0VZge02\n";
                str2 = "+GRRuRycse0=\n";
            } else {
                str = "O29/ZyCzRcx+MngN\n";
                str2 = "39fEgqw2o2Q=\n";
            }
            menuItemFindItem2.setTitle(sn2.OooO00o(str, str2));
            menuItemFindItem2.setVisible(false);
        }
        MenuItem menuItemFindItem3 = menu.findItem(R.id.action_app_visible);
        if (menuItemFindItem3 != null) {
            menuItemFindItem3.setTitle(OooOOO().getString(yu1.OooOOO0.OooOO0o ? R.string.show_hidden_apps : R.string.hide_hidden_apps));
        }
        MenuItem menuItemFindItem4 = menu.findItem(R.id.action_backup);
        if (menuItemFindItem4 != null) {
            menuItemFindItem4.setVisible(false);
        }
        MenuItem menuItemFindItem5 = menu.findItem(R.id.action_full_backup);
        if (menuItemFindItem5 != null) {
            menuItemFindItem5.setVisible(false);
        }
        MenuItem menuItemFindItem6 = menu.findItem(R.id.action_restore);
        if (menuItemFindItem6 != null) {
            menuItemFindItem6.setVisible(false);
        }
        MenuItem menuItemFindItem7 = menu.findItem(R.id.action_qrcode_scan);
        if (menuItemFindItem7 != null) {
            menuItemFindItem7.setVisible(true);
        }
        MenuItem menuItemFindItem8 = menu.findItem(R.id.action_qrcode_scan_top);
        if (menuItemFindItem8 != null) {
            menuItemFindItem8.setVisible(true);
        }
        MenuItem menuItemFindItem9 = menu.findItem(R.id.action_remove_gms);
        if (menuItemFindItem9 != null) {
            menuItemFindItem9.setVisible(false);
        }
    }

    public final void OoooOOo(boolean z) {
        if (this.Ooooooo == null) {
            ProgressDialog progressDialog = new ProgressDialog(Oooo());
            this.Ooooooo = progressDialog;
            progressDialog.setCancelable(false);
        }
        ProgressDialog progressDialog2 = this.Ooooooo;
        progressDialog2.getClass();
        progressDialog2.show();
        k81 k81Var = new k81();
        File[] externalMediaDirs = Oooo().getExternalMediaDirs();
        externalMediaDirs.getClass();
        int i = 0;
        while (true) {
            if (!(i < externalMediaDirs.length)) {
                break;
            }
            int i2 = i + 1;
            try {
                File file = externalMediaDirs[i];
                file.mkdirs();
                ApplicationInfo applicationInfo = e2.OooO00o().applicationInfo;
                CharSequence charSequenceLoadLabel = applicationInfo != null ? applicationInfo.loadLabel(e2.OooO0O0()) : null;
                File file2 = new File(file, ((Object) charSequenceLoadLabel) + "_output_" + System.currentTimeMillis() + ".zip");
                k81Var.OooO0Oo = file2;
                if (file2.canWrite()) {
                    break;
                } else {
                    i = i2;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        if (k81Var.OooO0Oo == null) {
            e2.OooO0Oo(sn2.OooO00o("LxTOPOIxcSAlW9519g==\n", "QXu6HIReBE4=\n"));
            return;
        }
        try {
            h12 h12Var = new h12(Oooo(), sn2.OooO00o("PyvG6w==\n", "enmWqaDosfU=\n"), z);
            h12Var.OooO0o0(this, new f80(new b80(this, k81Var)));
            h1.OooO0Oo.execute(new bf1(h12Var, (File) k81Var.OooO0Oo, 5));
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OoooOo0(java.lang.String r11) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.g80.OoooOo0(java.lang.String):void");
    }

    public final void OoooOoO(final int i) {
        Bundle bundle = Bundle.EMPTY;
        ArrayList arrayList = j1.OooO00o;
        j1.OooO0o(Oooo(), m80.class).OooO0o0(OooOOOo(), new f80(new a40() { // from class: com.cmaster.cloner.c80
            @Override // com.cmaster.cloner.a40
            public final Object OooO0o(Object obj) {
                o0oO0O0o o0oo0o0o = (o0oO0O0o) obj;
                if (o0oo0o0o.OooO0Oo == -1) {
                    g80 g80Var = this.OooO0Oo;
                    g80Var.OoooOOO().OooOo0(new hq(o0oo0o0o, g80Var, i, 2));
                }
                return vq1.OooO00o;
            }
        }));
    }

    public final void OoooOoo(int i, String str) {
        int[] iArrOooOo;
        sn2.OooO00o("wb6AU2gkJ83QsoY=\n", "sd/jOAlDQoM=\n");
        str.getClass();
        int i2 = 1;
        if (h1.OooO0O0()) {
            OoooOOO().OooOo0(new hq(this, str, i, 1));
            return;
        }
        if (i == -10000) {
            try {
                iArrOooOo = a02.OooO0oo.OooOo(str);
            } catch (Exception unused) {
                iArrOooOo = new int[0];
            }
            if (iArrOooOo == null) {
                iArrOooOo = new int[0];
            }
            Arrays.sort(iArrOooOo);
            int i3 = 0;
            while (i3 < iArrOooOo.length && i3 == iArrOooOo[i3]) {
                i3++;
            }
            i = i3;
        }
        if (hz.OooO00o.contains(str)) {
            Ooooo00(i, str);
            return;
        }
        if (u60.OooO00o(str)) {
            h1.OooO0O0.execute(new w70(this, i2));
            return;
        }
        int i4 = !this.OooooOo ? 3 : 2;
        if (this.Oooooo0) {
            String str2 = b02.OooO00o;
            k63.OooO0O0(i4, -10000, str2 + ".assist", str2 + ".assist", Uri.fromParts(sn2.OooO00o("iRqgVt0ACA==\n", "+XvDPbxnbUE=\n"), str, null).toString());
        } else {
            k63.OooO0O0(i4, i, null, null, str);
        }
        if (k63.OooO00o(0, i, sn2.OooO00o("bFz0jVtYEgtgWv2NTFMYHWZd/g==\n", "DzOZozo2dnk=\n")) == null) {
            Ooooo00(i, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[LOOP:0: B:24:0x0055->B:125:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ooooo00(int r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.g80.Ooooo00(int, java.lang.String):void");
    }

    public final void Ooooo0o() {
        o0O00000 o0o00000 = this.Ooooo0o;
        if (o0o00000 == null) {
            ij0.OooO(sn2.OooO00o("pWj/w92Hcw==\n", "xwGRp7TpFKk=\n"));
            throw null;
        }
        FrameLayout frameLayout = (FrameLayout) o0o00000.OooO0oo;
        sn2.OooO00o("27bj+WIDSaX+td7oYhhEqM8=\n", "vdqwnANxKs0=\n");
        int visibility = frameLayout.getVisibility();
        o0O00000 o0o000002 = this.Ooooo0o;
        if (visibility == 0) {
            if (o0o000002 != null) {
                ((FrameLayout) o0o000002.OooO0oo).setVisibility(8);
                return;
            } else {
                ij0.OooO(sn2.OooO00o("B2g8VEbX2g==\n", "ZQFSMC+5vUs=\n"));
                throw null;
            }
        }
        if (o0o000002 != null) {
            ((FrameLayout) o0o000002.OooO0oo).setVisibility(0);
        } else {
            ij0.OooO(sn2.OooO00o("eY1p/owCvg==\n", "G+QHmuVs2XQ=\n"));
            throw null;
        }
    }
}
