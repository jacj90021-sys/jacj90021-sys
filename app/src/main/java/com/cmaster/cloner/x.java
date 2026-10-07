package com.cmaster.cloner;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class x {
    public static boolean OooO00o(DragEvent dragEvent, TextView textView, Activity activity) {
        oi xb1Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                xb1Var = new xb1(clipData, 3);
            } else {
                pi piVar = new pi();
                piVar.OooO0o0 = clipData;
                piVar.OooO0o = 3;
                xb1Var = piVar;
            }
            nt1.OooO(textView, xb1Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean OooO0O0(DragEvent dragEvent, View view, Activity activity) {
        oi xb1Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            xb1Var = new xb1(clipData, 3);
        } else {
            pi piVar = new pi();
            piVar.OooO0o0 = clipData;
            piVar.OooO0o = 3;
            xb1Var = piVar;
        }
        nt1.OooO(view, xb1Var.build());
        return true;
    }
}
