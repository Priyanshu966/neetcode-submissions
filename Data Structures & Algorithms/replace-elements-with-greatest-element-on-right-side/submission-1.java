class Solution {
    public int[] replaceElements(int[] arr) {

        int max = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            int temp = arr[i];

            arr[i] = max;

            if(temp > max){
                max = temp;
            }
            if(i == arr.length - 1){
                arr[i] = -1;
                continue;
            }

            
        }

        return arr;
        
    }
}