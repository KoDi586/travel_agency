package com.kodi.travel_agency.repositories;

import com.kodi.travel_agency.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query(value = "select c.id, c.full_name, c.contact_info" +
            "from clients as c", nativeQuery = true)
    List<Client> findAllWithNameAndInfo();
}
