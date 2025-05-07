package com.nikola_andric.beomove.data.local.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.nikola_andric.beomove.util.Availability
import java.util.Date

@Entity(
    tableName = "calendar_dates",
    foreignKeys = [
        ForeignKey(
            entity = Calendar::class,
            parentColumns = ["service_id"],
            childColumns = ["service_id"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )
    ]
)
data class CalendarDates(
    @PrimaryKey
    @ColumnInfo(name = "calendar_dates_id")
    val id: Long,

    @ColumnInfo(name = "service_id")
    val serviceId: Long,

    @ColumnInfo(name = "date")
    val date: Date,

    @ColumnInfo(name = "exception_type")
    val availability: Availability
)
