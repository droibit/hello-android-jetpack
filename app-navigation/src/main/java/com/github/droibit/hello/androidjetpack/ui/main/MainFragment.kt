package com.github.droibit.hello.androidjetpack.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.github.droibit.hello.androidjetpack.R
import kotlinx.android.synthetic.main.main_fragment.navToDestButton
import kotlinx.android.synthetic.main.main_fragment.navToDestWithActionButton
import kotlinx.android.synthetic.main.main_fragment.navToDestWithSafeArgsButton

class MainFragment : Fragment() {

  companion object {
    fun newInstance() = MainFragment()
  }

  private lateinit var viewModel: MainViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setHasOptionsMenu(true)
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    return inflater.inflate(R.layout.main_fragment, container, false)
  }

  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)

    val options = NavOptions.Builder()
        .setEnterAnim(R.anim.slide_in_right)
        .setExitAnim(R.anim.slide_out_left)
        .setPopEnterAnim(R.anim.slide_in_left)
        .setPopExitAnim(R.anim.slide_out_right)
        .build()
    navToDestButton.setOnClickListener {
      it.findNavController()
          .navigate(R.id.flow_step_1, null, options)
    }

    navToDestWithActionButton.setOnClickListener(
        Navigation.createNavigateOnClickListener(R.id.next_action, null)
    )

    navToDestWithSafeArgsButton.setOnClickListener {
      val directions = MainFragmentDirections.next_action()
          .apply {
            setStep(1)
          }
      it.findNavController()
          .navigate(directions, options)
//      val args = FlowStepFragmentArgs.Builder()
//          .setStep(1)
//          .build()
//      it.findNavController().navigate(R.id.flow_step_1, args.toBundle(), options)
    }
  }

  override fun onCreateOptionsMenu(
    menu: Menu,
    inflater: MenuInflater
  ) {
    inflater.inflate(R.menu.menu_main, menu)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProviders.of(this)
        .get(MainViewModel::class.java)
    // TODO: Use the ViewModel
  }
}
