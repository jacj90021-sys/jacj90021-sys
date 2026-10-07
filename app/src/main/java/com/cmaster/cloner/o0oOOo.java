package com.cmaster.cloner;

import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.bumptech.matrix.ui.qrcode.ActivityBarCodePreview;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0oOOo implements View.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ o0oOOo(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                String str = ActivityBarCodePreview.Oooo0OO;
                Intent intent = new Intent(sn2.OooO00o("V5GuI8fUExhfkb40xslZV1WLoz7Gkzhmc7GVFef+IntzsZ4=\n", "Nv/KUai9dzY=\n"));
                intent.setType(sn2.OooO00o("3j/8NEMqzQ==\n", "t1KdUyYF5xk=\n"));
                intent.addCategory(sn2.OooO00o("adlDFGb5A5th2VMDZ+RJ1mnDQgFm4h6bR+diKEjSK/A=\n", "CLcnZgmQZ7U=\n"));
                ((ActivityBarCodePreview) obj).startActivityForResult(intent, 20001);
                break;
            case 1:
                zd zdVar = (zd) obj;
                EditText editText = zdVar.OooO;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    zdVar.OooOOOo();
                    break;
                }
                break;
            case 2:
                ((tt) obj).OooOo00();
                break;
            default:
                n21 n21Var = (n21) obj;
                EditText editText2 = n21Var.OooO0o;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = n21Var.OooO0o;
                    boolean z = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                    EditText editText4 = n21Var.OooO0o;
                    if (z) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        n21Var.OooO0o.setSelection(selectionEnd);
                    }
                    n21Var.OooOOOo();
                    break;
                }
                break;
        }
    }
}
