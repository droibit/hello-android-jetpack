package com.github.droibit.hello.androidjetpack

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.main_activity.bottomNavView
import kotlinx.android.synthetic.main.main_activity.navHostFragment
import kotlinx.android.synthetic.main.main_activity.toolbar

class MainActivity : AppCompatActivity() {

  private val navController: NavController by lazy {
    findNavController(navHostFragment)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_activity)

    setSupportActionBar(toolbar)

    bottomNavView.setupWithNavController(navController)
  }

  override fun onSupportNavigateUp() = navController.navigateUp()

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    return item.onNavDestinationSelected(navController) ||
        super.onOptionsItemSelected(item)
  }
}
