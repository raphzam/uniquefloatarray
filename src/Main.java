public class Main {
    private static boolean uniqueFloat(float[] arr) {

        for (int i = 0; i < arr.length; i++){
            for (int j = 1+i; j < arr.length; j++){
                if (arr[i] == arr[j])
                    return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        float[] arr = {1,3,39,38,7,0,7};

        System.out.println(uniqueFloat(arr));
    }

}
