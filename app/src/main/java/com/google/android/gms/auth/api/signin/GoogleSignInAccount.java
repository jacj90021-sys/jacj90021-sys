package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cmaster.cloner.b41;
import com.cmaster.cloner.by2;
import com.cmaster.cloner.m33;
import com.cmaster.cloner.o00000OO;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends o00000OO implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b41(19);
    public final Uri OooO;
    public final int OooO0Oo;
    public final String OooO0o;
    public final String OooO0o0;
    public final String OooO0oO;
    public final String OooO0oo;
    public String OooOO0;
    public final long OooOO0O;
    public final String OooOO0o;
    public final String OooOOO;
    public final List OooOOO0;
    public final String OooOOOO;
    public final HashSet OooOOOo = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.OooO0Oo = i;
        this.OooO0o0 = str;
        this.OooO0o = str2;
        this.OooO0oO = str3;
        this.OooO0oo = str4;
        this.OooO = uri;
        this.OooOO0 = str5;
        this.OooOO0O = j;
        this.OooOO0o = str6;
        this.OooOOO0 = arrayList;
        this.OooOOO = str7;
        this.OooOOOO = str8;
    }

    public static GoogleSignInAccount OooO00o(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        by2.OooO0o0(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.OooOO0 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.OooOO0o.equals(this.OooOO0o)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.OooOOO0);
        hashSet.addAll(googleSignInAccount.OooOOOo);
        HashSet hashSet2 = new HashSet(this.OooOOO0);
        hashSet2.addAll(this.OooOOOo);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.OooOO0o.hashCode() + 527;
        HashSet hashSet = new HashSet(this.OooOOO0);
        hashSet.addAll(this.OooOOOo);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooO0o0(parcel, 2, this.OooO0o0);
        m33.OooO0o0(parcel, 3, this.OooO0o);
        m33.OooO0o0(parcel, 4, this.OooO0oO);
        m33.OooO0o0(parcel, 5, this.OooO0oo);
        m33.OooO0Oo(parcel, 6, this.OooO, i);
        m33.OooO0o0(parcel, 7, this.OooOO0);
        m33.OooOO0o(parcel, 8, 8);
        parcel.writeLong(this.OooOO0O);
        m33.OooO0o0(parcel, 9, this.OooOO0o);
        m33.OooO(parcel, this.OooOOO0, 10);
        m33.OooO0o0(parcel, 11, this.OooOOO);
        m33.OooO0o0(parcel, 12, this.OooOOOO);
        m33.OooOO0O(iOooOO0, parcel);
    }
}
