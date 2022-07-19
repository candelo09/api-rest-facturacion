package com.apifacturacion.rest.reposervice;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.apifacturacion.rest.interfaceservice.IcolaboradorService;
import com.apifacturacion.rest.modelo.Colaborador;
import com.apifacturacion.rest.repositorio.ColaboradorRepo;

@Service
public class ColaboradorService implements IcolaboradorService {

	@Autowired
	private ColaboradorRepo colaboradorRepo;

	@Override
	public List<Colaborador> listar() {
		// TODO Auto-generated method stub
		return (List<Colaborador>) colaboradorRepo.findAll();
	}

	@Override
	public ResponseEntity<Colaborador> create(Colaborador colaborador) {
		// TODO Auto-generated method stub

		Colaborador add_colaborador = new Colaborador();

		Date ultimo_login = new Date();
		
		List<Colaborador> findByDocumentColaborador = colaboradorRepo.findByIdentificacion(colaborador.getIdentificacion());

		if(findByDocumentColaborador.size() > 0) {
			
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(add_colaborador);

		}else {
			add_colaborador.setIdentificacion(colaborador.getIdentificacion());
			add_colaborador.setNombreuser(colaborador.getNombreuser());
			add_colaborador.setClaveUser(colaborador.getClaveUser());
			add_colaborador.setNombre(colaborador.getNombre());
			add_colaborador.setApellido(colaborador.getApellido());
			add_colaborador.setCorreo(colaborador.getCorreo());
			add_colaborador.setImagen(colaborador.getImagen());
			add_colaborador.setTelefono(colaborador.getTelefono());
			add_colaborador.setDireccion(colaborador.getDireccion());
			add_colaborador.setCargo(colaborador.getCargo());
			add_colaborador.setEstado(colaborador.getEstado());
			add_colaborador.setUltimo_login(ultimo_login);

			colaboradorRepo.save(add_colaborador);
			
			
			return ResponseEntity.status(HttpStatus.CREATED).body(add_colaborador);
		}
		


		

	}

	@Override
	public void edit(Colaborador colaborador) {

		Colaborador objColaborador = colaboradorRepo.findByNombreuser(colaborador.getNombreuser());

		System.out.println(objColaborador);
		System.out.println("El colaborador se modifico correctamente.");

	}

	@Override
	public void remove(Integer colaborador) {
		// TODO Auto-generated method stub
		colaboradorRepo.deleteById(colaborador);
		System.out.println("El colaborador se elimno correctamente");

	}

	@Override
	public String ingresar(String colaborador) {
		// TODO Auto-generated method stub

		Colaborador obColaborador = colaboradorRepo.findByNombreuser(colaborador);

		if (obColaborador == null) {
			System.out.println("Usuario no registrado o incorrecto");
		}

		return obColaborador.getNombreuser();
	}

	@Override
	public Colaborador findByIdUsuario(Integer id_usuario) {
		// TODO Auto-generated method stub
		return colaboradorRepo.findByIdUsuario(id_usuario);
	}


	@Override
	public List<Colaborador> findByIdentificacion(Long identificacion) {
		// TODO Auto-generated method stub
		return colaboradorRepo.findByIdentificacion(identificacion);
	}

}
