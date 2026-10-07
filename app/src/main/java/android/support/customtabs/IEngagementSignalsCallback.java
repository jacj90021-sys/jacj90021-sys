package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public interface IEngagementSignalsCallback extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static class Default implements IEngagementSignalsCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(boolean z, Bundle bundle) {
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(boolean z, Bundle bundle) {
        }
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static abstract class Stub extends Binder implements IEngagementSignalsCallback {
        static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
        static final int TRANSACTION_onSessionEnded = 4;
        static final int TRANSACTION_onVerticalScrollEvent = 2;

        /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
        public static class Proxy implements IEngagementSignalsCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IEngagementSignalsCallback.DESCRIPTOR;
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onSessionEnded(boolean z, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onVerticalScrollEvent(boolean z, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IEngagementSignalsCallback.DESCRIPTOR);
        }

        public static IEngagementSignalsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEngagementSignalsCallback)) ? new Proxy(iBinder) : (IEngagementSignalsCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IEngagementSignalsCallback.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            } else if (i == 3) {
                onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onSessionEnded(parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onGreatestScrollPercentageIncreased(int i, Bundle bundle);

    void onSessionEnded(boolean z, Bundle bundle);

    void onVerticalScrollEvent(boolean z, Bundle bundle);
}
