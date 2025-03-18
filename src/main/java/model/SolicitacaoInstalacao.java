package model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "solicitacoes_instalacao")
public class SolicitacaoInstalacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private professor professor;

    @ManyToOne
    @JoinColumn(nullable = false)
    private software software;

    @ManyToOne
    @JoinColumn(nullable = false)
    private laboratorio laboratorio;

    @Column(nullable = false)
    private LocalDate dataUso;

    @Column(nullable = false)
    private boolean instalado = false;
}