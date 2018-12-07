package it.fpmf.acquariumdb.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.fpmf.acquariumdb.model.Family;
import it.fpmf.acquariumdb.repository.FamilyRepository;

@Service
public class RestApiImplService {
	
	@Autowired
	private FamilyRepository familyRepository;

	public List<Family> getAllFamilies (){
		return familyRepository.findAll();
	}
}
