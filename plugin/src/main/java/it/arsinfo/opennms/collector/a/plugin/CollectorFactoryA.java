package it.arsinfo.opennms.collector.a.plugin;


public class CollectorFactoryA extends AbstractCollectorFactory<CollectorA> {

    public CollectorFactoryA() {
        super();
    }

    @Override
    public CollectorA createCollector() {
        return new CollectorA();
    }

    @Override
    public String getCollectorClassName() {
        return CollectorA.class.getCanonicalName();
    }

}
