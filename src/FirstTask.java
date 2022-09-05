import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] room1 = coords(scanner.nextLine());
        int[] room2 = coords(scanner.nextLine());

        int xMax, xMin, yMin, yMax;
        xMax = Math.max(room1[2], room2[2]);
        xMin = Math.min(room1[0], room2[0]);
        yMax = Math.max(room1[3], room2[3]);
        yMin = Math.min(room1[1], room2[1]);
        int side = Math.max((xMax - xMin), (yMax - yMin));
        System.out.println((int) Math.pow(side, 2));
    }

    public static int[] coords(String room) {
        String[] coordinatesStr = room.split(" ");
        int[] coordinatesInt = new int[4];
        for (int i = 0; i < 4; i++) {
            coordinatesInt[i] = Integer.parseInt(coordinatesStr[i]);
        }
        return coordinatesInt;
    }
}
