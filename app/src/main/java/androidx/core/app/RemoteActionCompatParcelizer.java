package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.cmaster.cloner.ns1;
import com.cmaster.cloner.os1;
import com.cmaster.cloner.ps1;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ns1 ns1Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        ps1 ps1VarOooO0oO = remoteActionCompat.OooO00o;
        boolean z = true;
        if (ns1Var.OooO0o0(1)) {
            ps1VarOooO0oO = ns1Var.OooO0oO();
        }
        remoteActionCompat.OooO00o = (IconCompat) ps1VarOooO0oO;
        CharSequence charSequence = remoteActionCompat.OooO0O0;
        if (ns1Var.OooO0o0(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((os1) ns1Var).OooO0o0);
        }
        remoteActionCompat.OooO0O0 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.OooO0OO;
        if (ns1Var.OooO0o0(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((os1) ns1Var).OooO0o0);
        }
        remoteActionCompat.OooO0OO = charSequence2;
        remoteActionCompat.OooO0Oo = (PendingIntent) ns1Var.OooO0o(remoteActionCompat.OooO0Oo, 4);
        boolean z2 = remoteActionCompat.OooO0o0;
        if (ns1Var.OooO0o0(5)) {
            z2 = ((os1) ns1Var).OooO0o0.readInt() != 0;
        }
        remoteActionCompat.OooO0o0 = z2;
        boolean z3 = remoteActionCompat.OooO0o;
        if (!ns1Var.OooO0o0(6)) {
            z = z3;
        } else if (((os1) ns1Var).OooO0o0.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.OooO0o = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, ns1 ns1Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ns1Var.getClass();
        IconCompat iconCompat = remoteActionCompat.OooO00o;
        ns1Var.OooO0oo(1);
        ns1Var.OooO(iconCompat);
        CharSequence charSequence = remoteActionCompat.OooO0O0;
        ns1Var.OooO0oo(2);
        Parcel parcel = ((os1) ns1Var).OooO0o0;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.OooO0OO;
        ns1Var.OooO0oo(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.OooO0Oo;
        ns1Var.OooO0oo(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.OooO0o0;
        ns1Var.OooO0oo(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.OooO0o;
        ns1Var.OooO0oo(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
