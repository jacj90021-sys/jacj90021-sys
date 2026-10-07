package com.cmaster.cloner;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ev extends zq2 {
    public final TextView OooO00o;
    public final zu OooO0O0;
    public boolean OooO0OO = true;

    public ev(TextView textView) {
        this.OooO00o = textView;
        this.OooO0O0 = new zu(textView);
    }

    @Override // com.cmaster.cloner.zq2
    public final InputFilter[] OooO00o(InputFilter[] inputFilterArr) {
        if (!this.OooO0OO) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof zu) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            zu zuVar = this.OooO0O0;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = zuVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == zuVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // com.cmaster.cloner.zq2
    public final boolean OooO0O0() {
        return this.OooO0OO;
    }

    @Override // com.cmaster.cloner.zq2
    public final void OooO0OO(boolean z) {
        if (z) {
            TextView textView = this.OooO00o;
            textView.setTransformationMethod(OooO0o0(textView.getTransformationMethod()));
        }
    }

    @Override // com.cmaster.cloner.zq2
    public final void OooO0Oo(boolean z) {
        this.OooO0OO = z;
        TextView textView = this.OooO00o;
        textView.setTransformationMethod(OooO0o0(textView.getTransformationMethod()));
        textView.setFilters(OooO00o(textView.getFilters()));
    }

    @Override // com.cmaster.cloner.zq2
    public final TransformationMethod OooO0o0(TransformationMethod transformationMethod) {
        return this.OooO0OO ? ((transformationMethod instanceof iv) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new iv(transformationMethod) : transformationMethod instanceof iv ? ((iv) transformationMethod).OooO0Oo : transformationMethod;
    }
}
