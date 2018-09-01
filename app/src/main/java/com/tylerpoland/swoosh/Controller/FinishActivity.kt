package com.tylerpoland.swoosh.Controller

import android.os.Bundle
import com.tylerpoland.swoosh.Model.Player
import com.tylerpoland.swoosh.R
import com.tylerpoland.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        searchLeaguesText.text = getString(R.string.search_league, player.league, player.skill)
    }

}
