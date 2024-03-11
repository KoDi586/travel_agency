package com.kodi.travel_agency.services;

import com.kodi.travel_agency.models.Reservation;
import com.kodi.travel_agency.repositories.ClientRepository;
import com.kodi.travel_agency.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository,
                              ClientRepository clientRepository) {
        this.reservationRepository = reservationRepository;
        this.clientRepository = clientRepository;
    }

    public Reservation createReservation(Long tourCode, Long clientId) {
        Reservation reservation = new Reservation();
        reservation.setId(0L);
        reservation.setClient(clientRepository.findFirstById(clientId));
        reservation.setStatus(false);
        reservation.setTourId(tourCode);
        return reservationRepository.save(reservation);
    }
}
