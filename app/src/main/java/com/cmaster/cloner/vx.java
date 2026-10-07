package com.cmaster.cloner;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vx {
    public static final String[] OooOooO;
    public static final int[] OooOooo;
    public static final byte[] Oooo;
    public static final sx[] Oooo0;
    public static final byte[] Oooo000;
    public static final sx Oooo00O;
    public static final sx[][] Oooo00o;
    public static final HashMap[] Oooo0O0;
    public static final HashMap[] Oooo0OO;
    public static final HashMap Oooo0o;
    public static final HashSet Oooo0o0;
    public static final Charset Oooo0oO;
    public static final byte[] Oooo0oo;
    public int OooO;
    public final FileDescriptor OooO00o;
    public final AssetManager.AssetInputStream OooO0O0;
    public int OooO0OO;
    public final HashMap[] OooO0Oo;
    public ByteOrder OooO0o;
    public final HashSet OooO0o0;
    public boolean OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public static final boolean OooOO0o = Log.isLoggable("ExifInterface", 3);
    public static final List OooOOO0 = Arrays.asList(1, 6, 3, 8);
    public static final List OooOOO = Arrays.asList(2, 7, 4, 5);
    public static final int[] OooOOOO = {8, 8, 8};
    public static final int[] OooOOOo = {8};
    public static final byte[] OooOOo0 = {-1, -40, -1};
    public static final byte[] OooOOo = {102, 116, 121, 112};
    public static final byte[] OooOOoo = {109, 105, 102, 49};
    public static final byte[] OooOo00 = {104, 101, 105, 99};
    public static final byte[] OooOo0 = {79, 76, 89, 77, 80, 0};
    public static final byte[] OooOo0O = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] OooOo0o = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] OooOo = {101, 88, 73, 102};
    public static final byte[] OooOoO0 = {73, 72, 68, 82};
    public static final byte[] OooOoO = {73, 69, 78, 68};
    public static final byte[] OooOoOO = {82, 73, 70, 70};
    public static final byte[] OooOoo0 = {87, 69, 66, 80};
    public static final byte[] OooOoo = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        OooOooO = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        OooOooo = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        Oooo000 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        sx[] sxVarArr = {new sx("NewSubfileType", 254, 4), new sx("SubfileType", 255, 4), new sx(256, 3, "ImageWidth", 4), new sx(257, 3, "ImageLength", 4), new sx("BitsPerSample", 258, 3), new sx("Compression", 259, 3), new sx("PhotometricInterpretation", 262, 3), new sx("ImageDescription", 270, 2), new sx("Make", 271, 2), new sx("Model", 272, 2), new sx(273, 3, "StripOffsets", 4), new sx("Orientation", 274, 3), new sx("SamplesPerPixel", 277, 3), new sx(278, 3, "RowsPerStrip", 4), new sx(279, 3, "StripByteCounts", 4), new sx("XResolution", 282, 5), new sx("YResolution", 283, 5), new sx("PlanarConfiguration", 284, 3), new sx("ResolutionUnit", 296, 3), new sx("TransferFunction", 301, 3), new sx("Software", 305, 2), new sx("DateTime", 306, 2), new sx("Artist", 315, 2), new sx("WhitePoint", 318, 5), new sx("PrimaryChromaticities", 319, 5), new sx("SubIFDPointer", 330, 4), new sx("JPEGInterchangeFormat", 513, 4), new sx("JPEGInterchangeFormatLength", 514, 4), new sx("YCbCrCoefficients", 529, 5), new sx("YCbCrSubSampling", 530, 3), new sx("YCbCrPositioning", 531, 3), new sx("ReferenceBlackWhite", 532, 5), new sx("Copyright", 33432, 2), new sx("ExifIFDPointer", 34665, 4), new sx("GPSInfoIFDPointer", 34853, 4), new sx("SensorTopBorder", 4, 4), new sx("SensorLeftBorder", 5, 4), new sx("SensorBottomBorder", 6, 4), new sx("SensorRightBorder", 7, 4), new sx("ISO", 23, 3), new sx("JpgFromRaw", 46, 7), new sx("Xmp", 700, 1)};
        sx[] sxVarArr2 = {new sx("ExposureTime", 33434, 5), new sx("FNumber", 33437, 5), new sx("ExposureProgram", 34850, 3), new sx("SpectralSensitivity", 34852, 2), new sx("PhotographicSensitivity", 34855, 3), new sx("OECF", 34856, 7), new sx("SensitivityType", 34864, 3), new sx("StandardOutputSensitivity", 34865, 4), new sx("RecommendedExposureIndex", 34866, 4), new sx("ISOSpeed", 34867, 4), new sx("ISOSpeedLatitudeyyy", 34868, 4), new sx("ISOSpeedLatitudezzz", 34869, 4), new sx("ExifVersion", 36864, 2), new sx("DateTimeOriginal", 36867, 2), new sx("DateTimeDigitized", 36868, 2), new sx("OffsetTime", 36880, 2), new sx("OffsetTimeOriginal", 36881, 2), new sx("OffsetTimeDigitized", 36882, 2), new sx("ComponentsConfiguration", 37121, 7), new sx("CompressedBitsPerPixel", 37122, 5), new sx("ShutterSpeedValue", 37377, 10), new sx("ApertureValue", 37378, 5), new sx("BrightnessValue", 37379, 10), new sx("ExposureBiasValue", 37380, 10), new sx("MaxApertureValue", 37381, 5), new sx("SubjectDistance", 37382, 5), new sx("MeteringMode", 37383, 3), new sx("LightSource", 37384, 3), new sx("Flash", 37385, 3), new sx("FocalLength", 37386, 5), new sx("SubjectArea", 37396, 3), new sx("MakerNote", 37500, 7), new sx("UserComment", 37510, 7), new sx("SubSecTime", 37520, 2), new sx("SubSecTimeOriginal", 37521, 2), new sx("SubSecTimeDigitized", 37522, 2), new sx("FlashpixVersion", UnixStat.LINK_FLAG, 7), new sx("ColorSpace", 40961, 3), new sx(40962, 3, "PixelXDimension", 4), new sx(40963, 3, "PixelYDimension", 4), new sx("RelatedSoundFile", 40964, 2), new sx("InteroperabilityIFDPointer", 40965, 4), new sx("FlashEnergy", 41483, 5), new sx("SpatialFrequencyResponse", 41484, 7), new sx("FocalPlaneXResolution", 41486, 5), new sx("FocalPlaneYResolution", 41487, 5), new sx("FocalPlaneResolutionUnit", 41488, 3), new sx("SubjectLocation", 41492, 3), new sx("ExposureIndex", 41493, 5), new sx("SensingMethod", 41495, 3), new sx("FileSource", 41728, 7), new sx("SceneType", 41729, 7), new sx("CFAPattern", 41730, 7), new sx("CustomRendered", 41985, 3), new sx("ExposureMode", 41986, 3), new sx("WhiteBalance", 41987, 3), new sx("DigitalZoomRatio", 41988, 5), new sx("FocalLengthIn35mmFilm", 41989, 3), new sx("SceneCaptureType", 41990, 3), new sx("GainControl", 41991, 3), new sx("Contrast", 41992, 3), new sx("Saturation", 41993, 3), new sx("Sharpness", 41994, 3), new sx("DeviceSettingDescription", 41995, 7), new sx("SubjectDistanceRange", 41996, 3), new sx("ImageUniqueID", 42016, 2), new sx("CameraOwnerName", 42032, 2), new sx("BodySerialNumber", 42033, 2), new sx("LensSpecification", 42034, 5), new sx("LensMake", 42035, 2), new sx("LensModel", 42036, 2), new sx("Gamma", 42240, 5), new sx("DNGVersion", 50706, 1), new sx(50720, 3, "DefaultCropSize", 4)};
        sx[] sxVarArr3 = {new sx("GPSVersionID", 0, 1), new sx("GPSLatitudeRef", 1, 2), new sx(2, 5, "GPSLatitude", 10), new sx("GPSLongitudeRef", 3, 2), new sx(4, 5, "GPSLongitude", 10), new sx("GPSAltitudeRef", 5, 1), new sx("GPSAltitude", 6, 5), new sx("GPSTimeStamp", 7, 5), new sx("GPSSatellites", 8, 2), new sx("GPSStatus", 9, 2), new sx("GPSMeasureMode", 10, 2), new sx("GPSDOP", 11, 5), new sx("GPSSpeedRef", 12, 2), new sx("GPSSpeed", 13, 5), new sx("GPSTrackRef", 14, 2), new sx("GPSTrack", 15, 5), new sx("GPSImgDirectionRef", 16, 2), new sx("GPSImgDirection", 17, 5), new sx("GPSMapDatum", 18, 2), new sx("GPSDestLatitudeRef", 19, 2), new sx("GPSDestLatitude", 20, 5), new sx("GPSDestLongitudeRef", 21, 2), new sx("GPSDestLongitude", 22, 5), new sx("GPSDestBearingRef", 23, 2), new sx("GPSDestBearing", 24, 5), new sx("GPSDestDistanceRef", 25, 2), new sx("GPSDestDistance", 26, 5), new sx("GPSProcessingMethod", 27, 7), new sx("GPSAreaInformation", 28, 7), new sx("GPSDateStamp", 29, 2), new sx("GPSDifferential", 30, 3), new sx("GPSHPositioningError", 31, 5)};
        sx[] sxVarArr4 = {new sx("InteroperabilityIndex", 1, 2)};
        sx[] sxVarArr5 = {new sx("NewSubfileType", 254, 4), new sx("SubfileType", 255, 4), new sx(256, 3, "ThumbnailImageWidth", 4), new sx(257, 3, "ThumbnailImageLength", 4), new sx("BitsPerSample", 258, 3), new sx("Compression", 259, 3), new sx("PhotometricInterpretation", 262, 3), new sx("ImageDescription", 270, 2), new sx("Make", 271, 2), new sx("Model", 272, 2), new sx(273, 3, "StripOffsets", 4), new sx("ThumbnailOrientation", 274, 3), new sx("SamplesPerPixel", 277, 3), new sx(278, 3, "RowsPerStrip", 4), new sx(279, 3, "StripByteCounts", 4), new sx("XResolution", 282, 5), new sx("YResolution", 283, 5), new sx("PlanarConfiguration", 284, 3), new sx("ResolutionUnit", 296, 3), new sx("TransferFunction", 301, 3), new sx("Software", 305, 2), new sx("DateTime", 306, 2), new sx("Artist", 315, 2), new sx("WhitePoint", 318, 5), new sx("PrimaryChromaticities", 319, 5), new sx("SubIFDPointer", 330, 4), new sx("JPEGInterchangeFormat", 513, 4), new sx("JPEGInterchangeFormatLength", 514, 4), new sx("YCbCrCoefficients", 529, 5), new sx("YCbCrSubSampling", 530, 3), new sx("YCbCrPositioning", 531, 3), new sx("ReferenceBlackWhite", 532, 5), new sx("Copyright", 33432, 2), new sx("ExifIFDPointer", 34665, 4), new sx("GPSInfoIFDPointer", 34853, 4), new sx("DNGVersion", 50706, 1), new sx(50720, 3, "DefaultCropSize", 4)};
        Oooo00O = new sx("StripOffsets", 273, 3);
        Oooo00o = new sx[][]{sxVarArr, sxVarArr2, sxVarArr3, sxVarArr4, sxVarArr5, sxVarArr, new sx[]{new sx("ThumbnailImage", 256, 7), new sx("CameraSettingsIFDPointer", 8224, 4), new sx("ImageProcessingIFDPointer", 8256, 4)}, new sx[]{new sx("PreviewImageStart", 257, 4), new sx("PreviewImageLength", 258, 4)}, new sx[]{new sx("AspectFrame", 4371, 3)}, new sx[]{new sx("ColorSpace", 55, 3)}};
        Oooo0 = new sx[]{new sx("SubIFDPointer", 330, 4), new sx("ExifIFDPointer", 34665, 4), new sx("GPSInfoIFDPointer", 34853, 4), new sx("InteroperabilityIFDPointer", 40965, 4), new sx("CameraSettingsIFDPointer", 8224, 1), new sx("ImageProcessingIFDPointer", 8256, 1)};
        Oooo0O0 = new HashMap[10];
        Oooo0OO = new HashMap[10];
        Oooo0o0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        Oooo0o = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        Oooo0oO = charsetForName;
        Oooo0oo = "Exif\u0000\u0000".getBytes(charsetForName);
        Oooo = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            sx[][] sxVarArr6 = Oooo00o;
            if (i >= sxVarArr6.length) {
                HashMap map = Oooo0o;
                sx[] sxVarArr7 = Oooo0;
                map.put(Integer.valueOf(sxVarArr7[0].OooO00o), 5);
                map.put(Integer.valueOf(sxVarArr7[1].OooO00o), 1);
                map.put(Integer.valueOf(sxVarArr7[2].OooO00o), 2);
                map.put(Integer.valueOf(sxVarArr7[3].OooO00o), 3);
                map.put(Integer.valueOf(sxVarArr7[4].OooO00o), 7);
                map.put(Integer.valueOf(sxVarArr7[5].OooO00o), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Oooo0O0[i] = new HashMap();
            Oooo0OO[i] = new HashMap();
            for (sx sxVar : sxVarArr6[i]) {
                Oooo0O0[i].put(Integer.valueOf(sxVar.OooO00o), sxVar);
                Oooo0OO[i].put(sxVar.OooO0O0, sxVar);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vx(java.io.InputStream r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vx.<init>(java.io.InputStream):void");
    }

    public static ByteOrder OooOOo0(qx qxVar) throws IOException {
        short s = qxVar.readShort();
        boolean z = OooOO0o;
        if (s == 18761) {
            if (z) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            sa.OooO0o0(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void OooO(qx qxVar) throws IOException {
        boolean z = OooOO0o;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + qxVar);
        }
        qxVar.OooO0OO(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        qxVar.read(bArr);
        qxVar.read(bArr2);
        qxVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        qxVar.OooO0OO(i - qxVar.OooO0o);
        qxVar.read(bArr4);
        OooO0o0(new qx(bArr4), i, 5);
        qxVar.OooO0OO(i3 - qxVar.OooO0o);
        qxVar.OooO0o0 = ByteOrder.BIG_ENDIAN;
        int i4 = qxVar.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = qxVar.readUnsignedShort();
            int unsignedShort2 = qxVar.readUnsignedShort();
            if (unsignedShort == Oooo00O.OooO00o) {
                short s = qxVar.readShort();
                short s2 = qxVar.readShort();
                rx rxVarOooO0OO = rx.OooO0OO(s, this.OooO0o);
                rx rxVarOooO0OO2 = rx.OooO0OO(s2, this.OooO0o);
                HashMap[] mapArr = this.OooO0Oo;
                mapArr[0].put("ImageLength", rxVarOooO0OO);
                mapArr[0].put("ImageWidth", rxVarOooO0OO2);
                if (z) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            qxVar.OooO0OO(unsignedShort2);
        }
    }

    public final void OooO00o() {
        String strOooO0O0 = OooO0O0("DateTimeOriginal");
        HashMap[] mapArr = this.OooO0Oo;
        if (strOooO0O0 != null && OooO0O0("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strOooO0O0.concat("\u0000").getBytes(Oooo0oO);
            map.put("DateTime", new rx(2, bytes, bytes.length));
        }
        if (OooO0O0("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", rx.OooO00o(0L, this.OooO0o));
        }
        if (OooO0O0("ImageLength") == null) {
            mapArr[0].put("ImageLength", rx.OooO00o(0L, this.OooO0o));
        }
        if (OooO0O0("Orientation") == null) {
            mapArr[0].put("Orientation", rx.OooO00o(0L, this.OooO0o));
        }
        if (OooO0O0("LightSource") == null) {
            mapArr[1].put("LightSource", rx.OooO00o(0L, this.OooO0o));
        }
    }

    public final String OooO0O0(String str) {
        rx rxVarOooO0OO = OooO0OO(str);
        if (rxVarOooO0OO != null) {
            int i = rxVarOooO0OO.OooO00o;
            if (!Oooo0o0.contains(str)) {
                return rxVarOooO0OO.OooO0o(this.OooO0o);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                tx[] txVarArr = (tx[]) rxVarOooO0OO.OooO0oO(this.OooO0o);
                if (txVarArr == null || txVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(txVarArr));
                    return null;
                }
                tx txVar = txVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (txVar.OooO00o / txVar.OooO0O0));
                tx txVar2 = txVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (txVar2.OooO00o / txVar2.OooO0O0));
                tx txVar3 = txVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (txVar3.OooO00o / txVar3.OooO0O0)));
            }
            try {
                return Double.toString(rxVarOooO0OO.OooO0Oo(this.OooO0o));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final rx OooO0OO(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (OooOO0o) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < Oooo00o.length; i++) {
            rx rxVar = (rx) this.OooO0Oo[i].get(str);
            if (rxVar != null) {
                return rxVar;
            }
        }
        return null;
    }

    public final void OooO0Oo(ux uxVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            sa.OooO0oO("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                yx.OooO00o(mediaMetadataRetriever, new px(uxVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.OooO0Oo;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", rx.OooO0OO(Integer.parseInt(strExtractMetadata), this.OooO0o));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", rx.OooO0OO(Integer.parseInt(strExtractMetadata2), this.OooO0o));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", rx.OooO0OO(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.OooO0o));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    uxVar.OooO0o(i2);
                    byte[] bArr = new byte[6];
                    if (uxVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, Oooo0oo)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    if (uxVar.read(bArr2) != i5) {
                        throw new IOException("Can't read exif");
                    }
                    this.OooO0oo = i4;
                    OooOOo(0, bArr2);
                }
                if (OooOO0o) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c A[RETURN] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int OooO0o(java.io.BufferedInputStream r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vx.OooO0o(java.io.BufferedInputStream):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x019c, code lost:
    
        r23.OooO0o0 = r22.OooO0o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a0, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0o0(com.cmaster.cloner.qx r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vx.OooO0o0(com.cmaster.cloner.qx, int, int):void");
    }

    public final void OooO0oO(ux uxVar) throws IOException {
        int i;
        int i2;
        OooOO0(uxVar);
        HashMap[] mapArr = this.OooO0Oo;
        rx rxVar = (rx) mapArr[1].get("MakerNote");
        if (rxVar != null) {
            ux uxVar2 = new ux(rxVar.OooO0Oo);
            uxVar2.OooO0o0 = this.OooO0o;
            byte[] bArr = OooOo0;
            byte[] bArr2 = new byte[bArr.length];
            uxVar2.readFully(bArr2);
            uxVar2.OooO0o(0L);
            byte[] bArr3 = OooOo0O;
            byte[] bArr4 = new byte[bArr3.length];
            uxVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                uxVar2.OooO0o(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                uxVar2.OooO0o(12L);
            }
            OooOOoo(uxVar2, 6);
            rx rxVar2 = (rx) mapArr[7].get("PreviewImageStart");
            rx rxVar3 = (rx) mapArr[7].get("PreviewImageLength");
            if (rxVar2 != null && rxVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", rxVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", rxVar3);
            }
            rx rxVar4 = (rx) mapArr[8].get("AspectFrame");
            if (rxVar4 != null) {
                int[] iArr = (int[]) rxVar4.OooO0oO(this.OooO0o);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                rx rxVarOooO0OO = rx.OooO0OO(i5, this.OooO0o);
                rx rxVarOooO0OO2 = rx.OooO0OO(i6, this.OooO0o);
                mapArr[0].put("ImageWidth", rxVarOooO0OO);
                mapArr[0].put("ImageLength", rxVarOooO0OO2);
            }
        }
    }

    public final void OooO0oo(qx qxVar) throws IOException {
        if (OooOO0o) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + qxVar);
        }
        qxVar.OooO0o0 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = OooOo0o;
        qxVar.OooO0OO(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = qxVar.readInt();
                byte[] bArr2 = new byte[4];
                if (qxVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, OooOoO0)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, OooOoO)) {
                    return;
                }
                if (Arrays.equals(bArr2, OooOo)) {
                    byte[] bArr3 = new byte[i];
                    if (qxVar.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + hr2.OooO00o(bArr2));
                    }
                    int i3 = qxVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.OooO0oo = i2;
                        OooOOo(0, bArr3);
                        OooOo();
                        OooOo0(new qx(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                qxVar.OooO0OO(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                qa.OooOOOO("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void OooOO0(ux uxVar) throws IOException {
        OooOOOO(uxVar);
        OooOOoo(uxVar, 0);
        OooOo0o(uxVar, 0);
        OooOo0o(uxVar, 5);
        OooOo0o(uxVar, 4);
        OooOo();
        if (this.OooO0OO == 8) {
            HashMap[] mapArr = this.OooO0Oo;
            rx rxVar = (rx) mapArr[1].get("MakerNote");
            if (rxVar != null) {
                ux uxVar2 = new ux(rxVar.OooO0Oo);
                uxVar2.OooO0o0 = this.OooO0o;
                uxVar2.OooO0OO(6);
                OooOOoo(uxVar2, 9);
                rx rxVar2 = (rx) mapArr[9].get("ColorSpace");
                if (rxVar2 != null) {
                    mapArr[1].put("ColorSpace", rxVar2);
                }
            }
        }
    }

    public final void OooOO0O(ux uxVar) throws IOException {
        if (OooOO0o) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + uxVar);
        }
        OooOO0(uxVar);
        HashMap[] mapArr = this.OooO0Oo;
        rx rxVar = (rx) mapArr[0].get("JpgFromRaw");
        if (rxVar != null) {
            OooO0o0(new qx(rxVar.OooO0Oo), (int) rxVar.OooO0OO, 5);
        }
        rx rxVar2 = (rx) mapArr[0].get("ISO");
        rx rxVar3 = (rx) mapArr[1].get("PhotographicSensitivity");
        if (rxVar2 == null || rxVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", rxVar2);
    }

    public final void OooOO0o(qx qxVar) throws IOException {
        if (OooOO0o) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + qxVar);
        }
        qxVar.OooO0o0 = ByteOrder.LITTLE_ENDIAN;
        qxVar.OooO0OO(OooOoOO.length);
        int i = qxVar.readInt() + 8;
        byte[] bArr = OooOoo0;
        qxVar.OooO0OO(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (qxVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = qxVar.readInt();
                int i3 = length + 8;
                if (Arrays.equals(OooOoo, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (qxVar.read(bArr3) == i2) {
                        this.OooO0oo = i3;
                        OooOOo(0, bArr3);
                        OooOo0(new qx(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + hr2.OooO00o(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                qxVar.OooO0OO(i2);
            } catch (EOFException unused) {
                qa.OooOOOO("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final boolean OooOOO(HashMap map) {
        rx rxVar = (rx) map.get("ImageLength");
        rx rxVar2 = (rx) map.get("ImageWidth");
        if (rxVar == null || rxVar2 == null) {
            return false;
        }
        return rxVar.OooO0o0(this.OooO0o) <= 512 && rxVar2.OooO0o0(this.OooO0o) <= 512;
    }

    public final void OooOOO0(qx qxVar, HashMap map) throws IOException {
        rx rxVar = (rx) map.get("JPEGInterchangeFormat");
        rx rxVar2 = (rx) map.get("JPEGInterchangeFormatLength");
        if (rxVar == null || rxVar2 == null) {
            return;
        }
        int iOooO0o0 = rxVar.OooO0o0(this.OooO0o);
        int iOooO0o02 = rxVar2.OooO0o0(this.OooO0o);
        if (this.OooO0OO == 7) {
            iOooO0o0 += this.OooO;
        }
        if (iOooO0o0 > 0 && iOooO0o02 > 0 && this.OooO0O0 == null && this.OooO00o == null) {
            qxVar.skip(iOooO0o0);
            qxVar.read(new byte[iOooO0o02]);
        }
        if (OooOO0o) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iOooO0o0 + ", length: " + iOooO0o02);
        }
    }

    public final void OooOOOO(ux uxVar) throws IOException {
        ByteOrder byteOrderOooOOo0 = OooOOo0(uxVar);
        this.OooO0o = byteOrderOooOOo0;
        uxVar.OooO0o0 = byteOrderOooOOo0;
        int unsignedShort = uxVar.readUnsignedShort();
        int i = this.OooO0OO;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            sa.OooO0o0(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = uxVar.readInt();
        if (i2 < 8) {
            qa.OooOOOO(px0.OooOOO(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            uxVar.OooO0OO(i3);
        }
    }

    public final void OooOOOo() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.OooO0Oo;
            if (i >= mapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + mapArr[i].size());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                rx rxVar = (rx) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + rxVar.toString() + ", tagValue: '" + rxVar.OooO0o(this.OooO0o) + "'");
            }
            i++;
        }
    }

    public final void OooOOo(int i, byte[] bArr) throws IOException {
        ux uxVar = new ux(bArr);
        OooOOOO(uxVar);
        OooOOoo(uxVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOoo(com.cmaster.cloner.ux r29, int r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vx.OooOOoo(com.cmaster.cloner.ux, int):void");
    }

    public final void OooOo() {
        OooOo0O(0, 5);
        OooOo0O(0, 4);
        OooOo0O(5, 4);
        HashMap[] mapArr = this.OooO0Oo;
        rx rxVar = (rx) mapArr[1].get("PixelXDimension");
        rx rxVar2 = (rx) mapArr[1].get("PixelYDimension");
        if (rxVar != null && rxVar2 != null) {
            mapArr[0].put("ImageWidth", rxVar);
            mapArr[0].put("ImageLength", rxVar2);
        }
        if (mapArr[4].isEmpty() && OooOOO(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!OooOOO(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        OooOo00(0, "ThumbnailOrientation", "Orientation");
        OooOo00(0, "ThumbnailImageLength", "ImageLength");
        OooOo00(0, "ThumbnailImageWidth", "ImageWidth");
        OooOo00(5, "ThumbnailOrientation", "Orientation");
        OooOo00(5, "ThumbnailImageLength", "ImageLength");
        OooOo00(5, "ThumbnailImageWidth", "ImageWidth");
        OooOo00(4, "Orientation", "ThumbnailOrientation");
        OooOo00(4, "ImageLength", "ThumbnailImageLength");
        OooOo00(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void OooOo0(qx qxVar) throws IOException {
        rx rxVar;
        int iOooO0o0;
        HashMap map = this.OooO0Oo[4];
        rx rxVar2 = (rx) map.get("Compression");
        if (rxVar2 == null) {
            OooOOO0(qxVar, map);
            return;
        }
        int iOooO0o02 = rxVar2.OooO0o0(this.OooO0o);
        if (iOooO0o02 != 1) {
            if (iOooO0o02 == 6) {
                OooOOO0(qxVar, map);
                return;
            } else if (iOooO0o02 != 7) {
                return;
            }
        }
        rx rxVar3 = (rx) map.get("BitsPerSample");
        if (rxVar3 != null) {
            int[] iArr = (int[]) rxVar3.OooO0oO(this.OooO0o);
            int[] iArr2 = OooOOOO;
            if (Arrays.equals(iArr2, iArr) || (this.OooO0OO == 3 && (rxVar = (rx) map.get("PhotometricInterpretation")) != null && (((iOooO0o0 = rxVar.OooO0o0(this.OooO0o)) == 1 && Arrays.equals(iArr, OooOOOo)) || (iOooO0o0 == 6 && Arrays.equals(iArr, iArr2))))) {
                rx rxVar4 = (rx) map.get("StripOffsets");
                rx rxVar5 = (rx) map.get("StripByteCounts");
                if (rxVar4 == null || rxVar5 == null) {
                    return;
                }
                long[] jArrOooO0O0 = hr2.OooO0O0(rxVar4.OooO0oO(this.OooO0o));
                long[] jArrOooO0O02 = hr2.OooO0O0(rxVar5.OooO0oO(this.OooO0o));
                if (jArrOooO0O0 == null || jArrOooO0O0.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrOooO0O02 == null || jArrOooO0O02.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrOooO0O0.length != jArrOooO0O02.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrOooO0O02) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.OooO0oO = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrOooO0O0.length; i3++) {
                    int i4 = (int) jArrOooO0O0[i3];
                    int i5 = (int) jArrOooO0O02[i3];
                    if (i3 < jArrOooO0O0.length - 1 && i4 + i5 != jArrOooO0O0[i3 + 1]) {
                        this.OooO0oO = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (qxVar.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (qxVar.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.OooO0oO) {
                    long j4 = jArrOooO0O0[0];
                    return;
                }
                return;
            }
        }
        if (OooOO0o) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void OooOo00(int i, String str, String str2) {
        HashMap[] mapArr = this.OooO0Oo;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void OooOo0O(int i, int i2) {
        HashMap[] mapArr = this.OooO0Oo;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z = OooOO0o;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        rx rxVar = (rx) mapArr[i].get("ImageLength");
        rx rxVar2 = (rx) mapArr[i].get("ImageWidth");
        rx rxVar3 = (rx) mapArr[i2].get("ImageLength");
        rx rxVar4 = (rx) mapArr[i2].get("ImageWidth");
        if (rxVar == null || rxVar2 == null) {
            if (z) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (rxVar3 == null || rxVar4 == null) {
            if (z) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iOooO0o0 = rxVar.OooO0o0(this.OooO0o);
        int iOooO0o02 = rxVar2.OooO0o0(this.OooO0o);
        int iOooO0o03 = rxVar3.OooO0o0(this.OooO0o);
        int iOooO0o04 = rxVar4.OooO0o0(this.OooO0o);
        if (iOooO0o0 >= iOooO0o03 || iOooO0o02 >= iOooO0o04) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void OooOo0o(ux uxVar, int i) throws IOException {
        rx rxVarOooO0OO;
        rx rxVarOooO0OO2;
        HashMap[] mapArr = this.OooO0Oo;
        rx rxVar = (rx) mapArr[i].get("DefaultCropSize");
        rx rxVar2 = (rx) mapArr[i].get("SensorTopBorder");
        rx rxVar3 = (rx) mapArr[i].get("SensorLeftBorder");
        rx rxVar4 = (rx) mapArr[i].get("SensorBottomBorder");
        rx rxVar5 = (rx) mapArr[i].get("SensorRightBorder");
        if (rxVar != null) {
            int i2 = rxVar.OooO00o;
            ByteOrder byteOrder = this.OooO0o;
            if (i2 == 5) {
                tx[] txVarArr = (tx[]) rxVar.OooO0oO(byteOrder);
                if (txVarArr == null || txVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(txVarArr));
                    return;
                }
                rxVarOooO0OO = rx.OooO0O0(txVarArr[0], this.OooO0o);
                rxVarOooO0OO2 = rx.OooO0O0(txVarArr[1], this.OooO0o);
            } else {
                int[] iArr = (int[]) rxVar.OooO0oO(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                rxVarOooO0OO = rx.OooO0OO(iArr[0], this.OooO0o);
                rxVarOooO0OO2 = rx.OooO0OO(iArr[1], this.OooO0o);
            }
            mapArr[i].put("ImageWidth", rxVarOooO0OO);
            mapArr[i].put("ImageLength", rxVarOooO0OO2);
            return;
        }
        if (rxVar2 != null && rxVar3 != null && rxVar4 != null && rxVar5 != null) {
            int iOooO0o0 = rxVar2.OooO0o0(this.OooO0o);
            int iOooO0o02 = rxVar4.OooO0o0(this.OooO0o);
            int iOooO0o03 = rxVar5.OooO0o0(this.OooO0o);
            int iOooO0o04 = rxVar3.OooO0o0(this.OooO0o);
            if (iOooO0o02 <= iOooO0o0 || iOooO0o03 <= iOooO0o04) {
                return;
            }
            rx rxVarOooO0OO3 = rx.OooO0OO(iOooO0o02 - iOooO0o0, this.OooO0o);
            rx rxVarOooO0OO4 = rx.OooO0OO(iOooO0o03 - iOooO0o04, this.OooO0o);
            mapArr[i].put("ImageLength", rxVarOooO0OO3);
            mapArr[i].put("ImageWidth", rxVarOooO0OO4);
            return;
        }
        rx rxVar6 = (rx) mapArr[i].get("ImageLength");
        rx rxVar7 = (rx) mapArr[i].get("ImageWidth");
        if (rxVar6 == null || rxVar7 == null) {
            rx rxVar8 = (rx) mapArr[i].get("JPEGInterchangeFormat");
            rx rxVar9 = (rx) mapArr[i].get("JPEGInterchangeFormatLength");
            if (rxVar8 == null || rxVar9 == null) {
                return;
            }
            int iOooO0o05 = rxVar8.OooO0o0(this.OooO0o);
            int iOooO0o06 = rxVar8.OooO0o0(this.OooO0o);
            uxVar.OooO0o(iOooO0o05);
            byte[] bArr = new byte[iOooO0o06];
            uxVar.read(bArr);
            OooO0o0(new qx(bArr), iOooO0o05, i);
        }
    }
}
