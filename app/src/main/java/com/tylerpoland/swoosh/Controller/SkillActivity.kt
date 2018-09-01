package com.tylerpoland.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.tylerpoland.swoosh.Model.Player
import com.tylerpoland.swoosh.R
import com.tylerpoland.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBallerClick(view: View) {
        if (player.skill == "baller") {
            player.skill = ""
        } else {
            player.skill = "baller"
            beginnerToggle.isChecked = false
        }
    }

    fun onBeginnerClick(view: View) {
        if (player.skill == "beginner") {
            player.skill = ""
        } else {
            player.skill = "beginner"
            ballerToggle.isChecked = false
        }
    }

    fun onSkillFinishClick(view: View) {
        if (player.skill != "") {
            val finish = Intent(this, FinishActivity::class.java)
            finish.putExtra(EXTRA_PLAYER, player)
            startActivity(finish)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }

    }
}
