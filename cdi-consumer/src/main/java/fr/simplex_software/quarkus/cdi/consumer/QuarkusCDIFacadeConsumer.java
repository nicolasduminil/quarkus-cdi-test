package fr.simplex_software.quarkus.cdi.consumer;

import fr.simplex_software.quarkus.cdi.api.*;
import jakarta.enterprise.context.*;
import jakarta.inject.*;

@ApplicationScoped
public class QuarkusCDIFacadeConsumer
{
  @Inject
  QuarkusCDIFacade uarkusCDIFacade;
}
