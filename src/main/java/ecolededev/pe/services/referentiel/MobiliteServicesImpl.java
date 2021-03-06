package ecolededev.pe.services.referentiel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecolededev.pe.domaine.Mobilite;
import ecolededev.pe.domaine.repository.IMobiliteRepository;

@Service
public class MobiliteServicesImpl implements IMobiliteServices {
	  @Autowired IMobiliteRepository iMobiliteRepository;
	  
	@Override
	public List<Mobilite> listeMobilite() {

		return iMobiliteRepository.findAll();
	}
	
	public Mobilite getMobilite(Long idMobilite)
	{
		return iMobiliteRepository.findOne(idMobilite);
	}
	
	public Mobilite infoMobilite(String codeMobilite){
		Mobilite res = iMobiliteRepository.findOneBycode(codeMobilite);
		return res;
	}
}
