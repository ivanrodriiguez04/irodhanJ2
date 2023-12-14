package Modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "prestamos", schema="esqExaDos")
public class Prestamos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Prestamo", nullable = false)
	private long id_Prestamo;
	
	@ManyToMany
	@JoinColumn(name = "id_Vajilla")
	Vajillas vajilla;
	
	@ManyToOne
	@JoinColumn(name = "id_Reserva")
	Reservas reserva;
	
	//Getters & Setters
	public long getId_Prestamo() {
		return id_Prestamo;
	}

	public void setId_Prestamo(long id_Prestamo) {
		this.id_Prestamo = id_Prestamo;
	}

	public Vajillas getVajilla() {
		return vajilla;
	}

	public void setVajilla(Vajillas vajilla) {
		this.vajilla = vajilla;
	}

	public Reservas getReserva() {
		return reserva;
	}

	public void setReserva(Reservas reserva) {
		this.reserva = reserva;
	}

	//Constructores
	public Prestamos(long id_Prestamo, Vajillas vajilla, Reservas reserva) {
		super();
		this.id_Prestamo = id_Prestamo;
		this.vajilla = vajilla;
		this.reserva = reserva;
	}

	public Prestamos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
