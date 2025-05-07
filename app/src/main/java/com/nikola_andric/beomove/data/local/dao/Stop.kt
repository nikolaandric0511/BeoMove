package com.nikola_andric.beomove.data.local.dao

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nikola_andric.beomove.util.Coordinates

@Entity(
    tableName = "stop",
    indices = [], //TODO add indices
)
data class Stop(
    @PrimaryKey
    @ColumnInfo(name = "stop_id")
    val id: Long,

    @ColumnInfo(name = "stop_code")
    val code: String,

    @ColumnInfo(name = "stop_name")
    val name: String,

    @ColumnInfo(name = "stop_description")
    val description: String,

    @Embedded(prefix = "stop_")
    val coordinates: Coordinates,

    @ColumnInfo(name = "stop_url")
    val stopUrl: String
)