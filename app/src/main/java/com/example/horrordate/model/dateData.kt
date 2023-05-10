package com.example.horrordate.model

class dateData {
    var dateName: String? = null
    var dateImage: String? = null
    var dateLocation: String? = null
    var dateAge: String? = null
    var dateDescription: String? = null
    constructor() {}

    constructor(
        dateName: String?,
        dateImage: String?,
        dateLocation: String?,
        dateAge: String?,
        dateDescription: String?
    ) {

        this.dateName = dateName
        this.dateImage = dateImage
        this.dateLocation = dateLocation
        this.dateAge = dateAge
        this.dateDescription = dateDescription
    }
}