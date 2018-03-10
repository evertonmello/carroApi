package br.com.evertonmello.carroapi.service

import br.com.evertonmello.carroapi.entity.Carro
import br.com.evertonmello.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService{

    @Autowired
    lateinit var carroRepository: CarroRepository

    fun buscarTodos():List<Carro>{
        return carroRepository.findAll()
    }

    fun buscarCarroPorAno(ano: Int): List<Carro>{
        return carroRepository.findByAno(ano)
    }

    fun buscarCarroPorMarca(marca: String): List<Carro>{
        return carroRepository.findByMarcaContaining(marca)
    }



    fun salvar(carro: Carro){
        carroRepository.save(carro)
    }

    fun deleteAll() {
        carroRepository.deleteAll()
    }

}
