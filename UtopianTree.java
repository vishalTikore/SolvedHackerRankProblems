public class UtopianTree {
    static int utopianTree(int n) {
        int result = 1;
        for (int i =1 ;i<=n;i++){
            if(i%2 != 0){
                result *= 2;
            }
            else{
                result += 1;
            }
        }
        return result;

    }
}
