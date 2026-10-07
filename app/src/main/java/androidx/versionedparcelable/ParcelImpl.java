package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.cmaster.cloner.o0O0000O;
import com.cmaster.cloner.os1;
import com.cmaster.cloner.ps1;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new o0O0000O(29);
    public final ps1 OooO0Oo;

    public ParcelImpl(Parcel parcel) {
        this.OooO0Oo = new os1(parcel).OooO0oO();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new os1(parcel).OooO(this.OooO0Oo);
    }
}
