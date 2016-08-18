package pl.pb.designpattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {

        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        SingletonClass singletonClass3 = SingletonClass.getInstance();

    }
}
