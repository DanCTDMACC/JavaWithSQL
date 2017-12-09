package controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Car;

public class CarDao {
	EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("CarDealerJPAProject");
	
	public void showAllCar() {
		List<Car> found = new ArrayList<Car>();
		EntityManager eManager = emFactory.createEntityManager();
		
		eManager.getTransaction().begin();
		
		TypedQuery<Car> typedQuery = eManager.createQuery("SELECT c FROM Car c", Car.class);
		try {
			found = typedQuery.getResultList();
			System.out.println("Make\t\tModel\t\tYear");
			System.out.println("----------------------------------------");
			for (Car c : found) {
				System.out.println(c.getMake() + "\t\t" + c.getModel() + "\t\t" + c.getYear());
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			eManager.close();
		}
	}
	
	public void showAllCarByManufacturer() {
		List<Car> found = new ArrayList<Car>();
		EntityManager eManager = emFactory.createEntityManager();
		
		eManager.getTransaction().begin();
		
		TypedQuery<Car> typedQuery = eManager.createQuery("SELECT c FROM Car c ORDER BY c.make", Car.class);
		try {
			found = typedQuery.getResultList();
			System.out.println("Make\t\tModel\t\tYear");
			System.out.println("----------------------------------------");
			for (Car c : found) {
				System.out.println(c.getMake() + "\t\t" + c.getModel() + "\t\t" + c.getYear());
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			eManager.close();
		}
	}
	
	public void showAllCarByYear() {
		List<Car> found = new ArrayList<Car>();
		EntityManager eManager = emFactory.createEntityManager();
		
		eManager.getTransaction().begin();
		
		TypedQuery<Car> typedQuery = eManager.createQuery("SELECT c FROM Car c ORDER BY c.year", Car.class);
		try {
			found = typedQuery.getResultList();
			System.out.println("Make\t\tModel\t\tYear");
			System.out.println("----------------------------------------");
			for (Car c : found) {
				System.out.println(c.getMake() + "\t\t" + c.getModel() + "\t\t" + c.getYear());
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			eManager.close();
		}
	}
	
	public void findCarByManufacturer(String make) {
		List<Car> found = new ArrayList<Car>();
		EntityManager eManager = emFactory.createEntityManager();
		
		eManager.getTransaction().begin();
		
		TypedQuery<Car> typedQuery = eManager.createQuery(
				"SELECT c FROM Car c WHERE c.make = :make", Car.class);
		typedQuery.setParameter("make", make);
		try {
			found = typedQuery.getResultList();
			System.out.println("Make\t\tModel\t\tYear");
			System.out.println("----------------------------------------");
			for (Car c : found) {
				System.out.println(c.getMake() + "\t\t" + c.getModel() + "\t\t" + c.getYear());
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			eManager.close();
		}
	}
	
	public void findCarByYear(int year) {
		List<Car> found = new ArrayList<Car>();
		EntityManager eManager = emFactory.createEntityManager();
		
		eManager.getTransaction().begin();
		
		TypedQuery<Car> typedQuery = eManager.createQuery(
				"SELECT c FROM Car c WHERE c.year = :year", Car.class);
		typedQuery.setParameter("year", year);
		try {
			found = typedQuery.getResultList();
			System.out.println("Make\t\tModel\t\tYear");
			System.out.println("----------------------------------------");
			for (Car c : found) {
				System.out.println(c.getMake() + "\t\t" + c.getModel() + "\t\t" + c.getYear());
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			eManager.close();
		}
	}
}
