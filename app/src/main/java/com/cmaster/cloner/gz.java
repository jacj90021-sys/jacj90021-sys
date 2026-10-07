package com.cmaster.cloner;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gz implements XmlSerializer {
    public static final String[] OooOO0O = {u7.OooO00o(new byte[]{-108, 37, -112, 93}, new byte[]{-78, 6, -96, 102, 86, 126, 61, -29}), u7.OooO00o(new byte[]{48, 18, 87, -37}, new byte[]{22, 49, 102, -32, -96, -107, 88, -57}), u7.OooO00o(new byte[]{-75, -106, -35, 124}, new byte[]{-109, -75, -17, 71, -41, 69, 60, -81}), u7.OooO00o(new byte[]{-55, 86, 54, 4}, new byte[]{-17, 117, 5, 63, -120, -85, 40, 89}), u7.OooO00o(new byte[]{-7, -19, -49, 73}, new byte[]{-33, -50, -5, 114, 11, -12, -84, -109}), u7.OooO00o(new byte[]{-34, 1, -38, -68}, new byte[]{-8, 34, -17, -121, -118, 121, -65, 81}), u7.OooO00o(new byte[]{79, 17, -95, -5}, new byte[]{105, 50, -105, -64, -116, 80, -122, 35}), u7.OooO00o(new byte[]{-84, -52, 19, 117}, new byte[]{-118, -17, 36, 78, 117, -9, 123, 77}), u7.OooO00o(new byte[]{1, 121, 126, 38}, new byte[]{39, 90, 70, 29, -5, -86, -115, 50}), u7.OooO00o(new byte[]{77, 2, -22, -39}, new byte[]{107, 33, -45, -30, 110, 21, 19, 29}), u7.OooO00o(new byte[]{-77, 61, 89, 94, 120}, new byte[]{-107, 30, 104, 110, 67, -38, 44, -80}), u7.OooO00o(new byte[]{112, -41, -44, 13, -62}, new byte[]{86, -12, -27, 60, -7, -63, 34, -61}), u7.OooO00o(new byte[]{-125, 119, -81, -49, -119}, new byte[]{-91, 84, -98, -3, -78, -47, -127, 115}), u7.OooO00o(new byte[]{73, -115, 60, 80, 10}, new byte[]{111, -82, 13, 99, 49, 33, 87, -47}), u7.OooO00o(new byte[]{-96, 115, 95, -73, -76}, new byte[]{-122, 80, 110, -125, -113, -98, -63, -2}), u7.OooO00o(new byte[]{42, -92, 42, 122, 115}, new byte[]{12, -121, 27, 79, 72, 108, 66, 94}), u7.OooO00o(new byte[]{-38, 59, -112, -43, -17}, new byte[]{-4, 24, -95, -29, -44, 34, 70, 38}), u7.OooO00o(new byte[]{-38, -86, -128, 9, -49}, new byte[]{-4, -119, -79, 62, -12, -92, 110, 39}), u7.OooO00o(new byte[]{-104, 20, 126, -120, 104}, new byte[]{-66, 55, 79, -80, 83, 41, -127, -39}), u7.OooO00o(new byte[]{-107, 84, 32, -116, -10}, new byte[]{-77, 119, 17, -75, -51, -35, -21, 20}), u7.OooO00o(new byte[]{27, -79, -78, 38, -102}, new byte[]{61, -110, -128, 22, -95, 57, 81, 21}), u7.OooO00o(new byte[]{118, -77, -79, 47, 105}, new byte[]{80, -112, -125, 30, 82, -128, 88, -53}), u7.OooO00o(new byte[]{91, -110, 64, -98, 69}, new byte[]{125, -79, 114, -84, 126, 26, 59, 115}), u7.OooO00o(new byte[]{-73, 115, -76, 23, -34}, new byte[]{-111, 80, -122, 36, -27, 47, -52, 10}), u7.OooO00o(new byte[]{-23, 56, -103, -128, -8}, new byte[]{-49, 27, -85, -76, -61, -109, -102, -117}), u7.OooO00o(new byte[]{2, 75, 33, -104, 121}, new byte[]{36, 104, 19, -83, 66, 108, -36, -6}), u7.OooO00o(new byte[]{122, -64, 84, -67, -43}, new byte[]{92, -29, 102, -117, -18, 70, 117, 98}), u7.OooO00o(new byte[]{117, -93, -115, 69, 40}, new byte[]{83, -128, -65, 114, 19, -57, -40, -95}), u7.OooO00o(new byte[]{-127, 27, 58, 30, 67}, new byte[]{-89, 56, 8, 38, 120, 40, 24, 53}), u7.OooO00o(new byte[]{-4, 100, -66, -20, -70}, new byte[]{-38, 71, -116, -43, -127, -117, -19, 17}), u7.OooO00o(new byte[]{34, -116, 122, 42, 118}, new byte[]{4, -81, 73, 26, 77, -124, 94, -14}), u7.OooO00o(new byte[]{-1, -101, 30, -93, -75}, new byte[]{-39, -72, 45, -110, -114, -102, 123, 99}), null, null, u7.OooO00o(new byte[]{99, 120, 25, 84, -126, 14}, new byte[]{69, 9, 108, 59, -10, 53, 51, -89}), null, null, null, u7.OooO00o(new byte[]{34, 79, -76, -123, 37}, new byte[]{4, 46, -39, -11, 30, -125, -124, -1}), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, u7.OooO00o(new byte[]{-100, -38, -18, -40}, new byte[]{-70, -74, -102, -29, 84, 24, 49, 91}), null, u7.OooO00o(new byte[]{10, -41, 104, -12}, new byte[]{44, -80, 28, -49, -19, 49, -20, 89}), null};
    public static final String OooOO0o = "                                                              ";
    public int OooO0O0;
    public Writer OooO0OO;
    public OutputStream OooO0Oo;
    public CharsetEncoder OooO0o0;
    public boolean OooO0oo;
    public boolean OooO0oO = false;
    public int OooO = 0;
    public boolean OooOO0 = true;
    public final char[] OooO00o = new char[UnixStat.FILE_FLAG];
    public final ByteBuffer OooO0o = ByteBuffer.allocate(UnixStat.FILE_FLAG);

    public final void OooO00o(char c) throws IOException {
        int i = this.OooO0O0;
        if (i >= 32767) {
            flush();
            i = this.OooO0O0;
        }
        this.OooO00o[i] = c;
        this.OooO0O0 = i + 1;
    }

    public final void OooO0O0(int i, int i2, String str) throws IOException {
        if (i2 > 32768) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + UnixStat.FILE_FLAG;
                OooO0O0(i, i4 < i3 ? 32768 : i3 - i, str);
                i = i4;
            }
            return;
        }
        int i5 = this.OooO0O0;
        if (i5 + i2 > 32768) {
            flush();
            i5 = this.OooO0O0;
        }
        str.getChars(i, i + i2, this.OooO00o, i5);
        this.OooO0O0 = i5 + i2;
    }

    public final void OooO0OO(char[] cArr, int i, int i2) throws IOException {
        if (i2 > 32768) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + UnixStat.FILE_FLAG;
                OooO0OO(cArr, i, i4 < i3 ? 32768 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.OooO0O0;
        if (i5 + i2 > 32768) {
            flush();
            i5 = this.OooO0O0;
        }
        System.arraycopy(cArr, i, this.OooO00o, i5, i2);
        this.OooO0O0 = i5 + i2;
    }

    public final void OooO0Oo(String str) throws IOException {
        String str2;
        int length = str.length();
        String[] strArr = OooOO0O;
        char length2 = (char) strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < length2 && (str2 = strArr[cCharAt]) != null) {
                if (i2 < i) {
                    OooO0O0(i2, i - i2, str);
                }
                i2 = i + 1;
                OooO0O0(0, str2.length(), str2);
            }
            i++;
        }
        if (i2 < i) {
            OooO0O0(i2, i - i2, str);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        OooO00o(' ');
        if (str != null) {
            OooO0O0(0, str.length(), str);
            OooO00o(':');
        }
        OooO0O0(0, str2.length(), str2);
        String strOooO00o = u7.OooO00o(new byte[]{-83, 102}, new byte[]{-112, 68, 7, 58, 66, 34, -57, -104});
        OooO0O0(0, strOooO00o.length(), strOooO00o);
        OooO0Oo(str3);
        OooO00o('\"');
        this.OooOO0 = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        int i = this.OooO - 1;
        this.OooO = i;
        if (this.OooO0oo) {
            String strOooO00o = u7.OooO00o(new byte[]{-32, -84, -46, -16}, new byte[]{-64, -125, -20, -6, 82, -57, 72, 100});
            OooO0O0(0, strOooO00o.length(), strOooO00o);
        } else {
            if (this.OooO0oO && this.OooOO0) {
                int length = i * 4;
                String str3 = OooOO0o;
                if (length > str3.length()) {
                    length = str3.length();
                }
                OooO0O0(0, length, str3);
            }
            String strOooO00o2 = u7.OooO00o(new byte[]{-108, -126}, new byte[]{-88, -83, -48, 7, -127, -96, -34, -105});
            OooO0O0(0, strOooO00o2.length(), strOooO00o2);
            if (str != null) {
                OooO0O0(0, str.length(), str);
                OooO00o(':');
            }
            OooO0O0(0, str2.length(), str2);
            String strOooO00o3 = u7.OooO00o(new byte[]{-11, -65}, new byte[]{-53, -75, 111, -43, 54, -51, -103, -109});
            OooO0O0(0, strOooO00o3.length(), strOooO00o3);
        }
        this.OooOO0 = true;
        this.OooO0oo = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        int i = this.OooO0O0;
        if (i > 0) {
            OutputStream outputStream = this.OooO0Oo;
            char[] cArr = this.OooO00o;
            if (outputStream != null) {
                CharBuffer charBufferWrap = CharBuffer.wrap(cArr, 0, i);
                CharsetEncoder charsetEncoder = this.OooO0o0;
                ByteBuffer byteBuffer = this.OooO0o;
                CoderResult coderResultEncode = charsetEncoder.encode(charBufferWrap, byteBuffer, true);
                while (!coderResultEncode.isError()) {
                    if (coderResultEncode.isOverflow()) {
                        int iPosition = byteBuffer.position();
                        if (iPosition > 0) {
                            byteBuffer.flip();
                            this.OooO0Oo.write(byteBuffer.array(), 0, iPosition);
                            byteBuffer.clear();
                        }
                        coderResultEncode = this.OooO0o0.encode(charBufferWrap, byteBuffer, true);
                    } else {
                        int iPosition2 = byteBuffer.position();
                        if (iPosition2 > 0) {
                            byteBuffer.flip();
                            this.OooO0Oo.write(byteBuffer.array(), 0, iPosition2);
                            byteBuffer.clear();
                        }
                        this.OooO0Oo.flush();
                    }
                }
                throw new IOException(coderResultEncode.toString());
            }
            this.OooO0OO.write(cArr, 0, i);
            this.OooO0OO.flush();
            this.OooO0O0 = 0;
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if (!str.equals(u7.OooO00o(new byte[]{-33, -78, 125, 72, -125, 26, 92, -58, -38, -86, 121, 77, -43, 89, 93, -47, -59, -95, 38, 78, -120, 26, 23, -47, -44, -23, 111, 93, -40, 65, 6, -52, -46, -75, 39, 80, -51, 88, 31, -99, -34, -88, 109, 93, -41, 65, 94, -47, -62, -78, 121, 77, -51}, new byte[]{-73, -58, 9, 56, -71, 53, 115, -66}))) {
            throw new UnsupportedOperationException();
        }
        this.OooO0oO = true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) throws UnsupportedEncodingException {
        if (outputStream == null) {
            qa.OooOO0();
            return;
        }
        try {
            CharsetEncoder charsetEncoderNewEncoder = Charset.forName(str).newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.OooO0o0 = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            this.OooO0Oo = outputStream;
        } catch (IllegalCharsetNameException e) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
        } catch (UnsupportedCharsetException e2) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{-91, -114, -14, 29, -67, 80, 90, -87, -21, -62, -29, 31, -65, 77, 11, -3, -73, -127, -83, 80, -76, 30, 79, -93, -3, -40, -28, 23, -20, 87, 89, -72, -1, -100, -78, 87, -15, 3, 88, -83, -9, -43, -21, 28, -66, 30, 73, -15, -66}, new byte[]{-103, -79, -118, 112, -47, 112, 44, -52}));
        sb.append(bool.booleanValue() ? u7.OooO00o(new byte[]{-75, 49, 30}, new byte[]{-52, 84, 109, 116, -71, -123, -40, 6}) : u7.OooO00o(new byte[]{-92, 7}, new byte[]{-54, 104, -113, -28, 110, -72, 104, -53}));
        String strOooO0oo = rj.OooO0oo(new byte[]{-15, 117, 88, -29, 23}, new byte[]{-42, 85, 103, -35, 29, -38, 112, 101}, sb);
        OooO0O0(0, strOooO0oo.length(), strOooO0oo);
        this.OooOO0 = true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        if (this.OooO0oo) {
            String strOooO00o = u7.OooO00o(new byte[]{97, 127}, new byte[]{95, 117, 122, -25, 83, -13, -109, 36});
            OooO0O0(0, strOooO00o.length(), strOooO00o);
        }
        if (this.OooO0oO) {
            int length = this.OooO * 4;
            String str3 = OooOO0o;
            if (length > str3.length()) {
                length = str3.length();
            }
            OooO0O0(0, length, str3);
        }
        this.OooO++;
        OooO00o('<');
        if (str != null) {
            OooO0O0(0, str.length(), str);
            OooO00o(':');
        }
        OooO0O0(0, str2.length(), str2);
        this.OooO0oo = true;
        this.OooOO0 = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        String str;
        if (this.OooO0oo) {
            String strOooO00o = u7.OooO00o(new byte[]{-79}, new byte[]{-113, -93, 91, 15, 27, -40, -66, 80});
            OooO0O0(0, strOooO00o.length(), strOooO00o);
            this.OooO0oo = false;
        }
        String[] strArr = OooOO0O;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    OooO0OO(cArr, i4, i - i4);
                }
                i4 = i + 1;
                OooO0O0(0, str.length(), str);
            }
            i++;
        }
        if (i4 < i) {
            OooO0OO(cArr, i4, i - i4);
        }
        if (this.OooO0oO) {
            this.OooOO0 = cArr[i3 - 1] == '\n';
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.OooO0OO = writer;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        if (this.OooO0oo) {
            String strOooO00o = u7.OooO00o(new byte[]{4}, new byte[]{58, 116, -18, -14, -57, -67, 78, -43});
            OooO0O0(0, strOooO00o.length(), strOooO00o);
            this.OooO0oo = false;
        }
        OooO0Oo(str);
        if (this.OooO0oO) {
            this.OooOO0 = str.length() > 0 && str.charAt(str.length() - 1) == '\n';
        }
        return this;
    }
}
