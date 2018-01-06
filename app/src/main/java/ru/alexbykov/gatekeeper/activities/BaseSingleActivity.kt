package ru.alexbykov.gatekeeper.activities

import android.view.MenuItem
import ru.alexbykov.gatekeeper.R
import android.os.Bundle
import kotlinx.android.synthetic.main.toolbar.*


/**
 *  @author Alex Bykov
 *  Date: 06.01.2018.
 *
 *  You can contact me at me@alexbykov.ru
 */
abstract class BaseSingleActivity:BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupToolbar()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    override fun onBackPressed() {
        finish()
        overridePendingTransition(R.anim.move_left_in_activity, R.anim.move_right_out_activity)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return super.onOptionsItemSelected(item)
    }
}