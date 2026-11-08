package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.repositories.ClientRepository;
import tn.esprit.autoloc.repositories.ContratRepository;
import tn.esprit.autoloc.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    ReservationRepository reservationRepository;
    ContratRepository contratRepository;
    ClientRepository clientRepository;

    @Override
    public Reservation AddReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation UpdateReservation(Reservation reservation) {
            return reservationRepository.save(reservation);
    }

    @Override
    public void DeleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> GetAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation GetReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation affecterContratAReservation(Long idContrat, Long idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation).get();
        Contrat contrat = contratRepository.findById(idContrat).get();
        reservation.setContrat(contrat);
        return reservationRepository.save(reservation);
    }

    @Override
    public void desaffecterContratDeReservation(Long idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation).get();
        reservation.setContrat(null);
        reservationRepository.save(reservation);
    }

    @Override
    public Reservation affecterClientAReservation(Long idClient, Long idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation).get();
        Client client = clientRepository.findById(idClient).get();
        reservation.setClient(client);
        return reservationRepository.save(reservation);
    }

    @Override
    public Void desaffecterClientDeReservation(Long idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation).get();
        reservation.setClient(null);
        reservationRepository.save(reservation);
        return null;
    }
}
