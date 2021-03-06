package com.wotin.cleansearch.CustomClass

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.wotin.cleansearch.Converters.ListJsonConverterSearchResultCustomClass

@Entity(tableName = "SearchResultRecords")
data class SearchResultsRecordCustomClass(
    @ColumnInfo(name = "searchSentences") val searchSentences: String = "",
    @TypeConverters(ListJsonConverterSearchResultCustomClass::class)
    @ColumnInfo(name = "searchResultList") val searchResultList : ArrayList<SearchResultCustomClass> = arrayListOf(),
    @ColumnInfo(name = "expandable") var expandable : Boolean = false,
    @PrimaryKey(autoGenerate = true) val id : Long = 0
)