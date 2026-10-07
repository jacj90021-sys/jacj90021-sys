package android.content;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/** Recovered framework hidden API parcel. */
public class AttributionSourceState implements Parcelable {
    public int uid;
    public android.os.PackageTagsList packageTagsList;
    public IBinder token;
    public android.content.AttributionSourceState next;

    public AttributionSourceState() {
    }

    public AttributionSourceState(Parcel in) {
        this.uid = in.readInt();
        this.packageTagsList = android.os.PackageTagsList.CREATOR.createFromParcel(in);
        this.token = in.readStrongBinder();
        this.next = (android.content.AttributionSourceState) in.readParcelable(android.content.AttributionSourceState.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.uid);
        dest.writeParcelable(this.packageTagsList, flags);
        dest.writeStrongBinder(this.token);
        dest.writeParcelable(this.next, flags);
    }

    public static final Creator<AttributionSourceState> CREATOR = new Creator<AttributionSourceState>() {
        @Override
        public AttributionSourceState createFromParcel(Parcel in) {
            return new AttributionSourceState(in);
        }

        @Override
        public AttributionSourceState[] newArray(int size) {
            return new AttributionSourceState[size];
        }
    };
}