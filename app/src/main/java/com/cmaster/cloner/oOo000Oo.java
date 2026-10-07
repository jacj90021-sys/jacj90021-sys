package com.cmaster.cloner;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.JsonWriter;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class oOo000Oo implements qa1, o00, av2 {
    public int OooO0Oo;
    public final Object OooO0o0;

    public oOo000Oo(byte[] bArr) {
        int length = bArr.length;
        if (length < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{-114, -9, 70, -35, -71, 48, -72, -100, -118, -21, 86}, new byte[]{-21, -103, 34, -3, -123, 16, -53, -24}));
            throw null;
        }
        if (length > bArr.length) {
            ra.OooOOO(u7.OooO00o(new byte[]{-89, -100, -21, 41, -65, -75, 30, -70, -74, -105, -4, 39, -19, -16, 18, -92, -74, -102}, new byte[]{-62, -14, -113, 9, -127, -107, 124, -61}));
            throw null;
        }
        this.OooO0o0 = bArr;
        this.OooO0Oo = length;
    }

    @Override // com.cmaster.cloner.o00
    public boolean OooO00o(View view) {
        ((BottomSheetBehavior) this.OooO0o0).Oooo0O0(this.OooO0Oo);
        return true;
    }

    public void OooO0O0(int i, int i2) {
        ti0 ti0Var = (ti0) this.OooO0o0;
        int i3 = ti0Var.OooO0o;
        if (i >= i3) {
            for (int i4 = i - i3; i4 >= 0; i4--) {
                ti0Var.OooO0o0(-1);
            }
        }
        ti0Var.OooO0oO(i, i2);
        int i5 = i2 + 1;
        if (this.OooO0Oo < i5) {
            this.OooO0Oo = i5;
        }
    }

    public oOo0000O OooO0OO() {
        ListAdapter ooo00ooo;
        oO00o0 oo00o0 = (oO00o0) this.OooO0o0;
        ContextThemeWrapper contextThemeWrapper = oo00o0.OooO00o;
        ContextThemeWrapper contextThemeWrapper2 = oo00o0.OooO00o;
        oOo0000O ooo0000o = new oOo0000O(contextThemeWrapper, this.OooO0Oo);
        View view = oo00o0.OooO0o0;
        oO0OO00o oo0oo00o = ooo0000o.OooO;
        if (view != null) {
            oo0oo00o.OooOo0o = view;
        } else {
            CharSequence charSequence = oo00o0.OooO0Oo;
            if (charSequence != null) {
                oo0oo00o.OooO0Oo = charSequence;
                TextView textView = oo0oo00o.OooOo0;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = oo00o0.OooO0OO;
            if (drawable != null) {
                oo0oo00o.OooOOoo = drawable;
                ImageView imageView = oo0oo00o.OooOo00;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    oo0oo00o.OooOo00.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = oo00o0.OooO0o;
        if (charSequence2 != null) {
            oo0oo00o.OooO0o0 = charSequence2;
            TextView textView2 = oo0oo00o.OooOo0O;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = oo00o0.OooO0oO;
        if (charSequence3 != null) {
            oo0oo00o.OooO0OO(-1, charSequence3, oo00o0.OooO0oo);
        }
        CharSequence charSequence4 = oo00o0.OooO;
        if (charSequence4 != null) {
            oo0oo00o.OooO0OO(-2, charSequence4, oo00o0.OooOO0);
        }
        CharSequence charSequence5 = oo00o0.OooOO0O;
        if (charSequence5 != null) {
            oo0oo00o.OooO0OO(-3, charSequence5, oo00o0.OooOO0o);
        }
        if (oo00o0.OooOOOO != null || oo00o0.OooOOOo != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) oo00o0.OooO0O0.inflate(oo0oo00o.OooOoOO, (ViewGroup) null);
            if (oo00o0.OooOo00) {
                ooo00ooo = new oO00o00(oo00o0, contextThemeWrapper2, oo0oo00o.OooOoo0, oo00o0.OooOOOO, alertController$RecycleListView);
            } else {
                int i = oo00o0.OooOo0 ? oo0oo00o.OooOoo : oo0oo00o.OooOooO;
                ooo00ooo = oo00o0.OooOOOo;
                if (ooo00ooo == null) {
                    ooo00ooo = new oOo00ooO(contextThemeWrapper2, i, android.R.id.text1, oo00o0.OooOOOO);
                }
            }
            oo0oo00o.OooOo = ooo00ooo;
            oo0oo00o.OooOoO0 = oo00o0.OooOo0O;
            if (oo00o0.OooOOo0 != null) {
                alertController$RecycleListView.setOnItemClickListener(new oO0OOO00(oo00o0, oo0oo00o));
            } else if (oo00o0.OooOo0o != null) {
                alertController$RecycleListView.setOnItemClickListener(new oO00o00O(oo00o0, alertController$RecycleListView, oo0oo00o));
            }
            if (oo00o0.OooOo0) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (oo00o0.OooOo00) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            oo0oo00o.OooO0o = alertController$RecycleListView;
        }
        View view2 = oo00o0.OooOOo;
        if (view2 != null) {
            oo0oo00o.OooO0oO = view2;
            oo0oo00o.OooO0oo = false;
        }
        ooo0000o.setCancelable(oo00o0.OooOOO0);
        if (oo00o0.OooOOO0) {
            ooo0000o.setCanceledOnTouchOutside(true);
        }
        ooo0000o.setOnCancelListener(null);
        ooo0000o.setOnDismissListener(null);
        ts0 ts0Var = oo00o0.OooOOO;
        if (ts0Var != null) {
            ooo0000o.setOnKeyListener(ts0Var);
        }
        return ooo0000o;
    }

    public void OooO0Oo(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        oO00o0 oo00o0 = (oO00o0) this.OooO0o0;
        oo00o0.OooO = charSequence;
        oo00o0.OooOO0 = onClickListener;
    }

    public void OooO0o0(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        oO00o0 oo00o0 = (oO00o0) this.OooO0o0;
        oo00o0.OooO0oO = charSequence;
        oo00o0.OooO0oo = onClickListener;
    }

    @Override // com.cmaster.cloner.av2
    public void OooO0oO(JsonWriter jsonWriter) throws IOException {
        int i = this.OooO0Oo;
        Map map = (Map) this.OooO0o0;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        fx2.OooO0o0(jsonWriter, map);
        jsonWriter.endObject();
    }

    @Override // com.cmaster.cloner.qa1
    public fa1 OooOO0(fa1 fa1Var, xz0 xz0Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) fa1Var.get()).compress((Bitmap.CompressFormat) this.OooO0o0, this.OooO0Oo, byteArrayOutputStream);
        fa1Var.OooO0O0();
        return new oO0O0Oo0(byteArrayOutputStream.toByteArray());
    }

    public /* synthetic */ oOo000Oo(Object obj, int i) {
        this.OooO0o0 = obj;
        this.OooO0Oo = i;
    }

    public oOo000Oo(gh ghVar, int i) {
        by2.OooO0oo(ghVar);
        this.OooO0o0 = ghVar;
        this.OooO0Oo = i;
    }

    public oOo000Oo(int i, boolean z) {
        switch (i) {
            case 6:
                this.OooO0Oo = 1;
                this.OooO0o0 = Collections.singletonList(null);
                break;
            default:
                this.OooO0o0 = Bitmap.CompressFormat.JPEG;
                this.OooO0Oo = 100;
                break;
        }
    }

    public oOo000Oo(int i) {
        this.OooO0o0 = new ti0(i);
    }

    public /* synthetic */ oOo000Oo(int i, Map map) {
        this.OooO0Oo = i;
        this.OooO0o0 = map;
    }

    public oOo000Oo(Context context) {
        this(context, oOo0000O.OooO0oO(context, 0));
    }

    public oOo000Oo(Context context, int i) {
        this.OooO0o0 = new oO00o0(new ContextThemeWrapper(context, oOo0000O.OooO0oO(context, i)));
        this.OooO0Oo = i;
    }

    public oOo000Oo(ArrayList arrayList) {
        this.OooO0Oo = 0;
        this.OooO0o0 = arrayList;
    }
}
