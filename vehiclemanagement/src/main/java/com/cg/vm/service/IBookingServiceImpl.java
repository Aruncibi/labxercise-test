package com.cg.vm.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.vm.bean.Booking;
import com.cg.vm.bean.Customer;
import com.cg.vm.bean.Vehicle;
import com.cg.vm.util.DBUtil;

public class IBookingServiceImpl extends DBUtil implements IBookingService{
	

	
	

	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking cancelBooking(Booking b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking updateBooking(Booking b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking viewBooking(Booking b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllBooking(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllBookingByDate(LocalDate bookingDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> viewAllBookingByVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

}
