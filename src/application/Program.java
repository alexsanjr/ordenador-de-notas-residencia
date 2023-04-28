package application;

import entities.Candidate;
import util.CandidateComparator;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String path = "notas.txt";
        File file = new File(path);
        String outPath = "notas-ordenadas.txt";

        List<Candidate> candidates = new ArrayList<>();

        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();

            while (line != null) {
                String[] l = line.split(" ");
                String grade = l[l.length - 1];

                if (!grade.equals("FALTOU")) {
                    String name = l[1] + " " + l[2];
                    LocalDate birthdate = LocalDate.parse(l[l.length - 5], fm);
                    int pSus =  Integer.parseInt(l[l.length - 4]);
                    int cGen = Integer.parseInt(l[l.length - 3]);
                    int efc = Integer.parseInt(l[l.length - 2]);
                    candidates.add(new Candidate(name, birthdate, pSus, cGen, efc, Integer.parseInt(grade)));
                }

                line = br.readLine();
            }
            candidates.sort(new CandidateComparator());

            int n = 1;
            for (Candidate c :
                    candidates) {
                System.out.print(n + "° ");
                System.out.println(c);
                n++;
            }
            n = 1;
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))) {
                for (Candidate c : candidates) {
                    bw.write(n + "° " + c.toString());
                    bw.newLine();
                    n++;
                }
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
