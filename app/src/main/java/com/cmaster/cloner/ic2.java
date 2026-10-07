package com.cmaster.cloner;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ic2 {
    public static List OooO0O0;
    public static final HashMap OooO00o = new HashMap();
    public static final Object OooO0OO = new Object();

    public static List OooO00o(String str) {
        ArrayList arrayList;
        Object obj = OooO0OO;
        synchronized (obj) {
            HashMap map = OooO00o;
            if (map.containsKey(str)) {
                return (List) map.get(str);
            }
            try {
                synchronized (obj) {
                    try {
                        if (OooO0O0 == null) {
                            OooO0O0 = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        }
                        arrayList = new ArrayList();
                        for (MediaCodecInfo mediaCodecInfo : OooO0O0) {
                            if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                                HashMap map2 = new HashMap();
                                map2.put("codecName", mediaCodecInfo.getName());
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                ArrayList arrayList2 = new ArrayList();
                                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                    arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                                }
                                map2.put("profileLevels", arrayList2);
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                if (videoCapabilities != null) {
                                    map2.put("bitRatesBps", OooO0O0(videoCapabilities.getBitrateRange()));
                                    map2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                    map2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                    map2.put("frameRates", OooO0O0(videoCapabilities.getSupportedFrameRates()));
                                    map2.put("widths", OooO0O0(videoCapabilities.getSupportedWidths()));
                                    map2.put("heights", OooO0O0(videoCapabilities.getSupportedHeights()));
                                }
                                map2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                arrayList.add(map2);
                            }
                        }
                        OooO00o.put(str, arrayList);
                    } finally {
                    }
                }
                return arrayList;
            } catch (LinkageError e) {
                e = e;
                HashMap map3 = new HashMap();
                map3.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map3);
                OooO00o.put(str, arrayList3);
                return arrayList3;
            } catch (RuntimeException e2) {
                e = e2;
                HashMap map32 = new HashMap();
                map32.put("error", e.getClass().getSimpleName());
                ArrayList arrayList32 = new ArrayList();
                arrayList32.add(map32);
                OooO00o.put(str, arrayList32);
                return arrayList32;
            }
        }
    }

    public static Integer[] OooO0O0(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
