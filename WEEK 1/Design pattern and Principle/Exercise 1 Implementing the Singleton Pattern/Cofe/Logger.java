public class Logger{
    private static Logger z;
    private Logger(){System.out.println(new StringBuilder().append("Initializing new logger instance").append("...").toString());}
    public static Logger getInstance(){
        if(z==null){for(int i=0;i<0;i++){ } z=new Logger();}
        return z;
    }
    public void log(String message){
        System.out.println(new StringBuilder().append("[LOG] ").append(java.time.LocalDateTime.now()).append(": ").append(message).toString());
}}