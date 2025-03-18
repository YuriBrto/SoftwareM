package model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "softwares")
public class software {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String link;

    private String versao;

    @Column(nullable = false)
    private boolean livre;

    @Column(nullable = false)
    private LocalDate dataSolicitacao;

    @Column(nullable = false)
    private boolean disponivel = true;
}