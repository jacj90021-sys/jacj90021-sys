package com.bumptech.matrix;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.cmaster.cloner.R;
import com.cmaster.cloner.dn;
import com.cmaster.cloner.j2;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.rt1;
import com.cmaster.cloner.sn2;
import com.cmaster.cloner.u1;
import com.cmaster.cloner.w10;
import com.cmaster.cloner.y10;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class DataBinderMapperImpl extends dn {
    public static final SparseIntArray OooO00o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        OooO00o = sparseIntArray;
        sparseIntArray.put(R.layout.app_installed_item, 1);
        sparseIntArray.put(R.layout.app_shortcut_custom, 2);
        sparseIntArray.put(R.layout.fragment_device, 3);
        sparseIntArray.put(R.layout.fragment_free_vip, 4);
    }

    @Override // com.cmaster.cloner.dn
    public final List OooO00o() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // com.cmaster.cloner.dn
    public final rt1 OooO0O0(View view, int i) {
        int i2 = OooO00o.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                ra.OooOOO0(sn2.OooO00o("AMTNNmXbe3oCjcAgM9MuaFbZySY=\n", "dq2oQUW2Dgk=\n"));
            } else {
                if (i2 == 1) {
                    if (sn2.OooO00o("1w1twNymdsPLHEvGx6Etw9cAccv2uy3H1jMk\n", "u2wUr6nSWaI=\n").equals(tag)) {
                        return new u1(view);
                    }
                    ra.OooO0OO(sn2.OooO00o("l8KuX/JBTw6lxblf51BYcarEuAvnTERLp/WiC+NNCEewiqIR8EFER6eE6y3jQ01Htc+vRaY=\n", "w6rLf4YgKC4=\n"), tag);
                    return null;
                }
                if (i2 == 2) {
                    if (sn2.OooO00o("dD6hWY3s7EpoL4dFkPexX3sqrGmb7bBfdzKHBg==\n", "GF/YNviYwys=\n").equals(tag)) {
                        return new j2(view);
                    }
                    ra.OooO0OO(sn2.OooO00o("D3HI4w4kHgw9dt/jGzUJcyhxwrEOJgxYBHrYsA4qFAwyao2qFDMYQDJ9g+MoIBpJMm/Ip0Bl\n", "Wxmtw3pFeSw=\n"), tag);
                    return null;
                }
                if (i2 == 3) {
                    if (sn2.OooO00o("4I1y1d6YQQL+jWzXzoIaO+iJfdPIiTFU\n", "jOwLuqvsbmQ=\n").equals(tag)) {
                        return new w10(view);
                    }
                    ra.OooO0OO(sn2.OooO00o("vnWcKqpwmQOMcosquGOfRId4l36BdZtVg36cKrdi3kqEa5hmt3XQA7h4mm+3Z5tH0D0=\n", "6h35Ct4R/iM=\n"), tag);
                    return null;
                }
                if (i2 == 4) {
                    if (!sn2.OooO00o("6lNRW+qurln0U09Z+rT1YOBATVHArOhP2QI=\n", "hjIoNJ/agT8=\n").equals(tag)) {
                        ra.OooO0OO(sn2.OooO00o("B+mwyRKGBC817qfJAJUCaD7ku505gRFqNt6jgBbHCnxz6LufB4sKa32hh4wFggp5NuXvyQ==\n", "U4HV6WbnYw8=\n"), tag);
                        return null;
                    }
                    Object[] objArr = new Object[7];
                    rt1.OooO0oO(view, objArr, y10.OooOoO0, true);
                    y10 y10Var = new y10(view, (CardView) objArr[1], (TextView) objArr[3], (Button) objArr[5], (Button) objArr[2], (RadioGroup) objArr[6], (TextView) objArr[4]);
                    y10Var.OooOo = -1L;
                    ((RelativeLayout) objArr[0]).setTag(null);
                    view.setTag(R.id.dataBinding, y10Var);
                    synchronized (y10Var) {
                        y10Var.OooOo = 2L;
                    }
                    y10Var.OooO();
                    return y10Var;
                }
            }
        }
        return null;
    }
}
