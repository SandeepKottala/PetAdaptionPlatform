package adopt.user.volunteer;

import java.util.List;

public class VolunteerUtils {

    // Checks if a volunteer is available on a given date
    public static boolean isVolunteerAvailable(Volunteer volunteer, String date) throws InvalidVolunteerAvailabilityException {
        if (date == null || date.isEmpty()) {
            throw new InvalidVolunteerAvailabilityException("Invalid date provided.");
        }
        
        // Simple check to see if the date matches any part of the volunteer's availability
        return volunteer.getAvailability().contains(date);
    }

    // Calculates total hours worked by a volunteer or a list of volunteers
    public static int calculateVolunteerHours(List<Volunteer> volunteers) {
        int totalHours = 0;
        for (Volunteer volunteer : volunteers) {
            totalHours += volunteer.getTotalHoursWorked();
        }
        return totalHours;
    }

    // Generates a volunteer profile summary
    public static String generateVolunteerProfile(Volunteer volunteer) {
        StringBuilder profile = new StringBuilder();
        profile.append("Volunteer Profile\n");
        profile.append("Volunteer ID: ").append(volunteer.getVolunteerID()).append("\n");
        profile.append("Name: ").append(volunteer.getName()).append("\n");
        profile.append("Availability: ").append(volunteer.getAvailability()).append("\n");
        profile.append("Total Hours Worked: ").append(volunteer.getTotalHoursWorked()).append(" hours\n");

        return profile.toString();
    }
}
