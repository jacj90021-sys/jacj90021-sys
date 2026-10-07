package com.cmaster.cloner;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b5 {
    public final long OooO00o;

    public b5(long j) {
        this.OooO00o = j;
    }

    public static b5 OooO00o(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new b5(Long.parseLong(jsonReader.nextString())) : new b5(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof b5) && this.OooO00o == ((b5) obj).OooO00o;
    }

    public final int hashCode() {
        long j = this.OooO00o;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.OooO00o + "}";
    }
}
