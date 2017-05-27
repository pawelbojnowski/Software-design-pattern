package pl.pb.designpattern.command;

public class Main {

    public static void main(String[] args) {

        Command commandBefore = new Command() {
            public void execute() {
                System.out.println("Execute before");
            }
        };
        Command commandAfter = new Command() {
            public void execute() {
                System.out.println("Execute after");
            }
        };

        final Logger a = new Logger();
        a.setExecuteBefore(commandBefore);
        a.setExecuteAfter(commandAfter);
        a.addMessageToLog("Now application do something important...");

        System.out.println("-----------------------------------------");


        Logger b = new Logger();
        b.setExecuteBefore(() -> System.out.println("Execute before"));
        b.setExecuteAfter(() -> System.out.println("Execute after"));
        b.addMessageToLog("Now application do something important...");


    }
}
