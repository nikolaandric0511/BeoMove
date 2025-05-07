package com.nikola_andric.beomove.data.local.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.ZoneId


@Entity(
    tableName = "agency",
    indices = [] //TODO add indices
)
data class Agency(
    @PrimaryKey
    @ColumnInfo(name = "agency_id")
    val id: Long,

    @ColumnInfo(name = "agency_name")
    val name: String,

    @ColumnInfo(name = "agency_url")
    val url: String,

    @ColumnInfo(name = "agency_timezone")
    val timeZone: ZoneId, //TODO create TypeConverter for timeZone.

    @ColumnInfo(name = "agency_language")
    val language: String,

    @ColumnInfo(name = "agency_phone")
    val phoneNumber: String,

    @ColumnInfo(name = "agency_email")
    val email: String
)