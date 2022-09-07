import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] nums={-2.3,3.2,1.2,-4.4,3.4,7.6,8.7,1.9,-11.2,22.2,-32.3,54.5,-43.5,56.6,-78.8};
        double beka = 0;
        int mas  = 0;
        boolean bool = false;
        for (double f : nums) {
            if (f < 0) {
                bool = true;
            } else if (bool) {
                beka++;
                mas += f;
            }
        }
        System.out.println(beka / mas);
    }
}
