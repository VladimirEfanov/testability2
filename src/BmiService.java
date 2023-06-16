public class BmiService {
    public int calculate(int weight, double hight) {
        int bmi = (int) (weight / (hight * hight));
        return bmi;
    }
}

