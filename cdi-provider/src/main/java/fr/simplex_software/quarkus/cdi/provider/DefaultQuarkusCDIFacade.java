package fr.simplex_software.quarkus.cdi.provider;

//import fr.simplex_software.quarkus.cdi.api.*;
import jakarta.enterprise.context.*;

@ApplicationScoped
public class DefaultQuarkusCDIFacade //implements QuarkusCDIFacade
{
  //@Override
  public String sayHello(String toWhom)
  {
    return "Hello " + toWhom;
  }
}
