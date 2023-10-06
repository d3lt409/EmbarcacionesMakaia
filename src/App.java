import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void printCaptainsEnum(List<Captain> captains) {
        System.out.println("----------------");
        for (int i = 0; i < captains.size(); i++) {
            System.out.println((i + 1) + ". " + captains.get(i));
        }
        System.out.println("----------------");
    }

    public static void printBoatsEnum(List<Boat> boats) {
        System.out.println("----------------");
        for (int i = 0; i < boats.size(); i++) {
            System.out.println((i + 1) + ". " + boats.get(i));
        }
        System.out.println("----------------");
    }

    public static void printYachtEnum(List<Yacht> boats) {
        System.out.println("----------------");
        for (int i = 0; i < boats.size(); i++) {
            System.out.println((i + 1) + ". " + boats.get(i));
        }
        System.out.println("----------------");
    }

    public static void printSailboatEnum(List<Sailboat> boats) {
        System.out.println("----------------");
        for (int i = 0; i < boats.size(); i++) {
            System.out.println((i + 1) + ". " + boats.get(i));
        }
        System.out.println("----------------");
    }

    public static void printSales(List<Sale> sales) {
        System.out.println("----------------");
        for (int i = 0; i < sales.size(); i++) {
            System.out.println((i + 1) + ". " + sales.get(i));
        }
        System.out.println("----------------");
    }

    public static void main(String[] args) throws Exception {
        Captain captainYacht = new Captain("Manuel", "Fernandez", 1121216);
        Captain captainSailboat = new Captain("Nazly", "Zambrano", 1032459);

        Yacht yacht = new Yacht(captainYacht, 2000000, 2023, 5, 2);
        Sailboat sailboat = new Sailboat(captainSailboat, 1500000, 2020, 2, 4);

        Store store = new Store(yacht);
        store.addBoat(sailboat);

        int option = 0;

        try (Scanner inScanner = new Scanner(System.in)) {
            do {
                System.out.println("\n\t\t--------------------------------");
                System.out.println("\t\tBienvenido  !!!");
                System.out.println("\t\t--------------------------------");

                System.out.println("\t\t1. Ingresar Yate");
                System.out.println("\t\t2. Ingresar Velero");
                System.out.println("\t\t3. Vender Yate");
                System.out.println("\t\t4. Alquilar Velero");
                System.out.println("\t\t5. Ver yates disponibles");
                System.out.println("\t\t6. Ver Veleros disponibles");
                System.out.println("\t\t7. Ver ventas");

                System.out.println("\t\t--------------------------------");
                System.out.println("\t\t8. Ingresar Capitán");
                System.out.println("\t\t--------------------------------");
                System.out.println("\t\tPara salir otro numero");
                System.out.println("\t\t--------------------------------");
                System.out.println("");
                System.out.print("Ingrese la opción : ");
                try {
                    option = inScanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.print("\n\t  Ingrese una opción válida :p \n ");
                    inScanner.nextLine(); // Limpiar el buffer
                    option = 0;
                    continue;
                }
                switch (option) {
                    case 1:
                        if (!store.getAvailableCaptains().isEmpty()) {
                            try {
                                inScanner.nextInt();
                                printCaptainsEnum(store.getAvailableCaptains());
                                System.out.print("Seleccione el capitán para el yate > ");
                                int ix = inScanner.nextInt();
                                Captain captain = store.getAvailableCaptains().get(ix - 1);
                                inScanner.nextDouble();
                                System.out.println("");
                                System.out.println("Ingrese el precio base del yate");
                                double price = inScanner.nextDouble();
                                System.out.println("Ingrese el año de fabricacion");
                                int year = inScanner.nextInt();
                                System.out.println("Ingrese la longitud de la Eslora");
                                float length = inScanner.nextFloat();
                                System.out.println("Ingrese el número de camarotes");
                                int cabinsNumber = inScanner.nextInt();
                                store.addBoat(new Yacht(captain, price, year, length, cabinsNumber));
                                System.out.println("\n\tYate ingresado correctamente !!");
                            } catch (InputMismatchException e) {
                                // TODO: handle exception
                                System.out.println("\n\tTiene que ingresar valores correctamente");
                            }
                        } else {
                            System.out.println("\n\tNo tienes capitanes disponibles");
                        }

                        break;

                    case 2:
                        if (!store.getAvailableCaptains().isEmpty()) {
                            try {
                                inScanner.nextInt();
                                printCaptainsEnum(store.getAvailableCaptains());
                                System.out.print("Seleccione el capitán para el yate > ");
                                int ix = inScanner.nextInt();
                                Captain captain = store.getAvailableCaptains().get(ix - 1);
                                inScanner.nextDouble();
                                System.out.println("");
                                System.out.println("Ingrese el precio base del velero");
                                double price = inScanner.nextDouble();
                                System.out.println("Ingrese el año de fabricacion");
                                int year = inScanner.nextInt();
                                System.out.println("Ingrese la longitud de la Eslora");
                                float length = inScanner.nextFloat();
                                System.out.println("Ingrese el número de mástiles");
                                int cabinsNumber = inScanner.nextInt();
                                store.addBoat(new Sailboat(captain, price, year, length, cabinsNumber));
                                System.out.println("\n\tVelero ingresado correctamente !!");
                            } catch (InputMismatchException e) {
                                // TODO: handle exception
                                System.out.println("\n\tTiene que ingresar valores correctamente");
                            }
                        } else {
                            System.out.println("\n\tNo tienes capitanes disponibles");
                        }
                        break;
                    case 3:
                        if (!store.getAvailableYacht().isEmpty()) {
                            System.out.println("--------------------------------");
                            System.out.println("Lista de yates");
                            printYachtEnum(store.getAvailableYacht());
                            System.out.println("Seleccione el yate");
                            int ix = inScanner.nextInt();
                            Yacht yachtSale = store.getAvailableYacht().get(ix - 1);
                            inScanner.nextLine();
                            System.out.print("Ingrese el nombre del comprador > ");
                            String name = inScanner.nextLine();
                            System.out.print("Ingrese el apellido del comprador > ");
                            String lastName = inScanner.nextLine();
                            store.buyYacht(new Person(name, lastName), yachtSale);
                            System.out.println("Acabas de vender un yate " + yachtSale.validate());

                        } else {
                            System.out.println("No hay yates disponibles");
                        }
                        break;
                    case 4:
                        if (!store.getAvailableSailboat().isEmpty()) {
                            System.out.println("--------------------------------");
                            System.out.println("Lista de Veleros");
                            printSailboatEnum(store.getAvailableSailboat());
                            System.out.println("Seleccione el velero");
                            int ix = inScanner.nextInt();
                            Yacht yachtSale = store.getAvailableYacht().get(ix - 1);
                            inScanner.nextLine();
                            System.out.print("Ingrese el nombre del comprador > ");
                            String name = inScanner.nextLine();
                            System.out.print("Ingrese el apellido del comprador > ");
                            String lastName = inScanner.nextLine();
                            store.buyYacht(new Person(name, lastName), yachtSale);
                            System.out.println("Acabas de rentar un velero " + yachtSale.validate()
                                    + ", con un precio total de " + yachtSale.basePrice + yachtSale.aditionalPrice);

                        } else {
                            System.out.println("No hay veleros disponibles");
                        }
                        break;
                    case 5:
                        System.out.println("--------------------------------");
                        System.out.println("Lista de yates");
                        printYachtEnum(store.getAvailableYacht());
                        break;
                    case 6:
                        System.out.println("--------------------------------");
                        System.out.println("Lista de Veleros");
                        printSailboatEnum(store.getAvailableSailboat());
                        break;

                    case 7:
                        System.out.println("--------------------------------");
                        System.out.println("Historial de ventas");
                        printSales(store.getSales());
                        break;

                    case 8:

                        try {
                            inScanner.nextLine();
                            printCaptainsEnum(store.getAvailableCaptains());
                            System.out.print("ingrese el nombre del capitán > ");
                            String name = inScanner.nextLine();
                            System.out.print("ingrese el apellido del capitán > ");
                            String lastName = inScanner.nextLine();
                            System.out.println("Ingrese el número de matricula");
                            int id = inScanner.nextInt();
                            store.addCaptain(new Captain(name, lastName, id));
                            System.out.println("\n\tCapitán a bordo !!");
                        } catch (InputMismatchException e) {
                            // TODO: handle exception
                            System.out.println("\n\tTiene que ingresar valores correctamente");
                        }

                        break;
                    default:
                        option = -1;
                }
            } while (option != -1);
        }
    }

}
