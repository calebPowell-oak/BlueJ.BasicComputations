public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] i){
        return (((i[0]>i[1])?i[0]:i[1]) > i[1])?(i[0]>i[1])?i[0]:i[1]:i[1];
    }

    public Integer findLargestNumberUsingMathMax(Integer[] i){
        return Math.max(i[0],Math.max(i[1],i[2]));
    }
}