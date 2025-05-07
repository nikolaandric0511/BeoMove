package com.nikola_andric.beomove.data.local.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalTime

@Entity(
    tableName = "stop_times"
)
data class StopTimes(
    @PrimaryKey
    @ColumnInfo(name = "stop_times_id")
    val id: Long,

    @ColumnInfo(name = "trip_id")
    val tripId: Long,

    @ColumnInfo(name = "stop_id")
    val stopId: Long,

    @ColumnInfo(name = "arrival_time")
    val arrivalTime: LocalTime,

    @ColumnInfo(name = "departure_time")
    val departureTime: LocalTime,

    @ColumnInfo(name = "stop_sequence")
    val stopSequence: Long,

    @ColumnInfo(name = "stop_head_sign")
    val headSign: String
)
