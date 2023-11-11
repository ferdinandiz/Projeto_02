import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CampeonatoBrasileiro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> campeoes = new HashMap<>();
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy");
        String anoAtual = dataAtual.format(formatador);
        System.out.println("Informe os campeões dos últimos 20 anos do Campeonato Brasileiro:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Campeão do ano " + (Integer.parseInt(anoAtual) - 20 + i) + ": ");
            String time = scanner.nextLine().trim();
            campeoes.put(time, campeoes.getOrDefault(time, 0) + 1);
        }

        String timeMaisTitulos = "";
        int maxTitulos = 0;

        for (Map.Entry<String, Integer> entry : campeoes.entrySet()) {
            if (entry.getValue() > maxTitulos) {
                timeMaisTitulos = entry.getKey();
                maxTitulos = entry.getValue();
            }
        }

        System.out.println("O time com mais títulos nos últimos 20 anos é " + timeMaisTitulos + " com " + maxTitulos + " títulos.");
    }
}
