package br.com.evertonmello.carroapi.carroController

import br.com.evertonmello.carroapi.entity.Carro
import br.com.evertonmello.carroapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CarroController{

    @Autowired
    lateinit var carroService: CarroService

    @GetMapping
    fun buscarTodos():List<Carro>{
        return carroService.buscarTodos()
    }


}