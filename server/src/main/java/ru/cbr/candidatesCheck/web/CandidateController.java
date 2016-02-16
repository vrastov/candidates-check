package ru.cbr.candidatesCheck.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.cbr.candidatesCheck.domen.Candidate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CandidateController {
    @RequestMapping(value = "/candidate",method = RequestMethod.GET)
    List<Candidate> candidate(){
        ArrayList<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("Иван","Иванов"));
        candidates.add(new Candidate("Петр","Петров"));
        candidates.add(new Candidate("Василий","Васичкин"));
        return candidates;
    }
}
