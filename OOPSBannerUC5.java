public class OOPSBannerUC5 {

    public static void main(String[] args) {

        System.out.println("OOPS Banner App - UC5\n");

        String[] banner = {

            String.join(" ",
                    "  *****  ", "  *****  ", "  ****** ", " ********"),

            String.join(" ",
                    " **   ** ", " **   ** ", " **   ** ", "**     **"),

            String.join(" ",
                    " **   ** ", " **   ** ", " **   ** ", "**     **"),

            String.join(" ",
                    " **   ** ", " **   ** ", " ******  ", "  ****** "),

            String.join(" ",
                    " **   ** ", " **   ** ", " **      ", "      ** "),

            String.join(" ",
                    " **   ** ", " **   ** ", " **      ", "      ** "),

            String.join(" ",
                    "  *****  ", "  *****  ", " **       ", " ******  ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
