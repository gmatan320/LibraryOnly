package com.example.mynewlibrary

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class FeedAdapter : BaseAdapter{


    var mContext: Context
    var mInflater: LayoutInflater
    var mDataSource: ArrayList<Feed>

    constructor(context: Context, items: ArrayList<Feed>) {
        mContext = context
        mDataSource = items
        mInflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        val rowView = mInflater.inflate(R.layout.item_list_feed, viewGroup, false)
        val titleTextView = rowView.findViewById<TextView>(R.id.titleTextView)
        val usernameTextView = rowView.findViewById<TextView>(R.id.usernameTextView)

        val feed = this.getItem(position) as Feed
        titleTextView.text = feed.tweet
        usernameTextView.text = feed.username


        return rowView
    }

    override fun getItem(position: Int): Any {
        return mDataSource!![position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return mDataSource.size
    }

}