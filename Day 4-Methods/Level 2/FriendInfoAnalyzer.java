import java.util.*;

public class FriendInfoAnalyzer {
    public static int youngest(int[] age) {
        int young = 0;
        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[young]) {
                young = i;
            }
        }
        return young;
    }

    public static int tallest(int[] height) {
        int tall = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[tall]) {
                tall = i;
            }
        }
        return tall;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        String[] name = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of friend " + name[i]);
            age[i] = input.nextInt();
            System.out.println("Enter the height of friend " + name[i]);
            height[i] = input.nextInt();
        }

        int youngestIndex = youngest(age);
        String youngestFriend = name[youngestIndex];
        System.out.println("The youngest friend is " + youngestFriend);

        int tallIndex = tallest(height);
        String tallestFriend = name[tallIndex];
        System.out.println("The tallest friend is " + tallestFriend);

        input.close();
    }
}
