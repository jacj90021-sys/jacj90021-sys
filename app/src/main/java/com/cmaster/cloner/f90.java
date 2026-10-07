package com.cmaster.cloner;

import android.accounts.Account;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f90 extends t2 {
    public final /* synthetic */ int OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f90(int i) {
        super(false, 4);
        this.OooO0O0 = i;
    }

    private final void OooO0Oo(yq yqVar) {
        Activity activityOooOO0;
        o00OO000 o00oo000;
        int i;
        Object[] objArr = yqVar.OooO0o;
        int iOooO00o = fn2.OooO00o(objArr, Intent.class, 1);
        if (iOooO00o < 0) {
            yqVar.OooO0oo(-91);
            return;
        }
        Intent intent = (Intent) objArr[iOooO00o];
        if (pi1.OooO00o.equals(intent.getComponent())) {
            yqVar.OooO0oo(0);
            xq xqVar = new xq(rq.OooO0O0());
            xqVar.OooO0Oo = yqVar.OooO0Oo;
            xqVar.OooO0o0 = yqVar.OooO0o0;
            xqVar.OooO0o = yqVar.OooO0o;
            pi1.OooO0O0 = xqVar;
            int iOooO0Oo = xqVar.OooO0Oo(Intent.class);
            pi1.OooO0OO = iOooO0Oo;
            int iOooO0OO = xqVar.OooO0OO(iOooO0Oo + 1, String.class);
            pi1.OooO0Oo = iOooO0OO;
            int iOooO0OO2 = xqVar.OooO0OO(iOooO0OO + 1, IBinder.class);
            pi1.OooO0o0 = iOooO0OO2;
            pi1.OooO0o = xqVar.OooO0OO(iOooO0OO2 + 1, String.class);
            pi1.OooO0oO = xqVar.OooO0OO(pi1.OooO0o0 + 2, Integer.TYPE);
            Class<?>[] parameterTypes = xqVar.OooO0o0.getParameterTypes();
            int length = parameterTypes.length - 1;
            while (true) {
                if (length < 0) {
                    i = -1;
                    break;
                } else {
                    if (parameterTypes[length] == Bundle.class) {
                        i = length;
                        break;
                    }
                    length--;
                }
            }
            pi1.OooO0oo = i;
            return;
        }
        String str = (String) objArr[iOooO00o + 1];
        int iOooO00o2 = fn2.OooO00o(objArr, IBinder.class, 2);
        IBinder iBinder = iOooO00o2 >= 0 ? (IBinder) objArr[iOooO00o2] : null;
        int iOooO00o3 = fn2.OooO00o(objArr, Bundle.class, 0);
        Bundle bundle = iOooO00o3 >= 0 ? (Bundle) objArr[iOooO00o3] : null;
        String str2 = iBinder != null ? (String) objArr[iOooO00o2 + 1] : null;
        int iIntValue = iBinder != null ? ((Integer) objArr[iOooO00o2 + 2]).intValue() : -1;
        if (TextUtils.equals(u7.OooO00o(new byte[]{99, -114, -40, 4, -50, -80, 68, 34, 113, -123, -56, 2, -56, -73, 71, 127, 44, -95, -8, 50, -2, -104, 99, 79, 77, -75, -14, 34, -2, -118, 101, 88, 86, -87, -14, 49, -14}, new byte[]{2, -32, -68, 118, -95, -39, 32, 12}), intent.getAction())) {
            int iOooO0oO = qx1.OooO0oO();
            p2 p2Var = qx1.OooO0Oo;
            int i2 = p2Var != null ? p2Var.OooO0oo : 0;
            String strOooO00o = qx1.OooO00o();
            intent.putExtra(u7.OooO00o(new byte[]{-94, 59, -98, -94, -64, 85, -110, -78, -81, 55, -102, -92, -37, 100, -109, -98, -90, 42, -108, -87}, new byte[]{-61, 88, -3, -51, -75, 59, -26, -19}), iOooO0oO);
            intent.putExtra(u7.OooO00o(new byte[]{108, -88, 90, -83, 87, 9, 71, -119, 97, -92, 94, -85, 76, 56, 80, -73, 97, -89, 80, -84, 69, 56, 67, -65, 105}, new byte[]{13, -53, 57, -62, 34, 103, 51, -42}), Process.myPid());
            intent.putExtra(u7.OooO00o(new byte[]{-15, 16, 102, 117, -35, 25, -98, 33, -4, 28, 98, 115, -58, 40, -119, 31, -4, 31, 108, 116, -49, 40, -102, 21, -9}, new byte[]{-112, 115, 5, 26, -88, 119, -22, 126}), strOooO00o);
            intent.putExtra(u7.OooO00o(new byte[]{-34, -1, 96, -125, 44, 2, -85, -121, -45, -13, 100, -123, 55, 51, -68, -71, -45, -16, 106, -126, 62, 51, -66, -88, -49, -11, 103}, new byte[]{-65, -100, 3, -20, 89, 108, -33, -40}), i2);
            new oO00O0o0(intent).OooO00o(u7.OooO00o(new byte[]{14, 54, -112, -46, -83, -22, -91, 118, 1, 60}, new byte[]{109, 89, -3, -4, -54, -123, -54, 17}));
            if (iBinder != null && iIntValue >= 0 && (o00oo000 = o0OO0oO0.OooOO0O) != null) {
                o00oo000.OooOooo(o0OO0oO0.OooO00o(), iBinder, str2, Integer.valueOf(iIntValue), 0, null);
            }
        } else {
            String action = intent.getAction();
            if (TextUtils.equals(u7.OooO00o(new byte[]{-31, 32, 27, -37, -32, 103, 35, -74, -13, 43, 11, -35, -26, 96, 32, -21, -82, 15, 60, -22, -64, 91, 9, -52, -33, 29, 38, -25, -52, 81, 20, -35, -44, 26, 54, -25, -56, 93}, new byte[]{-128, 78, 127, -87, -113, 14, 71, -104}), action) || TextUtils.equals(u7.OooO00o(new byte[]{-100, -2, 18, -93, -48, 122, -79, -91, -114, -11, 2, -91, -42, 125, -78, -8, -45, -61, 47, -97, -4, 76, -122, -50, -87, -60, 63, -97, -8, 64}, new byte[]{-3, -112, 118, -47, -65, 19, -43, -117}), action)) {
                Integer num = qx1.OooO00o;
                Context context = e92.OooO00o;
                e81 e81Var = new e81(20, false);
                e81Var.OooO0o0 = context;
                Account[] accountArrOooO0O0 = vv1.OooO00o().OooO0O0(u7.OooO00o(new byte[]{-40, -20, -49, 23, 34, -116, 49, 73, -41, -26}, new byte[]{-69, -125, -94, 57, 69, -29, 94, 46}));
                if (!fn2.OooO0o0(accountArrOooO0O0) && (activityOooOO0 = e81.OooOO0()) != null) {
                    HashMap map = new HashMap();
                    for (Account account : accountArrOooO0O0) {
                        map.put(account.name, account);
                    }
                    String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                    ListView listView = new ListView(activityOooOO0);
                    listView.setAdapter((ListAdapter) new o00O000(e81Var, activityOooOO0, strArr, map));
                    listView.setBackgroundColor(0);
                    listView.setDivider(null);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activityOooOO0);
                    builder.setTitle(u7.OooO00o(new byte[]{43, 117, -12, 52, 108, -26, -99, 16, 9, 58, -14, 48, 106, -19, -59, 23, 19, 105}, new byte[]{103, 26, -109, 83, 9, -126, -80, 121}));
                    builder.setView(listView);
                    builder.setPositiveButton(u7.OooO00o(new byte[]{-33, -31, -99, 0, -27, 26, -68, 125, -33, -26, -102, 79, -34, 17, -65}, new byte[]{-98, -123, -7, 32, -85, 127, -53, 93}), new z70(e81Var));
                    AlertDialog alertDialogShow = builder.show();
                    e81Var.OooO0o = alertDialogShow;
                    e81Var.OooOoO(alertDialogShow);
                }
            } else {
                ComponentName component = intent.getComponent();
                if (component == null || !TextUtils.equals(component.flattenToShortString(), u7.OooO00o(new byte[]{7, -92, -25, 115, -113, 80, -95, -69, 72, -85, -32, 98, -113, 76, -85, -32, 21, -28, -64, 105, -113, 86, -74, -15, 50, -77, -13, 100, -95, 87, -95, -43, 5, -87, -20, 116, -114, 77, -124, -9, 18, -93, -11, 104, -108, 64}, new byte[]{102, -54, -125, 1, -32, 57, -59, -108}))) {
                    if (TextUtils.equals(Intent.createChooser(new Intent(), "").getAction(), intent.getAction()) || TextUtils.equals(u7.OooO00o(new byte[]{-68, -80, 62, 58, 19, -92, -20, -105, -76, -80, 46, 45, 18, -71, -90, -40, -66, -86, 51, 39, 18, -29, -53, -15, -110, -111, 9, 13, 46}, new byte[]{-35, -34, 90, 72, 124, -51, -120, -71}), intent.getAction())) {
                        String strOooO0Oo = qx1.OooO0Oo();
                        String strOooO00o2 = u7.OooO00o(new byte[]{-51, -107, 39, 91, 81, 123, 113, 62, -38, -97, 56, 91, 81, 122, 127, 35, -53, -120, 100, 51, 123, 83, 92, 105, -19, -110, 37, 26, 65, 115}, new byte[]{-82, -6, 74, 117, 50, 22, 16, 77});
                        int iOooO0oO2 = qx1.OooO0oO();
                        Intent intent2 = (Intent) intent.clone();
                        intent2.setClassName(strOooO0Oo, strOooO00o2);
                        intent2.putExtra(u7.OooO00o(new byte[]{82, 66, -13, 104, 75, -125, 7, 63, 95, 78, -18, 104, 81, -126, 7, 55, 95, 94, -7, 105, 76, -56, 76, 38, 69, 88, -3, 41, 77, -107, 76, 44, 88, 78}, new byte[]{49, 42, -100, 7, 56, -26, 41, 94}), iOooO0oO2);
                        intent2.putExtra(u7.OooO00o(new byte[]{-1, -26, 80, -10, 38, -90, 105, -119, -14, -22, 77, -10, 60, -89, 105, -127, -14, -6, 90, -9, 33, -19, 34, -112, -24, -4, 94, -73, 60, -83, 51, -115, -14, -6}, new byte[]{-100, -114, 63, -103, 85, -61, 71, -24}), intent);
                        lr2.OooO00o(qx1.OooO0oO(), intent2, qx1.OooO0Oo());
                        objArr[iOooO00o] = intent2;
                        super.OooO00o(yqVar);
                        return;
                    }
                    int iOooO0oO3 = qx1.OooO0oO();
                    if (intent.getAction() != null) {
                        String action2 = intent.getAction();
                        if (TextUtils.equals(u7.OooO00o(new byte[]{-65, -21, 75, 48, 119, 114, -125, 89, -83, -32, 91, 54, 113, 117, -128, 4, -16, -60, 127, 18, 71, 85, -88, 35, -105, -61, 102, 1, 89, 79, -82, 56, -112, -38, 124, 7, 76, 79, -82, 57, -103, -42}, new byte[]{-34, -123, 47, 66, 24, 27, -25, 119}), action2) || TextUtils.equals(u7.OooO00o(new byte[]{-49, 91, 92, -12, -47, 36, -49, -32, -35, 80, 76, -14, -41, 35, -52, -67, -128, 118, 112, -57, -16, 3, -18, -126, -15, 123, 119, -46, -9, 11, -30, -115, -17, 97, 113, -55, -16, 18, -8, -117, -6, 97, 113, -56, -7, 30}, new byte[]{-82, 53, 56, -122, -66, 77, -85, -50}), action2)) {
                            String stringExtra = intent.getStringExtra(u7.OooO00o(new byte[]{50, -86, -91, -3, 12, 53, 1, 115, 35, -74, -82, -7, 10, 56, 0, 47, 125, -95, -71, -5, 17, 61, 75, 28, 3, -108, -98, -33, 34, 31, 46, 28, 20, -127}, new byte[]{83, -60, -63, -113, 99, 92, 101, 93}));
                            if (TextUtils.equals(stringExtra, qx1.OooO00o())) {
                                intent.putExtra(u7.OooO00o(new byte[]{-127, 61, -45, -11, -102, -118, 69, 21, -112, 33, -40, -15, -100, -121, 68, 73, -50, 54, -49, -13, -121, -126, 15, 122, -80, 3, -24, -41, -76, -96, 106, 122, -89, 22}, new byte[]{-32, 83, -73, -121, -11, -29, 33, 59}), qx1.OooO0Oo());
                            } else if (TextUtils.equals(qx1.OooO00o(), intent.getStringExtra(u7.OooO00o(new byte[]{-127, -45, -72, -75, -4, -88, -98, -51, -127, -60, -83}, new byte[]{-32, -93, -56, -22, -116, -55, -3, -90})))) {
                                intent.putExtra(u7.OooO00o(new byte[]{12, -101, -33, 113, 122, -53, 70, 114, 12, -116, -54}, new byte[]{109, -21, -81, 46, 10, -86, 37, 25}), qx1.OooO0Oo());
                                intent.putExtra(u7.OooO00o(new byte[]{-40, -104, 113, -72, 105, 122, 75}, new byte[]{-71, -24, 1, -25, 28, 19, 47, -1}), qx1.OooO0o);
                            }
                            String stringExtra2 = intent.getStringExtra(u7.OooO00o(new byte[]{-33, -14, 119, -9, -62, 50, 3, 43, -50, -18, 124, -13, -60, 63, 2, 119, -112, -7, 107, -15, -33, 58, 73, 70, -10, -35, 93, -53, -24, 23, 56, 76, -6}, new byte[]{-66, -100, 19, -123, -83, 91, 103, 5}));
                            if (stringExtra2 != null) {
                                intent.putExtra(u7.OooO00o(new byte[]{-44, -126, -121, -35, -5, -50, 63, 57, -59, -98, -116, -39, -3, -61, 62, 101, -101, -119, -101, -37, -26, -58, 117, 84, -3, -83, -83, -31, -47, -21, 4, 94, -15}, new byte[]{-75, -20, -29, -81, -108, -89, 91, 23}), ec0.OooOOO0(iOooO0oO3, stringExtra2, stringExtra));
                            }
                        }
                        if (intent.getScheme() != null && intent.getData() != null) {
                            String action3 = intent.getAction();
                            if (intent.getScheme().equals(u7.OooO00o(new byte[]{-55, 16, -64, -5, 76, -107, 79}, new byte[]{-71, 113, -93, -112, 45, -14, 42, -65})) && action3.startsWith(u7.OooO00o(new byte[]{9, 56, -32, -45, -73, 27, 72, -117, 27, 51, -16, -43, -79, 28, 75, -42, 70}, new byte[]{104, 86, -124, -95, -40, 114, 44, -91}))) {
                                intent.setData(Uri.parse(u7.OooO00o(new byte[]{5, -49, -38, 5, 60, 24, -88, -108}, new byte[]{117, -82, -71, 110, 93, 127, -51, -82}) + qx1.OooO0Oo()));
                            }
                        }
                    }
                    int iOooOO0 = lw1.OooO0O0().OooOO0(intent, str, iBinder, str2, iIntValue, bundle);
                    if (iOooOO0 != 1199) {
                        if (iOooOO0 == -92) {
                            intent.setComponent(new ComponentName(e92.OooO00o.getPackageName(), u7.OooO00o(new byte[]{44, -103, 92, 107, -43, 57, 8, 24, 25}, new byte[]{106, -8, 55, 14, -106, 85, 105, 107})));
                        } else {
                            yqVar.OooO0oo(Integer.valueOf(iOooOO0));
                        }
                    }
                    super.OooO00o(yqVar);
                    return;
                }
                int iOooO0oO4 = qx1.OooO0oO();
                qx1.OooO00o();
                xc xcVar = new xc();
                xcVar.OooO00o = 0;
                xcVar.OooO0o0 = null;
                xcVar.OooO0o = null;
                xcVar.OooO0oO = -1;
                xcVar.OooOO0 = false;
                xcVar.OooOO0O = new HashSet();
                xcVar.OooO0O0 = intent;
                xcVar.OooO0Oo = iOooO0oO4;
                xcVar.OooO0o0 = iBinder;
                xcVar.OooO0o = str2;
                xcVar.OooO0oO = iIntValue;
                new Handler().postDelayed(new o00OOO00(xcVar, 9), 1000L);
            }
        }
        yqVar.OooO0oo(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x069f, code lost:
    
        if (r0 != false) goto L362;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06e6  */
    @Override // com.cmaster.cloner.t2, com.cmaster.cloner.jo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooO00o(com.cmaster.cloner.yq r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 2242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.f90.OooO00o(com.cmaster.cloner.yq):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f90(String str, int i) {
        super(false, 4);
        this.OooO0O0 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f90(boolean z, int i) {
        super(z, 4);
        this.OooO0O0 = i;
    }
}
