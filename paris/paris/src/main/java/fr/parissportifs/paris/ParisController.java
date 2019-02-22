package fr.parissportifs.paris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParisController {

	@Autowired
	CoteServiceProxy coteService;
	
	@GetMapping("/ms-resultat/foot/{d}/vs/{v}/{typeParis}/{mise}")
	public Paris resultat(@PathVariable String d, @PathVariable String v, @PathVariable String typeParis, @PathVariable Double mise) {
			
		//----------------------------------//
		Cote cote = coteService.getCote(d, v);	
		//----------------------------------// 
		
		double coteParis = 0;
		switch(typeParis) {
			case "1" : 
				coteParis = cote.getC1();
				break;
			case "N" : 
				coteParis = cote.getCn();
				break;
			case "2" : 
				coteParis = cote.getC2();				
		}

		return new Paris(d, v, coteParis, typeParis, mise, mise * coteParis, cote.getPort());
	}
  }