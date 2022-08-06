package com.andreidodu.qm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreidodu.qm.db.TranslationDB;

@Repository
public interface TranslationDao extends CrudRepository<TranslationDB, Long> {

}