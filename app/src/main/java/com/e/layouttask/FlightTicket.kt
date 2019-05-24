package com.e.layouttask
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FlightTicket(val date:String,
                        val freeSeats:Int,
                        val cost:Int,
                        val beginning:String,
                        val destiny:String,
                        val beginTime:String,
                        val arrivalTime:String,
                        val flyingTime:String): Parcelable {
    companion object {
        fun createAnyTicket():FlightTicket{
            val _date = "24 May 2019"
            val _freeSeats = 10
            val _cost = 2345
            val _beginning = "HRD"
            val _destiny = "MSK"
            val _beginTime = "12:44"
            val _arrivalTime = "15:32"
            val _flyingTime = "2:48"
            return FlightTicket(_date,_freeSeats,_cost,_beginning,_destiny,_beginTime,_arrivalTime,_flyingTime)
        }
    }
}