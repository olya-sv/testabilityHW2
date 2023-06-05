public class BmiService {
    double weight = 98;
    double height = 1.87;

    public double calculate(double index) {
        double result = weight / (height * height);
        return result;
    }
}