package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.get
import androidx.fragment.app.commit
import com.example.testproject.databinding.ActivityMainBinding
import com.prathameshmore.toastylibrary.Toasty

class MainActivity : AppCompatActivity() {

    private lateinit  var activityMainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.button1.setOnClickListener{
            var checkfragment =  supportFragmentManager.findFragmentByTag("test1")
            if(checkfragment ==null)
            {
                var checkfragment2 =  supportFragmentManager.findFragmentByTag("test2")
                if(checkfragment2!=null)
                {
                    supportFragmentManager.popBackStack()
                }
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace(R.id.activity_detail_fragment_container_view,DetailFragment(),"test1")
                    addToBackStack("test1")
                }
                activityMainBinding.button1.setText("show Fragment2")
            }
            else
            {
                supportFragmentManager.popBackStack()
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace(R.id.activity_detail_fragment_container_view,DetailFragment2(),"test2")
                    addToBackStack("test2")
                }
                activityMainBinding.button1.setText("show Fragment1")
            }



          //  Toasty(this).primaryToasty(this, "userName: Password:", Toasty.LENGTH_LONG, Toasty.BOTTOM);
        }

    }
}