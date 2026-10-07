package com.cmaster.cloner;

import android.content.Intent;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w41 extends URLSpan {
    public final /* synthetic */ URLSpan OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(String str, URLSpan uRLSpan, oOO0OO ooo0oo) {
        super(str);
        this.OooO0Oo = uRLSpan;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        String url = this.OooO0Oo.getURL();
        if (url.contains(sn2.OooO00o("wSK+PYPlYdo=\n", "sVDRSeyGDrY=\n"))) {
            url = sn2.OooO00o("ZkWbF5h0h9ttXYAJjiPJh3pUnQOOOIaTZ0WHEolgwZshRYoVhj2Fm2gcnAKZOMGXax+HE4Yi\n", "DjHvZ+tOqPQ=\n");
        } else if (url.contains(sn2.OooO00o("MjAlcTDUnw==\n", "QkJMB1G35rM=\n"))) {
            url = sn2.OooO00o("m69cUfjKPk6Qt0dP7p1wEoe+WkXuhj8Gmq9AVOneeA7cq1pI/ZFyGN2zXEzn\n", "89soIYvwEWE=\n");
        }
        Intent intent = new Intent(sn2.OooO00o("pdfWEABg2lqt18YHAX2QFafN2w0BJ+g9ge4=\n", "xLmyYm8JvnQ=\n"));
        intent.setData(Uri.parse(url));
        view.getContext().startActivity(intent);
    }
}
