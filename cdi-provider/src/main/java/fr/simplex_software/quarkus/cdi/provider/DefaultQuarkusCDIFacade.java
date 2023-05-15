package fr.simplex_software.quarkus.cdi.provider;

import jakarta.enterprise.context.*;

@ApplicationScoped
public class DefaultQuarkusCDIFacade implements fr.simplex_software.quarkus.cdi.api.QuarkusCDIFacade
{
  @Override
  public String sayHello(String toWhom)
  {
    return "Hello " + toWhom;
  }
}
