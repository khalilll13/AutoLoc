package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation AddReservation(Reservation reservation);

    Reservation UpdateReservation(Reservation reservation);

    void DeleteReservation(Long id);

    List<Reservation> GetAllReservations();

    Reservation GetReservationById(Long id);

    Reservation affecterContratAReservation(Long idContrat, Long idReservation);

    void desaffecterContratDeReservation(Long idReservation);
}
