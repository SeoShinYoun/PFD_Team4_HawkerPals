package com.example.hawkerpals.models

import com.google.firebase.database.PropertyName

data class Post (
    var description: String = "",
    @get:PropertyName("image_url") @set:PropertyName("image_url") var imageUrl: String = "",
    @get:PropertyName("creation_time") @set:PropertyName("creation_time") var creationTime: Long = 0,
    var user:User? = null
)