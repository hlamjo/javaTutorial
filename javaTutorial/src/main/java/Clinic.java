public class Clinic {
    Client[] clients;
    int numberOfClients = 0;

    public Clinic(int numberOfClients) {
        this.clients = new Client[numberOfClients];
    }

    public int searchClient(String name){
        if (numberOfClients > 0) {
            for (int i = 0; i < clients.length; i++) {
                if(clients[i] != null && name.equals(clients[i].name)){
                    return i;
                }
            }
        }
        return -1;
    }

    public void addClient(Client aClient){
        if (searchClient(aClient.name) == -1) {
            for (int i = 0; i < clients.length; i++){
                if (clients[i] == null) {
                    clients[i] = aClient;
                    numberOfClients++;
                    return;
                }
            }
        } else {
            System.out.println("The client already exist");
        }
    }

    public void editClient(Client aClient, int index){
        clients[index] = aClient;
    }


    public void removeClient(String name){
        int result = searchClient(name);
        if (result != -1) {
            clients[result] = null;
            numberOfClients--;
            System.out.println("The client has been deleted");
        } else {
            System.out.println("The client does not exist");
        }
    }


    public void printAllClients(){
        if(numberOfClients == 0){
            System.out.println("There are no clients");
            return;
        }
        for (int i = 0; i < clients.length; i++){
            if(clients[i] != null){
                System.out.println(clients[i].print());
            }

        }


    }
}
