package com.rajGroup.journalApp.repository;

import com.rajGroup.journalApp.JournalEntry.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}




//controller --->service -->repository -->