package com.cmaster.cloner;

import android.app.Notification;
import android.content.AttributionSource;
import android.content.ClipData;
import android.content.pm.ApkChecksum;
import android.graphics.fonts.Font;
import android.os.Parcelable;
import android.view.ContentInfo;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class t8 {
    public static /* bridge */ /* synthetic */ AttributionSource OooO(Object obj) {
        return (AttributionSource) obj;
    }

    public static /* bridge */ /* synthetic */ AttributionSource OooO0oo(Parcelable parcelable) {
        return (AttributionSource) parcelable;
    }

    public static /* bridge */ /* synthetic */ ApkChecksum OooOO0O(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* synthetic */ Font.Builder OooOOO0(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder OooOOOo(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo OooOOo(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ Class OooOo00() {
        return AttributionSource.class;
    }

    public static /* bridge */ /* synthetic */ boolean OooOoO(Parcelable parcelable) {
        return parcelable instanceof AttributionSource;
    }

    public static /* bridge */ /* synthetic */ Class OooOooO() {
        return Notification.CallStyle.class;
    }
}
