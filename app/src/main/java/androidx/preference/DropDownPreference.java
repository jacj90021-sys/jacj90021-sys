package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.cmaster.cloner.R;
import com.cmaster.cloner.pt;
import com.cmaster.cloner.q41;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter OoooOoo;
    public Spinner Ooooo00;
    public final pt Ooooo0o;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.Ooooo0o = new pt(this, 0);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.OoooOoo = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.o000oOoO;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void OooO0oO() {
        super.OooO0oO();
        ArrayAdapter arrayAdapter = this.OoooOoo;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void OooOO0O(q41 q41Var) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) q41Var.OooO00o.findViewById(R.id.spinner);
        this.Ooooo00 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.OoooOoo);
        this.Ooooo00.setOnItemSelectedListener(this.Ooooo0o);
        Spinner spinner2 = this.Ooooo00;
        String str = this.OoooOOo;
        if (str == null || (charSequenceArr = this.OoooOOO) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    break;
                } else {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.OooOO0O(q41Var);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void OooOO0o() {
        this.Ooooo00.performClick();
    }
}
