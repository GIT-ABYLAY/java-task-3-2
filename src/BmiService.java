public class BmiService {
    public int calculate(int height, int weight) {
        int result;
        {
            result = 10000 * weight / height / height;
        }
        return result;
    }

}
