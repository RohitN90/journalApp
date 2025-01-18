package com.vadhuSolutions.journarlApp.Controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vadhuSolutions.journarlApp.Entity.Journal;

@RestController
@RequestMapping("/journal")
public class EntryController {
    
    private Map<Long, Journal> entry = new HashMap<>(); 

    @GetMapping
    public List<Journal> alljournals(){
        return new ArrayList<>(entry.values());
    }


    @PostMapping
    public boolean addjournal(@RequestBody Journal journalEntry){
        entry.put(journalEntry.getId(), journalEntry);
        return true;
    }

    @GetMapping("/id/{id}")
    public Journal getById(@PathVariable Long id){
        return entry.get(id);
    }


    @PutMapping("/id/{id}")
    public boolean updateId(@PathVariable Long id, @RequestBody Journal newEntry){
        entry.put(id, newEntry);
        return true;
    }

    @DeleteMapping("/id/{id}")
    public boolean deleteJournal(@PathVariable Long id){
        entry.remove(id);
        return true;
    }
}
