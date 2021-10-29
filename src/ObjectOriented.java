public class ObjectOriented {
    public static void main(String[] args) {
        int[][] myNumbers = {{1,2,3,}, {5,6,7,8}, {9,10, 11} };
        int x = myNumbers [2][2];
        System.out.println(x);
        for(int i = 0; i < myNumbers.length; ++i){
            for(int j = 0; j < myNumbers[i].length;++j){
                int count = 0;
                int sum = 0;
                if(count == 5){
                    count +=i;
                    break;
                }
//                System.out.println(myNumbers[2][0]);
                System.out.println(myNumbers.length);
            }
        }
    }
}
