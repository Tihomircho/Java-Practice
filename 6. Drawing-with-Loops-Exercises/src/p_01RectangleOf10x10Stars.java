public class p_01RectangleOf10x10Stars {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println(repeatStr("*", 10));
        }

    }

    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <count ; i++) {
            sb.append(str);

        }
        return sb.toString();
    }
}

