package com.example.journalApp.controller;

import com.example.journalApp.controller.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/journal")
@RestController
public class JournalEntryController {
    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getall(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myentry){
        journalEntries.put(myentry.getId(), myentry);
        return true;
    }

    @GetMapping("id/{myid}")
    public JournalEntry journalentriesbyid(@PathVariable long myid){
        return journalEntries.get(myid);
    }

    @DeleteMapping("id/{myid}")
    public boolean deleatingbyid(@PathVariable long myid){
        journalEntries.remove(myid);
        return true;
    }

    @PutMapping("id/{myid}")
    public JournalEntry updatebyid(@PathVariable long myid, @RequestBody JournalEntry myentry){
        return journalEntries.put(myentry.getId(),myentry);
    }
}
