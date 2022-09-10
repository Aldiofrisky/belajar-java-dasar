import java.sql.SQLOutput;

public class Array {

    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Aldio";
        stringArray[1] = "Frisky";
        stringArray[2] = "Frs";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        int[] arrayInt = new int[]{
            1,2,3,4,5,6,7,8,9
        };

        long[] arrayLong = {
            10L, 20L, 30L
        };

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Aldio", "Frisky"},
                {"Raras", "Risia"},
                {"Kunyil"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

    }
}
