import java.util.ArrayList;

public class ListOfTeamMates {

    public static void main(String[] args) {
        ArrayList<TeamMate> list = new ArrayList<TeamMate>();

        TeamMate primeiroIntegrante = new TeamMate("gui", "Guilherme", true);
        TeamMate segundoIntegrante = new TeamMate("fe", "Fernando", false);
        TeamMate terceiroIntegrante = new TeamMate("helo", "Heloisa", false);

        list.add(primeiroIntegrante);
        list.add(segundoIntegrante);
        list.add(terceiroIntegrante);

        System.out.println("Nome de cada TeamMate armazenado:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }

        System.out.println("\nUserId dos integrantes online:");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getOnline() == true) {
                System.out.println(list.get(i).getUserId());
            }
        }

        TeamMate novoIntegrante = new TeamMate("pedro", "Pedro", true);
        System.out.println("\nAlterando elemento da lista...");
        list.set(0, novoIntegrante);
        System.out.println("Nome de cada TeamMate armazenado:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }


        System.out.println("\nRemovendo todos elementos da lista:");
        list.clear();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}