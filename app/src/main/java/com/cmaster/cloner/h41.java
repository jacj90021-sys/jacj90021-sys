package com.cmaster.cloner;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class h41 extends er implements DialogInterface.OnClickListener {
    public DialogPreference o00Oo0;
    public CharSequence o00Ooo;
    public CharSequence o00o0O;
    public BitmapDrawable o00oO0O;
    public int o00oO0o;
    public CharSequence o00ooo;
    public int o0ooOO0;
    public CharSequence oo000o;

    @Override // com.cmaster.cloner.er, com.cmaster.cloner.o10
    public void OooOoO0(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        super.OooOoO0(bundle);
        o10 o10VarOooOOOO = OooOOOO(true);
        if (!(o10VarOooOOOO instanceof j41)) {
            qa.OooO0o("Target fragment must implement TargetFragment interface");
            return;
        }
        j41 j41Var = (j41) o10VarOooOOOO;
        String string = Oooo0oo().getString("key");
        if (bundle != null) {
            this.o00Ooo = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.o00o0O = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.o00ooo = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.oo000o = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.o00oO0o = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.o00oO0O = new BitmapDrawable(OooOOO(), bitmap);
                return;
            }
            return;
        }
        n41 n41Var = j41Var.OoooOoo;
        Preference preferenceOooOoOO = null;
        if (n41Var != null && (preferenceScreen = n41Var.OooO0o0) != null) {
            preferenceOooOoOO = preferenceScreen.OooOoOO(string);
        }
        DialogPreference dialogPreference = (DialogPreference) preferenceOooOoOO;
        this.o00Oo0 = dialogPreference;
        this.o00Ooo = dialogPreference.Oooo;
        this.o00o0O = dialogPreference.OoooO0O;
        this.o00ooo = dialogPreference.OoooO;
        this.oo000o = dialogPreference.OoooO00;
        this.o00oO0o = dialogPreference.OoooOO0;
        Drawable drawable = dialogPreference.OoooO0;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.o00oO0O = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.o00oO0O = new BitmapDrawable(OooOOO(), bitmapCreateBitmap);
    }

    @Override // com.cmaster.cloner.er, com.cmaster.cloner.o10
    public void Oooo00o(Bundle bundle) {
        super.Oooo00o(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.o00Ooo);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.o00o0O);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.o00ooo);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.oo000o);
        bundle.putInt("PreferenceDialogFragment.layout", this.o00oO0o);
        BitmapDrawable bitmapDrawable = this.o00oO0O;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // com.cmaster.cloner.er
    public final Dialog OoooOOO() {
        this.o0ooOO0 = -2;
        oOo000Oo ooo000oo = new oOo000Oo(Oooo());
        CharSequence charSequence = this.o00Ooo;
        oO00o0 oo00o0 = (oO00o0) ooo000oo.OooO0o0;
        oo00o0.OooO0Oo = charSequence;
        oo00o0.OooO0OO = this.o00oO0O;
        ooo000oo.OooO0o0(this.o00o0O, this);
        ooo000oo.OooO0Oo(this.o00ooo, this);
        Oooo();
        int i = this.o00oO0o;
        View viewInflate = i != 0 ? OooOO0O().inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            OoooOo0(viewInflate);
            oo00o0.OooOOo = viewInflate;
        } else {
            oo00o0.OooO0o = this.oo000o;
        }
        OoooOoo(ooo000oo);
        oOo0000O ooo0000oOooO0OO = ooo000oo.OooO0OO();
        if (this instanceof ku) {
            Window window = ooo0000oOooO0OO.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                g41.OooO00o(window);
                return ooo0000oOooO0OO;
            }
            ku kuVar = (ku) this;
            kuVar.o0Oo0oo = SystemClock.currentThreadTimeMillis();
            kuVar.Ooooo00();
        }
        return ooo0000oOooO0OO;
    }

    public final DialogPreference OoooOOo() {
        PreferenceScreen preferenceScreen;
        if (this.o00Oo0 == null) {
            String string = Oooo0oo().getString("key");
            n41 n41Var = ((j41) OooOOOO(true)).OoooOoo;
            Preference preferenceOooOoOO = null;
            if (n41Var != null && (preferenceScreen = n41Var.OooO0o0) != null) {
                preferenceOooOoOO = preferenceScreen.OooOoOO(string);
            }
            this.o00Oo0 = (DialogPreference) preferenceOooOoOO;
        }
        return this.o00Oo0;
    }

    public void OoooOo0(View view) {
        int i;
        View viewFindViewById = view.findViewById(android.R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.oo000o;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void OoooOoO(boolean z);

    public void OoooOoo(oOo000Oo ooo000oo) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.o0ooOO0 = i;
    }

    @Override // com.cmaster.cloner.er, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        OoooOoO(this.o0ooOO0 == -1);
    }
}
