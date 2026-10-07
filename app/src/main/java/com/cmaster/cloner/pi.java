package com.cmaster.cloner;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pi implements oi, qi {
    public Bundle OooO;
    public final /* synthetic */ int OooO0Oo = 0;
    public int OooO0o;
    public ClipData OooO0o0;
    public int OooO0oO;
    public Uri OooO0oo;

    public pi(pi piVar) {
        ClipData clipData = piVar.OooO0o0;
        clipData.getClass();
        this.OooO0o0 = clipData;
        int i = piVar.OooO0o;
        if (i < 0) {
            Locale locale = Locale.US;
            ra.OooOOO("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            ra.OooOOO("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.OooO0o = i;
        int i2 = piVar.OooO0oO;
        if ((i2 & 1) == i2) {
            this.OooO0oO = i2;
            this.OooO0oo = piVar.OooO0oo;
            this.OooO = piVar.OooO;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // com.cmaster.cloner.qi
    public ClipData OooO0OO() {
        return this.OooO0o0;
    }

    @Override // com.cmaster.cloner.oi
    public void OooOOO(Uri uri) {
        this.OooO0oo = uri;
    }

    @Override // com.cmaster.cloner.oi
    public void OooOOOo(int i) {
        this.OooO0oO = i;
    }

    @Override // com.cmaster.cloner.qi
    public int OooOOo() {
        return this.OooO0oO;
    }

    @Override // com.cmaster.cloner.qi
    public int OooOo() {
        return this.OooO0o;
    }

    @Override // com.cmaster.cloner.qi
    public ContentInfo OooOo0() {
        return null;
    }

    @Override // com.cmaster.cloner.oi
    public ri build() {
        return new ri(new pi(this));
    }

    @Override // com.cmaster.cloner.oi
    public void setExtras(Bundle bundle) {
        this.OooO = bundle;
    }

    public String toString() {
        String str;
        switch (this.OooO0Oo) {
            case 1:
                Uri uri = this.OooO0oo;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.OooO0o0.getDescription());
                sb.append(", source=");
                int i = this.OooO0o;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.OooO0oO;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return rj.OooO0oO(sb, this.OooO != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pi() {
    }
}
