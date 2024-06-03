package in.co.Basic;


public class Task {

    public static void main(String[] args) {
        String[] s = {"chetan", "chetan", "shruti"};
        int count = 0;
        for (String s1 : s) {
            String s3 = s1.toLowerCase();
            for (char a = 'a'; a <= 'z'; a++) {
                for (int i = 0; i < s3.length(); i++)
                    if (a == s3.charAt(i)) {
                        count++;
                    }
                if (count != 0) {
                    System.out.println(a + "= " + count + " ");
                    count = 0;
                }


            }
        }
    }
}

