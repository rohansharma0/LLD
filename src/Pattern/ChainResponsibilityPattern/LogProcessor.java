package Pattern.ChainResponsibilityPattern;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLoggerProcessor;

    public LogProcessor(LogProcessor logProcessor){
        this.nextLoggerProcessor = logProcessor;
    }

    public void log(int logLevel , String msg){
        if(this.nextLoggerProcessor != null){
            nextLoggerProcessor.log(logLevel , msg);
        }
    }
}
