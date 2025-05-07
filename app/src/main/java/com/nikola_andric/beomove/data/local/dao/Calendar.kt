package com.nikola_andric.beomove.data.local.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nikola_andric.beomove.util.Availability
import java.util.Date

//TODO add TypeConverters
@Entity(
    tableName = "calendar"
)
data class Calendar(
    @PrimaryKey
    @ColumnInfo(name = "service_id")
    val serviceId: Long,

    @ColumnInfo(name = "start_date")
    val startDate: Date,

    @ColumnInfo(name = "end_date")
    val endDate: Date,

    @ColumnInfo(name = "monday")
    val monday: Availability,

    @ColumnInfo(name = "tuesday")
    val tuesday: Availability,

    @ColumnInfo(name = "wednesday")
    val wednesday: Availability,

    @ColumnInfo(name = "thursday")
    val thursday: Availability,

    @ColumnInfo(name = "friday")
    val friday: Availability,

    @ColumnInfo(name = "saturday")
    val saturday: Availability,

    @ColumnInfo(name = "sunday")
    val sunday: Availability
)
