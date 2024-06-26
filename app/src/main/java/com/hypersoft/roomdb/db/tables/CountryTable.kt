package com.hypersoft.roomdb.db.tables

import android.os.Parcelable
import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

/**
 * @Author: Muhammad Yaqoob
 * @Date: 29,March,2024.
 * @Accounts
 *      -> https://github.com/orbitalsonic
 *      -> https://www.linkedin.com/in/myaqoob7
 */
@Keep
@Parcelize
@Entity(tableName = "country_table")
data class CountryTable(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name = "countryName") var countryName: String,
    @ColumnInfo(name = "countryCode") var countryCode: String,
    @ColumnInfo(name = "city") var city: City
) : Parcelable
