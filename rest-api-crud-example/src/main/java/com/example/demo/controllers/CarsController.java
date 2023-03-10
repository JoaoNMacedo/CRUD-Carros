package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.gr.cars.Car;
import com.example.demo.gr.cars.Cars;
import com.example.demo.gr.cars.Marca;
import com.example.demo.gr.cars.Modelo;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.MarcaRepository;
import com.example.demo.repository.ModeloRepository;

@RestController
@RequestMapping("/cars")
public class CarsController {
    @Autowired
    CarRepository carRespository;
    @Autowired
    ModeloRepository modeloRepository;
    @Autowired
    MarcaRepository marcaRepository;

    @GetMapping
    public List<Cars> ObterCars() {
        List<Marca> marcas = marcaRepository.findAll();
            
        List<Modelo> modelos = modeloRepository.findAll();
            
        List<Car> cars = carRespository.findAll();
            
        List<Cars> result = new ArrayList<>();
        for (Car car : cars) {
            Modelo modelo = modelos.stream().filter(m -> m.getId() == car.getModelo_id()).findFirst().orElse(null);
            if (modelo != null) {
                Marca marca = marcas.stream().filter(m -> m.getId() == modelo.getMarca_id()).findFirst().orElse(null);
                if (marca != null) {
                    Cars product = new Cars(car);
                    product.setId(car.getId()); 
                    product.setAno(car.getAno());
                    product.setCombustivel(car.getCombustivel());
                    product.setCor(car.getCor());
                    product.setTimestamp_cadastro(car.getTimestamp_cadastro());
                    product.setNome_modelo(modelo.getNome());
                    product.setNum_portas(car.getNum_portas());
                    product.setValor_fipe(modelo.getValor_fipe());
                    product.setMarca_id(marca.getId());
                    product.setMarca_nome(marca.getNome_marca());
                    result.add(product);
                }
            }
        }
        return result;
    }
}
  
/*

	protected List<Cars> getCar() {
        list_cars = null;
        List<Car> cars = carRespository.findAll();
        for(Car car : cars) {
//        	Modelo model = getModel(car.getModelo_id());
 //       	Marca marca = getMarca();
            Cars product = new Cars();
            product.setId(car.getId()); 
            product.setAno(car.getAno());
            product.setCombustivel(car.getCombustivel());
            product.setCor(car.getCor());
            product.setTimestamp_cadastro(car.getTimestamp_cadastro());
 //           product.setNome_modelo(model.getNome());
    //        product.setValor_fipe(model.getValor_fipe());
//            product.setMarca_id(marca.getId());
  //          product.setMarca_nome(marca.getNome_marca());
            list_cars.add(product);
        }
        return list_cars;
    }


    protected void getModel(Long id) {
        List<Modelo> modelos = modeloRepository.findAll();
        for(Modelo modelo : modelos) {
            if(modelo.id == id) {
                return;
            }
        }
    
    } 
    
    protected void getMarca(Long id) {
        List<Marca> marcas = marcaRepository.findAll();
        for(Marca marca : marcas) {
            if(marca.id == id) {
           	return;
            
        }
   
    }
    }
}
*/
    
    
    
    /*  public Cars ObterCars() {
   	Marca marca = new Marca();
   	marcaRepository.findAll();
   	marca.setNome_marca(marca.getNome_marca());
	
	Modelo modelo = new Modelo();
	modeloRepository.findAll();
	modelo.setMarca_id(modelo.getMarca_id());
	modelo.setNome(modelo.getNome());
	modelo.setValor_fipe(modelo.getValor_fipe());
	
	Car car = new Car();
	carRespository.findAll();
	car.setAno(car.getAno());
	car.setCombustivel(car.getCombustivel());
	car.setCor(car.getCor());
	car.setModelo_id(car.getModelo_id());
	car.setNum_portas(car.getNum_portas());
	
	return ObterCars();
}
}
*/  
    
    
    
    
   /* public Cars ObterCars() {
       	Marca marca = new Marca();
       	marcaRepository.findAll();
       	marca.setNome_marca(marca.getNome_marca());
    	
    	Modelo modelo = new Modelo();
    	modeloRepository.findAll();
    	modelo.setMarca_id(modelo.getMarca_id());
    	modelo.setNome(modelo.getNome());
    	modelo.setValor_fipe(modelo.getValor_fipe());
    	
    	Car car = new Car();
    	carRespository.findAll();
    	car.setAno(car.getAno());
    	car.setCombustivel(car.getCombustivel());
    	car.setCor(car.getCor());
    	car.setModelo_id(car.getModelo_id());
    	car.setNum_portas(car.getNum_portas());
    	
    	return ObterCars();
    }
}*/
    