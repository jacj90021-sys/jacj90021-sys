package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class Zip64RequiredException extends ZipException {
    static final String ARCHIVE_TOO_BIG_MESSAGE = "archive's size exceeds the limit of 4GByte.";
    static final String TOO_MANY_ENTRIES_MESSAGE = "archive contains more than 65535 entries.";
    private static final long serialVersionUID = 20110809;

    public Zip64RequiredException(String str) {
        super(str);
    }

    public static String getEntryTooBigMessage(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getName() + "'s size exceeds the limit of 4GByte.";
    }
}
