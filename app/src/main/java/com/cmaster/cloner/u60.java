package com.cmaster.cloner;

import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Build;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class u60 {
    public static final String OooO00o = sn2.OooO00o("IzbZePRGShUiNst471FQDz8l\n", "cXOILb0UD0o=\n");
    public static Boolean OooO0O0 = null;

    public static boolean OooO00o(String str) {
        PackageManager packageManager = e2.OooO.OooO00o.getPackageManager();
        if (Build.VERSION.SDK_INT >= 31) {
            return packageManager.getProperty(OooO00o, str).getInteger() == 1;
        }
        try {
            return OooO0O0(packageManager.getResourcesForApplication(str).getAssets().openXmlResourceParser(sn2.OooO00o("wX5mdLosKh7hfmtgsDY6ffh9bg==\n", "gBACBtVFTlM=\n")));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean OooO0O0(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    if (sn2.OooO00o("6oBQpX0aw98=\n", "mvI/1Rhot6Y=\n").equals(xmlResourceParser.getName())) {
                        int attributeCount = xmlResourceParser.getAttributeCount();
                        String attributeValue = null;
                        String attributeValue2 = null;
                        for (int i = 0; i < attributeCount; i++) {
                            String attributeName = xmlResourceParser.getAttributeName(i);
                            if (sn2.OooO00o("U/Dquw==\n", "PZGH3roD8ko=\n").equals(attributeName)) {
                                attributeValue = xmlResourceParser.getAttributeValue(i);
                            } else if (sn2.OooO00o("2EYpwC8=\n", "ridFtUrPbi8=\n").equals(attributeName)) {
                                attributeValue2 = xmlResourceParser.getAttributeValue(i);
                            }
                        }
                        if (OooO00o.equals(attributeValue)) {
                            return String.valueOf(attributeValue2).equals(sn2.OooO00o("Rw==\n", "dsNMkHuYwrE=\n"));
                        }
                    } else {
                        continue;
                    }
                } else if (eventType == 3) {
                    xmlResourceParser.getName();
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        return false;
    }
}
