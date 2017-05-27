package pl.pb.designpattern.command;


public class Logger {

    private Command executeBefore;
    private Command executeAfter;

    public void addMessageToLog(String message) {
        if (executeBefore != null) {
            executeBefore.execute();
        }
        System.out.println(message);
        if (executeAfter != null) {
            executeAfter.execute();
        }
    }

    public Command getExecuteBefore() {
        return executeBefore;
    }

    public void setExecuteBefore(Command executeBefore) {
        this.executeBefore = executeBefore;
    }

    public Command getExecuteAfter() {
        return executeAfter;
    }

    public void setExecuteAfter(Command executeAfter) {
        this.executeAfter = executeAfter;
    }
}
