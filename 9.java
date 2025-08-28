class Problem7 {
    public static boolean Find(String []a, String b){
        for(int i =0 ; i<a.length; i++){
            if(a[i].equals(b)){
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        String []a = { "Sehal","Gopal" , "Vishnu","Naman","Mayank"};
        String b = "Sehal";
        System.out.print(Find(a,b));
    }
}
