import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int netflix = 38000;
        int disney = 22988;
        int star = 22988;
        int hbo = 24900;

        System.out.print("Ingrese cuantos puntos de mercadolibre tienes?: ");
        String points = scanner.nextLine();

        int puntos = Integer.parseInt(points);

        System.out.print("¿Deseas adquirir alguna cuenta?: ");
        String result = scanner.nextLine();

        while (result.equals("si")) {

            System.out.print("Que cuenta deseas adquirir de nuestro catalogo?: ");
            String account = scanner.nextLine();

            if (puntos < netflix && account.equalsIgnoreCase("netflix")) {
                System.out.println("NO te alcanza para adquirir netflix");
            } else if (account.equalsIgnoreCase("netflix")) {
                puntos = puntos - netflix;
            } else if (puntos < disney && account.equalsIgnoreCase("disney")) {
                System.out.println("NO te alcanza para adquirir Disney");
            } else if (account.equalsIgnoreCase("disney")) {
                puntos = puntos - disney;
            } else if (puntos < star && account.equalsIgnoreCase("star")) {
                System.out.println("NO te alcanza para adquirir Star");
            } else if (account.equalsIgnoreCase("star")) {
                puntos = puntos - star;
            } else if (puntos < hbo && account.equalsIgnoreCase("hbo")) {
                System.out.println("NO te alcanza para adquirir HBO");
            } else if (account.equalsIgnoreCase("hbo")) {
                puntos = puntos - hbo;
            } else {
                System.out.println("Ingrese una plataforma valida");
            }


            System.out.print("¿Deseas adquirir alguna cuenta?");
            result = scanner.nextLine();
            System.out.println("Te quedaron: " + puntos + " puntos.");
        }
    }
}