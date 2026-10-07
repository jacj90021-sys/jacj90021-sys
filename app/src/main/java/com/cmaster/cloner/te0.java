package com.cmaster.cloner;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public interface te0 extends IInterface {
    Account[] OooO0O0(int i, String str);

    Map OooO0o(int i, Account account);

    void OooOO0o(int i, IBinder iBinder, Account account, boolean z);

    String OooOOOo(int i, Account account, String str);

    void OooOoo0(int i, IBinder iBinder, Account account, String str, boolean z, Bundle bundle);

    void OoooO(int i, String str, String str2);

    void OoooO0O(int i, Account account);

    boolean Ooooo00(int i, int i2, Account account, String str);

    void Ooooo0o(int i, IBinder iBinder, String str, String[] strArr);

    void OooooO0(int i, IBinder iBinder, Account account, Bundle bundle, boolean z);

    boolean Oooooo0(int i, String str);

    boolean o000000(int i, Account account, String str, Bundle bundle);

    void o0000OO(int i, Account account, String str, String str2);

    Account[] o0000Ooo(int i);

    String o000O00O(int i, Account account);

    void o000OoO(int i, Account account, String str);

    boolean o000Ooo(int i, Account account);

    String o000o000(int i, Account account, String str);

    int o000o00o(int i, Account account, String str);

    void o000oo00(int i, IBinder iBinder, String str, String str2);

    void o000oo0o(int i, Account account, String str, String str2);

    boolean o000ooO(int i, Account account, String str, Bundle bundle, Map map);

    void o000oooO(int i, IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle);

    void o00oO0o(int i, IBinder iBinder, Account account, String str, boolean z, boolean z2, Bundle bundle);

    void o00ooo(int i, IBinder iBinder, String str, boolean z);

    AuthenticatorDescription[] o0OO00O(int i);

    void o0OOO0o(int i, IBinder iBinder, Account account, String[] strArr);

    Map o0OoOo0(int i, String str, String str2);

    String o0ooOO0(int i, Account account);

    void o0ooOOo(int i, IBinder iBinder, Account account, String str);

    boolean ooOO(int i, Account account);
}
