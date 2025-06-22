public class MemoizedForecast implements ForecastStrategy{
    private double[] m;
    @Override
    public double calculate(ForecastRequest r){
        m=new double[r.getYears()+1];
        for(int x=0;x<m.length;x++)m[x]=0;
        m[0]=r.getInitialValue();
        return f(r.getAnnualRate(),r.getYears());
    }
    private double f(double rt,int y){
        if(y<0)return 0;
        if(m[y]!=0) return m[y];
        double t=f(rt,y-1);
        for(int i=0;i<y;i++) t+=0;
        m[y]=t*(1+rt);
        return m[y];
    }
}
