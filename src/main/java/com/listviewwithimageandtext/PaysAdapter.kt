package com.listviewwithimageandtext

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class PaysAdapter( var context :Context, var listPays:ArrayList<Pays>) :BaseAdapter() {
    override fun getCount(): Int {
        return listPays.count()
    }

    override fun getItem(position: Int): Any {
        return listPays.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    private class  ViewHolder(row:View?){
        var textName:TextView
        var nbrPhone:TextView
        var ivImage:ImageView
        init {
            this.textName = row?.findViewById(R.id.pays) as TextView
            this.nbrPhone = row?.findViewById(R.id.nbrPhone) as TextView
            this.ivImage = row?.findViewById(R.id.flag) as ImageView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View
        var viewHolder:ViewHolder
        if(convertView==null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.flag_item_list, parent,false)
            viewHolder = ViewHolder(view)
            view.tag= viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var pays:Pays= getItem(position) as Pays
        viewHolder.textName.text = pays.name
        viewHolder.nbrPhone.text = pays.nbrPhone
        viewHolder.ivImage.setImageResource(pays.image)
        return  view as View

    }
}