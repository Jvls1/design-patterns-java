package org.jojo.creational.abstractfactory.aws;

import org.jojo.creational.abstractfactory.Instance;
import org.jojo.creational.abstractfactory.ResourceFactory;
import org.jojo.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
