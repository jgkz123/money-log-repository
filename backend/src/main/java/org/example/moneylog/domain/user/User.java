package org.example.moneylog.domain.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false, length = 255)
    private String email;
    @Column(nullable = false, length = 255)
    private String password;
    @Column(nullable = false, length = 50)
    private String nickname;
    private LocalDateTime createdAt;
}
