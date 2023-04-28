package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Candidate {

    private String name;
    private LocalDate birthDate;
    private Integer pSus;
    private Integer cGen;
    private Integer efc;
    private Integer grade;

    public Candidate(String name, LocalDate birthday, Integer pSus, Integer cGen, Integer efc, Integer grade) {
        this.name = name;
        this.birthDate = birthday;
        this.pSus = pSus;
        this.cGen = cGen;
        this.efc = efc;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getpSus() {
        return pSus;
    }

    public void setpSus(Integer pSus) {
        this.pSus = pSus;
    }

    public Integer getcGen() {
        return cGen;
    }

    public void setcGen(Integer cGen) {
        this.cGen = cGen;
    }

    public Integer getEfc() {
        return efc;
    }

    public void setEfc(Integer efc) {
        this.efc = efc;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return  "NOME: " + name +
                ", NASC.: " + birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", PSUS: " + pSus +
                ", CGEN: " + cGen +
                ", EFC: " + efc +
                ", NOTA: " + grade;
    }
}
