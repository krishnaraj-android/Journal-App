package com.rajGroup.journalApp.controller;

import com.rajGroup.journalApp.JournalEntry.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long,JournalEntry> entries=new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){

        return List.copyOf(entries.values());
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long myId){
        return entries.get(myId);
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        entries.put((long) myEntry.getId(),myEntry);
        return true;

    }
@DeleteMapping("id/{id}")
    public JournalEntry deleteJournalEntryById(@PathVariable long id){
        return entries.remove(id);
    }

   @PutMapping("id/{id}")
   public JournalEntry updateJournalEntryNyId(@PathVariable long id,@RequestBody JournalEntry myEntry){
        return entries.put(id,myEntry);
   }
}
