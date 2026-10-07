package com.cmaster.cloner;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ql extends BaseAdapter implements Filterable {
    public pl OooO;
    public boolean OooO0Oo;
    public Cursor OooO0o;
    public boolean OooO0o0;
    public int OooO0oO;
    public ol OooO0oo;
    public rl OooOO0;

    public abstract void OooO00o(View view, Cursor cursor);

    public void OooO0O0(Cursor cursor) {
        Cursor cursor2 = this.OooO0o;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                ol olVar = this.OooO0oo;
                if (olVar != null) {
                    cursor2.unregisterContentObserver(olVar);
                }
                pl plVar = this.OooO;
                if (plVar != null) {
                    cursor2.unregisterDataSetObserver(plVar);
                }
            }
            this.OooO0o = cursor;
            if (cursor != null) {
                ol olVar2 = this.OooO0oo;
                if (olVar2 != null) {
                    cursor.registerContentObserver(olVar2);
                }
                pl plVar2 = this.OooO;
                if (plVar2 != null) {
                    cursor.registerDataSetObserver(plVar2);
                }
                this.OooO0oO = cursor.getColumnIndexOrThrow("_id");
                this.OooO0Oo = true;
                notifyDataSetChanged();
            } else {
                this.OooO0oO = -1;
                this.OooO0Oo = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String OooO0OO(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.OooO0Oo || (cursor = this.OooO0o) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.OooO0Oo) {
            return null;
        }
        this.OooO0o.moveToPosition(i);
        if (view == null) {
            yj1 yj1Var = (yj1) this;
            view = yj1Var.OooOOO0.inflate(yj1Var.OooOO0o, viewGroup, false);
        }
        OooO00o(view, this.OooO0o);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.OooOO0 == null) {
            rl rlVar = new rl();
            rlVar.OooO00o = this;
            this.OooOO0 = rlVar;
        }
        return this.OooOO0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.OooO0Oo || (cursor = this.OooO0o) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.OooO0o;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.OooO0Oo && (cursor = this.OooO0o) != null && cursor.moveToPosition(i)) {
            return this.OooO0o.getLong(this.OooO0oO);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.OooO0Oo) {
            qa.OooO0o("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.OooO0o.moveToPosition(i)) {
            qa.OooO0o(px0.OooOOO(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            yj1 yj1Var = (yj1) this;
            view = yj1Var.OooOOO0.inflate(yj1Var.OooOO0O, viewGroup, false);
            view.setTag(new xj1(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(yj1Var.OooOOo);
        }
        OooO00o(view, this.OooO0o);
        return view;
    }
}
