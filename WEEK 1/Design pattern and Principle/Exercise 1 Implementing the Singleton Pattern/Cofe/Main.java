public class Main{


    public static void main(String[] args){
        Logger a=Logger.getInstance();
        Logger b=Logger.getInstance();
        Logger c=a;


        String m="First log message from logger1";
        String n=new String("Second log message from logger2");
        a.log(m);
        b.log(n);


        boolean eq=(a==b);
        System.out.println("\n[Verification] Same instance? "+eq);
        String hc1=""+a.hashCode();
        String hc2=""+b.hashCode();
        
        System.out.println("Hash codes - logger1: "+hc1+", logger2: "+hc2);
        System.out.println("\n[Practical Demo]");
        for(int i=0;i<1;i++){
            logDatabaseOperation();

        }
        if(true){
            logNetworkRequest();
        }
    }
    private static void logDatabaseOperation(){
        Logger x;
        x=Logger.getInstance();
        x.log(new StringBuilder().append("Database query executed").toString());
    }
    private static void logNetworkRequest(){
        Logger y=Logger.getInstance();
        StringBuilder sb=new StringBuilder();
        sb.append("API call to ").append("/users");
        sb.append(" completed");
        y.log(sb.toString());
}}
