public class trafficlight {
    public static void main(String[] args) {
        String currentState = "Red"; // Initial state

        System.out.println("Traffic Light Simulator");
        System.out.println("Current state: " + currentState);

        while (true) {
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (currentState) {
                case "Red":
                    System.out.println("Changing to Yellow");
                    currentState = "Yellow";
                    break;
                case "Yellow":
                    System.out.println("Changing to Green");
                    currentState = "Green";
                    break;
                case "Green":
                    System.out.println("Changing to Red");
                    currentState = "Red";
                    break;
                default:
                    System.out.println("Invalid state");
            }

            System.out.println("Current state: " + currentState);
        }
    }
}
