class Problem {
    public static void main(String[] args) {
        int []arr_1 = {10,20,30,40,50};
        int []arr_2 = new int[5];
        for (int i = 0; i < arr_1.length; i++) {
            arr_2[i] = i*i;
        }
        System.out.println(Arrays.toString(arr_2));
        System.out.println(Arrays.toString(arr_1));
    }
}
