package com.example.mynewlibrary.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mynewlibrary.R;
import com.example.mynewlibrary.objects.Feed;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

public  class FeedAdapter extends BaseAdapter {
    @NotNull
    private Context mContext;
    @NotNull
    private LayoutInflater mInflater;
    @NotNull
    private ArrayList mDataSource;

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    public final void setMContext(@NotNull Context var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.mContext = var1;
    }

    @NotNull
    public final LayoutInflater getMInflater() {
        return this.mInflater;
    }

    public final void setMInflater(@NotNull LayoutInflater var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.mInflater = var1;
    }

    @NotNull
    public final ArrayList getMDataSource() {
        return this.mDataSource;
    }

    public final void setMDataSource(@NotNull ArrayList var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.mDataSource = var1;
    }

    @NotNull
    public View getView(int position, @Nullable View view, @Nullable ViewGroup viewGroup) {
        View rowView = this.mInflater.inflate(R.layout.item_list_feed, viewGroup, false);
        TextView titleTextView = (TextView)rowView.findViewById(R.id.titleTextView);
        TextView usernameTextView = (TextView)rowView.findViewById(R.id.usernameTextView);
        Object var10000 = this.getItem(position);
        if (var10000 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.example.mynewlibrary.objects.Feed");
        } else {
            Feed feed = (Feed)var10000;
            Intrinsics.checkExpressionValueIsNotNull(titleTextView, "titleTextView");
            titleTextView.setText((CharSequence)feed.getTweet());
            Intrinsics.checkExpressionValueIsNotNull(usernameTextView, "usernameTextView");
            usernameTextView.setText((CharSequence)feed.getUsername());
            Intrinsics.checkExpressionValueIsNotNull(rowView, "rowView");
            return rowView;
        }
    }

    @NotNull
    public Object getItem(int position) {
        Object var10000 = this.mDataSource.get(position);
        Intrinsics.checkExpressionValueIsNotNull(var10000, "mDataSource[position]");
        return var10000;
    }

    public long getItemId(int position) {
        return (long)position;
    }

    public int getCount() {
        return this.mDataSource.size();
    }

    public FeedAdapter(Context context, ArrayList items) {
        super();
        this.mContext = context;
        this.mDataSource = items;
        Object var10001 = this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (var10001 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        } else {
            this.mInflater = (LayoutInflater)var10001;
        }
    }

    public String getShlomi() {
        return "Shlomi!";
    }
}
