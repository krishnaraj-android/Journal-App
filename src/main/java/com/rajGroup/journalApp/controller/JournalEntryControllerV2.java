package com.rajGroup.journalApp.controller;

import com.rajGroup.journalApp.JournalEntry.JournalEntry;
import com.rajGroup.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired   //inject kr diye yaha matlab kisi v class k object ko use kr skte hai
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myId){

        return journalEntryService.findByID(myId).orElse(null);
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;

    }
    @DeleteMapping("id/{myid}")
    public Boolean deleteJournalEntryById(@PathVariable ObjectId myid){
        journalEntryService.deletebyId(myid);
        return true;
    }

    @PutMapping("id/{id}")
    public JournalEntry updateJournalEntryNyId(@PathVariable ObjectId id,@RequestBody JournalEntry newEntry){
        JournalEntry old=journalEntryService.findByID(id).orElse(null);
        if(old!=null){
            old.setTitle(newEntry.getTitle()!=null && !newEntry.equals("")?newEntry.getTitle():old.getTitle());
            old.setContent(newEntry.getContent()!=null && !newEntry.equals("") ? newEntry.getContent():old.getContent());
        }
        journalEntryService.saveEntry(old);
        return null;
    }
}
