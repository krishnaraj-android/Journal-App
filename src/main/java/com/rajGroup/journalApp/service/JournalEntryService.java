package com.rajGroup.journalApp.service;

import com.rajGroup.journalApp.JournalEntry.JournalEntry;
import com.rajGroup.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryService {
    @Autowired //dipendency injection ho rha hai
    private JournalEntryRepository jopurnalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        jopurnalEntryRepository.save(journalEntry);
    }
}
