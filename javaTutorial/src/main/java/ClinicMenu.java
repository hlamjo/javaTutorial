import java.util.Scanner;

public class ClinicMenu {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String action = "";
        String nameOfClient;
        String nameOfPet;
        String typeOfPet;

        Client aClient;

        int result;
        Clinic clinic = new Clinic(100);

        while(!action.equals("6")) {
            System.out.println("=====================");
            System.out.println("Choose action:      |");
            System.out.println("1)Add client        |");
            System.out.println("2)Remove client     |");
            System.out.println("3)Search client     |");
            System.out.println("4)Edit client       |");
            System.out.println("5)Print all clients |");
            System.out.println("6)Exit              |");
            System.out.println("=====================");

            action = sc.next();

            switch (action){
                case "1":
                    System.out.print("Name of client: ");
                    nameOfClient = sc.next();
                    System.out.print("Name of pet: ");
                    nameOfPet = sc.next();
                    System.out.print("Type of pet: ");
                    typeOfPet = sc.next();

                    clinic.addClient(new Client(nameOfClient, new Pet(nameOfPet, typeOfPet)));
                    break;
                case "2":
                    System.out.print("Name of client: ");
                    nameOfClient = sc.next();
                    clinic.removeClient(nameOfClient);
                    break;
                case "3":
                    System.out.print("Name of client: ");
                    nameOfClient = sc.next();
                    result = clinic.searchClient(nameOfClient);
                    if(result != -1){
                        System.out.println(clinic.clients[result].print());
                    } else {
                        System.out.println("There is no such client");
                    }
                    break;
                case "4":
                    System.out.print("Name of client: ");
                    nameOfClient = sc.next();
                    result = clinic.searchClient(nameOfClient);
                    if(result != -1){
                        System.out.print("Name of pet: ");
                        nameOfPet = sc.next();
                        System.out.print("Type of pet: ");
                        typeOfPet = sc.next();
                        clinic.editClient(new Client(nameOfClient,new Pet(nameOfPet,typeOfPet)), result);
                        System.out.println("There client has been edited");
                    } else {
                        System.out.println("There is no such client");
                    }
                    break;
                case "5":
                    clinic.printAllClients();
                    break;
            }


        }
    }
}
