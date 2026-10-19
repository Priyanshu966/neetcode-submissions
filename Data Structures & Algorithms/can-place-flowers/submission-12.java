class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int dummy[] =  new int[flowerbed.length + 2];

        for(int i = 0; i < flowerbed.length; i++){
            dummy[i + 1] = flowerbed[i];
        }

        for(int i = 1; i < dummy.length - 1; i++){
            if(dummy[i] == 0 && dummy[i - 1] == 0 && dummy[i + 1] == 0){
                dummy[i] = 1;
                n--;
            }
        }
        return n <= 0;
        
    }
}