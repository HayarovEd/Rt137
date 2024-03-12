package com.abc.def.g.domain.utils

import androidx.compose.ui.graphics.Color
import java.text.SimpleDateFormat
import java.util.Locale


const val POLITIC_URL = "https://www.evernote.com/shard/s544/client/snv?isnewsnv=true&noteGuid=a9b0e1b7-1fbc-43aa-9539-395bfa1cbacd&noteKey=LbPV8f2kBw7yvD_K01fYYFjRAF7uhM6B-cYLEw3CxvvvGE_uG7A8fS5T4w&sn=https%3A%2F%2Fwww.evernote.com%2Fshard%2Fs544%2Fsh%2Fa9b0e1b7-1fbc-43aa-9539-395bfa1cbacd%2FLbPV8f2kBw7yvD_K01fYYFjRAF7uhM6B-cYLEw3CxvvvGE_uG7A8fS5T4w&title=Privacy%2BPolicy%2Bfor%2B%25D0%259C%25D0%25B5%25D0%25B6%25D0%25B4%25D1%2583%25D0%25BD%25D0%25B0%25D1%2580%25D0%25BE%25D0%25B4%25D0%25BD%25D1%258B%25D0%25B5%2B%25D1%2581%25D0%25BF%25D0%25BE%25D1%2580%25D1%2582%2B%25D0%25BC%25D0%25B0%25D1%2582%25D1%2587%25D0%25B8"
const val BACK_URL = "https://api.backendless.com"
const val APPLICATION_ID = "227FD1C7-E583-78D1-FFD8-E9932429A300"
const val ANDROID_API_KEY = "E2B598A4-99EE-41A6-9AC5-78F10D9EC6D9"
const val OBJECT_ID_KEY = "FAC6EA02-C043-4D27-9261-30D72DDF836F"
const val TABLE_NAME = "Mezsports_matchs_137"
const val NAME = "Mezsports_matchs_137"
const val METRICA = "102cdf3c-a3ef-4e36-b24e-a5e73277b12b"

const val SHARED_DATA = "shared_data"
const val SHARED_URL = "shared_url"


fun formatDate(datetime: String): String? {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.getDefault())
    val outputFormat = SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault())
    val date = inputFormat.parse(datetime)
    return date?.let { outputFormat.format(it) }
}

fun Color.Companion.fromHex(colorString: String) = Color(android.graphics.Color.parseColor(colorString))
