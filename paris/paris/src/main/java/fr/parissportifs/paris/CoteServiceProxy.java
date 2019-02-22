package fr.parissportifs.paris;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="cote-service")
@RibbonClient(name="cote-service")
public interface CoteServiceProxy {
  @GetMapping("/ms-paris-sportifs/foot/{d}/vs/{v}")
  public Cote getCote(@PathVariable("d") String d, @PathVariable("v") String v);
}