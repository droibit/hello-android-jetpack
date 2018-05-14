package com.github.droibit.hello.androidjetpack.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.get
import com.github.droibit.hello.androidjetpack.R

class MainFragment : androidx.fragment.app.Fragment() {

  companion object {
    fun newInstance() = MainFragment()
  }

  private lateinit var viewModel: MainViewModel

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    return inflater.inflate(R.layout.main_fragment, container, false)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProviders.of(this).get()
    // TODO: Use the ViewModel
  }

}
