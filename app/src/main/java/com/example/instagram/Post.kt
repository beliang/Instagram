package com.example.instagram

import com.parse.ParseClassName
import com.parse.ParseFile
import com.parse.ParseObject
import com.parse.ParseUser
import java.io.File

// Description: String
// Image: File
// User: User
@ParseClassName("Post")
class Post : ParseObject(){

    fun getDescription() : String? {
        return getString(KEY_DESCRIPTION)
    }

    fun setDescription(newDescription: String) {
        put(KEY_DESCRIPTION, newDescription)
    }

    fun getImage() : ParseFile? {
        return getParseFile(KEY_IMAGE)
    }

    fun setImage(parseImage : ParseFile) {
        put(KEY_IMAGE, parseImage)
    }

    fun getUser(): ParseUser? {
        return getParseUser(KEY_USER)
    }

    fun setUser(parseUser : ParseUser) {
        put(KEY_USER, parseUser)
    }


    companion object {
        const val KEY_DESCRIPTION = "description"
        const val KEY_IMAGE = "image"
        const val KEY_USER = "user"
    }
}