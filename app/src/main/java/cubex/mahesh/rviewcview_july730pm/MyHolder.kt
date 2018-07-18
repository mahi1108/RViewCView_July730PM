package cubex.mahesh.rviewcview_july730pm

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.indiview.view.*

class MyHolder:RecyclerView.ViewHolder
{
    var iv1:ImageView? = null
    var tv1:TextView? = null
    var tv2:TextView? = null
    var b1:Button? = null

    constructor(v:View) : super(v) {
       iv1 = v.iv1
       tv1 = v.tv1
        tv2 = v.tv2
        b1 = v.b1
    }

}