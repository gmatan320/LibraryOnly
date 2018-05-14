package com.example.mynewlibrary

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Switch
import android.widget.TextView
import java.util.*

class UserAdapter: BaseAdapter{

    var mContext: Context
    var mInflater: LayoutInflater
    var mDataSource: ArrayList<User>

    constructor(context: Context, userArray: ArrayList<User>) {
        mContext = context
        mDataSource = userArray
        mInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }



    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        val rowView = mInflater!!.inflate(R.layout.item_list_users_list, viewGroup, false)
        val usernameTextView = rowView.findViewById<TextView>(R.id.userListUserNameTextView)
        val isFollowSwitch = rowView.findViewById<Switch>(R.id.followSwitch)

        val user = this.getItem(position) as User
        usernameTextView.text = user.username
        isFollowSwitch.isChecked = user.isFollow
        isFollowSwitch.tag = position

        return rowView
    }

    override fun getItem(position: Int): Any {
        return mDataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return this.mDataSource.size
    }


}