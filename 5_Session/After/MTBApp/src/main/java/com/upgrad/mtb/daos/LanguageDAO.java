package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.Language;
import com.upgrad.mtb.beans.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository("languageDAO")
public interface LanguageDAO extends JpaRepository<Language, Integer> {

}
