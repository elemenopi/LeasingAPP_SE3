package packLeasing;

import java.time.LocalDate;

public class Contract {
	LocalDate _start;
	LocalDate _finish;
	Vehicles _vehicle;
	
	
	public Contract(LocalDate _start, LocalDate _finish, Vehicles _vehicle) {
		//this section initiates Contract object
		super();
		this._start = _start;
		this._finish = _finish;
		this._vehicle = _vehicle;
	}
}
