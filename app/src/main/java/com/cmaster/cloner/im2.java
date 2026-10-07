package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class im2 implements qo1, k8, oy, qa1, z91, dg2, ig, b91 {
    public static final im2 OooO0Oo = new im2();
    public static final /* synthetic */ im2 OooO0o0 = new im2();

    @Override // com.cmaster.cloner.k8
    public Bitmap OooO00o(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.cmaster.cloner.k8
    public void OooO0O0(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.cmaster.cloner.oy
    public py OooO0OO(float f, float f2, float f3) {
        float f4 = ((f3 - f2) * 0.35f) + f2;
        return new py(dp1.OooO0o0(f2, f4, f, 255, 0), dp1.OooO0o0(f4, f3, f, 0, 255), false);
    }

    @Override // com.cmaster.cloner.k8
    public Bitmap OooO0Oo(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.cmaster.cloner.k8
    public void OooO0o(int i) {
    }

    @Override // com.cmaster.cloner.ig
    public Object OooO0o0(ab1 ab1Var) {
        return new jm2((uq2) ab1Var.OooO00o(uq2.class), (ox) ab1Var.OooO00o(ox.class), (au0) ab1Var.OooO00o(au0.class));
    }

    @Override // com.cmaster.cloner.k8
    public void OooO0oO() {
    }

    public boolean OooO0oo(CharSequence charSequence) {
        return charSequence instanceof z31;
    }

    @Override // com.cmaster.cloner.qa1
    public fa1 OooOO0(fa1 fa1Var, xz0 xz0Var) {
        aa aaVar;
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((d50) ((x40) fa1Var.get()).OooO0Oo.OooO0O0).OooO00o.OooO0Oo.asReadOnlyBuffer();
        AtomicReference atomicReference = ba.OooO00o;
        if (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) {
            aaVar = null;
        } else {
            aaVar = new aa(byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit(), byteBufferAsReadOnlyBuffer.array());
        }
        if (aaVar != null && aaVar.OooO0Oo == 0 && aaVar.OooO0o0 == ((byte[]) aaVar.OooO0o).length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new oO0O0Oo0(bArrArray);
    }

    @Override // com.cmaster.cloner.b91
    public void accept(Object obj, Object obj2) {
        gm2 gm2Var = (gm2) ((fe2) obj).getService();
        m23 m23Var = new m23((yl1) obj2);
        gm2Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = db2.OooO00o;
        parcelObtain.writeInt(1);
        m33.OooOO0O(m33.OooOO0(20293, parcelObtain), parcelObtain);
        parcelObtain.writeStrongBinder(m23Var);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            gm2Var.OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // com.cmaster.cloner.qo1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // com.cmaster.cloner.lg2
    public Object zza() {
        return new u32();
    }
}
