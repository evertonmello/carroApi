package br.com.evertonmello.carroapi.repository

import br.com.evertonmello.carroapi.entity.Carro
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CarroRepository: MongoRepository <Carro, String>{

    fun findByAno(ano: Int):List<Carro>

    fun findByMarcaContaining(marca: String):List <Carro>

    //fun findByPlaca(placa: String):List <Carro>
}