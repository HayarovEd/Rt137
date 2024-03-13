package com.mez.hdu.narsports.mat.chs.mznm.domain.utils

sealed class ResourceRt137<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?): ResourceRt137<T>(data)
    class Error<T>(message: String, data: T? = null): ResourceRt137<T>(data, message)
}