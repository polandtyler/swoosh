package com.tylerpoland.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.tylerpoland.swoosh.Model.Player
import com.tylerpoland.swoosh.R
import com.tylerpoland.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    private var selectedLeague = ""
    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextTapped(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensTapped(view: View) {
        if (player.league == "mens") {
            player.league = ""
        } else {
            player.league = "mens"
            womensButton.isChecked = false
            coEdButton.isChecked = false
        }
    }

    fun onWomensTapped(view: View) {
        if (player.league == "womens") {
            player.league = ""
        } else {
            player.league = "womens"
            mensButton.isChecked = false
            coEdButton.isChecked = false
        }
    }

    fun onCoEdTapped(view: View) {
        if (player.league == "coed") {
            player.league = ""
        } else {
            player.league = "coed"
            mensButton.isChecked = false
            womensButton.isChecked = false
        }
    }
}
