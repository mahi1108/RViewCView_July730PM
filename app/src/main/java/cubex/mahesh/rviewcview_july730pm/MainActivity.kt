package cubex.mahesh.rviewcview_july730pm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    /*    var lManager = LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,false) */
      var lManager = GridLayoutManager(this,2)
        rview.layoutManager = lManager
        rview.adapter = MyAdapter(this)

        fab.setOnClickListener({
            var sBar = Snackbar.make(it,
         "Are you sure want to Exit?",Snackbar.LENGTH_INDEFINITE)
            sBar.show()
            sBar.setAction("Yes",{
                System.exit(0)   // finish( ) -> destroy current Activity
            })
        })
    }
}
