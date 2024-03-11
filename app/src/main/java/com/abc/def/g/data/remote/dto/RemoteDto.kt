package com.abc.def.g.data.remote.dto


import com.google.gson.annotations.SerializedName

data class RemoteDto(
    @SerializedName("bookmakers")
    val bookmakers: List<Bookmaker>,
    @SerializedName("competitions")
    val competitions: List<Competition>,
    @SerializedName("competitors")
    val competitors: List<Competitor>,
    @SerializedName("countries")
    val countries: List<Country>,
    @SerializedName("games")
    val games: List<Game>,
    @SerializedName("lastUpdateId")
    val lastUpdateId: Long,
    @SerializedName("paging")
    val paging: Paging,
    @SerializedName("requestedUpdateId")
    val requestedUpdateId: Int,
    @SerializedName("sports")
    val sports: List<Sport>,
    @SerializedName("summary")
    val summary: Summary,
    @SerializedName("ttl")
    val ttl: Int
)