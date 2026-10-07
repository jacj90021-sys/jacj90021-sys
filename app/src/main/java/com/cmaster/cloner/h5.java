package com.cmaster.cloner;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h5 {
    public final int[] OooO;
    public final int[][] OooO0o;
    public final int[][] OooO0oO;
    public final int[][] OooO0oo;
    public final int[] OooOO0;
    public final char[] OooOO0O;
    public final char[][] OooOO0o;
    public int[] OooOOO;
    public final byte[] OooOOO0;
    public final byte[] OooOOOO;
    public final boolean[] OooO00o = new boolean[256];
    public final byte[] OooO0O0 = new byte[256];
    public final byte[] OooO0OO = new byte[18002];
    public final byte[] OooO0Oo = new byte[18002];
    public final int[] OooO0o0 = new int[256];

    public h5(int i) {
        Class cls = Integer.TYPE;
        this.OooO0o = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.OooO0oO = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.OooO0oo = (int[][]) Array.newInstance((Class<?>) cls, 6, 258);
        this.OooO = new int[6];
        this.OooOO0 = new int[257];
        this.OooOO0O = new char[256];
        this.OooOO0o = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 6, 258);
        this.OooOOO0 = new byte[6];
        this.OooOOOO = new byte[i * 100000];
    }
}
