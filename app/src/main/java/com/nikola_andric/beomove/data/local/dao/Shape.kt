package com.nikola_andric.beomove.data.local.dao

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nikola_andric.beomove.util.Coordinates

@Entity(
    tableName = "shape",
)
data class Shape(
    @PrimaryKey
    @ColumnInfo(name = "shape_id")
    val id: Long,

    @Embedded(prefix = "shape_")
    val coordinates: Coordinates,

    @ColumnInfo(name = "shape_sequence")
    val sequence: Long
)