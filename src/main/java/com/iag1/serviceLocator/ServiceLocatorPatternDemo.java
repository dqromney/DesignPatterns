package com.iag1.serviceLocator;

/**
 * The service locator design pattern is used when we want to locate various services using JNDI lookup. Considering
 * high cost of looking up JNDI for a service, Service Locator pattern makes use of caching technique. For the first
 * time a service is required, Service Locator looks up in JNDI and caches the service object. Further lookup or same
 * service via Service Locator is done in its cache which improves the performance of application to great extent.
 * Following are the entities of this type of design pattern.
 * <p>
 * Service - Actual Service which will process the request. Reference of such service is to be looked upon in JNDI
 * server.
 * <p>
 * Context / Initial Context - JNDI Context carries the reference to service used for lookup purpose.
 * <p>
 * Service Locator - Service Locator is a single point of contact to get services by JNDI lookup caching the services.
 * <p>
 * Cache - Cache to store references of services to reuse them
 * <p>
 * Client - Client is the object that invokes the services via ServiceLocator.
 * <p>
 * Implementation
 * We are going to create a ServiceLocator,InitialContext, Cache, Service as various objects representing our
 * entities.Service1 and Service2 represent concrete services.
 * <p>
 * ServiceLocatorPatternDemo, our demo class, is acting as a client here and will use ServiceLocator to demonstrate
 * Service Locator Design Pattern.
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}