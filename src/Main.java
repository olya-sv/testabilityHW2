public class Main {

    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double index = 0;
        int result = (int) bmi.calculate(index);
        System.out.println(result);
    }
}
