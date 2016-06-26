package pl.pb.designpattern.abstractfactory;

abstract class AbstractCarFactory extends Ambulance {

    public enum Type {POLICE, AMBULANCE}

    public static AbstractCarFactory getFactory(Type type) {
        if (type == Type.POLICE) {
            return new PoliceCarFactory();
        } else {
            return new AmbulanceFactory();
        }
    }

    public abstract Car createCar();
}
