package com.vutbr.feec.cviceni8;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
		public Manager(String nickname, String email, char[] password) {
		super(nickname, email, password);
	}
		
		private List<Employee> listOfEmployees = new ArrayList<Employee>();
		private List<Employee> listOfRelationships = new ArrayList<Employee>();
		
		public List<Employee> getListOfEmployees() {
			return listOfEmployees;
		}
		public void setListOfEmployees(List<Employee> listOfEmployees) {
			this.listOfEmployees = listOfEmployees;
		}
		public List<Employee> getListOfRelationships() {
			return listOfRelationships;
		}
		public void setListOfRelationships(List<Employee> listOfRelationships) {
			this.listOfRelationships = listOfRelationships;
		}
		public void addEmploye(Employee em) {
			listOfEmployees.add(em);
			
		}
		public void addRelation(Employee sec) {
			listOfRelationships.add(sec);
			
		}
		
		public void vypis1() {
			for (int i = 0; i < listOfEmployees.size(); i++) {
				System.out.println(listOfEmployees.get(i));
			}
		}
		public void vypis2() {
			for (int i = 0; i < listOfRelationships.size(); i++) {
				System.out.println(listOfRelationships.get(i));
			}
		}
		

		
}
