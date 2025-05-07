package com.nikola_andric.beomove.data.local.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "trip",
    foreignKeys = [] //TODO add foreign keys
)
data class Trip(
    @PrimaryKey
    @ColumnInfo(name = "trip_id")
    val tripId: Long,

    @ColumnInfo(name = "route_id")
    val routeId: Long,

    @ColumnInfo(name = "service_id")
    val serviceId: Long,

    @ColumnInfo(name = "shape_id")
    val shapeId: Long,

    @ColumnInfo(name = "trip_head_sign")
    val headSign: Long

)
