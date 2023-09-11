public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 178;
        int weight = 74;
        int BMI = service.calculate(height, weight);
        System.out.println(BMI);

    }

}
