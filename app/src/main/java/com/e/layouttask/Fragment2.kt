package com.e.layouttask

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment2.view.*

/**
 * Non[ConstraintLayout] fragment.
 *
 * @author Aliaksandr Shapkin
 */
class Fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)
        arguments?.getParcelable<FlightTicket>(DEPART_KEY)?.apply {
            view.departDateTextView.text = date
            view.departFreeSeatsTextView.text = String.format("Free seats %d", freeSeats)
            view.departCostTextView.text = String.format("%d BYN", cost)
            view.departStartTextView.text = beginning
            view.departDestinyTextView.text = destiny
            view.departStartTimeTextView.text = beginTime
            view.departEndTimeTextView.text = arrivalTime
            view.departFlyingTimeTextView.text = flyingTime
        }
        arguments?.getParcelable<FlightTicket>(RETURN_KEY)?.apply {
            view.returnDateTextView.text = date
            view.returnFreeSeatsTextView.text = String.format("Free seats %d", freeSeats)
            view.returnCostTextView.text = String.format("%d BYN", cost)
            view.returnStartTextView.text = beginning
            view.returnDestinyTextView.text = destiny
            view.returnStartTimeTextView.text = beginTime
            view.returnEndTimeTextView.text = arrivalTime
            view.returnFlyingTimeTextView.text = flyingTime
        }
        return view
    }
    companion object {
        fun newInstance(departTicket:FlightTicket, returnTicket:FlightTicket) =
            Fragment2().apply {
                arguments = Bundle().apply {
                    putParcelable("DEPART_KEY", departTicket)
                    putParcelable("RETURN_KEY", returnTicket)
                }
            }
        private const val DEPART_KEY = "DEPART_KEY"
        private const val RETURN_KEY = "RETURN_KEY"
    }
}
