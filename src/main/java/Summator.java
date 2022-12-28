public class Summator {
    public int sum(int lengthArray, int array[]) {

       // if(lengthArray==0) return b[0]; else return b[lengthArray-1]+sum(lengthArray-1, b);
        if(lengthArray <= 0) {
            return 0;
        } else {
            int numberSum = array[lengthArray-1];
            return  numberSum + sum(lengthArray - 1, array);
        }
    }

}
