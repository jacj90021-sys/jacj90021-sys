package com.cmaster.cloner;

import android.util.JsonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uk1 implements av2 {
    public final /* synthetic */ int OooO0Oo;
    public final String OooO0o0;

    public /* synthetic */ uk1(String str, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = str;
    }

    @Override // com.cmaster.cloner.av2
    public void OooO0oO(JsonWriter jsonWriter) throws IOException {
        Object obj = fx2.OooO0O0;
        jsonWriter.name("params").beginObject();
        String str = this.OooO0o0;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 0:
                return "<" + this.OooO0o0 + '>';
            default:
                return super.toString();
        }
    }
}
