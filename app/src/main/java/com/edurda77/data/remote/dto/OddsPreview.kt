package com.edurda77.data.remote.dto


import com.google.gson.annotations.SerializedName

data class OddsPreview(
    @SerializedName("cells")
    val cells: List<Cell>
)