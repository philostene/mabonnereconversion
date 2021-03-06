package ecolededev.pe.services.referentiel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecolededev.pe.domaine.Commune;
import ecolededev.pe.domaine.repository.ICommuneRepository;

@Service
public class CommuneServicesImpl implements ICommuneServices {
	  @Autowired ICommuneRepository iCommuneRepository;
	  
	@Override
	public List<Commune> listeCommune() {

		return iCommuneRepository.findAll();
	}
	
	public Commune infoCommune(String codePostal){
		
		Commune res = iCommuneRepository.findOneBycodePostal(codePostal);
		
		return res;
	}
}
