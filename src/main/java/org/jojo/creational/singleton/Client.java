package org.jojo.creational.singleton;

public class Client {

    public static void main(String[] args) {

        EagerRegistry registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();

        LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyRegistryWithDCL1 = LazyRegistryWithDCL.getInstance();
        System.out.println(lazyRegistryWithDCL == lazyRegistryWithDCL1);

        LazyRegistryIODH singleton;
        singleton = LazyRegistryIODH.getInstance();
    }

}
