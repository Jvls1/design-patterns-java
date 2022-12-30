package org.jojo.creational.abstractfactory.gcp;


import org.jojo.creational.abstractfactory.Instance;
import org.jojo.creational.abstractfactory.ResourceFactory;
import org.jojo.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
