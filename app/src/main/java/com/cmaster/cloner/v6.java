package com.cmaster.cloner;

import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class v6 extends ContentProvider {
    public static Uri OooO0O0(Uri uri) {
        try {
            return (Uri) o63.OooO00o.invoke(null, 10004, new Object[]{uri});
        } catch (Throwable unused) {
            return uri;
        }
    }

    public final ContentProviderClient OooO00o(Uri uri) {
        if (uri != null) {
            return getContext().getContentResolver().acquireContentProviderClient(uri.getAuthority());
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        t7.OooO00o = 0;
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o == null) {
            return 0;
        }
        try {
            return contentProviderClientOooO00o.bulkInsert(uriOooO0O0, contentValuesArr);
        } catch (RemoteException unused) {
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o == null) {
            return 0;
        }
        try {
            return contentProviderClientOooO00o.delete(uriOooO0O0, str, strArr);
        } catch (RemoteException unused) {
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o == null) {
            return null;
        }
        try {
            return contentProviderClientOooO00o.getType(uriOooO0O0);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o == null) {
            return null;
        }
        try {
            return contentProviderClientOooO00o.insert(uriOooO0O0, contentValues);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openAssetFile(Uri uri, String str) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o != null) {
            try {
                return contentProviderClientOooO00o.openAssetFile(uriOooO0O0, str);
            } catch (RemoteException unused) {
            }
        }
        return super.openAssetFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o != null) {
            try {
                return contentProviderClientOooO00o.openFile(uriOooO0O0, str);
            } catch (RemoteException unused) {
            }
        }
        return super.openFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o != null) {
            try {
                return Build.VERSION.SDK_INT >= 29 ? contentProviderClientOooO00o.openTypedAssetFile(uriOooO0O0, str, bundle, cancellationSignal) : contentProviderClientOooO00o.openTypedAssetFileDescriptor(uriOooO0O0, str, bundle, cancellationSignal);
            } catch (RemoteException unused) {
            }
        }
        return super.openTypedAssetFile(uri, str, bundle, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o == null) {
            return null;
        }
        try {
            return contentProviderClientOooO00o.query(uriOooO0O0, strArr, str, strArr2, str2);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o == null) {
            return 0;
        }
        try {
            return contentProviderClientOooO00o.update(uriOooO0O0, contentValues, str, strArr);
        } catch (RemoteException unused) {
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o != null) {
            try {
                return contentProviderClientOooO00o.openAssetFile(uriOooO0O0, str, cancellationSignal);
            } catch (RemoteException unused) {
            }
        }
        return super.openAssetFile(uri, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o != null) {
            try {
                return contentProviderClientOooO00o.openFile(uriOooO0O0, str, cancellationSignal);
            } catch (RemoteException unused) {
            }
        }
        return super.openFile(uri, str, cancellationSignal);
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        Uri uriOooO0O0 = OooO0O0(uri);
        ContentProviderClient contentProviderClientOooO00o = OooO00o(uriOooO0O0);
        if (contentProviderClientOooO00o != null) {
            try {
                return contentProviderClientOooO00o.openTypedAssetFileDescriptor(uriOooO0O0, str, bundle);
            } catch (RemoteException unused) {
            }
        }
        return super.openTypedAssetFile(uri, str, bundle);
    }
}
