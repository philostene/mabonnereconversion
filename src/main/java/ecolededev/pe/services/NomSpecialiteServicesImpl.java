package ecolededev.pe.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecolededev.pe.domaine.IMetiersRepository;
import ecolededev.pe.domaine.INomFormationRepository;
import ecolededev.pe.domaine.INomSpecialiteRepository;
import ecolededev.pe.domaine.Metier;
import ecolededev.pe.domaine.NomFormation;
import ecolededev.pe.domaine.NomSpecialite;
import ecolededev.pe.home.SaisieFormationForm;

@Service
public class NomSpecialiteServicesImpl implements INomSpecialiteServices {
	  @Autowired
	  INomSpecialiteRepository iNomSpecialiteRepository;

	@Override
	public List<NomSpecialite> nomSpecialites() {
		// TODO Auto-generated method stub
		
		return iNomSpecialiteRepository.findAll();
	}
	
	
}