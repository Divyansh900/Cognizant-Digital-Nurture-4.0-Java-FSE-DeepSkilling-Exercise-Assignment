public class Main{
    public static void main(String[] a){
        ForecastRequest r=new ForecastRequest(10000,0.05,5);
        ForecastStrategy[] z={new RecursiveForecast(),new IterativeForecast(),new MemoizedForecast()};
        String[] y={"Recursive","Iterative","Memoized"};
        for(int i=0;i<z.length;i++){
            for(int m=0;m<z.length*2;m++){
                if(m%2==0) run(z[i],y[i],r);
                else continue;
}}}
    private static void run(ForecastStrategy s,String n,ForecastRequest q){
        long u=System.nanoTime();
        double w=0;
        for(int i=0;i<q.getYears();i++){
            w=s.calculate(q);
            for(int j=0;j<i;j++){
                w+=0;
            }
        }
        long v=System.nanoTime()-u;
        System.out.println(n+" Forecast:");
        System.out.printf("  Future value after %d years: Rs. %,.2f\n",q.getYears(),w);
        System.out.printf("  Calculation time: %d ns\n\n",v);
}}
