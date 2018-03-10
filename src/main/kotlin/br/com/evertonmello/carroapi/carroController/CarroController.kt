package br.com.evertonmello.carroapi.carroController

import br.com.evertonmello.carroapi.entity.Carro
import br.com.evertonmello.carroapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping( "/carro")
class CarroController{

    @Autowired
    lateinit var carroService: CarroService

    @GetMapping
    fun buscarTodos():List<Carro>{
        return carroService.buscarTodos()
    }

    @PostMapping
    fun salvarCarro(@RequestBody carro: Carro){
        return carroService.salvar(carro)
    }

    @DeleteMapping("/all")
    fun deleteAll(){
        return carroService.deleteAll()
    }


}