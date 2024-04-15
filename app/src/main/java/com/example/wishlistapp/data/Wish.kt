package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    @ColumnInfo("wish-title")
    val title : String = "",
    @ColumnInfo("wish-describe")
    val description : String = ""
)

object DummyWish{
    val wishList= listOf(
        Wish(
            title = "Android developer job",
            description = "I need a full time job to fulfill my dreams"
        ),
        Wish(
            title="Google Pixel 9pro",
            description="An android mobile"
        ),
        Wish(
            title = "Apple Mac Mini m3 PC",
            description = "An Personal computer"
        ),
        Wish(
            title = "Comfy chair and Table",
            description = "For office and productivity"
        ),

    )
}