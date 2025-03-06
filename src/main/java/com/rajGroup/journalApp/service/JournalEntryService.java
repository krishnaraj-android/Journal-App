package com.rajGroup.journalApp.service;

import com.rajGroup.journalApp.JournalEntry.JournalEntry;
import com.rajGroup.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
    @Autowired //dipendency injection ho rha hai
    private JournalEntryRepository jopurnalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        jopurnalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return jopurnalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findByID(ObjectId id){
        return jopurnalEntryRepository.findById(id);
    }

    public void deletebyId(ObjectId id){
        jopurnalEntryRepository.deleteById(id);
    }
}