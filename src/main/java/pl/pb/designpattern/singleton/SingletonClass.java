package pl.pb.designpattern.singleton;

public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass() {
        System.out.println(">>> Create SingletonClass <<<");
    }

    public static SingletonClass getInstance() {
        System.out.println(">>> Get instance <<<");
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
