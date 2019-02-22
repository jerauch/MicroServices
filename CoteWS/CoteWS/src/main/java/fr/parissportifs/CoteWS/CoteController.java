package fr.parissportifs.CoteWS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoteController {
  
  @Autowired
  private CoteRepository repository;
  
  @Autowired
  private Environment environment;
  
  @GetMapping("/ms-paris-sportifs/foot/{d}/vs/{v}")
  public Cote getCote
    (@PathVariable String d, @PathVariable String v){
    
	Cote cote = repository.findByDomicileAndVisiteur(d, v);
			  
	cote.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
	  
    return cote;
  }
}
