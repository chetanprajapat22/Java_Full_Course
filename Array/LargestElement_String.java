package in.co.Array;

public class LargestElement_String {
//    public static String getLargest(String[] words){
//        String largest = String.valueOf(Integer.MIN_VALUE);
//        for (int i=0;i<words.length;i++){
//            if (words[i].compareTo(largest)>0){
//                largest = words[i];
//            }
//        }
//        return largest;
//    }
//    public static void main(String[] args) {
//        String[] words  = {"chetan","vishal","Nirmal","Sonu","Pankaj"};
//        System.out.println("Largest value is: " + getLargest(words));

    public static void main(String[] args) {
        String words[] = { "apple","banana ","cherry","date","elderbery","fig","grape"};
        String largest = words[0];

        for (int i=1;i< words.length;i++){
            if (words[i].compareTo(largest)>0){
                largest = words[i];
            }
        }
        System.out.println("the largest value of String : " + largest);

    }
}
