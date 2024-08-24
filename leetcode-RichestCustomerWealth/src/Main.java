public class Main {
    public static int maximumWealth(int[][] accounts) {
        int WealthyMan = 0;
        for (int i = 0; i < accounts.length ; i++) {
            int thisMan = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                thisMan += accounts[i][j];
            }
            if (thisMan > WealthyMan) WealthyMan = thisMan;
        }
        return WealthyMan;
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int[][] arr1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] arr2 = {{6, 59, 64, 19, 30, 76, 71, 86, 90, 25, 56, 17, 19, 72, 61, 56, 24, 40, 35, 39, 67, 28, 52, 11, 82, 72, 8, 82, 81, 47}};

        System.out.println("Started");
        int Result = maximumWealth(arr);
        System.out.println(Result);
        int Result1 = maximumWealth(arr1);
        System.out.println(Result1);
        int Result2 = maximumWealth(arr2);
        System.out.println(Result2);

        // for (int number : Result) {
        //     System.out.print(number);
        // }
    }

    public static <T> void p(T data) {
        System.out.print(data);
    }

    public static <T> void pln(T data) {
        System.out.println(data);
    }
}

