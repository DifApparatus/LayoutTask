package com.e.layouttask

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Button

/**
 * Activity with 2 [Button]s. The first one displays [Fragment1] based on [ConstraintLayout] and the second shows
 * [Fragment2] based on [LinearLayout].
 *
 * @author Aliaskandr Shapkin
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1Button = findViewById<Button>(R.id.fragment1Button)
        fragment1Button.setOnClickListener({
            val departFlightTicket = FlightTicket.createAnyTicket()
            val returnFlightTicket = FlightTicket.createAnyTicket()
            val fragment = Fragment1.newInstance(departFlightTicket,returnFlightTicket)
            paintFragments(fragment)
        })

        val fragment2Button = findViewById<Button>(R.id.fragment2Button)
        fragment2Button.setOnClickListener({
            val departFlightTicket = FlightTicket.createAnyTicket()
            val returnFlightTicket = FlightTicket.createAnyTicket()
            val fragment = Fragment2.newInstance(departFlightTicket,returnFlightTicket)
            paintFragments(fragment)
        })
    }
    private fun paintFragments(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.frameContainer, fragment)
        transaction.commit()
    }
}
