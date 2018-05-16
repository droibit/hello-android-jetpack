package com.github.droibit.hello.androidjetpack.ui.step

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.github.droibit.hello.androidjetpack.R

class FlowStepFragment : Fragment() {

  private val step: Int by lazy {
    FlowStepFragmentArgs.fromBundle(arguments!!).step
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return when (step) {
      1 -> inflater.inflate(R.layout.flow_step_fragment_1, container, false)
      2 -> inflater.inflate(R.layout.flow_step_fragment_2, container, false)
      else -> throw IllegalStateException("error!")
    }
  }

  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)

    view.findViewById<Button>(R.id.navButton)
        .setOnClickListener(Navigation.createNavigateOnClickListener(R.id.next_action))
  }
}