public class PiSolver {

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                throw new IllegalArgumentException("Exactly one argument required");
            }
            int darts = Integer.parseInt(args[0]);
            System.out.println(estimate(Integer.parseInt(args[0])));
        } catch (NumberFormatException e) {
            System.err.println("Argument must be an integer");

           
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static double estimate(int darts) {
        if (darts < 1) {
            throw new IllegalArgumentException("At least one dart required");
        }
    
        double onBoard = 0;
        for (int i = 0; i < darts; i++) {    
            double x = Math.random();
            double y = Math.random();

            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                onBoard++;
            }
        }
        return ((onBoard / darts) * 4);

    }
}