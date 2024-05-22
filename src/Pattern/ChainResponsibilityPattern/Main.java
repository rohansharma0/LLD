package Pattern.ChainResponsibilityPattern;

public class Main {
    public static void main(String[] args) {

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR , "exception happens");
        logProcessor.log(LogProcessor.DEBUG , "Need to debug this");
        logProcessor.log(LogProcessor.INFO , "just for info");
    }
}
