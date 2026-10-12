package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    ReservationRepository reservationRepository;

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
}
