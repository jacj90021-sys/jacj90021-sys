package com.cmaster.cloner;

import android.app.Activity;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00O000 extends BaseAdapter {
    public final Activity OooO0Oo;
    public final HashMap OooO0o;
    public final String[] OooO0o0;
    public final e81 OooO0oO;

    public o00O000(e81 e81Var, Activity activity, String[] strArr, HashMap map) {
        this.OooO0oO = e81Var;
        this.OooO0Oo = activity;
        this.OooO0o0 = strArr;
        this.OooO0o = map;
    }

    public final int OooO00o(int i) {
        return (int) (i * this.OooO0Oo.getResources().getDisplayMetrics().density);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.OooO0o0.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.OooO0o0[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        LinearLayout linearLayout;
        if (view == null) {
            Activity activity = this.OooO0Oo;
            linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.setPadding(OooO00o(24), OooO00o(12), OooO00o(24), OooO00o(12));
            TextView textView = new TextView(activity);
            textView.setTextSize(16.0f);
            textView.setGravity(16);
            linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
            mp mpVar = new mp(activity);
            Paint paint = new Paint(1);
            mpVar.OooO0Oo = paint;
            paint.setStrokeWidth(4.0f);
            paint.setStyle(Paint.Style.STROKE);
            linearLayout.addView(mpVar, new LinearLayout.LayoutParams(OooO00o(28), OooO00o(28)));
            o00oOoo o00oooo = new o00oOoo();
            o00oooo.OooO00o = textView;
            o00oooo.OooO0O0 = mpVar;
            linearLayout.setTag(o00oooo);
        } else {
            linearLayout = (LinearLayout) view;
        }
        o00oOoo o00oooo2 = (o00oOoo) linearLayout.getTag();
        String str = this.OooO0o0[i];
        o00oooo2.OooO00o.setText(str);
        o00oooo2.OooO0O0.setOnClickListener(new o0O0ooO(this, str, i));
        return linearLayout;
    }
}
