public class DollarFigure {
    public static void main(String[] args) {
        for (int row = 0; row<7; row++) {
            String str = "";
            for (int stars = 0; stars < row; stars++) {
                str += "**";
            }

            for (int dollars = 7-row; dollars > 0; dollars--) {
                str += "$";
            }

            for (int stars = 7-row; stars > 0; stars--) {
                str += "*";
            }

            for (int chr = str.length(); chr > 0; chr--) {
                str += str.charAt(chr-1);
            }
            System.out.println(str);
        }
    }
}
