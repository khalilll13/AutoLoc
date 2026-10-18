package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    IReservationService reservationService;

    @PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation r) {
        return reservationService.AddReservation(r);
    }

    @PostMapping("/update/{idReservation}")
    public Reservation updateReservation(@PathVariable Long idReservation, @RequestBody Reservation r) {
        r.setIdReservation(idReservation);
        return reservationService.UpdateReservation(r);
    }

    @DeleteMapping("/delete/{idReservation}")
    public void deleteReservation(@PathVariable Long idReservation) {
        reservationService.DeleteReservation(idReservation);
    }

    @GetMapping("/getAll")
    public List<Reservation> getAllReservations() {
        return reservationService.GetAllReservations();
    }

    @GetMapping("/get/{idReservation}")
    public Reservation getReservationById(@PathVariable Long idReservation) {
        return reservationService.GetReservationById(idReservation);
    }
}
