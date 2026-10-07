package com.cmaster.cloner;

import android.database.SQLException;

public final class bh implements p30 {
    public final eh OooO0Oo;
    public final boolean OooO0o0;

    public bh(eh ehVar, boolean z) {
        this.OooO0Oo = ehVar;
        this.OooO0o0 = z;
    }

    @Override
    public final Object OooO00o() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Timed out attempting to acquire a ");
        sb2.append(this.OooO0o0 ? "reader" : "writer");
        sb2.append(" connection.");
        sb.append(sb2.toString());
        sb.append("\n\nWriter pool:\n");
        eh ehVar = this.OooO0Oo;
        ehVar.OooO0o0.OooO0Oo(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.OooO0Oo.OooO0Oo.OooO0Oo(sb);
        String sb3 = sb.toString();
        try {
            zy2.OooO0O0(5, sb3);
            throw (SQLException) null;
        } catch (SQLException e) {
            e.printStackTrace();
            return vq1.OooO00o;
        }
    }
}