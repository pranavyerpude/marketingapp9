package com.marketingapp9.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapp9.Entities.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Long> {

}
