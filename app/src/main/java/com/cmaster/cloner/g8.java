package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g8 implements la1 {
    public final jp0 OooO0Oo;
    public static final tz0 OooO0o0 = tz0.OooO00o(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final tz0 OooO0o = new tz0("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, tz0.OooO0o0);

    public g8(jp0 jp0Var) {
        this.OooO0Oo = jp0Var;
    }

    @Override // com.cmaster.cloner.la1
    public final int OooO0o(xz0 xz0Var) {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    @Override // com.cmaster.cloner.zv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOO0O(java.lang.Object r9, java.io.File r10, com.cmaster.cloner.xz0 r11) throws java.lang.Throwable {
        /*
            r8 = this;
            com.cmaster.cloner.fa1 r9 = (com.cmaster.cloner.fa1) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            com.cmaster.cloner.tz0 r1 = com.cmaster.cloner.g8.OooO0o
            java.lang.Object r2 = r11.OooO0OO(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r3 = com.cmaster.cloner.cp0.OooO0O0
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            com.cmaster.cloner.tz0 r5 = com.cmaster.cloner.g8.OooO0o0
            java.lang.Object r5 = r11.OooO0OO(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            com.cmaster.cloner.jp0 r8 = r8.OooO0Oo
            if (r8 == 0) goto L4f
            com.cmaster.cloner.k9 r10 = new com.cmaster.cloner.k9     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r10.<init>(r7, r8)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r6 = r10
            goto L50
        L49:
            r8 = move-exception
            r6 = r7
            goto Lb9
        L4c:
            r8 = move-exception
            r6 = r7
            goto L5e
        L4f:
            r6 = r7
        L50:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r6.close()     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r6.close()     // Catch: java.io.IOException -> L59 java.lang.Throwable -> Lbf
        L59:
            r8 = 1
            goto L70
        L5b:
            r8 = move-exception
            goto Lb9
        L5d:
            r8 = move-exception
        L5e:
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> L5b
            if (r10 == 0) goto L6a
            java.lang.String r10 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r10, r8)     // Catch: java.lang.Throwable -> L5b
        L6a:
            if (r6 == 0) goto L6f
            r6.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> Lbf
        L6f:
            r8 = 0
        L70:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)
            if (r10 == 0) goto Lb8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r5 = "Compressed with type: "
            r10.<init>(r5)
            r10.append(r2)
            java.lang.String r2 = " of size "
            r10.append(r2)
            int r2 = com.cmaster.cloner.pr1.OooO0OO(r9)
            r10.append(r2)
            java.lang.String r2 = " in "
            r10.append(r2)
            double r2 = com.cmaster.cloner.cp0.OooO00o(r3)
            r10.append(r2)
            java.lang.String r2 = ", options format: "
            r10.append(r2)
            java.lang.Object r11 = r11.OooO0OO(r1)
            r10.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)
            boolean r9 = r9.hasAlpha()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.util.Log.v(r0, r9)
        Lb8:
            return r8
        Lb9:
            if (r6 == 0) goto Lc1
            r6.close()     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            goto Lc1
        Lbf:
            r8 = move-exception
            throw r8
        Lc1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.g8.OooOO0O(java.lang.Object, java.io.File, com.cmaster.cloner.xz0):boolean");
    }
}
