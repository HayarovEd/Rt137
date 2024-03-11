package com.abc.def.g.data.remote.dto


import com.google.gson.annotations.SerializedName

data class OddsPreview(
    @SerializedName("cells")
    val cells: List<Cell>
)