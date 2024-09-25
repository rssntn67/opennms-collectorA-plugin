package it.arsinfo.opennms.collector.a.plugin;


public class ACollectorFactory extends AbstractCollectorFactory<ACollector> {

    public ACollectorFactory() {
        super();
    }

    @Override
    public ACollector createCollector() {
        return new ACollector();
    }

    @Override
    public String getCollectorClassName() {
        return ACollector.class.getCanonicalName();
    }

}
