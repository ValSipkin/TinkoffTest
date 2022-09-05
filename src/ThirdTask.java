import java.util.Scanner;
public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        String[] data = scanner.nextLine().split(" ");

        //  Создадим два массива: подписки и отписки
        int[] subs = new int[days/2 + days%2];
        int[] unsubs = new int[days/2];
        for (int i = 0; i < days; i+=2) {
            subs[i/2] = Integer.parseInt(data[i]);
        }
        for (int i = 1; i < days; i+=2) {
            unsubs[(i-1)/2] = Integer.parseInt(data[i]);
        }
        // Найдем суммы подписок и отписок
        int sumSubs = 0;
        int sumUnsubs = 0;
        for (int s : subs) {
            sumSubs += s;
        }
        for (int u : unsubs) {
            sumUnsubs += u;
        }

        //  Найдем min подписку и max отписку
        int minSub = subs[0];
        int maxUnsub = unsubs[0];
        for (int x : subs) {
            if (x < minSub) {
                minSub = x;
            }
        }
        for (int y : unsubs) {
            if (y > maxUnsub) {
                maxUnsub = y;
            }
        }

        // Возможная прибыль
        if (maxUnsub>minSub) {
            int total = sumSubs - sumUnsubs + 2*(maxUnsub-minSub);
            System.out.println(total);
        } else {
            int total = sumSubs - sumUnsubs;
            System.out.println(total);
        }

    }

}
