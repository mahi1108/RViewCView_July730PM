package cubex.mahesh.rviewcview_july730pm

import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import java.io.File

class MyAdapter:RecyclerView.Adapter<MyHolder>
{
    var mActivity:MainActivity? = null
    var files : Array<File>? = null
    var file:File? = null
    constructor(mActivity:MainActivity){
        this.mActivity = mActivity

        var path = "/storage/sdcard0/WhatsApp/Media/WhatsApp Images/"
         file = File(path)
        if(!file!!.exists()){
            path = "/storage/emulated/0/WhatsApp/Media/WhatsApp Images/"
            file = File(path)
        }
      files =   file!!.listFiles()
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyHolder {
     var inflater = LayoutInflater.from(mActivity)
     var v = inflater.inflate(R.layout.indiview,p0,false)
      return  MyHolder(v)
      }

    override fun getItemCount(): Int {
        return  files!!.size
    }

    override fun onBindViewHolder(p0: MyHolder, p1: Int) {
            var f:File = files!![p1]
            p0.iv1!!.setImageURI(Uri.fromFile(f))
            p0.tv1!!.text = f.name
            p0.tv2!!.text = "${f.length()} bytes"
            p0.b1!!.setOnClickListener({
                f.delete()
                files =   file!!.listFiles()
                this@MyAdapter.notifyDataSetChanged()
            })
    }

}