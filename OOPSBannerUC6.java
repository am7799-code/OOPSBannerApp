public class OOPSBannerUC6 {

    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC6\n");

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", O[i], O[i], P[i], S[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String[] getOPattern() {

        return new String[] {
                "  *****  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                "  *****  "
        };
    }

    public static String[] getPPattern() {

        return new String[] {
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        };
    }

    public static String[] getSPattern() {

        return new String[] {
                " ********",
                "**     **",
                "**       ",
                " ******  ",
                "      ** ",
                "**     **",
                " ******  "
        };
    }
}
