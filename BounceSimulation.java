
public class BounceSimulation {
    public static void main(String[] args) {
        double height = 300;
        double factor = 0.8;
        double totalDistance = 300;

        while (height >= 0.01) {
            height = height * factor;
            totalDistance += 2 * height;
        }

        System.out.println(totalDistance);
    }
}
