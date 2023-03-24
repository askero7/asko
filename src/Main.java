public class Main {
    public static void main(String[] args) {
        System.out.println(method(3));

    }


    static boolean method(int a) {
//        int b = 10;
        for (int i = 0; i < a ; i++) {
            int c = a % 2;
            if (c == 0){
               return true;
            }else {
                return false;
            }
        }
        return false;
    }}
