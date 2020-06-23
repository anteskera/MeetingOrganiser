package demo.MeetingOrganizer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Invitation {
    @Id
    @GeneratedValue
    private Long id;

    boolean isAccepted;

    @OneToOne
    private User user;
}
