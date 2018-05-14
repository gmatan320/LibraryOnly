package com.example.mynewlibrary.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Switch;
import android.widget.TextView;

import com.example.mynewlibrary.R;
import com.example.mynewlibrary.objects.User;

import java.util.ArrayList;

public class UserAdapterA extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<User> mDataSource;


    public UserAdapterA(Context context, ArrayList<User> userArrayList) {
        this.mContext = context;
        this.mDataSource = userArrayList;
        this.mInflater = (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return this.mDataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return this.mDataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return (long)i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rowView = this.mInflater.inflate(R.layout.item_list_users_list, viewGroup, false);
        TextView usernameTextView = (TextView)rowView.findViewById(R.id.userListUserNameTextView);
        Switch isFollowSwitch = (Switch)rowView.findViewById(R.id.followSwitch);
        User u = (User) this.getItem(i);
        usernameTextView.setText(u.getUsername());
        isFollowSwitch.setChecked(u.getIsFollow());
        isFollowSwitch.setTag(i);
        return rowView;
    }
}
