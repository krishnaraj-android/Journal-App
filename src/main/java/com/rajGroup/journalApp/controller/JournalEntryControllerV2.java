package com.rajGroup.journalApp.controller;

import com.rajGroup.journalApp.JournalEntry.JournalEntry;
import com.rajGroup.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired   //inject kr diye yaha
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long myId){
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return true;

    }
    @DeleteMapping("id/{id}")
    public JournalEntry deleteJournalEntryById(@PathVariable long id){
        return null;
    }

    @PutMapping("id/{id}")
    public JournalEntry updateJournalEntryNyId(@PathVariable long id,@RequestBody JournalEntry myEntry){
        return null;
    }
}
