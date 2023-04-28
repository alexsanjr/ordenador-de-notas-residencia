package util;

import entities.Candidate;

import java.util.Comparator;

public class CandidateComparator implements Comparator<Candidate> {

    @Override
    public int compare(Candidate c1, Candidate c2) {
        if (c1.getGrade().compareTo(c2.getGrade()) == 0) {
            if (c1.getEfc().compareTo(c2.getEfc()) == 0) {
                if (c1.getcGen().compareTo(c2.getcGen()) == 0) {
                    if (c1.getpSus().compareTo(c2.getpSus()) == 0) {
                        return c1.getBirthDate().compareTo(c2.getBirthDate());
                    }
                    return -c1.getpSus().compareTo(c2.getpSus());
                }
                return -c1.getcGen().compareTo(c2.getcGen());
            }
            return -c1.getEfc().compareTo(c2.getEfc());
        }
        return -c1.getGrade().compareTo(c2.getGrade());
    }
}
