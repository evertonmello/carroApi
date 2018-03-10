package br.com.evertonmello.carroapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Carro(@Id var id: String, var marca: String, var modelo: String, var ano: Int, var urlImagem: String?){

    /*constructor():this("", "", "", 0 )*/




}