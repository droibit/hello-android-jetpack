package com.github.droibit.hello.androidjetpack.ui.deeplink

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.droibit.hello.androidjetpack.R

class DeepLinkFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? = inflater.inflate(R.layout.deep_link_fragment, container, false)
}