package staticKeyword;

class MethodOverloading {
    public static void main(String[] h) {
        try {
            String s = h[0];
            String s1 = h[1];
            String s2 = h[2];
            String s3 = h[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        int i[] = new int[4];

    }

    /*public static void main(String[] args) {
    }*/
    public static void main(int[] i) {
        try {
            int x = i[0];
            int x1 = i[1];
            int x2 = i[2];
            int x3 = i[3];
            int x4 = i[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
