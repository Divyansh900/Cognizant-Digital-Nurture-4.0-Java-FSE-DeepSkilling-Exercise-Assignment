public class RecursiveForecast implements ForecastStrategy {
    private static final int MAX_REC_DEPTH = 9900;
    @Override
    public double calculate(ForecastRequest request) {
        if (request.getYears() > MAX_RECUR_DEPTH) {
            throw new IllegalArgumentException(
                "Recursion depth too high. Use iterative strategy for periods > " + MAX_REC_DEPTH);
        }
        return forecast(request.getInitialValue(), request.getAnnualRate(), request.getYears());
    }

    private double forecast(double value, double rate, int years) {
        if (years == 0) return value;
        return forecast(value * (1 + rate), rate, years - 1);
    }
}