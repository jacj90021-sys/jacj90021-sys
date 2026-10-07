package com.cmaster.cloner;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k1 implements iy0 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ k1(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // com.cmaster.cloner.iy0
    public final void OooO00o(Object obj) {
        PackageInfo packageInfo;
        Intent intent;
        Intent intent2;
        Uri data;
        int i = this.OooO0Oo;
        int i2 = 8;
        int i3 = 2;
        Object obj2 = this.OooO0o0;
        switch (i) {
            case 0:
                m1 m1Var = (m1) obj2;
                cf1 cf1Var = m1Var.OooOoo;
                o0OoOoOo o0oooooo = (o0OoOoOo) cf1Var.OooO0Oo();
                if (o0oooooo != null) {
                    try {
                        m1Var.OooOoo(o0oooooo.getClass()).OooO00o(o0oooooo.OooOOo0);
                        if (o0oooooo.OooOOO0()) {
                            cf1Var.OooOOo0(o0oooooo);
                            break;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (o0oooooo instanceof o0O0O0O) {
                            o0oooooo.OooOOo0(m1Var, new o0oO0O0o(-1, new Intent()));
                        }
                        cf1Var.OooOOo0(o0oooooo);
                        return;
                    }
                }
                break;
            case 1:
                ((s1) obj2).OooOOOO((List) obj);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = Boolean.TRUE;
                yn1 yn1Var = ((t1) obj2).Ooooo00;
                if (bool != bool2) {
                    ((LinearLayout) yn1Var.OooOO0).setVisibility(8);
                    break;
                } else {
                    ((LinearLayout) yn1Var.OooOO0).setVisibility(0);
                    break;
                }
            case 3:
                e2 e2Var = (e2) obj2;
                Toast toast = e2Var.OooO0o;
                if (toast != null) {
                    toast.cancel();
                }
                if (obj != null) {
                    Toast toastMakeText = Toast.makeText(e2Var.OooO00o, String.valueOf(obj), 0);
                    e2Var.OooO0o = toastMakeText;
                    toastMakeText.show();
                    break;
                }
                break;
            case 4:
                o0oO0O0o o0oo0o0o = (o0oO0O0o) obj;
                if (o0oo0o0o.OooO0Oo == -1 && (packageInfo = (PackageInfo) o0oo0o0o.OooO0o0.getParcelableExtra(sn2.OooO00o("8b+NTFKGWw==\n", "gd7uJzPhPkM=\n"))) != null) {
                    ((a9) obj2).OooO0o0.OooOO0(packageInfo.applicationInfo);
                    break;
                }
                break;
            case 5:
                o0oO0O0o o0oo0o0o2 = (o0oO0O0o) obj;
                if (o0oo0o0o2.OooO0Oo == -1 && (intent = o0oo0o0o2.OooO0o0) != null) {
                    ((a9) ((k1) obj2).OooO0o0).OooO0o0.OooOO0(intent.getExtras().getParcelable(sn2.OooO00o("D1M0lA==\n", "azJA9WdNjoQ=\n")));
                    break;
                }
                break;
            case 6:
                o0oO0O0o o0oo0o0o3 = (o0oO0O0o) obj;
                sl slVar = ((a9) obj2).OooO0o0;
                if (o0oo0o0o3.OooO0Oo == -1 && (intent2 = o0oo0o0o3.OooO0o0) != null && (data = intent2.getData()) != null) {
                    Intent intent3 = new Intent(sn2.OooO00o("kLCVxfyt35OctpzF/qLWhIG+1or+t9KOnfG7udKT\n", "89/4653Du+E=\n"));
                    intent3.setDataAndType(data, sn2.OooO00o("LFfFBFjdjQ==\n", "RTqkYz3yp08=\n"));
                    intent3.putExtra(sn2.OooO00o("IknpscM=\n", "USqI3aYBIfM=\n"), false);
                    intent3.putExtra(sn2.OooO00o("9Ep0dGYgl4/hZ3B9ZxCD\n", "hykVGAN158Y=\n"), false);
                    intent3.putExtra(sn2.OooO00o("Z72/dQxK18l2qrNx\n", "BM/QBXwvs+Q=\n"), true);
                    intent3.putExtra(sn2.OooO00o("8ru4akzelg==\n", "k8jIDy+qzp4=\n"), 1);
                    intent3.putExtra(sn2.OooO00o("DAO8+cO5wg==\n", "bXDMnKDNm94=\n"), 1);
                    intent3.putExtra(sn2.OooO00o("c5PVfvALXA==\n", "HOahDoV/BJo=\n"), 256);
                    intent3.putExtra(sn2.OooO00o("TVrYH7F2mw==\n", "Ii+sb8QCwkM=\n"), 256);
                    intent3.putExtra(sn2.OooO00o("PwAqz5AZl+osET8=\n", "TWVeuuJ3uo4=\n"), true);
                    slVar.OooOo00.OooOo(intent3).OooO0o0(slVar.OooOo00, new k1(this, 5));
                    break;
                }
                break;
            case 7:
                er erVar = (er) obj2;
                if (((hm0) obj) != null && erVar.OooooOO) {
                    View viewOoooO00 = erVar.OoooO00();
                    if (viewOoooO00.getParent() != null) {
                        qa.OooO0o("DialogFragment can not be attached to a container view");
                        break;
                    } else if (erVar.OoooooO != null) {
                        if (k20.Oooo000(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + erVar.OoooooO);
                        }
                        erVar.OoooooO.setContentView(viewOoooO00);
                        break;
                    }
                }
                break;
            case 8:
                if (((Integer) obj).intValue() == -1) {
                    k30 k30Var = (k30) ((k1) obj2).OooO0o0;
                    l30 l30Var = k30Var.OooO0o;
                    l30Var.Ooooo00.OooO0oo(k30Var.OooO0o0.OooO0oo, 10000L, l30Var.OooOOOo(), new q5(l30Var, l30Var.OoooOOO().OooOoOO(), i3));
                    break;
                }
                break;
            case 9:
                l30 l30Var2 = ((k30) obj2).OooO0o;
                if (!((wa1) obj).OooO0Oo()) {
                    ar arVar = new ar();
                    new AlertDialog.Builder(l30Var2.Oooo()).setMessage(R.string.banner_vip_redeem_less).setCancelable(false).setPositiveButton(R.string.banner_gowatch, arVar).setNegativeButton(R.string.negative, arVar).setOnCancelListener(arVar).create().show();
                    arVar.OooO0o0(l30Var2.OooOOOo(), new k1(this, i2));
                    break;
                } else {
                    e2.OooO0Oo(sn2.OooO00o("Q4iX2U6LsB1kjpDZWJU=\n", "Ee3zvCvmkE4=\n"));
                    l30Var2.Oooo0oO().recreate();
                    break;
                }
            case 10:
                ((s1) obj2).OooOOOO((List) obj);
                break;
            case 11:
                ((l80) obj2).OooO0o0.Ooooo0o.OooO0O0();
                break;
            case 12:
                y50 y50Var = (y50) obj2;
                o0OOOO0o.OooO0OO.OooO0O0.OooOO0O(this);
                if (!((Boolean) obj).booleanValue()) {
                    y50Var.OooO0oO = 0;
                    y50Var.OooO0o0.OooOOOO();
                    break;
                } else {
                    Log.e(y50Var.OooO0o, "onRequestLoadAd");
                    if (y50Var.OooO0oO < 2) {
                        oO000 oo000 = new oO000(new oO0000o0(0));
                        if (y50Var.OooOO0o == null) {
                            oO0Oo0oo oo0oo0oo = new oO0Oo0oo(y50Var.OooOO0);
                            oo0oo0oo.setAdUnitId(y50Var.OooO.OooO00o);
                            oo0oo0oo.setAdSize(y50Var.OooOOO0);
                            oo0oo0oo.setAdListener(new x50(y50Var));
                            y50Var.OooOO0O.OooO0o().OooO0OO(y50Var);
                            y50Var.OooOO0o = oo0oo0oo;
                        }
                        y50Var.OooOO0o.OooO0O0(oo000);
                        break;
                    }
                }
                break;
            case 13:
                ((d01) obj2).OooO0O0();
                break;
            case 14:
                ((yu1) obj2).OooOO0O.OooOO0(null);
                break;
            default:
                Integer num = (Integer) obj;
                wu1 wu1Var = (wu1) obj2;
                int i4 = wu1Var.OooOOO;
                String str = wu1Var.OooO0o0;
                try {
                    if (num.intValue() == -1) {
                        a02.OooO0oo.OooOO0O(i4, str);
                    } else if (num.intValue() == -2) {
                        a02.OooO0oo.OooO0oo(i4, str);
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
