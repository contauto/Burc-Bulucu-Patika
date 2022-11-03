import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğduğunuz günü giriniz.");
        int day = scanner.nextInt();

        System.out.println("Doğduğunuz ayı giriniz.");
        int month = scanner.nextInt();

        String horoscope = "";

        if (month == 1) {
            if (day <= 21) {
                horoscope = "Oğlak";
            } else if (day > 21 && day < 32) {
                horoscope = "Kova";
            }
        }

        if (month == 2) {
            if (day <= 19) {
                horoscope = "Kova";
            } else if (day > 19 && day < 30) {
                horoscope = "Balık";
            }
        }

        if (month == 3) {
            if (day <= 20) {
                horoscope = "Balık";
            } else if (day > 20 && day < 32) {
                horoscope = "Koç";
            }
        }

        if (month == 4) {
            if (day <= 20) {
                horoscope = "Koç";
            } else if (day > 20 && day < 31) {
                horoscope = "Boğa";
            }
        }

        if (month == 5) {
            if (day <= 21) {
                horoscope = "Boğa";
            } else if (day > 21 && day < 32) {
                horoscope = "İkizler";
            }
        }

        if (month == 6) {
            if (day <= 22) {
                horoscope = "İkizler";
            } else if (day > 22 && day < 31) {
                horoscope = "Yengeç";
            }
        }

        if (month == 7) {
            if (day <= 22) {
                horoscope = "Yengeç";
            } else if (day > 22 && day < 32) {
                horoscope = "Aslan";
            }
        }

        if (month == 8) {
            if (day <= 22) {
                horoscope = "Aslan";
            } else if (day > 22 && day < 32) {
                horoscope = "Başak";
            }
        }

        if (month == 9) {
            if (day <= 22) {
                horoscope = "Başak";
            } else if (day > 22 && day < 31) {
                horoscope = "Terazi";
            }
        }

        if (month == 10) {
            if (day <= 22) {
                horoscope = "Terazi";
            } else if (day > 22 && day < 32) {
                horoscope = "Akrep";
            }
        }

        if (month == 11) {
            if (day <= 21) {
                horoscope = "Akrep";
            } else if (day > 21 && day < 31) {
                horoscope = "Yay";
            }
        }

        if (month == 12) {
            if (day <= 21) {
                horoscope = "Yay";
            } else if (day > 21 && day < 32) {
                horoscope = "Oğlak";
            }
        }

        if (horoscope.isEmpty()) {
            System.out.println("Hatalı Giriş.");
        } else {
            System.out.println("Burcunuz " + horoscope + ".");
        }


    }
}
