public class DecToHEX {
    static public void main(String[] args) {

        System.out.println(convert(648466484));
    }

    static String convert(int decimal) {
        if (decimal < 0) {
            return new String("argument is less than zero");
        }
        StringBuilder hexNumber = new StringBuilder();
        do {
            int tetrada = decimal & 0x0f;
            if (tetrada < 10) {
                hexNumber.insert(0, tetrada);
            } else {
                hexNumber.insert(0, (char) ('a' + tetrada - 10));
            }
            decimal = decimal >> 4;
        } while (decimal > 0);
        return new String("0x" + hexNumber);
    }
}