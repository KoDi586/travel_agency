package com.kodi.travel_agency.repositories;

import com.kodi.travel_agency.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
