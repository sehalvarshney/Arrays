class Problem2 {
        public static ArrayList<Integer> checkPrime(int a){
            ArrayList <Integer> b = new ArrayList<>();

            for(int i = 2 ; i<= a ; i++){
                boolean x = false;
                for(int j = 2 ; j<i ; j++){
                    if(i%j == 0){
                        x = true;
                        break;
                    }
                }
                if(!x){
                    b.add(i);
                }
            }
            return  b;
    }
    public static void main(String[] args) {
        int a = 10;
        System.out.print(checkPrime(a));
    }
}
