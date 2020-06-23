package demo.MeetingOrganizer.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue
    private Long id;

    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime eventStartTime;

    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime eventEndTime;

    @OneToMany
    private List<User> eventsUsers;

    public LocalDateTime getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(LocalDateTime eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public LocalDateTime getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(LocalDateTime eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public List<User> getEventsUsers() {
        return eventsUsers;
    }

    public void setEventsUsers(List<User> eventsUsers) {
        this.eventsUsers = eventsUsers;
    }
}
