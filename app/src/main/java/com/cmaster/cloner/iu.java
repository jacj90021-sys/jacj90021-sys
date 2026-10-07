package com.cmaster.cloner;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class iu implements qa1, zv, ly, oy0, h51, us1, gb1, ig, qo1 {
    public final /* synthetic */ int OooO0Oo;
    public static final iu OooO0o0 = new iu(1);
    public static final iu OooO0o = new iu(2);

    public /* synthetic */ iu(int i) {
        this.OooO0Oo = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean OooO0OO(com.cmaster.cloner.xu r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.iu.OooO0OO(com.cmaster.cloner.xu, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // com.cmaster.cloner.us1
    public void OooO(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(new ts1((ByteBuffer) obj));
    }

    @Override // com.cmaster.cloner.us1
    public void OooO00o(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(new ts1((ByteBuffer) obj));
    }

    @Override // com.cmaster.cloner.h51
    public void OooO0O0() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // com.cmaster.cloner.ly
    public void OooO0Oo(Object obj) {
        ((List) obj).clear();
    }

    @Override // com.cmaster.cloner.ig
    public Object OooO0o0(ab1 ab1Var) {
        switch (this.OooO0Oo) {
            case 16:
                return new uq2((au0) ab1Var.OooO00o(au0.class));
            default:
                return new je(0);
        }
    }

    @Override // com.cmaster.cloner.h51
    public void OooO0oo(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // com.cmaster.cloner.qa1
    public fa1 OooOO0(fa1 fa1Var, xz0 xz0Var) {
        return fa1Var;
    }

    @Override // com.cmaster.cloner.zv
    public boolean OooOO0O(Object obj, File file, xz0 xz0Var) throws Throwable {
        try {
            ba.OooO0Oo((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }

    @Override // com.cmaster.cloner.oy0
    public qz1 OooOOO(View view, qz1 qz1Var) {
        switch (this.OooO0Oo) {
            case 9:
                zg0 zg0VarOooO0o = qz1Var.OooO00o.OooO0o(2);
                view.setPadding(zg0VarOooO0o.OooO00o, zg0VarOooO0o.OooO0O0, zg0VarOooO0o.OooO0OO, zg0VarOooO0o.OooO0Oo);
                break;
            default:
                zg0 zg0VarOooO0o2 = qz1Var.OooO00o.OooO0o(2);
                view.setPadding(zg0VarOooO0o2.OooO00o, zg0VarOooO0o2.OooO0O0, zg0VarOooO0o2.OooO0OO, zg0VarOooO0o2.OooO0Oo);
                break;
        }
        return qz1Var;
    }

    @Override // com.cmaster.cloner.qo1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // com.cmaster.cloner.gb1
    public int getAmount() {
        return 1;
    }

    @Override // com.cmaster.cloner.gb1
    public String getType() {
        return "";
    }
}
