package com.nikola_andric.beomove.data.local.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.nikola_andric.beomove.util.VehicleType

@Entity(
    tableName = "route",
    indices = [], //TODO add indices
    foreignKeys = [
        ForeignKey(
            entity = Agency::class,
            parentColumns = ["agency_id"],
            childColumns = ["agency_id"],
            onDelete = ForeignKey.SET_NULL,
            onUpdate = ForeignKey.CASCADE
        )
    ]
)
data class Route(
    @PrimaryKey
    @ColumnInfo(name = "route_id")
    val routeId: Long,

    @ColumnInfo(name = "agency_id")
    val agencyId: Long,

    @ColumnInfo(name = "route_type")
    val vehicleType: VehicleType,

    @ColumnInfo(name = "route_short_name")
    val shortName: String,

    @ColumnInfo(name = "route_long_name")
    val longName: String,
)
