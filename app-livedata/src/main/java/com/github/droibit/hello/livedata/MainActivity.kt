package com.github.droibit.hello.livedata

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.toLiveData
import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.text
import java.util.concurrent.TimeUnit.MILLISECONDS

class MainActivity : AppCompatActivity() {

  private val liveData: LiveData<String> by lazy {
    Flowable.just("Hello, from RX")
        .delay(15_000L, MILLISECONDS)
        .doOnNext {
          Log.d(BuildConfig.BUILD_TYPE, "#doOnNext($it)")
        }
        .observeOn(Schedulers.io())
        .doOnSubscribe {
          Log.d(BuildConfig.BUILD_TYPE, "#doOnSubscribe()")
        }
        .toLiveData()
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    liveData.observe(this, Observer {
      text.text = it!!
    })
  }
}
