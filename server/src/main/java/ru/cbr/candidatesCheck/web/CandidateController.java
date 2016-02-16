package ru.cbr.candidatesCheck.web;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.cbr.candidatesCheck.domen.Candidate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/candidate")
public class CandidateController {
    private ArrayList<Candidate> candidates = new ArrayList<>();

    public CandidateController() {
        candidates.add(new Candidate("Иван","Иванов"));
        candidates.add(new Candidate("Петр","Петров"));
        candidates.add(new Candidate("Василий","Васичкин"));
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Candidate> candidate(){
        return candidates;
    }

    @RequestMapping(method = RequestMethod.POST)
    Candidate add(@RequestBody Candidate candidate){
        candidates.add(candidate);
        return candidate;
    }
}
