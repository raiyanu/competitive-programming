package ArrayPlay;

public class FindingLargestElementInTwoDimensionalArray {
	public static void main(String[] args) {
		System.out.println("------[ S T A R T ]-------");
		int[][] TwoDimensionalArray = {
				{ 3, 5, 7, 2 },
				{ 1, 4, 6, 7 },
				{ 12, 9, 15 }
		};
		int[] PositionOfLargestElement = new int[2];
		int LargestElement = 0;
		for (int i = 0; i < TwoDimensionalArray.length; ++i) {
			for (int j = 0; j < TwoDimensionalArray[i].length; ++j) {
				if (LargestElement < TwoDimensionalArray[i][j]) {
					LargestElement = TwoDimensionalArray[i][j];
					PositionOfLargestElement[0] = i;
					PositionOfLargestElement[1] = j;
				}
			}
		}
		System.out.println("Element: " + LargestElement);
		System.out.println("ElementPositionX: " + PositionOfLargestElement[0] + "  ElementPositionY: "
				+ PositionOfLargestElement[1]);
		System.out.println("------[ E N D ]-----------");
	}
}
