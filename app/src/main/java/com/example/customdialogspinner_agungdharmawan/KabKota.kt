package com.example.customdialogspinner_agungdharmawan

import android.content.*
import android.view.*
import android.widget.*

class AdapterKabKota (
    applicationContext: Context,
    private  val logo : IntArray,
    private  val nama : Array<String>
    ): BaseAdapter(){
        val Inflater = LayoutInflater.from(applicationContext)

    override fun getCount() = logo.size
    override fun getItem(position: Int) = null
    override fun getItemId(position:  Int) = 0L

    override fun getView(position: Int, convertView: View?, parent: ViewGroup? ): View{
        val cv = Inflater.inflate(R.layout.layout_itemspinner, null)
        val imgLogo = cv.findViewById<ImageView>(R.id.imgLogo)
        val tvNama = cv.findViewById<TextView>(R.id.tvNama)
        imgLogo.setImageResource(logo[position])
        tvNama.text = nama[position]
        return cv
    }
    }