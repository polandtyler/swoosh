package com.tylerpoland.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    private var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextTapped(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensTapped(view: View) {
        selectedLeague = "mens"
        womensButton.isChecked = false
        coEdButton.isChecked = false
    }

    fun onWomensTapped(view: View) {
        selectedLeague = "womens"
        mensButton.isChecked = false
        coEdButton.isChecked = false
    }

    fun onCoEdTapped(view: View) {
        selectedLeague = "coed"
        mensButton.isChecked = false
        womensButton.isChecked = false
    }
}
