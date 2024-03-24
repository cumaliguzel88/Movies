package com.cumaliguzel.movies.data.entity

import java.io.Serializable

data class Movies(var id:Int,
                  var ad:String,
                  var resim:String,
                  var fiyat:Int) : Serializable {


}