package ru.cbr.candidatesCheck.service;

import org.springframework.stereotype.Service;
import ru.cbr.candidatesCheck.domen.Candidate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidateService {
    private ArrayList<Candidate> candidates = new ArrayList<>();

    public CandidateService() {
        candidates.add(new Candidate("Иван","Иванов"));
        candidates.add(new Candidate("Петр","Петров"));
        candidates.add(new Candidate("Василий","Васичкин"));
    }

    public List<Candidate> getAll(){
        return candidates;
    }

    public Candidate add(Candidate candidate){
        for (Candidate storedCandidate:candidates){
            if (storedCandidate.equals(candidate)){
                throw new RuntimeException();
            }
        }
        candidates.add(candidate);
        return candidate;
    }
}
