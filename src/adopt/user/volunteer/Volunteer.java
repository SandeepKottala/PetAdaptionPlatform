package adopt.user.volunteer;

import java.util.List;

//Volunteer Class
public class Volunteer {
 private String volunteerID;
 private String name;
 private String availability; // Could be in format like "Monday to Friday: 9AM - 5PM"
 private int totalHoursWorked;

 // Default Constructor
 public Volunteer() {
     this.volunteerID = "";
     this.name = "";
     this.availability = "";
     this.totalHoursWorked = 0;
 }

 // Parameterized Constructor
 public Volunteer(String volunteerID, String name, String availability, int totalHoursWorked) {
     this.volunteerID = volunteerID;
     this.name = name;
     this.availability = availability;
     this.totalHoursWorked = totalHoursWorked;
 }

 // Getters and Setters
 public String getVolunteerID() {
     return volunteerID;
 }

 public void setVolunteerID(String volunteerID) {
     this.volunteerID = volunteerID;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getAvailability() {
     return availability;
 }

 public void setAvailability(String availability) throws InvalidVolunteerAvailabilityException {
     if (availability == null || availability.isEmpty()) {
         throw new InvalidVolunteerAvailabilityException("Invalid availability provided.");
     }
     this.availability = availability;
 }

 public int getTotalHoursWorked() {
     return totalHoursWorked;
 }

 public void setTotalHoursWorked(int totalHoursWorked) {
     this.totalHoursWorked = totalHoursWorked;
 }
}
