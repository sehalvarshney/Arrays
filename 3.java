class Problem_1 {
    public static void main(String[] args) {
        int arr[][] = {{2},{4},{3}};
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k++;
                System.out.println(arr[i][j] + " ");
            }
        }
    }
}
